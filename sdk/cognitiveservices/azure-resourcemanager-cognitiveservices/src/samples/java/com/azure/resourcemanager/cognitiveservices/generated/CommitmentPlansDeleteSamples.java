// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cognitiveservices.generated;

import com.azure.core.util.Context;

/** Samples for CommitmentPlans Delete. */
public final class CommitmentPlansDeleteSamples {
    /*
     * x-ms-original-file: specification/cognitiveservices/resource-manager/Microsoft.CognitiveServices/stable/2021-10-01/examples/DeleteCommitmentPlan.json
     */
    /**
     * Sample code: DeleteCommitmentPlan.
     *
     * @param manager Entry point to CognitiveServicesManager.
     */
    public static void deleteCommitmentPlan(
        com.azure.resourcemanager.cognitiveservices.CognitiveServicesManager manager) {
        manager.commitmentPlans().delete("resourceGroupName", "accountName", "commitmentPlanName", Context.NONE);
    }
}