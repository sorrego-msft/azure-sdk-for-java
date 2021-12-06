// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.KeyVaultAndKeyReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** disk encryption set resource update properties. */
@Fluent
public final class DiskEncryptionSetUpdateProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DiskEncryptionSetUpdateProperties.class);

    /*
     * Key Vault Key Url and vault id of KeK, KeK is optional and when provided
     * is used to unwrap the encryptionKey
     */
    @JsonProperty(value = "activeKey")
    private KeyVaultAndKeyReference activeKey;

    /**
     * Get the activeKey property: Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to
     * unwrap the encryptionKey.
     *
     * @return the activeKey value.
     */
    public KeyVaultAndKeyReference activeKey() {
        return this.activeKey;
    }

    /**
     * Set the activeKey property: Key Vault Key Url and vault id of KeK, KeK is optional and when provided is used to
     * unwrap the encryptionKey.
     *
     * @param activeKey the activeKey value to set.
     * @return the DiskEncryptionSetUpdateProperties object itself.
     */
    public DiskEncryptionSetUpdateProperties withActiveKey(KeyVaultAndKeyReference activeKey) {
        this.activeKey = activeKey;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeKey() != null) {
            activeKey().validate();
        }
    }
}