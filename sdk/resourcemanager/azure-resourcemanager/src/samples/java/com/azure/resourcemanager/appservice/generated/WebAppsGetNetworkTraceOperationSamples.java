// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.generated;

import com.azure.core.util.Context;

/** Samples for WebApps GetNetworkTraceOperation. */
public final class WebAppsGetNetworkTraceOperationSamples {
    /*
     * x-ms-original-file: specification/web/resource-manager/Microsoft.Web/stable/2021-03-01/examples/GetWebSiteNetworkTraceOperation.json
     */
    /**
     * Sample code: Get the current status of a network trace operation for a site.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getTheCurrentStatusOfANetworkTraceOperationForASite(
        com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .webApps()
            .manager()
            .serviceClient()
            .getWebApps()
            .getNetworkTraceOperationWithResponse(
                "testrg123", "SampleApp", "c291433b-53ad-4c49-8cae-0a293eae1c6d", Context.NONE);
    }
}