/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.v2016_06_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Vault extended information.
 */
@JsonFlatten
public class VaultExtendedInfoResourceInner extends ProxyResource {
    /**
     * Integrity key.
     */
    @JsonProperty(value = "properties.integrityKey")
    private String integrityKey;

    /**
     * Encryption key.
     */
    @JsonProperty(value = "properties.encryptionKey")
    private String encryptionKey;

    /**
     * Encryption key thumbprint.
     */
    @JsonProperty(value = "properties.encryptionKeyThumbprint")
    private String encryptionKeyThumbprint;

    /**
     * Algorithm for Vault ExtendedInfo.
     */
    @JsonProperty(value = "properties.algorithm")
    private String algorithm;

    /**
     * Optional ETag.
     */
    @JsonProperty(value = "eTag")
    private String eTag;

    /**
     * Get integrity key.
     *
     * @return the integrityKey value
     */
    public String integrityKey() {
        return this.integrityKey;
    }

    /**
     * Set integrity key.
     *
     * @param integrityKey the integrityKey value to set
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withIntegrityKey(String integrityKey) {
        this.integrityKey = integrityKey;
        return this;
    }

    /**
     * Get encryption key.
     *
     * @return the encryptionKey value
     */
    public String encryptionKey() {
        return this.encryptionKey;
    }

    /**
     * Set encryption key.
     *
     * @param encryptionKey the encryptionKey value to set
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEncryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * Get encryption key thumbprint.
     *
     * @return the encryptionKeyThumbprint value
     */
    public String encryptionKeyThumbprint() {
        return this.encryptionKeyThumbprint;
    }

    /**
     * Set encryption key thumbprint.
     *
     * @param encryptionKeyThumbprint the encryptionKeyThumbprint value to set
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withEncryptionKeyThumbprint(String encryptionKeyThumbprint) {
        this.encryptionKeyThumbprint = encryptionKeyThumbprint;
        return this;
    }

    /**
     * Get algorithm for Vault ExtendedInfo.
     *
     * @return the algorithm value
     */
    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Set algorithm for Vault ExtendedInfo.
     *
     * @param algorithm the algorithm value to set
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withAlgorithm(String algorithm) {
        this.algorithm = algorithm;
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
     * @return the VaultExtendedInfoResourceInner object itself.
     */
    public VaultExtendedInfoResourceInner withETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

}
