package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BannerAdSize;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.util.FileUtility;
import defpackage.b23;
import defpackage.bh1;
import defpackage.eg1;
import defpackage.g40;
import defpackage.i23;
import defpackage.ig;
import defpackage.ld1;
import defpackage.m20;
import defpackage.m71;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.p71;
import defpackage.pd0;
import defpackage.rq;
import defpackage.tg1;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import defpackage.zf3;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

@up2
/* loaded from: classes2.dex */
public final class AdPayload {
    public static final Companion Companion = new Companion(null);
    public static final String FILE_SCHEME = "file://";
    public static final String INCENTIVIZED_BODY_TEXT = "INCENTIVIZED_BODY_TEXT";
    public static final String INCENTIVIZED_CLOSE_TEXT = "INCENTIVIZED_CLOSE_TEXT";
    public static final String INCENTIVIZED_CONTINUE_TEXT = "INCENTIVIZED_CONTINUE_TEXT";
    public static final String INCENTIVIZED_TITLE_TEXT = "INCENTIVIZED_TITLE_TEXT";
    public static final String KEY_POSTROLL = "postroll";
    public static final String KEY_TEMPLATE = "template";
    public static final String TPAT_CLICK_COORDINATES_URLS = "video.clickCoordinates";
    public static final String TYPE_VUNGLE_MRAID = "vungle_mraid";
    private static final String UNKNOWN = "unknown";
    private AdConfig adConfig;
    private BannerAdSize adSize;
    private final List<PlacementAdUnit> ads;
    private File assetDirectory;
    private boolean assetsFullyDownloaded;
    private Map<String, String> incentivizedTextSettings;
    private Map<String, String> mraidFiles;

