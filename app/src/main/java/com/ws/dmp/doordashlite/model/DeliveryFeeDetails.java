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
        "final_fee",
        "discount",
        "surge_fee",
        "original_fee"
})
public class DeliveryFeeDetails {

    @JsonProperty("final_fee")
    private FinalFee finalFee;
    @JsonProperty("discount")
    private Discount discount;
    @JsonProperty("surge_fee")
    private SurgeFee surgeFee;
    @JsonProperty("original_fee")
    private OriginalFee originalFee;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("final_fee")
    public FinalFee getFinalFee() {
        return finalFee;
    }

    @JsonProperty("final_fee")
    public void setFinalFee(FinalFee finalFee) {
        this.finalFee = finalFee;
    }

    @JsonProperty("discount")
    public Discount getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    @JsonProperty("surge_fee")
    public SurgeFee getSurgeFee() {
        return surgeFee;
    }

    @JsonProperty("surge_fee")
    public void setSurgeFee(SurgeFee surgeFee) {
        this.surgeFee = surgeFee;
    }

    @JsonProperty("original_fee")
    public OriginalFee getOriginalFee() {
        return originalFee;
    }

    @JsonProperty("original_fee")
    public void setOriginalFee(OriginalFee originalFee) {
        this.originalFee = originalFee;
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
