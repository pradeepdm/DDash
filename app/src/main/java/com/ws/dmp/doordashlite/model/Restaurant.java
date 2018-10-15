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
        "phone_number",
        "yelp_review_count",
        "is_consumer_subscription_eligible",
        "max_order_size",
        "delivery_fee",
        "max_composite_score",
        "id",
        "average_rating",
        "tags",
        "delivery_radius",
        "inflation_rate",
        "menus",
        "show_store_menu_header_photo",
        "composite_score",
        "offers_pickup",
        "number_of_ratings",
        "status_type",
        "is_only_catering",
        "status",
        "delivery_fee_details",
        "object_type",
        "description",
        "business",
        "yelp_biz_id",
        "asap_time",
        "yelp_rating",
        "extra_sos_delivery_fee",
        "business_id",
        "special_instructions_max_length",
        "cover_img_url",
        "address",
        "price_range",
        "slug",
        "show_suggested_items",
        "name",
        "is_newly_added",
        "is_good_for_group_orders",
        "service_rate",
        "merchant_promotions",
        "header_image_url"
})
public class Restaurant {

    private static final String FREE = "Free delivery!";
    private static final double RATING_MAX_VALUE = 5.0;
    @JsonProperty("phone_number")
    private String phoneNumber;
    @JsonProperty("yelp_review_count")
    private Integer yelpReviewCount;
    @JsonProperty("is_consumer_subscription_eligible")
    private Boolean isConsumerSubscriptionEligible;
    @JsonProperty("max_order_size")
    private Object maxOrderSize;
    @JsonProperty("delivery_fee")
    private Integer deliveryFee;
    @JsonProperty("max_composite_score")
    private Integer maxCompositeScore;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("average_rating")
    private Double averageRating;
    @JsonProperty("tags")
    private List<String> tags = null;
    @JsonProperty("delivery_radius")
    private Integer deliveryRadius;
    @JsonProperty("inflation_rate")
    private Double inflationRate;
    @JsonProperty("menus")
    private List<Menu> menus = null;
    @JsonProperty("show_store_menu_header_photo")
    private Boolean showStoreMenuHeaderPhoto;
    @JsonProperty("composite_score")
    private Integer compositeScore;
    @JsonProperty("offers_pickup")
    private Object offersPickup;
    @JsonProperty("number_of_ratings")
    private Integer numberOfRatings;
    @JsonProperty("status_type")
    private String statusType;
    @JsonProperty("is_only_catering")
    private Boolean isOnlyCatering;
    @JsonProperty("status")
    private String status;
    @JsonProperty("delivery_fee_details")
    private DeliveryFeeDetails deliveryFeeDetails;
    @JsonProperty("object_type")
    private String objectType;
    @JsonProperty("description")
    private String description;
    @JsonProperty("business")
    private Business business;
    @JsonProperty("yelp_biz_id")
    private String yelpBizId;
    @JsonProperty("asap_time")
    private Object asapTime;
    @JsonProperty("yelp_rating")
    private Double yelpRating;
    @JsonProperty("extra_sos_delivery_fee")
    private Integer extraSosDeliveryFee;
    @JsonProperty("business_id")
    private Integer businessId;
    @JsonProperty("special_instructions_max_length")
    private Object specialInstructionsMaxLength;
    @JsonProperty("cover_img_url")
    private String coverImgUrl;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("price_range")
    private Integer priceRange;
    @JsonProperty("slug")
    private String slug;
    @JsonProperty("show_suggested_items")
    private Boolean showSuggestedItems;
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_newly_added")
    private Boolean isNewlyAdded;
    @JsonProperty("is_good_for_group_orders")
    private Boolean isGoodForGroupOrders;
    @JsonProperty("service_rate")
    private Double serviceRate;
    @JsonProperty("merchant_promotions")
    private List<MerchantPromotion> merchantPromotions = null;
    @JsonProperty("header_image_url")
    private Object headerImageUrl;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("phone_number")
    public String getPhoneNumber() {
        return phoneNumber;
    }

    @JsonProperty("phone_number")
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @JsonProperty("yelp_review_count")
    public Integer getYelpReviewCount() {
        return yelpReviewCount;
    }

    @JsonProperty("yelp_review_count")
    public void setYelpReviewCount(Integer yelpReviewCount) {
        this.yelpReviewCount = yelpReviewCount;
    }

