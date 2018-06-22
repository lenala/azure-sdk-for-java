/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the DataFactoryManagementClientImpl class.
 */
public class DataFactoryManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription identifier. */
    private String subscriptionId;

    /**
     * Gets The subscription identifier.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription identifier.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public DataFactoryManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version. */
    private String apiVersion;

    /**
     * Gets The API version.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public DataFactoryManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public DataFactoryManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public DataFactoryManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * The FactoriesInner object to access its operations.
     */
    private FactoriesInner factories;

    /**
     * Gets the FactoriesInner object to access its operations.
     * @return the FactoriesInner object.
     */
    public FactoriesInner factories() {
        return this.factories;
    }

    /**
     * The IntegrationRuntimesInner object to access its operations.
     */
    private IntegrationRuntimesInner integrationRuntimes;

    /**
     * Gets the IntegrationRuntimesInner object to access its operations.
     * @return the IntegrationRuntimesInner object.
     */
    public IntegrationRuntimesInner integrationRuntimes() {
        return this.integrationRuntimes;
    }

    /**
     * The IntegrationRuntimeNodesInner object to access its operations.
     */
    private IntegrationRuntimeNodesInner integrationRuntimeNodes;

    /**
     * Gets the IntegrationRuntimeNodesInner object to access its operations.
     * @return the IntegrationRuntimeNodesInner object.
     */
    public IntegrationRuntimeNodesInner integrationRuntimeNodes() {
        return this.integrationRuntimeNodes;
    }

    /**
     * The LinkedServicesInner object to access its operations.
     */
    private LinkedServicesInner linkedServices;

    /**
     * Gets the LinkedServicesInner object to access its operations.
     * @return the LinkedServicesInner object.
     */
    public LinkedServicesInner linkedServices() {
        return this.linkedServices;
    }

    /**
     * The DatasetsInner object to access its operations.
     */
    private DatasetsInner datasets;

    /**
     * Gets the DatasetsInner object to access its operations.
     * @return the DatasetsInner object.
     */
    public DatasetsInner datasets() {
        return this.datasets;
    }

    /**
     * The PipelinesInner object to access its operations.
     */
    private PipelinesInner pipelines;

    /**
     * Gets the PipelinesInner object to access its operations.
     * @return the PipelinesInner object.
     */
    public PipelinesInner pipelines() {
        return this.pipelines;
    }

    /**
     * The PipelineRunsInner object to access its operations.
     */
    private PipelineRunsInner pipelineRuns;

    /**
     * Gets the PipelineRunsInner object to access its operations.
     * @return the PipelineRunsInner object.
     */
    public PipelineRunsInner pipelineRuns() {
        return this.pipelineRuns;
    }

    /**
     * The ActivityRunsInner object to access its operations.
     */
    private ActivityRunsInner activityRuns;

    /**
     * Gets the ActivityRunsInner object to access its operations.
     * @return the ActivityRunsInner object.
     */
    public ActivityRunsInner activityRuns() {
        return this.activityRuns;
    }

    /**
     * The TriggersInner object to access its operations.
     */
    private TriggersInner triggers;

    /**
     * Gets the TriggersInner object to access its operations.
     * @return the TriggersInner object.
     */
    public TriggersInner triggers() {
        return this.triggers;
    }

    /**
     * Initializes an instance of DataFactoryManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public DataFactoryManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of DataFactoryManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public DataFactoryManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of DataFactoryManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public DataFactoryManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2017-09-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.factories = new FactoriesInner(restClient().retrofit(), this);
        this.integrationRuntimes = new IntegrationRuntimesInner(restClient().retrofit(), this);
        this.integrationRuntimeNodes = new IntegrationRuntimeNodesInner(restClient().retrofit(), this);
        this.linkedServices = new LinkedServicesInner(restClient().retrofit(), this);
        this.datasets = new DatasetsInner(restClient().retrofit(), this);
        this.pipelines = new PipelinesInner(restClient().retrofit(), this);
        this.pipelineRuns = new PipelineRunsInner(restClient().retrofit(), this);
        this.activityRuns = new ActivityRunsInner(restClient().retrofit(), this);
        this.triggers = new TriggersInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "DataFactoryManagementClient", "2017-09-01-preview");
    }
}
