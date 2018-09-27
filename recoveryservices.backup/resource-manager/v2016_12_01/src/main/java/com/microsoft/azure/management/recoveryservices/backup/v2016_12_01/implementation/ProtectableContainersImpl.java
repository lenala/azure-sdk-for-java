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
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.ProtectableContainers;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.ProtectableContainerResource;

class ProtectableContainersImpl extends WrapperImpl<ProtectableContainersInner> implements ProtectableContainers {
    private final RecoveryServicesManager manager;

    ProtectableContainersImpl(RecoveryServicesManager manager) {
        super(manager.inner().protectableContainers());
        this.manager = manager;
    }

    public RecoveryServicesManager manager() {
        return this.manager;
    }

    private ProtectableContainerResourceImpl wrapModel(ProtectableContainerResourceInner inner) {
        return  new ProtectableContainerResourceImpl(inner, manager());
    }

    @Override
    public Observable<ProtectableContainerResource> listAsync(final String vaultName, final String resourceGroupName, final String fabricName) {
        ProtectableContainersInner client = this.inner();
        return client.listAsync(vaultName, resourceGroupName, fabricName)
        .flatMapIterable(new Func1<Page<ProtectableContainerResourceInner>, Iterable<ProtectableContainerResourceInner>>() {
            @Override
            public Iterable<ProtectableContainerResourceInner> call(Page<ProtectableContainerResourceInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ProtectableContainerResourceInner, ProtectableContainerResource>() {
            @Override
            public ProtectableContainerResource call(ProtectableContainerResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}
