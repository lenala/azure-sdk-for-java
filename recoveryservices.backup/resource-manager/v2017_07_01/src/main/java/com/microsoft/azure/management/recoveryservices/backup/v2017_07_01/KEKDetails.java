/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * KEK is encryption key for BEK.
 */
public class KEKDetails {
    /**
     * Key is KEK.
     */
    @JsonProperty(value = "keyUrl")
    private String keyUrl;

    /**
     * Key Vault ID where this Key is stored.
     */
    @JsonProperty(value = "keyVaultId")
    private String keyVaultId;

    /**
     * KEK data.
     */
    @JsonProperty(value = "keyBackupData")
    private String keyBackupData;

    /**
     * Get key is KEK.
     *
     * @return the keyUrl value
     */
    public String keyUrl() {
        return this.keyUrl;
    }

    /**
     * Set key is KEK.
     *
     * @param keyUrl the keyUrl value to set
     * @return the KEKDetails object itself.
     */
    public KEKDetails withKeyUrl(String keyUrl) {
        this.keyUrl = keyUrl;
        return this;
    }

    /**
     * Get key Vault ID where this Key is stored.
     *
     * @return the keyVaultId value
     */
    public String keyVaultId() {
        return this.keyVaultId;
    }

    /**
     * Set key Vault ID where this Key is stored.
     *
     * @param keyVaultId the keyVaultId value to set
     * @return the KEKDetails object itself.
     */
    public KEKDetails withKeyVaultId(String keyVaultId) {
        this.keyVaultId = keyVaultId;
        return this;
    }

    /**
     * Get kEK data.
     *
     * @return the keyBackupData value
     */
    public String keyBackupData() {
        return this.keyBackupData;
    }

    /**
     * Set kEK data.
     *
     * @param keyBackupData the keyBackupData value to set
     * @return the KEKDetails object itself.
     */
    public KEKDetails withKeyBackupData(String keyBackupData) {
        this.keyBackupData = keyBackupData;
        return this;
    }

}
