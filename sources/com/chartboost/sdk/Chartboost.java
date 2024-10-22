package com.chartboost.sdk;

import android.content.Context;
import android.util.Log;
import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.impl.f6;
import com.chartboost.sdk.impl.s2;
import com.chartboost.sdk.privacy.model.DataUseConsent;

/* loaded from: classes.dex */
public final class Chartboost {
    public static final Chartboost INSTANCE = new Chartboost();

    private Chartboost() {
    }

    public static final void addDataUseConsent(Context context, DataUseConsent dataUseConsent) {
        INSTANCE.initContainer(context);
        s2 s2Var = s2.f1122b;
        if (s2Var.f()) {
            s2Var.h().a().a(dataUseConsent);
        }
    }

    public static final void clearDataUseConsent(Context context, String str) {
        INSTANCE.initContainer(context);
        s2 s2Var = s2.f1122b;
        if (s2Var.f()) {
            s2Var.h().a().b(str);
        }
    }

    public static final String getBidderToken() {
        if (isSdkStarted()) {
            return s2.f1122b.j().c().a();
        }
        Log.e("Chartboost", "Chartboost getToken failed due to SDK not being initialized.");
        return null;
    }

    public static final DataUseConsent getDataUseConsent(Context context, String str) {
        INSTANCE.initContainer(context);
        s2 s2Var = s2.f1122b;
        if (s2Var.f()) {
            return s2Var.h().a().a(str);
        }
        return null;
    }

    public static final String getSDKVersion() {
        return "9.4.1";
    }

    private final void initContainer(Context context) {
        s2 s2Var = s2.f1122b;
        if (!s2Var.f()) {
            s2Var.a(context);
        }
    }

    public static final boolean isSdkStarted() {
        s2 s2Var = s2.f1122b;
        if (s2Var.f() && s2Var.k()) {
            try {
                return s2Var.j().b().e();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static final void setLoggingLevel(LoggingLevel loggingLevel) {
        f6.f820b = loggingLevel;
    }

    public static final synchronized void startWithAppId(Context context, String str, String str2, StartCallback startCallback) {
        synchronized (Chartboost.class) {
            INSTANCE.initContainer(context);
            s2 s2Var = s2.f1122b;
            if (s2Var.f()) {
                if (!isSdkStarted()) {
                    s2Var.a(str, str2);
                }
                s2Var.l().a();
                s2Var.j().c().a(str, str2, startCallback);
            } else {
                Log.e("Chartboost", "Chartboost startWithAppId failed due to DI not being initialized.");
            }
        }
    }
}
