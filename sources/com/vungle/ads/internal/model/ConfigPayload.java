package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import defpackage.b23;
import defpackage.g40;
import defpackage.hx2;
import defpackage.ig;
import defpackage.m20;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.p71;
import defpackage.pd0;
import defpackage.rq;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import java.util.List;
import okhttp3.internal.http2.Http2;

@up2
/* loaded from: classes2.dex */
public final class ConfigPayload {
    public static final Companion Companion = new Companion(null);
    private final CleverCache cleverCache;
    private final ConfigSettings config;
    private final String configExtension;
    private final CrashReportSettings crashReport;
    private final Boolean disableAdId;
    private final Endpoints endpoints;
    private final GDPRSettings gdpr;
    private final LoadOptimizationSettings isAdDownloadOptEnabled;
    private final ReportIncentivizedSettings isReportIncentivizedEnabled;
    private final LogMetricsSettings logMetricsSettings;
    private final LoggingSettings loggingEnabled;
    private final List<Placement> placements;
    private final Session session;
    private final Template template;
    private final ViewabilitySettings viewability;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final uh1 serializer() {
            return ConfigPayload$$serializer.INSTANCE;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class CrashReportSettings {
        public static final Companion Companion = new Companion(null);
        private final String collectFilter;
        private final boolean enabled;
        private final int maxSendAmount;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$CrashReportSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CrashReportSettings(int i, boolean z, int i2, String str, vp2 vp2Var) {
            if (6 != (i & 6)) {
                pd0.R(i, 6, ConfigPayload$CrashReportSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
            this.maxSendAmount = i2;
            this.collectFilter = str;
        }

        public static /* synthetic */ CrashReportSettings copy$default(CrashReportSettings crashReportSettings, boolean z, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                z = crashReportSettings.enabled;
            }
            if ((i2 & 2) != 0) {
                i = crashReportSettings.maxSendAmount;
            }
            if ((i2 & 4) != 0) {
                str = crashReportSettings.collectFilter;
            }
            return crashReportSettings.copy(z, i, str);
        }

        public static /* synthetic */ void getCollectFilter$annotations() {
        }

        public static /* synthetic */ void getMaxSendAmount$annotations() {
        }

        public static final void write$Self(CrashReportSettings crashReportSettings, g40 g40Var, mp2 mp2Var) {
            boolean z;
            if (g40Var.D() || crashReportSettings.enabled) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.n(mp2Var, 0, crashReportSettings.enabled);
            }
            g40Var.x(1, crashReportSettings.maxSendAmount, mp2Var);
            g40Var.o(2, crashReportSettings.collectFilter, mp2Var);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final int component2() {
            return this.maxSendAmount;
        }

        public final String component3() {
            return this.collectFilter;
        }

        public final CrashReportSettings copy(boolean z, int i, String str) {
            return new CrashReportSettings(z, i, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CrashReportSettings)) {
                return false;
            }
            CrashReportSettings crashReportSettings = (CrashReportSettings) obj;
            return this.enabled == crashReportSettings.enabled && this.maxSendAmount == crashReportSettings.maxSendAmount && m20.L(this.collectFilter, crashReportSettings.collectFilter);
        }

        public final String getCollectFilter() {
            return this.collectFilter;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getMaxSendAmount() {
            return this.maxSendAmount;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.collectFilter.hashCode() + (((r0 * 31) + this.maxSendAmount) * 31);
        }

        public String toString() {
            boolean z = this.enabled;
            int i = this.maxSendAmount;
            String str = this.collectFilter;
            StringBuilder sb = new StringBuilder("CrashReportSettings(enabled=");
            sb.append(z);
            sb.append(", maxSendAmount=");
            sb.append(i);
            sb.append(", collectFilter=");
            return hx2.s(sb, str, ")");
        }

        public CrashReportSettings(boolean z, int i, String str) {
            this.enabled = z;
            this.maxSendAmount = i;
            this.collectFilter = str;
        }

        public /* synthetic */ CrashReportSettings(boolean z, int i, String str, int i2, ng0 ng0Var) {
            this((i2 & 1) != 0 ? false : z, i, str);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Endpoints {
        public static final Companion Companion = new Companion(null);
        private final String adsEndpoint;
        private final String biEndpoint;
        private final String errorLogsEndpoint;
        private final String metricsEndpoint;
        private final String mraidEndpoint;
        private final String newEndpoint;
        private final String riEndpoint;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$Endpoints$$serializer.INSTANCE;
            }
        }

        public Endpoints() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (ng0) null);
        }

        public static /* synthetic */ Endpoints copy$default(Endpoints endpoints, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
            if ((i & 1) != 0) {
                str = endpoints.newEndpoint;
            }
            if ((i & 2) != 0) {
                str2 = endpoints.adsEndpoint;
            }
            String str8 = str2;
            if ((i & 4) != 0) {
                str3 = endpoints.riEndpoint;
            }
            String str9 = str3;
            if ((i & 8) != 0) {
                str4 = endpoints.biEndpoint;
            }
            String str10 = str4;
            if ((i & 16) != 0) {
                str5 = endpoints.mraidEndpoint;
            }
            String str11 = str5;
            if ((i & 32) != 0) {
                str6 = endpoints.metricsEndpoint;
            }
            String str12 = str6;
            if ((i & 64) != 0) {
                str7 = endpoints.errorLogsEndpoint;
            }
            return endpoints.copy(str, str8, str9, str10, str11, str12, str7);
        }

        public static /* synthetic */ void getAdsEndpoint$annotations() {
        }

        public static /* synthetic */ void getBiEndpoint$annotations() {
        }

        public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMetricsEndpoint$annotations() {
        }

        public static /* synthetic */ void getMraidEndpoint$annotations() {
        }

        public static /* synthetic */ void getNewEndpoint$annotations() {
        }

        public static /* synthetic */ void getRiEndpoint$annotations() {
        }

        public static final void write$Self(Endpoints endpoints, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = false;
            if (g40Var.D() || endpoints.newEndpoint != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, endpoints.newEndpoint);
            }
            if (g40Var.D() || endpoints.adsEndpoint != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, b23.f390a, endpoints.adsEndpoint);
            }
            if (g40Var.D() || endpoints.riEndpoint != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                g40Var.A(mp2Var, 2, b23.f390a, endpoints.riEndpoint);
            }
            if (g40Var.D() || endpoints.biEndpoint != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                g40Var.A(mp2Var, 3, b23.f390a, endpoints.biEndpoint);
            }
            if (g40Var.D() || endpoints.mraidEndpoint != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                g40Var.A(mp2Var, 4, b23.f390a, endpoints.mraidEndpoint);
            }
            if (g40Var.D() || endpoints.metricsEndpoint != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                g40Var.A(mp2Var, 5, b23.f390a, endpoints.metricsEndpoint);
            }
            if (g40Var.D() || endpoints.errorLogsEndpoint != null) {
                z7 = true;
            }
            if (z7) {
                g40Var.A(mp2Var, 6, b23.f390a, endpoints.errorLogsEndpoint);
            }
        }

        public final String component1() {
            return this.newEndpoint;
        }

        public final String component2() {
            return this.adsEndpoint;
        }

        public final String component3() {
            return this.riEndpoint;
        }

        public final String component4() {
            return this.biEndpoint;
        }

        public final String component5() {
            return this.mraidEndpoint;
        }

        public final String component6() {
            return this.metricsEndpoint;
        }

        public final String component7() {
            return this.errorLogsEndpoint;
        }

        public final Endpoints copy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            return new Endpoints(str, str2, str3, str4, str5, str6, str7);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Endpoints)) {
                return false;
            }
            Endpoints endpoints = (Endpoints) obj;
            return m20.L(this.newEndpoint, endpoints.newEndpoint) && m20.L(this.adsEndpoint, endpoints.adsEndpoint) && m20.L(this.riEndpoint, endpoints.riEndpoint) && m20.L(this.biEndpoint, endpoints.biEndpoint) && m20.L(this.mraidEndpoint, endpoints.mraidEndpoint) && m20.L(this.metricsEndpoint, endpoints.metricsEndpoint) && m20.L(this.errorLogsEndpoint, endpoints.errorLogsEndpoint);
        }

        public final String getAdsEndpoint() {
            return this.adsEndpoint;
        }

        public final String getBiEndpoint() {
            return this.biEndpoint;
        }

        public final String getErrorLogsEndpoint() {
            return this.errorLogsEndpoint;
        }

        public final String getMetricsEndpoint() {
            return this.metricsEndpoint;
        }

        public final String getMraidEndpoint() {
            return this.mraidEndpoint;
        }

        public final String getNewEndpoint() {
            return this.newEndpoint;
        }

        public final String getRiEndpoint() {
            return this.riEndpoint;
        }

        public int hashCode() {
            String str = this.newEndpoint;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adsEndpoint;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.riEndpoint;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.biEndpoint;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.mraidEndpoint;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.metricsEndpoint;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.errorLogsEndpoint;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        public String toString() {
            String str = this.newEndpoint;
            String str2 = this.adsEndpoint;
            String str3 = this.riEndpoint;
            String str4 = this.biEndpoint;
            String str5 = this.mraidEndpoint;
            String str6 = this.metricsEndpoint;
            String str7 = this.errorLogsEndpoint;
            StringBuilder q = p71.q("Endpoints(newEndpoint=", str, ", adsEndpoint=", str2, ", riEndpoint=");
            p71.A(q, str3, ", biEndpoint=", str4, ", mraidEndpoint=");
            p71.A(q, str5, ", metricsEndpoint=", str6, ", errorLogsEndpoint=");
            return hx2.s(q, str7, ")");
        }

        public /* synthetic */ Endpoints(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, ConfigPayload$Endpoints$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.newEndpoint = null;
            } else {
                this.newEndpoint = str;
            }
            if ((i & 2) == 0) {
                this.adsEndpoint = null;
            } else {
                this.adsEndpoint = str2;
            }
            if ((i & 4) == 0) {
                this.riEndpoint = null;
            } else {
                this.riEndpoint = str3;
            }
            if ((i & 8) == 0) {
                this.biEndpoint = null;
            } else {
                this.biEndpoint = str4;
            }
            if ((i & 16) == 0) {
                this.mraidEndpoint = null;
            } else {
                this.mraidEndpoint = str5;
            }
            if ((i & 32) == 0) {
                this.metricsEndpoint = null;
            } else {
                this.metricsEndpoint = str6;
            }
            if ((i & 64) == 0) {
                this.errorLogsEndpoint = null;
            } else {
                this.errorLogsEndpoint = str7;
            }
        }

        public Endpoints(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.newEndpoint = str;
            this.adsEndpoint = str2;
            this.riEndpoint = str3;
            this.biEndpoint = str4;
            this.mraidEndpoint = str5;
            this.metricsEndpoint = str6;
            this.errorLogsEndpoint = str7;
        }

        public /* synthetic */ Endpoints(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class GDPRSettings {
        public static final Companion Companion = new Companion(null);
        private final String buttonAccept;
        private final String buttonDeny;
        private final String consentMessage;
        private final String consentMessageVersion;
        private final String consentTitle;
        private final boolean isCountryDataProtected;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$GDPRSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ GDPRSettings(int i, boolean z, String str, String str2, String str3, String str4, String str5, vp2 vp2Var) {
            if (63 != (i & 63)) {
                pd0.R(i, 63, ConfigPayload$GDPRSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.isCountryDataProtected = z;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }

        public static /* synthetic */ GDPRSettings copy$default(GDPRSettings gDPRSettings, boolean z, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                z = gDPRSettings.isCountryDataProtected;
            }
            if ((i & 2) != 0) {
                str = gDPRSettings.consentTitle;
            }
            String str6 = str;
            if ((i & 4) != 0) {
                str2 = gDPRSettings.consentMessage;
            }
            String str7 = str2;
            if ((i & 8) != 0) {
                str3 = gDPRSettings.consentMessageVersion;
            }
            String str8 = str3;
            if ((i & 16) != 0) {
                str4 = gDPRSettings.buttonAccept;
            }
            String str9 = str4;
            if ((i & 32) != 0) {
                str5 = gDPRSettings.buttonDeny;
            }
            return gDPRSettings.copy(z, str6, str7, str8, str9, str5);
        }

        public static /* synthetic */ void getButtonAccept$annotations() {
        }

        public static /* synthetic */ void getButtonDeny$annotations() {
        }

        public static /* synthetic */ void getConsentMessage$annotations() {
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentTitle$annotations() {
        }

        public static /* synthetic */ void isCountryDataProtected$annotations() {
        }

        public static final void write$Self(GDPRSettings gDPRSettings, g40 g40Var, mp2 mp2Var) {
            g40Var.n(mp2Var, 0, gDPRSettings.isCountryDataProtected);
            g40Var.o(1, gDPRSettings.consentTitle, mp2Var);
            g40Var.o(2, gDPRSettings.consentMessage, mp2Var);
            g40Var.o(3, gDPRSettings.consentMessageVersion, mp2Var);
            g40Var.o(4, gDPRSettings.buttonAccept, mp2Var);
            g40Var.o(5, gDPRSettings.buttonDeny, mp2Var);
        }

        public final boolean component1() {
            return this.isCountryDataProtected;
        }

        public final String component2() {
            return this.consentTitle;
        }

        public final String component3() {
            return this.consentMessage;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final String component5() {
            return this.buttonAccept;
        }

        public final String component6() {
            return this.buttonDeny;
        }

        public final GDPRSettings copy(boolean z, String str, String str2, String str3, String str4, String str5) {
            return new GDPRSettings(z, str, str2, str3, str4, str5);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPRSettings)) {
                return false;
            }
            GDPRSettings gDPRSettings = (GDPRSettings) obj;
            return this.isCountryDataProtected == gDPRSettings.isCountryDataProtected && m20.L(this.consentTitle, gDPRSettings.consentTitle) && m20.L(this.consentMessage, gDPRSettings.consentMessage) && m20.L(this.consentMessageVersion, gDPRSettings.consentMessageVersion) && m20.L(this.buttonAccept, gDPRSettings.buttonAccept) && m20.L(this.buttonDeny, gDPRSettings.buttonDeny);
        }

        public final String getButtonAccept() {
            return this.buttonAccept;
        }

        public final String getButtonDeny() {
            return this.buttonDeny;
        }

        public final String getConsentMessage() {
            return this.consentMessage;
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentTitle() {
            return this.consentTitle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r0v8 */
        public int hashCode() {
            boolean z = this.isCountryDataProtected;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return this.buttonDeny.hashCode() + p71.h(this.buttonAccept, p71.h(this.consentMessageVersion, p71.h(this.consentMessage, p71.h(this.consentTitle, r0 * 31, 31), 31), 31), 31);
        }

        public final boolean isCountryDataProtected() {
            return this.isCountryDataProtected;
        }

        public String toString() {
            boolean z = this.isCountryDataProtected;
            String str = this.consentTitle;
            String str2 = this.consentMessage;
            String str3 = this.consentMessageVersion;
            String str4 = this.buttonAccept;
            String str5 = this.buttonDeny;
            StringBuilder sb = new StringBuilder("GDPRSettings(isCountryDataProtected=");
            sb.append(z);
            sb.append(", consentTitle=");
            sb.append(str);
            sb.append(", consentMessage=");
            p71.A(sb, str2, ", consentMessageVersion=", str3, ", buttonAccept=");
            sb.append(str4);
            sb.append(", buttonDeny=");
            sb.append(str5);
            sb.append(")");
            return sb.toString();
        }

        public GDPRSettings(boolean z, String str, String str2, String str3, String str4, String str5) {
            this.isCountryDataProtected = z;
            this.consentTitle = str;
            this.consentMessage = str2;
            this.consentMessageVersion = str3;
            this.buttonAccept = str4;
            this.buttonDeny = str5;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class LoadOptimizationSettings {
        public static final Companion Companion = new Companion(null);
        private final boolean enabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LoadOptimizationSettings(int i, boolean z, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.enabled = z;
            } else {
                pd0.R(i, 1, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ LoadOptimizationSettings copy$default(LoadOptimizationSettings loadOptimizationSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadOptimizationSettings.enabled;
            }
            return loadOptimizationSettings.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final LoadOptimizationSettings copy(boolean z) {
            return new LoadOptimizationSettings(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoadOptimizationSettings) && this.enabled == ((LoadOptimizationSettings) obj).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "LoadOptimizationSettings(enabled=" + this.enabled + ")";
        }

        public LoadOptimizationSettings(boolean z) {
            this.enabled = z;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class LogMetricsSettings {
        public static final Companion Companion = new Companion(null);
        private final int errorLogLevel;
        private final boolean metricsEnabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$LogMetricsSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ LogMetricsSettings(int i, int i2, boolean z, vp2 vp2Var) {
            if (3 != (i & 3)) {
                pd0.R(i, 3, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.errorLogLevel = i2;
            this.metricsEnabled = z;
        }

        public static /* synthetic */ LogMetricsSettings copy$default(LogMetricsSettings logMetricsSettings, int i, boolean z, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = logMetricsSettings.errorLogLevel;
            }
            if ((i2 & 2) != 0) {
                z = logMetricsSettings.metricsEnabled;
            }
            return logMetricsSettings.copy(i, z);
        }

        public static /* synthetic */ void getErrorLogLevel$annotations() {
        }

        public static /* synthetic */ void getMetricsEnabled$annotations() {
        }

        public static final void write$Self(LogMetricsSettings logMetricsSettings, g40 g40Var, mp2 mp2Var) {
            g40Var.x(0, logMetricsSettings.errorLogLevel, mp2Var);
            g40Var.n(mp2Var, 1, logMetricsSettings.metricsEnabled);
        }

        public final int component1() {
            return this.errorLogLevel;
        }

        public final boolean component2() {
            return this.metricsEnabled;
        }

        public final LogMetricsSettings copy(int i, boolean z) {
            return new LogMetricsSettings(i, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogMetricsSettings)) {
                return false;
            }
            LogMetricsSettings logMetricsSettings = (LogMetricsSettings) obj;
            return this.errorLogLevel == logMetricsSettings.errorLogLevel && this.metricsEnabled == logMetricsSettings.metricsEnabled;
        }

        public final int getErrorLogLevel() {
            return this.errorLogLevel;
        }

        public final boolean getMetricsEnabled() {
            return this.metricsEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int i = this.errorLogLevel * 31;
            boolean z = this.metricsEnabled;
            int i2 = z;
            if (z != 0) {
                i2 = 1;
            }
            return i + i2;
        }

        public String toString() {
            return "LogMetricsSettings(errorLogLevel=" + this.errorLogLevel + ", metricsEnabled=" + this.metricsEnabled + ")";
        }

        public LogMetricsSettings(int i, boolean z) {
            this.errorLogLevel = i;
            this.metricsEnabled = z;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class LoggingSettings {
        public static final Companion Companion = new Companion(null);
        private final boolean enabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$LoggingSettings$$serializer.INSTANCE;
            }
        }

        public LoggingSettings() {
            this(false, 1, (ng0) null);
        }

        public static /* synthetic */ LoggingSettings copy$default(LoggingSettings loggingSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loggingSettings.enabled;
            }
            return loggingSettings.copy(z);
        }

        public static final void write$Self(LoggingSettings loggingSettings, g40 g40Var, mp2 mp2Var) {
            boolean z;
            if (g40Var.D() || loggingSettings.enabled) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.n(mp2Var, 0, loggingSettings.enabled);
            }
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final LoggingSettings copy(boolean z) {
            return new LoggingSettings(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof LoggingSettings) && this.enabled == ((LoggingSettings) obj).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "LoggingSettings(enabled=" + this.enabled + ")";
        }

        public /* synthetic */ LoggingSettings(int i, boolean z, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, ConfigPayload$LoggingSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.enabled = false;
            } else {
                this.enabled = z;
            }
        }

        public LoggingSettings(boolean z) {
            this.enabled = z;
        }

        public /* synthetic */ LoggingSettings(boolean z, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? false : z);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class ReportIncentivizedSettings {
        public static final Companion Companion = new Companion(null);
        private final boolean enabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ReportIncentivizedSettings(int i, boolean z, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.enabled = z;
            } else {
                pd0.R(i, 1, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ReportIncentivizedSettings copy$default(ReportIncentivizedSettings reportIncentivizedSettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = reportIncentivizedSettings.enabled;
            }
            return reportIncentivizedSettings.copy(z);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final ReportIncentivizedSettings copy(boolean z) {
            return new ReportIncentivizedSettings(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ReportIncentivizedSettings) && this.enabled == ((ReportIncentivizedSettings) obj).enabled;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public int hashCode() {
            boolean z = this.enabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ReportIncentivizedSettings(enabled=" + this.enabled + ")";
        }

        public ReportIncentivizedSettings(boolean z) {
            this.enabled = z;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Session {
        public static final Companion Companion = new Companion(null);
        private final boolean enabled;
        private final int limit;
        private final int timeout;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$Session$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Session(int i, boolean z, int i2, int i3, vp2 vp2Var) {
            if (7 != (i & 7)) {
                pd0.R(i, 7, ConfigPayload$Session$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.enabled = z;
            this.limit = i2;
            this.timeout = i3;
        }

        public static /* synthetic */ Session copy$default(Session session, boolean z, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                z = session.enabled;
            }
            if ((i3 & 2) != 0) {
                i = session.limit;
            }
            if ((i3 & 4) != 0) {
                i2 = session.timeout;
            }
            return session.copy(z, i, i2);
        }

        public static /* synthetic */ void getEnabled$annotations() {
        }

        public static /* synthetic */ void getLimit$annotations() {
        }

        public static /* synthetic */ void getTimeout$annotations() {
        }

        public static final void write$Self(Session session, g40 g40Var, mp2 mp2Var) {
            g40Var.n(mp2Var, 0, session.enabled);
            g40Var.x(1, session.limit, mp2Var);
            g40Var.x(2, session.timeout, mp2Var);
        }

        public final boolean component1() {
            return this.enabled;
        }

        public final int component2() {
            return this.limit;
        }

        public final int component3() {
            return this.timeout;
        }

        public final Session copy(boolean z, int i, int i2) {
            return new Session(z, i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return this.enabled == session.enabled && this.limit == session.limit && this.timeout == session.timeout;
        }

        public final boolean getEnabled() {
            return this.enabled;
        }

        public final int getLimit() {
            return this.limit;
        }

        public final int getTimeout() {
            return this.timeout;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        public int hashCode() {
            boolean z = this.enabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            return (((r0 * 31) + this.limit) * 31) + this.timeout;
        }

        public String toString() {
            boolean z = this.enabled;
            int i = this.limit;
            int i2 = this.timeout;
            StringBuilder sb = new StringBuilder("Session(enabled=");
            sb.append(z);
            sb.append(", limit=");
            sb.append(i);
            sb.append(", timeout=");
            return hx2.r(sb, i2, ")");
        }

        public Session(boolean z, int i, int i2) {
            this.enabled = z;
            this.limit = i;
            this.timeout = i2;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Template {
        public static final Companion Companion = new Companion(null);
        private final boolean heartbeatEnabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$Template$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Template(int i, boolean z, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.heartbeatEnabled = z;
            } else {
                pd0.R(i, 1, ConfigPayload$Template$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ Template copy$default(Template template, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = template.heartbeatEnabled;
            }
            return template.copy(z);
        }

        public static /* synthetic */ void getHeartbeatEnabled$annotations() {
        }

        public final boolean component1() {
            return this.heartbeatEnabled;
        }

        public final Template copy(boolean z) {
            return new Template(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Template) && this.heartbeatEnabled == ((Template) obj).heartbeatEnabled;
        }

        public final boolean getHeartbeatEnabled() {
            return this.heartbeatEnabled;
        }

        public int hashCode() {
            boolean z = this.heartbeatEnabled;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "Template(heartbeatEnabled=" + this.heartbeatEnabled + ")";
        }

        public Template(boolean z) {
            this.heartbeatEnabled = z;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class ViewabilitySettings {
        public static final Companion Companion = new Companion(null);
        private final boolean om;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$ViewabilitySettings$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ ViewabilitySettings(int i, boolean z, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.om = z;
            } else {
                pd0.R(i, 1, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ ViewabilitySettings copy$default(ViewabilitySettings viewabilitySettings, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = viewabilitySettings.om;
            }
            return viewabilitySettings.copy(z);
        }

        public final boolean component1() {
            return this.om;
        }

        public final ViewabilitySettings copy(boolean z) {
            return new ViewabilitySettings(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ViewabilitySettings) && this.om == ((ViewabilitySettings) obj).om;
        }

        public final boolean getOm() {
            return this.om;
        }

        public int hashCode() {
            boolean z = this.om;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return "ViewabilitySettings(om=" + this.om + ")";
        }

        public ViewabilitySettings(boolean z) {
            this.om = z;
        }
    }

    public ConfigPayload() {
        this((Endpoints) null, (List) null, (ConfigSettings) null, (GDPRSettings) null, (LoggingSettings) null, (CrashReportSettings) null, (ViewabilitySettings) null, (LoadOptimizationSettings) null, (ReportIncentivizedSettings) null, (Boolean) null, (String) null, (Template) null, (LogMetricsSettings) null, (Session) null, (CleverCache) null, 32767, (ng0) null);
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getCrashReport$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getLoggingEnabled$annotations() {
    }

    public static /* synthetic */ void getSession$annotations() {
    }

    public static /* synthetic */ void getTemplate$annotations() {
    }

    public static /* synthetic */ void getViewability$annotations() {
    }

    public static /* synthetic */ void isAdDownloadOptEnabled$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }

    public static final void write$Self(ConfigPayload configPayload, g40 g40Var, mp2 mp2Var) {
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
        boolean z15 = false;
        if (g40Var.D() || configPayload.endpoints != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g40Var.A(mp2Var, 0, ConfigPayload$Endpoints$$serializer.INSTANCE, configPayload.endpoints);
        }
        if (g40Var.D() || configPayload.placements != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            g40Var.A(mp2Var, 1, new ig(Placement$$serializer.INSTANCE, 0), configPayload.placements);
        }
        if (g40Var.D() || configPayload.config != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            g40Var.A(mp2Var, 2, ConfigPayload$ConfigSettings$$serializer.INSTANCE, configPayload.config);
        }
        if (g40Var.D() || configPayload.gdpr != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            g40Var.A(mp2Var, 3, ConfigPayload$GDPRSettings$$serializer.INSTANCE, configPayload.gdpr);
        }
        if (g40Var.D() || configPayload.loggingEnabled != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            g40Var.A(mp2Var, 4, ConfigPayload$LoggingSettings$$serializer.INSTANCE, configPayload.loggingEnabled);
        }
        if (g40Var.D() || configPayload.crashReport != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z6) {
            g40Var.A(mp2Var, 5, ConfigPayload$CrashReportSettings$$serializer.INSTANCE, configPayload.crashReport);
        }
        if (g40Var.D() || configPayload.viewability != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (z7) {
            g40Var.A(mp2Var, 6, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE, configPayload.viewability);
        }
        if (g40Var.D() || configPayload.isAdDownloadOptEnabled != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8) {
            g40Var.A(mp2Var, 7, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE, configPayload.isAdDownloadOptEnabled);
        }
        if (g40Var.D() || configPayload.isReportIncentivizedEnabled != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            g40Var.A(mp2Var, 8, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE, configPayload.isReportIncentivizedEnabled);
        }
        if (g40Var.D() || !m20.L(configPayload.disableAdId, Boolean.TRUE)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            g40Var.A(mp2Var, 9, rq.f4201a, configPayload.disableAdId);
        }
        if (g40Var.D() || configPayload.configExtension != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            g40Var.A(mp2Var, 10, b23.f390a, configPayload.configExtension);
        }
        if (g40Var.D() || configPayload.template != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            g40Var.A(mp2Var, 11, ConfigPayload$Template$$serializer.INSTANCE, configPayload.template);
        }
        if (g40Var.D() || configPayload.logMetricsSettings != null) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            g40Var.A(mp2Var, 12, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, configPayload.logMetricsSettings);
        }
        if (g40Var.D() || configPayload.session != null) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            g40Var.A(mp2Var, 13, ConfigPayload$Session$$serializer.INSTANCE, configPayload.session);
        }
        if (g40Var.D() || configPayload.cleverCache != null) {
            z15 = true;
        }
        if (z15) {
            g40Var.A(mp2Var, 14, CleverCache$$serializer.INSTANCE, configPayload.cleverCache);
        }
    }

    public final Endpoints component1() {
        return this.endpoints;
    }

    public final Boolean component10() {
        return this.disableAdId;
    }

    public final String component11() {
        return this.configExtension;
    }

    public final Template component12() {
        return this.template;
    }

    public final LogMetricsSettings component13() {
        return this.logMetricsSettings;
    }

    public final Session component14() {
        return this.session;
    }

    public final CleverCache component15() {
        return this.cleverCache;
    }

    public final List<Placement> component2() {
        return this.placements;
    }

    public final ConfigSettings component3() {
        return this.config;
    }

    public final GDPRSettings component4() {
        return this.gdpr;
    }

    public final LoggingSettings component5() {
        return this.loggingEnabled;
    }

    public final CrashReportSettings component6() {
        return this.crashReport;
    }

    public final ViewabilitySettings component7() {
        return this.viewability;
    }

    public final LoadOptimizationSettings component8() {
        return this.isAdDownloadOptEnabled;
    }

    public final ReportIncentivizedSettings component9() {
        return this.isReportIncentivizedEnabled;
    }

    public final ConfigPayload copy(Endpoints endpoints, List<Placement> list, ConfigSettings configSettings, GDPRSettings gDPRSettings, LoggingSettings loggingSettings, CrashReportSettings crashReportSettings, ViewabilitySettings viewabilitySettings, LoadOptimizationSettings loadOptimizationSettings, ReportIncentivizedSettings reportIncentivizedSettings, Boolean bool, String str, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache) {
        return new ConfigPayload(endpoints, list, configSettings, gDPRSettings, loggingSettings, crashReportSettings, viewabilitySettings, loadOptimizationSettings, reportIncentivizedSettings, bool, str, template, logMetricsSettings, session, cleverCache);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfigPayload)) {
            return false;
        }
        ConfigPayload configPayload = (ConfigPayload) obj;
        return m20.L(this.endpoints, configPayload.endpoints) && m20.L(this.placements, configPayload.placements) && m20.L(this.config, configPayload.config) && m20.L(this.gdpr, configPayload.gdpr) && m20.L(this.loggingEnabled, configPayload.loggingEnabled) && m20.L(this.crashReport, configPayload.crashReport) && m20.L(this.viewability, configPayload.viewability) && m20.L(this.isAdDownloadOptEnabled, configPayload.isAdDownloadOptEnabled) && m20.L(this.isReportIncentivizedEnabled, configPayload.isReportIncentivizedEnabled) && m20.L(this.disableAdId, configPayload.disableAdId) && m20.L(this.configExtension, configPayload.configExtension) && m20.L(this.template, configPayload.template) && m20.L(this.logMetricsSettings, configPayload.logMetricsSettings) && m20.L(this.session, configPayload.session) && m20.L(this.cleverCache, configPayload.cleverCache);
    }

    public final CleverCache getCleverCache() {
        return this.cleverCache;
    }

    public final ConfigSettings getConfig() {
        return this.config;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final CrashReportSettings getCrashReport() {
        return this.crashReport;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final Endpoints getEndpoints() {
        return this.endpoints;
    }

    public final GDPRSettings getGdpr() {
        return this.gdpr;
    }

    public final LogMetricsSettings getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final LoggingSettings getLoggingEnabled() {
        return this.loggingEnabled;
    }

    public final List<Placement> getPlacements() {
        return this.placements;
    }

    public final Session getSession() {
        return this.session;
    }

    public final Template getTemplate() {
        return this.template;
    }

    public final ViewabilitySettings getViewability() {
        return this.viewability;
    }

    public int hashCode() {
        Endpoints endpoints = this.endpoints;
        int hashCode = (endpoints == null ? 0 : endpoints.hashCode()) * 31;
        List<Placement> list = this.placements;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        ConfigSettings configSettings = this.config;
        int hashCode3 = (hashCode2 + (configSettings == null ? 0 : configSettings.hashCode())) * 31;
        GDPRSettings gDPRSettings = this.gdpr;
        int hashCode4 = (hashCode3 + (gDPRSettings == null ? 0 : gDPRSettings.hashCode())) * 31;
        LoggingSettings loggingSettings = this.loggingEnabled;
        int hashCode5 = (hashCode4 + (loggingSettings == null ? 0 : loggingSettings.hashCode())) * 31;
        CrashReportSettings crashReportSettings = this.crashReport;
        int hashCode6 = (hashCode5 + (crashReportSettings == null ? 0 : crashReportSettings.hashCode())) * 31;
        ViewabilitySettings viewabilitySettings = this.viewability;
        int hashCode7 = (hashCode6 + (viewabilitySettings == null ? 0 : viewabilitySettings.hashCode())) * 31;
        LoadOptimizationSettings loadOptimizationSettings = this.isAdDownloadOptEnabled;
        int hashCode8 = (hashCode7 + (loadOptimizationSettings == null ? 0 : loadOptimizationSettings.hashCode())) * 31;
        ReportIncentivizedSettings reportIncentivizedSettings = this.isReportIncentivizedEnabled;
        int hashCode9 = (hashCode8 + (reportIncentivizedSettings == null ? 0 : reportIncentivizedSettings.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int hashCode10 = (hashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.configExtension;
        int hashCode11 = (hashCode10 + (str == null ? 0 : str.hashCode())) * 31;
        Template template = this.template;
        int hashCode12 = (hashCode11 + (template == null ? 0 : template.hashCode())) * 31;
        LogMetricsSettings logMetricsSettings = this.logMetricsSettings;
        int hashCode13 = (hashCode12 + (logMetricsSettings == null ? 0 : logMetricsSettings.hashCode())) * 31;
        Session session = this.session;
        int hashCode14 = (hashCode13 + (session == null ? 0 : session.hashCode())) * 31;
        CleverCache cleverCache = this.cleverCache;
        return hashCode14 + (cleverCache != null ? cleverCache.hashCode() : 0);
    }

    public final LoadOptimizationSettings isAdDownloadOptEnabled() {
        return this.isAdDownloadOptEnabled;
    }

    public final ReportIncentivizedSettings isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public String toString() {
        return "ConfigPayload(endpoints=" + this.endpoints + ", placements=" + this.placements + ", config=" + this.config + ", gdpr=" + this.gdpr + ", loggingEnabled=" + this.loggingEnabled + ", crashReport=" + this.crashReport + ", viewability=" + this.viewability + ", isAdDownloadOptEnabled=" + this.isAdDownloadOptEnabled + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", disableAdId=" + this.disableAdId + ", configExtension=" + this.configExtension + ", template=" + this.template + ", logMetricsSettings=" + this.logMetricsSettings + ", session=" + this.session + ", cleverCache=" + this.cleverCache + ")";
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class ConfigSettings {
        public static final Companion Companion = new Companion(null);
        private final int refreshTime;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return ConfigPayload$ConfigSettings$$serializer.INSTANCE;
            }
        }

        public ConfigSettings(int i) {
            this.refreshTime = i;
        }

        public static /* synthetic */ ConfigSettings copy$default(ConfigSettings configSettings, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = configSettings.refreshTime;
            }
            return configSettings.copy(i);
        }

        public static /* synthetic */ void getRefreshTime$annotations() {
        }

        public final int component1() {
            return this.refreshTime;
        }

        public final ConfigSettings copy(int i) {
            return new ConfigSettings(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigSettings) && this.refreshTime == ((ConfigSettings) obj).refreshTime;
        }

        public final int getRefreshTime() {
            return this.refreshTime;
        }

        public int hashCode() {
            return this.refreshTime;
        }

        public String toString() {
            return p71.k("ConfigSettings(refreshTime=", this.refreshTime, ")");
        }

        public /* synthetic */ ConfigSettings(int i, int i2, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.refreshTime = i2;
            } else {
                pd0.R(i, 1, ConfigPayload$ConfigSettings$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }
    }

    public /* synthetic */ ConfigPayload(int i, Endpoints endpoints, List list, ConfigSettings configSettings, GDPRSettings gDPRSettings, LoggingSettings loggingSettings, CrashReportSettings crashReportSettings, ViewabilitySettings viewabilitySettings, LoadOptimizationSettings loadOptimizationSettings, ReportIncentivizedSettings reportIncentivizedSettings, Boolean bool, String str, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache, vp2 vp2Var) {
        if ((i & 0) != 0) {
            pd0.R(i, 0, ConfigPayload$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = endpoints;
        }
        if ((i & 2) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i & 4) == 0) {
            this.config = null;
        } else {
            this.config = configSettings;
        }
        if ((i & 8) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = gDPRSettings;
        }
        if ((i & 16) == 0) {
            this.loggingEnabled = null;
        } else {
            this.loggingEnabled = loggingSettings;
        }
        if ((i & 32) == 0) {
            this.crashReport = null;
        } else {
            this.crashReport = crashReportSettings;
        }
        if ((i & 64) == 0) {
            this.viewability = null;
        } else {
            this.viewability = viewabilitySettings;
        }
        if ((i & 128) == 0) {
            this.isAdDownloadOptEnabled = null;
        } else {
            this.isAdDownloadOptEnabled = loadOptimizationSettings;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = reportIncentivizedSettings;
        }
        this.disableAdId = (i & 512) == 0 ? Boolean.TRUE : bool;
        if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i & 2048) == 0) {
            this.template = null;
        } else {
            this.template = template;
        }
        if ((i & v.DEFAULT_BUFFER_SIZE) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = logMetricsSettings;
        }
        if ((i & 8192) == 0) {
            this.session = null;
        } else {
            this.session = session;
        }
        if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = cleverCache;
        }
    }

    public ConfigPayload(Endpoints endpoints, List<Placement> list, ConfigSettings configSettings, GDPRSettings gDPRSettings, LoggingSettings loggingSettings, CrashReportSettings crashReportSettings, ViewabilitySettings viewabilitySettings, LoadOptimizationSettings loadOptimizationSettings, ReportIncentivizedSettings reportIncentivizedSettings, Boolean bool, String str, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache) {
        this.endpoints = endpoints;
        this.placements = list;
        this.config = configSettings;
        this.gdpr = gDPRSettings;
        this.loggingEnabled = loggingSettings;
        this.crashReport = crashReportSettings;
        this.viewability = viewabilitySettings;
        this.isAdDownloadOptEnabled = loadOptimizationSettings;
        this.isReportIncentivizedEnabled = reportIncentivizedSettings;
        this.disableAdId = bool;
        this.configExtension = str;
        this.template = template;
        this.logMetricsSettings = logMetricsSettings;
        this.session = session;
        this.cleverCache = cleverCache;
    }

    public /* synthetic */ ConfigPayload(Endpoints endpoints, List list, ConfigSettings configSettings, GDPRSettings gDPRSettings, LoggingSettings loggingSettings, CrashReportSettings crashReportSettings, ViewabilitySettings viewabilitySettings, LoadOptimizationSettings loadOptimizationSettings, ReportIncentivizedSettings reportIncentivizedSettings, Boolean bool, String str, Template template, LogMetricsSettings logMetricsSettings, Session session, CleverCache cleverCache, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? null : endpoints, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : configSettings, (i & 8) != 0 ? null : gDPRSettings, (i & 16) != 0 ? null : loggingSettings, (i & 32) != 0 ? null : crashReportSettings, (i & 64) != 0 ? null : viewabilitySettings, (i & 128) != 0 ? null : loadOptimizationSettings, (i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : reportIncentivizedSettings, (i & 512) != 0 ? Boolean.TRUE : bool, (i & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : str, (i & 2048) != 0 ? null : template, (i & v.DEFAULT_BUFFER_SIZE) != 0 ? null : logMetricsSettings, (i & 8192) != 0 ? null : session, (i & Http2.INITIAL_MAX_FRAME_SIZE) == 0 ? cleverCache : null);
    }
}
