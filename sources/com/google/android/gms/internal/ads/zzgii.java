package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzgii {
    private static final zzgii zza = (zzgii) zzgjq.zza(new zzgjp() { // from class: com.google.android.gms.internal.ads.zzgig
        @Override // com.google.android.gms.internal.ads.zzgjp
        public final Object zza() {
            zzgii zzgiiVar = new zzgii();
            zzgiiVar.zze(new zzghq(zzghx.class, zzgjc.class, new zzghr() { // from class: com.google.android.gms.internal.ads.zzgih
            }));
            return zzgiiVar;
        }
    });
    private final AtomicReference zzb = new AtomicReference(new zzgjo(new zzgji(), null));

    public static zzgii zzb() {
        return zza;
    }

    public final zzgbe zza(zzgjc zzgjcVar, zzgch zzgchVar) throws GeneralSecurityException {
        if (!((zzgjo) this.zzb.get()).zzg(zzgjcVar)) {
            return new zzghx(zzgjcVar, zzgchVar);
        }
        return ((zzgjo) this.zzb.get()).zza(zzgjcVar, zzgchVar);
    }

    public final zzgjh zzc(zzgbw zzgbwVar, Class cls) throws GeneralSecurityException {
        return ((zzgjo) this.zzb.get()).zzb(zzgbwVar, cls);
    }

    public final synchronized void zzd(zzghp zzghpVar) throws GeneralSecurityException {
        zzgji zzgjiVar = new zzgji((zzgjo) this.zzb.get());
        zzgjiVar.zza(zzghpVar);
        this.zzb.set(new zzgjo(zzgjiVar, null));
    }

    public final synchronized void zze(zzght zzghtVar) throws GeneralSecurityException {
        zzgji zzgjiVar = new zzgji((zzgjo) this.zzb.get());
        zzgjiVar.zzb(zzghtVar);
        this.zzb.set(new zzgjo(zzgjiVar, null));
    }

    public final synchronized void zzf(zzgim zzgimVar) throws GeneralSecurityException {
        zzgji zzgjiVar = new zzgji((zzgjo) this.zzb.get());
        zzgjiVar.zzc(zzgimVar);
        this.zzb.set(new zzgjo(zzgjiVar, null));
    }

    public final synchronized void zzg(zzgiq zzgiqVar) throws GeneralSecurityException {
        zzgji zzgjiVar = new zzgji((zzgjo) this.zzb.get());
        zzgjiVar.zzd(zzgiqVar);
        this.zzb.set(new zzgjo(zzgjiVar, null));
    }
}
