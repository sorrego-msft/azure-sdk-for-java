// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The available data types for Amazon Web Services CloudTrail data connector. */
@Fluent
public final class AwsCloudTrailDataConnectorDataTypes {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AwsCloudTrailDataConnectorDataTypes.class);

    /*
     * Logs data type.
     */
    @JsonProperty(value = "logs", required = true)
    private AwsCloudTrailDataConnectorDataTypesLogs logs;

    /**
     * Get the logs property: Logs data type.
     *
     * @return the logs value.
     */
    public AwsCloudTrailDataConnectorDataTypesLogs logs() {
        return this.logs;
    }

    /**
     * Set the logs property: Logs data type.
     *
     * @param logs the logs value to set.
     * @return the AwsCloudTrailDataConnectorDataTypes object itself.
     */
    public AwsCloudTrailDataConnectorDataTypes withLogs(AwsCloudTrailDataConnectorDataTypesLogs logs) {
        this.logs = logs;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (logs() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property logs in model AwsCloudTrailDataConnectorDataTypes"));
        } else {
            logs().validate();
        }
    }
}