# AI Text Classification API

AI-assisted backend service to classify input text into categories like Complaint, Query, Feedback, or Other using a REST API.

---

## Overview
This project is a backend REST API that classifies input text into predefined categories such as:
- Complaint
- Query
- Feedback
- Other

The goal is to demonstrate problem-solving ability, clean API design, and readiness for backend development using Java and Spring Boot.

---

## Tech Stack
- Java 17
- Spring Boot
- REST API
- Maven
- (Optional) OpenAI API / Rule-based classification

---

## Features
- Accepts raw text as input
- Classifies text into meaningful categories
- Clean and simple REST endpoints
- Easily extensible for AI or ML models

---

## API Endpoint

### Classify Text
**POST** `/api/classify`

#### Request Body (JSON)
```json
{
  "text": "The product I received is damaged"
}
