/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.PoliciesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Policies.
 */
public interface Policies extends SupportsCreating<Policy.DefinitionStages.Blank>, HasInner<PoliciesInner> {
    /**
     * Get policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Policy> getAsync(String resourceGroupName, String labName, String policySetName, String name);

    /**
     * List policies in a given policy set.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<Policy> listAsync(final String resourceGroupName, final String labName, final String policySetName);

    /**
     * Delete policy.
     *
     * @param resourceGroupName The name of the resource group.
     * @param labName The name of the lab.
     * @param policySetName The name of the policy set.
     * @param name The name of the policy.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String labName, String policySetName, String name);

}
