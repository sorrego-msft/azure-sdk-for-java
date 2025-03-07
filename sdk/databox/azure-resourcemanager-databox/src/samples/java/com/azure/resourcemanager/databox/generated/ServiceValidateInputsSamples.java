// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databox.generated;

import com.azure.resourcemanager.databox.models.AddressType;
import com.azure.resourcemanager.databox.models.CreateJobValidations;
import com.azure.resourcemanager.databox.models.CreateOrderLimitForSubscriptionValidationRequest;
import com.azure.resourcemanager.databox.models.DataImportDetails;
import com.azure.resourcemanager.databox.models.DataTransferDetailsValidationRequest;
import com.azure.resourcemanager.databox.models.Preferences;
import com.azure.resourcemanager.databox.models.PreferencesValidationRequest;
import com.azure.resourcemanager.databox.models.ShippingAddress;
import com.azure.resourcemanager.databox.models.SkuAvailabilityValidationRequest;
import com.azure.resourcemanager.databox.models.SkuName;
import com.azure.resourcemanager.databox.models.StorageAccountDetails;
import com.azure.resourcemanager.databox.models.SubscriptionIsAllowedToCreateJobValidationRequest;
import com.azure.resourcemanager.databox.models.TransferType;
import com.azure.resourcemanager.databox.models.TransportPreferences;
import com.azure.resourcemanager.databox.models.TransportShipmentTypes;
import com.azure.resourcemanager.databox.models.ValidateAddress;
import java.util.Arrays;

/** Samples for Service ValidateInputs. */
public final class ServiceValidateInputsSamples {
    /*
     * x-ms-original-file: specification/databox/resource-manager/Microsoft.DataBox/stable/2021-03-01/examples/ValidateInputs.json
     */
    /**
     * Sample code: ValidateInputs.
     *
     * @param manager Entry point to DataBoxManager.
     */
    public static void validateInputs(com.azure.resourcemanager.databox.DataBoxManager manager) {
        manager
            .services()
            .validateInputsWithResponse(
                "westus",
                new CreateJobValidations()
                    .withIndividualRequestDetails(
                        Arrays
                            .asList(
                                new DataTransferDetailsValidationRequest()
                                    .withDataImportDetails(
                                        Arrays
                                            .asList(
                                                new DataImportDetails()
                                                    .withAccountDetails(
                                                        new StorageAccountDetails()
                                                            .withStorageAccountId(
                                                                "/subscriptions/fa68082f-8ff7-4a25-95c7-ce9da541242f/resourcegroups/databoxbvt/providers/Microsoft.Storage/storageAccounts/databoxbvttestaccount"))))
                                    .withDeviceType(SkuName.DATA_BOX)
                                    .withTransferType(TransferType.IMPORT_TO_AZURE),
                                new ValidateAddress()
                                    .withShippingAddress(
                                        new ShippingAddress()
                                            .withStreetAddress1("16 TOWNSEND ST")
                                            .withStreetAddress2("Unit 1")
                                            .withCity("San Francisco")
                                            .withStateOrProvince("CA")
                                            .withCountry("US")
                                            .withPostalCode("fakeTokenPlaceholder")
                                            .withCompanyName("Microsoft")
                                            .withAddressType(AddressType.COMMERCIAL))
                                    .withDeviceType(SkuName.DATA_BOX)
                                    .withTransportPreferences(
                                        new TransportPreferences()
                                            .withPreferredShipmentType(TransportShipmentTypes.MICROSOFT_MANAGED)),
                                new SubscriptionIsAllowedToCreateJobValidationRequest(),
                                new SkuAvailabilityValidationRequest()
                                    .withDeviceType(SkuName.DATA_BOX)
                                    .withTransferType(TransferType.IMPORT_TO_AZURE)
                                    .withCountry("US")
                                    .withLocation("westus"),
                                new CreateOrderLimitForSubscriptionValidationRequest().withDeviceType(SkuName.DATA_BOX),
                                new PreferencesValidationRequest()
                                    .withPreference(
                                        new Preferences()
                                            .withTransportPreferences(
                                                new TransportPreferences()
                                                    .withPreferredShipmentType(
                                                        TransportShipmentTypes.MICROSOFT_MANAGED)))
                                    .withDeviceType(SkuName.DATA_BOX))),
                com.azure.core.util.Context.NONE);
    }
}
