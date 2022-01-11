// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.util.Context;

/** Samples for ExportConfigurations List. */
public final class ExportConfigurationsListSamples {
    /*
     * x-ms-original-file: specification/applicationinsights/resource-manager/Microsoft.Insights/stable/2015-05-01/examples/ExportConfigurationsList.json
     */
    /**
     * Sample code: ExportConfigurationsList.
     *
     * @param manager Entry point to ApplicationInsightsManager.
     */
    public static void exportConfigurationsList(
        com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager manager) {
        manager.exportConfigurations().listWithResponse("my-resource-group", "my-component", Context.NONE);
    }
}