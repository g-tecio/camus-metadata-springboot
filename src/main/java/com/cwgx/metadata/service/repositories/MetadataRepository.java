package com.cwgx.metadata.service.repositories;

import com.cwgx.metadata.service.models.Metadata;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface MetadataRepository extends MongoRepository<Metadata, String> {

    List<Metadata> findById(ObjectId id);

    List<Metadata> findByName(String name);


}
