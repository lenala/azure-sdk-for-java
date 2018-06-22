/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2017_10_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The restriction because of which SKU cannot be used.
 */
public class Restriction {
    /**
     * The type of restrictions. As of now only possible value for this is
     * location.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The value of restrictions. If the restriction type is set to location.
     * This would be different locations where the SKU is restricted.
     */
    @JsonProperty(value = "values", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> values;

    /**
     * The reason for the restriction. As of now this can be “QuotaId” or
     * “NotAvailableForSubscription”. Quota Id is set when the SKU has
     * requiredQuotas parameter as the subscription does not belong to that
     * quota. The “NotAvailableForSubscription” is related to capacity at DC.
     * Possible values include: 'QuotaId', 'NotAvailableForSubscription'.
     */
    @JsonProperty(value = "reasonCode")
    private ReasonCode reasonCode;

    /**
     * Get the type of restrictions. As of now only possible value for this is location.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the value of restrictions. If the restriction type is set to location. This would be different locations where the SKU is restricted.
     *
     * @return the values value
     */
    public List<String> values() {
        return this.values;
    }

    /**
     * Get the reason for the restriction. As of now this can be “QuotaId” or “NotAvailableForSubscription”. Quota Id is set when the SKU has requiredQuotas parameter as the subscription does not belong to that quota. The “NotAvailableForSubscription” is related to capacity at DC. Possible values include: 'QuotaId', 'NotAvailableForSubscription'.
     *
     * @return the reasonCode value
     */
    public ReasonCode reasonCode() {
        return this.reasonCode;
    }

    /**
     * Set the reason for the restriction. As of now this can be “QuotaId” or “NotAvailableForSubscription”. Quota Id is set when the SKU has requiredQuotas parameter as the subscription does not belong to that quota. The “NotAvailableForSubscription” is related to capacity at DC. Possible values include: 'QuotaId', 'NotAvailableForSubscription'.
     *
     * @param reasonCode the reasonCode value to set
     * @return the Restriction object itself.
     */
    public Restriction withReasonCode(ReasonCode reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }

}
