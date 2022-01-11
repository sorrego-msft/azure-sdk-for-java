// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.Context;

/** Samples for Transformations Get. */
public final class TransformationsGetSamples {
    /*
     * x-ms-original-file: specification/streamanalytics/resource-manager/Microsoft.StreamAnalytics/stable/2020-03-01/examples/Transformation_Get.json
     */
    /**
     * Sample code: Get a transformation.
     *
     * @param manager Entry point to StreamAnalyticsManager.
     */
    public static void getATransformation(com.azure.resourcemanager.streamanalytics.StreamAnalyticsManager manager) {
        manager.transformations().getWithResponse("sjrg4423", "sj8374", "transformation952", Context.NONE);
    }
}