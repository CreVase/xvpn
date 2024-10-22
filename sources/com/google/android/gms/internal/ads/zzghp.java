package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public abstract class zzghp {
    private final zzgrx zza;
    private final Class zzb;

    public /* synthetic */ zzghp(zzgrx zzgrxVar, Class cls, zzgho zzghoVar) {
        this.zza = zzgrxVar;
        this.zzb = cls;
    }

    public static zzghp zzb(zzghn zzghnVar, zzgrx zzgrxVar, Class cls) {
        return new zzghm(zzgrxVar, cls, zzghnVar);
    }

    public abstract zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) throws GeneralSecurityException;

    public final zzgrx zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}
