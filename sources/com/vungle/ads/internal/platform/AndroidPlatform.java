package com.vungle.ads.internal.platform;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import android.provider.Settings;
import android.util.Log;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.privacy.PrivacyManager;
import defpackage.m20;
import defpackage.ng0;
import defpackage.to1;
import defpackage.ut0;
import defpackage.y70;

/* loaded from: classes2.dex */
public final class AndroidPlatform implements Platform {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "AndroidPlatform";
    private AdvertisingInfo advertisingInfo;
    private String appSetId;
    private final Context context;
    private final boolean isSideLoaded;
    private final PowerManager powerManager;
    private final VungleThreadPoolExecutor uaExecutor;
    private String userAgent;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public AndroidPlatform(Context context, VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        this.context = context;
        this.uaExecutor = vungleThreadPoolExecutor;
        updateAppSetID();
        this.powerManager = (PowerManager) context.getSystemService("power");
    }

    public static /* synthetic */ void a(AndroidPlatform androidPlatform, y70 y70Var) {
        m79getUserAgentLazy$lambda0(androidPlatform, y70Var);
    }

    /* renamed from: getUserAgentLazy$lambda-0 */
    public static final void m79getUserAgentLazy$lambda0(AndroidPlatform androidPlatform, y70 y70Var) {
        new WebViewUtil(androidPlatform.context).getUserAgent(y70Var);
    }

    private final void updateAppSetID() {
        try {
            AppSet.getClient(this.context).getAppSetIdInfo().addOnSuccessListener(new ut0(this, 16));
        } catch (NoClassDefFoundError e) {
            Log.e(TAG, "Required libs to get AppSetID Not available: " + e.getLocalizedMessage());
        }
    }

    /* renamed from: updateAppSetID$lambda-1 */
    public static final void m80updateAppSetID$lambda1(AndroidPlatform androidPlatform, AppSetIdInfo appSetIdInfo) {
        if (appSetIdInfo != null) {
            androidPlatform.appSetId = appSetIdInfo.getId();
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public AdvertisingInfo getAdvertisingInfo() {
        boolean z;
        AdvertisingInfo advertisingInfo = this.advertisingInfo;
        boolean z2 = false;
        if (advertisingInfo != null) {
            String advertisingId = advertisingInfo.getAdvertisingId();
            if (advertisingId != null && advertisingId.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return advertisingInfo;
            }
        }
        AdvertisingInfo advertisingInfo2 = new AdvertisingInfo();
        try {
            if (m20.L("Amazon", Build.MANUFACTURER)) {
                try {
                    ContentResolver contentResolver = this.context.getContentResolver();
                    if (Settings.Secure.getInt(contentResolver, "limit_ad_tracking") == 1) {
                        z2 = true;
                    }
                    advertisingInfo2.setLimitAdTracking(z2);
                    advertisingInfo2.setAdvertisingId(Settings.Secure.getString(contentResolver, "advertising_id"));
                } catch (Settings.SettingNotFoundException unused) {
                }
            } else {
                try {
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this.context);
                    advertisingInfo2.setAdvertisingId(advertisingIdInfo.getId());
                    advertisingInfo2.setLimitAdTracking(advertisingIdInfo.isLimitAdTrackingEnabled());
                } catch (GooglePlayServicesNotAvailableException e) {
                    Log.e(TAG, "Play services Not available: " + e.getLocalizedMessage());
                } catch (NoClassDefFoundError e2) {
                    Log.e(TAG, "Play services Not available: " + e2.getLocalizedMessage());
                    advertisingInfo2.setAdvertisingId(Settings.Secure.getString(this.context.getContentResolver(), "advertising_id"));
                }
            }
        } catch (Exception unused2) {
            Log.e(TAG, "Cannot load Advertising ID");
        }
        this.advertisingInfo = advertisingInfo2;
        return advertisingInfo2;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    @SuppressLint({"HardwareIds"})
    public String getAndroidId() {
        if (PrivacyManager.INSTANCE.getPublishAndroidId()) {
            return Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        }
        return "";
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getAppSetId() {
        return this.appSetId;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public String getUserAgent() {
        String str = this.userAgent;
        if (str == null) {
            return System.getProperty("http.agent");
        }
        return str;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public void getUserAgentLazy(y70 y70Var) {
        this.uaExecutor.execute(new to1(19, this, y70Var));
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public float getVolumeLevel() {
        try {
            AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
            return audioManager.getStreamVolume(3) / audioManager.getStreamMaxVolume(3);
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isAtLeastMinimumSDK() {
        return true;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isBatterySaverEnabled() {
        return this.powerManager.isPowerSaveMode();
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSdCardPresent() {
        try {
            return m20.L(Environment.getExternalStorageState(), "mounted");
        } catch (Exception e) {
            Log.e(TAG, "Acquiring external storage state failed", e);
            return false;
        }
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSideLoaded() {
        return this.isSideLoaded;
    }

    @Override // com.vungle.ads.internal.platform.Platform
    public boolean isSoundEnabled() {
        try {
            if (((AudioManager) this.context.getSystemService("audio")).getStreamVolume(3) > 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public void setUserAgent(String str) {
        this.userAgent = str;
    }
}
