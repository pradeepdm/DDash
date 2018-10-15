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
        "minimum_subtotal_monetary_fields",
        "delivery_fee",
        "delivery_fee_monetary_fields",
        "minimum_subtotal",
        "new_store_customers_only",
        "id"
})
public class MerchantPromotion {

    @JsonProperty("minimum_subtotal_monetary_fields")
    private MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields;
    @JsonProperty("delivery_fee")
    private Integer deliveryFee;
    @JsonProperty("delivery_fee_monetary_fields")
    private DeliveryFeeMonetaryFields deliveryFeeMonetaryFields;
    @JsonProperty("minimum_subtotal")
    private Object minimumSubtotal;
    @JsonProperty("new_store_customers_only")
    private Boolean newStoreCustomersOnly;
    @JsonProperty("id")
    private Integer id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("minimum_subtotal_monetary_fields")
    public MinimumSubtotalMonetaryFields getMinimumSubtotalMonetaryFields() {
        return minimumSubtotalMonetaryFields;
    }

    @JsonProperty("minimum_subtotal_monetary_fields")
    public void setMinimumSubtotalMonetaryFields(MinimumSubtotalMonetaryFields minimumSubtotalMonetaryFields) {
        this.minimumSubtotalMonetaryFields = minimumSubtotalMonetaryFields;
    }

    @JsonProperty("delivery_fee")
    public Integer getDeliveryFee() {
        return deliveryFee;
    }

    @JsonProperty("delivery_fee")
    public void setDeliveryFee(Integer deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    @JsonProperty("delivery_fee_monetary_fields")
    public DeliveryFeeMonetaryFields getDeliveryFeeMonetaryFields() {
        return deliveryFeeMonetaryFields;
    }

    @JsonProperty("delivery_fee_monetary_fields")
    public void setDeliveryFeeMonetaryFields(DeliveryFeeMonetaryFields deliveryFeeMonetaryFields) {
        this.deliveryFeeMonetaryFields = deliveryFeeMonetaryFields;
    }

    @JsonProperty("minimum_subtotal")
    public Object getMinimumSubtotal() {
        return minimumSubtotal;
    }

    @JsonProperty("minimum_subtotal")
    public void setMinimumSubtotal(Object minimumSubtotal) {
        this.minimumSubtotal = minimumSubtotal;
    }

    @JsonProperty("new_store_customers_only")
    public Boolean getNewStoreCustomersOnly() {
        return newStoreCustomersOnly;
    }

    @JsonProperty("new_store_customers_only")
    public void setNewStoreCustomersOnly(Boolean newStoreCustomersOnly) {
        this.newStoreCustomersOnly = newStoreCustomersOnly;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
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