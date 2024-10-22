package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgfi {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzgiq zzc;
    private static final zzgim zzd;
    private static final zzght zze;
    private static final zzghp zzf;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        zzb = zza2;
        zzc = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzgfe
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                zzgqf zzgqfVar;
                zzgfd zzgfdVar = (zzgfd) zzgbwVar;
                int i = zzgfi.zza;
                zzgpd zza3 = zzgpe.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
                zzgoc zzc2 = zzgod.zzc();
                zzc2.zza(zzgfdVar.zza());
                zza3.zzc(((zzgod) zzc2.zzal()).zzau());
                zzgfb zzb2 = zzgfdVar.zzb();
                if (zzgfb.zza.equals(zzb2)) {
                    zzgqfVar = zzgqf.TINK;
                } else if (zzgfb.zzb.equals(zzb2)) {
                    zzgqfVar = zzgqf.CRUNCHY;
                } else if (zzgfb.zzc.equals(zzb2)) {
                    zzgqfVar = zzgqf.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb2)));
                }
                zza3.zza(zzgqfVar);
                return zzgjd.zza((zzgpe) zza3.zzal());
            }
        }, zzgfd.class, zzgjd.class);
        zzd = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzgff
        }, zza2, zzgjd.class);
        zze = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzgfg
        }, zzgev.class, zzgjc.class);
        zzf = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzgfh
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                zzgfb zzgfbVar;
                int i = zzgfi.zza;
                if (((zzgjc) zzgjhVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                    try {
                        zzgoa zze2 = zzgoa.zze(((zzgjc) zzgjhVar).zze(), zzgtl.zza());
                        if (zze2.zza() == 0) {
                            zzgfa zzgfaVar = new zzgfa(null);
                            zzgfaVar.zza(zze2.zzf().zzd());
                            zzgqf zzc2 = ((zzgjc) zzgjhVar).zzc();
                            zzgqf zzgqfVar = zzgqf.UNKNOWN_PREFIX;
                            int ordinal = zzc2.ordinal();
                            if (ordinal != 1) {
                                if (ordinal != 2) {
                                    if (ordinal != 3) {
                                        if (ordinal != 4) {
                                            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzc2.zza());
                                        }
                                    } else {
                                        zzgfbVar = zzgfb.zzc;
                                    }
                                }
                                zzgfbVar = zzgfb.zzb;
                            } else {
                                zzgfbVar = zzgfb.zza;
                            }
                            zzgfaVar.zzb(zzgfbVar);
                            zzgfd zzc3 = zzgfaVar.zzc();
                            zzget zzgetVar = new zzget(null);
                            zzgetVar.zzc(zzc3);
                            zzgetVar.zzb(zzgry.zzb(zze2.zzf().zzA(), zzgchVar));
                            zzgetVar.zza(((zzgjc) zzgjhVar).zzf());
                            return zzgetVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgul unused) {
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivProtoSerialization.parseKey");
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
