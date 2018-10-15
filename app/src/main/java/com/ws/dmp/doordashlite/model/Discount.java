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
        "description",
        "source_type",
        "text",
        "discount_type",
        "amount",
        "min_subtotal"
})
public class Discount {

    @JsonProperty("description")
    private String description;
    @JsonProperty("source_type")
    private String sourceType;
    @JsonProperty("text")
    private String text;
    @JsonProperty("discount_type")
    private String discountType;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("min_subtotal")
    private MinSubtotal minSubtotal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("source_type")
    public String getSourceType() {
        return sourceType;
    }

    @JsonProperty("source_type")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("discount_type")
    public String getDiscountType() {
        return discountType;
    }

    @JsonProperty("discount_type")
    public void setDiscountType(String discountType) {
        this.discountType = discountType;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("min_subtotal")
    public MinSubtotal getMinSubtotal() {
        return minSubtotal;
    }

    @JsonProperty("min_subtotal")
    public void setMinSubtotal(MinSubtotal minSubtotal) {
        this.minSubtotal = minSubtotal;
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