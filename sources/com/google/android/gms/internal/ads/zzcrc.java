package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public class zzcrc {
    private final zzcsv zza;
    private final View zzb;
    private final zzfcs zzc;
    private final zzcgb zzd;

    public zzcrc(View view, zzcgb zzcgbVar, zzcsv zzcsvVar, zzfcs zzfcsVar) {
        this.zzb = view;
        this.zzd = zzcgbVar;
        this.zza = zzcsvVar;
        this.zzc = zzfcsVar;
    }

    public static final zzdev zzf(final Context context, final zzcaz zzcazVar, final zzfcr zzfcrVar, final zzfdn zzfdnVar) {
        return new zzdev(new zzcyz() { // from class: com.google.android.gms.internal.ads.zzcra
            @Override // com.google.android.gms.internal.ads.zzcyz
            public final void zzr() {
                com.google.android.gms.ads.internal.zzt.zzs().zzn(context, zzcazVar.zza, zzfcrVar.zzE.toString(), zzfdnVar.zzf);
            }
        }, zzcbg.zzf);
    }

    public static final Set zzg(zzcsm zzcsmVar) {
        return Collections.singleton(new zzdev(zzcsmVar, zzcbg.zzf));
    }

    public static final zzdev zzh(zzcsk zzcskVar) {
        return new zzdev(zzcskVar, zzcbg.zze);
    }

    public final View zza() {
        return this.zzb;
    }

    public final zzcgb zzb() {
        return this.zzd;
    }

    public final zzcsv zzc() {
        return this.zza;
    }

    public zzcyx zzd(Set set) {
        return new zzcyx(set);
    }

    public final zzfcs zze() {
        return this.zzc;
    }
}
