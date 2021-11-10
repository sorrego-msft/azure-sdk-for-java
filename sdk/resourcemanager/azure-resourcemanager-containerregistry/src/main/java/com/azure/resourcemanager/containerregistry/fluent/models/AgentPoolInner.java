// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.containerregistry.models.OS;
import com.azure.resourcemanager.containerregistry.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * The agentpool that has the ARM resource and properties. The agentpool will have all information to create an agent
 * pool.
 */
@Fluent
public final class AgentPoolInner extends Resource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AgentPoolInner.class);

    /*
     * The properties associated with the agent pool
     */
    @JsonProperty(value = "properties")
    private AgentPoolProperties innerProperties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: The properties associated with the agent pool.
     *
     * @return the innerProperties value.
     */
    private AgentPoolProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AgentPoolInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the count property: The count of agent machine.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.innerProperties() == null ? null : this.innerProperties().count();
    }

    /**
     * Set the count property: The count of agent machine.
     *
     * @param count the count value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withCount(Integer count) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withCount(count);
        return this;
    }

    /**
     * Get the tier property: The Tier of agent machine.
     *
     * @return the tier value.
     */
    public String tier() {
        return this.innerProperties() == null ? null : this.innerProperties().tier();
    }

    /**
     * Set the tier property: The Tier of agent machine.
     *
     * @param tier the tier value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withTier(String tier) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withTier(tier);
        return this;
    }

    /**
     * Get the os property: The OS of agent machine.
     *
     * @return the os value.
     */
    public OS os() {
        return this.innerProperties() == null ? null : this.innerProperties().os();
    }

    /**
     * Set the os property: The OS of agent machine.
     *
     * @param os the os value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withOs(OS os) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withOs(os);
        return this;
    }

    /**
     * Get the virtualNetworkSubnetResourceId property: The Virtual Network Subnet Resource Id of the agent machine.
     *
     * @return the virtualNetworkSubnetResourceId value.
     */
    public String virtualNetworkSubnetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkSubnetResourceId();
    }

    /**
     * Set the virtualNetworkSubnetResourceId property: The Virtual Network Subnet Resource Id of the agent machine.
     *
     * @param virtualNetworkSubnetResourceId the virtualNetworkSubnetResourceId value to set.
     * @return the AgentPoolInner object itself.
     */
    public AgentPoolInner withVirtualNetworkSubnetResourceId(String virtualNetworkSubnetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new AgentPoolProperties();
        }
        this.innerProperties().withVirtualNetworkSubnetResourceId(virtualNetworkSubnetResourceId);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of this agent pool.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
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