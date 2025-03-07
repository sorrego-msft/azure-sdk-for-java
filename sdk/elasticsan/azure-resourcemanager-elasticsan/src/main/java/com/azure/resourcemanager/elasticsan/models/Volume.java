// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.models;

import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner;
import java.util.Map;

/** An immutable client-side representation of Volume. */
public interface Volume {
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
     * Gets the systemData property: Resource metadata required by ARM RPC.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the tags property: Azure resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the volumeId property: Unique Id of the volume in GUID format.
     *
     * @return the volumeId value.
     */
    String volumeId();

    /**
     * Gets the creationData property: State of the operation on the resource.
     *
     * @return the creationData value.
     */
    SourceCreationData creationData();

    /**
     * Gets the sizeGiB property: Volume size.
     *
     * @return the sizeGiB value.
     */
    Long sizeGiB();

    /**
     * Gets the storageTarget property: Storage target information.
     *
     * @return the storageTarget value.
     */
    IscsiTargetInfo storageTarget();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner object.
     *
     * @return the inner object.
     */
    VolumeInner innerModel();

    /** The entirety of the Volume definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The Volume definition stages. */
    interface DefinitionStages {
        /** The first stage of the Volume definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the Volume definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, elasticSanName, volumeGroupName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param elasticSanName The name of the ElasticSan.
             * @param volumeGroupName The name of the VolumeGroup.
             * @return the next definition stage.
             */
            WithCreate withExistingVolumegroup(String resourceGroupName, String elasticSanName, String volumeGroupName);
        }
        /**
         * The stage of the Volume definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithCreationData, DefinitionStages.WithSizeGiB {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Volume create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Volume create(Context context);
        }
        /** The stage of the Volume definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Azure resource tags..
             *
             * @param tags Azure resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Volume definition allowing to specify creationData. */
        interface WithCreationData {
            /**
             * Specifies the creationData property: State of the operation on the resource..
             *
             * @param creationData State of the operation on the resource.
             * @return the next definition stage.
             */
            WithCreate withCreationData(SourceCreationData creationData);
        }
        /** The stage of the Volume definition allowing to specify sizeGiB. */
        interface WithSizeGiB {
            /**
             * Specifies the sizeGiB property: Volume size..
             *
             * @param sizeGiB Volume size.
             * @return the next definition stage.
             */
            WithCreate withSizeGiB(Long sizeGiB);
        }
    }
    /**
     * Begins update for the Volume resource.
     *
     * @return the stage of resource update.
     */
    Volume.Update update();

    /** The template for Volume update. */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithSizeGiB {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Volume apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Volume apply(Context context);
    }
    /** The Volume update stages. */
    interface UpdateStages {
        /** The stage of the Volume update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Volume update allowing to specify sizeGiB. */
        interface WithSizeGiB {
            /**
             * Specifies the sizeGiB property: Volume size..
             *
             * @param sizeGiB Volume size.
             * @return the next definition stage.
             */
            Update withSizeGiB(Long sizeGiB);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Volume refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Volume refresh(Context context);
}
