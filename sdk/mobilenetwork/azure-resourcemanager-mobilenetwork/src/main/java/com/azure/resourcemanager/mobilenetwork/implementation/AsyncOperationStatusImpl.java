// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.implementation;

import com.azure.core.management.exception.ManagementError;
import com.azure.resourcemanager.mobilenetwork.fluent.models.AsyncOperationStatusInner;
import com.azure.resourcemanager.mobilenetwork.models.AsyncOperationStatus;
import java.time.OffsetDateTime;

public final class AsyncOperationStatusImpl implements AsyncOperationStatus {
    private AsyncOperationStatusInner innerObject;

    private final com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager;

    AsyncOperationStatusImpl(
        AsyncOperationStatusInner innerObject,
        com.azure.resourcemanager.mobilenetwork.MobileNetworkManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String status() {
        return this.innerModel().status();
    }

    public String resourceId() {
        return this.innerModel().resourceId();
    }

    public OffsetDateTime startTime() {
        return this.innerModel().startTime();
    }

    public OffsetDateTime endTime() {
        return this.innerModel().endTime();
    }

    public Double percentComplete() {
        return this.innerModel().percentComplete();
    }

    public Object properties() {
        return this.innerModel().properties();
    }

    public ManagementError error() {
        return this.innerModel().error();
    }

    public AsyncOperationStatusInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.mobilenetwork.MobileNetworkManager manager() {
        return this.serviceManager;
    }
}
