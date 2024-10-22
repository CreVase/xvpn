package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgea {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzgiq zzc;
    private static final zzgim zzd;
    private static final zzght zze;
    private static final zzghp zzf;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zzb = zza2;
        zzc = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzgdw
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                zzgqf zzgqfVar;
                zzgdv zzgdvVar = (zzgdv) zzgbwVar;
                int i = zzgea.zza;
                zzgpd zza3 = zzgpe.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.AesEaxKey");
                zzgnn zzc2 = zzgno.zzc();
                zzgnq zzc3 = zzgnr.zzc();
                zzc3.zza(zzgdvVar.zza());
                zzc2.zzb((zzgnr) zzc3.zzal());
                zzc2.zza(zzgdvVar.zzb());
                zza3.zzc(((zzgno) zzc2.zzal()).zzau());
                zzgdt zzc4 = zzgdvVar.zzc();
                if (zzgdt.zza.equals(zzc4)) {
                    zzgqfVar = zzgqf.TINK;
                } else if (zzgdt.zzb.equals(zzc4)) {
                    zzgqfVar = zzgqf.CRUNCHY;
                } else if (zzgdt.zzc.equals(zzc4)) {
                    zzgqfVar = zzgqf.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(zzc4)));
                }
                zza3.zza(zzgqfVar);
                return zzgjd.zza((zzgpe) zza3.zzal());
            }
        }, zzgdv.class, zzgjd.class);
        zzd = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzgdx
        }, zza2, zzgjd.class);
        zze = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzgdy
        }, zzgdn.class, zzgjc.class);
        zzf = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzgdz
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                zzgdt zzgdtVar;
                int i = zzgea.zza;
                if (((zzgjc) zzgjhVar).zzg().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                    try {
                        zzgnl zze2 = zzgnl.zze(((zzgjc) zzgjhVar).zze(), zzgtl.zza());
                        if (zze2.zza() == 0) {
                            zzgds zzgdsVar = new zzgds(null);
                            zzgdsVar.zzb(zze2.zzg().zzd());
                            zzgdsVar.zza(zze2.zzf().zza());
                            zzgdsVar.zzc(16);
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
                                        zzgdtVar = zzgdt.zzc;
                                    }
                                }
                                zzgdtVar = zzgdt.zzb;
                            } else {
                                zzgdtVar = zzgdt.zza;
                            }
                            zzgdsVar.zzd(zzgdtVar);
                            zzgdv zze3 = zzgdsVar.zze();
                            zzgdl zzgdlVar = new zzgdl(null);
                            zzgdlVar.zzc(zze3);
                            zzgdlVar.zzb(zzgry.zzb(zze2.zzg().zzA(), zzgchVar));
                            zzgdlVar.zza(((zzgjc) zzgjhVar).zzf());
                            return zzgdlVar.zzd();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgul unused) {
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to AesEaxProtoSerialization.parseKey");
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
