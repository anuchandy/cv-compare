// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The OcrWord model.
 */
@Fluent
public final class OcrWord {
    /*
     * Bounding box of a recognized word. The four integers represent the
     * x-coordinate of the left edge, the y-coordinate of the top edge, width,
     * and height of the bounding box, in the coordinate system of the input
     * image, after it has been rotated around its center according to the
     * detected text angle (see textAngle property), with the origin at the
     * top-left corner, and the y-axis pointing down.
     */
    @JsonProperty(value = "boundingBox")
    private String boundingBox;

    /*
     * String value of a recognized word.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Get the boundingBox property: Bounding box of a recognized word. The
     * four integers represent the x-coordinate of the left edge, the
     * y-coordinate of the top edge, width, and height of the bounding box, in
     * the coordinate system of the input image, after it has been rotated
     * around its center according to the detected text angle (see textAngle
     * property), with the origin at the top-left corner, and the y-axis
     * pointing down.
     * 
     * @return the boundingBox value.
     */
    public String getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * Set the boundingBox property: Bounding box of a recognized word. The
     * four integers represent the x-coordinate of the left edge, the
     * y-coordinate of the top edge, width, and height of the bounding box, in
     * the coordinate system of the input image, after it has been rotated
     * around its center according to the detected text angle (see textAngle
     * property), with the origin at the top-left corner, and the y-axis
     * pointing down.
     * 
     * @param boundingBox the boundingBox value to set.
     * @return the OcrWord object itself.
     */
    public OcrWord setBoundingBox(String boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the text property: String value of a recognized word.
     * 
     * @return the text value.
     */
    public String getText() {
        return this.text;
    }

    /**
     * Set the text property: String value of a recognized word.
     * 
     * @param text the text value to set.
     * @return the OcrWord object itself.
     */
    public OcrWord setText(String text) {
        this.text = text;
        return this;
    }
}
