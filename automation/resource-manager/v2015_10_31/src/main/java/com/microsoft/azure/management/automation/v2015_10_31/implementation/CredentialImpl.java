/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31.implementation;

import com.microsoft.azure.management.automation.v2015_10_31.Credential;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.automation.v2015_10_31.CredentialUpdateParameters;
import com.microsoft.azure.management.automation.v2015_10_31.CredentialCreateOrUpdateParameters;
import org.joda.time.DateTime;
import rx.functions.Func1;

class CredentialImpl extends CreatableUpdatableImpl<Credential, CredentialInner, CredentialImpl> implements Credential, Credential.Definition, Credential.Update {
    private final AutomationManager manager;
    private String resourceGroupName;
    private String automationAccountName;
    private String credentialName;
    private CredentialCreateOrUpdateParameters createParameter;
    private CredentialUpdateParameters updateParameter;

    CredentialImpl(String name, AutomationManager manager) {
        super(name, new CredentialInner());
        this.manager = manager;
        // Set resource name
        this.credentialName = name;
        //
        this.createParameter = new CredentialCreateOrUpdateParameters();
        this.updateParameter = new CredentialUpdateParameters();
    }

    CredentialImpl(CredentialInner inner, AutomationManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.credentialName = inner.name();
        // resource ancestor names
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.automationAccountName = IdParsingUtils.getValueFromIdByName(inner.id(), "automationAccounts");
        this.credentialName = IdParsingUtils.getValueFromIdByName(inner.id(), "credentials");
        //
        this.createParameter = new CredentialCreateOrUpdateParameters();
        this.updateParameter = new CredentialUpdateParameters();
    }

    @Override
    public AutomationManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Credential> createResourceAsync() {
        CredentialsInner client = this.manager().inner().credentials();
        return client.createOrUpdateAsync(this.resourceGroupName, this.automationAccountName, this.credentialName, this.createParameter)
            .map(new Func1<CredentialInner, CredentialInner>() {
               @Override
               public CredentialInner call(CredentialInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<Credential> updateResourceAsync() {
        CredentialsInner client = this.manager().inner().credentials();
        return client.updateAsync(this.resourceGroupName, this.automationAccountName, this.credentialName, this.updateParameter)
            .map(new Func1<CredentialInner, CredentialInner>() {
               @Override
               public CredentialInner call(CredentialInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<CredentialInner> getInnerAsync() {
        CredentialsInner client = this.manager().inner().credentials();
        return client.getAsync(this.resourceGroupName, this.automationAccountName, this.credentialName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new CredentialCreateOrUpdateParameters();
        this.updateParameter = new CredentialUpdateParameters();
    }

    @Override
    public DateTime creationTime() {
        return this.inner().creationTime();
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public DateTime lastModifiedTime() {
        return this.inner().lastModifiedTime();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public String userName() {
        return this.inner().userName();
    }

    @Override
    public CredentialImpl withExistingAutomationAccount(String resourceGroupName, String automationAccountName) {
        this.resourceGroupName = resourceGroupName;
        this.automationAccountName = automationAccountName;
        return this;
    }

    @Override
    public CredentialImpl withName(String name) {
        if (isInCreateMode()) {
            this.createParameter.withName(name);
        } else {
            this.updateParameter.withName(name);
        }
        return this;
    }

    @Override
    public CredentialImpl withPassword(String password) {
        if (isInCreateMode()) {
            this.createParameter.withPassword(password);
        } else {
            this.updateParameter.withPassword(password);
        }
        return this;
    }

    @Override
    public CredentialImpl withUserName(String userName) {
        if (isInCreateMode()) {
            this.createParameter.withUserName(userName);
        } else {
            this.updateParameter.withUserName(userName);
        }
        return this;
    }

    @Override
    public CredentialImpl withDescription(String description) {
        if (isInCreateMode()) {
            this.createParameter.withDescription(description);
        } else {
            this.updateParameter.withDescription(description);
        }
        return this;
    }

}
