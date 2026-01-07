package com.company.textclassifier.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.textclassifier.dto.ClassificationRequest;
import com.company.textclassifier.dto.ClassificationResponse;
import com.company.textclassifier.service.ClassificationService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api")
public class ClassificationController {
	
	 
	
	  
	   private final ClassificationService service;
 
	    public ClassificationController(ClassificationService service) {
	        this.service = service;
	    }

	    @PostMapping("/classify")
	    public ClassificationResponse classifyText(
	            @Valid @RequestBody ClassificationRequest request) {

	        return service.classify(request.getText());
	    }
	

}
