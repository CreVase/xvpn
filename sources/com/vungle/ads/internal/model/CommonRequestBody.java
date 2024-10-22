package com.vungle.ads.internal.model;

import defpackage.b23;
import defpackage.g40;
import defpackage.hx2;
import defpackage.ig;
import defpackage.jo1;
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

@up2
/* loaded from: classes2.dex */
public final class CommonRequestBody {
    public static final Companion Companion = new Companion(null);
    private final AppNode app;
    private final DeviceNode device;
    private RequestExt ext;
    private RequestParam request;
    private final User user;

    @up2
    /* loaded from: classes2.dex */
    public static final class CCPA {
        public static final Companion Companion = new Companion(null);
        private final String status;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return CommonRequestBody$CCPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CCPA(int i, String str, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.status = str;
            } else {
                pd0.R(i, 1, CommonRequestBody$CCPA$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ CCPA copy$default(CCPA ccpa, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ccpa.status;
            }
            return ccpa.copy(str);
        }

        public final String component1() {
            return this.status;
        }

        public final CCPA copy(String str) {
            return new CCPA(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CCPA) && m20.L(this.status, ((CCPA) obj).status);
        }

        public final String getStatus() {
            return this.status;
        }

        public int hashCode() {
            return this.status.hashCode();
        }

        public String toString() {
            return hx2.q("CCPA(status=", this.status, ")");
        }

        public CCPA(String str) {
            this.status = str;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class COPPA {
        public static final Companion Companion = new Companion(null);
        private final Boolean isCoppa;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return CommonRequestBody$COPPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ COPPA(int i, Boolean bool, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.isCoppa = bool;
            } else {
                pd0.R(i, 1, CommonRequestBody$COPPA$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ COPPA copy$default(COPPA coppa, Boolean bool, int i, Object obj) {
            if ((i & 1) != 0) {
                bool = coppa.isCoppa;
            }
            return coppa.copy(bool);
        }

        public static /* synthetic */ void isCoppa$annotations() {
        }

        public final Boolean component1() {
            return this.isCoppa;
        }

        public final COPPA copy(Boolean bool) {
            return new COPPA(bool);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof COPPA) && m20.L(this.isCoppa, ((COPPA) obj).isCoppa);
        }

        public int hashCode() {
            Boolean bool = this.isCoppa;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final Boolean isCoppa() {
            return this.isCoppa;
        }

        public String toString() {
            return "COPPA(isCoppa=" + this.isCoppa + ")";
        }

        public COPPA(Boolean bool) {
            this.isCoppa = bool;
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
            return CommonRequestBody$$serializer.INSTANCE;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class GDPR {
        public static final Companion Companion = new Companion(null);
        private final String consentMessageVersion;
        private final String consentSource;
        private final String consentStatus;
        private final long consentTimestamp;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return CommonRequestBody$GDPR$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ GDPR(int i, String str, String str2, long j, String str3, vp2 vp2Var) {
            if (15 != (i & 15)) {
                pd0.R(i, 15, CommonRequestBody$GDPR$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j;
            this.consentMessageVersion = str3;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, long j, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gdpr.consentStatus;
            }
            if ((i & 2) != 0) {
                str2 = gdpr.consentSource;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                j = gdpr.consentTimestamp;
            }
            long j2 = j;
            if ((i & 8) != 0) {
                str3 = gdpr.consentMessageVersion;
            }
            return gdpr.copy(str, str4, j2, str3);
        }

        public static /* synthetic */ void getConsentMessageVersion$annotations() {
        }

        public static /* synthetic */ void getConsentSource$annotations() {
        }

        public static /* synthetic */ void getConsentStatus$annotations() {
        }

        public static /* synthetic */ void getConsentTimestamp$annotations() {
        }

        public static final void write$Self(GDPR gdpr, g40 g40Var, mp2 mp2Var) {
            g40Var.o(0, gdpr.consentStatus, mp2Var);
            g40Var.o(1, gdpr.consentSource, mp2Var);
            g40Var.j(mp2Var, 2, gdpr.consentTimestamp);
            g40Var.o(3, gdpr.consentMessageVersion, mp2Var);
        }

        public final String component1() {
            return this.consentStatus;
        }

        public final String component2() {
            return this.consentSource;
        }

        public final long component3() {
            return this.consentTimestamp;
        }

        public final String component4() {
            return this.consentMessageVersion;
        }

        public final GDPR copy(String str, String str2, long j, String str3) {
            return new GDPR(str, str2, j, str3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) obj;
            return m20.L(this.consentStatus, gdpr.consentStatus) && m20.L(this.consentSource, gdpr.consentSource) && this.consentTimestamp == gdpr.consentTimestamp && m20.L(this.consentMessageVersion, gdpr.consentMessageVersion);
        }

        public final String getConsentMessageVersion() {
            return this.consentMessageVersion;
        }

        public final String getConsentSource() {
            return this.consentSource;
        }

        public final String getConsentStatus() {
            return this.consentStatus;
        }

        public final long getConsentTimestamp() {
            return this.consentTimestamp;
        }

        public int hashCode() {
            int h = p71.h(this.consentSource, this.consentStatus.hashCode() * 31, 31);
            long j = this.consentTimestamp;
            return this.consentMessageVersion.hashCode() + ((h + ((int) (j ^ (j >>> 32)))) * 31);
        }

        public String toString() {
            String str = this.consentStatus;
            String str2 = this.consentSource;
            long j = this.consentTimestamp;
            String str3 = this.consentMessageVersion;
            StringBuilder q = p71.q("GDPR(consentStatus=", str, ", consentSource=", str2, ", consentTimestamp=");
            q.append(j);
            q.append(", consentMessageVersion=");
            q.append(str3);
            q.append(")");
            return q.toString();
        }

        public GDPR(String str, String str2, long j, String str3) {
            this.consentStatus = str;
            this.consentSource = str2;
            this.consentTimestamp = j;
            this.consentMessageVersion = str3;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class RequestExt {
        public static final Companion Companion = new Companion(null);
        private final String adExt;
        private final String configExtension;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return CommonRequestBody$RequestExt$$serializer.INSTANCE;
            }
        }

        public RequestExt() {
            this((String) null, (String) (0 == true ? 1 : 0), 3, (ng0) (0 == true ? 1 : 0));
        }

        public static /* synthetic */ RequestExt copy$default(RequestExt requestExt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = requestExt.configExtension;
            }
            if ((i & 2) != 0) {
                str2 = requestExt.adExt;
            }
            return requestExt.copy(str, str2);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static final void write$Self(RequestExt requestExt, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || requestExt.configExtension != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, requestExt.configExtension);
            }
            if (g40Var.D() || requestExt.adExt != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, b23.f390a, requestExt.adExt);
            }
        }

        public final String component1() {
            return this.configExtension;
        }

        public final String component2() {
            return this.adExt;
        }

        public final RequestExt copy(String str, String str2) {
            return new RequestExt(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestExt)) {
                return false;
            }
            RequestExt requestExt = (RequestExt) obj;
            return m20.L(this.configExtension, requestExt.configExtension) && m20.L(this.adExt, requestExt.adExt);
        }

        public final String getAdExt() {
            return this.adExt;
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public int hashCode() {
            String str = this.configExtension;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.adExt;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "RequestExt(configExtension=" + this.configExtension + ", adExt=" + this.adExt + ")";
        }

        public /* synthetic */ RequestExt(int i, String str, String str2, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, CommonRequestBody$RequestExt$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.configExtension = null;
            } else {
                this.configExtension = str;
            }
            if ((i & 2) == 0) {
                this.adExt = null;
            } else {
                this.adExt = str2;
            }
        }

        public RequestExt(String str, String str2) {
            this.configExtension = str;
            this.adExt = str2;
        }

        public /* synthetic */ RequestExt(String str, String str2, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class RequestParam {
        public static final Companion Companion = new Companion(null);
        private String adSize;
        private final Long adStartTime;
        private final String appId;
        private final Boolean isHeaderBidding;
        private final String placementReferenceId;
        private final List<String> placements;
        private final String user;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return CommonRequestBody$RequestParam$$serializer.INSTANCE;
            }
        }

        public RequestParam() {
            this((List) null, (Boolean) null, (String) null, (Long) null, (String) null, (String) null, (String) null, 127, (ng0) null);
        }

        public static /* synthetic */ RequestParam copy$default(RequestParam requestParam, List list, Boolean bool, String str, Long l, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = requestParam.placements;
            }
            if ((i & 2) != 0) {
                bool = requestParam.isHeaderBidding;
            }
            Boolean bool2 = bool;
            if ((i & 4) != 0) {
                str = requestParam.adSize;
            }
            String str5 = str;
            if ((i & 8) != 0) {
                l = requestParam.adStartTime;
            }
            Long l2 = l;
            if ((i & 16) != 0) {
                str2 = requestParam.appId;
            }
            String str6 = str2;
            if ((i & 32) != 0) {
                str3 = requestParam.placementReferenceId;
            }
            String str7 = str3;
            if ((i & 64) != 0) {
                str4 = requestParam.user;
            }
            return requestParam.copy(list, bool2, str5, l2, str6, str7, str4);
        }

        public static /* synthetic */ void getAdSize$annotations() {
        }

        public static /* synthetic */ void getAppId$annotations() {
        }

        public static /* synthetic */ void getPlacementReferenceId$annotations() {
        }

        public static /* synthetic */ void isHeaderBidding$annotations() {
        }

        public static final void write$Self(RequestParam requestParam, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7 = false;
            if (g40Var.D() || requestParam.placements != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, new ig(b23.f390a, 0), requestParam.placements);
            }
            if (g40Var.D() || requestParam.isHeaderBidding != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, rq.f4201a, requestParam.isHeaderBidding);
            }
            if (g40Var.D() || requestParam.adSize != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                g40Var.A(mp2Var, 2, b23.f390a, requestParam.adSize);
            }
            if (g40Var.D() || requestParam.adStartTime != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                g40Var.A(mp2Var, 3, jo1.f2800a, requestParam.adStartTime);
            }
            if (g40Var.D() || requestParam.appId != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                g40Var.A(mp2Var, 4, b23.f390a, requestParam.appId);
            }
            if (g40Var.D() || requestParam.placementReferenceId != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                g40Var.A(mp2Var, 5, b23.f390a, requestParam.placementReferenceId);
            }
            if (g40Var.D() || requestParam.user != null) {
                z7 = true;
            }
            if (z7) {
                g40Var.A(mp2Var, 6, b23.f390a, requestParam.user);
            }
        }

        public final List<String> component1() {
            return this.placements;
        }

        public final Boolean component2() {
            return this.isHeaderBidding;
        }

        public final String component3() {
            return this.adSize;
        }

        public final Long component4() {
            return this.adStartTime;
        }

        public final String component5() {
            return this.appId;
        }

        public final String component6() {
            return this.placementReferenceId;
        }

        public final String component7() {
            return this.user;
        }

        public final RequestParam copy(List<String> list, Boolean bool, String str, Long l, String str2, String str3, String str4) {
            return new RequestParam(list, bool, str, l, str2, str3, str4);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestParam)) {
                return false;
            }
            RequestParam requestParam = (RequestParam) obj;
            return m20.L(this.placements, requestParam.placements) && m20.L(this.isHeaderBidding, requestParam.isHeaderBidding) && m20.L(this.adSize, requestParam.adSize) && m20.L(this.adStartTime, requestParam.adStartTime) && m20.L(this.appId, requestParam.appId) && m20.L(this.placementReferenceId, requestParam.placementReferenceId) && m20.L(this.user, requestParam.user);
        }

