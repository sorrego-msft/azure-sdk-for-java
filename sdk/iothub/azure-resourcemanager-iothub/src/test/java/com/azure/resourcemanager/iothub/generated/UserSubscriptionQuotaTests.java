// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.iothub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.iothub.models.Name;
import com.azure.resourcemanager.iothub.models.UserSubscriptionQuota;
import org.junit.jupiter.api.Assertions;

public final class UserSubscriptionQuotaTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UserSubscriptionQuota model =
            BinaryData
                .fromString(
                    "{\"id\":\"lp\",\"type\":\"gdtpnapnyiro\",\"unit\":\"hpigv\",\"currentValue\":2000011197,\"limit\":1573909011,\"name\":{\"value\":\"itxmedjvcslynqww\",\"localizedValue\":\"wzz\"}}")
                .toObject(UserSubscriptionQuota.class);
        Assertions.assertEquals("lp", model.id());
        Assertions.assertEquals("gdtpnapnyiro", model.type());
        Assertions.assertEquals("hpigv", model.unit());
        Assertions.assertEquals(2000011197, model.currentValue());
        Assertions.assertEquals(1573909011, model.limit());
        Assertions.assertEquals("itxmedjvcslynqww", model.name().value());
        Assertions.assertEquals("wzz", model.name().localizedValue());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UserSubscriptionQuota model =
            new UserSubscriptionQuota()
                .withId("lp")
                .withType("gdtpnapnyiro")
                .withUnit("hpigv")
                .withCurrentValue(2000011197)
                .withLimit(1573909011)
                .withName(new Name().withValue("itxmedjvcslynqww").withLocalizedValue("wzz"));
        model = BinaryData.fromObject(model).toObject(UserSubscriptionQuota.class);
        Assertions.assertEquals("lp", model.id());
        Assertions.assertEquals("gdtpnapnyiro", model.type());
        Assertions.assertEquals("hpigv", model.unit());
        Assertions.assertEquals(2000011197, model.currentValue());
        Assertions.assertEquals(1573909011, model.limit());
        Assertions.assertEquals("itxmedjvcslynqww", model.name().value());
        Assertions.assertEquals("wzz", model.name().localizedValue());
    }
}
