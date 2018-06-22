/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The object that defines the structure of an Azure Data Factory response.
 */
public class ErrorResponse {
    /**
     * Error code.
     */
    @JsonProperty(value = "code", required = true)
    private String code;

    /**
     * Error message.
     */
    @JsonProperty(value = "message", required = true)
    private String message;

    /**
     * Property name/path in request associated with error.
     */
    @JsonProperty(value = "target")
    private String target;

    /**
     * Array with additional error details.
     */
    @JsonProperty(value = "details")
    private List<ErrorResponse> details;

    /**
     * Get error code.
     *
     * @return the code value
     */
    public String code() {
        return this.code;
    }

    /**
     * Set error code.
     *
     * @param code the code value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get error message.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Set error message.
     *
     * @param message the message value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get property name/path in request associated with error.
     *
     * @return the target value
     */
    public String target() {
        return this.target;
    }

    /**
     * Set property name/path in request associated with error.
     *
     * @param target the target value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withTarget(String target) {
        this.target = target;
        return this;
    }

    /**
     * Get array with additional error details.
     *
     * @return the details value
     */
    public List<ErrorResponse> details() {
        return this.details;
    }

    /**
     * Set array with additional error details.
     *
     * @param details the details value to set
     * @return the ErrorResponse object itself.
     */
    public ErrorResponse withDetails(List<ErrorResponse> details) {
        this.details = details;
        return this;
    }

}
