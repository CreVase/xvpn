package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgka extends zzghv {
    private static final zzgiu zza = zzgiu.zzb(new zzgis() { // from class: com.google.android.gms.internal.ads.zzgjw
        @Override // com.google.android.gms.internal.ads.zzgis
        public final Object zza(zzgbe zzgbeVar) {
            return new zzgls((zzgjv) zzgbeVar);
        }
    }, zzgjv.class, zzgkl.class);
    private static final zzgiu zzb = zzgiu.zzb(new zzgis() { // from class: com.google.android.gms.internal.ads.zzgjx
        @Override // com.google.android.gms.internal.ads.zzgis
        public final Object zza(zzgbe zzgbeVar) {
            return zzgrt.zzb((zzgjv) zzgbeVar);
        }
    }, zzgjv.class, zzgbv.class);

    public zzgka() {
        super(zzgmn.class, new zzgjy(zzgbv.class));
    }

    public static void zzm(boolean z) throws GeneralSecurityException {
        zzgcg.zzf(new zzgka(), true);
        int i = zzgkk.zza;
        zzgkk.zza(zzgii.zzb());
        zzgif.zza().zze(zza);
        zzgif.zza().zze(zzb);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgmt zzgmtVar) throws GeneralSecurityException {
        if (zzgmtVar.zza() >= 10) {
            if (zzgmtVar.zza() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzo(int i) throws GeneralSecurityException {
        if (i == 32) {
        } else {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgjz(this, zzgmq.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgmn.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgmn zzgmnVar = (zzgmn) zzgvjVar;
        zzgrv.zzb(zzgmnVar.zza(), 0);
        zzo(zzgmnVar.zzg().zzd());
        zzn(zzgmnVar.zzf());
    }
}
