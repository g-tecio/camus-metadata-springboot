package com.cwgx.metadata.service.controllers;


import com.cwgx.metadata.service.models.Metadata;
import com.cwgx.metadata.service.repositories.MetadataRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/metadata")
public class MetadataController {


    @Autowired
    private MetadataRepository repository;

    @RequestMapping(value = "/getMetadata", method = RequestMethod.GET)
    @ResponseBody
    public List<Metadata> getMetadataByParams(@RequestParam(required=false) String name, @RequestParam(required=false) ObjectId id) {
        if(name != null) {
            return repository.findByName(name);
        } else if (id != null) {
            return repository.findById(id);
        } else {
            return repository.findAll();
        }
    }

    @CrossOrigin
    @RequestMapping(value = "/getAllMetadata", method = RequestMethod.GET)
    public List<Metadata> getAllMetadatas() {
        return repository.findAll();
    }

    @RequestMapping(value = "/addMetadata/", method = RequestMethod.POST)
    public Metadata createMetadata(@Valid @RequestBody Metadata metadata) {
        repository.save(metadata);
        return metadata;
    }


    @RequestMapping(value = "/updateMetadata", method = RequestMethod.PUT)
    public Metadata modifyMetadata(@RequestParam(name = "id") ObjectId id, @Valid @RequestBody Metadata metadata) {
        metadata.setId(id);
        repository.save(metadata);
        return metadata;
    }
}
