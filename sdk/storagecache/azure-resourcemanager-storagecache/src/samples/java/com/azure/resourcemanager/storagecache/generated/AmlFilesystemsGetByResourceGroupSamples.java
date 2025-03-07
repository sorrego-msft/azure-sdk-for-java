// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

/** Samples for AmlFilesystems GetByResourceGroup. */
public final class AmlFilesystemsGetByResourceGroupSamples {
    /*
     * x-ms-original-file: specification/storagecache/resource-manager/Microsoft.StorageCache/preview/2023-03-01-preview/examples/amlFilesystems_Get.json
     */
    /**
     * Sample code: amlFilesystems_Get.
     *
     * @param manager Entry point to StorageCacheManager.
     */
    public static void amlFilesystemsGet(com.azure.resourcemanager.storagecache.StorageCacheManager manager) {
        manager.amlFilesystems().getByResourceGroupWithResponse("scgroup", "fs1", com.azure.core.util.Context.NONE);
    }
}
