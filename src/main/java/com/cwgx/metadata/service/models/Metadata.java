package com.cwgx.metadata.service.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Metadata {

    //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Id
    public ObjectId id;

    private String name;
    private String owner_id;
    private Date creationDate = new Date();
    private ArrayList<Attribute> attributes;

    public Metadata() {
    }

    public Metadata(String name, String owner_id, ArrayList<Attribute> attributes, Date creationDate) {
        this.name = name;
        this.owner_id = owner_id;
        this.attributes = attributes;
        this.creationDate = creationDate;
    }

    public String getId() {
        return id.toHexString();
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(String owner_id) {
        this.owner_id = owner_id;
    }

    public ArrayList<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<Attribute> attributes) {
        this.attributes = attributes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }
}
