// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Post;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.resources.fluent.ResourceNamesClient;
import com.azure.resourcemanager.resources.fluent.models.CheckResourceNameResultInner;
import com.azure.resourcemanager.resources.models.ResourceName;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ResourceNamesClient. */
public final class ResourceNamesClientImpl implements ResourceNamesClient {
    private final ClientLogger logger = new ClientLogger(ResourceNamesClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ResourceNamesService service;

    /** The service client containing this operation class. */
    private final SubscriptionClientImpl client;

    /**
     * Initializes an instance of ResourceNamesClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ResourceNamesClientImpl(SubscriptionClientImpl client) {
        this.service =
            RestProxy.create(ResourceNamesService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for SubscriptionClientResourceNames to be used by the proxy service to
     * perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "SubscriptionClientRe")
    private interface ResourceNamesService {
        @Headers({"Content-Type: application/json"})
        @Post("/providers/Microsoft.Resources/checkResourceName")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<CheckResourceNameResultInner>> checkResourceName(
            @HostParam("$host") String endpoint,
            @QueryParam("api-version") String apiVersion,
            @BodyParam("application/json") ResourceName resourceNameDefinition,
            @HeaderParam("Accept") String accept,
            Context context);
    }

    /**
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with
     * a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource Name valid if not a reserved word, does not contain a reserved word and does not start with a
     *     reserved word.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<CheckResourceNameResultInner>> checkResourceNameWithResponseAsync(
        ResourceName resourceNameDefinition) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceNameDefinition != null) {
            resourceNameDefinition.validate();
        }
        final String accept = "application/json";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .checkResourceName(
                            this.client.getEndpoint(),
                            this.client.getApiVersion(),
                            resourceNameDefinition,
                            accept,
                            context))
            .contextWrite(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext()).readOnly()));
    }

    /**
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with
     * a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource Name valid if not a reserved word, does not contain a reserved word and does not start with a
     *     reserved word.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    private Mono<Response<CheckResourceNameResultInner>> checkResourceNameWithResponseAsync(
        ResourceName resourceNameDefinition, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (resourceNameDefinition != null) {
            resourceNameDefinition.validate();
        }
        final String accept = "application/json";
        context = this.client.mergeContext(context);
        return service
            .checkResourceName(
                this.client.getEndpoint(), this.client.getApiVersion(), resourceNameDefinition, accept, context);
    }

    /**
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with
     * a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource Name valid if not a reserved word, does not contain a reserved word and does not start with a
     *     reserved word.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckResourceNameResultInner> checkResourceNameAsync(ResourceName resourceNameDefinition) {
        return checkResourceNameWithResponseAsync(resourceNameDefinition)
            .flatMap(
                (Response<CheckResourceNameResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with
     * a reserved word.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource Name valid if not a reserved word, does not contain a reserved word and does not start with a
     *     reserved word.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CheckResourceNameResultInner> checkResourceNameAsync() {
        final ResourceName resourceNameDefinition = null;
        return checkResourceNameWithResponseAsync(resourceNameDefinition)
            .flatMap(
                (Response<CheckResourceNameResultInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with
     * a reserved word.
     *
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource Name valid if not a reserved word, does not contain a reserved word and does not start with a
     *     reserved word.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public CheckResourceNameResultInner checkResourceName() {
        final ResourceName resourceNameDefinition = null;
        return checkResourceNameAsync(resourceNameDefinition).block();
    }

    /**
     * A resource name is valid if it is not a reserved word, does not contains a reserved word and does not start with
     * a reserved word.
     *
     * @param resourceNameDefinition Resource object with values for resource name and resource type.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return resource Name valid if not a reserved word, does not contain a reserved word and does not start with a
     *     reserved word.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<CheckResourceNameResultInner> checkResourceNameWithResponse(
        ResourceName resourceNameDefinition, Context context) {
        return checkResourceNameWithResponseAsync(resourceNameDefinition, context).block();
    }
}