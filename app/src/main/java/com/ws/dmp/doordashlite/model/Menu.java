package com.ws.dmp.doordashlite.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "menu_version",
        "subtitle",
        "name",
        "open_hours",
        "is_business_enabled",
        "is_catering",
        "id",
        "status_type"
})
public class Menu {

    @JsonProperty("status")
    private String status;
    @JsonProperty("menu_version")
    private Integer menuVersion;
    @JsonProperty("subtitle")
    private String subtitle;
    @JsonProperty("name")
    private String name;
    @JsonProperty("open_hours")
    private List<List<OpenHour>> openHours = null;
    @JsonProperty("is_business_enabled")
    private Object isBusinessEnabled;
    @JsonProperty("is_catering")
    private Boolean isCatering;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("status_type")
    private String statusType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("menu_version")
    public Integer getMenuVersion() {
        return menuVersion;
    }

    @JsonProperty("menu_version")
    public void setMenuVersion(Integer menuVersion) {
        this.menuVersion = menuVersion;
    }

    @JsonProperty("subtitle")
    public String getSubtitle() {
        return subtitle;
    }

    @JsonProperty("subtitle")
    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("open_hours")
    public List<List<OpenHour>> getOpenHours() {
        return openHours;
    }

    @JsonProperty("open_hours")
    public void setOpenHours(List<List<OpenHour>> openHours) {
        this.openHours = openHours;
    }

    @JsonProperty("is_business_enabled")
    public Object getIsBusinessEnabled() {
        return isBusinessEnabled;
    }

    @JsonProperty("is_business_enabled")
    public void setIsBusinessEnabled(Object isBusinessEnabled) {
        this.isBusinessEnabled = isBusinessEnabled;
    }

    @JsonProperty("is_catering")
    public Boolean getIsCatering() {
        return isCatering;
    }

    @JsonProperty("is_catering")
    public void setIsCatering(Boolean isCatering) {
        this.isCatering = isCatering;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("status_type")
    public String getStatusType() {
        return statusType;
    }

    @JsonProperty("status_type")
    public void setStatusType(String statusType) {
        this.statusType = statusType;
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