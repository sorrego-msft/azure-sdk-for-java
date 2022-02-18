// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeInfoInner;
import com.azure.resourcemanager.netapp.fluent.models.SubvolumeModelInner;
import com.azure.resourcemanager.netapp.models.SubvolumePatchRequest;

/** An instance of this class provides access to all the operations defined in SubvolumesClient. */
public interface SubvolumesClient {
    /**
     * Returns a list of the subvolumes in the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Subvolumes as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubvolumeInfoInner> listByVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName);

    /**
     * Returns a list of the subvolumes in the volume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of Subvolumes as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SubvolumeInfoInner> listByVolume(
        String resourceGroupName, String accountName, String poolName, String volumeName, Context context);

    /**
     * Returns the path associated with the subvolumeName provided.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeInfoInner get(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName);

    /**
     * Returns the path associated with the subvolumeName provided.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subvolume Information properties along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SubvolumeInfoInner> getWithResponse(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context);

    /**
     * Creates a subvolume in the path or clones the subvolume mentioned in the parentPath.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubvolumeInfoInner>, SubvolumeInfoInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumeInfoInner body);

    /**
     * Creates a subvolume in the path or clones the subvolume mentioned in the parentPath.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubvolumeInfoInner>, SubvolumeInfoInner> beginCreate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumeInfoInner body,
        Context context);

    /**
     * Creates a subvolume in the path or clones the subvolume mentioned in the parentPath.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeInfoInner create(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumeInfoInner body);

    /**
     * Creates a subvolume in the path or clones the subvolume mentioned in the parentPath.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeInfoInner create(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumeInfoInner body,
        Context context);

    /**
     * Patch a subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubvolumeInfoInner>, SubvolumeInfoInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumePatchRequest body);

    /**
     * Patch a subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubvolumeInfoInner>, SubvolumeInfoInner> beginUpdate(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumePatchRequest body,
        Context context);

    /**
     * Patch a subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeInfoInner update(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumePatchRequest body);

    /**
     * Patch a subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param body Subvolume object supplied in the body of the operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return subvolume Information properties.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeInfoInner update(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        SubvolumePatchRequest body,
        Context context);

    /**
     * Delete subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName);

    /**
     * Delete subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context);

    /**
     * Delete subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName);

    /**
     * Delete subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context);

    /**
     * Get details of the specified subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of details of the specified subvolume.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubvolumeModelInner>, SubvolumeModelInner> beginGetMetadata(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName);

    /**
     * Get details of the specified subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of details of the specified subvolume.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<SubvolumeModelInner>, SubvolumeModelInner> beginGetMetadata(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context);

    /**
     * Get details of the specified subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified subvolume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeModelInner getMetadata(
        String resourceGroupName, String accountName, String poolName, String volumeName, String subvolumeName);

    /**
     * Get details of the specified subvolume.
     *
     * @param resourceGroupName The name of the resource group.
     * @param accountName The name of the NetApp account.
     * @param poolName The name of the capacity pool.
     * @param volumeName The name of the volume.
     * @param subvolumeName The name of the subvolume.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of the specified subvolume.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SubvolumeModelInner getMetadata(
        String resourceGroupName,
        String accountName,
        String poolName,
        String volumeName,
        String subvolumeName,
        Context context);
}