        public final String getAdSize() {
            return this.adSize;
        }

        public final Long getAdStartTime() {
            return this.adStartTime;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getPlacementReferenceId() {
            return this.placementReferenceId;
        }

        public final List<String> getPlacements() {
            return this.placements;
        }

        public final String getUser() {
            return this.user;
        }

        public int hashCode() {
            List<String> list = this.placements;
            int hashCode = (list == null ? 0 : list.hashCode()) * 31;
            Boolean bool = this.isHeaderBidding;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.adSize;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.adStartTime;
            int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
            String str2 = this.appId;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.placementReferenceId;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.user;
            return hashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        public final Boolean isHeaderBidding() {
            return this.isHeaderBidding;
        }

        public final void setAdSize(String str) {
            this.adSize = str;
        }

        public String toString() {
            List<String> list = this.placements;
            Boolean bool = this.isHeaderBidding;
            String str = this.adSize;
            Long l = this.adStartTime;
            String str2 = this.appId;
            String str3 = this.placementReferenceId;
            String str4 = this.user;
            StringBuilder sb = new StringBuilder("RequestParam(placements=");
            sb.append(list);
            sb.append(", isHeaderBidding=");
            sb.append(bool);
            sb.append(", adSize=");
            sb.append(str);
            sb.append(", adStartTime=");
            sb.append(l);
            sb.append(", appId=");
            p71.A(sb, str2, ", placementReferenceId=", str3, ", user=");
            return hx2.s(sb, str4, ")");
        }

        public /* synthetic */ RequestParam(int i, List list, Boolean bool, String str, Long l, String str2, String str3, String str4, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, CommonRequestBody$RequestParam$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.placements = null;
            } else {
                this.placements = list;
            }
            if ((i & 2) == 0) {
                this.isHeaderBidding = null;
            } else {
                this.isHeaderBidding = bool;
            }
            if ((i & 4) == 0) {
                this.adSize = null;
            } else {
                this.adSize = str;
            }
            if ((i & 8) == 0) {
                this.adStartTime = null;
            } else {
                this.adStartTime = l;
            }
            if ((i & 16) == 0) {
                this.appId = null;
            } else {
                this.appId = str2;
            }
            if ((i & 32) == 0) {
                this.placementReferenceId = null;
            } else {
                this.placementReferenceId = str3;
            }
            if ((i & 64) == 0) {
                this.user = null;
            } else {
                this.user = str4;
            }
        }

        public RequestParam(List<String> list, Boolean bool, String str, Long l, String str2, String str3, String str4) {
            this.placements = list;
            this.isHeaderBidding = bool;
            this.adSize = str;
            this.adStartTime = l;
            this.appId = str2;
            this.placementReferenceId = str3;
            this.user = str4;
        }

        public /* synthetic */ RequestParam(List list, Boolean bool, String str, Long l, String str2, String str3, String str4, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4);
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class User {
        public static final Companion Companion = new Companion(null);
        private CCPA ccpa;
        private COPPA coppa;
        private GDPR gdpr;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return CommonRequestBody$User$$serializer.INSTANCE;
            }
        }

