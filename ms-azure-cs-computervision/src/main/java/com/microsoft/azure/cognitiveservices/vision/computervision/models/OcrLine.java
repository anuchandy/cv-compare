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
 * The OcrLine model.
 */
@Fluent
public final class OcrLine {
    /*
     * Bounding box of a recognized line. The four integers represent the
     * x-coordinate of the left edge, the y-coordinate of the top edge, width,
     * and height of the bounding box, in the coordinate system of the input
     * image, after it has been rotated around its center according to the
     * detected text angle (see textAngle property), with the origin at the
     * top-left corner, and the y-axis pointing down.
     */
    @JsonProperty(value = "boundingBox")
    private String boundingBox;

    /*
     * An array of objects, where each object represents a recognized word.
     */
    @JsonProperty(value = "words")
    private List<OcrWord> words;

    /**
     * Get the boundingBox property: Bounding box of a recognized line. The
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
     * Set the boundingBox property: Bounding box of a recognized line. The
     * four integers represent the x-coordinate of the left edge, the
     * y-coordinate of the top edge, width, and height of the bounding box, in
     * the coordinate system of the input image, after it has been rotated
     * around its center according to the detected text angle (see textAngle
     * property), with the origin at the top-left corner, and the y-axis
     * pointing down.
     * 
     * @param boundingBox the boundingBox value to set.
     * @return the OcrLine object itself.
     */
    public OcrLine setBoundingBox(String boundingBox) {
        this.boundingBox = boundingBox;
        return this;
    }

    /**
     * Get the words property: An array of objects, where each object
     * represents a recognized word.
     * 
     * @return the words value.
     */
    public List<OcrWord> getWords() {
        return this.words;
    }

    /**
     * Set the words property: An array of objects, where each object
     * represents a recognized word.
     * 
     * @param words the words value to set.
     * @return the OcrLine object itself.
     */
    public OcrLine setWords(List<OcrWord> words) {
        this.words = words;
        return this;
    }
}