    @up2
    /* loaded from: classes2.dex */
    public static final class AdUnit {
        public static final Companion Companion = new Companion(null);
        private final String adExt;
        private final String adMarketId;
        private final String adSource;
        private final String adType;
        private final String advAppId;
        private final String bidToken;
        private final String callToActionUrl;
        private final String campaign;
        private final Boolean clickCoordinatesEnabled;
        private final String deeplinkUrl;
        private final Integer expiry;
        private final String id;
        private final String info;
        private final List<String> notification;
        private final Integer showClose;
        private final Integer showCloseIncentivized;
        private final Integer sleep;
        private final String templateId;
        private final TemplateSettings templateSettings;
        private final String templateType;
        private final String templateURL;
        private final Integer timestamp;
        private final Map<String, List<String>> tpat;
        private final Viewability viewability;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return AdPayload$AdUnit$$serializer.INSTANCE;
            }
        }

        public AdUnit() {
            this((String) null, (String) null, (String) null, (String) null, (Integer) null, (String) null, (String) null, (String) null, (Boolean) null, (Map) null, (String) null, (String) null, (String) null, (TemplateSettings) null, (String) null, (String) null, (String) null, (Integer) null, (Viewability) null, (String) null, (List) null, (Integer) null, (Integer) null, (Integer) null, 16777215, (ng0) null);
        }

        public static /* synthetic */ void getAdMarketId$annotations() {
        }

        public static /* synthetic */ void getAdvAppId$annotations() {
        }

        public static /* synthetic */ void getBidToken$annotations() {
        }

        public static /* synthetic */ void getClickCoordinatesEnabled$annotations() {
        }

        public static /* synthetic */ void getTemplateType$annotations() {
        }

        @up2(with = TpatSerializer.class)
        public static /* synthetic */ void getTpat$annotations() {
        }

        public static final void write$Self(AdUnit adUnit, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            boolean z22;
            boolean z23;
            Integer num;
            Integer num2;
            boolean z24 = false;
            if (g40Var.D() || adUnit.id != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, adUnit.id);
            }
            if (g40Var.D() || adUnit.adType != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, b23.f390a, adUnit.adType);
            }
            if (g40Var.D() || adUnit.adSource != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                g40Var.A(mp2Var, 2, b23.f390a, adUnit.adSource);
            }
            if (g40Var.D() || adUnit.campaign != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                g40Var.A(mp2Var, 3, b23.f390a, adUnit.campaign);
            }
            if (g40Var.D() || adUnit.expiry != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                g40Var.A(mp2Var, 4, ld1.f3105a, adUnit.expiry);
            }
            if (g40Var.D() || adUnit.advAppId != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                g40Var.A(mp2Var, 5, b23.f390a, adUnit.advAppId);
            }
            if (g40Var.D() || adUnit.callToActionUrl != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                g40Var.A(mp2Var, 6, b23.f390a, adUnit.callToActionUrl);
            }
            if (g40Var.D() || adUnit.deeplinkUrl != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                g40Var.A(mp2Var, 7, b23.f390a, adUnit.deeplinkUrl);
            }
            if (g40Var.D() || adUnit.clickCoordinatesEnabled != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                g40Var.A(mp2Var, 8, rq.f4201a, adUnit.clickCoordinatesEnabled);
            }
            if (g40Var.D() || adUnit.tpat != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g40Var.A(mp2Var, 9, TpatSerializer.INSTANCE, adUnit.tpat);
            }
            if (g40Var.D() || adUnit.templateURL != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                g40Var.A(mp2Var, 10, b23.f390a, adUnit.templateURL);
            }
            if (g40Var.D() || adUnit.templateId != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                g40Var.A(mp2Var, 11, b23.f390a, adUnit.templateId);
            }
            if (g40Var.D() || adUnit.templateType != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                g40Var.A(mp2Var, 12, b23.f390a, adUnit.templateType);
            }
            if (g40Var.D() || adUnit.templateSettings != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                g40Var.A(mp2Var, 13, AdPayload$TemplateSettings$$serializer.INSTANCE, adUnit.templateSettings);
            }
            if (g40Var.D() || adUnit.bidToken != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                g40Var.A(mp2Var, 14, b23.f390a, adUnit.bidToken);
            }
            if (g40Var.D() || adUnit.adMarketId != null) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                g40Var.A(mp2Var, 15, b23.f390a, adUnit.adMarketId);
            }
            if (g40Var.D() || adUnit.info != null) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                g40Var.A(mp2Var, 16, b23.f390a, adUnit.info);
            }
            if (g40Var.D() || adUnit.sleep != null) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z18) {
                g40Var.A(mp2Var, 17, ld1.f3105a, adUnit.sleep);
            }
            if (g40Var.D() || adUnit.viewability != null) {
                z19 = true;
            } else {
                z19 = false;
            }
            if (z19) {
                g40Var.A(mp2Var, 18, AdPayload$Viewability$$serializer.INSTANCE, adUnit.viewability);
            }
            if (g40Var.D() || adUnit.adExt != null) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (z20) {
                g40Var.A(mp2Var, 19, b23.f390a, adUnit.adExt);
            }
            if (g40Var.D() || adUnit.notification != null) {
                z21 = true;
            } else {
                z21 = false;
            }
            if (z21) {
                g40Var.A(mp2Var, 20, new ig(b23.f390a, 0), adUnit.notification);
            }
            if (g40Var.D() || adUnit.timestamp != null) {
                z22 = true;
            } else {
                z22 = false;
            }
            if (z22) {
                g40Var.A(mp2Var, 21, ld1.f3105a, adUnit.timestamp);
            }
            if (g40Var.D() || (num2 = adUnit.showCloseIncentivized) == null || num2.intValue() != 0) {
                z23 = true;
            } else {
                z23 = false;
            }
            if (z23) {
                g40Var.A(mp2Var, 22, ld1.f3105a, adUnit.showCloseIncentivized);
            }
            if (g40Var.D() || (num = adUnit.showClose) == null || num.intValue() != 0) {
                z24 = true;
            }
            if (z24) {
                g40Var.A(mp2Var, 23, ld1.f3105a, adUnit.showClose);
            }
        }

        public final String component1() {
            return this.id;
        }

        public final Map<String, List<String>> component10() {
            return this.tpat;
        }

        public final String component11() {
            return this.templateURL;
        }

        public final String component12() {
            return this.templateId;
        }

        public final String component13() {
            return this.templateType;
        }

        public final TemplateSettings component14() {
            return this.templateSettings;
        }

        public final String component15() {
            return this.bidToken;
        }

        public final String component16() {
            return this.adMarketId;
        }

        public final String component17() {
            return this.info;
        }

        public final Integer component18() {
            return this.sleep;
        }

        public final Viewability component19() {
            return this.viewability;
        }

        public final String component2() {
            return this.adType;
        }

        public final String component20() {
            return this.adExt;
        }

        public final List<String> component21() {
            return this.notification;
        }

        public final Integer component22() {
            return this.timestamp;
        }

        public final Integer component23() {
            return this.showCloseIncentivized;
        }

        public final Integer component24() {
            return this.showClose;
        }

        public final String component3() {
            return this.adSource;
        }

        public final String component4() {
            return this.campaign;
        }

        public final Integer component5() {
            return this.expiry;
        }

        public final String component6() {
            return this.advAppId;
        }

        public final String component7() {
            return this.callToActionUrl;
        }

        public final String component8() {
            return this.deeplinkUrl;
        }

        public final Boolean component9() {
            return this.clickCoordinatesEnabled;
        }

        public final AdUnit copy(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, TemplateSettings templateSettings, String str11, String str12, String str13, Integer num2, Viewability viewability, String str14, List<String> list, Integer num3, Integer num4, Integer num5) {
            return new AdUnit(str, str2, str3, str4, num, str5, str6, str7, bool, map, str8, str9, str10, templateSettings, str11, str12, str13, num2, viewability, str14, list, num3, num4, num5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdUnit)) {
                return false;
            }
            AdUnit adUnit = (AdUnit) obj;
            return m20.L(this.id, adUnit.id) && m20.L(this.adType, adUnit.adType) && m20.L(this.adSource, adUnit.adSource) && m20.L(this.campaign, adUnit.campaign) && m20.L(this.expiry, adUnit.expiry) && m20.L(this.advAppId, adUnit.advAppId) && m20.L(this.callToActionUrl, adUnit.callToActionUrl) && m20.L(this.deeplinkUrl, adUnit.deeplinkUrl) && m20.L(this.clickCoordinatesEnabled, adUnit.clickCoordinatesEnabled) && m20.L(this.tpat, adUnit.tpat) && m20.L(this.templateURL, adUnit.templateURL) && m20.L(this.templateId, adUnit.templateId) && m20.L(this.templateType, adUnit.templateType) && m20.L(this.templateSettings, adUnit.templateSettings) && m20.L(this.bidToken, adUnit.bidToken) && m20.L(this.adMarketId, adUnit.adMarketId) && m20.L(this.info, adUnit.info) && m20.L(this.sleep, adUnit.sleep) && m20.L(this.viewability, adUnit.viewability) && m20.L(this.adExt, adUnit.adExt) && m20.L(this.notification, adUnit.notification) && m20.L(this.timestamp, adUnit.timestamp) && m20.L(this.showCloseIncentivized, adUnit.showCloseIncentivized) && m20.L(this.showClose, adUnit.showClose);
        }

        public final String getAdExt() {
            return this.adExt;
        }

        public final String getAdMarketId() {
            return this.adMarketId;
        }

        public final String getAdSource() {
            return this.adSource;
        }

        public final String getAdType() {
            return this.adType;
        }

        public final String getAdvAppId() {
            return this.advAppId;
        }

        public final String getBidToken() {
            return this.bidToken;
        }

        public final String getCallToActionUrl() {
            return this.callToActionUrl;
        }

        public final String getCampaign() {
            return this.campaign;
        }

        public final Boolean getClickCoordinatesEnabled() {
            return this.clickCoordinatesEnabled;
        }

        public final String getDeeplinkUrl() {
            return this.deeplinkUrl;
        }

        public final Integer getExpiry() {
            return this.expiry;
        }

        public final String getId() {
            return this.id;
        }

        public final String getInfo() {
            return this.info;
        }

        public final List<String> getNotification() {
            return this.notification;
        }

        public final Integer getShowClose() {
            return this.showClose;
        }

        public final Integer getShowCloseIncentivized() {
            return this.showCloseIncentivized;
        }

        public final Integer getSleep() {
            return this.sleep;
        }

        public final String getTemplateId() {
            return this.templateId;
        }

        public final TemplateSettings getTemplateSettings() {
            return this.templateSettings;
        }

        public final String getTemplateType() {
            return this.templateType;
        }

        public final String getTemplateURL() {
            return this.templateURL;
        }

        public final Integer getTimestamp() {
            return this.timestamp;
        }

        public final Map<String, List<String>> getTpat() {
            return this.tpat;
        }

        public final Viewability getViewability() {
            return this.viewability;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adType;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.adSource;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.campaign;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Integer num = this.expiry;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            String str5 = this.advAppId;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.callToActionUrl;
            int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.deeplinkUrl;
            int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
            Boolean bool = this.clickCoordinatesEnabled;
            int hashCode9 = (hashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
            Map<String, List<String>> map = this.tpat;
            int hashCode10 = (hashCode9 + (map == null ? 0 : map.hashCode())) * 31;
            String str8 = this.templateURL;
            int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.templateId;
            int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.templateType;
            int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
            TemplateSettings templateSettings = this.templateSettings;
            int hashCode14 = (hashCode13 + (templateSettings == null ? 0 : templateSettings.hashCode())) * 31;
            String str11 = this.bidToken;
            int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.adMarketId;
            int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.info;
            int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
            Integer num2 = this.sleep;
            int hashCode18 = (hashCode17 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Viewability viewability = this.viewability;
            int hashCode19 = (hashCode18 + (viewability == null ? 0 : viewability.hashCode())) * 31;
            String str14 = this.adExt;
            int hashCode20 = (hashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
            List<String> list = this.notification;
            int hashCode21 = (hashCode20 + (list == null ? 0 : list.hashCode())) * 31;
            Integer num3 = this.timestamp;
            int hashCode22 = (hashCode21 + (num3 == null ? 0 : num3.hashCode())) * 31;
            Integer num4 = this.showCloseIncentivized;
            int hashCode23 = (hashCode22 + (num4 == null ? 0 : num4.hashCode())) * 31;
            Integer num5 = this.showClose;
            return hashCode23 + (num5 != null ? num5.hashCode() : 0);
        }

        public String toString() {
            String str = this.id;
            String str2 = this.adType;
            String str3 = this.adSource;
            String str4 = this.campaign;
            Integer num = this.expiry;
            String str5 = this.advAppId;
            String str6 = this.callToActionUrl;
            String str7 = this.deeplinkUrl;
            Boolean bool = this.clickCoordinatesEnabled;
            Map<String, List<String>> map = this.tpat;
            String str8 = this.templateURL;
            String str9 = this.templateId;
            String str10 = this.templateType;
            TemplateSettings templateSettings = this.templateSettings;
            String str11 = this.bidToken;
            String str12 = this.adMarketId;
            String str13 = this.info;
            Integer num2 = this.sleep;
            Viewability viewability = this.viewability;
            String str14 = this.adExt;
            List<String> list = this.notification;
            Integer num3 = this.timestamp;
            Integer num4 = this.showCloseIncentivized;
            Integer num5 = this.showClose;
            StringBuilder q = p71.q("AdUnit(id=", str, ", adType=", str2, ", adSource=");
            p71.A(q, str3, ", campaign=", str4, ", expiry=");
            q.append(num);
            q.append(", advAppId=");
            q.append(str5);
            q.append(", callToActionUrl=");
            p71.A(q, str6, ", deeplinkUrl=", str7, ", clickCoordinatesEnabled=");
            q.append(bool);
            q.append(", tpat=");
            q.append(map);
            q.append(", templateURL=");
            p71.A(q, str8, ", templateId=", str9, ", templateType=");
            q.append(str10);
            q.append(", templateSettings=");
            q.append(templateSettings);
            q.append(", bidToken=");
            p71.A(q, str11, ", adMarketId=", str12, ", info=");
            q.append(str13);
            q.append(", sleep=");
            q.append(num2);
            q.append(", viewability=");
            q.append(viewability);
            q.append(", adExt=");
            q.append(str14);
            q.append(", notification=");
            q.append(list);
            q.append(", timestamp=");
            q.append(num3);
            q.append(", showCloseIncentivized=");
            q.append(num4);
            q.append(", showClose=");
            q.append(num5);
            q.append(")");
            return q.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AdUnit(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map<String, ? extends List<String>> map, String str8, String str9, String str10, TemplateSettings templateSettings, String str11, String str12, String str13, Integer num2, Viewability viewability, String str14, List<String> list, Integer num3, Integer num4, Integer num5) {
            this.id = str;
            this.adType = str2;
            this.adSource = str3;
            this.campaign = str4;
            this.expiry = num;
            this.advAppId = str5;
            this.callToActionUrl = str6;
            this.deeplinkUrl = str7;
            this.clickCoordinatesEnabled = bool;
            this.tpat = map;
            this.templateURL = str8;
            this.templateId = str9;
            this.templateType = str10;
            this.templateSettings = templateSettings;
            this.bidToken = str11;
            this.adMarketId = str12;
            this.info = str13;
            this.sleep = num2;
            this.viewability = viewability;
            this.adExt = str14;
            this.notification = list;
            this.timestamp = num3;
            this.showCloseIncentivized = num4;
            this.showClose = num5;
        }

        public /* synthetic */ AdUnit(int i, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, @up2(with = TpatSerializer.class) Map map, String str8, String str9, String str10, TemplateSettings templateSettings, String str11, String str12, String str13, Integer num2, Viewability viewability, String str14, List list, Integer num3, Integer num4, Integer num5, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, AdPayload$AdUnit$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.id = null;
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.adType = null;
            } else {
                this.adType = str2;
            }
            if ((i & 4) == 0) {
                this.adSource = null;
            } else {
                this.adSource = str3;
            }
            if ((i & 8) == 0) {
                this.campaign = null;
            } else {
                this.campaign = str4;
            }
            if ((i & 16) == 0) {
                this.expiry = null;
            } else {
                this.expiry = num;
            }
            if ((i & 32) == 0) {
                this.advAppId = null;
            } else {
                this.advAppId = str5;
            }
            if ((i & 64) == 0) {
                this.callToActionUrl = null;
            } else {
                this.callToActionUrl = str6;
            }
            if ((i & 128) == 0) {
                this.deeplinkUrl = null;
            } else {
                this.deeplinkUrl = str7;
            }
            if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                this.clickCoordinatesEnabled = null;
            } else {
                this.clickCoordinatesEnabled = bool;
            }
            if ((i & 512) == 0) {
                this.tpat = null;
            } else {
                this.tpat = map;
            }
            if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                this.templateURL = null;
            } else {
                this.templateURL = str8;
            }
            if ((i & 2048) == 0) {
                this.templateId = null;
            } else {
                this.templateId = str9;
            }
            if ((i & v.DEFAULT_BUFFER_SIZE) == 0) {
                this.templateType = null;
            } else {
                this.templateType = str10;
            }
            if ((i & 8192) == 0) {
                this.templateSettings = null;
            } else {
                this.templateSettings = templateSettings;
            }
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                this.bidToken = null;
            } else {
                this.bidToken = str11;
            }
            if ((32768 & i) == 0) {
                this.adMarketId = null;
            } else {
                this.adMarketId = str12;
            }
            if ((65536 & i) == 0) {
                this.info = null;
            } else {
                this.info = str13;
            }
            if ((131072 & i) == 0) {
                this.sleep = null;
            } else {
                this.sleep = num2;
            }
            if ((262144 & i) == 0) {
                this.viewability = null;
            } else {
                this.viewability = viewability;
            }
            if ((524288 & i) == 0) {
                this.adExt = null;
            } else {
                this.adExt = str14;
            }
            if ((1048576 & i) == 0) {
                this.notification = null;
            } else {
                this.notification = list;
            }
            if ((2097152 & i) == 0) {
                this.timestamp = null;
            } else {
                this.timestamp = num3;
            }
            if ((4194304 & i) == 0) {
                this.showCloseIncentivized = 0;
            } else {
                this.showCloseIncentivized = num4;
            }
            if ((i & 8388608) == 0) {
                this.showClose = 0;
            } else {
                this.showClose = num5;
            }
        }

        public /* synthetic */ AdUnit(String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Boolean bool, Map map, String str8, String str9, String str10, TemplateSettings templateSettings, String str11, String str12, String str13, Integer num2, Viewability viewability, String str14, List list, Integer num3, Integer num4, Integer num5, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : bool, (i & 512) != 0 ? null : map, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str8, (i & 2048) != 0 ? null : str9, (i & v.DEFAULT_BUFFER_SIZE) != 0 ? null : str10, (i & 8192) != 0 ? null : templateSettings, (i & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (i & 32768) != 0 ? null : str12, (i & 65536) != 0 ? null : str13, (i & 131072) != 0 ? null : num2, (i & 262144) != 0 ? null : viewability, (i & 524288) != 0 ? null : str14, (i & 1048576) != 0 ? null : list, (i & 2097152) != 0 ? null : num3, (i & 4194304) != 0 ? 0 : num4, (i & 8388608) != 0 ? 0 : num5);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class CacheableReplacement {
        public static final Companion Companion = new Companion(null);
        private final String extension;
        private final String url;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return AdPayload$CacheableReplacement$$serializer.INSTANCE;
            }
        }

        public CacheableReplacement() {
            this((String) null, (String) null, 3, (ng0) null);
        }

        public static /* synthetic */ CacheableReplacement copy$default(CacheableReplacement cacheableReplacement, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cacheableReplacement.url;
            }
            if ((i & 2) != 0) {
                str2 = cacheableReplacement.extension;
            }
            return cacheableReplacement.copy(str, str2);
        }

        public static final void write$Self(CacheableReplacement cacheableReplacement, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || cacheableReplacement.url != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, cacheableReplacement.url);
            }
            if (g40Var.D() || cacheableReplacement.extension != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, b23.f390a, cacheableReplacement.extension);
            }
        }

        public final String component1() {
            return this.url;
        }

        public final String component2() {
            return this.extension;
        }

        public final CacheableReplacement copy(String str, String str2) {
            return new CacheableReplacement(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CacheableReplacement)) {
                return false;
            }
            CacheableReplacement cacheableReplacement = (CacheableReplacement) obj;
            return m20.L(this.url, cacheableReplacement.url) && m20.L(this.extension, cacheableReplacement.extension);
        }

        public final String getExtension() {
            return this.extension;
        }

        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            String str = this.url;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.extension;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ")";
        }

        public /* synthetic */ CacheableReplacement(int i, String str, String str2, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, AdPayload$CacheableReplacement$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.url = null;
            } else {
                this.url = str;
            }
            if ((i & 2) == 0) {
                this.extension = null;
            } else {
                this.extension = str2;
            }
        }

        public CacheableReplacement(String str, String str2) {
            this.url = str;
            this.extension = str2;
        }

        public /* synthetic */ CacheableReplacement(String str, String str2, int i, ng0 ng0Var) {
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

        public final uh1 serializer() {
            return AdPayload$$serializer.INSTANCE;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class PlacementAdUnit {
        public static final Companion Companion = new Companion(null);
        private final AdUnit adMarkup;
        private final String placementReferenceId;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return AdPayload$PlacementAdUnit$$serializer.INSTANCE;
            }
        }

        public PlacementAdUnit() {
            this((String) null, (AdUnit) null, 3, (ng0) null);
        }

        public static /* synthetic */ PlacementAdUnit copy$default(PlacementAdUnit placementAdUnit, String str, AdUnit adUnit, int i, Object obj) {
            if ((i & 1) != 0) {
                str = placementAdUnit.placementReferenceId;
            }
            if ((i & 2) != 0) {
                adUnit = placementAdUnit.adMarkup;
            }
            return placementAdUnit.copy(str, adUnit);
        }

        public static /* synthetic */ void getAdMarkup$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        public static final void write$Self(PlacementAdUnit placementAdUnit, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || placementAdUnit.placementReferenceId != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, placementAdUnit.placementReferenceId);
            }
            if (g40Var.D() || placementAdUnit.adMarkup != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, AdPayload$AdUnit$$serializer.INSTANCE, placementAdUnit.adMarkup);
            }
        }

        public final String component1() {
            return this.placementReferenceId;
        }

        public final AdUnit component2() {
            return this.adMarkup;
        }

        public final PlacementAdUnit copy(String str, AdUnit adUnit) {
            return new PlacementAdUnit(str, adUnit);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacementAdUnit)) {
                return false;
            }
            PlacementAdUnit placementAdUnit = (PlacementAdUnit) obj;
            return m20.L(this.placementReferenceId, placementAdUnit.placementReferenceId) && m20.L(this.adMarkup, placementAdUnit.adMarkup);
        }

        public final AdUnit getAdMarkup() {
            return this.adMarkup;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public int hashCode() {
            String str = this.placementReferenceId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            AdUnit adUnit = this.adMarkup;
            return hashCode + (adUnit != null ? adUnit.hashCode() : 0);
        }

        public String toString() {
            return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ")";
        }

        public /* synthetic */ PlacementAdUnit(int i, String str, AdUnit adUnit, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, AdPayload$PlacementAdUnit$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str;
            }
            if ((i & 2) == 0) {
                this.adMarkup = null;
            } else {
                this.adMarkup = adUnit;
            }
        }

        public PlacementAdUnit(String str, AdUnit adUnit) {
            this.placementReferenceId = str;
            this.adMarkup = adUnit;
        }

        public /* synthetic */ PlacementAdUnit(String str, AdUnit adUnit, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : adUnit);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class TemplateSettings {
        public static final Companion Companion = new Companion(null);
        private final Map<String, CacheableReplacement> cacheableReplacements;
        private final Map<String, String> normalReplacements;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return AdPayload$TemplateSettings$$serializer.INSTANCE;
            }
        }

        public TemplateSettings() {
            this((Map) null, (Map) null, 3, (ng0) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TemplateSettings copy$default(TemplateSettings templateSettings, Map map, Map map2, int i, Object obj) {
            if ((i & 1) != 0) {
                map = templateSettings.normalReplacements;
            }
            if ((i & 2) != 0) {
                map2 = templateSettings.cacheableReplacements;
            }
            return templateSettings.copy(map, map2);
        }

        public static /* synthetic */ void getCacheableReplacements$annotations() {
        }

        public static /* synthetic */ void getNormalReplacements$annotations() {
        }

        public static final void write$Self(TemplateSettings templateSettings, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || templateSettings.normalReplacements != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                b23 b23Var = b23.f390a;
                g40Var.A(mp2Var, 0, new m71(b23Var, b23Var, 1), templateSettings.normalReplacements);
            }
            if (g40Var.D() || templateSettings.cacheableReplacements != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, new m71(b23.f390a, AdPayload$CacheableReplacement$$serializer.INSTANCE, 1), templateSettings.cacheableReplacements);
            }
        }

        public final Map<String, String> component1() {
            return this.normalReplacements;
        }

        public final Map<String, CacheableReplacement> component2() {
            return this.cacheableReplacements;
        }

        public final TemplateSettings copy(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            return new TemplateSettings(map, map2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TemplateSettings)) {
                return false;
            }
            TemplateSettings templateSettings = (TemplateSettings) obj;
            return m20.L(this.normalReplacements, templateSettings.normalReplacements) && m20.L(this.cacheableReplacements, templateSettings.cacheableReplacements);
        }

        public final Map<String, CacheableReplacement> getCacheableReplacements() {
            return this.cacheableReplacements;
        }

        public final Map<String, String> getNormalReplacements() {
            return this.normalReplacements;
        }

        public int hashCode() {
            Map<String, String> map = this.normalReplacements;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, CacheableReplacement> map2 = this.cacheableReplacements;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        public String toString() {
            return "TemplateSettings(normalReplacements=" + this.normalReplacements + ", cacheableReplacements=" + this.cacheableReplacements + ")";
        }

        public /* synthetic */ TemplateSettings(int i, Map map, Map map2, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, AdPayload$TemplateSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.normalReplacements = null;
            } else {
                this.normalReplacements = map;
            }
            if ((i & 2) == 0) {
                this.cacheableReplacements = null;
            } else {
                this.cacheableReplacements = map2;
            }
        }

        public TemplateSettings(Map<String, String> map, Map<String, CacheableReplacement> map2) {
            this.normalReplacements = map;
            this.cacheableReplacements = map2;
        }

        public /* synthetic */ TemplateSettings(Map map, Map map2, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : map2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class TpatSerializer extends bh1 {
        public static final TpatSerializer INSTANCE = new TpatSerializer();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private TpatSerializer() {
            /*
                r4 = this;
                b23 r0 = defpackage.b23.f390a
                ig r1 = new ig
                r2 = 0
                r1.<init>(r0, r2)
                m71 r2 = new m71
                r3 = 1
                r2.<init>(r0, r1, r3)
                r4.<init>(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.AdPayload.TpatSerializer.<init>():void");
        }

        @Override // defpackage.bh1
        public eg1 transformDeserialize(eg1 eg1Var) {
            tg1 tg1Var;
            if (eg1Var instanceof tg1) {
                tg1Var = (tg1) eg1Var;
            } else {
                tg1Var = null;
            }
            if (tg1Var != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : tg1Var.entrySet()) {
                    if (!m20.L((String) entry.getKey(), "moat")) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                return new tg1(linkedHashMap);
            }
            zf3.q("JsonObject", eg1Var);
            throw null;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Viewability {
        public static final Companion Companion = new Companion(null);
        private final ViewabilityInfo om;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return AdPayload$Viewability$$serializer.INSTANCE;
            }
        }

        public Viewability() {
            this((ViewabilityInfo) null, 1, (ng0) null);
        }

        public static /* synthetic */ Viewability copy$default(Viewability viewability, ViewabilityInfo viewabilityInfo, int i, Object obj) {
            if ((i & 1) != 0) {
                viewabilityInfo = viewability.om;
            }
            return viewability.copy(viewabilityInfo);
        }

        public static final void write$Self(Viewability viewability, g40 g40Var, mp2 mp2Var) {
            boolean z;
            if (g40Var.D() || viewability.om != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, AdPayload$ViewabilityInfo$$serializer.INSTANCE, viewability.om);
            }
        }

        public final ViewabilityInfo component1() {
            return this.om;
        }

        public final Viewability copy(ViewabilityInfo viewabilityInfo) {
            return new Viewability(viewabilityInfo);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Viewability) && m20.L(this.om, ((Viewability) obj).om);
        }

        public final ViewabilityInfo getOm() {
            return this.om;
        }

        public int hashCode() {
            ViewabilityInfo viewabilityInfo = this.om;
            if (viewabilityInfo == null) {
                return 0;
            }
            return viewabilityInfo.hashCode();
        }

        public String toString() {
            return "Viewability(om=" + this.om + ")";
        }

        public /* synthetic */ Viewability(int i, ViewabilityInfo viewabilityInfo, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, AdPayload$Viewability$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.om = null;
            } else {
                this.om = viewabilityInfo;
            }
        }

        public Viewability(ViewabilityInfo viewabilityInfo) {
            this.om = viewabilityInfo;
        }

        public /* synthetic */ Viewability(ViewabilityInfo viewabilityInfo, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : viewabilityInfo);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class ViewabilityInfo {
        public static final Companion Companion = new Companion(null);
        private final String extraVast;
        private final Boolean isEnabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return AdPayload$ViewabilityInfo$$serializer.INSTANCE;
            }
        }

        public ViewabilityInfo() {
            this((Boolean) null, (String) null, 3, (ng0) null);
        }

        public static /* synthetic */ ViewabilityInfo copy$default(ViewabilityInfo viewabilityInfo, Boolean bool, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = viewabilityInfo.isEnabled;
            }
            if ((i & 2) != 0) {
                str = viewabilityInfo.extraVast;
            }
            return viewabilityInfo.copy(bool, str);
        }

        public static /* synthetic */ void getExtraVast$annotations() {
        }

        public static /* synthetic */ void isEnabled$annotations() {
        }

        public static final void write$Self(ViewabilityInfo viewabilityInfo, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || viewabilityInfo.isEnabled != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, rq.f4201a, viewabilityInfo.isEnabled);
            }
            if (g40Var.D() || viewabilityInfo.extraVast != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, b23.f390a, viewabilityInfo.extraVast);
            }
        }

        public final Boolean component1() {
            return this.isEnabled;
        }

        public final String component2() {
            return this.extraVast;
        }

        public final ViewabilityInfo copy(Boolean bool, String str) {
            return new ViewabilityInfo(bool, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewabilityInfo)) {
                return false;
            }
            ViewabilityInfo viewabilityInfo = (ViewabilityInfo) obj;
            return m20.L(this.isEnabled, viewabilityInfo.isEnabled) && m20.L(this.extraVast, viewabilityInfo.extraVast);
        }

        public final String getExtraVast() {
            return this.extraVast;
        }

        public int hashCode() {
            Boolean bool = this.isEnabled;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.extraVast;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public final Boolean isEnabled() {
            return this.isEnabled;
        }

        public String toString() {
            return "ViewabilityInfo(isEnabled=" + this.isEnabled + ", extraVast=" + this.extraVast + ")";
        }

        public /* synthetic */ ViewabilityInfo(int i, Boolean bool, String str, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, AdPayload$ViewabilityInfo$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.isEnabled = null;
            } else {
                this.isEnabled = bool;
            }
            if ((i & 2) == 0) {
                this.extraVast = null;
            } else {
                this.extraVast = str;
            }
        }

        public ViewabilityInfo(Boolean bool, String str) {
            this.isEnabled = bool;
            this.extraVast = str;
        }

        public /* synthetic */ ViewabilityInfo(Boolean bool, String str, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
        }
    }

    public AdPayload() {
        this(null, 1, null);
    }

    private final PlacementAdUnit getAd() {
        List<PlacementAdUnit> list = this.ads;
        if (list == null || !(!list.isEmpty())) {
            return null;
        }
        return list.get(0);
    }

    public static /* synthetic */ void getAdConfig$annotations() {
    }

    private final AdUnit getAdMarkup() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getAdMarkup();
        }
        return null;
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    public static /* synthetic */ void getAssetDirectory$annotations() {
    }

    public static /* synthetic */ void getIncentivizedTextSettings$annotations() {
    }

    public static /* synthetic */ List getTpatUrls$default(AdPayload adPayload, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return adPayload.getTpatUrls(str, str2);
    }

    public static final void write$Self(AdPayload adPayload, g40 g40Var, mp2 mp2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (g40Var.D() || adPayload.ads != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g40Var.A(mp2Var, 0, new ig(AdPayload$PlacementAdUnit$$serializer.INSTANCE, 0), adPayload.ads);
        }
        if (g40Var.D() || !m20.L(adPayload.mraidFiles, new HashMap())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            b23 b23Var = b23.f390a;
            g40Var.p(mp2Var, 1, new m71(b23Var, b23Var, 1), adPayload.mraidFiles);
        }
        if (g40Var.D() || !m20.L(adPayload.incentivizedTextSettings, new HashMap())) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            b23 b23Var2 = b23.f390a;
            g40Var.p(mp2Var, 2, new m71(b23Var2, b23Var2, 1), adPayload.incentivizedTextSettings);
        }
        if (g40Var.D() || adPayload.assetsFullyDownloaded) {
            z4 = true;
        }
        if (z4) {
            g40Var.n(mp2Var, 3, adPayload.assetsFullyDownloaded);
        }
    }

    public final AdUnit adUnit() {
        return getAdMarkup();
    }

    public final String appId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdvAppId();
        }
        return null;
    }

    public final tg1 createMRAIDArgs() {
        Map<String, String> mRAIDArgsInMap = getMRAIDArgsInMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : mRAIDArgsInMap.entrySet()) {
        }
        return new tg1(linkedHashMap);
    }

    public final String eventId() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getId();
        }
        return null;
    }

    public final AdConfig getAdConfig() {
        return this.adConfig;
    }

    public final BannerAdSize getAdSize() {
        return this.adSize;
    }

    public final String getAdType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getAdType();
        }
        return null;
    }

    public final File getAssetDirectory() {
        return this.assetDirectory;
    }

    public final boolean getAssetsFullyDownloaded() {
        return this.assetsFullyDownloaded;
    }

    public final String getCreativeId() {
        String campaign;
        boolean z;
        List list;
        AdUnit adMarkup = getAdMarkup();
        String str = null;
        if (adMarkup != null && (campaign = adMarkup.getCampaign()) != null) {
            if (campaign.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Pattern compile = Pattern.compile("\\|");
                i23.l1(0);
                Matcher matcher = compile.matcher(campaign);
                if (!matcher.find()) {
                    list = Collections.singletonList(campaign.toString());
                } else {
                    ArrayList arrayList = new ArrayList(10);
                    int i = 0;
                    do {
                        arrayList.add(campaign.subSequence(i, matcher.start()).toString());
                        i = matcher.end();
                    } while (matcher.find());
                    arrayList.add(campaign.subSequence(i, campaign.length()).toString());
                    list = arrayList;
                }
                String[] strArr = (String[]) list.toArray(new String[0]);
                if (strArr.length >= 2) {
                    str = strArr[1];
                }
            }
        }
        if (str == null) {
            return "unknown";
        }
        return str;
    }

    public final Map<String, String> getDownloadableUrls() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        AdUnit adMarkup;
        String templateURL;
        HashMap hashMap = new HashMap();
        if (!isNativeTemplateType() && (adMarkup = getAdMarkup()) != null && (templateURL = adMarkup.getTemplateURL()) != null && FileUtility.INSTANCE.isValidUrl(templateURL)) {
            hashMap.put(KEY_TEMPLATE, templateURL);
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (templateSettings = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings.getCacheableReplacements()) != null) {
            for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                String url = entry.getValue().getUrl();
                if (url != null) {
                    FileUtility fileUtility = FileUtility.INSTANCE;
                    if (fileUtility.isValidUrl(url)) {
                        hashMap.put(fileUtility.guessFileName(url, entry.getValue().getExtension()), url);
                    }
                }
            }
        }
        return hashMap;
    }

    public final int getExpiry() {
        Integer expiry;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (expiry = adMarkup.getExpiry()) != null) {
            return expiry.intValue();
        }
        return 0;
    }

    public final Map<String, String> getIncentivizedTextSettings() {
        return this.incentivizedTextSettings;
    }

    public final Map<String, String> getMRAIDArgsInMap() {
        TemplateSettings templateSettings;
        TemplateSettings templateSettings2;
        Map<String, CacheableReplacement> cacheableReplacements;
        TemplateSettings templateSettings3;
        Map<String, String> normalReplacements;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            templateSettings = adMarkup.getTemplateSettings();
        } else {
            templateSettings = null;
        }
        if (templateSettings != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AdUnit adMarkup2 = getAdMarkup();
            if (adMarkup2 != null && (templateSettings3 = adMarkup2.getTemplateSettings()) != null && (normalReplacements = templateSettings3.getNormalReplacements()) != null) {
                linkedHashMap.putAll(normalReplacements);
            }
            AdUnit adMarkup3 = getAdMarkup();
            if (adMarkup3 != null && (templateSettings2 = adMarkup3.getTemplateSettings()) != null && (cacheableReplacements = templateSettings2.getCacheableReplacements()) != null) {
                for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                    String url = entry.getValue().getUrl();
                    if (url != null) {
                        linkedHashMap.put(entry.getKey(), url);
                    }
                }
            }
            if (!this.mraidFiles.isEmpty()) {
                linkedHashMap.putAll(this.mraidFiles);
            }
            if (!this.incentivizedTextSettings.isEmpty()) {
                linkedHashMap.putAll(this.incentivizedTextSettings);
            }
            return linkedHashMap;
        }
        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
    }

    public final String getMainVideoUrl() {
        TemplateSettings templateSettings;
        Map<String, CacheableReplacement> cacheableReplacements;
        CacheableReplacement cacheableReplacement;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (templateSettings = adMarkup.getTemplateSettings()) == null || (cacheableReplacements = templateSettings.getCacheableReplacements()) == null || (cacheableReplacement = cacheableReplacements.get("MAIN_VIDEO")) == null) {
            return null;
        }
        String url = cacheableReplacement.getUrl();
        if (!FileUtility.INSTANCE.isValidUrl(url)) {
            return null;
        }
        return url;
    }

    public final int getShowCloseDelay(Boolean bool) {
        Integer showClose;
        Integer showCloseIncentivized;
        if (m20.L(bool, Boolean.TRUE)) {
            AdUnit adMarkup = getAdMarkup();
            if (adMarkup == null || (showCloseIncentivized = adMarkup.getShowCloseIncentivized()) == null) {
                return 0;
            }
            return showCloseIncentivized.intValue() * 1000;
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 == null || (showClose = adMarkup2.getShowClose()) == null) {
            return 0;
        }
        return showClose.intValue() * 1000;
    }

    public final List<String> getTpatUrls(String str, String str2) {
        boolean z;
        List<String> list;
        String str3;
        Map<String, List<String>> tpat;
        Map<String, List<String>> tpat2;
        AdUnit adMarkup = getAdMarkup();
        boolean z2 = false;
        if (adMarkup != null && (tpat2 = adMarkup.getTpat()) != null && !tpat2.containsKey(str)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(128, "Invalid tpat key: ".concat(str), placementId(), getCreativeId(), eventId());
            return null;
        }
        AdUnit adMarkup2 = getAdMarkup();
        if (adMarkup2 != null && (tpat = adMarkup2.getTpat()) != null) {
            list = tpat.get(str);
        } else {
            list = null;
        }
        List<String> list2 = list;
        if (list2 == null || list2.isEmpty()) {
            z2 = true;
        }
        if (z2) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: ".concat(str), placementId(), getCreativeId(), eventId());
            return null;
        }
        if (m20.L(str, Constants.CHECKPOINT_0)) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Pattern.compile(Pattern.quote(Constants.REMOTE_PLAY_KEY)).matcher((String) it.next()).replaceAll(String.valueOf(!this.assetsFullyDownloaded)));
            }
            return arrayList;
        }
        if (m20.L(str, Constants.DEEPLINK_CLICK)) {
            ArrayList arrayList2 = new ArrayList();
            for (String str4 : list) {
                Pattern compile = Pattern.compile(Pattern.quote(Constants.DEEPLINK_SUCCESS_KEY));
                if (str2 == null) {
                    str3 = "";
                } else {
                    str3 = str2;
                }
                arrayList2.add(compile.matcher(str4).replaceAll(str3));
            }
            return arrayList2;
        }
        return list;
    }

    public final List<String> getWinNotifications() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getNotification();
        }
        return null;
    }

    public final boolean hasExpired() {
        Integer expiry;
        boolean z;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup == null || (expiry = adMarkup.getExpiry()) == null) {
            return false;
        }
        if (expiry.intValue() < System.currentTimeMillis() / 1000) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return true;
    }

    public final boolean isClickCoordinatesTrackingEnabled() {
        Boolean clickCoordinatesEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (clickCoordinatesEnabled = adMarkup.getClickCoordinatesEnabled()) != null) {
            return clickCoordinatesEnabled.booleanValue();
        }
        return false;
    }

    public final boolean isNativeTemplateType() {
        String str;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            str = adMarkup.getTemplateType();
        } else {
            str = null;
        }
        return m20.L("native", str);
    }

    public final boolean omEnabled() {
        Viewability viewability;
        ViewabilityInfo om;
        Boolean isEnabled;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null && (viewability = adMarkup.getViewability()) != null && (om = viewability.getOm()) != null && (isEnabled = om.isEnabled()) != null) {
            return isEnabled.booleanValue();
        }
        return false;
    }

    public final String placementId() {
        PlacementAdUnit ad = getAd();
        if (ad != null) {
            return ad.getPlacementReferenceId();
        }
        return null;
    }

    public final void setAdConfig(AdConfig adConfig) {
        this.adConfig = adConfig;
    }

    public final void setAdSize(BannerAdSize bannerAdSize) {
        this.adSize = bannerAdSize;
    }

    public final void setAssetFullyDownloaded() {
        this.assetsFullyDownloaded = true;
    }

    public final void setAssetsFullyDownloaded(boolean z) {
        this.assetsFullyDownloaded = z;
    }

    public final void setIncentivizedText(String str, String str2, String str3, String str4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.incentivizedTextSettings.put(INCENTIVIZED_TITLE_TEXT, str);
        }
        if (str2.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.incentivizedTextSettings.put(INCENTIVIZED_BODY_TEXT, str2);
        }
        if (str3.length() > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CONTINUE_TEXT, str3);
        }
        if (str4.length() <= 0) {
            z4 = false;
        }
        if (z4) {
            this.incentivizedTextSettings.put(INCENTIVIZED_CLOSE_TEXT, str4);
        }
    }

    public final void setIncentivizedTextSettings(Map<String, String> map) {
        this.incentivizedTextSettings = map;
    }

    public final void setMraidAssetDir(File file, List<String> list) {
        TemplateSettings templateSettings;
        TemplateSettings templateSettings2;
        Map<String, CacheableReplacement> cacheableReplacements;
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            templateSettings = adMarkup.getTemplateSettings();
        } else {
            templateSettings = null;
        }
        if (templateSettings != null) {
            this.assetDirectory = file;
            AdUnit adMarkup2 = getAdMarkup();
            if (adMarkup2 != null && (templateSettings2 = adMarkup2.getTemplateSettings()) != null && (cacheableReplacements = templateSettings2.getCacheableReplacements()) != null) {
                for (Map.Entry<String, CacheableReplacement> entry : cacheableReplacements.entrySet()) {
                    String url = entry.getValue().getUrl();
                    if (url != null) {
                        FileUtility fileUtility = FileUtility.INSTANCE;
                        if (fileUtility.isValidUrl(url)) {
                            File file2 = new File(file, fileUtility.guessFileName(url, entry.getValue().getExtension()));
                            if (file2.exists() && list.contains(file2.getAbsolutePath())) {
                                this.mraidFiles.put(entry.getKey(), FILE_SCHEME + file2.getPath());
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Advertisement does not have MRAID Arguments!".toString());
    }

    public final String templateType() {
        AdUnit adMarkup = getAdMarkup();
        if (adMarkup != null) {
            return adMarkup.getTemplateType();
        }
        return null;
    }

    public /* synthetic */ AdPayload(int i, List list, Map map, Map map2, boolean z, vp2 vp2Var) {
        if ((i & 0) != 0) {
            pd0.R(i, 0, AdPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.ads = null;
        } else {
            this.ads = list;
        }
        if ((i & 2) == 0) {
            this.mraidFiles = new HashMap();
        } else {
            this.mraidFiles = map;
        }
        if ((i & 4) == 0) {
            this.incentivizedTextSettings = new HashMap();
        } else {
            this.incentivizedTextSettings = map2;
        }
        if ((i & 8) == 0) {
            this.assetsFullyDownloaded = false;
        } else {
            this.assetsFullyDownloaded = z;
        }
        this.adConfig = null;
        this.adSize = null;
        this.assetDirectory = null;
    }

    public AdPayload(List<PlacementAdUnit> list) {
        this.ads = list;
        this.mraidFiles = new HashMap();
        this.incentivizedTextSettings = new HashMap();
    }

    public /* synthetic */ AdPayload(List list, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? null : list);
    }
}
