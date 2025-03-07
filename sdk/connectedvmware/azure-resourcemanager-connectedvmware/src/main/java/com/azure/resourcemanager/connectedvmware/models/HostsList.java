// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.connectedvmware.fluent.models.HostModelInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of Hosts. */
@Fluent
public final class HostsList {
    /*
     * Url to follow for getting next page of Hosts.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * Array of Hosts
     */
    @JsonProperty(value = "value", required = true)
    private List<HostModelInner> value;

    /**
     * Get the nextLink property: Url to follow for getting next page of Hosts.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Url to follow for getting next page of Hosts.
     *
     * @param nextLink the nextLink value to set.
     * @return the HostsList object itself.
     */
    public HostsList withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: Array of Hosts.
     *
     * @return the value value.
     */
    public List<HostModelInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Array of Hosts.
     *
     * @param value the value value to set.
     * @return the HostsList object itself.
     */
    public HostsList withValue(List<HostModelInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property value in model HostsList"));
        } else {
            value().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(HostsList.class);
}
