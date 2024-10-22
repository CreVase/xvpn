package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes.dex */
public abstract class zzfss implements Serializable {
    public static zzfss zzc() {
        return zzfsa.zza;
    }

    public static zzfss zzd(Object obj) {
        if (obj == null) {
            return zzfsa.zza;
        }
        return new zzftb(obj);
    }

    public abstract zzfss zza(zzfsk zzfskVar);

    public abstract Object zzb(Object obj);
}
