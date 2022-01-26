// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Required permissions for the connector. */
@Fluent
public final class RequiredPermissions {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RequiredPermissions.class);

    /*
     * action permission
     */
    @JsonProperty(value = "action")
    private Boolean action;

    /*
     * write permission
     */
    @JsonProperty(value = "write")
    private Boolean write;

    /*
     * read permission
     */
    @JsonProperty(value = "read")
    private Boolean read;

    /*
     * delete permission
     */
    @JsonProperty(value = "delete")
    private Boolean delete;

    /**
     * Get the action property: action permission.
     *
     * @return the action value.
     */
    public Boolean action() {
        return this.action;
    }

    /**
     * Set the action property: action permission.
     *
     * @param action the action value to set.
     * @return the RequiredPermissions object itself.
     */
    public RequiredPermissions withAction(Boolean action) {
        this.action = action;
        return this;
    }

    /**
     * Get the write property: write permission.
     *
     * @return the write value.
     */
    public Boolean write() {
        return this.write;
    }

    /**
     * Set the write property: write permission.
     *
     * @param write the write value to set.
     * @return the RequiredPermissions object itself.
     */
    public RequiredPermissions withWrite(Boolean write) {
        this.write = write;
        return this;
    }

    /**
     * Get the read property: read permission.
     *
     * @return the read value.
     */
    public Boolean read() {
        return this.read;
    }

    /**
     * Set the read property: read permission.
     *
     * @param read the read value to set.
     * @return the RequiredPermissions object itself.
     */
    public RequiredPermissions withRead(Boolean read) {
        this.read = read;
        return this;
    }

    /**
     * Get the delete property: delete permission.
     *
     * @return the delete value.
     */
    public Boolean delete() {
        return this.delete;
    }

    /**
     * Set the delete property: delete permission.
     *
     * @param delete the delete value to set.
     * @return the RequiredPermissions object itself.
     */
    public RequiredPermissions withDelete(Boolean delete) {
        this.delete = delete;
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