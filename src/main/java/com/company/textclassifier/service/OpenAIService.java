package com.company.textclassifier.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.company.textclassifier.dto.ClassificationResponse;


@Service
public class OpenAIService {
	
	 private final WebClient webClient;

	    @Value("${openai.api.key}")
	    private String apiKey;

	    public OpenAIService(WebClient.Builder builder) {
	        this.webClient = builder
	                .baseUrl("https://api.openai.com/v1")
	                .build();
	    }

	    public ClassificationResponse classifyWithAI(String text) {

	     

	        if (text.length() < 5) {
	            return new ClassificationResponse("Other", 0.55);
	        }

	        return new ClassificationResponse("Query", 0.85);
	    }

}
