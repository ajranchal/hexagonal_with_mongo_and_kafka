package com.hexagonal.infrastructure.db.mongodb.repository;


import com.hexagonal.infrastructure.db.mongodb.model.KafkaExampleEventEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KafkaEventsRepository extends MongoRepository<KafkaExampleEventEntity, String> {



}
