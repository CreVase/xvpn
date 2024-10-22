package com.chartboost.sdk.impl;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes.dex */
public enum j7 {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(DevicePublicKeyStringDef.NONE);


    /* renamed from: a, reason: collision with root package name */
    public final String f937a;

    j7(String str) {
        this.f937a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f937a;
    }
}
