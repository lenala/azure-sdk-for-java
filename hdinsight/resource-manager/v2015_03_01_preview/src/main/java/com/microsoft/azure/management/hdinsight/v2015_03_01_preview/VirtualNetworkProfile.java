/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The virtual network properties.
 */
public class VirtualNetworkProfile {
    /**
     * The ID of the virtual network.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The name of the subnet.
     */
    @JsonProperty(value = "subnet")
    private String subnet;

    /**
     * Get the ID of the virtual network.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the ID of the virtual network.
     *
     * @param id the id value to set
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the name of the subnet.
     *
     * @return the subnet value
     */
    public String subnet() {
        return this.subnet;
    }

    /**
     * Set the name of the subnet.
     *
     * @param subnet the subnet value to set
     * @return the VirtualNetworkProfile object itself.
     */
    public VirtualNetworkProfile withSubnet(String subnet) {
        this.subnet = subnet;
        return this;
    }

}
