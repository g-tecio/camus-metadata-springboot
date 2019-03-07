package com.cwgx.metadata.service.controllers;


import com.cwgx.metadata.service.models.Metadata;
import com.cwgx.metadata.service.repositories.MetadataRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/metadata")
public class MetadataController {

    @Autowired
    private MetadataRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET, params = { "id", "name" })
    @ResponseBody
    public String getMetadataByParams(@RequestParam("name") String name) {
        return "asd";
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Metadata> getAllMetadatas() {
        return repository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Metadata createMetadatas(@Valid @RequestBody Metadata metadata) {
        repository.save(metadata);
        return metadata;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Metadata getMetadatasById(@PathVariable("id") ObjectId id) {
        return repository.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Metadata modifyMetadata(@PathVariable("id") ObjectId id, @Valid @RequestBody Metadata metadata) {
        metadata.setId(id);
        repository.save(metadata);
        return metadata;
    }
}
