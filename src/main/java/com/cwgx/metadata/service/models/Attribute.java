package com.cwgx.metadata.service.models;

import java.util.ArrayList;

public class Attribute {

    private String label;
    private String machine_name;
    private String type;
    private Integer max_length = null;
    private Integer min_length = null;
    private Boolean required = null;
    private ArrayList<Attribute> items = null;

    public Attribute() {
    }

    public Attribute(String label, String machine_name, String type, Integer max_length, Integer min_length, Boolean required, ArrayList<Attribute> items) {
        this.label = label;
        this.machine_name = machine_name;
        this.type = type;
        this.max_length = max_length;
        this.min_length = min_length;
        this.required = required;
        this.items = items;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getMachine_name() {
        return machine_name;
    }

    public void setMachine_name(String machine_name) {
        this.machine_name = machine_name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getMax_length() {
        return max_length;
    }

    public void setMax_length(Integer max_length) {
        this.max_length = max_length;
    }

    public Integer getMin_length() {
        return min_length;
    }

    public void setMin_length(Integer min_length) {
        this.min_length = min_length;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public ArrayList<Attribute> getItems() {
        return items;
    }

    public void setItems(ArrayList<Attribute> items) {
        this.items = items;
    }
}
