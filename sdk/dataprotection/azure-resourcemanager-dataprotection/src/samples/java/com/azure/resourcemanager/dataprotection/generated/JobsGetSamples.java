// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.Context;

/** Samples for Jobs Get. */
public final class JobsGetSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/JobCRUD/GetJob.json
     */
    /**
     * Sample code: Get Job.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void getJob(com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .jobs()
            .getWithResponse("BugBash1", "BugBashVaultForCCYv11", "3c60cb49-63e8-4b21-b9bd-26277b3fdfae", Context.NONE);
    }
}