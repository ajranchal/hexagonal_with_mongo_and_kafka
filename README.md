This repository is created to assemble a Hexagonal Architecture archetype.

# Intro:
The functionality it offers:
Launch a call to Producer to generate an event in a Kafka topic and have the Consumer save it in MongoDB.

We need to:
    Install Kafka locally.
    Create Account in MongoDB

# Run in Intellij:

spring-boot:run -Dspring-boot.run.fork=false

profile: local

# Run Kafka:

$ bin/zookeeper-server-start.sh config/zookeeper.properties

$ bin/kafka-server-start.sh config/server.properties


# Endpoint:

Test Kafka
POST - http://localhost:9000/kafka/publish
    {
      "topic": "example",
      "message": "Test Kafka"
    }


# Resources:

## MongoDB:
    Tutorial:
    https://www.baeldung.com/spring-data-mongodb-tutorial

## Kafka
    
    Download and start kafka in local:
    
    https://www.confluent.io/blog/set-up-and-run-kafka-on-windows-linux-wsl-2/#download-kafka
    
    https://kafka.apache.org/quickstart
    
    Create a Consumer & Producer in Spring boot:
    
    https://www.confluent.io/blog/apache-kafka-spring-boot-application/?utm_medium=sem&utm_source=google&utm_campaign=ch.sem_br.nonbrand_tp.prs_tgt.kafka_mt.mbm_rgn.emea_lng.eng_dv.all_con.kafka-spring&utm_term=%2Bkafka%20%2Bspring&creative=&device=c&placement=&gclid=Cj0KCQjw5auGBhDEARIsAFyNm9ERv1MV5Bv-0pQpWhct1LbUmlUMO68eZGv40WcYj8um-N0xhPpqz2saAnVYEALw_wcB
    
    https://www.baeldung.com/spring-kafka
    
    https://github.com/eugenp/tutorials/tree/45e1bb2b1d494a5babc3647d8c1828acdcbbe1ad/spring-kafka
