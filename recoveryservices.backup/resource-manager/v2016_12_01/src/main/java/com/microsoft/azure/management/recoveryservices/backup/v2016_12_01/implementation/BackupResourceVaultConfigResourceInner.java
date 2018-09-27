/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.SkipParentValidation;
import com.microsoft.azure.Resource;

/**
 * Backup resource vault config details.
 */
@SkipParentValidation
public class BackupResourceVaultConfigResourceInner extends Resource {
    /**
     * BackupResourceVaultConfigResource properties.
     */
    @JsonProperty(value = "properties")
    private BackupResourceVaultConfigInner properties;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get backupResourceVaultConfigResource properties.
     *
     * @return the properties value
     */
    public BackupResourceVaultConfigInner properties() {
        return this.properties;
    }

    /**
     * Set backupResourceVaultConfigResource properties.
     *
     * @param properties the properties value to set
     * @return the BackupResourceVaultConfigResourceInner object itself.
     */
    public BackupResourceVaultConfigResourceInner withProperties(BackupResourceVaultConfigInner properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get optional ETag.
     *
     * @return the eTag value
     */
    public String eTag() {
        return this.eTag;
    }

    /**
     * Set optional ETag.
     *
     * @param eTag the eTag value to set
     * @return the BackupResourceVaultConfigResourceInner object itself.
     */
    public BackupResourceVaultConfigResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
