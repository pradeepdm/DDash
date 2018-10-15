package com.ws.dmp.doordashlite.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "display_string",
        "unit_amount"
})
public class SurgeFee {

    @JsonProperty("display_string")
    private String displayString;
    @JsonProperty("unit_amount")
    private Integer unitAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("display_string")
    public String getDisplayString() {
        return displayString;
    }

    @JsonProperty("display_string")
    public void setDisplayString(String displayString) {
        this.displayString = displayString;
    }

    @JsonProperty("unit_amount")
    public Integer getUnitAmount() {
        return unitAmount;
    }

    @JsonProperty("unit_amount")
    public void setUnitAmount(Integer unitAmount) {
        this.unitAmount = unitAmount;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}