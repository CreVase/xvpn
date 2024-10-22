package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgft {
    public static final /* synthetic */ int zza = 0;
    private static final zzgrx zzb;
    private static final zzgiq zzc;
    private static final zzgim zzd;
    private static final zzght zze;
    private static final zzghp zzf;

    static {
        zzgrx zza2 = zzgjr.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zzb = zza2;
        zzc = zzgiq.zzb(new zzgio() { // from class: com.google.android.gms.internal.ads.zzgfp
            @Override // com.google.android.gms.internal.ads.zzgio
            public final zzgjh zza(zzgbw zzgbwVar) {
                zzgqf zzgqfVar;
                int i = zzgft.zza;
                zzgpd zza3 = zzgpe.zza();
                zza3.zzb("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
                zza3.zzc(zzgoj.zzc().zzau());
                zzgfn zza4 = ((zzgfo) zzgbwVar).zza();
                if (zzgfn.zza.equals(zza4)) {
                    zzgqfVar = zzgqf.TINK;
                } else if (zzgfn.zzb.equals(zza4)) {
                    zzgqfVar = zzgqf.CRUNCHY;
                } else if (zzgfn.zzc.equals(zza4)) {
                    zzgqfVar = zzgqf.RAW;
                } else {
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(zza4.toString()));
                }
                zza3.zza(zzgqfVar);
                return zzgjd.zza((zzgpe) zza3.zzal());
            }
        }, zzgfo.class, zzgjd.class);
        zzd = zzgim.zza(new zzgik() { // from class: com.google.android.gms.internal.ads.zzgfq
        }, zza2, zzgjd.class);
        zze = zzght.zza(new zzghr() { // from class: com.google.android.gms.internal.ads.zzgfr
        }, zzgfj.class, zzgjc.class);
        zzf = zzghp.zzb(new zzghn() { // from class: com.google.android.gms.internal.ads.zzgfs
            @Override // com.google.android.gms.internal.ads.zzghn
            public final zzgbe zza(zzgjh zzgjhVar, zzgch zzgchVar) {
                zzgfn zzgfnVar;
                int i = zzgft.zza;
                if (((zzgjc) zzgjhVar).zzg().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                    try {
                        zzgog zze2 = zzgog.zze(((zzgjc) zzgjhVar).zze(), zzgtl.zza());
                        if (zze2.zza() == 0) {
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
                                        zzgfnVar = zzgfn.zzc;
                                    }
                                }
                                zzgfnVar = zzgfn.zzb;
                            } else {
                                zzgfnVar = zzgfn.zza;
                            }
                            return zzgfj.zza(zzgfnVar, zzgry.zzb(zze2.zzf().zzA(), zzgchVar), ((zzgjc) zzgjhVar).zzf());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                    } catch (zzgul unused) {
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                }
                throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305ProtoSerialization.parseKey");
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
