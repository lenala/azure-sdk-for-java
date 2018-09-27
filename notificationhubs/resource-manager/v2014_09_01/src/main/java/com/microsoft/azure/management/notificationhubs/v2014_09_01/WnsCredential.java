/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.notificationhubs.v2014_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Description of a NotificationHub WnsCredential.
 */
public class WnsCredential {
    /**
     * Gets or sets properties of NotificationHub WnsCredential.
     */
    @JsonProperty(value = "properties")
    private WnsCredentialProperties properties;

    /**
     * Get gets or sets properties of NotificationHub WnsCredential.
     *
     * @return the properties value
     */
    public WnsCredentialProperties properties() {
        return this.properties;
    }

    /**
     * Set gets or sets properties of NotificationHub WnsCredential.
     *
     * @param properties the properties value to set
     * @return the WnsCredential object itself.
     */
    public WnsCredential withProperties(WnsCredentialProperties properties) {
        this.properties = properties;
        return this;
    }

}