    @JsonProperty("is_consumer_subscription_eligible")
    public Boolean getIsConsumerSubscriptionEligible() {
        return isConsumerSubscriptionEligible;
    }

    @JsonProperty("is_consumer_subscription_eligible")
    public void setIsConsumerSubscriptionEligible(Boolean isConsumerSubscriptionEligible) {
        this.isConsumerSubscriptionEligible = isConsumerSubscriptionEligible;
    }

    @JsonProperty("max_order_size")
    public Object getMaxOrderSize() {
        return maxOrderSize;
    }

    @JsonProperty("max_order_size")
    public void setMaxOrderSize(Object maxOrderSize) {
        this.maxOrderSize = maxOrderSize;
    }

    @JsonProperty("delivery_fee")
    public Integer getDeliveryFee() {
        return deliveryFee;
    }

    @JsonProperty("delivery_fee")
    public void setDeliveryFee(Integer deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    @JsonProperty("max_composite_score")
    public Integer getMaxCompositeScore() {
        return maxCompositeScore;
    }

    @JsonProperty("max_composite_score")
    public void setMaxCompositeScore(Integer maxCompositeScore) {
        this.maxCompositeScore = maxCompositeScore;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("average_rating")
    public Double getAverageRating() {
        return averageRating;
    }

    @JsonProperty("average_rating")
    public void setAverageRating(Double averageRating) {
        this.averageRating = averageRating;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    @JsonProperty("delivery_radius")
    public Integer getDeliveryRadius() {
        return deliveryRadius;
    }

    @JsonProperty("delivery_radius")
    public void setDeliveryRadius(Integer deliveryRadius) {
        this.deliveryRadius = deliveryRadius;
    }

    @JsonProperty("inflation_rate")
    public Double getInflationRate() {
        return inflationRate;
    }

    @JsonProperty("inflation_rate")
    public void setInflationRate(Double inflationRate) {
        this.inflationRate = inflationRate;
    }

    @JsonProperty("menus")
    public List<Menu> getMenus() {
        return menus;
    }

    @JsonProperty("menus")
    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    @JsonProperty("show_store_menu_header_photo")
    public Boolean getShowStoreMenuHeaderPhoto() {
        return showStoreMenuHeaderPhoto;
    }

    @JsonProperty("show_store_menu_header_photo")
    public void setShowStoreMenuHeaderPhoto(Boolean showStoreMenuHeaderPhoto) {
        this.showStoreMenuHeaderPhoto = showStoreMenuHeaderPhoto;
    }

    @JsonProperty("composite_score")
    public Integer getCompositeScore() {
        return compositeScore;
    }

    @JsonProperty("composite_score")
    public void setCompositeScore(Integer compositeScore) {
        this.compositeScore = compositeScore;
    }

    @JsonProperty("offers_pickup")
    public Object getOffersPickup() {
        return offersPickup;
    }

    @JsonProperty("offers_pickup")
    public void setOffersPickup(Object offersPickup) {
        this.offersPickup = offersPickup;
    }

    @JsonProperty("number_of_ratings")
    public Integer getNumberOfRatings() {
        return numberOfRatings;
    }

    @JsonProperty("number_of_ratings")
    public void setNumberOfRatings(Integer numberOfRatings) {
        this.numberOfRatings = numberOfRatings;
    }

    @JsonProperty("status_type")
    public String getStatusType() {
        return statusType;
    }

    @JsonProperty("status_type")
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    @JsonProperty("is_only_catering")
    public Boolean getIsOnlyCatering() {
        return isOnlyCatering;
    }

    @JsonProperty("is_only_catering")
    public void setIsOnlyCatering(Boolean isOnlyCatering) {
        this.isOnlyCatering = isOnlyCatering;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("delivery_fee_details")
    public DeliveryFeeDetails getDeliveryFeeDetails() {
        return deliveryFeeDetails;
    }

    @JsonProperty("delivery_fee_details")
    public void setDeliveryFeeDetails(DeliveryFeeDetails deliveryFeeDetails) {
        this.deliveryFeeDetails = deliveryFeeDetails;
    }

    @JsonProperty("object_type")
    public String getObjectType() {
        return objectType;
    }

    @JsonProperty("object_type")
    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("business")
    public Business getBusiness() {
        return business;
    }

    @JsonProperty("business")
    public void setBusiness(Business business) {
        this.business = business;
    }

    @JsonProperty("yelp_biz_id")
    public String getYelpBizId() {
        return yelpBizId;
    }

    @JsonProperty("yelp_biz_id")
    public void setYelpBizId(String yelpBizId) {
        this.yelpBizId = yelpBizId;
    }

    @JsonProperty("asap_time")
    public Object getAsapTime() {
        return asapTime;
    }

    @JsonProperty("asap_time")
    public void setAsapTime(Object asapTime) {
        this.asapTime = asapTime;
    }

    @JsonProperty("yelp_rating")
    public Double getYelpRating() {
        return yelpRating;
    }

    @JsonProperty("yelp_rating")
    public void setYelpRating(Double yelpRating) {
        this.yelpRating = yelpRating;
    }

    @JsonProperty("extra_sos_delivery_fee")
    public Integer getExtraSosDeliveryFee() {
        return extraSosDeliveryFee;
    }

    @JsonProperty("extra_sos_delivery_fee")
    public void setExtraSosDeliveryFee(Integer extraSosDeliveryFee) {
        this.extraSosDeliveryFee = extraSosDeliveryFee;
    }

    @JsonProperty("business_id")
    public Integer getBusinessId() {
        return businessId;
    }

    @JsonProperty("business_id")
    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    @JsonProperty("special_instructions_max_length")
    public Object getSpecialInstructionsMaxLength() {
        return specialInstructionsMaxLength;
    }

    @JsonProperty("special_instructions_max_length")
    public void setSpecialInstructionsMaxLength(Object specialInstructionsMaxLength) {
        this.specialInstructionsMaxLength = specialInstructionsMaxLength;
    }

    @JsonProperty("cover_img_url")
    public String getCoverImgUrl() {
        return coverImgUrl;
    }

    @JsonProperty("cover_img_url")
    public void setCoverImgUrl(String coverImgUrl) {
        this.coverImgUrl = coverImgUrl;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("price_range")
    public Integer getPriceRange() {
        return priceRange;
    }

    @JsonProperty("price_range")
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    @JsonProperty("slug")
    public void setSlug(String slug) {
        this.slug = slug;
    }

    @JsonProperty("show_suggested_items")
    public Boolean getShowSuggestedItems() {
        return showSuggestedItems;
    }

    @JsonProperty("show_suggested_items")
    public void setShowSuggestedItems(Boolean showSuggestedItems) {
        this.showSuggestedItems = showSuggestedItems;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("is_newly_added")
    public Boolean getIsNewlyAdded() {
        return isNewlyAdded;
    }

    @JsonProperty("is_newly_added")
    public void setIsNewlyAdded(Boolean isNewlyAdded) {
        this.isNewlyAdded = isNewlyAdded;
    }

    @JsonProperty("is_good_for_group_orders")
    public Boolean getIsGoodForGroupOrders() {
        return isGoodForGroupOrders;
    }

    @JsonProperty("is_good_for_group_orders")
    public void setIsGoodForGroupOrders(Boolean isGoodForGroupOrders) {
        this.isGoodForGroupOrders = isGoodForGroupOrders;
    }

    @JsonProperty("service_rate")
    public Double getServiceRate() {
        return serviceRate;
    }

    @JsonProperty("service_rate")
    public void setServiceRate(Double serviceRate) {
        this.serviceRate = serviceRate;
    }

    @JsonProperty("merchant_promotions")
    public List<MerchantPromotion> getMerchantPromotions() {
        return merchantPromotions;
    }

    @JsonProperty("merchant_promotions")
    public void setMerchantPromotions(List<MerchantPromotion> merchantPromotions) {
        this.merchantPromotions = merchantPromotions;
    }

    @JsonProperty("header_image_url")
    public Object getHeaderImageUrl() {
        return headerImageUrl;
    }

    @JsonProperty("header_image_url")
    public void setHeaderImageUrl(Object headerImageUrl) {
        this.headerImageUrl = headerImageUrl;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public String getDeliveryFees() {
        if (getDeliveryFee() == 0) {
            return FREE;
        } else {
            return "Delivery Fee: $" + String.valueOf(getDeliveryFee() / 100.0);
        }
    }

    public String getRating() {
        return String.format("Rating: %s / %s", averageRating, RATING_MAX_VALUE);
    }
}


