
package com.example.inndata;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.inndata.openfineclint.Fineclint;

@RestController
public class inndatacontoller {
	@Autowired
	inndataservice inndataservice;
	@Autowired
	Fineclint employeeFeignClient;
	
	KafkaProducerService kafkaProducerService;
	@Autowired
	inndatajaprepistory inndatajaprepistory;
	
//	 @Autowired
//	    private KafkaProducerService kafkaProducerService;
//	 

	@Autowired	  
	public inndatacontoller(KafkaProducerService kafkaConsumerService) {
		super();
		this.kafkaProducerService = kafkaConsumerService;
	}
//	   @GetMapping("/send")
//	    public ResponseEntity<String> sendMessage(@RequestParam String message) {
//	        kafkaProducerService.sendMessage(message);
//	        return ResponseEntity.ok("Message sent successfully: " + message);
//	    }
	   
	   @GetMapping("/find")
		public List<CompanyEntity> all(){
		   System.out.println("hello");
		   kafkaProducerService.sendMessage(inndatajaprepistory.findAll());
			return 	inndatajaprepistory.findAll();
		}
	@GetMapping("/findall")
	public List<companydetails> findall(){
		return 	inndataservice.getAll();
	}
}
