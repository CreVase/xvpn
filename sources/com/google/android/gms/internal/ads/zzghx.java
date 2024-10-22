package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzghx extends zzgbe {
    private final zzgjc zza;

    public zzghx(zzgjc zzgjcVar, zzgch zzgchVar) throws GeneralSecurityException {
        zzc(zzgjcVar, zzgchVar);
        this.zza = zzgjcVar;
    }

    private static void zzc(zzgjc zzgjcVar, zzgch zzgchVar) throws GeneralSecurityException {
        int i = zzghw.zzb[zzgjcVar.zzb().ordinal()];
    }

    public final zzgjc zza(zzgch zzgchVar) throws GeneralSecurityException {
        zzc(this.zza, zzgchVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}
