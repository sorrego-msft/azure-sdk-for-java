// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.fluent.models.ScopeMapPropertiesUpdateParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The properties for updating the scope map. */
@Fluent
public final class ScopeMapUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ScopeMapUpdateParameters.class);

    /*
     * The update parameters for scope map properties.
     */
    @JsonProperty(value = "properties")
    private ScopeMapPropertiesUpdateParameters innerProperties;

    /**
     * Get the innerProperties property: The update parameters for scope map properties.
     *
     * @return the innerProperties value.
     */
    private ScopeMapPropertiesUpdateParameters innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the description property: The user friendly description of the scope map.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The user friendly description of the scope map.
     *
     * @param description the description value to set.
     * @return the ScopeMapUpdateParameters object itself.
     */
    public ScopeMapUpdateParameters withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeMapPropertiesUpdateParameters();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the actions property: The list of scope permissions for registry artifacts. E.g.
     * repositories/repository-name/pull, repositories/repository-name/delete.
     *
     * @return the actions value.
     */
    public List<String> actions() {
        return this.innerProperties() == null ? null : this.innerProperties().actions();
    }

    /**
     * Set the actions property: The list of scope permissions for registry artifacts. E.g.
     * repositories/repository-name/pull, repositories/repository-name/delete.
     *
     * @param actions the actions value to set.
     * @return the ScopeMapUpdateParameters object itself.
     */
    public ScopeMapUpdateParameters withActions(List<String> actions) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ScopeMapPropertiesUpdateParameters();
        }
        this.innerProperties().withActions(actions);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}