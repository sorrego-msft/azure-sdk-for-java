// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.network.models.ApplicationGatewayBackendAddressPool;
import com.azure.resourcemanager.network.models.IpAllocationMethod;
import com.azure.resourcemanager.network.models.IpVersion;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** IPConfiguration in a network interface. */
@Fluent
public final class NetworkInterfaceIpConfigurationInner extends SubResource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(NetworkInterfaceIpConfigurationInner.class);

    /*
     * Network interface IP configuration properties.
     */
    @JsonProperty(value = "properties")
    private NetworkInterfaceIpConfigurationPropertiesFormatInner innerProperties;

    /*
     * The name of the resource that is unique within a resource group. This
     * name can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Get the innerProperties property: Network interface IP configuration properties.
     *
     * @return the innerProperties value.
     */
    private NetworkInterfaceIpConfigurationPropertiesFormatInner innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The name of the resource that is unique within a resource group. This name can be used to
     * access the resource.
     *
     * @param name the name value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Set the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @param etag the etag value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public NetworkInterfaceIpConfigurationInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the virtualNetworkTaps property: The reference to Virtual Network Taps.
     *
     * @return the virtualNetworkTaps value.
     */
    public List<VirtualNetworkTapInner> virtualNetworkTaps() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualNetworkTaps();
    }

    /**
     * Set the virtualNetworkTaps property: The reference to Virtual Network Taps.
     *
     * @param virtualNetworkTaps the virtualNetworkTaps value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withVirtualNetworkTaps(
        List<VirtualNetworkTapInner> virtualNetworkTaps) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withVirtualNetworkTaps(virtualNetworkTaps);
        return this;
    }

    /**
     * Get the applicationGatewayBackendAddressPools property: The reference of ApplicationGatewayBackendAddressPool
     * resource.
     *
     * @return the applicationGatewayBackendAddressPools value.
     */
    public List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationGatewayBackendAddressPools();
    }

    /**
     * Set the applicationGatewayBackendAddressPools property: The reference of ApplicationGatewayBackendAddressPool
     * resource.
     *
     * @param applicationGatewayBackendAddressPools the applicationGatewayBackendAddressPools value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withApplicationGatewayBackendAddressPools(
        List<ApplicationGatewayBackendAddressPool> applicationGatewayBackendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withApplicationGatewayBackendAddressPools(applicationGatewayBackendAddressPools);
        return this;
    }

    /**
     * Get the loadBalancerBackendAddressPools property: The reference of LoadBalancerBackendAddressPool resource.
     *
     * @return the loadBalancerBackendAddressPools value.
     */
    public List<BackendAddressPoolInner> loadBalancerBackendAddressPools() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerBackendAddressPools();
    }

    /**
     * Set the loadBalancerBackendAddressPools property: The reference of LoadBalancerBackendAddressPool resource.
     *
     * @param loadBalancerBackendAddressPools the loadBalancerBackendAddressPools value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withLoadBalancerBackendAddressPools(
        List<BackendAddressPoolInner> loadBalancerBackendAddressPools) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withLoadBalancerBackendAddressPools(loadBalancerBackendAddressPools);
        return this;
    }

    /**
     * Get the loadBalancerInboundNatRules property: A list of references of LoadBalancerInboundNatRules.
     *
     * @return the loadBalancerInboundNatRules value.
     */
    public List<InboundNatRuleInner> loadBalancerInboundNatRules() {
        return this.innerProperties() == null ? null : this.innerProperties().loadBalancerInboundNatRules();
    }

    /**
     * Set the loadBalancerInboundNatRules property: A list of references of LoadBalancerInboundNatRules.
     *
     * @param loadBalancerInboundNatRules the loadBalancerInboundNatRules value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withLoadBalancerInboundNatRules(
        List<InboundNatRuleInner> loadBalancerInboundNatRules) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withLoadBalancerInboundNatRules(loadBalancerInboundNatRules);
        return this;
    }

    /**
     * Get the privateIpAddress property: Private IP address of the IP configuration.
     *
     * @return the privateIpAddress value.
     */
    public String privateIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddress();
    }

    /**
     * Set the privateIpAddress property: Private IP address of the IP configuration.
     *
     * @param privateIpAddress the privateIpAddress value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrivateIpAddress(String privateIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAddress(privateIpAddress);
        return this;
    }

    /**
     * Get the privateIpAllocationMethod property: Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'.
     *
     * @return the privateIpAllocationMethod value.
     */
    public IpAllocationMethod privateIpAllocationMethod() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAllocationMethod();
    }

    /**
     * Set the privateIpAllocationMethod property: Defines how a private IP address is assigned. Possible values are:
     * 'Static' and 'Dynamic'.
     *
     * @param privateIpAllocationMethod the privateIpAllocationMethod value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrivateIpAllocationMethod(
        IpAllocationMethod privateIpAllocationMethod) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAllocationMethod(privateIpAllocationMethod);
        return this;
    }

    /**
     * Get the privateIpAddressVersion property: Available from Api-Version 2016-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @return the privateIpAddressVersion value.
     */
    public IpVersion privateIpAddressVersion() {
        return this.innerProperties() == null ? null : this.innerProperties().privateIpAddressVersion();
    }

    /**
     * Set the privateIpAddressVersion property: Available from Api-Version 2016-03-30 onwards, it represents whether
     * the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4. Possible values are: 'IPv4' and 'IPv6'.
     *
     * @param privateIpAddressVersion the privateIpAddressVersion value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrivateIpAddressVersion(IpVersion privateIpAddressVersion) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrivateIpAddressVersion(privateIpAddressVersion);
        return this;
    }

    /**
     * Get the subnet property: Subnet bound to the IP configuration.
     *
     * @return the subnet value.
     */
    public SubnetInner subnet() {
        return this.innerProperties() == null ? null : this.innerProperties().subnet();
    }

    /**
     * Set the subnet property: Subnet bound to the IP configuration.
     *
     * @param subnet the subnet value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withSubnet(SubnetInner subnet) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withSubnet(subnet);
        return this;
    }

    /**
     * Get the primary property: Gets whether this is a primary customer address on the network interface.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.innerProperties() == null ? null : this.innerProperties().primary();
    }

    /**
     * Set the primary property: Gets whether this is a primary customer address on the network interface.
     *
     * @param primary the primary value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPrimary(Boolean primary) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPrimary(primary);
        return this;
    }

    /**
     * Get the publicIpAddress property: Public IP address bound to the IP configuration.
     *
     * @return the publicIpAddress value.
     */
    public PublicIpAddressInner publicIpAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().publicIpAddress();
    }

    /**
     * Set the publicIpAddress property: Public IP address bound to the IP configuration.
     *
     * @param publicIpAddress the publicIpAddress value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withPublicIpAddress(PublicIpAddressInner publicIpAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withPublicIpAddress(publicIpAddress);
        return this;
    }

    /**
     * Get the applicationSecurityGroups property: Application security groups in which the IP configuration is
     * included.
     *
     * @return the applicationSecurityGroups value.
     */
    public List<ApplicationSecurityGroupInner> applicationSecurityGroups() {
        return this.innerProperties() == null ? null : this.innerProperties().applicationSecurityGroups();
    }

    /**
     * Set the applicationSecurityGroups property: Application security groups in which the IP configuration is
     * included.
     *
     * @param applicationSecurityGroups the applicationSecurityGroups value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withApplicationSecurityGroups(
        List<ApplicationSecurityGroupInner> applicationSecurityGroups) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withApplicationSecurityGroups(applicationSecurityGroups);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the network interface IP configuration. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Set the provisioningState property: The provisioning state of the network interface IP configuration. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the NetworkInterfaceIpConfigurationInner object itself.
     */
    public NetworkInterfaceIpConfigurationInner withProvisioningState(String provisioningState) {
        if (this.innerProperties() == null) {
            this.innerProperties = new NetworkInterfaceIpConfigurationPropertiesFormatInner();
        }
        this.innerProperties().withProvisioningState(provisioningState);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}