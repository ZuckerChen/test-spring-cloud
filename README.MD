http://cloud.spring.io/spring-cloud-static/Dalston.SR4/single/spring-cloud.html


Config服务:
spring-cloud-config-server


Netflix:
eureka服务 单机：
spring-cloud-eureka

eureka服务 集群：
spring-cloud-eureka-master
spring-cloud-eureka-backup
spring-cloud-eureka-backup1

eureka 客户端 集群绑定:
eureka.client.serviceUrl.defaultZone=http://master:7998/eureka/,http://backup:7999/eureka/,http://backup1:7997/eureka/

Bus:
spring-cloud-bus-amqp
As long as Spring Cloud Bus AMQP and RabbitMQ are on the classpath any Spring Boot application will try to contact a RabbitMQ server on localhost:5672 (the default value of spring.rabbitmq.addresses):

自己开发spring-boot-starter-rocketmq（待研究）

hystrix：
spring-cloud-hystrix-dashboard 聚合监控 http://localhost:8001/hystrix 通过enreka聚合所有客户端的监控信息
spring-cloud-hystrix hystrix客户端


