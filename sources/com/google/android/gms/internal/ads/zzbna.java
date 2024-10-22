package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbna implements Runnable {
    final /* synthetic */ zzbnl zza;
    final /* synthetic */ zzbmh zzb;
    final /* synthetic */ ArrayList zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzbnm zze;

    public zzbna(zzbnm zzbnmVar, zzbnl zzbnlVar, zzbmh zzbmhVar, ArrayList arrayList, long j) {
        this.zze = zzbnmVar;
        this.zza = zzbnlVar;
        this.zzb = zzbmhVar;
        this.zzc = arrayList;
        this.zzd = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i;
        String concat;
        obj = this.zze.zza;
        synchronized (obj) {
            if (this.zza.zze() != -1 && this.zza.zze() != 1) {
                this.zza.zzg();
                zzgad zzgadVar = zzcbg.zze;
                final zzbmh zzbmhVar = this.zzb;
                zzgadVar.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmz
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbmh.this.zzc();
                    }
                });
                String valueOf = String.valueOf(com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzd));
                int zze = this.zza.zze();
                i = this.zze.zzi;
                if (this.zzc.isEmpty()) {
                    concat = ". Still waiting for the engine to be loaded";
                } else {
                    concat = ". While waiting for the /jsLoaded gmsg, observed the loadNewJavascriptEngine latency is ".concat(String.valueOf(this.zzc.get(0)));
                }
                com.google.android.gms.ads.internal.util.zze.zza("Could not finish the full JS engine loading in " + valueOf + " ms. JS engine session reference status(fullLoadTimeout) is " + zze + ". Update status(fullLoadTimeout) is " + i + concat + " ms. Total latency(fullLoadTimeout) is " + (com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis() - this.zzd) + " ms at timeout. Rejecting.");
            }
        }
    }
}
