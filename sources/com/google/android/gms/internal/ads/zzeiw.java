package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* loaded from: classes.dex */
public final class zzeiw {
    private zzeio zza;

    public zzeiw() {
    }

    private zzeiw(zzeio zzeioVar) {
        this.zza = zzeioVar;
    }

    public static zzeiw zzb(zzeio zzeioVar) {
        return new zzeiw(zzeioVar);
    }

    public final zzeio zza(Clock clock, zzeip zzeipVar, zzeez zzeezVar, zzfjx zzfjxVar) {
        zzeio zzeioVar = this.zza;
        if (zzeioVar != null) {
            return zzeioVar;
        }
        return new zzeio(clock, zzeipVar, zzeezVar, zzfjxVar);
    }
}
