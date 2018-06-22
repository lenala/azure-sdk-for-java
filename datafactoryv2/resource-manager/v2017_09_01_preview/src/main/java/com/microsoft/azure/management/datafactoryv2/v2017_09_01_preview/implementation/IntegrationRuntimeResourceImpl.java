/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.IntegrationRuntimeResource;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.UpdateIntegrationRuntimeRequest;
import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.IntegrationRuntimeAutoUpdate;
import rx.functions.Func1;

class IntegrationRuntimeResourceImpl extends CreatableUpdatableImpl<IntegrationRuntimeResource, IntegrationRuntimeResourceInner, IntegrationRuntimeResourceImpl> implements IntegrationRuntimeResource, IntegrationRuntimeResource.Definition, IntegrationRuntimeResource.Update {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String integrationRuntimeName;
    private IntegrationRuntimeInner cproperties;
    private UpdateIntegrationRuntimeRequest updateParameter;

    IntegrationRuntimeResourceImpl(String name, DataFactoryManager manager) {
        super(name, new IntegrationRuntimeResourceInner());
        this.manager = manager;
        // Set resource name
        this.integrationRuntimeName = name;
        //
        this.cproperties = new IntegrationRuntimeInner();
        this.updateParameter = new UpdateIntegrationRuntimeRequest();
    }

    IntegrationRuntimeResourceImpl(IntegrationRuntimeResourceInner inner, DataFactoryManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.integrationRuntimeName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.factoryName = IdParsingUtils.getValueFromIdByName(inner.id(), "factories");
        this.integrationRuntimeName = IdParsingUtils.getValueFromIdByName(inner.id(), "integrationRuntimes");
        //
        this.cproperties = new IntegrationRuntimeInner();
        this.updateParameter = new UpdateIntegrationRuntimeRequest();
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }

    @Override
    public Observable<IntegrationRuntimeResource> createResourceAsync() {
        IntegrationRuntimesInner client = this.manager().inner().integrationRuntimes();
        return client.createOrUpdateAsync(this.resourceGroupName, this.factoryName, this.integrationRuntimeName, this.cproperties)
            .map(new Func1<IntegrationRuntimeResourceInner, IntegrationRuntimeResourceInner>() {
               @Override
               public IntegrationRuntimeResourceInner call(IntegrationRuntimeResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<IntegrationRuntimeResource> updateResourceAsync() {
        IntegrationRuntimesInner client = this.manager().inner().integrationRuntimes();
        return client.updateAsync(this.resourceGroupName, this.factoryName, this.integrationRuntimeName, this.updateParameter)
            .map(new Func1<IntegrationRuntimeResourceInner, IntegrationRuntimeResourceInner>() {
               @Override
               public IntegrationRuntimeResourceInner call(IntegrationRuntimeResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<IntegrationRuntimeResourceInner> getInnerAsync() {
        IntegrationRuntimesInner client = this.manager().inner().integrationRuntimes();
        return client.getAsync(this.resourceGroupName, this.factoryName, this.integrationRuntimeName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.cproperties = new IntegrationRuntimeInner();
        this.updateParameter = new UpdateIntegrationRuntimeRequest();
    }

    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public IntegrationRuntimeInner properties() {
        return this.inner().properties();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public IntegrationRuntimeResourceImpl withExistingFactory(String resourceGroupName, String factoryName) {
        this.resourceGroupName = resourceGroupName;
        this.factoryName = factoryName;
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withProperties(IntegrationRuntimeInner properties) {
        this.cproperties = properties;
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withAutoUpdate(IntegrationRuntimeAutoUpdate autoUpdate) {
        this.updateParameter.withAutoUpdate(autoUpdate);
        return this;
    }

    @Override
    public IntegrationRuntimeResourceImpl withUpdateDelayOffset(String updateDelayOffset) {
        this.updateParameter.withUpdateDelayOffset(updateDelayOffset);
        return this;
    }

}
