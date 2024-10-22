package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgbg implements zzgbf {
    private final zzghv zza;
    private final Class zzb;

    public zzgbg(zzghv zzghvVar, Class cls) {
        if (!zzghvVar.zzl().contains(cls) && !Void.class.equals(cls)) {
            throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", zzghvVar.toString(), cls.getName()));
        }
        this.zza = zzghvVar;
        this.zzb = cls;
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final zzgoz zza(zzgsr zzgsrVar) throws GeneralSecurityException {
        try {
            zzghu zza = this.zza.zza();
            zzgvj zzb = zza.zzb(zzgsrVar);
            zza.zzd(zzb);
            zzgvj zza2 = zza.zza(zzb);
            zzgow zza3 = zzgoz.zza();
            zza3.zzb(this.zza.zzd());
            zza3.zzc(zza2.zzau());
            zza3.zza(this.zza.zzb());
            return (zzgoz) zza3.zzal();
        } catch (zzgul e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final Object zzb(zzgsr zzgsrVar) throws GeneralSecurityException {
        try {
            zzgvj zzc = this.zza.zzc(zzgsrVar);
            if (!Void.class.equals(this.zzb)) {
                this.zza.zze(zzc);
                return this.zza.zzk(zzc, this.zzb);
            }
            throw new GeneralSecurityException("Cannot create a primitive for Void");
        } catch (zzgul e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(this.zza.zzj().getName()), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgbf
    public final String zzc() {
        return this.zza.zzd();
    }
}
