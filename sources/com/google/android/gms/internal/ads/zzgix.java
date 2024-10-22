package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzgix {
    private final Map zza;
    private final Map zzb;

    private zzgix() {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public final zzgix zza(zzgiu zzgiuVar) throws GeneralSecurityException {
        zzgiz zzgizVar = new zzgiz(zzgiuVar.zzc(), zzgiuVar.zzd(), null);
        if (this.zza.containsKey(zzgizVar)) {
            zzgiu zzgiuVar2 = (zzgiu) this.zza.get(zzgizVar);
            if (!zzgiuVar2.equals(zzgiuVar) || !zzgiuVar.equals(zzgiuVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveConstructor object for already existing object of type: ".concat(zzgizVar.toString()));
            }
        } else {
            this.zza.put(zzgizVar, zzgiuVar);
        }
        return this;
    }

    public final zzgix zzb(zzgce zzgceVar) throws GeneralSecurityException {
        Map map = this.zzb;
        Class zzb = zzgceVar.zzb();
        if (map.containsKey(zzb)) {
            zzgce zzgceVar2 = (zzgce) this.zzb.get(zzb);
            if (!zzgceVar2.equals(zzgceVar) || !zzgceVar.equals(zzgceVar2)) {
                throw new GeneralSecurityException("Attempt to register non-equal PrimitiveWrapper object or input class object for already existing object of type".concat(zzb.toString()));
            }
        } else {
            this.zzb.put(zzb, zzgceVar);
        }
        return this;
    }

    public /* synthetic */ zzgix(zzgiw zzgiwVar) {
        this.zza = new HashMap();
        this.zzb = new HashMap();
    }

    public /* synthetic */ zzgix(zzgjb zzgjbVar, zzgiw zzgiwVar) {
        this.zza = new HashMap(zzgjb.zzd(zzgjbVar));
        this.zzb = new HashMap(zzgjb.zze(zzgjbVar));
    }
}
