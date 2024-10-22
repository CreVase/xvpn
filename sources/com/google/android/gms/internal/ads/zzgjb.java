package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgjb {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgjb(zzgix zzgixVar, zzgja zzgjaVar) {
        Map map;
        Map map2;
        map = zzgixVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgixVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public final Class zza(Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            return ((zzgce) this.zzb.get(cls)).zza();
        }
        throw new GeneralSecurityException(hx2.q("No input primitive class for ", cls.toString(), " available"));
    }

    public final Object zzb(zzgbe zzgbeVar, Class cls) throws GeneralSecurityException {
        zzgiz zzgizVar = new zzgiz(zzgbeVar.getClass(), cls, null);
        if (this.zza.containsKey(zzgizVar)) {
            return ((zzgiu) this.zza.get(zzgizVar)).zza(zzgbeVar);
        }
        throw new GeneralSecurityException(hx2.q("No PrimitiveConstructor for ", zzgizVar.toString(), " available"));
    }

    public final Object zzc(zzgcd zzgcdVar, Class cls) throws GeneralSecurityException {
        if (this.zzb.containsKey(cls)) {
            zzgce zzgceVar = (zzgce) this.zzb.get(cls);
            if (zzgcdVar.zzc().equals(zzgceVar.zza()) && zzgceVar.zza().equals(zzgcdVar.zzc())) {
                return zzgceVar.zzc(zzgcdVar);
            }
            throw new GeneralSecurityException("Input primitive type of the wrapper doesn't match the type of primitives in the provided PrimitiveSet");
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
    }
}
