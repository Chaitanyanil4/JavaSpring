package com.Assessment;


import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class FileUploadController {

    @GetMapping("/")
    public ModelAndView index() {
        return new ModelAndView("upload");
    }
    @PostMapping("/upload")
    public ModelAndView uploadFile(@RequestParam("file") MultipartFile file, Model model) throws Exception {
    	String type = getFileType(file.getOriginalFilename());
    	if(type.equalsIgnoreCase("txt")||type.equalsIgnoreCase("xml")) {
    		String fileContent=new String(file.getBytes(),StandardCharsets.UTF_8);
    		model.addAttribute("fileContent",fileContent);
            return new ModelAndView("upload");
    	}else {
    	
        try (InputStream inputStream = file.getInputStream()) {
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet sheet = workbook.getSheetAt(0); // Assuming you want to read the first sheet

            StringBuilder contentBuilder = new StringBuilder();

            for (Row row : sheet) {
                for (Cell cell : row) {
                    switch (cell.getCellType()) {
                        case STRING:
                            contentBuilder.append(cell.getStringCellValue()).append("\t");
                            break;
                        case NUMERIC:
                            contentBuilder.append(cell.getNumericCellValue()).append("\t");
                            break;
                      
                        default:
                            contentBuilder.append("\t");
                    }
                }
                contentBuilder.append("\n");
            }

            workbook.close();

            model.addAttribute("fileContent", contentBuilder.toString());
            return new ModelAndView("upload");
        }
        }
    }
    private String getFileType(String filename) {
        if (filename == null || !filename.contains(".")) {
            return null; 
        }

        String extension = filename.substring(filename.lastIndexOf(".") + 1).toLowerCase();

        switch (extension) {
        case "txt":
        	return "txt";
            case "xml":
                return "xml";
            case "xls":
                return "xls";
            case "xlsx":
                return "xlsx";
            default:
                return null;
        }
    }

}