/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.ProtectedItems;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.ProtectionContainerBackupFabricVaultProtectedItemResource;

class ProtectedItemsImpl extends WrapperImpl<ProtectedItemsInner> implements ProtectedItems {
    private final RecoveryServicesManager manager;

    ProtectedItemsImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectedItems());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private ProtectionContainerBackupFabricVaultProtectedItemResourceImpl wrapModel(ProtectedItemResourceInner inner) {
        return  new ProtectionContainerBackupFabricVaultProtectedItemResourceImpl(inner, manager());
    }

    @Override
    public Observable<ProtectionContainerBackupFabricVaultProtectedItemResource> getAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName) {
        ProtectedItemsInner client = this.inner();
        return client.getAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName)
        .map(new Func1<ProtectedItemResourceInner, ProtectionContainerBackupFabricVaultProtectedItemResource>() {
            @Override
            public ProtectionContainerBackupFabricVaultProtectedItemResource call(ProtectedItemResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName) {
        ProtectedItemsInner client = this.inner();
        return client.deleteAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName).toCompletable();
    }

    @Override
    public Completable createOrUpdateAsync(String vaultName, String resourceGroupName, String fabricName, String containerName, String protectedItemName, ProtectedItemResourceInner parameters) {
        ProtectedItemsInner client = this.inner();
        return client.createOrUpdateAsync(vaultName, resourceGroupName, fabricName, containerName, protectedItemName, parameters).toCompletable();
    }

}
