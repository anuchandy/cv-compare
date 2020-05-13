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
 * The OcrResult model.
 */
@Fluent
public final class OcrResult {
    /*
     * The BCP-47 language code of the text in the image.
     */
    @JsonProperty(value = "language")
    private String language;

    /*
     * The angle, in radians, of the detected text with respect to the closest
     * horizontal or vertical direction. After rotating the input image
     * clockwise by this angle, the recognized text lines become horizontal or
     * vertical. In combination with the orientation property it can be used to
     * overlay recognition results correctly on the original image, by rotating
     * either the original image or recognition results by a suitable angle
     * around the center of the original image. If the angle cannot be
     * confidently detected, this property is not present. If the image
     * contains text at different angles, only part of the text will be
     * recognized correctly.
     */
    @JsonProperty(value = "textAngle")
    private Double textAngle;

    /*
     * Orientation of the text recognized in the image, if requested. The value
     * (up, down, left, or right) refers to the direction that the top of the
     * recognized text is facing, after the image has been rotated around its
     * center according to the detected text angle (see textAngle property).
     * If detection of the orientation was not requested, or no text is
     * detected, the value is 'NotDetected'.
     */
    @JsonProperty(value = "orientation")
    private String orientation;

    /*
     * An array of objects, where each object represents a region of recognized
     * text.
     */
    @JsonProperty(value = "regions")
    private List<OcrRegion> regions;

    /**
     * Get the language property: The BCP-47 language code of the text in the
     * image.
     * 
     * @return the language value.
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The BCP-47 language code of the text in the
     * image.
     * 
     * @param language the language value to set.
     * @return the OcrResult object itself.
     */
    public OcrResult setLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * Get the textAngle property: The angle, in radians, of the detected text
     * with respect to the closest horizontal or vertical direction. After
     * rotating the input image clockwise by this angle, the recognized text
     * lines become horizontal or vertical. In combination with the orientation
     * property it can be used to overlay recognition results correctly on the
     * original image, by rotating either the original image or recognition
     * results by a suitable angle around the center of the original image. If
     * the angle cannot be confidently detected, this property is not present.
     * If the image contains text at different angles, only part of the text
     * will be recognized correctly.
     * 
     * @return the textAngle value.
     */
    public Double getTextAngle() {
        return this.textAngle;
    }

    /**
     * Set the textAngle property: The angle, in radians, of the detected text
     * with respect to the closest horizontal or vertical direction. After
     * rotating the input image clockwise by this angle, the recognized text
     * lines become horizontal or vertical. In combination with the orientation
     * property it can be used to overlay recognition results correctly on the
     * original image, by rotating either the original image or recognition
     * results by a suitable angle around the center of the original image. If
     * the angle cannot be confidently detected, this property is not present.
     * If the image contains text at different angles, only part of the text
     * will be recognized correctly.
     * 
     * @param textAngle the textAngle value to set.
     * @return the OcrResult object itself.
     */
    public OcrResult setTextAngle(Double textAngle) {
        this.textAngle = textAngle;
        return this;
    }

    /**
     * Get the orientation property: Orientation of the text recognized in the
     * image, if requested. The value (up, down, left, or right) refers to the
     * direction that the top of the recognized text is facing, after the image
     * has been rotated around its center according to the detected text angle
     * (see textAngle property).
     * If detection of the orientation was not requested, or no text is
     * detected, the value is 'NotDetected'.
     * 
     * @return the orientation value.
     */
    public String getOrientation() {
        return this.orientation;
    }

    /**
     * Set the orientation property: Orientation of the text recognized in the
     * image, if requested. The value (up, down, left, or right) refers to the
     * direction that the top of the recognized text is facing, after the image
     * has been rotated around its center according to the detected text angle
     * (see textAngle property).
     * If detection of the orientation was not requested, or no text is
     * detected, the value is 'NotDetected'.
     * 
     * @param orientation the orientation value to set.
     * @return the OcrResult object itself.
     */
    public OcrResult setOrientation(String orientation) {
        this.orientation = orientation;
        return this;
    }

    /**
     * Get the regions property: An array of objects, where each object
     * represents a region of recognized text.
     * 
     * @return the regions value.
     */
    public List<OcrRegion> getRegions() {
        return this.regions;
    }

    /**
     * Set the regions property: An array of objects, where each object
     * represents a region of recognized text.
     * 
     * @param regions the regions value to set.
     * @return the OcrResult object itself.
     */
    public OcrResult setRegions(List<OcrRegion> regions) {
        this.regions = regions;
        return this;
    }
}
