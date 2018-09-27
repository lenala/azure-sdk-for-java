/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in SecurityPINs.
 */
public class SecurityPINsInner {
    /** The Retrofit service to perform REST calls. */
    private SecurityPINsService service;
    /** The service client containing this operation class. */
    private RecoveryServicesBackupClientImpl client;

    /**
     * Initializes an instance of SecurityPINsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public SecurityPINsInner(Retrofit retrofit, RecoveryServicesBackupClientImpl client) {
        this.service = retrofit.create(SecurityPINsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for SecurityPINs to be
     * used by Retrofit to perform actually REST calls.
     */
    interface SecurityPINsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.recoveryservices.backup.v2017_07_01.SecurityPINs get" })
        @POST("Subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.RecoveryServices/vaults/{vaultName}/backupSecurityPIN")
        Observable<Response<ResponseBody>> get(@Path("vaultName") String vaultName, @Path("resourceGroupName") String resourceGroupName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Get the security PIN.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TokenInformationInner object if successful.
     */
    public TokenInformationInner get(String vaultName, String resourceGroupName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName).toBlocking().single().body();
    }

    /**
     * Get the security PIN.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TokenInformationInner> getAsync(String vaultName, String resourceGroupName, final ServiceCallback<TokenInformationInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(vaultName, resourceGroupName), serviceCallback);
    }

    /**
     * Get the security PIN.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TokenInformationInner object
     */
    public Observable<TokenInformationInner> getAsync(String vaultName, String resourceGroupName) {
        return getWithServiceResponseAsync(vaultName, resourceGroupName).map(new Func1<ServiceResponse<TokenInformationInner>, TokenInformationInner>() {
            @Override
            public TokenInformationInner call(ServiceResponse<TokenInformationInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Get the security PIN.
     *
     * @param vaultName The name of the recovery services vault.
     * @param resourceGroupName The name of the resource group where the recovery services vault is present.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TokenInformationInner object
     */
    public Observable<ServiceResponse<TokenInformationInner>> getWithServiceResponseAsync(String vaultName, String resourceGroupName) {
        if (vaultName == null) {
            throw new IllegalArgumentException("Parameter vaultName is required and cannot be null.");
        }
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2016-12-01";
        return service.get(vaultName, resourceGroupName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TokenInformationInner>>>() {
                @Override
                public Observable<ServiceResponse<TokenInformationInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TokenInformationInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TokenInformationInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TokenInformationInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TokenInformationInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
