// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Profile for enabling a user to access a managed cluster. */
@Fluent
public final class AccessProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AccessProfile.class);

    /*
     * Base64-encoded Kubernetes configuration file.
     */
    @JsonProperty(value = "kubeConfig")
    private byte[] kubeConfig;

    /**
     * Get the kubeConfig property: Base64-encoded Kubernetes configuration file.
     *
     * @return the kubeConfig value.
     */
    public byte[] kubeConfig() {
        return CoreUtils.clone(this.kubeConfig);
    }

    /**
     * Set the kubeConfig property: Base64-encoded Kubernetes configuration file.
     *
     * @param kubeConfig the kubeConfig value to set.
     * @return the AccessProfile object itself.
     */
    public AccessProfile withKubeConfig(byte[] kubeConfig) {
        this.kubeConfig = CoreUtils.clone(kubeConfig);
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