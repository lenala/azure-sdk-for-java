/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Container extended information.
 */
public class GenericContainerExtendedInfo {
    /**
     * Public key of container cert.
     */
    @JsonProperty(value = "rawCertData")
    private String rawCertData;

    /**
     * Container identity information.
     */
    @JsonProperty(value = "containerIdentityInfo")
    private ContainerIdentityInfo containerIdentityInfo;

    /**
     * Azure Backup Service Endpoints for the container.
     */
    @JsonProperty(value = "serviceEndpoints")
    private Map<String, String> serviceEndpoints;

    /**
     * Get public key of container cert.
     *
     * @return the rawCertData value
     */
    public String rawCertData() {
        return this.rawCertData;
    }

    /**
     * Set public key of container cert.
     *
     * @param rawCertData the rawCertData value to set
     * @return the GenericContainerExtendedInfo object itself.
     */
    public GenericContainerExtendedInfo withRawCertData(String rawCertData) {
        this.rawCertData = rawCertData;
        return this;
    }

    /**
     * Get container identity information.
     *
     * @return the containerIdentityInfo value
     */
    public ContainerIdentityInfo containerIdentityInfo() {
        return this.containerIdentityInfo;
    }

    /**
     * Set container identity information.
     *
     * @param containerIdentityInfo the containerIdentityInfo value to set
     * @return the GenericContainerExtendedInfo object itself.
     */
    public GenericContainerExtendedInfo withContainerIdentityInfo(ContainerIdentityInfo containerIdentityInfo) {
        this.containerIdentityInfo = containerIdentityInfo;
        return this;
    }

    /**
     * Get azure Backup Service Endpoints for the container.
     *
     * @return the serviceEndpoints value
     */
    public Map<String, String> serviceEndpoints() {
        return this.serviceEndpoints;
    }

    /**
     * Set azure Backup Service Endpoints for the container.
     *
     * @param serviceEndpoints the serviceEndpoints value to set
     * @return the GenericContainerExtendedInfo object itself.
     */
    public GenericContainerExtendedInfo withServiceEndpoints(Map<String, String> serviceEndpoints) {
        this.serviceEndpoints = serviceEndpoints;
        return this;
    }

}
