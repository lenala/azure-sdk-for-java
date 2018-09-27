/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.SubResource;

/**
 * SSL certificates of an application gateway.
 */
@JsonFlatten
public class ApplicationGatewaySslCertificate extends SubResource {
    /**
     * Base-64 encoded pfx certificate. Only applicable in PUT Request.
     */
    @JsonProperty(value = "properties.data")
    private String data;

    /**
     * Password for the pfx file specified in data. Only applicable in PUT
     * request.
     */
    @JsonProperty(value = "properties.password")
    private String password;

    /**
     * Base-64 encoded Public cert data corresponding to pfx specified in data.
     * Only applicable in GET request.
     */
    @JsonProperty(value = "properties.publicCertData")
    private String publicCertData;

    /**
     * Provisioning state of the SSL certificate resource Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the SSL certificate that is unique within an Application
     * Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get base-64 encoded pfx certificate. Only applicable in PUT Request.
     *
     * @return the data value
     */
    public String data() {
        return this.data;
    }

    /**
     * Set base-64 encoded pfx certificate. Only applicable in PUT Request.
     *
     * @param data the data value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withData(String data) {
        this.data = data;
        return this;
    }

    /**
     * Get password for the pfx file specified in data. Only applicable in PUT request.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set password for the pfx file specified in data. Only applicable in PUT request.
     *
     * @param password the password value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get base-64 encoded Public cert data corresponding to pfx specified in data. Only applicable in GET request.
     *
     * @return the publicCertData value
     */
    public String publicCertData() {
        return this.publicCertData;
    }

    /**
     * Set base-64 encoded Public cert data corresponding to pfx specified in data. Only applicable in GET request.
     *
     * @param publicCertData the publicCertData value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withPublicCertData(String publicCertData) {
        this.publicCertData = publicCertData;
        return this;
    }

    /**
     * Get provisioning state of the SSL certificate resource Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set provisioning state of the SSL certificate resource Possible values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get name of the SSL certificate that is unique within an Application Gateway.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the SSL certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get a unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set a unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get type of the resource.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set type of the resource.
     *
     * @param type the type value to set
     * @return the ApplicationGatewaySslCertificate object itself.
     */
    public ApplicationGatewaySslCertificate withType(String type) {
        this.type = type;
        return this;
    }

}
