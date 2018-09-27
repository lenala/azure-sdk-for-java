/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response body for find similar face operation.
 */
public class SimilarFace {
    /**
     * FaceId of candidate face when find by faceIds. faceId is created by Face
     * - Detect and will expire 24 hours after the detection call.
     */
    @JsonProperty(value = "faceId")
    private UUID faceId;

    /**
     * PersistedFaceId of candidate face when find by faceListId.
     * persistedFaceId in face list is persisted and will not expire. As showed
     * in below response.
     */
    @JsonProperty(value = "persistedFaceId")
    private UUID persistedFaceId;

    /**
     * Similarity confidence of the candidate face. The higher confidence, the
     * more similar. Range between [0,1].
     */
    @JsonProperty(value = "confidence", required = true)
    private double confidence;

    /**
     * Get the faceId value.
     *
     * @return the faceId value
     */
    public UUID faceId() {
        return this.faceId;
    }

    /**
     * Set the faceId value.
     *
     * @param faceId the faceId value to set
     * @return the SimilarFace object itself.
     */
    public SimilarFace withFaceId(UUID faceId) {
        this.faceId = faceId;
        return this;
    }

    /**
     * Get the persistedFaceId value.
     *
     * @return the persistedFaceId value
     */
    public UUID persistedFaceId() {
        return this.persistedFaceId;
    }

    /**
     * Set the persistedFaceId value.
     *
     * @param persistedFaceId the persistedFaceId value to set
     * @return the SimilarFace object itself.
     */
    public SimilarFace withPersistedFaceId(UUID persistedFaceId) {
        this.persistedFaceId = persistedFaceId;
        return this;
    }

    /**
     * Get the confidence value.
     *
     * @return the confidence value
     */
    public double confidence() {
        return this.confidence;
    }

    /**
     * Set the confidence value.
     *
     * @param confidence the confidence value to set
     * @return the SimilarFace object itself.
     */
    public SimilarFace withConfidence(double confidence) {
        this.confidence = confidence;
        return this;
    }

}
