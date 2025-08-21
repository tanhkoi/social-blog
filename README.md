# Social Blog

A multi-service social networking platform with a Java Spring Boot backend, a React + Vite frontend, and auxiliary Flask microservices.

## Project Structure
- **backend/** – Spring Boot REST API for core social features.
- **frontend/react-tailwind-strapi-blog/** – React frontend powered by Vite and Tailwind CSS.
- **perspective/** – Flask service that uses the Google Perspective API for toxicity analysis.
- **tts-v2/** – Flask service providing text-to-speech generation.

## Backend
The backend is implemented with Spring Boot and uses MongoDB along with JWT-based security and OpenAPI documentation settings.

```bash
cd backend
mvn spring-boot:run
```

Run backend tests:
```bash
mvn test
```

## Frontend
The frontend is a React application scaffolded with Vite and styled using Tailwind CSS.

```bash
cd frontend/react-tailwind-strapi-blog
npm install
npm run dev
```

## Perspective Service
This Flask service exposes an endpoint for analyzing comment toxicity using the Perspective API.

```bash
cd perspective
pip install flask google-api-python-client
python app.py
```

## Text-to-Speech Service
Provides an API to generate speech audio from text using the Coqui TTS library.

```bash
cd tts-v2
pip install -r requirements.txt
python main.py
```

