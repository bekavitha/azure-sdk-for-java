// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute.fluent;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Headers;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.compute.ComputeManagementClient;
import com.azure.management.compute.fluent.inner.RunCommandDocumentBaseInner;
import com.azure.management.compute.fluent.inner.RunCommandDocumentInner;
import com.azure.management.compute.fluent.inner.RunCommandListResultInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in VirtualMachineRunCommands. */
public final class VirtualMachineRunCommandsClient {
    private final ClientLogger logger = new ClientLogger(VirtualMachineRunCommandsClient.class);

    /** The proxy service used to perform REST calls. */
    private final VirtualMachineRunCommandsService service;

    /** The service client containing this operation class. */
    private final ComputeManagementClient client;

    /**
     * Initializes an instance of VirtualMachineRunCommandsClient.
     *
     * @param client the instance of the service client containing this operation class.
     */
    public VirtualMachineRunCommandsClient(ComputeManagementClient client) {
        this.service =
            RestProxy
                .create(
                    VirtualMachineRunCommandsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for ComputeManagementClientVirtualMachineRunCommands to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "ComputeManagementCli")
    private interface VirtualMachineRunCommandsService {
        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/runCommands")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RunCommandListResultInner>> list(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("/subscriptions/{subscriptionId}/providers/Microsoft.Compute/locations/{location}/runCommands/{commandId}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RunCommandDocumentInner>> get(
            @HostParam("$host") String endpoint,
            @PathParam("location") String location,
            @PathParam("commandId") String commandId,
            @QueryParam("api-version") String apiVersion,
            @PathParam("subscriptionId") String subscriptionId,
            Context context);

        @Headers({"Accept: application/json,text/json", "Content-Type: application/json"})
        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ManagementException.class)
        Mono<Response<RunCommandListResultInner>> listNext(
            @PathParam(value = "nextLink", encoded = true) String nextLink, Context context);
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RunCommandDocumentBaseInner>> listSinglePageAsync(String location) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .list(
                            this.client.getEndpoint(), location, apiVersion, this.client.getSubscriptionId(), context))
            .<PagedResponse<RunCommandDocumentBaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RunCommandDocumentBaseInner>> listSinglePageAsync(String location, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-03-01";
        return service
            .list(this.client.getEndpoint(), location, apiVersion, this.client.getSubscriptionId(), context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RunCommandDocumentBaseInner> listAsync(String location) {
        return new PagedFlux<>(() -> listSinglePageAsync(location), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<RunCommandDocumentBaseInner> listAsync(String location, Context context) {
        return new PagedFlux<>(
            () -> listSinglePageAsync(location, context), nextLink -> listNextSinglePageAsync(nextLink));
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RunCommandDocumentBaseInner> list(String location) {
        return new PagedIterable<>(listAsync(location));
    }

    /**
     * Lists all available run commands for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<RunCommandDocumentBaseInner> list(String location, Context context) {
        return new PagedIterable<>(listAsync(location, context));
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RunCommandDocumentInner>> getWithResponseAsync(String location, String commandId) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (commandId == null) {
            return Mono.error(new IllegalArgumentException("Parameter commandId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-03-01";
        return FluxUtil
            .withContext(
                context ->
                    service
                        .get(
                            this.client.getEndpoint(),
                            location,
                            commandId,
                            apiVersion,
                            this.client.getSubscriptionId(),
                            context))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<RunCommandDocumentInner>> getWithResponseAsync(
        String location, String commandId, Context context) {
        if (this.client.getEndpoint() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getEndpoint() is required and cannot be null."));
        }
        if (location == null) {
            return Mono.error(new IllegalArgumentException("Parameter location is required and cannot be null."));
        }
        if (commandId == null) {
            return Mono.error(new IllegalArgumentException("Parameter commandId is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono
                .error(
                    new IllegalArgumentException(
                        "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        final String apiVersion = "2019-03-01";
        return service
            .get(this.client.getEndpoint(), location, commandId, apiVersion, this.client.getSubscriptionId(), context);
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RunCommandDocumentInner> getAsync(String location, String commandId) {
        return getWithResponseAsync(location, commandId)
            .flatMap(
                (Response<RunCommandDocumentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<RunCommandDocumentInner> getAsync(String location, String commandId, Context context) {
        return getWithResponseAsync(location, commandId, context)
            .flatMap(
                (Response<RunCommandDocumentInner> res) -> {
                    if (res.getValue() != null) {
                        return Mono.just(res.getValue());
                    } else {
                        return Mono.empty();
                    }
                });
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunCommandDocumentInner get(String location, String commandId) {
        return getAsync(location, commandId).block();
    }

    /**
     * Gets specific run command for a subscription in a location.
     *
     * @param location The location upon which run commands is queried.
     * @param commandId The command id.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return specific run command for a subscription in a location.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public RunCommandDocumentInner get(String location, String commandId, Context context) {
        return getAsync(location, commandId, context).block();
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RunCommandDocumentBaseInner>> listNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return FluxUtil
            .withContext(context -> service.listNext(nextLink, context))
            .<PagedResponse<RunCommandDocumentBaseInner>>map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null))
            .subscriberContext(context -> context.putAll(FluxUtil.toReactorContext(this.client.getContext())));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the List Virtual Machine operation response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<RunCommandDocumentBaseInner>> listNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        return service
            .listNext(nextLink, context)
            .map(
                res ->
                    new PagedResponseBase<>(
                        res.getRequest(),
                        res.getStatusCode(),
                        res.getHeaders(),
                        res.getValue().value(),
                        res.getValue().nextLink(),
                        null));
    }
}