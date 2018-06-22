/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_03_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.storage.v2018_03_01_preview.implementation.StorageManager;
import com.microsoft.azure.management.storage.v2018_03_01_preview.implementation.SkuInner;
import org.joda.time.DateTime;
import com.microsoft.azure.management.storage.v2018_03_01_preview.implementation.StorageAccountInner;

/**
 * Type representing StorageAccount.
 */
public interface StorageAccount extends HasInner<StorageAccountInner>, Resource, GroupableResourceCore<StorageManager, StorageAccountInner>, HasResourceGroup, Refreshable<StorageAccount>, Updatable<StorageAccount.Update>, HasManager<StorageManager> {
    /**
     * @return the accessTier value.
     */
    AccessTier accessTier();

    /**
     * @return the creationTime value.
     */
    DateTime creationTime();

    /**
     * @return the customDomain value.
     */
    CustomDomain customDomain();

    /**
     * @return the enableHttpsTrafficOnly value.
     */
    Boolean enableHttpsTrafficOnly();

    /**
     * @return the encryption value.
     */
    Encryption encryption();

    /**
     * @return the identity value.
     */
    Identity identity();

    /**
     * @return the isHnsEnabled value.
     */
    Boolean isHnsEnabled();

    /**
     * @return the kind value.
     */
    Kind kind();

    /**
     * @return the lastGeoFailoverTime value.
     */
    DateTime lastGeoFailoverTime();

    /**
     * @return the networkRuleSet value.
     */
    NetworkRuleSet networkRuleSet();

    /**
     * @return the primaryEndpoints value.
     */
    Endpoints primaryEndpoints();

    /**
     * @return the primaryLocation value.
     */
    String primaryLocation();

    /**
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * @return the secondaryEndpoints value.
     */
    Endpoints secondaryEndpoints();

    /**
     * @return the secondaryLocation value.
     */
    String secondaryLocation();

    /**
     * @return the sku value.
     */
    Sku sku();

    /**
     * @return the statusOfPrimary value.
     */
    AccountStatus statusOfPrimary();

    /**
     * @return the statusOfSecondary value.
     */
    AccountStatus statusOfSecondary();

    /**
     * The entirety of the StorageAccount definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithKind, DefinitionStages.WithSku, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of StorageAccount definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a StorageAccount definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the StorageAccount definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithKind> {
        }

        /**
         * The stage of the storageaccount definition allowing to specify Kind.
         */
        interface WithKind {
           /**
            * Specifies kind.
            */
            WithSku withKind(Kind kind);
        }

        /**
         * The stage of the storageaccount definition allowing to specify Sku.
         */
        interface WithSku {
           /**
            * Specifies sku.
            */
            WithCreate withSku(SkuInner sku);
        }

        /**
         * The stage of the storageaccount update allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             */
            WithCreate withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the storageaccount update allowing to specify CustomDomain.
         */
        interface WithCustomDomain {
            /**
             * Specifies customDomain.
             */
            WithCreate withCustomDomain(CustomDomain customDomain);
        }

        /**
         * The stage of the storageaccount update allowing to specify EnableHttpsTrafficOnly.
         */
        interface WithEnableHttpsTrafficOnly {
            /**
             * Specifies enableHttpsTrafficOnly.
             */
            WithCreate withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly);
        }

        /**
         * The stage of the storageaccount update allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             */
            WithCreate withEncryption(Encryption encryption);
        }

        /**
         * The stage of the storageaccount update allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            WithCreate withIdentity(Identity identity);
        }

        /**
         * The stage of the storageaccount update allowing to specify IsHnsEnabled.
         */
        interface WithIsHnsEnabled {
            /**
             * Specifies isHnsEnabled.
             */
            WithCreate withIsHnsEnabled(Boolean isHnsEnabled);
        }

        /**
         * The stage of the storageaccount update allowing to specify NetworkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies networkRuleSet.
             */
            WithCreate withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<StorageAccount>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithAccessTier, DefinitionStages.WithCustomDomain, DefinitionStages.WithEnableHttpsTrafficOnly, DefinitionStages.WithEncryption, DefinitionStages.WithIdentity, DefinitionStages.WithIsHnsEnabled, DefinitionStages.WithNetworkRuleSet {
        }
    }
    /**
     * The template for a StorageAccount update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<StorageAccount>, Resource.UpdateWithTags<Update>, UpdateStages.WithAccessTier, UpdateStages.WithCustomDomain, UpdateStages.WithEnableHttpsTrafficOnly, UpdateStages.WithEncryption, UpdateStages.WithIdentity, UpdateStages.WithKind, UpdateStages.WithNetworkRuleSet, UpdateStages.WithSku {
    }

    /**
     * Grouping of StorageAccount update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the storageaccount {0} allowing to specify AccessTier.
         */
        interface WithAccessTier {
            /**
             * Specifies accessTier.
             */
            Update withAccessTier(AccessTier accessTier);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify CustomDomain.
         */
        interface WithCustomDomain {
            /**
             * Specifies customDomain.
             */
            Update withCustomDomain(CustomDomain customDomain);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify EnableHttpsTrafficOnly.
         */
        interface WithEnableHttpsTrafficOnly {
            /**
             * Specifies enableHttpsTrafficOnly.
             */
            Update withEnableHttpsTrafficOnly(Boolean enableHttpsTrafficOnly);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify Encryption.
         */
        interface WithEncryption {
            /**
             * Specifies encryption.
             */
            Update withEncryption(Encryption encryption);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify Identity.
         */
        interface WithIdentity {
            /**
             * Specifies identity.
             */
            Update withIdentity(Identity identity);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify Kind.
         */
        interface WithKind {
            /**
             * Specifies kind.
             */
            Update withKind(Kind kind);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify NetworkRuleSet.
         */
        interface WithNetworkRuleSet {
            /**
             * Specifies networkRuleSet.
             */
            Update withNetworkRuleSet(NetworkRuleSet networkRuleSet);
        }

        /**
         * The stage of the storageaccount {0} allowing to specify Sku.
         */
        interface WithSku {
            /**
             * Specifies sku.
             */
            Update withSku(SkuInner sku);
        }

    }
}
