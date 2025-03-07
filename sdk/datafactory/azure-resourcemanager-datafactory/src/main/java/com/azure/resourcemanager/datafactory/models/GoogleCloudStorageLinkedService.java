// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.GoogleCloudStorageLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Linked service for Google Cloud Storage. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("GoogleCloudStorage")
@Fluent
public final class GoogleCloudStorageLinkedService extends LinkedService {
    /*
     * Google Cloud Storage linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private GoogleCloudStorageLinkedServiceTypeProperties innerTypeProperties =
        new GoogleCloudStorageLinkedServiceTypeProperties();

    /** Creates an instance of GoogleCloudStorageLinkedService class. */
    public GoogleCloudStorageLinkedService() {
    }

    /**
     * Get the innerTypeProperties property: Google Cloud Storage linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private GoogleCloudStorageLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public GoogleCloudStorageLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the accessKeyId property: The access key identifier of the Google Cloud Storage Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @return the accessKeyId value.
     */
    public Object accessKeyId() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().accessKeyId();
    }

    /**
     * Set the accessKeyId property: The access key identifier of the Google Cloud Storage Identity and Access
     * Management (IAM) user. Type: string (or Expression with resultType string).
     *
     * @param accessKeyId the accessKeyId value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withAccessKeyId(Object accessKeyId) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new GoogleCloudStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAccessKeyId(accessKeyId);
        return this;
    }

    /**
     * Get the secretAccessKey property: The secret access key of the Google Cloud Storage Identity and Access
     * Management (IAM) user.
     *
     * @return the secretAccessKey value.
     */
    public SecretBase secretAccessKey() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().secretAccessKey();
    }

    /**
     * Set the secretAccessKey property: The secret access key of the Google Cloud Storage Identity and Access
     * Management (IAM) user.
     *
     * @param secretAccessKey the secretAccessKey value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withSecretAccessKey(SecretBase secretAccessKey) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new GoogleCloudStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withSecretAccessKey(secretAccessKey);
        return this;
    }

    /**
     * Get the serviceUrl property: This value specifies the endpoint to access with the Google Cloud Storage Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     *
     * @return the serviceUrl value.
     */
    public Object serviceUrl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serviceUrl();
    }

    /**
     * Set the serviceUrl property: This value specifies the endpoint to access with the Google Cloud Storage Connector.
     * This is an optional property; change it only if you want to try a different service endpoint or want to switch
     * between https and http. Type: string (or Expression with resultType string).
     *
     * @param serviceUrl the serviceUrl value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withServiceUrl(Object serviceUrl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new GoogleCloudStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServiceUrl(serviceUrl);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the GoogleCloudStorageLinkedService object itself.
     */
    public GoogleCloudStorageLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new GoogleCloudStorageLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
        if (innerTypeProperties() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model GoogleCloudStorageLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(GoogleCloudStorageLinkedService.class);
}
