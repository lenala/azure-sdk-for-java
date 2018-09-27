/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2018_06_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Details of JobOutput errors.
 */
public class JobError {
    /**
     * Error code describing the error. Possible values include:
     * 'ServiceError', 'ServiceTransientError', 'DownloadNotAccessible',
     * 'DownloadTransientError', 'UploadNotAccessible', 'UploadTransientError',
     * 'ConfigurationUnsupported', 'ContentMalformed', 'ContentUnsupported'.
     */
    @JsonProperty(value = "code", access = JsonProperty.Access.WRITE_ONLY)
    private JobErrorCode code;

    /**
     * A human-readable language-dependent representation of the error.
     */
    @JsonProperty(value = "message", access = JsonProperty.Access.WRITE_ONLY)
    private String message;

    /**
     * Helps with categorization of errors. Possible values include: 'Service',
     * 'Download', 'Upload', 'Configuration', 'Content'.
     */
    @JsonProperty(value = "category", access = JsonProperty.Access.WRITE_ONLY)
    private JobErrorCategory category;

    /**
     * Indicates that it may be possible to retry the Job. If retry is
     * unsuccessful, please contact Azure support via Azure Portal. Possible
     * values include: 'DoNotRetry', 'MayRetry'.
     */
    @JsonProperty(value = "retry", access = JsonProperty.Access.WRITE_ONLY)
    private JobRetry retry;

    /**
     * An array of details about specific errors that led to this reported
     * error.
     */
    @JsonProperty(value = "details", access = JsonProperty.Access.WRITE_ONLY)
    private List<JobErrorDetail> details;

    /**
     * Get error code describing the error. Possible values include: 'ServiceError', 'ServiceTransientError', 'DownloadNotAccessible', 'DownloadTransientError', 'UploadNotAccessible', 'UploadTransientError', 'ConfigurationUnsupported', 'ContentMalformed', 'ContentUnsupported'.
     *
     * @return the code value
     */
    public JobErrorCode code() {
        return this.code;
    }

    /**
     * Get a human-readable language-dependent representation of the error.
     *
     * @return the message value
     */
    public String message() {
        return this.message;
    }

    /**
     * Get helps with categorization of errors. Possible values include: 'Service', 'Download', 'Upload', 'Configuration', 'Content'.
     *
     * @return the category value
     */
    public JobErrorCategory category() {
        return this.category;
    }

    /**
     * Get indicates that it may be possible to retry the Job. If retry is unsuccessful, please contact Azure support via Azure Portal. Possible values include: 'DoNotRetry', 'MayRetry'.
     *
     * @return the retry value
     */
    public JobRetry retry() {
        return this.retry;
    }

    /**
     * Get an array of details about specific errors that led to this reported error.
     *
     * @return the details value
     */
    public List<JobErrorDetail> details() {
        return this.details;
    }

}
