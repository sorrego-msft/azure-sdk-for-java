// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.data.tables.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.util.List;

/** The properties for the table query response. */
@JacksonXmlRootElement(localName = "TableQueryResponse")
@Fluent
public final class TableQueryResponse {
    /*
     * The metadata response of the table.
     */
    @JsonProperty(value = "odata.metadata")
    private String odataMetadata;

    /*
     * List of tables.
     */
    @JsonProperty(value = "value")
    private List<TableResponseProperties> value;

    /** Creates an instance of TableQueryResponse class. */
    public TableQueryResponse() {}

    /**
     * Get the odataMetadata property: The metadata response of the table.
     *
     * @return the odataMetadata value.
     */
    public String getOdataMetadata() {
        return this.odataMetadata;
    }

    /**
     * Set the odataMetadata property: The metadata response of the table.
     *
     * @param odataMetadata the odataMetadata value to set.
     * @return the TableQueryResponse object itself.
     */
    public TableQueryResponse setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
        return this;
    }

    /**
     * Get the value property: List of tables.
     *
     * @return the value value.
     */
    public List<TableResponseProperties> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of tables.
     *
     * @param value the value value to set.
     * @return the TableQueryResponse object itself.
     */
    public TableQueryResponse setValue(List<TableResponseProperties> value) {
        this.value = value;
        return this;
    }
}
