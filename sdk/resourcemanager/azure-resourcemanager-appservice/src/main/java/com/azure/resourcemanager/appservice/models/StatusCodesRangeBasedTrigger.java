// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Trigger based on range of status codes. */
@Fluent
public final class StatusCodesRangeBasedTrigger {
    /*
     * HTTP status code.
     */
    @JsonProperty(value = "statusCodes")
    private String statusCodes;

    /*
     * The path property.
     */
    @JsonProperty(value = "path")
    private String path;

    /*
     * Request Count.
     */
    @JsonProperty(value = "count")
    private Integer count;

    /*
     * Time interval.
     */
    @JsonProperty(value = "timeInterval")
    private String timeInterval;

    /** Creates an instance of StatusCodesRangeBasedTrigger class. */
    public StatusCodesRangeBasedTrigger() {
    }

    /**
     * Get the statusCodes property: HTTP status code.
     *
     * @return the statusCodes value.
     */
    public String statusCodes() {
        return this.statusCodes;
    }

    /**
     * Set the statusCodes property: HTTP status code.
     *
     * @param statusCodes the statusCodes value to set.
     * @return the StatusCodesRangeBasedTrigger object itself.
     */
    public StatusCodesRangeBasedTrigger withStatusCodes(String statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    /**
     * Get the path property: The path property.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: The path property.
     *
     * @param path the path value to set.
     * @return the StatusCodesRangeBasedTrigger object itself.
     */
    public StatusCodesRangeBasedTrigger withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * Get the count property: Request Count.
     *
     * @return the count value.
     */
    public Integer count() {
        return this.count;
    }

    /**
     * Set the count property: Request Count.
     *
     * @param count the count value to set.
     * @return the StatusCodesRangeBasedTrigger object itself.
     */
    public StatusCodesRangeBasedTrigger withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * Get the timeInterval property: Time interval.
     *
     * @return the timeInterval value.
     */
    public String timeInterval() {
        return this.timeInterval;
    }

    /**
     * Set the timeInterval property: Time interval.
     *
     * @param timeInterval the timeInterval value to set.
     * @return the StatusCodesRangeBasedTrigger object itself.
     */
    public StatusCodesRangeBasedTrigger withTimeInterval(String timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
