package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import com.google.android.gms.internal.ads.zzaxv;
import com.google.android.gms.internal.ads.zzcat;
import com.google.android.gms.internal.ads.zzcgb;
import com.google.android.gms.internal.ads.zzcgi;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzedz;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes.dex */
public class zzab {
    private zzab() {
    }

    public /* synthetic */ zzab(zzaa zzaaVar) {
    }

    public static zzab zzo(int i) {
        return i >= 30 ? new zzz() : i >= 28 ? new zzy() : i >= 26 ? new zzw() : i >= 24 ? new zzv() : i >= 21 ? new zzu() : new zzab();
    }

    public int zza() {
        return 1;
    }

    public CookieManager zzb(Context context) {
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzt.zzE()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            zzcat.zzh("Failed to obtain CookieManager.", th);
            com.google.android.gms.ads.internal.zzt.zzo().zzu(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    public WebResourceResponse zzc(String str, String str2, int i, String str3, Map map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    public zzcgi zzd(zzcgb zzcgbVar, zzaxv zzaxvVar, boolean z, zzedz zzedzVar) {
        return new zzchd(zzcgbVar, zzaxvVar, z, zzedzVar);
    }

    public boolean zze(Activity activity, Configuration configuration) {
        return false;
    }

    public Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public void zzh(Context context, String str, String str2) {
    }

    public boolean zzi(Context context, String str) {
        return false;
    }

    public int zzj(Context context, TelephonyManager telephonyManager) {
        return 1001;
    }

    public int zzk(AudioManager audioManager) {
        return 0;
    }

    public void zzl(Activity activity) {
    }

    public int zzn(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }
}
