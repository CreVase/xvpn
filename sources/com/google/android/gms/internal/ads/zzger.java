package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzger {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzgiq zzc;
    private static final zzgim zzd;
    private static final zzght zze;
    private static final zzghp zzf;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zzb = zza2;
        zzc = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzgen
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                zzgqf zzgqfVar;
                zzgem zzgemVar = (zzgem) zzgbwVar;
                int i = zzger.zza;
                zzgpd zza3 = zzgpe.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
                zzgnw zzc2 = zzgnx.zzc();
                zzc2.zza(zzgemVar.zza());
                zza3.zzc(((zzgnx) zzc2.zzal()).zzau());
                zzgek zzb2 = zzgemVar.zzb();
                if (zzgek.zza.equals(zzb2)) {
                    zzgqfVar = zzgqf.TINK;
                } else if (zzgek.zzb.equals(zzb2)) {
                    zzgqfVar = zzgqf.CRUNCHY;
                } else if (zzgek.zzc.equals(zzb2)) {
                    zzgqfVar = zzgqf.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzb2)));
                }
                zza3.zza(zzgqfVar);
                return zzgjd.zza((zzgpe) zza3.zzal());
            }
        }, zzgem.class, zzgjd.class);
        zzd = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzgeo
        }, zza2, zzgjd.class);
        zze = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzgep
        }, zzgee.class, zzgjc.class);
        zzf = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzgeq
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                zzgek zzgekVar;
                int i = zzger.zza;
                if (((zzgjc) zzgjhVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                    try {
                        zzgnu zze2 = zzgnu.zze(((zzgjc) zzgjhVar).zze(), zzgtl.zza());
                        if (zze2.zza() == 0) {
                            zzgej zzgejVar = new zzgej(null);
                            zzgejVar.zzb(zze2.zzf().zzd());
                            zzgejVar.zza(12);
                            zzgejVar.zzc(16);
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
                                        zzgekVar = zzgek.zzc;
                                    }
                                }
                                zzgekVar = zzgek.zzb;
                            } else {
                                zzgekVar = zzgek.zza;
                            }
                            zzgejVar.zzd(zzgekVar);
                            zzgem zze3 = zzgejVar.zze();
                            zzgec zzgecVar = new zzgec(null);
                            zzgecVar.zzc(zze3);
                            zzgecVar.zzb(zzgry.zzb(zze2.zzf().zzA(), zzgchVar));
                            zzgecVar.zza(((zzgjc) zzgjhVar).zzf());
                            return zzgecVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgul unused) {
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
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
