// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The DetectedObject model.
 */
@Fluent
public final class DetectedObject {
    /*
     * Approximate location of the detected object.
     */
    @JsonProperty(value = "rectangle", access = JsonProperty.Access.WRITE_ONLY)
    private BoundingRect rectangle;

    /*
     * Label for the object.
     */
    @JsonProperty(value = "object")
    private String object;

    /*
     * Confidence score of having observed the object in the image, as a value
     * ranging from 0 to 1.
     */
    @JsonProperty(value = "confidence")
    private Double confidence;

    /*
     * The parent object, from a taxonomy perspective.
     * The parent object is a more generic form of this object.  For example, a
     * 'bulldog' would have a parent of 'dog'.
     */
    @JsonProperty(value = "parent")
    private ObjectHierarchy parent;

    /**
     * Get the rectangle property: Approximate location of the detected object.
     * 
     * @return the rectangle value.
     */
    public BoundingRect getRectangle() {
        return this.rectangle;
    }

    /**
     * Get the object property: Label for the object.
     * 
     * @return the object value.
     */
    public String getObject() {
        return this.object;
    }

    /**
     * Set the object property: Label for the object.
     * 
     * @param object the object value to set.
     * @return the DetectedObject object itself.
     */
    public DetectedObject setObject(String object) {
        this.object = object;
        return this;
    }

    /**
     * Get the confidence property: Confidence score of having observed the
     * object in the image, as a value ranging from 0 to 1.
     * 
     * @return the confidence value.
     */
    public Double getConfidence() {
        return this.confidence;
    }

    /**
     * Set the confidence property: Confidence score of having observed the
     * object in the image, as a value ranging from 0 to 1.
     * 
     * @param confidence the confidence value to set.
     * @return the DetectedObject object itself.
     */
    public DetectedObject setConfidence(Double confidence) {
        this.confidence = confidence;
        return this;
    }

    /**
     * Get the parent property: The parent object, from a taxonomy perspective.
     * The parent object is a more generic form of this object.  For example, a
     * 'bulldog' would have a parent of 'dog'.
     * 
     * @return the parent value.
     */
    public ObjectHierarchy getParent() {
        return this.parent;
    }

    /**
     * Set the parent property: The parent object, from a taxonomy perspective.
     * The parent object is a more generic form of this object.  For example, a
     * 'bulldog' would have a parent of 'dog'.
     * 
     * @param parent the parent value to set.
     * @return the DetectedObject object itself.
     */
    public DetectedObject setParent(ObjectHierarchy parent) {
        this.parent = parent;
        return this;
    }
}
