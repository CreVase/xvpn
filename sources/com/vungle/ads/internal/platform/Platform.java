package com.vungle.ads.internal.platform;

import com.vungle.ads.internal.model.AdvertisingInfo;
import defpackage.y70;

/* loaded from: classes2.dex */
public interface Platform {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String MANUFACTURER_AMAZON = "Amazon";

    /* loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String MANUFACTURER_AMAZON = "Amazon";

        private Companion() {
        }
    }

    AdvertisingInfo getAdvertisingInfo();

    String getAndroidId();

    String getAppSetId();

    String getUserAgent();

    void getUserAgentLazy(y70 y70Var);

    float getVolumeLevel();

    boolean isAtLeastMinimumSDK();

    boolean isBatterySaverEnabled();

    boolean isSdCardPresent();

    boolean isSideLoaded();

    boolean isSoundEnabled();
}
