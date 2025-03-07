// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dynatrace.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.dynatrace.fluent.models.DynatraceSingleSignOnProperties;
import com.azure.resourcemanager.dynatrace.models.AccountInfo;
import com.azure.resourcemanager.dynatrace.models.DynatraceEnvironmentProperties;
import com.azure.resourcemanager.dynatrace.models.EnvironmentInfo;
import com.azure.resourcemanager.dynatrace.models.MarketplaceSubscriptionStatus;
import com.azure.resourcemanager.dynatrace.models.MonitorResource;
import com.azure.resourcemanager.dynatrace.models.MonitoringStatus;
import com.azure.resourcemanager.dynatrace.models.PlanData;
import com.azure.resourcemanager.dynatrace.models.UserInfo;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Samples for Monitors Update. */
public final class MonitorsUpdateSamples {
    /*
     * x-ms-original-file: specification/dynatrace/resource-manager/Dynatrace.Observability/stable/2021-09-01/examples/Monitors_Update_MinimumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Update_MinimumSet_Gen.
     *
     * @param manager Entry point to DynatraceManager.
     */
    public static void monitorsUpdateMinimumSetGen(com.azure.resourcemanager.dynatrace.DynatraceManager manager) {
        MonitorResource resource =
            manager.monitors().getByResourceGroupWithResponse("myResourceGroup", "myMonitor", Context.NONE).getValue();
        resource.update().apply();
    }

    /*
     * x-ms-original-file: specification/dynatrace/resource-manager/Dynatrace.Observability/stable/2021-09-01/examples/Monitors_Update_MaximumSet_Gen.json
     */
    /**
     * Sample code: Monitors_Update_MaximumSet_Gen.
     *
     * @param manager Entry point to DynatraceManager.
     */
    public static void monitorsUpdateMaximumSetGen(com.azure.resourcemanager.dynatrace.DynatraceManager manager) {
        MonitorResource resource =
            manager.monitors().getByResourceGroupWithResponse("myResourceGroup", "myMonitor", Context.NONE).getValue();
        resource
            .update()
            .withTags(mapOf("Environment", "Dev"))
            .withMonitoringStatus(MonitoringStatus.ENABLED)
            .withMarketplaceSubscriptionStatus(MarketplaceSubscriptionStatus.ACTIVE)
            .withDynatraceEnvironmentProperties(
                new DynatraceEnvironmentProperties()
                    .withAccountInfo(new AccountInfo())
                    .withEnvironmentInfo(new EnvironmentInfo())
                    .withSingleSignOnProperties(new DynatraceSingleSignOnProperties()))
            .withUserInfo(
                new UserInfo()
                    .withFirstName("Alice")
                    .withLastName("Bobab")
                    .withEmailAddress("alice@microsoft.com")
                    .withPhoneNumber("123456")
                    .withCountry("westus2"))
            .withPlanData(
                new PlanData()
                    .withUsageType("Committed")
                    .withBillingCycle("Monthly")
                    .withPlanDetails("dynatraceapitestplan")
                    .withEffectiveDate(OffsetDateTime.parse("2019-08-30T15:14:33+02:00")))
            .apply();
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
