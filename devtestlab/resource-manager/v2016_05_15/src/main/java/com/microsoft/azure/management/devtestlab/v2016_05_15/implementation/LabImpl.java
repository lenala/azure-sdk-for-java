/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.devtestlab.v2016_05_15.Lab;
import rx.Observable;
import com.microsoft.azure.management.devtestlab.v2016_05_15.LabFragment;
import com.microsoft.azure.management.devtestlab.v2016_05_15.StorageType;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2016_05_15.PremiumDataDisk;
import rx.functions.Func1;

class LabImpl extends GroupableResourceCoreImpl<Lab, LabInner, LabImpl, DevTestLabManager> implements Lab, Lab.Definition, Lab.Update {
    private LabFragment updateParameter;
    LabImpl(String name, LabInner inner, DevTestLabManager manager) {
        super(name, inner, manager);
        this.updateParameter = new LabFragment();
    }

    @Override
    public Observable<Lab> createResourceAsync() {
        LabsInner client = this.manager().inner().labs();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<LabInner, LabInner>() {
               @Override
               public LabInner call(LabInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Lab> updateResourceAsync() {
        LabsInner client = this.manager().inner().labs();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<LabInner, LabInner>() {
               @Override
               public LabInner call(LabInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<LabInner> getInnerAsync() {
        LabsInner client = this.manager().inner().labs();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new LabFragment();
    }

    @Override
    public String artifactsStorageAccount() {
        return this.inner().artifactsStorageAccount();
    }

    @Override
    public DateTime createdDate() {
        return this.inner().createdDate();
    }

    @Override
    public String defaultPremiumStorageAccount() {
        return this.inner().defaultPremiumStorageAccount();
    }

    @Override
    public String defaultStorageAccount() {
        return this.inner().defaultStorageAccount();
    }

    @Override
    public StorageType labStorageType() {
        return this.inner().labStorageType();
    }

    @Override
    public PremiumDataDisk premiumDataDisks() {
        return this.inner().premiumDataDisks();
    }

    @Override
    public String premiumDataDiskStorageAccount() {
        return this.inner().premiumDataDiskStorageAccount();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String uniqueIdentifier() {
        return this.inner().uniqueIdentifier();
    }

    @Override
    public String vaultName() {
        return this.inner().vaultName();
    }

    @Override
    public LabImpl withLabStorageType(StorageType labStorageType) {
        if (isInCreateMode()) {
            this.inner().withLabStorageType(labStorageType);
        } else {
            this.updateParameter.withLabStorageType(labStorageType);
        }
        return this;
    }

    @Override
    public LabImpl withPremiumDataDisks(PremiumDataDisk premiumDataDisks) {
        if (isInCreateMode()) {
            this.inner().withPremiumDataDisks(premiumDataDisks);
        } else {
            this.updateParameter.withPremiumDataDisks(premiumDataDisks);
        }
        return this;
    }

    @Override
    public LabImpl withProvisioningState(String provisioningState) {
        if (isInCreateMode()) {
            this.inner().withProvisioningState(provisioningState);
        } else {
            this.updateParameter.withProvisioningState(provisioningState);
        }
        return this;
    }

    @Override
    public LabImpl withUniqueIdentifier(String uniqueIdentifier) {
        if (isInCreateMode()) {
            this.inner().withUniqueIdentifier(uniqueIdentifier);
        } else {
            this.updateParameter.withUniqueIdentifier(uniqueIdentifier);
        }
        return this;
    }

}
