package com.cwgx.metadata.service.repositories;

import com.cwgx.metadata.service.models.Metadata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MetadataRepository extends MongoRepository<Metadata, String> {

    Metadata findById(ObjectId id);
}
