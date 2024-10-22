package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbvm implements Callable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzbvo zzb;

    public zzbvm(zzbvo zzbvoVar, Context context) {
        this.zzb = zzbvoVar;
        this.zza = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        WeakHashMap weakHashMap;
        zzbvl zza;
        WeakHashMap weakHashMap2;
        weakHashMap = this.zzb.zza;
        zzbvn zzbvnVar = (zzbvn) weakHashMap.get(this.zza);
        if (zzbvnVar != null) {
            if (zzbvnVar.zza + ((Long) zzbdr.zza.zze()).longValue() >= com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis()) {
                zza = new zzbvk(this.zza, zzbvnVar.zzb).zza();
                zzbvo zzbvoVar = this.zzb;
                Context context = this.zza;
                weakHashMap2 = zzbvoVar.zza;
                weakHashMap2.put(context, new zzbvn(zzbvoVar, zza));
                return zza;
            }
        }
        zza = new zzbvk(this.zza).zza();
        zzbvo zzbvoVar2 = this.zzb;
        Context context2 = this.zza;
        weakHashMap2 = zzbvoVar2.zza;
        weakHashMap2.put(context2, new zzbvn(zzbvoVar2, zza));
        return zza;
    }
}
