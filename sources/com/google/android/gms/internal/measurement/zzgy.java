package com.google.android.gms.internal.measurement;

import defpackage.nb1;

/* loaded from: classes.dex */
public final class zzgy {
    private final boolean zza;

    public zzgy(zzhb zzhbVar) {
        if (zzhbVar != null) {
            this.zza = !zzhbVar.zza();
            return;
        }
        throw new NullPointerException("BuildInfo must be non-null");
    }

    public final boolean zza(String str) {
        if (str != null) {
            if (!this.zza) {
                return true;
            }
            return ((nb1) zzha.zza.get()).c(str);
        }
        throw new NullPointerException("flagName must not be null");
    }
}
