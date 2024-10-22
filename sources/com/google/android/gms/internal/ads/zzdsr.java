package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdsr implements zzfhs {
    private final zzdsj zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsr(zzdsj zzdsjVar, Set set, Clock clock) {
        zzfhl zzfhlVar;
        this.zzb = zzdsjVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdsq zzdsqVar = (zzdsq) it.next();
            Map map = this.zzd;
            zzfhlVar = zzdsqVar.zzc;
            map.put(zzfhlVar, zzdsqVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfhl zzfhlVar, boolean z) {
        zzfhl zzfhlVar2;
        String str;
        String str2;
        zzfhlVar2 = ((zzdsq) this.zzd.get(zzfhlVar)).zzb;
        if (this.zza.containsKey(zzfhlVar2)) {
            if (true != z) {
                str = "f.";
            } else {
                str = "s.";
            }
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfhlVar2)).longValue();
            zzdsj zzdsjVar = this.zzb;
            Map map = this.zzd;
            Map zza = zzdsjVar.zza();
            str2 = ((zzdsq) map.get(zzfhlVar)).zza;
            zza.put("label.".concat(str2), str.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbG(zzfhl zzfhlVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbH(zzfhl zzfhlVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfhlVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfhlVar)).longValue();
            zzdsj zzdsjVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsjVar.zza().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfhlVar)) {
            zze(zzfhlVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbI(zzfhl zzfhlVar, String str) {
        this.zza.put(zzfhlVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzd(zzfhl zzfhlVar, String str) {
        if (this.zza.containsKey(zzfhlVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfhlVar)).longValue();
            zzdsj zzdsjVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdsjVar.zza().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfhlVar)) {
            zze(zzfhlVar, true);
        }
    }
}
