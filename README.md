# Thymeleaf POC

This project demonstrates a simple Spring Boot application using Thymeleaf.

## Building

Use Maven to package the application:

```bash
./mvnw package
```

## Containerization

A `Dockerfile` is provided to build the container image:

```bash
docker build -t rsiv5588/thymeleafpoc:latest .
```

The image exposes port `8087`, which is configured in `application.properties`.

## Kubernetes

`deployment.yaml` and `service.yaml` contain manifests for Kubernetes deployment. `skaffold.yaml` is configured to build the image using the Dockerfile and deploy the manifests.
