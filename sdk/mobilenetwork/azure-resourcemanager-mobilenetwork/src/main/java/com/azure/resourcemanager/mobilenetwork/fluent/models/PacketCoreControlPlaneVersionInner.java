// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.Platform;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Packet core control plane version resource. */
@Fluent
public final class PacketCoreControlPlaneVersionInner extends ProxyResource {
    /*
     * Packet core control plane version properties.
     */
    @JsonProperty(value = "properties", required = true)
    private PacketCoreControlPlaneVersionPropertiesFormat innerProperties =
        new PacketCoreControlPlaneVersionPropertiesFormat();

    /*
     * Azure Resource Manager metadata containing createdBy and modifiedBy information.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /** Creates an instance of PacketCoreControlPlaneVersionInner class. */
    public PacketCoreControlPlaneVersionInner() {
    }

    /**
     * Get the innerProperties property: Packet core control plane version properties.
     *
     * @return the innerProperties value.
     */
    private PacketCoreControlPlaneVersionPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the provisioningState property: The provisioning state of the packet core control plane version resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the platforms property: Platform specific packet core control plane version properties.
     *
     * @return the platforms value.
     */
    public List<Platform> platforms() {
        return this.innerProperties() == null ? null : this.innerProperties().platforms();
    }

    /**
     * Set the platforms property: Platform specific packet core control plane version properties.
     *
     * @param platforms the platforms value to set.
     * @return the PacketCoreControlPlaneVersionInner object itself.
     */
    public PacketCoreControlPlaneVersionInner withPlatforms(List<Platform> platforms) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PacketCoreControlPlaneVersionPropertiesFormat();
        }
        this.innerProperties().withPlatforms(platforms);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerProperties in model PacketCoreControlPlaneVersionInner"));
        } else {
            innerProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreControlPlaneVersionInner.class);
}
