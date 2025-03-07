// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Sim. */
public interface Sim {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the authenticationKey property: The Ki value for the SIM.
     *
     * @return the authenticationKey value.
     */
    String authenticationKey();

    /**
     * Gets the operatorKeyCode property: The Opc value for the SIM.
     *
     * @return the operatorKeyCode value.
     */
    String operatorKeyCode();

    /**
     * Gets the provisioningState property: The provisioning state of the SIM resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the simState property: The state of the SIM resource.
     *
     * @return the simState value.
     */
    SimState simState();

    /**
     * Gets the siteProvisioningState property: A dictionary of sites to the provisioning state of this SIM on that
     * site.
     *
     * @return the siteProvisioningState value.
     */
    Map<String, SiteProvisioningState> siteProvisioningState();

    /**
     * Gets the internationalMobileSubscriberIdentity property: The international mobile subscriber identity (IMSI) for
     * the SIM.
     *
     * @return the internationalMobileSubscriberIdentity value.
     */
    String internationalMobileSubscriberIdentity();

    /**
     * Gets the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the SIM.
     *
     * @return the integratedCircuitCardIdentifier value.
     */
    String integratedCircuitCardIdentifier();

    /**
     * Gets the deviceType property: An optional free-form text field that can be used to record the device type this
     * SIM is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered based
     * on this value.
     *
     * @return the deviceType value.
     */
    String deviceType();

    /**
     * Gets the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same location as the
     * SIM.
     *
     * @return the simPolicy value.
     */
    SimPolicyResourceId simPolicy();

    /**
     * Gets the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each address is
     * assigned at a defined network scope, made up of {attached data network, slice}.
     *
     * @return the staticIpConfiguration value.
     */
    List<SimStaticIpProperties> staticIpConfiguration();

    /**
     * Gets the vendorName property: The name of the SIM vendor who provided this SIM, if any.
     *
     * @return the vendorName value.
     */
    String vendorName();

    /**
     * Gets the vendorKeyFingerprint property: The public key fingerprint of the SIM vendor who provided this SIM, if
     * any.
     *
     * @return the vendorKeyFingerprint value.
     */
    String vendorKeyFingerprint();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.mobilenetwork.fluent.models.SimInner object.
     *
     * @return the inner object.
     */
    SimInner innerModel();

