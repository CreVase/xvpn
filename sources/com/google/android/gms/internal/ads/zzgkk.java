package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzgkk {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzgiq zzc;
    private static final zzgim zzd;
    private static final zzght zze;
    private static final zzghp zzf;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.AesCmacKey");
        zzb = zza2;
        zzc = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzgkg
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                zzgqf zzgqfVar;
                zzgkf zzgkfVar = (zzgkf) zzgbwVar;
                int i = zzgkk.zza;
                zzgpd zza3 = zzgpe.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesCmacKey");
                zzgmp zzc2 = zzgmq.zzc();
                zzgms zzc3 = zzgmt.zzc();
                zzc3.zza(zzgkfVar.zza());
                zzc2.zzb((zzgmt) zzc3.zzal());
                zzc2.zza(zzgkfVar.zzb());
                zza3.zzc(((zzgmq) zzc2.zzal()).zzau());
                zzgkd zzd2 = zzgkfVar.zzd();
                if (zzgkd.zza.equals(zzd2)) {
                    zzgqfVar = zzgqf.TINK;
                } else if (zzgkd.zzb.equals(zzd2)) {
                    zzgqfVar = zzgqf.CRUNCHY;
                } else if (zzgkd.zzd.equals(zzd2)) {
                    zzgqfVar = zzgqf.RAW;
                } else if (zzgkd.zzc.equals(zzd2)) {
                    zzgqfVar = zzgqf.LEGACY;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzd2)));
                }
                zza3.zza(zzgqfVar);
                return zzgjd.zza((zzgpe) zza3.zzal());
            }
        }, zzgkf.class, zzgjd.class);
        zzd = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzgkh
        }, zza2, zzgjd.class);
        zze = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzgki
        }, zzgjv.class, zzgjc.class);
        zzf = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzgkj
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                zzgkd zzgkdVar;
                int i = zzgkk.zza;
                if (((zzgjc) zzgjhVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                    try {
                        zzgmn zze2 = zzgmn.zze(((zzgjc) zzgjhVar).zze(), zzgtl.zza());
                        if (zze2.zza() == 0) {
                            zzgkc zzgkcVar = new zzgkc(null);
                            zzgkcVar.zza(zze2.zzg().zzd());
                            zzgkcVar.zzb(zze2.zzf().zza());
                            zzgqf zzc2 = ((zzgjc) zzgjhVar).zzc();
                            zzgqf zzgqfVar = zzgqf.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal == 4) {
                                            zzgkdVar = zzgkd.zzb;
                                        } else {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                        }
                                    } else {
                                        zzgkdVar = zzgkd.zzd;
                                    }
                                } else {
                                    zzgkdVar = zzgkd.zzc;
                                }
                            } else {
                                zzgkdVar = zzgkd.zza;
                            }
                            zzgkcVar.zzc(zzgkdVar);
                            zzgkf zzd2 = zzgkcVar.zzd();
                            zzgjt zzgjtVar = new zzgjt(null);
                            zzgjtVar.zzc(zzd2);
                            zzgjtVar.zza(zzgry.zzb(zze2.zzg().zzA(), zzgchVar));
                            zzgjtVar.zzb(((zzgjc) zzgjhVar).zzf());
                            return zzgjtVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgul | IllegalArgumentException unused) {
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacProtoSerialization.parseKey");
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
