package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgif {
    private static final zzgif zza = new zzgif();
    private final AtomicReference zzb = new AtomicReference(new zzgjb(new zzgix(null), null));

    public static zzgif zza() {
        return zza;
    }

    public final Class zzb(Class cls) throws GeneralSecurityException {
        return ((zzgjb) this.zzb.get()).zza(cls);
    }

    public final Object zzc(zzgbe zzgbeVar, Class cls) throws GeneralSecurityException {
        return ((zzgjb) this.zzb.get()).zzb(zzgbeVar, cls);
    }

    public final Object zzd(zzgcd zzgcdVar, Class cls) throws GeneralSecurityException {
        return ((zzgjb) this.zzb.get()).zzc(zzgcdVar, cls);
    }

    public final synchronized void zze(zzgiu zzgiuVar) throws GeneralSecurityException {
        zzgix zzgixVar = new zzgix((zzgjb) this.zzb.get(), null);
        zzgixVar.zza(zzgiuVar);
        this.zzb.set(new zzgjb(zzgixVar, null));
    }

    public final synchronized void zzf(zzgce zzgceVar) throws GeneralSecurityException {
        zzgix zzgixVar = new zzgix((zzgjb) this.zzb.get(), null);
        zzgixVar.zzb(zzgceVar);
        this.zzb.set(new zzgjb(zzgixVar, null));
    }
}
