// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.models.ClientCredentialMethod;
import com.azure.resourcemanager.appcontainers.models.OpenIdConnectClientCredential;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OpenIdConnectClientCredentialTests {
    @Test
    public void testDeserialize() {
        OpenIdConnectClientCredential model =
            BinaryData
                .fromString("{\"method\":\"ClientSecretPost\",\"clientSecretSettingName\":\"tzxdpnqbqqwx\"}")
                .toObject(OpenIdConnectClientCredential.class);
        Assertions.assertEquals(ClientCredentialMethod.CLIENT_SECRET_POST, model.method());
        Assertions.assertEquals("tzxdpnqbqqwx", model.clientSecretSettingName());
    }

    @Test
    public void testSerialize() {
        OpenIdConnectClientCredential model =
            new OpenIdConnectClientCredential()
                .withMethod(ClientCredentialMethod.CLIENT_SECRET_POST)
                .withClientSecretSettingName("tzxdpnqbqqwx");
        model = BinaryData.fromObject(model).toObject(OpenIdConnectClientCredential.class);
        Assertions.assertEquals(ClientCredentialMethod.CLIENT_SECRET_POST, model.method());
        Assertions.assertEquals("tzxdpnqbqqwx", model.clientSecretSettingName());
    }
}
