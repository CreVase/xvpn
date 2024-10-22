package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class zzgiq {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzgiq(Class cls, Class cls2, zzgip zzgipVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzgiq zzb(zzgio zzgioVar, Class cls, Class cls2) {
        return new zzgin(cls, cls2, zzgioVar);
    }

    public abstract zzgjh zza(zzgbw zzgbwVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
