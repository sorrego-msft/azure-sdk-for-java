// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.Context;

/** Samples for DomainTopics Delete. */
public final class DomainTopicsDeleteSamples {
    /*
     * x-ms-original-file: specification/eventgrid/resource-manager/Microsoft.EventGrid/stable/2022-06-15/examples/DomainTopics_Delete.json
     */
    /**
     * Sample code: DomainTopics_Delete.
     *
     * @param manager Entry point to EventGridManager.
     */
    public static void domainTopicsDelete(com.azure.resourcemanager.eventgrid.EventGridManager manager) {
        manager.domainTopics().delete("examplerg", "exampledomain1", "exampledomaintopic1", Context.NONE);
    }
}
