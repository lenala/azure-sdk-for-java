/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in BackupProtectionContainers.
 */
public class BackupProtectionContainersInner {
    /** The Retrofit service to perform REST calls. */
    private BackupProtectionContainersService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of BackupProtectionContainersInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public BackupProtectionContainersInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(BackupProtectionContainersService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for BackupProtectionContainers to be
     * used by Retrofit to perform actually REST calls.
     */
    interface BackupProtectionContainersService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.BackupProtectionContainers list" })
        @GET("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupProtectionContainers")
        Observable<Response<ResponseBody>> list(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Query("$filter") String filter, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2016_12_01.BackupProtectionContainers listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProtectionContainerResourceInner&gt; object if successful.
     */
    public PagedList<ProtectionContainerResourceInner> list(final String vaultName, final String resourceGroupName) {
        ServiceResponse<Page<ProtectionContainerResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName).toBlocking().single();
        return new PagedList<ProtectionContainerResourceInner>(response.body()) {
            @Override
            public Page<ProtectionContainerResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectionContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final ListOperationCallback<ProtectionContainerResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName),
            new Func1<String, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectionContainerResourceInner&gt; object
     */
    public Observable<Page<ProtectionContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName)
            .map(new Func1<ServiceResponse<Page<ProtectionContainerResourceInner>>, Page<ProtectionContainerResourceInner>>() {
                @Override
                public Page<ProtectionContainerResourceInner> call(ServiceResponse<Page<ProtectionContainerResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectionContainerResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName) {
        return listSinglePageAsync(vaultName, resourceGroupName)
            .concatMap(new Func1<ServiceResponse<Page<ProtectionContainerResourceInner>>, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(ServiceResponse<Page<ProtectionContainerResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProtectionContainerResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        final String filter = null;
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectionContainerResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProtectionContainerResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProtectionContainerResourceInner&gt; object if successful.
     */
    public PagedList<ProtectionContainerResourceInner> list(final String vaultName, final String resourceGroupName, final String filter) {
        ServiceResponse<Page<ProtectionContainerResourceInner>> response = listSinglePageAsync(vaultName, resourceGroupName, filter).toBlocking().single();
        return new PagedList<ProtectionContainerResourceInner>(response.body()) {
            @Override
            public Page<ProtectionContainerResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectionContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter, final ListOperationCallback<ProtectionContainerResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(vaultName, resourceGroupName, filter),
            new Func1<String, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectionContainerResourceInner&gt; object
     */
    public Observable<Page<ProtectionContainerResourceInner>> listAsync(final String vaultName, final String resourceGroupName, final String filter) {
        return listWithServiceResponseAsync(vaultName, resourceGroupName, filter)
            .map(new Func1<ServiceResponse<Page<ProtectionContainerResourceInner>>, Page<ProtectionContainerResourceInner>>() {
                @Override
                public Page<ProtectionContainerResourceInner> call(ServiceResponse<Page<ProtectionContainerResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectionContainerResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> listWithServiceResponseAsync(final String vaultName, final String resourceGroupName, final String filter) {
        return listSinglePageAsync(vaultName, resourceGroupName, filter)
            .concatMap(new Func1<ServiceResponse<Page<ProtectionContainerResourceInner>>, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(ServiceResponse<Page<ProtectionContainerResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
    ServiceResponse<PageImpl<ProtectionContainerResourceInner>> * @param vaultName The name of the recovery services vault.
    ServiceResponse<PageImpl<ProtectionContainerResourceInner>> * @param resourceGroupName The name of the resource group where the recovery services vault is present.
    ServiceResponse<PageImpl<ProtectionContainerResourceInner>> * @param filter OData filter options.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProtectionContainerResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> listSinglePageAsync(final String vaultName, final String resourceGroupName, final String filter) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(vaultName, resourceGroupName, this.client.subscriptionId(), this.client.apiVersion(), filter, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectionContainerResourceInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProtectionContainerResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProtectionContainerResourceInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProtectionContainerResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProtectionContainerResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ProtectionContainerResourceInner&gt; object if successful.
     */
    public PagedList<ProtectionContainerResourceInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ProtectionContainerResourceInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ProtectionContainerResourceInner>(response.body()) {
            @Override
            public Page<ProtectionContainerResourceInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ProtectionContainerResourceInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ProtectionContainerResourceInner>> serviceFuture, final ListOperationCallback<ProtectionContainerResourceInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectionContainerResourceInner&gt; object
     */
    public Observable<Page<ProtectionContainerResourceInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ProtectionContainerResourceInner>>, Page<ProtectionContainerResourceInner>>() {
                @Override
                public Page<ProtectionContainerResourceInner> call(ServiceResponse<Page<ProtectionContainerResourceInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ProtectionContainerResourceInner&gt; object
     */
    public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ProtectionContainerResourceInner>>, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(ServiceResponse<Page<ProtectionContainerResourceInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Lists the containers registered to Recovery Services Vault.
     *
    ServiceResponse<PageImpl<ProtectionContainerResourceInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ProtectionContainerResourceInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ProtectionContainerResourceInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ProtectionContainerResourceInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ProtectionContainerResourceInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ProtectionContainerResourceInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ProtectionContainerResourceInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ProtectionContainerResourceInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
