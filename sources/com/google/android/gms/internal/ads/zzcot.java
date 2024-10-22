package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcot implements zzfzp {
    final /* synthetic */ zzfjx zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzcou zzc;

    public zzcot(zzcou zzcouVar, zzfjx zzfjxVar, String str) {
        this.zzc = zzcouVar;
        this.zza = zzfjxVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(final Throwable th) {
        zzgad zzgadVar;
        zzgadVar = this.zzc.zze;
        final zzfjx zzfjxVar = this.zza;
        final String str = this.zzb;
        zzgadVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcor
            @Override // java.lang.Runnable
            public final void run() {
                Context context;
                zzbua zzbuaVar;
                zzcot zzcotVar = zzcot.this;
                zzcou zzcouVar = zzcotVar.zzc;
                context = zzcouVar.zza;
                zzcouVar.zzh = zzbty.zza(context);
                zzbuaVar = zzcotVar.zzc.zzh;
                zzbuaVar.zzf(th, "AttributionReporting.registerSourceAndPingClickUrl");
                zzfjxVar.zzc(str, null);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzgad zzgadVar;
        zzcou zzcouVar = this.zzc;
        final zzfjx zzfjxVar = this.zza;
        final String str = (String) obj;
        zzgadVar = zzcouVar.zze;
        zzgadVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcos
            @Override // java.lang.Runnable
            public final void run() {
                zzfjx.this.zzc(str, null);
            }
        });
    }
}