        public User() {
            this((GDPR) null, (CCPA) null, (COPPA) null, 7, (ng0) null);
        }

        public static /* synthetic */ User copy$default(User user, GDPR gdpr, CCPA ccpa, COPPA coppa, int i, Object obj) {
            if ((i & 1) != 0) {
                gdpr = user.gdpr;
            }
            if ((i & 2) != 0) {
                ccpa = user.ccpa;
            }
            if ((i & 4) != 0) {
                coppa = user.coppa;
            }
            return user.copy(gdpr, ccpa, coppa);
        }

        public static final void write$Self(User user, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (g40Var.D() || user.gdpr != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, user.gdpr);
            }
            if (g40Var.D() || user.ccpa != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, user.ccpa);
            }
            if (g40Var.D() || user.coppa != null) {
                z3 = true;
            }
            if (z3) {
                g40Var.A(mp2Var, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, user.coppa);
            }
        }

        public final GDPR component1() {
            return this.gdpr;
        }

        public final CCPA component2() {
            return this.ccpa;
        }

        public final COPPA component3() {
            return this.coppa;
        }

        public final User copy(GDPR gdpr, CCPA ccpa, COPPA coppa) {
            return new User(gdpr, ccpa, coppa);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof User)) {
                return false;
            }
            User user = (User) obj;
            return m20.L(this.gdpr, user.gdpr) && m20.L(this.ccpa, user.ccpa) && m20.L(this.coppa, user.coppa);
        }

        public final CCPA getCcpa() {
            return this.ccpa;
        }

        public final COPPA getCoppa() {
            return this.coppa;
        }

        public final GDPR getGdpr() {
            return this.gdpr;
        }

        public int hashCode() {
            GDPR gdpr = this.gdpr;
            int hashCode = (gdpr == null ? 0 : gdpr.hashCode()) * 31;
            CCPA ccpa = this.ccpa;
            int hashCode2 = (hashCode + (ccpa == null ? 0 : ccpa.hashCode())) * 31;
            COPPA coppa = this.coppa;
            return hashCode2 + (coppa != null ? coppa.hashCode() : 0);
        }

        public final void setCcpa(CCPA ccpa) {
            this.ccpa = ccpa;
        }

        public final void setCoppa(COPPA coppa) {
            this.coppa = coppa;
        }

        public final void setGdpr(GDPR gdpr) {
            this.gdpr = gdpr;
        }

        public String toString() {
            return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ")";
        }

        public /* synthetic */ User(int i, GDPR gdpr, CCPA ccpa, COPPA coppa, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, CommonRequestBody$User$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.gdpr = null;
            } else {
                this.gdpr = gdpr;
            }
            if ((i & 2) == 0) {
                this.ccpa = null;
            } else {
                this.ccpa = ccpa;
            }
            if ((i & 4) == 0) {
                this.coppa = null;
            } else {
                this.coppa = coppa;
            }
        }

        public User(GDPR gdpr, CCPA ccpa, COPPA coppa) {
            this.gdpr = gdpr;
            this.ccpa = ccpa;
            this.coppa = coppa;
        }

        public /* synthetic */ User(GDPR gdpr, CCPA ccpa, COPPA coppa, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : gdpr, (i & 2) != 0 ? null : ccpa, (i & 4) != 0 ? null : coppa);
        }
    }

    public /* synthetic */ CommonRequestBody(int i, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, vp2 vp2Var) {
        if (3 != (i & 3)) {
            pd0.R(i, 3, CommonRequestBody$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = deviceNode;
        this.app = appNode;
        if ((i & 4) == 0) {
            this.user = null;
        } else {
            this.user = user;
        }
        if ((i & 8) == 0) {
            this.ext = null;
        } else {
            this.ext = requestExt;
        }
        if ((i & 16) == 0) {
            this.request = null;
        } else {
            this.request = requestParam;
        }
    }

    public static /* synthetic */ CommonRequestBody copy$default(CommonRequestBody commonRequestBody, DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i, Object obj) {
        if ((i & 1) != 0) {
            deviceNode = commonRequestBody.device;
        }
        if ((i & 2) != 0) {
            appNode = commonRequestBody.app;
        }
        AppNode appNode2 = appNode;
        if ((i & 4) != 0) {
            user = commonRequestBody.user;
        }
        User user2 = user;
        if ((i & 8) != 0) {
            requestExt = commonRequestBody.ext;
        }
        RequestExt requestExt2 = requestExt;
        if ((i & 16) != 0) {
            requestParam = commonRequestBody.request;
        }
        return commonRequestBody.copy(deviceNode, appNode2, user2, requestExt2, requestParam);
    }

    public static final void write$Self(CommonRequestBody commonRequestBody, g40 g40Var, mp2 mp2Var) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        g40Var.p(mp2Var, 0, DeviceNode$$serializer.INSTANCE, commonRequestBody.device);
        g40Var.p(mp2Var, 1, AppNode$$serializer.INSTANCE, commonRequestBody.app);
        if (g40Var.D() || commonRequestBody.user != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g40Var.A(mp2Var, 2, CommonRequestBody$User$$serializer.INSTANCE, commonRequestBody.user);
        }
        if (g40Var.D() || commonRequestBody.ext != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            g40Var.A(mp2Var, 3, CommonRequestBody$RequestExt$$serializer.INSTANCE, commonRequestBody.ext);
        }
        if (g40Var.D() || commonRequestBody.request != null) {
            z3 = true;
        }
        if (z3) {
            g40Var.A(mp2Var, 4, CommonRequestBody$RequestParam$$serializer.INSTANCE, commonRequestBody.request);
        }
    }

    public final DeviceNode component1() {
        return this.device;
    }

    public final AppNode component2() {
        return this.app;
    }

    public final User component3() {
        return this.user;
    }

    public final RequestExt component4() {
        return this.ext;
    }

    public final RequestParam component5() {
        return this.request;
    }

    public final CommonRequestBody copy(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        return new CommonRequestBody(deviceNode, appNode, user, requestExt, requestParam);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CommonRequestBody)) {
            return false;
        }
        CommonRequestBody commonRequestBody = (CommonRequestBody) obj;
        return m20.L(this.device, commonRequestBody.device) && m20.L(this.app, commonRequestBody.app) && m20.L(this.user, commonRequestBody.user) && m20.L(this.ext, commonRequestBody.ext) && m20.L(this.request, commonRequestBody.request);
    }

    public final AppNode getApp() {
        return this.app;
    }

    public final DeviceNode getDevice() {
        return this.device;
    }

    public final RequestExt getExt() {
        return this.ext;
    }

    public final RequestParam getRequest() {
        return this.request;
    }

    public final User getUser() {
        return this.user;
    }

    public int hashCode() {
        int hashCode = (this.app.hashCode() + (this.device.hashCode() * 31)) * 31;
        User user = this.user;
        int hashCode2 = (hashCode + (user == null ? 0 : user.hashCode())) * 31;
        RequestExt requestExt = this.ext;
        int hashCode3 = (hashCode2 + (requestExt == null ? 0 : requestExt.hashCode())) * 31;
        RequestParam requestParam = this.request;
        return hashCode3 + (requestParam != null ? requestParam.hashCode() : 0);
    }

    public final void setExt(RequestExt requestExt) {
        this.ext = requestExt;
    }

    public final void setRequest(RequestParam requestParam) {
        this.request = requestParam;
    }

    public String toString() {
        return "CommonRequestBody(device=" + this.device + ", app=" + this.app + ", user=" + this.user + ", ext=" + this.ext + ", request=" + this.request + ")";
    }

    public CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam) {
        this.device = deviceNode;
        this.app = appNode;
        this.user = user;
        this.ext = requestExt;
        this.request = requestParam;
    }

    public /* synthetic */ CommonRequestBody(DeviceNode deviceNode, AppNode appNode, User user, RequestExt requestExt, RequestParam requestParam, int i, ng0 ng0Var) {
        this(deviceNode, appNode, (i & 4) != 0 ? null : user, (i & 8) != 0 ? null : requestExt, (i & 16) != 0 ? null : requestParam);
    }
}
