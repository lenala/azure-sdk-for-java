/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.language.luis.authoring.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Object model for creating an entity role.
 */
public class EntityRoleCreateObject {
    /**
     * The entity role name.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the EntityRoleCreateObject object itself.
     */
    public EntityRoleCreateObject withName(String name) {
        this.name = name;
        return this;
    }

}
