package com.google.ads.mediation.chartboost;

import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.google.android.gms.ads.AdError;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes.dex */
public class ChartboostConstants {

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface AdapterError {
    }

    public static AdError a(CacheError cacheError) {
        return new AdError(cacheError.getCode().getErrorCode(), cacheError.toString(), "com.chartboost.sdk");
    }

    public static AdError b(ClickError clickError) {
        return new AdError(clickError.getCode().getErrorCode(), clickError.toString(), "com.chartboost.sdk");
    }

    public static AdError c(ShowError showError) {
        return new AdError(showError.getCode().getErrorCode(), showError.toString(), "com.chartboost.sdk");
    }

    public static AdError createAdapterError(int i, String str) {
        return new AdError(i, str, BuildConfig.LIBRARY_PACKAGE_NAME);
    }
}
