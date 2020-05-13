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
 * The ImageAnalysis model.
 */
@Fluent
public final class ImageAnalysis {
    /*
     * An array indicating identified categories.
     */
    @JsonProperty(value = "categories")
    private List<Category> categories;

    /*
     * An object describing whether the image contains adult-oriented content
     * and/or is racy.
     */
    @JsonProperty(value = "adult")
    private AdultInfo adult;

    /*
     * An object providing additional metadata describing color attributes.
     */
    @JsonProperty(value = "color")
    private ColorInfo color;

    /*
     * An object providing possible image types and matching confidence levels.
     */
    @JsonProperty(value = "imageType")
    private ImageType imageType;

    /*
     * A list of tags with confidence level.
     */
    @JsonProperty(value = "tags")
    private List<ImageTag> tags;

    /*
     * A collection of content tags, along with a list of captions sorted by
     * confidence level, and image metadata.
     */
    @JsonProperty(value = "description")
    private ImageDescriptionDetails description;

    /*
     * An array of possible faces within the image.
     */
    @JsonProperty(value = "faces")
    private List<FaceDescription> faces;

    /*
     * Array of objects describing what was detected in the image.
     */
    @JsonProperty(value = "objects")
    private List<DetectedObject> objects;

    /*
     * Array of brands detected in the image.
     */
    @JsonProperty(value = "brands")
    private List<DetectedBrand> brands;

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
     * Get the categories property: An array indicating identified categories.
     * 
     * @return the categories value.
     */
    public List<Category> getCategories() {
        return this.categories;
    }

    /**
     * Set the categories property: An array indicating identified categories.
     * 
     * @param categories the categories value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    /**
     * Get the adult property: An object describing whether the image contains
     * adult-oriented content and/or is racy.
     * 
     * @return the adult value.
     */
    public AdultInfo getAdult() {
        return this.adult;
    }

    /**
     * Set the adult property: An object describing whether the image contains
     * adult-oriented content and/or is racy.
     * 
     * @param adult the adult value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setAdult(AdultInfo adult) {
        this.adult = adult;
        return this;
    }

    /**
     * Get the color property: An object providing additional metadata
     * describing color attributes.
     * 
     * @return the color value.
     */
    public ColorInfo getColor() {
        return this.color;
    }

    /**
     * Set the color property: An object providing additional metadata
     * describing color attributes.
     * 
     * @param color the color value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setColor(ColorInfo color) {
        this.color = color;
        return this;
    }

    /**
     * Get the imageType property: An object providing possible image types and
     * matching confidence levels.
     * 
     * @return the imageType value.
     */
    public ImageType getImageType() {
        return this.imageType;
    }

    /**
     * Set the imageType property: An object providing possible image types and
     * matching confidence levels.
     * 
     * @param imageType the imageType value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setImageType(ImageType imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * Get the tags property: A list of tags with confidence level.
     * 
     * @return the tags value.
     */
    public List<ImageTag> getTags() {
        return this.tags;
    }

    /**
     * Set the tags property: A list of tags with confidence level.
     * 
     * @param tags the tags value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setTags(List<ImageTag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the description property: A collection of content tags, along with a
     * list of captions sorted by confidence level, and image metadata.
     * 
     * @return the description value.
     */
    public ImageDescriptionDetails getDescription() {
        return this.description;
    }

    /**
     * Set the description property: A collection of content tags, along with a
     * list of captions sorted by confidence level, and image metadata.
     * 
     * @param description the description value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setDescription(ImageDescriptionDetails description) {
        this.description = description;
        return this;
    }

    /**
     * Get the faces property: An array of possible faces within the image.
     * 
     * @return the faces value.
     */
    public List<FaceDescription> getFaces() {
        return this.faces;
    }

    /**
     * Set the faces property: An array of possible faces within the image.
     * 
     * @param faces the faces value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setFaces(List<FaceDescription> faces) {
        this.faces = faces;
        return this;
    }

    /**
     * Get the objects property: Array of objects describing what was detected
     * in the image.
     * 
     * @return the objects value.
     */
    public List<DetectedObject> getObjects() {
        return this.objects;
    }

    /**
     * Set the objects property: Array of objects describing what was detected
     * in the image.
     * 
     * @param objects the objects value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setObjects(List<DetectedObject> objects) {
        this.objects = objects;
        return this;
    }

    /**
     * Get the brands property: Array of brands detected in the image.
     * 
     * @return the brands value.
     */
    public List<DetectedBrand> getBrands() {
        return this.brands;
    }

    /**
     * Set the brands property: Array of brands detected in the image.
     * 
     * @param brands the brands value to set.
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setBrands(List<DetectedBrand> brands) {
        this.brands = brands;
        return this;
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
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setRequestId(String requestId) {
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
     * @return the ImageAnalysis object itself.
     */
    public ImageAnalysis setMetadata(ImageMetadata metadata) {
        this.metadata = metadata;
        return this;
    }
}
