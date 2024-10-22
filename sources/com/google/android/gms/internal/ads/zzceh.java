package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* loaded from: classes.dex */
final class zzceh implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ int zzc;
    final /* synthetic */ int zzd;
    final /* synthetic */ zzcen zze;

    public zzceh(zzcen zzcenVar, String str, String str2, int i, int i2, boolean z) {
        this.zze = zzcenVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.zza);
        hashMap.put("cachedSrc", this.zzb);
        hashMap.put("bytesLoaded", Integer.toString(this.zzc));
        hashMap.put("totalBytes", Integer.toString(this.zzd));
        hashMap.put("cacheReady", "0");
        zzcen.zze(this.zze, "onPrecacheEvent", hashMap);
    }
}
