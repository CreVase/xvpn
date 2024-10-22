package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbmy implements zzbjj {
    final /* synthetic */ zzbmh zza;
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcc zzb;
    final /* synthetic */ zzbnm zzc;

    public zzbmy(zzbnm zzbnmVar, zzaro zzaroVar, zzbmh zzbmhVar, com.google.android.gms.ads.internal.util.zzcc zzccVar) {
        this.zzc = zzbnmVar;
        this.zza = zzbmhVar;
        this.zzb = zzccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbjj, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Object obj2;
        int i;
        obj2 = this.zzc.zza;
        synchronized (obj2) {
            zzcat.zzi("JS Engine is requesting an update");
            i = this.zzc.zzi;
            if (i == 0) {
                zzcat.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd(null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
