package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgly {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzghk zzc;
    private static final zzghk zzd;
    private static final zzgiq zze;
    private static final zzgim zzf;
    private static final zzght zzg;
    private static final zzghp zzh;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.HmacKey");
        zzb = zza2;
        zzghi zza3 = zzghk.zza();
        zza3.zza(zzgqf.RAW, zzglb.zzd);
        zza3.zza(zzgqf.TINK, zzglb.zza);
        zza3.zza(zzgqf.LEGACY, zzglb.zzc);
        zza3.zza(zzgqf.CRUNCHY, zzglb.zzb);
        zzc = zza3.zzb();
        zzghi zza4 = zzghk.zza();
        zza4.zza(zzgol.SHA1, zzgla.zza);
        zza4.zza(zzgol.SHA224, zzgla.zzb);
        zza4.zza(zzgol.SHA256, zzgla.zzc);
        zza4.zza(zzgol.SHA384, zzgla.zzd);
        zza4.zza(zzgol.SHA512, zzgla.zze);
        zzd = zza4.zzb();
        zze = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzglu
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                return zzgly.zza((zzgld) zzgbwVar);
            }
        }, zzgld.class, zzgjd.class);
        zzf = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzglv
        }, zza2, zzgjd.class);
        zzg = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzglw
        }, zzgks.class, zzgjc.class);
        zzh = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzglx
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                return zzgly.zzb((zzgjc) zzgjhVar, zzgchVar);
            }
        }, zza2, zzgjc.class);
    }

    public static /* synthetic */ zzgjd zza(zzgld zzgldVar) {
        zzgpd zza2 = zzgpe.zza();
        zza2.zzb("type.googleapis.com/google.crypto.tink.HmacKey");
        zzgoq zzc2 = zzgor.zzc();
        zzgot zzd2 = zzgou.zzd();
        zzd2.zzb(zzgldVar.zza());
        zzd2.zza((zzgol) zzd.zzb(zzgldVar.zze()));
        zzc2.zzb((zzgou) zzd2.zzal());
        zzc2.zza(zzgldVar.zzb());
        zza2.zzc(((zzgor) zzc2.zzal()).zzau());
        zza2.zza((zzgqf) zzc.zzb(zzgldVar.zzf()));
        return zzgjd.zza((zzgpe) zza2.zzal());
    }

    public static /* synthetic */ zzgks zzb(zzgjc zzgjcVar, zzgch zzgchVar) {
        if (zzgjcVar.zzg().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            try {
                zzgoo zzf2 = zzgoo.zzf(zzgjcVar.zze(), zzgtl.zza());
                if (zzf2.zza() == 0) {
                    zzgkz zzd2 = zzgld.zzd();
                    zzd2.zzb(zzf2.zzh().zzd());
                    zzd2.zzc(zzf2.zzg().zza());
                    zzd2.zza((zzgla) zzd.zzc(zzf2.zzg().zzc()));
                    zzd2.zzd((zzglb) zzc.zzc(zzgjcVar.zzc()));
                    zzgld zze2 = zzd2.zze();
                    zzgkq zza2 = zzgks.zza();
                    zza2.zzc(zze2);
                    zza2.zzb(zzgry.zzb(zzf2.zzh().zzA(), zzgchVar));
                    zza2.zza(zzgjcVar.zzf());
                    return zza2.zzd();
                }
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            } catch (zzgul | IllegalArgumentException unused) {
                throw new GeneralSecurityException("Parsing HmacKey failed");
            }
        }
        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
    }

    public static void zzc(zzgii zzgiiVar) throws GeneralSecurityException {
        zzgiiVar.zzg(zze);
        zzgiiVar.zzf(zzf);
        zzgiiVar.zze(zzg);
        zzgiiVar.zzd(zzh);
    }
}
