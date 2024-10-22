package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import androidx.annotation.Keep;
import com.vungle.ads.internal.VungleInitializer;
import com.vungle.ads.internal.VungleInternal;
import com.vungle.ads.internal.network.VungleApiClient;
import defpackage.i23;
import defpackage.ng0;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class VungleAds {
    public static final String TAG = "VungleAds";
    public static final Companion Companion = new Companion(null);
    private static VungleInternal vungleInternal = new VungleInternal();
    private static VungleInitializer initializer = new VungleInitializer();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final void deInit$vungle_ads_release() {
            VungleAds.initializer.deInit$vungle_ads_release();
        }

        public final String getBiddingToken(Context context) {
            return VungleAds.vungleInternal.getAvailableBidTokens(context);
        }

        public final String getSdkVersion() {
            return VungleAds.vungleInternal.getSdkVersion();
        }

        public final void init(Context context, String str, InitializationListener initializationListener) {
            if (!(context instanceof Application)) {
                context = context.getApplicationContext();
            }
            VungleAds.initializer.init(str, context, initializationListener);
        }

        public final boolean isInitialized() {
            return VungleAds.initializer.isInitialized();
        }

        public final void setIntegrationName(WrapperFramework wrapperFramework, String str) {
            boolean z;
            String str2;
            if (wrapperFramework != WrapperFramework.none) {
                VungleApiClient.Companion companion = VungleApiClient.Companion;
                companion.setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(wrapperFramework);
                String headerUa = companion.getHeaderUa();
                if (str.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    str2 = "/".concat(str);
                } else {
                    str2 = "";
                }
                String str3 = wrapperFramework + str2;
                if (new HashSet(i23.o1(headerUa, new String[]{";"})).add(str3)) {
                    companion.setHeaderUa(headerUa + ";" + str3);
                }
            } else {
                Log.e(VungleAds.TAG, "Wrapper is null or is none");
            }
            isInitialized();
        }
    }

    @Keep
    /* loaded from: classes2.dex */
    public enum WrapperFramework {
        admob,
        air,
        cocos2dx,
        corona,
        dfp,
        heyzap,
        marmalade,
        mopub,
        unity,
        fyber,
        ironsource,
        upsight,
        appodeal,
        aerserv,
        adtoapp,
        tapdaq,
        vunglehbs,
        max,
        none
    }

    public static final String getBiddingToken(Context context) {
        return Companion.getBiddingToken(context);
    }

    public static final String getSdkVersion() {
        return Companion.getSdkVersion();
    }

    public static final void init(Context context, String str, InitializationListener initializationListener) {
        Companion.init(context, str, initializationListener);
    }

    public static final boolean isInitialized() {
        return Companion.isInitialized();
    }

    public static final void setIntegrationName(WrapperFramework wrapperFramework, String str) {
        Companion.setIntegrationName(wrapperFramework, str);
    }
}
