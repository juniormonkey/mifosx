/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.infrastructure.configuration.data;

/**
 * Immutable data object for global configuration property.
 */
public class GlobalConfigurationPropertyData {

    @SuppressWarnings("unused")
    private final String name;
    @SuppressWarnings("unused")
    private final boolean enabled;
    @SuppressWarnings("unused")
    private final Long value;
    @SuppressWarnings("unused")
    private final Long id;

    public GlobalConfigurationPropertyData(final String name, final boolean enabled, final Long value) {
        this.name = name;
        this.enabled = enabled;
        this.value = value;
        this.id = null;
    }

    public GlobalConfigurationPropertyData(final String name, final boolean enabled, final Long value, final Long id) {
        this.name = name;
        this.enabled = enabled;
        this.value = value;
        this.id = id;
    }
}