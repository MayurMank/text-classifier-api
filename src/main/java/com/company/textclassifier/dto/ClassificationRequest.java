package com.company.textclassifier.dto;


import jakarta.validation.constraints.NotBlank;



public class ClassificationRequest {



    @NotBlank
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
