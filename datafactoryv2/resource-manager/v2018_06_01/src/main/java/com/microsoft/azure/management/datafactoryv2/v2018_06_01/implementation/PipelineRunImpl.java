/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01.implementation;

import com.microsoft.azure.management.datafactoryv2.v2018_06_01.PipelineRun;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.Map;
import com.microsoft.azure.management.datafactoryv2.v2018_06_01.PipelineRunInvokedBy;
import org.joda.time.DateTime;

class PipelineRunImpl extends WrapperImpl<PipelineRunInner> implements PipelineRun {
    private final DataFactoryManager manager;
    private String resourceGroupName;
    private String factoryName;
    private String runId;

    PipelineRunImpl(PipelineRunInner inner,  DataFactoryManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public DataFactoryManager manager() {
        return this.manager;
    }



    @Override
    public Map<String, Object> additionalProperties() {
        return this.inner().additionalProperties();
    }

    @Override
    public Integer durationInMs() {
        return this.inner().durationInMs();
    }

    @Override
    public PipelineRunInvokedBy invokedBy() {
        return this.inner().invokedBy();
    }

    @Override
    public DateTime lastUpdated() {
        return this.inner().lastUpdated();
    }

    @Override
    public String message() {
        return this.inner().message();
    }

    @Override
    public Map<String, String> parameters() {
        return this.inner().parameters();
    }

    @Override
    public String pipelineName() {
        return this.inner().pipelineName();
    }

    @Override
    public DateTime runEnd() {
        return this.inner().runEnd();
    }

    @Override
    public String runId() {
        return this.inner().runId();
    }

    @Override
    public DateTime runStart() {
        return this.inner().runStart();
    }

    @Override
    public String status() {
        return this.inner().status();
    }

}
