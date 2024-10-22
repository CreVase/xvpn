package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.h5.OnH5AdsEventListener;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzbfy;
import com.google.android.gms.internal.ads.zzbhn;
import com.google.android.gms.internal.ads.zzbho;
import com.google.android.gms.internal.ads.zzbkk;
import com.google.android.gms.internal.ads.zzbox;
import com.google.android.gms.internal.ads.zzbso;
import com.google.android.gms.internal.ads.zzbss;
import com.google.android.gms.internal.ads.zzbsv;
import com.google.android.gms.internal.ads.zzbua;
import com.google.android.gms.internal.ads.zzbwp;
import com.google.android.gms.internal.ads.zzbxb;
import com.google.android.gms.internal.ads.zzbzk;
import com.google.android.gms.internal.ads.zzcat;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class zzaw {
    private final zzk zza;
    private final zzi zzb;
    private final zzeq zzc;
    private final zzbhn zzd;
    private final zzbxb zze;
    private final zzbss zzf;
    private final zzbho zzg;
    private zzbua zzh;

    public zzaw(zzk zzkVar, zzi zziVar, zzeq zzeqVar, zzbhn zzbhnVar, zzbxb zzbxbVar, zzbss zzbssVar, zzbho zzbhoVar) {
        this.zza = zzkVar;
        this.zzb = zziVar;
        this.zzc = zzeqVar;
        this.zzd = zzbhnVar;
        this.zze = zzbxbVar;
        this.zzf = zzbssVar;
        this.zzg = zzbhoVar;
    }

    public static /* bridge */ /* synthetic */ void zzt(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        zzay.zzb().zzn(context, zzay.zzc().zza, "gmob-apps", bundle, true);
    }

    public final zzbq zzc(Context context, String str, zzbox zzboxVar) {
        return (zzbq) new zzao(this, context, str, zzboxVar).zzd(context, false);
    }

    public final zzbu zzd(Context context, zzq zzqVar, String str, zzbox zzboxVar) {
        return (zzbu) new zzak(this, context, zzqVar, str, zzboxVar).zzd(context, false);
    }

    public final zzbu zze(Context context, zzq zzqVar, String str, zzbox zzboxVar) {
        return (zzbu) new zzam(this, context, zzqVar, str, zzboxVar).zzd(context, false);
    }

    public final zzdj zzf(Context context, zzbox zzboxVar) {
        return (zzdj) new zzac(this, context, zzboxVar).zzd(context, false);
    }

    public final zzbfs zzh(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (zzbfs) new zzas(this, frameLayout, frameLayout2, context).zzd(context, false);
    }

    public final zzbfy zzi(View view, HashMap hashMap, HashMap hashMap2) {
        return (zzbfy) new zzau(this, view, hashMap, hashMap2).zzd(view.getContext(), false);
    }

    public final zzbkk zzl(Context context, zzbox zzboxVar, OnH5AdsEventListener onH5AdsEventListener) {
        return (zzbkk) new zzai(this, context, zzboxVar, onH5AdsEventListener).zzd(context, false);
    }

    public final zzbso zzm(Context context, zzbox zzboxVar) {
        return (zzbso) new zzag(this, context, zzboxVar).zzd(context, false);
    }

    public final zzbsv zzo(Activity activity) {
        zzaa zzaaVar = new zzaa(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            zzcat.zzg("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (zzbsv) zzaaVar.zzd(activity, z);
    }

    public final zzbwp zzq(Context context, String str, zzbox zzboxVar) {
        return (zzbwp) new zzav(this, context, str, zzboxVar).zzd(context, false);
    }

    public final zzbzk zzr(Context context, zzbox zzboxVar) {
        return (zzbzk) new zzae(this, context, zzboxVar).zzd(context, false);
    }
}
