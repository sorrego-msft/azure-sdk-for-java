// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Properties of a rule. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = FirewallPolicyRule.class)
@JsonTypeName("FirewallPolicyRule")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "ApplicationRule", value = ApplicationRule.class),
    @JsonSubTypes.Type(name = "NatRule", value = NatRule.class),
    @JsonSubTypes.Type(name = "NetworkRule", value = NetworkRule.class)
})
@Fluent
public class FirewallPolicyRule {
    /*
     * Name of the rule.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * Description of the rule.
     */
    @JsonProperty(value = "description")
    private String description;

    /** Creates an instance of FirewallPolicyRule class. */
    public FirewallPolicyRule() {
    }

    /**
     * Get the name property: Name of the rule.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the rule.
     *
     * @param name the name value to set.
     * @return the FirewallPolicyRule object itself.
     */
    public FirewallPolicyRule withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the description property: Description of the rule.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Description of the rule.
     *
     * @param description the description value to set.
     * @return the FirewallPolicyRule object itself.
     */
    public FirewallPolicyRule withDescription(String description) {
        this.description = description;
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
