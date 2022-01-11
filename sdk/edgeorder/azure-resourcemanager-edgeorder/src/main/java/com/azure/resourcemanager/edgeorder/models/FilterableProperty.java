// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.edgeorder.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Different types of filters supported and its values. */
@Fluent
public final class FilterableProperty {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(FilterableProperty.class);

    /*
     * Type of product filter.
     */
    @JsonProperty(value = "type", required = true)
    private SupportedFilterTypes type;

    /*
     * Values to be filtered.
     */
    @JsonProperty(value = "supportedValues", required = true)
    private List<String> supportedValues;

    /**
     * Get the type property: Type of product filter.
     *
     * @return the type value.
     */
    public SupportedFilterTypes type() {
        return this.type;
    }

    /**
     * Set the type property: Type of product filter.
     *
     * @param type the type value to set.
     * @return the FilterableProperty object itself.
     */
    public FilterableProperty withType(SupportedFilterTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get the supportedValues property: Values to be filtered.
     *
     * @return the supportedValues value.
     */
    public List<String> supportedValues() {
        return this.supportedValues;
    }

    /**
     * Set the supportedValues property: Values to be filtered.
     *
     * @param supportedValues the supportedValues value to set.
     * @return the FilterableProperty object itself.
     */
    public FilterableProperty withSupportedValues(List<String> supportedValues) {
        this.supportedValues = supportedValues;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (type() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property type in model FilterableProperty"));
        }
        if (supportedValues() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property supportedValues in model FilterableProperty"));
        }
    }
}