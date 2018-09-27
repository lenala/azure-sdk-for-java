/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.automation.v2015_10_31;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for AutomationAccountState.
 */
public final class AutomationAccountState extends ExpandableStringEnum<AutomationAccountState> {
    /** Static value Ok for AutomationAccountState. */
    public static final AutomationAccountState OK = fromString("Ok");

    /** Static value Unavailable for AutomationAccountState. */
    public static final AutomationAccountState UNAVAILABLE = fromString("Unavailable");

    /** Static value Suspended for AutomationAccountState. */
    public static final AutomationAccountState SUSPENDED = fromString("Suspended");

    /**
     * Creates or finds a AutomationAccountState from its string representation.
     * @param name a name to look for
     * @return the corresponding AutomationAccountState
     */
    @JsonCreator
    public static AutomationAccountState fromString(String name) {
        return fromString(name, AutomationAccountState.class);
    }

    /**
     * @return known AutomationAccountState values
     */
    public static Collection<AutomationAccountState> values() {
        return values(AutomationAccountState.class);
    }
}
