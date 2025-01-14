// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.containerregistry.fluent.models.TokenInner;
import com.azure.resourcemanager.containerregistry.models.TokenUpdateParameters;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TokensClient. */
public interface TokensClient {
    /**
     * Lists all the tokens for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list tokens for a container registry as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<TokenInner> listAsync(String resourceGroupName, String registryName);

    /**
     * Lists all the tokens for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list tokens for a container registry as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TokenInner> list(String resourceGroupName, String registryName);

    /**
     * Lists all the tokens for the specified container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the result of a request to list tokens for a container registry as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TokenInner> list(String resourceGroupName, String registryName, Context context);

    /**
     * Gets the properties of the specified token.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified token along with {@link Response} on successful completion of {@link
     *     Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<TokenInner>> getWithResponseAsync(String resourceGroupName, String registryName, String tokenName);

    /**
     * Gets the properties of the specified token.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified token on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TokenInner> getAsync(String resourceGroupName, String registryName, String tokenName);

    /**
     * Gets the properties of the specified token.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified token along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TokenInner> getWithResponse(
        String resourceGroupName, String registryName, String tokenName, Context context);

    /**
     * Gets the properties of the specified token.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the properties of the specified token.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TokenInner get(String resourceGroupName, String registryName, String tokenName);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createWithResponseAsync(
        String resourceGroupName, String registryName, String tokenName, TokenInner tokenCreateParameters);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<TokenInner>, TokenInner> beginCreateAsync(
        String resourceGroupName, String registryName, String tokenName, TokenInner tokenCreateParameters);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TokenInner>, TokenInner> beginCreate(
        String resourceGroupName, String registryName, String tokenName, TokenInner tokenCreateParameters);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TokenInner>, TokenInner> beginCreate(
        String resourceGroupName,
        String registryName,
        String tokenName,
        TokenInner tokenCreateParameters,
        Context context);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TokenInner> createAsync(
        String resourceGroupName, String registryName, String tokenName, TokenInner tokenCreateParameters);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TokenInner create(
        String resourceGroupName, String registryName, String tokenName, TokenInner tokenCreateParameters);

    /**
     * Creates a token for a container registry with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenCreateParameters The parameters for creating a token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TokenInner create(
        String resourceGroupName,
        String registryName,
        String tokenName,
        TokenInner tokenCreateParameters,
        Context context);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String registryName, String tokenName);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String registryName, String tokenName);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String registryName, String tokenName);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String registryName, String tokenName, Context context);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String registryName, String tokenName);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String tokenName);

    /**
     * Deletes a token from a container registry.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String registryName, String tokenName, Context context);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry along with {@link Response} on successful
     *     completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateWithResponseAsync(
        String resourceGroupName, String registryName, String tokenName, TokenUpdateParameters tokenUpdateParameters);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<TokenInner>, TokenInner> beginUpdateAsync(
        String resourceGroupName, String registryName, String tokenName, TokenUpdateParameters tokenUpdateParameters);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TokenInner>, TokenInner> beginUpdate(
        String resourceGroupName, String registryName, String tokenName, TokenUpdateParameters tokenUpdateParameters);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<TokenInner>, TokenInner> beginUpdate(
        String resourceGroupName,
        String registryName,
        String tokenName,
        TokenUpdateParameters tokenUpdateParameters,
        Context context);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TokenInner> updateAsync(
        String resourceGroupName, String registryName, String tokenName, TokenUpdateParameters tokenUpdateParameters);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TokenInner update(
        String resourceGroupName, String registryName, String tokenName, TokenUpdateParameters tokenUpdateParameters);

    /**
     * Updates a token with the specified parameters.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param registryName The name of the container registry.
     * @param tokenName The name of the token.
     * @param tokenUpdateParameters The parameters for updating a token.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an object that represents a token for a container registry.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TokenInner update(
        String resourceGroupName,
        String registryName,
        String tokenName,
        TokenUpdateParameters tokenUpdateParameters,
        Context context);
}
