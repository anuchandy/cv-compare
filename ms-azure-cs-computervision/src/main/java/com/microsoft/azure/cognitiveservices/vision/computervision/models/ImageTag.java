// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The ImageTag model.
 */
@Fluent
public final class ImageTag {
    /*
     * Name of the entity.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The level of confidence that the entity was observed.
     */
    @JsonProperty(value = "confidence")
    private Double confidence;

    /*
     * Optional hint/details for this tag.
     */
    @JsonProperty(value = "hint")
    private String hint;

    /**
     * Get the name property: Name of the entity.
     * 
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: Name of the entity.
     * 
     * @param name the name value to set.
     * @return the ImageTag object itself.
     */
    public ImageTag setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the confidence property: The level of confidence that the entity was
     * observed.
     * 
     * @return the confidence value.
     */
    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: The level of confidence that the entity was
     * observed.
     * 
     * @param confidence the confidence value to set.
     * @return the ImageTag object itself.
     */
    public ImageTag setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the hint property: Optional hint/details for this tag.
     * 
     * @return the hint value.
     */
    public String getHint() {
        return this.hint;
    }

    /**
     * Set the hint property: Optional hint/details for this tag.
     * 
     * @param hint the hint value to set.
     * @return the ImageTag object itself.
     */
    public ImageTag setHint(String hint) {
        this.hint = hint;
        return this;
    }
}
