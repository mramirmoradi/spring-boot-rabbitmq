# Spring-amqp
Spring boot rabbitmq module implement rabbitmq configuration and publish process as service.

# Spring-rabbitmq-producer
Spring boot producer microservice implemented as sample microservice that produces messages to rabbitmq via three different kind exchanges (Direct, Fanout, Topic).

# Spring-rabbitmq-consumer
Spring boot consumer microservice implemented as sample microservice that consume producer messages from rabbitmq.

## Tech Stack
- **JAVA** = version 17
- **Spring boot framework** = 3.0.6

## Producer APIs
Direct exchange API: http://localhost:8080/exchanges/direct <br>
Fanout exchange API: http://localhost:8080/exchanges/fanout <br>
Topic exchange API: http://localhost:8080/exchanges/topic/{routing-key}

## Queue, Exchanges Binding
Direct Exchange ---> QueueOne via routing-key: route-one <br>
Fanout Exchange ---> QueueTwo, Queue Three <br>
Topic Exchange ---> QueueFour, QueueFive via routing-keys: sport.* | sport.#

## Deployment
By the below command rabbitmq, producer, consumer  will deploy.

```bash
  docker-compose up --build
```

## Run Locally
Go to the project directory and install dependencies.

```bash
  ./mvnw clean pacakge
```

### Environment Variables
To run this project without docker locally, you will need to add your local machine environment variables to application-local.properties file and dont forget to change the profile.

### Postman collection
You can use postman collection that exist on project base dir.