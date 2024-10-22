package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgkx extends zzghv {
    private static final zzgiu zza = zzgiu.zzb(new zzgis() { // from class: com.google.android.gms.internal.ads.zzgkt
        @Override // com.google.android.gms.internal.ads.zzgis
        public final Object zza(zzgbe zzgbeVar) {
            return new zzglt((zzgks) zzgbeVar);
        }
    }, zzgks.class, zzgkl.class);
    private static final zzgiu zzb = zzgiu.zzb(new zzgis() { // from class: com.google.android.gms.internal.ads.zzgku
        @Override // com.google.android.gms.internal.ads.zzgis
        public final Object zza(zzgbe zzgbeVar) {
            return zzgrt.zzc((zzgks) zzgbeVar);
        }
    }, zzgks.class, zzgbv.class);

    public zzgkx() {
        super(zzgoo.class, new zzgkv(zzgbv.class));
    }

    public static void zzh(boolean z) throws GeneralSecurityException {
        zzgcg.zzf(new zzgkx(), true);
        int i = zzgly.zza;
        zzgly.zzc(zzgii.zzb());
        zzgif.zza().zze(zza);
        zzgif.zza().zze(zzb);
    }

    public static final void zzm(zzgoo zzgooVar) throws GeneralSecurityException {
        zzgrv.zzb(zzgooVar.zza(), 0);
        if (zzgooVar.zzh().zzd() >= 16) {
            zzn(zzgooVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzn(zzgou zzgouVar) throws GeneralSecurityException {
        if (zzgouVar.zza() >= 10) {
            zzgol zzgolVar = zzgol.UNKNOWN_HASH;
            int ordinal = zzgouVar.zzc().ordinal();
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                if (zzgouVar.zza() > 28) {
                                    throw new GeneralSecurityException("tag size too big");
                                }
                                return;
                            }
                            throw new GeneralSecurityException("unknown hash type");
                        }
                        if (zzgouVar.zza() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    if (zzgouVar.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                }
                if (zzgouVar.zza() > 48) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (zzgouVar.zza() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgkw(this, zzgor.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgoo.zzf(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzm((zzgoo) zzgvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final int zzf() {
        return 2;
    }
}
