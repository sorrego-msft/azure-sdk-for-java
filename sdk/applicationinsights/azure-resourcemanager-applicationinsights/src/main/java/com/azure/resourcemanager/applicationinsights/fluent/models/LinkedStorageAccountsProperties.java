// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** An Application Insights component linked storage account. */
@Fluent
public final class LinkedStorageAccountsProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(LinkedStorageAccountsProperties.class);

    /*
     * Linked storage account resource ID
     */
    @JsonProperty(value = "linkedStorageAccount")
    private String linkedStorageAccount;

    /**
     * Get the linkedStorageAccount property: Linked storage account resource ID.
     *
     * @return the linkedStorageAccount value.
     */
    public String linkedStorageAccount() {
        return this.linkedStorageAccount;
    }

    /**
     * Set the linkedStorageAccount property: Linked storage account resource ID.
     *
     * @param linkedStorageAccount the linkedStorageAccount value to set.
     * @return the LinkedStorageAccountsProperties object itself.
     */
    public LinkedStorageAccountsProperties withLinkedStorageAccount(String linkedStorageAccount) {
        this.linkedStorageAccount = linkedStorageAccount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}