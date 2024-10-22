package com.google.android.gms.internal.consent_sdk;

import android.app.Activity;
import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import defpackage.m60;
import defpackage.s60;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzp {
    private final zzn zza;
    private final Activity zzb;
    private final m60 zzc;
    private final s60 zzd;

    public /* synthetic */ zzp(zzn zznVar, Activity activity, m60 m60Var, s60 s60Var, zzo zzoVar) {
        this.zza = zznVar;
        this.zzb = activity;
        this.zzc = m60Var;
        this.zzd = s60Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v49, types: [java.util.List] */
    public static zzck zza(zzp zzpVar) {
        Bundle bundle;
        Application application;
        Application application2;
        ArrayList arrayList;
        zzas zzasVar;
        Application application3;
        Application application4;
        Application application5;
        Window window;
        View decorView;
        WindowInsets rootWindowInsets;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        List list;
        Application application6;
        PackageInfo packageInfo;
        Application application7;
        Application application8;
        long j;
        Application application9;
        zza zzaVar;
        zzck zzckVar = new zzck();
        String str = zzpVar.zzd.f4280b;
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                application = zzpVar.zza.zza;
                PackageManager packageManager = application.getPackageManager();
                application2 = zzpVar.zza.zza;
                bundle = packageManager.getApplicationInfo(application2.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                bundle = null;
            }
            if (bundle != null) {
                str = bundle.getString("com.google.android.gms.ads.APPLICATION_ID");
            }
            if (TextUtils.isEmpty(str)) {
                throw new zzi(3, "The UMP SDK requires a valid application ID in your AndroidManifest.xml through a com.google.android.gms.ads.APPLICATION_ID meta-data tag.\nExample AndroidManifest:\n    <meta-data\n        android:name=\"com.google.android.gms.ads.APPLICATION_ID\"\n        android:value=\"ca-app-pub-0000000000000000~0000000000\">");
            }
        }
        zzckVar.zza = str;
        if (!zzpVar.zzd.f4279a) {
            zzaVar = zzpVar.zza.zzb;
            String zza = zzaVar.zza();
            if (zza != null) {
                zzckVar.zzb = zza;
            }
        }
        if (!zzpVar.zzc.f3240a) {
            arrayList = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList();
            int i = zzpVar.zzc.f3241b;
            if (i != 1) {
                if (i == 2) {
                    arrayList2.add(zzcf.GEO_OVERRIDE_NON_EEA);
                }
            } else {
                arrayList2.add(zzcf.GEO_OVERRIDE_EEA);
            }
            arrayList2.add(zzcf.PREVIEWING_DEBUG_MESSAGES);
            arrayList = arrayList2;
        }
        zzckVar.zzj = arrayList;
        zzasVar = zzpVar.zza.zzc;
        zzckVar.zzf = zzasVar.zzc();
        zzckVar.zze = Boolean.valueOf(zzpVar.zzd.f4279a);
        int i2 = Build.VERSION.SDK_INT;
        zzckVar.zzd = Locale.getDefault().toLanguageTag();
        zzcg zzcgVar = new zzcg();
        zzcgVar.zzb = Integer.valueOf(i2);
        zzcgVar.zza = Build.MODEL;
        zzcgVar.zzc = 2;
        zzckVar.zzc = zzcgVar;
        application3 = zzpVar.zza.zza;
        Configuration configuration = application3.getResources().getConfiguration();
        application4 = zzpVar.zza.zza;
        application4.getResources().getConfiguration();
        zzci zzciVar = new zzci();
        zzciVar.zza = Integer.valueOf(configuration.screenWidthDp);
        zzciVar.zzb = Integer.valueOf(configuration.screenHeightDp);
        application5 = zzpVar.zza.zza;
        zzciVar.zzc = Double.valueOf(application5.getResources().getDisplayMetrics().density);
        if (i2 < 28) {
            list = Collections.emptyList();
        } else {
            Activity activity = zzpVar.zzb;
            if (activity == null) {
                window = null;
            } else {
                window = activity.getWindow();
            }
            if (window == null) {
                decorView = null;
            } else {
                decorView = window.getDecorView();
            }
            if (decorView != null) {
                rootWindowInsets = decorView.getRootWindowInsets();
            } else {
                rootWindowInsets = null;
            }
            if (rootWindowInsets != null) {
                displayCutout = rootWindowInsets.getDisplayCutout();
            } else {
                displayCutout = null;
            }
            if (displayCutout != null) {
                displayCutout.getSafeInsetBottom();
                ArrayList arrayList3 = new ArrayList();
                boundingRects = displayCutout.getBoundingRects();
                for (Rect rect : boundingRects) {
                    if (rect != null) {
                        zzch zzchVar = new zzch();
                        zzchVar.zzb = Integer.valueOf(rect.left);
                        zzchVar.zzc = Integer.valueOf(rect.right);
                        zzchVar.zza = Integer.valueOf(rect.top);
                        zzchVar.zzd = Integer.valueOf(rect.bottom);
                        arrayList3.add(zzchVar);
                    }
                }
                list = arrayList3;
            } else {
                list = Collections.emptyList();
            }
        }
        zzciVar.zzd = list;
        zzckVar.zzg = zzciVar;
        zzn zznVar = zzpVar.zza;
        application6 = zznVar.zza;
        try {
            application9 = zznVar.zza;
            packageInfo = application9.getPackageManager().getPackageInfo(application6.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException unused2) {
            packageInfo = null;
        }
        zzce zzceVar = new zzce();
        zzceVar.zza = application6.getPackageName();
        application7 = zzpVar.zza.zza;
        PackageManager packageManager2 = application7.getPackageManager();
        application8 = zzpVar.zza.zza;
        CharSequence applicationLabel = packageManager2.getApplicationLabel(application8.getApplicationInfo());
        if (applicationLabel != null) {
            str2 = applicationLabel.toString();
        }
        zzceVar.zzb = str2;
        if (packageInfo != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                j = packageInfo.getLongVersionCode();
            } else {
                j = packageInfo.versionCode;
            }
            zzceVar.zzc = Long.toString(j);
        }
        zzckVar.zzh = zzceVar;
        zzcj zzcjVar = new zzcj();
        zzcjVar.zza = "2.1.0";
        zzckVar.zzi = zzcjVar;
        return zzckVar;
    }
}
