package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class zzghv {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    public zzghv(Class cls, zzgiv... zzgivVarArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        for (int i = 0; i <= 0; i++) {
            zzgiv zzgivVar = zzgivVarArr[i];
            if (!hashMap.containsKey(zzgivVar.zzb())) {
                hashMap.put(zzgivVar.zzb(), zzgivVar);
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzgivVar.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzgivVarArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzghu zza() {
        throw null;
    }

    public abstract zzgoy zzb();

    public abstract zzgvj zzc(zzgsr zzgsrVar) throws zzgul;

    public abstract String zzd();

    public abstract void zze(zzgvj zzgvjVar) throws GeneralSecurityException;

    public int zzf() {
        return 1;
    }

    public final Class zzi() {
        return this.zzc;
    }

    public final Class zzj() {
        return this.zza;
    }

    public final Object zzk(zzgvj zzgvjVar, Class cls) throws GeneralSecurityException {
        zzgiv zzgivVar = (zzgiv) this.zzb.get(cls);
        if (zzgivVar != null) {
            return zzgivVar.zza(zzgvjVar);
        }
        throw new IllegalArgumentException(hx2.q("Requested primitive class ", cls.getCanonicalName(), " not supported."));
    }

    public final Set zzl() {
        return this.zzb.keySet();
    }
}
