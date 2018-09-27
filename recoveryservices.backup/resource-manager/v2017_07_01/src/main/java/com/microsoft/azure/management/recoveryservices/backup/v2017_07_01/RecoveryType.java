/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for RecoveryType.
 */
public final class RecoveryType extends ExpandableStringEnum<RecoveryType> {
    /** Static value Invalid for RecoveryType. */
    public static final RecoveryType INVALID = fromString("Invalid");

    /** Static value OriginalLocation for RecoveryType. */
    public static final RecoveryType ORIGINAL_LOCATION = fromString("OriginalLocation");

    /** Static value AlternateLocation for RecoveryType. */
    public static final RecoveryType ALTERNATE_LOCATION = fromString("AlternateLocation");

    /** Static value RestoreDisks for RecoveryType. */
    public static final RecoveryType RESTORE_DISKS = fromString("RestoreDisks");

    /**
     * Creates or finds a RecoveryType from its string representation.
     * @param name a name to look for
     * @return the corresponding RecoveryType
     */
    @JsonCreator
    public static RecoveryType fromString(String name) {
        return fromString(name, RecoveryType.class);
    }

    /**
     * @return known RecoveryType values
     */
    public static Collection<RecoveryType> values() {
        return values(RecoveryType.class);
    }
}
