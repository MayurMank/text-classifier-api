package com.company.textclassifier.dto;




public class ClassificationResponse {
	
	   private String category;
	    private double confidence;

	    public ClassificationResponse(String category, double confidence) {
	        this.category = category;
	        this.confidence = confidence;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public double getConfidence() {
	        return confidence;
	    }

}
