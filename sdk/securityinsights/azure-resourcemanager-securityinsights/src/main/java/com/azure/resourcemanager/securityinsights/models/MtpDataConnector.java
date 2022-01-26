// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.fluent.models.DataConnectorInner;
import com.azure.resourcemanager.securityinsights.fluent.models.MtpDataConnectorProperties;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Represents MTP (Microsoft Threat Protection) data connector. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("MicrosoftThreatProtection")
@Fluent
public final class MtpDataConnector extends DataConnectorInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(MtpDataConnector.class);

    /*
     * MTP (Microsoft Threat Protection) data connector properties.
     */
    @JsonProperty(value = "properties")
    private MtpDataConnectorProperties innerProperties;

    /**
     * Get the innerProperties property: MTP (Microsoft Threat Protection) data connector properties.
     *
     * @return the innerProperties value.
     */
    private MtpDataConnectorProperties innerProperties() {
        return this.innerProperties;
    }

    /** {@inheritDoc} */
    @Override
    public MtpDataConnector withEtag(String etag) {
        super.withEtag(etag);
        return this;
    }

    /**
     * Get the dataTypes property: The available data types for the connector.
     *
     * @return the dataTypes value.
     */
    public MtpDataConnectorDataTypes dataTypes() {
        return this.innerProperties() == null ? null : this.innerProperties().dataTypes();
    }

    /**
     * Set the dataTypes property: The available data types for the connector.
     *
     * @param dataTypes the dataTypes value to set.
     * @return the MtpDataConnector object itself.
     */
    public MtpDataConnector withDataTypes(MtpDataConnectorDataTypes dataTypes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MtpDataConnectorProperties();
        }
        this.innerProperties().withDataTypes(dataTypes);
        return this;
    }

    /**
     * Get the tenantId property: The tenant id to connect to, and get the data from.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.innerProperties() == null ? null : this.innerProperties().tenantId();
    }

    /**
     * Set the tenantId property: The tenant id to connect to, and get the data from.
     *
     * @param tenantId the tenantId value to set.
     * @return the MtpDataConnector object itself.
     */
    public MtpDataConnector withTenantId(String tenantId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new MtpDataConnectorProperties();
        }
        this.innerProperties().withTenantId(tenantId);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}