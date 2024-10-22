package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzeby implements zzfhs {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfia zzc;

    public zzeby(Set set, zzfia zzfiaVar) {
        zzfhl zzfhlVar;
        String str;
        zzfhl zzfhlVar2;
        String str2;
        this.zzc = zzfiaVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzebx zzebxVar = (zzebx) it.next();
            Map map = this.zza;
            zzfhlVar = zzebxVar.zzb;
            str = zzebxVar.zza;
            map.put(zzfhlVar, str);
            Map map2 = this.zzb;
            zzfhlVar2 = zzebxVar.zzc;
            str2 = zzebxVar.zza;
            map2.put(zzfhlVar2, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbG(zzfhl zzfhlVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbH(zzfhl zzfhlVar, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzfhlVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfhlVar))), "f.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbI(zzfhl zzfhlVar, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzfhlVar)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzfhlVar))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzd(zzfhl zzfhlVar, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzfhlVar)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzfhlVar))), "s.");
        }
    }
}
