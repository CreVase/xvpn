package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class zzgiu {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgiu(Class cls, Class cls2, zzgit zzgitVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgiu zzb(zzgis zzgisVar, Class cls, Class cls2) {
        return new zzgir(cls, cls2, zzgisVar);
    }

    public abstract Object zza(zzgbe zzgbeVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
