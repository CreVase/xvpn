package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzasj implements zzfop {
    private final zzfms zza;
    private final zzfnj zzb;
    private final zzasw zzc;
    private final zzasi zzd;
    private final zzars zze;
    private final zzasy zzf;
    private final zzasq zzg;
    private final zzash zzh;

    public zzasj(zzfms zzfmsVar, zzfnj zzfnjVar, zzasw zzaswVar, zzasi zzasiVar, zzars zzarsVar, zzasy zzasyVar, zzasq zzasqVar, zzash zzashVar) {
        this.zza = zzfmsVar;
        this.zzb = zzfnjVar;
        this.zzc = zzaswVar;
        this.zzd = zzasiVar;
        this.zze = zzarsVar;
        this.zzf = zzasyVar;
        this.zzg = zzasqVar;
        this.zzh = zzashVar;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzfms zzfmsVar = this.zza;
        zzapj zzb = this.zzb.zzb();
        hashMap.put("v", zzfmsVar.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        zzasq zzasqVar = this.zzg;
        if (zzasqVar != null) {
            hashMap.put("tcq", Long.valueOf(zzasqVar.zzc()));
            hashMap.put("tpq", Long.valueOf(this.zzg.zzg()));
            hashMap.put("tcv", Long.valueOf(this.zzg.zzd()));
            hashMap.put("tpv", Long.valueOf(this.zzg.zzh()));
            hashMap.put("tchv", Long.valueOf(this.zzg.zzb()));
            hashMap.put("tphv", Long.valueOf(this.zzg.zzf()));
            hashMap.put("tcc", Long.valueOf(this.zzg.zza()));
            hashMap.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzfop
    public final Map zza() {
        zzasw zzaswVar = this.zzc;
        Map zze = zze();
        zze.put("lts", Long.valueOf(zzaswVar.zza()));
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfop
    public final Map zzb() {
        Map zze = zze();
        zzapj zza = this.zzb.zza();
        zze.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze.put("did", zza.zzg());
        zze.put("dst", Integer.valueOf(zza.zzal() - 1));
        zze.put("doo", Boolean.valueOf(zza.zzai()));
        zzars zzarsVar = this.zze;
        if (zzarsVar != null) {
            zze.put("nt", Long.valueOf(zzarsVar.zza()));
        }
        zzasy zzasyVar = this.zzf;
        if (zzasyVar != null) {
            zze.put("vs", Long.valueOf(zzasyVar.zzc()));
            zze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfop
    public final Map zzc() {
        zzash zzashVar = this.zzh;
        Map zze = zze();
        if (zzashVar != null) {
            zze.put("vst", zzashVar.zza());
        }
        return zze;
    }

    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
