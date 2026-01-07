package com.company.textclassifier.service;

import org.springframework.stereotype.Service;

import com.company.textclassifier.dto.ClassificationResponse;



@Service 
public class ClassificationService {
	   private final OpenAIService openAIService;

	    public ClassificationService(OpenAIService openAIService) {
	        this.openAIService = openAIService;
	    }

	    public ClassificationResponse classify(String text) {

	        try {
	            return openAIService.classifyWithAI(text);
	        } catch (Exception e) {
	           
	            return ruleBasedClassification(text);
	        }
	    }

	    private ClassificationResponse ruleBasedClassification(String text) {
	        text = text.toLowerCase();

	        if (text.contains("not working") || text.contains("bad") || text.contains("issue")) {
	            return new ClassificationResponse("Complaint", 0.70);
	        }
	        if (text.contains("how") || text.contains("what") || text.contains("?")) {
	            return new ClassificationResponse("Query", 0.75);
	        }
	        if (text.contains("good") || text.contains("love") || text.contains("great")) {
	            return new ClassificationResponse("Feedback", 0.80);
	        }
	        return new ClassificationResponse("Other", 0.60);
	    }
}
