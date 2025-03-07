package com.google.android.gms.ads.appopen;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdLoadCallback;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzawx;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbty;
import com.google.android.gms.internal.ads.zzcai;

/* loaded from: classes.dex */
public abstract class AppOpenAd {
    public static final int APP_OPEN_AD_ORIENTATION_LANDSCAPE = 2;
    public static final int APP_OPEN_AD_ORIENTATION_PORTRAIT = 1;

    /* loaded from: classes.dex */
    public static abstract class AppOpenAdLoadCallback extends AdLoadCallback<AppOpenAd> {
    }

    /* loaded from: classes.dex */
    public @interface AppOpenAdOrientation {
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdRequest adRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbdz.zzd.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzb
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzawx(context2, str2, adRequest2.zza(), i2, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbty.zza(context2).zzf(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzawx(context, str, adRequest.zza(), i, appOpenAdLoadCallback).zza();
    }

    public abstract String getAdUnitId();

    public abstract FullScreenContentCallback getFullScreenContentCallback();

    public abstract OnPaidEventListener getOnPaidEventListener();

    public abstract ResponseInfo getResponseInfo();

    public abstract void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback);

    public abstract void setImmersiveMode(boolean z);

    public abstract void setOnPaidEventListener(OnPaidEventListener onPaidEventListener);

    public abstract void show(Activity activity);

    public static void load(final Context context, final String str, final AdRequest adRequest, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adRequest, "AdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbdz.zzd.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        String str2 = str;
                        AdRequest adRequest2 = adRequest;
                        try {
                            new zzawx(context2, str2, adRequest2.zza(), 3, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbty.zza(context2).zzf(e, "AppOpenAd.load");
                        }
                    }
                });
                return;
            }
        }
        new zzawx(context, str, adRequest.zza(), 3, appOpenAdLoadCallback).zza();
    }

    @Deprecated
    public static void load(final Context context, final String str, final AdManagerAdRequest adManagerAdRequest, @AppOpenAdOrientation final int i, final AppOpenAdLoadCallback appOpenAdLoadCallback) {
        Preconditions.checkNotNull(context, "Context cannot be null.");
        Preconditions.checkNotNull(str, "adUnitId cannot be null.");
        Preconditions.checkNotNull(adManagerAdRequest, "AdManagerAdRequest cannot be null.");
        Preconditions.checkMainThread("#008 Must be called on the main UI thread.");
        zzbci.zza(context);
        if (((Boolean) zzbdz.zzd.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.appopen.zzc
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context2 = context;
                        int i2 = i;
                        String str2 = str;
                        AdManagerAdRequest adManagerAdRequest2 = adManagerAdRequest;
                        try {
                            new zzawx(context2, str2, adManagerAdRequest2.zza(), i2, appOpenAdLoadCallback).zza();
                        } catch (IllegalStateException e) {
                            zzbty.zza(context2).zzf(e, "AppOpenAdManager.load");
                        }
                    }
                });
                return;
            }
        }
        new zzawx(context, str, adManagerAdRequest.zza(), i, appOpenAdLoadCallback).zza();
    }
}
