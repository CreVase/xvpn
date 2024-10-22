package com.vungle.ads.internal.bidding;

import android.os.Build;
import android.util.Base64;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.locale.LocaleInfo;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.RtbTokens;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.util.ActivityManager;
import defpackage.b23;
import defpackage.dx;
import defpackage.g40;
import defpackage.gi2;
import defpackage.hx2;
import defpackage.m20;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.pd0;
import defpackage.qf1;
import defpackage.t9;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import defpackage.wp2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes2.dex */
public final class BidTokenEncoder {
    public static final Companion Companion = new Companion(null);
    private static final int TOKEN_VERSION = 3;
    private long enterBackgroundTime;
    private final FilePreferences filePreferences;
    private final qf1 json = t9.d(BidTokenEncoder$json$1.INSTANCE);
    private final LocaleInfo localeInfo;
    private int ordinalView;
    private final Platform platform;

    @up2
    /* loaded from: classes2.dex */
    public static final class AndroidInfo {
        public static final Companion Companion = new Companion(null);
        private String androidId;
        private String appSetId;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return BidTokenEncoder$AndroidInfo$$serializer.INSTANCE;
            }
        }

        public AndroidInfo() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (ng0) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ AndroidInfo copy$default(AndroidInfo androidInfo, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = androidInfo.androidId;
            }
            if ((i & 2) != 0) {
                str2 = androidInfo.appSetId;
            }
            return androidInfo.copy(str, str2);
        }

        public static /* synthetic */ void getAndroidId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static final void write$Self(AndroidInfo androidInfo, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || androidInfo.androidId != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, androidInfo.androidId);
            }
            if (g40Var.D() || androidInfo.appSetId != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, b23.f390a, androidInfo.appSetId);
            }
        }

        public final String component1() {
            return this.androidId;
        }

        public final String component2() {
            return this.appSetId;
        }

        public final AndroidInfo copy(String str, String str2) {
            return new AndroidInfo(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AndroidInfo)) {
                return false;
            }
            AndroidInfo androidInfo = (AndroidInfo) obj;
            return m20.L(this.androidId, androidInfo.androidId) && m20.L(this.appSetId, androidInfo.appSetId);
        }

        public final String getAndroidId() {
            return this.androidId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public int hashCode() {
            String str = this.androidId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.appSetId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setAndroidId(String str) {
            this.androidId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public String toString() {
            return "AndroidInfo(androidId=" + this.androidId + ", appSetId=" + this.appSetId + ")";
        }

        public /* synthetic */ AndroidInfo(int i, String str, String str2, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, BidTokenEncoder$AndroidInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.androidId = null;
            } else {
                this.androidId = str;
            }
            if ((i & 2) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str2;
            }
        }

        public AndroidInfo(String str, String str2) {
            this.androidId = str;
            this.appSetId = str2;
        }

        public /* synthetic */ AndroidInfo(String str, String str2, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public BidTokenEncoder(LocaleInfo localeInfo, Platform platform, FilePreferences filePreferences) {
        this.localeInfo = localeInfo;
        this.platform = platform;
        this.filePreferences = filePreferences;
        ActivityManager.Companion.addLifecycleListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.internal.bidding.BidTokenEncoder.1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onPause() {
                super.onPause();
                BidTokenEncoder.this.enterBackgroundTime = System.currentTimeMillis();
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onResume() {
                super.onResume();
                if (System.currentTimeMillis() > (ConfigManager.INSTANCE.getSessionTimeoutInSecond() * 1000) + BidTokenEncoder.this.enterBackgroundTime) {
                    BidTokenEncoder.this.ordinalView = 0;
                    BidTokenEncoder.this.enterBackgroundTime = 0L;
                }
            }
        });
    }

    private final String bidTokenV3() {
        try {
            String constructV3Token = constructV3Token();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(constructV3Token.length());
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(constructV3Token.getBytes(dx.f1853a));
            gZIPOutputStream.close();
            String encodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
            byteArrayOutputStream.close();
            return "3:" + encodeToString;
        } catch (IOException e) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(116, hx2.p("Fail to gzip bidtoken ", e.getLocalizedMessage()), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3, types: [ng0, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    private final String constructV3Token() throws wp2 {
        AndroidInfo androidInfo;
        AndroidInfo androidInfo2;
        boolean z;
        String str;
        boolean z2;
        RtbTokens.Consent consent = new RtbTokens.Consent(new RtbTokens.CCPA(getCCPAStatus()), getGDPR(), getCOPPA());
        RtbTokens.Extension extension = new RtbTokens.Extension(this.platform.isSideLoaded(), this.platform.isSdCardPresent(), this.platform.isSoundEnabled());
        boolean L = m20.L("Amazon", Build.MANUFACTURER);
        int i = 3;
        ?? r3 = 0;
        r3 = 0;
        if (L) {
            androidInfo = null;
        } else {
            androidInfo = new AndroidInfo((String) r3, (String) r3, i, (ng0) r3);
        }
        if (L) {
            androidInfo2 = new AndroidInfo((String) r3, (String) r3, i, (ng0) r3);
        } else {
            androidInfo2 = null;
        }
        if (PrivacyManager.INSTANCE.shouldSendAdIds()) {
            AdvertisingInfo advertisingInfo = this.platform.getAdvertisingInfo();
            if (advertisingInfo != null) {
                r3 = advertisingInfo.getAdvertisingId();
            }
            boolean z3 = true;
            if (r3 != 0 && r3.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                str = this.platform.getAndroidId();
            } else {
                str = "";
            }
            if (r3 != 0 && r3.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                r3 = str;
            }
            if (str != null && str.length() != 0) {
                z3 = false;
            }
            if (!z3) {
                if (L) {
                    if (androidInfo2 != null) {
                        androidInfo2.setAndroidId(str);
                    }
                } else if (androidInfo != null) {
                    androidInfo.setAndroidId(str);
                }
            }
        }
        String str2 = r3;
        if (L) {
            if (androidInfo2 != null) {
                androidInfo2.setAppSetId(this.platform.getAppSetId());
            }
        } else if (androidInfo != null) {
            androidInfo.setAppSetId(this.platform.getAppSetId());
        }
        RtbTokens rtbTokens = new RtbTokens(new RtbTokens.Device(this.platform.isBatterySaverEnabled(), this.localeInfo.getTimeZoneId(), this.platform.getVolumeLevel(), str2, androidInfo2, androidInfo, this.localeInfo.getLanguage(), extension), new RtbTokens.Request(getConfigExtension(), this.ordinalView, VungleApiClient.Companion.getHeaderUa(), (List) null, 8, (ng0) null), consent);
        qf1 qf1Var = this.json;
        return qf1Var.b(pd0.K(qf1Var.f3990b, gi2.b(RtbTokens.class)), rtbTokens);
    }

    private final String getCCPAStatus() {
        return PrivacyManager.INSTANCE.getCcpaStatus();
    }

    private final RtbTokens.COPPA getCOPPA() {
        return new RtbTokens.COPPA(PrivacyManager.INSTANCE.getCoppaStatus().getValue());
    }

    private final String getConfigExtension() {
        boolean z;
        String string;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z && (string = this.filePreferences.getString(Cookie.CONFIG_EXTENSION)) != null) {
            return string;
        }
        return configExtension;
    }

    private final RtbTokens.GDPR getGDPR() {
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        return new RtbTokens.GDPR(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentMessageVersion(), privacyManager.getConsentTimestamp());
    }

    public final String encode() {
        this.ordinalView++;
        return bidTokenV3();
    }
}
