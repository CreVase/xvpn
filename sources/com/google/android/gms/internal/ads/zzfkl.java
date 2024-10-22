package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.DevicePublicKeyStringDef;

/* loaded from: classes.dex */
public enum zzfkl {
    NATIVE("native"),
    JAVASCRIPT("javascript"),
    NONE(DevicePublicKeyStringDef.NONE);

    private final String zze;

    zzfkl(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
