package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdtm implements AppEventListener, zzdag, com.google.android.gms.ads.internal.client.zza, zzcxl, zzcyf, zzcyg, zzcyz, zzcxo, zzfhs {
    private final List zza;
    private final zzdta zzb;
    private long zzc;

    public zzdtm(zzdta zzdtaVar, zzchw zzchwVar) {
        this.zzb = zzdtaVar;
        this.zza = Collections.singletonList(zzchwVar);
    }

    private final void zzg(Class cls, String str, Object... objArr) {
        this.zzb.zza(this.zza, "Event-".concat(cls.getSimpleName()), str, objArr);
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        zzg(com.google.android.gms.ads.internal.client.zza.class, "onAdClicked", new Object[0]);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        zzg(AppEventListener.class, "onAppEvent", str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zza() {
        zzg(zzcxl.class, "onAdClosed", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzb() {
        zzg(zzcxl.class, "onAdLeftApplication", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxo
    public final void zzbF(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzg(zzcxo.class, "onAdFailedToLoad", Integer.valueOf(zzeVar.zza), zzeVar.zzb, zzeVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbG(zzfhl zzfhlVar, String str) {
        zzg(zzfhk.class, "onTaskCreated", str);
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbH(zzfhl zzfhlVar, String str, Throwable th) {
        zzg(zzfhk.class, "onTaskFailed", str, th.getClass().getSimpleName());
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzbI(zzfhl zzfhlVar, String str) {
        zzg(zzfhk.class, "onTaskStarted", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbn(Context context) {
        zzg(zzcyg.class, "onDestroy", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbp(Context context) {
        zzg(zzcyg.class, "onPause", context);
    }

    @Override // com.google.android.gms.internal.ads.zzcyg
    public final void zzbq(Context context) {
        zzg(zzcyg.class, "onResume", context);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbr(zzbvg zzbvgVar) {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime();
        zzg(zzdag.class, "onAdRequest", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzdag
    public final void zzbs(zzfde zzfdeVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzbw(zzbvw zzbvwVar, String str, String str2) {
        zzg(zzcxl.class, "onRewarded", zzbvwVar, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzc() {
        zzg(zzcxl.class, "onAdOpened", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzfhs
    public final void zzd(zzfhl zzfhlVar, String str) {
        zzg(zzfhk.class, "onTaskSucceeded", str);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zze() {
        zzg(zzcxl.class, "onRewardedVideoCompleted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcxl
    public final void zzf() {
        zzg(zzcxl.class, "onRewardedVideoStarted", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyf
    public final void zzq() {
        zzg(zzcyf.class, "onAdImpression", new Object[0]);
    }

    @Override // com.google.android.gms.internal.ads.zzcyz
    public final void zzr() {
        com.google.android.gms.ads.internal.util.zze.zza("Ad Request Latency : " + (com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime() - this.zzc));
        zzg(zzcyz.class, "onAdLoaded", new Object[0]);
    }
}
