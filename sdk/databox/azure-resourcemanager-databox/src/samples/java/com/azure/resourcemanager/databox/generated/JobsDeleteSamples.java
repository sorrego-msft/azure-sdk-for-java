// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

/** Samples for Jobs Delete. */
public final class JobsDeleteSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/JobsDelete.json
     */
    /**
     * Sample code: JobsDelete.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void jobsDelete(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager.jobs().delete("SdkRg5154", "SdkJob952", com.azure.core.util.Context.NONE);
    }
}
