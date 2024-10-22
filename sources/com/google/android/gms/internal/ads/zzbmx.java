package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbmx implements zzbjj {
    final /* synthetic */ long zza;
    final /* synthetic */ zzbnl zzb;
    final /* synthetic */ zzbmh zzc;
    final /* synthetic */ zzbnm zzd;

    public zzbmx(zzbnm zzbnmVar, long j, zzbnl zzbnlVar, zzbmh zzbmhVar) {
        this.zzd = zzbnmVar;
        this.zza = j;
        this.zzb = zzbnlVar;
        this.zzc = zzbmhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        com.google.android.gms.ads.internal.util.zze.zza("onGmsg /jsLoaded. JsLoaded latency is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zza) + " ms.");
        obj2 = this.zzd.zza;
        synchronized (obj2) {
            if (this.zzb.zze() != -1 && this.zzb.zze() != 1) {
                this.zzd.zzi = 0;
                zzbmh zzbmhVar = this.zzc;
                zzbmhVar.zzq("/log", zzbji.zzg);
                zzbmhVar.zzq("/result", zzbji.zzo);
                this.zzb.zzh(this.zzc);
                this.zzd.zzh = this.zzb;
                com.google.android.gms.ads.internal.util.zze.zza("Successfully loaded JS Engine.");
            }
        }
    }
}
