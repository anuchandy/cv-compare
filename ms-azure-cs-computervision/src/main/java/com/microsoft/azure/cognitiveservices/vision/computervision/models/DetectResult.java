// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * The DetectResult model.
 */
@Fluent
public final class DetectResult {
    /*
     * An array of detected objects.
     */
    @JsonProperty(value = "objects", access = JsonProperty.Access.WRITE_ONLY)
    private List<DetectedObject> objects;

    /*
     * Id of the REST API request.
     */
    @JsonProperty(value = "requestId")
    private String requestId;

    /*
     * Image metadata.
     */
    @JsonProperty(value = "metadata")
    private ImageMetadata metadata;

    /**
     * Get the objects property: An array of detected objects.
     * 
     * @return the objects value.
     */
    public List<DetectedObject> getObjects() {
        return this.objects;
    }

    /**
     * Get the requestId property: Id of the REST API request.
     * 
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: Id of the REST API request.
     * 
     * @param requestId the requestId value to set.
     * @return the DetectResult object itself.
     */
    public DetectResult setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the metadata property: Image metadata.
     * 
     * @return the metadata value.
     */
    public ImageMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: Image metadata.
     * 
     * @param metadata the metadata value to set.
     * @return the DetectResult object itself.
     */
    public DetectResult setMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
