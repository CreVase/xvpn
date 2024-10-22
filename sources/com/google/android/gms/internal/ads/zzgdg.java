package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgdg {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzgiq zzc;
    private static final zzgim zzd;
    private static final zzght zze;
    private static final zzghp zzf;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zzb = zza2;
        zzc = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzgdc
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                zzgol zzgolVar;
                zzgqf zzgqfVar;
                zzgdb zzgdbVar = (zzgdb) zzgbwVar;
                int i = zzgdg.zza;
                zzgpd zza3 = zzgpe.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
                zzgmy zza4 = zzgmz.zza();
                zzgne zzc2 = zzgnf.zzc();
                zzgnh zzc3 = zzgni.zzc();
                zzc3.zza(zzgdbVar.zzc());
                zzc2.zzb((zzgni) zzc3.zzal());
                zzc2.zza(zzgdbVar.zza());
                zza4.zza((zzgnf) zzc2.zzal());
                zzgoq zzc4 = zzgor.zzc();
                zzgot zzd2 = zzgou.zzd();
                zzd2.zzb(zzgdbVar.zzd());
                zzgcy zze2 = zzgdbVar.zze();
                if (zzgcy.zza.equals(zze2)) {
                    zzgolVar = zzgol.SHA1;
                } else if (zzgcy.zzb.equals(zze2)) {
                    zzgolVar = zzgol.SHA224;
                } else if (zzgcy.zzc.equals(zze2)) {
                    zzgolVar = zzgol.SHA256;
                } else if (zzgcy.zzd.equals(zze2)) {
                    zzgolVar = zzgol.SHA384;
                } else if (zzgcy.zze.equals(zze2)) {
                    zzgolVar = zzgol.SHA512;
                } else {
                    throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zze2)));
                }
                zzd2.zza(zzgolVar);
                zzc4.zzb((zzgou) zzd2.zzal());
                zzc4.zza(zzgdbVar.zzb());
                zza4.zzb((zzgor) zzc4.zzal());
                zza3.zzc(((zzgmz) zza4.zzal()).zzau());
                zzgcz zzf2 = zzgdbVar.zzf();
                if (zzgcz.zza.equals(zzf2)) {
                    zzgqfVar = zzgqf.TINK;
                } else if (zzgcz.zzb.equals(zzf2)) {
                    zzgqfVar = zzgqf.CRUNCHY;
                } else if (zzgcz.zzc.equals(zzf2)) {
                    zzgqfVar = zzgqf.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzf2)));
                }
                zza3.zza(zzgqfVar);
                return zzgjd.zza((zzgpe) zza3.zzal());
            }
        }, zzgdb.class, zzgjd.class);
        zzd = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzgdd
        }, zza2, zzgjd.class);
        zze = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzgde
        }, zzgcs.class, zzgjc.class);
        zzf = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzgdf
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                zzgcy zzgcyVar;
                zzgcz zzgczVar;
                int i = zzgdg.zza;
                if (((zzgjc) zzgjhVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                    try {
                        zzgmw zze2 = zzgmw.zze(((zzgjc) zzgjhVar).zze(), zzgtl.zza());
                        if (zze2.zza() == 0) {
                            if (zze2.zzf().zza() == 0) {
                                if (zze2.zzg().zza() == 0) {
                                    zzgcx zzgcxVar = new zzgcx(null);
                                    zzgcxVar.zza(zze2.zzf().zzh().zzd());
                                    zzgcxVar.zzc(zze2.zzg().zzh().zzd());
                                    zzgcxVar.zzd(zze2.zzf().zzg().zza());
                                    zzgcxVar.zze(zze2.zzg().zzg().zza());
                                    zzgol zzc2 = zze2.zzg().zzg().zzc();
                                    zzgol zzgolVar = zzgol.UNKNOWN_HASH;
                                    zzgqf zzgqfVar = zzgqf.UNKNOWN_PREFIX;
                                    int ordinal = zzc2.ordinal();
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            if (ordinal != 3) {
                                                if (ordinal != 4) {
                                                    if (ordinal == 5) {
                                                        zzgcyVar = zzgcy.zzb;
                                                    } else {
                                                        throw new GeneralSecurityException("Unable to parse HashType: " + zzc2.zza());
                                                    }
                                                } else {
                                                    zzgcyVar = zzgcy.zze;
                                                }
                                            } else {
                                                zzgcyVar = zzgcy.zzc;
                                            }
                                        } else {
                                            zzgcyVar = zzgcy.zzd;
                                        }
                                    } else {
                                        zzgcyVar = zzgcy.zza;
                                    }
                                    zzgcxVar.zzb(zzgcyVar);
                                    zzgqf zzc3 = ((zzgjc) zzgjhVar).zzc();
                                    int ordinal2 = zzc3.ordinal();
                                    if (ordinal2 != 1) {
                                        if (ordinal2 != 2) {
                                            if (ordinal2 != 3) {
                                                if (ordinal2 != 4) {
                                                    throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc3.zza());
                                                }
                                            } else {
                                                zzgczVar = zzgcz.zzc;
                                            }
                                        }
                                        zzgczVar = zzgcz.zzb;
                                    } else {
                                        zzgczVar = zzgcz.zza;
                                    }
                                    zzgcxVar.zzf(zzgczVar);
                                    zzgdb zzg = zzgcxVar.zzg();
                                    zzgcq zzgcqVar = new zzgcq(null);
                                    zzgcqVar.zzd(zzg);
                                    zzgcqVar.zza(zzgry.zzb(zze2.zzf().zzh().zzA(), zzgchVar));
                                    zzgcqVar.zzb(zzgry.zzb(zze2.zzg().zzh().zzA(), zzgchVar));
                                    zzgcqVar.zzc(((zzgjc) zzgjhVar).zzf());
                                    return zzgcqVar.zze();
                                }
                                throw new GeneralSecurityException("Only version 0 keys inner HMAC keys are accepted");
                            }
                            throw new GeneralSecurityException("Only version 0 keys inner AES CTR keys are accepted");
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgul unused) {
                        throw new GeneralSecurityException("Parsing AesCtrHmacAeadKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCtrHmacAeadProtoSerialization.parseKey");
            }
        }, zza2, zzgjc.class);
    }

    public static void zza(zzgii zzgiiVar) throws GeneralSecurityException {
        zzgiiVar.zzg(zzc);
        zzgiiVar.zzf(zzd);
        zzgiiVar.zze(zze);
        zzgiiVar.zzd(zzf);
    }
}