    /** The entirety of the Sim definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithParentResource,
            DefinitionStages.WithInternationalMobileSubscriberIdentity,
            DefinitionStages.WithCreate {
    }
    /** The Sim definition stages. */
    interface DefinitionStages {
        /** The first stage of the Sim definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Sim definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, simGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param simGroupName The name of the SIM Group.
             * @return the next definition stage.
             */
            WithInternationalMobileSubscriberIdentity withExistingSimGroup(
                String resourceGroupName, String simGroupName);
        }
        /** The stage of the Sim definition allowing to specify internationalMobileSubscriberIdentity. */
        interface WithInternationalMobileSubscriberIdentity {
            /**
             * Specifies the internationalMobileSubscriberIdentity property: The international mobile subscriber
             * identity (IMSI) for the SIM..
             *
             * @param internationalMobileSubscriberIdentity The international mobile subscriber identity (IMSI) for the
             *     SIM.
             * @return the next definition stage.
             */
            WithCreate withInternationalMobileSubscriberIdentity(String internationalMobileSubscriberIdentity);
        }
        /**
         * The stage of the Sim definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithAuthenticationKey,
                DefinitionStages.WithOperatorKeyCode,
                DefinitionStages.WithIntegratedCircuitCardIdentifier,
                DefinitionStages.WithDeviceType,
                DefinitionStages.WithSimPolicy,
                DefinitionStages.WithStaticIpConfiguration {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Sim create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Sim create(Context context);
        }
        /** The stage of the Sim definition allowing to specify authenticationKey. */
        interface WithAuthenticationKey {
            /**
             * Specifies the authenticationKey property: The Ki value for the SIM..
             *
             * @param authenticationKey The Ki value for the SIM.
             * @return the next definition stage.
             */
            WithCreate withAuthenticationKey(String authenticationKey);
        }
        /** The stage of the Sim definition allowing to specify operatorKeyCode. */
        interface WithOperatorKeyCode {
            /**
             * Specifies the operatorKeyCode property: The Opc value for the SIM..
             *
             * @param operatorKeyCode The Opc value for the SIM.
             * @return the next definition stage.
             */
            WithCreate withOperatorKeyCode(String operatorKeyCode);
        }
        /** The stage of the Sim definition allowing to specify integratedCircuitCardIdentifier. */
        interface WithIntegratedCircuitCardIdentifier {
            /**
             * Specifies the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the
             * SIM..
             *
             * @param integratedCircuitCardIdentifier The integrated circuit card ID (ICCID) for the SIM.
             * @return the next definition stage.
             */
            WithCreate withIntegratedCircuitCardIdentifier(String integratedCircuitCardIdentifier);
        }
        /** The stage of the Sim definition allowing to specify deviceType. */
        interface WithDeviceType {
            /**
             * Specifies the deviceType property: An optional free-form text field that can be used to record the device
             * type this SIM is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped
             * and filtered based on this value..
             *
             * @param deviceType An optional free-form text field that can be used to record the device type this SIM is
             *     associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered
             *     based on this value.
             * @return the next definition stage.
             */
            WithCreate withDeviceType(String deviceType);
        }
        /** The stage of the Sim definition allowing to specify simPolicy. */
        interface WithSimPolicy {
            /**
             * Specifies the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same
             * location as the SIM..
             *
             * @param simPolicy The SIM policy used by this SIM. The SIM policy must be in the same location as the SIM.
             * @return the next definition stage.
             */
            WithCreate withSimPolicy(SimPolicyResourceId simPolicy);
        }
        /** The stage of the Sim definition allowing to specify staticIpConfiguration. */
        interface WithStaticIpConfiguration {
            /**
             * Specifies the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each
             * address is assigned at a defined network scope, made up of {attached data network, slice}..
             *
             * @param staticIpConfiguration A list of static IP addresses assigned to this SIM. Each address is assigned
             *     at a defined network scope, made up of {attached data network, slice}.
             * @return the next definition stage.
             */
            WithCreate withStaticIpConfiguration(List<SimStaticIpProperties> staticIpConfiguration);
        }
    }
    /**
     * Begins update for the Sim resource.
     *
     * @return the stage of resource update.
     */
    Sim.Update update();

    /** The template for Sim update. */
    interface Update
        extends UpdateStages.WithAuthenticationKey,
            UpdateStages.WithOperatorKeyCode,
            UpdateStages.WithIntegratedCircuitCardIdentifier,
            UpdateStages.WithDeviceType,
            UpdateStages.WithSimPolicy,
            UpdateStages.WithStaticIpConfiguration {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Sim apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Sim apply(Context context);
    }
    /** The Sim update stages. */
    interface UpdateStages {
        /** The stage of the Sim update allowing to specify authenticationKey. */
        interface WithAuthenticationKey {
            /**
             * Specifies the authenticationKey property: The Ki value for the SIM..
             *
             * @param authenticationKey The Ki value for the SIM.
             * @return the next definition stage.
             */
            Update withAuthenticationKey(String authenticationKey);
        }
        /** The stage of the Sim update allowing to specify operatorKeyCode. */
        interface WithOperatorKeyCode {
            /**
             * Specifies the operatorKeyCode property: The Opc value for the SIM..
             *
             * @param operatorKeyCode The Opc value for the SIM.
             * @return the next definition stage.
             */
            Update withOperatorKeyCode(String operatorKeyCode);
        }
        /** The stage of the Sim update allowing to specify integratedCircuitCardIdentifier. */
        interface WithIntegratedCircuitCardIdentifier {
            /**
             * Specifies the integratedCircuitCardIdentifier property: The integrated circuit card ID (ICCID) for the
             * SIM..
             *
             * @param integratedCircuitCardIdentifier The integrated circuit card ID (ICCID) for the SIM.
             * @return the next definition stage.
             */
            Update withIntegratedCircuitCardIdentifier(String integratedCircuitCardIdentifier);
        }
        /** The stage of the Sim update allowing to specify deviceType. */
        interface WithDeviceType {
            /**
             * Specifies the deviceType property: An optional free-form text field that can be used to record the device
             * type this SIM is associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped
             * and filtered based on this value..
             *
             * @param deviceType An optional free-form text field that can be used to record the device type this SIM is
             *     associated with, for example 'Video camera'. The Azure portal allows SIMs to be grouped and filtered
             *     based on this value.
             * @return the next definition stage.
             */
            Update withDeviceType(String deviceType);
        }
        /** The stage of the Sim update allowing to specify simPolicy. */
        interface WithSimPolicy {
            /**
             * Specifies the simPolicy property: The SIM policy used by this SIM. The SIM policy must be in the same
             * location as the SIM..
             *
             * @param simPolicy The SIM policy used by this SIM. The SIM policy must be in the same location as the SIM.
             * @return the next definition stage.
             */
            Update withSimPolicy(SimPolicyResourceId simPolicy);
        }
        /** The stage of the Sim update allowing to specify staticIpConfiguration. */
        interface WithStaticIpConfiguration {
            /**
             * Specifies the staticIpConfiguration property: A list of static IP addresses assigned to this SIM. Each
             * address is assigned at a defined network scope, made up of {attached data network, slice}..
             *
             * @param staticIpConfiguration A list of static IP addresses assigned to this SIM. Each address is assigned
             *     at a defined network scope, made up of {attached data network, slice}.
             * @return the next definition stage.
             */
            Update withStaticIpConfiguration(List<SimStaticIpProperties> staticIpConfiguration);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Sim refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Sim refresh(Context context);
}
