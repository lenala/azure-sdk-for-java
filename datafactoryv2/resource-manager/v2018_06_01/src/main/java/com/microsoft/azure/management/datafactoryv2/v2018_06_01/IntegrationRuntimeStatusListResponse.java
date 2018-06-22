/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.List;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation.IntegrationRuntimeStatusResponseInner;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A list of integration runtime status.
 */
public class IntegrationRuntimeStatusListResponse {
    /**
     * List of integration runtime status.
     */
    @JsonProperty(value = "value", required = true)
    private List<IntegrationRuntimeStatusResponseInner> value;

    /**
     * The link to the next page of results, if any remaining results exist.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get list of integration runtime status.
     *
     * @return the value value
     */
    public List<IntegrationRuntimeStatusResponseInner> value() {
        return this.value;
    }

    /**
     * Set list of integration runtime status.
     *
     * @param value the value value to set
     * @return the IntegrationRuntimeStatusListResponse object itself.
     */
    public IntegrationRuntimeStatusListResponse withValue(List<IntegrationRuntimeStatusResponseInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the link to the next page of results, if any remaining results exist.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the link to the next page of results, if any remaining results exist.
     *
     * @param nextLink the nextLink value to set
     * @return the IntegrationRuntimeStatusListResponse object itself.
     */
    public IntegrationRuntimeStatusListResponse withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}
