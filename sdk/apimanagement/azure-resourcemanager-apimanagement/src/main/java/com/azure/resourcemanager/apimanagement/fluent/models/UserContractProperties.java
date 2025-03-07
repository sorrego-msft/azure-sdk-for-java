// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.apimanagement.models.UserEntityBaseParameters;
import com.azure.resourcemanager.apimanagement.models.UserState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** User profile. */
@Fluent
public final class UserContractProperties extends UserEntityBaseParameters {
    /*
     * First name.
     */
    @JsonProperty(value = "firstName")
    private String firstName;

    /*
     * Last name.
     */
    @JsonProperty(value = "lastName")
    private String lastName;

    /*
     * Email address.
     */
    @JsonProperty(value = "email")
    private String email;

    /*
     * Date of user registration. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     */
    @JsonProperty(value = "registrationDate")
    private OffsetDateTime registrationDate;

    /*
     * Collection of groups user is part of.
     */
    @JsonProperty(value = "groups", access = JsonProperty.Access.WRITE_ONLY)
    private List<GroupContractProperties> groups;

    /**
     * Get the firstName property: First name.
     *
     * @return the firstName value.
     */
    public String firstName() {
        return this.firstName;
    }

    /**
     * Set the firstName property: First name.
     *
     * @param firstName the firstName value to set.
     * @return the UserContractProperties object itself.
     */
    public UserContractProperties withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Get the lastName property: Last name.
     *
     * @return the lastName value.
     */
    public String lastName() {
        return this.lastName;
    }

    /**
     * Set the lastName property: Last name.
     *
     * @param lastName the lastName value to set.
     * @return the UserContractProperties object itself.
     */
    public UserContractProperties withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Get the email property: Email address.
     *
     * @return the email value.
     */
    public String email() {
        return this.email;
    }

    /**
     * Set the email property: Email address.
     *
     * @param email the email value to set.
     * @return the UserContractProperties object itself.
     */
    public UserContractProperties withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get the registrationDate property: Date of user registration. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the registrationDate value.
     */
    public OffsetDateTime registrationDate() {
        return this.registrationDate;
    }

    /**
     * Set the registrationDate property: Date of user registration. The date conforms to the following format:
     * `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param registrationDate the registrationDate value to set.
     * @return the UserContractProperties object itself.
     */
    public UserContractProperties withRegistrationDate(OffsetDateTime registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }

    /**
     * Get the groups property: Collection of groups user is part of.
     *
     * @return the groups value.
     */
    public List<GroupContractProperties> groups() {
        return this.groups;
    }

    /** {@inheritDoc} */
    @Override
    public UserContractProperties withState(UserState state) {
        super.withState(state);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserContractProperties withNote(String note) {
        super.withNote(note);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public UserContractProperties withIdentities(List<UserIdentityContractInner> identities) {
        super.withIdentities(identities);
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
        if (groups() != null) {
            groups().forEach(e -> e.validate());
        }
    }
}
