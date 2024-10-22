package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgvr {
    private static final zzgvr zza = new zzgvr();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzgwd zzb = new zzgvb();

    private zzgvr() {
    }

    public static zzgvr zza() {
        return zza;
    }

    public final zzgwc zzb(Class cls) {
        zzguj.zzc(cls, "messageType");
        zzgwc zzgwcVar = (zzgwc) this.zzc.get(cls);
        if (zzgwcVar == null) {
            zzgwcVar = this.zzb.zza(cls);
            zzguj.zzc(cls, "messageType");
            zzgwc zzgwcVar2 = (zzgwc) this.zzc.putIfAbsent(cls, zzgwcVar);
            if (zzgwcVar2 != null) {
                return zzgwcVar2;
            }
        }
        return zzgwcVar;
    }
}
