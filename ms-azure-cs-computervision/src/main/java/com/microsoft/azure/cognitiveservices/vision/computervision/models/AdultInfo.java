// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The AdultInfo model.
 */
@Fluent
public final class AdultInfo {
    /*
     * A value indicating if the image contains adult-oriented content.
     */
    @JsonProperty(value = "isAdultContent")
    private Boolean isAdultContent;

    /*
     * A value indicating if the image is racy.
     */
    @JsonProperty(value = "isRacyContent")
    private Boolean isRacyContent;

    /*
     * A value indicating if the image is gory.
     */
    @JsonProperty(value = "isGoryContent")
    private Boolean isGoryContent;

    /*
     * Score from 0 to 1 that indicates how much the content is considered
     * adult-oriented within the image.
     */
    @JsonProperty(value = "adultScore")
    private Double adultScore;

    /*
     * Score from 0 to 1 that indicates how suggestive is the image.
     */
    @JsonProperty(value = "racyScore")
    private Double racyScore;

    /*
     * Score from 0 to 1 that indicates how gory is the image.
     */
    @JsonProperty(value = "goreScore")
    private Double goreScore;

    /**
     * Get the isAdultContent property: A value indicating if the image
     * contains adult-oriented content.
     * 
     * @return the isAdultContent value.
     */
    public Boolean isAdultContent() {
        return this.isAdultContent;
    }

    /**
     * Set the isAdultContent property: A value indicating if the image
     * contains adult-oriented content.
     * 
     * @param isAdultContent the isAdultContent value to set.
     * @return the AdultInfo object itself.
     */
    public AdultInfo setIsAdultContent(Boolean isAdultContent) {
        this.isAdultContent = isAdultContent;
        return this;
    }

    /**
     * Get the isRacyContent property: A value indicating if the image is racy.
     * 
     * @return the isRacyContent value.
     */
    public Boolean isRacyContent() {
        return this.isRacyContent;
    }

    /**
     * Set the isRacyContent property: A value indicating if the image is racy.
     * 
     * @param isRacyContent the isRacyContent value to set.
     * @return the AdultInfo object itself.
     */
    public AdultInfo setIsRacyContent(Boolean isRacyContent) {
        this.isRacyContent = isRacyContent;
        return this;
    }

    /**
     * Get the isGoryContent property: A value indicating if the image is gory.
     * 
     * @return the isGoryContent value.
     */
    public Boolean isGoryContent() {
        return this.isGoryContent;
    }

    /**
     * Set the isGoryContent property: A value indicating if the image is gory.
     * 
     * @param isGoryContent the isGoryContent value to set.
     * @return the AdultInfo object itself.
     */
    public AdultInfo setIsGoryContent(Boolean isGoryContent) {
        this.isGoryContent = isGoryContent;
        return this;
    }

    /**
     * Get the adultScore property: Score from 0 to 1 that indicates how much
     * the content is considered adult-oriented within the image.
     * 
     * @return the adultScore value.
     */
    public Double getAdultScore() {
        return this.adultScore;
    }

    /**
     * Set the adultScore property: Score from 0 to 1 that indicates how much
     * the content is considered adult-oriented within the image.
     * 
     * @param adultScore the adultScore value to set.
     * @return the AdultInfo object itself.
     */
    public AdultInfo setAdultScore(Double adultScore) {
        this.adultScore = adultScore;
        return this;
    }

    /**
     * Get the racyScore property: Score from 0 to 1 that indicates how
     * suggestive is the image.
     * 
     * @return the racyScore value.
     */
    public Double getRacyScore() {
        return this.racyScore;
    }

    /**
     * Set the racyScore property: Score from 0 to 1 that indicates how
     * suggestive is the image.
     * 
     * @param racyScore the racyScore value to set.
     * @return the AdultInfo object itself.
     */
    public AdultInfo setRacyScore(Double racyScore) {
        this.racyScore = racyScore;
        return this;
    }

    /**
     * Get the goreScore property: Score from 0 to 1 that indicates how gory is
     * the image.
     * 
     * @return the goreScore value.
     */
    public Double getGoreScore() {
        return this.goreScore;
    }

    /**
     * Set the goreScore property: Score from 0 to 1 that indicates how gory is
     * the image.
     * 
     * @param goreScore the goreScore value to set.
     * @return the AdultInfo object itself.
     */
    public AdultInfo setGoreScore(Double goreScore) {
        this.goreScore = goreScore;
        return this;
    }
}
