// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.cognitiveservices.fluent.CommitmentPlansClient;
import com.azure.resourcemanager.cognitiveservices.fluent.models.CommitmentPlanInner;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlan;
import com.azure.resourcemanager.cognitiveservices.models.CommitmentPlans;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class CommitmentPlansImpl implements CommitmentPlans {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(CommitmentPlansImpl.class);

    private final CommitmentPlansClient innerClient;

    private final com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager;

    public CommitmentPlansImpl(
        CommitmentPlansClient innerClient,
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<CommitmentPlan> list(String resourceGroupName, String accountName) {
        PagedIterable<CommitmentPlanInner> inner = this.serviceClient().list(resourceGroupName, accountName);
        return Utils.mapPage(inner, inner1 -> new CommitmentPlanImpl(inner1, this.manager()));
    }

    public PagedIterable<CommitmentPlan> list(String resourceGroupName, String accountName, Context context) {
        PagedIterable<CommitmentPlanInner> inner = this.serviceClient().list(resourceGroupName, accountName, context);
        return Utils.mapPage(inner, inner1 -> new CommitmentPlanImpl(inner1, this.manager()));
    }

    public CommitmentPlan get(String resourceGroupName, String accountName, String commitmentPlanName) {
        CommitmentPlanInner inner = this.serviceClient().get(resourceGroupName, accountName, commitmentPlanName);
        if (inner != null) {
            return new CommitmentPlanImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<CommitmentPlan> getWithResponse(
        String resourceGroupName, String accountName, String commitmentPlanName, Context context) {
        Response<CommitmentPlanInner> inner =
            this.serviceClient().getWithResponse(resourceGroupName, accountName, commitmentPlanName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new CommitmentPlanImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String accountName, String commitmentPlanName) {
        this.serviceClient().delete(resourceGroupName, accountName, commitmentPlanName);
    }

    public void delete(String resourceGroupName, String accountName, String commitmentPlanName, Context context) {
        this.serviceClient().delete(resourceGroupName, accountName, commitmentPlanName, context);
    }

    public CommitmentPlan getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String commitmentPlanName = Utils.getValueFromIdByName(id, "commitmentPlans");
        if (commitmentPlanName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'commitmentPlans'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, commitmentPlanName, Context.NONE).getValue();
    }

    public Response<CommitmentPlan> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String commitmentPlanName = Utils.getValueFromIdByName(id, "commitmentPlans");
        if (commitmentPlanName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'commitmentPlans'.", id)));
        }
        return this.getWithResponse(resourceGroupName, accountName, commitmentPlanName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String commitmentPlanName = Utils.getValueFromIdByName(id, "commitmentPlans");
        if (commitmentPlanName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'commitmentPlans'.", id)));
        }
        this.delete(resourceGroupName, accountName, commitmentPlanName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String accountName = Utils.getValueFromIdByName(id, "accounts");
        if (accountName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'accounts'.", id)));
        }
        String commitmentPlanName = Utils.getValueFromIdByName(id, "commitmentPlans");
        if (commitmentPlanName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'commitmentPlans'.", id)));
        }
        this.delete(resourceGroupName, accountName, commitmentPlanName, context);
    }

    private CommitmentPlansClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager() {
        return this.serviceManager;
    }

    public CommitmentPlanImpl define(String name) {
        return new CommitmentPlanImpl(name, this.manager());
    }
}