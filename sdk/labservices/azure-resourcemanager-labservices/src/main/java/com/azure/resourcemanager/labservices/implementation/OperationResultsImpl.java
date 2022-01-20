// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.labservices.implementation;

import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.labservices.fluent.OperationResultsClient;
import com.azure.resourcemanager.labservices.fluent.models.OperationResultInner;
import com.azure.resourcemanager.labservices.models.OperationResult;
import com.azure.resourcemanager.labservices.models.OperationResults;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class OperationResultsImpl implements OperationResults {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationResultsImpl.class);

    private final OperationResultsClient innerClient;

    private final com.azure.resourcemanager.labservices.LabServicesManager serviceManager;

    public OperationResultsImpl(
        OperationResultsClient innerClient, com.azure.resourcemanager.labservices.LabServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public OperationResult get(String operationResultId) {
        OperationResultInner inner = this.serviceClient().get(operationResultId);
        if (inner != null) {
            return new OperationResultImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OperationResult> getWithResponse(String operationResultId, Context context) {
        Response<OperationResultInner> inner = this.serviceClient().getWithResponse(operationResultId, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OperationResultImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    private OperationResultsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.labservices.LabServicesManager manager() {
        return this.serviceManager;
    }
}