package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzghk {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzghk(Map map, Map map2, zzghj zzghjVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzghi zza() {
        return new zzghi(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r0 = (Enum) this.zzb.get(obj);
        if (r0 != null) {
            return r0;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r3) throws GeneralSecurityException {
        Object obj = this.zza.get(r3);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r3)));
    }
}
