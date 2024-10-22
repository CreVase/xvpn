package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzexh implements zzhbc {
    public static zzetz zza(Context context, zzbzq zzbzqVar, zzbzr zzbzrVar, Object obj, zzeux zzeuxVar, zzewn zzewnVar, zzhaw zzhawVar, zzhaw zzhawVar2, zzhaw zzhawVar3, zzhaw zzhawVar4, zzhaw zzhawVar5, zzhaw zzhawVar6, zzhaw zzhawVar7, zzhaw zzhawVar8, zzhaw zzhawVar9, Executor executor, zzfje zzfjeVar, zzdso zzdsoVar) {
        HashSet hashSet = new HashSet();
        hashSet.add((zzewg) obj);
        hashSet.add(zzeuxVar);
        hashSet.add(zzewnVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfG)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfH)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar2.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfI)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar3.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfJ)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar4.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfN)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar6.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfO)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar7.zzb());
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcF)).booleanValue()) {
            hashSet.add((zzetw) zzhawVar9.zzb());
        }
        return new zzetz(context, executor, hashSet, zzfjeVar, zzdsoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        throw null;
    }
}
