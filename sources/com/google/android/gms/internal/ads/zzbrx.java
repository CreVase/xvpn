package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbrx extends zzbry implements zzbjj {
    DisplayMetrics zza;
    int zzb;
    int zzc;
    int zzd;
    int zze;
    int zzf;
    int zzg;
    private final zzcgb zzh;
    private final Context zzi;
    private final WindowManager zzj;
    private final zzbbs zzk;
    private float zzl;
    private int zzm;

    public zzbrx(zzcgb zzcgbVar, Context context, zzbbs zzbbsVar) {
        super(zzcgbVar, "");
        this.zzb = -1;
        this.zzc = -1;
        this.zzd = -1;
        this.zze = -1;
        this.zzf = -1;
        this.zzg = -1;
        this.zzh = zzcgbVar;
        this.zzi = context;
        this.zzk = zzbbsVar;
        this.zzj = (WindowManager) context.getSystemService("window");
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* synthetic */ void zza(Object obj, Map map) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject;
        this.zza = new DisplayMetrics();
        Display defaultDisplay = this.zzj.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zza);
        this.zzl = this.zza.density;
        this.zzm = defaultDisplay.getRotation();
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics = this.zza;
        this.zzb = zzcam.zzv(displayMetrics, displayMetrics.widthPixels);
        com.google.android.gms.ads.internal.client.zzay.zzb();
        DisplayMetrics displayMetrics2 = this.zza;
        this.zzc = zzcam.zzv(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzi = this.zzh.zzi();
        if (zzi != null && zzi.getWindow() != null) {
            com.google.android.gms.ads.internal.zzt.zzp();
            int[] zzP = com.google.android.gms.ads.internal.util.zzt.zzP(zzi);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zzd = zzcam.zzv(this.zza, zzP[0]);
            com.google.android.gms.ads.internal.client.zzay.zzb();
            this.zze = zzcam.zzv(this.zza, zzP[1]);
        } else {
            this.zzd = this.zzb;
            this.zze = this.zzc;
        }
        if (this.zzh.zzO().zzi()) {
            this.zzf = this.zzb;
            this.zzg = this.zzc;
        } else {
            this.zzh.measure(0, 0);
        }
        zzi(this.zzb, this.zzc, this.zzd, this.zze, this.zzl, this.zzm);
        zzbrw zzbrwVar = new zzbrw();
        zzbbs zzbbsVar = this.zzk;
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        zzbrwVar.zze(zzbbsVar.zza(intent));
        zzbbs zzbbsVar2 = this.zzk;
        Intent intent2 = new Intent("android.intent.action.VIEW");
        intent2.setData(Uri.parse("sms:"));
        zzbrwVar.zzc(zzbbsVar2.zza(intent2));
        zzbrwVar.zza(this.zzk.zzb());
        zzbrwVar.zzd(this.zzk.zzc());
        zzbrwVar.zzb(true);
        z = zzbrwVar.zza;
        z2 = zzbrwVar.zzb;
        z3 = zzbrwVar.zzc;
        z4 = zzbrwVar.zzd;
        z5 = zzbrwVar.zze;
        zzcgb zzcgbVar = this.zzh;
        try {
            jSONObject = new JSONObject().put("sms", z).put("tel", z2).put("calendar", z3).put("storePicture", z4).put("inlineVideo", z5);
        } catch (JSONException e) {
            zzcat.zzh("Error occurred while obtaining the MRAID capabilities.", e);
            jSONObject = null;
        }
        zzcgbVar.zze("onDeviceFeaturesReceived", jSONObject);
        int[] iArr = new int[2];
        this.zzh.getLocationOnScreen(iArr);
        zzb(com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[0]), com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, iArr[1]));
        if (zzcat.zzm(2)) {
            zzcat.zzi("Dispatching Ready Event.");
        }
        zzh(this.zzh.zzn().zza);
    }

    public final void zzb(int i, int i2) {
        int i3;
        Context context = this.zzi;
        int i4 = 0;
        if (context instanceof Activity) {
            com.google.android.gms.ads.internal.zzt.zzp();
            i3 = com.google.android.gms.ads.internal.util.zzt.zzQ((Activity) context)[0];
        } else {
            i3 = 0;
        }
        if (this.zzh.zzO() == null || !this.zzh.zzO().zzi()) {
            zzcgb zzcgbVar = this.zzh;
            int width = zzcgbVar.getWidth();
            int height = zzcgbVar.getHeight();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzR)).booleanValue()) {
                if (width == 0) {
                    if (this.zzh.zzO() != null) {
                        width = this.zzh.zzO().zzb;
                    } else {
                        width = 0;
                    }
                }
                if (height == 0) {
                    if (this.zzh.zzO() != null) {
                        i4 = this.zzh.zzO().zza;
                    }
                    this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
                    this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
                }
            }
            i4 = height;
            this.zzf = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, width);
            this.zzg = com.google.android.gms.ads.internal.client.zzay.zzb().zzb(this.zzi, i4);
        }
        zzf(i, i2 - i3, this.zzf, this.zzg);
        this.zzh.zzN().zzB(i, i2);
    }
}
