// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.compute.fluent.models.PrivateEndpointConnectionInner;
import com.azure.resourcemanager.compute.models.PrivateEndpointServiceConnectionStatus;
import com.azure.resourcemanager.compute.models.PrivateLinkServiceConnectionState;

/** Samples for DiskAccesses UpdateAPrivateEndpointConnection. */
public final class DiskAccessesUpdateAPrivateEndpointConnectionSamples {
    /*
     * x-ms-original-file: specification/compute/resource-manager/Microsoft.Compute/stable/2021-04-01/examples/ApprovePrivateEndpointConnection.json
     */
    /**
     * Sample code: Approve a Private Endpoint Connection under a disk access resource.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void approveAPrivateEndpointConnectionUnderADiskAccessResource(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .virtualMachines()
            .manager()
            .serviceClient()
            .getDiskAccesses()
            .updateAPrivateEndpointConnection(
                "myResourceGroup",
                "myDiskAccess",
                "myPrivateEndpointConnection",
                new PrivateEndpointConnectionInner()
                    .withPrivateLinkServiceConnectionState(
                        new PrivateLinkServiceConnectionState()
                            .withStatus(PrivateEndpointServiceConnectionStatus.APPROVED)
                            .withDescription("Approving myPrivateEndpointConnection")),
                Context.NONE);
    }
}