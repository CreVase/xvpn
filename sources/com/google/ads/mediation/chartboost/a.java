package com.google.ads.mediation.chartboost;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.chartboost.sdk.Chartboost;
import com.chartboost.sdk.Mediation;
import com.chartboost.sdk.privacy.model.COPPA;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static Mediation f1430a;

    public static ChartboostParams a(Bundle bundle) {
        ChartboostParams chartboostParams = new ChartboostParams();
        String string = bundle.getString("appId");
        String string2 = bundle.getString("appSignature");
        if (string != null && string2 != null) {
            chartboostParams.setAppId(string.trim());
            chartboostParams.setAppSignature(string2.trim());
        }
        String string3 = bundle.getString("adLocation");
        if (TextUtils.isEmpty(string3)) {
            String.format("Chartboost ad location is empty, defaulting to %s. Please set the Ad Location parameter in the AdMob UI.", "default");
            String str = ChartboostMediationAdapter.TAG;
            string3 = "default";
        }
        chartboostParams.setLocation(string3.trim());
        return chartboostParams;
    }

    public static Mediation b() {
        if (f1430a == null) {
            f1430a = new Mediation("AdMob", Chartboost.getSDKVersion(), BuildConfig.ADAPTER_VERSION);
        }
        return f1430a;
    }

    public static boolean c(ChartboostParams chartboostParams) {
        if (!TextUtils.isEmpty(chartboostParams.getAppId()) && !TextUtils.isEmpty(chartboostParams.getAppSignature())) {
            return true;
        }
        Log.e(ChartboostMediationAdapter.TAG, "Missing or invalid App ID or App Signature configured for this ad source instancein the AdMob or Ad Manager UI.");
        return false;
    }

    public static void d(Context context, int i) {
        if (i != 0) {
            if (i == 1) {
                Chartboost.addDataUseConsent(context, new COPPA(true));
                return;
            }
            return;
        }
        Chartboost.addDataUseConsent(context, new COPPA(false));
    }
}
