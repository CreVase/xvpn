package com.google.android.gms.internal.consent_sdk;

import defpackage.w01;

/* loaded from: classes.dex */
public final class zzi extends Exception {
    private final int zza;

    public zzi(int i, String str) {
        super(str);
        this.zza = i;
    }

    public final w01 zza() {
        if (getCause() == null) {
            getMessage();
        } else {
            getMessage();
            getCause();
        }
        return new w01(this.zza, getMessage());
    }

    public zzi(int i, String str, Throwable th) {
        super(str, th);
        this.zza = i;
    }
}
