// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;

/** The PermissionsCustomsItem model. */
@Fluent
public final class PermissionsCustomsItem extends Customs {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(PermissionsCustomsItem.class);

    /** {@inheritDoc} */
    @Override
    public PermissionsCustomsItem withName(String name) {
        super.withName(name);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public PermissionsCustomsItem withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}