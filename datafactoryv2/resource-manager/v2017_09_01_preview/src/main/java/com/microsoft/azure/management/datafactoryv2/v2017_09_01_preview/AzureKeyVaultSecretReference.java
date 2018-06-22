/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Azure Key Vault secret reference.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureKeyVaultSecret")
public class AzureKeyVaultSecretReference extends SecretBase {
    /**
     * The Azure Key Vault linked service reference.
     */
    @JsonProperty(value = "store", required = true)
    private LinkedServiceReference store;

    /**
     * The name of the secret in Azure Key Vault. Type: string (or Expression
     * with resultType string).
     */
    @JsonProperty(value = "secretName", required = true)
    private Object secretName;

    /**
     * The version of the secret in Azure Key Vault. The default value is the
     * latest version of the secret. Type: string (or Expression with
     * resultType string).
     */
    @JsonProperty(value = "secretVersion")
    private Object secretVersion;

    /**
     * Get the Azure Key Vault linked service reference.
     *
     * @return the store value
     */
    public LinkedServiceReference store() {
        return this.store;
    }

    /**
     * Set the Azure Key Vault linked service reference.
     *
     * @param store the store value to set
     * @return the AzureKeyVaultSecretReference object itself.
     */
    public AzureKeyVaultSecretReference withStore(LinkedServiceReference store) {
        this.store = store;
        return this;
    }

    /**
     * Get the name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
     *
     * @return the secretName value
     */
    public Object secretName() {
        return this.secretName;
    }

    /**
     * Set the name of the secret in Azure Key Vault. Type: string (or Expression with resultType string).
     *
     * @param secretName the secretName value to set
     * @return the AzureKeyVaultSecretReference object itself.
     */
    public AzureKeyVaultSecretReference withSecretName(Object secretName) {
        this.secretName = secretName;
        return this;
    }

    /**
     * Get the version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
     *
     * @return the secretVersion value
     */
    public Object secretVersion() {
        return this.secretVersion;
    }

    /**
     * Set the version of the secret in Azure Key Vault. The default value is the latest version of the secret. Type: string (or Expression with resultType string).
     *
     * @param secretVersion the secretVersion value to set
     * @return the AzureKeyVaultSecretReference object itself.
     */
    public AzureKeyVaultSecretReference withSecretVersion(Object secretVersion) {
        this.secretVersion = secretVersion;
        return this;
    }

}
