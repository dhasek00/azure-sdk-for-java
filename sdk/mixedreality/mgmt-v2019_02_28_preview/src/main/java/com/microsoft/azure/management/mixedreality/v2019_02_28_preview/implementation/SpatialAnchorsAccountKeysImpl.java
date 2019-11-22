/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mixedreality.v2019_02_28_preview.implementation;

import com.microsoft.azure.management.mixedreality.v2019_02_28_preview.SpatialAnchorsAccountKeys;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;

class SpatialAnchorsAccountKeysImpl extends WrapperImpl<SpatialAnchorsAccountKeysInner> implements SpatialAnchorsAccountKeys {
    private final MixedRealityManager manager;
    SpatialAnchorsAccountKeysImpl(SpatialAnchorsAccountKeysInner inner, MixedRealityManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public MixedRealityManager manager() {
        return this.manager;
    }

    @Override
    public String primaryKey() {
        return this.inner().primaryKey();
    }

    @Override
    public String secondaryKey() {
        return this.inner().secondaryKey();
    }

}