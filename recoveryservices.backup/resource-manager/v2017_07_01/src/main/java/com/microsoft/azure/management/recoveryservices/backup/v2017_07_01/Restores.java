/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import rx.Completable;
import com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation.RestoresInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Restores.
 */
public interface Restores extends HasInner<RestoresInner> {
    /**
     * Restores the specified backed up data. This is an asynchronous operation. To know the status of this API call, use GetProtectedItemOperationResult API.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param fabricName Fabric name associated with the backed up items.
     * @param containerName Container name associated with the backed up items.
     * @param protectedItemName Backed up item to be restored.
     * @param recoveryPointId Recovery point ID which represents the backed up data to be restored.
     * @param parameters resource restore request
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable triggerAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, String recoveryPointId, RestoreRequestResource parameters);

}
