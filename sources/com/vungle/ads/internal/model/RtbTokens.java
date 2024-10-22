package com.vungle.ads.internal.model;

import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.bidding.BidTokenEncoder$AndroidInfo$$serializer;
import defpackage.b23;
import defpackage.cr0;
import defpackage.g40;
import defpackage.hx2;
import defpackage.ig;
import defpackage.m20;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.p71;
import defpackage.pd0;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import java.util.List;

@up2
/* loaded from: classes2.dex */
public final class RtbTokens {
    public static final Companion Companion = new Companion(null);
    private final Consent consent;
    private final Device device;
    private final Request request;

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
                return RtbTokens$CCPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ CCPA(int i, String str, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.status = str;
            } else {
                pd0.R(i, 1, RtbTokens$CCPA$$serializer.INSTANCE.getDescriptor());
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
                return RtbTokens$COPPA$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ COPPA(int i, Boolean bool, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.isCoppa = bool;
            } else {
                pd0.R(i, 1, RtbTokens$COPPA$$serializer.INSTANCE.getDescriptor());
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
            return RtbTokens$$serializer.INSTANCE;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Consent {
        public static final Companion Companion = new Companion(null);
        private final CCPA ccpa;
        private final COPPA coppa;
        private final GDPR gdpr;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return RtbTokens$Consent$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Consent(int i, CCPA ccpa, GDPR gdpr, COPPA coppa, vp2 vp2Var) {
            if (7 != (i & 7)) {
                pd0.R(i, 7, RtbTokens$Consent$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.ccpa = ccpa;
            this.gdpr = gdpr;
            this.coppa = coppa;
        }

        public static /* synthetic */ Consent copy$default(Consent consent, CCPA ccpa, GDPR gdpr, COPPA coppa, int i, Object obj) {
            if ((i & 1) != 0) {
                ccpa = consent.ccpa;
            }
            if ((i & 2) != 0) {
                gdpr = consent.gdpr;
            }
            if ((i & 4) != 0) {
                coppa = consent.coppa;
            }
            return consent.copy(ccpa, gdpr, coppa);
        }

        public static final void write$Self(Consent consent, g40 g40Var, mp2 mp2Var) {
            g40Var.p(mp2Var, 0, RtbTokens$CCPA$$serializer.INSTANCE, consent.ccpa);
            g40Var.p(mp2Var, 1, RtbTokens$GDPR$$serializer.INSTANCE, consent.gdpr);
            g40Var.p(mp2Var, 2, RtbTokens$COPPA$$serializer.INSTANCE, consent.coppa);
        }

        public final CCPA component1() {
            return this.ccpa;
        }

        public final GDPR component2() {
            return this.gdpr;
        }

        public final COPPA component3() {
            return this.coppa;
        }

        public final Consent copy(CCPA ccpa, GDPR gdpr, COPPA coppa) {
            return new Consent(ccpa, gdpr, coppa);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Consent)) {
                return false;
            }
            Consent consent = (Consent) obj;
            return m20.L(this.ccpa, consent.ccpa) && m20.L(this.gdpr, consent.gdpr) && m20.L(this.coppa, consent.coppa);
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
            return this.coppa.hashCode() + ((this.gdpr.hashCode() + (this.ccpa.hashCode() * 31)) * 31);
        }

        public String toString() {
            return "Consent(ccpa=" + this.ccpa + ", gdpr=" + this.gdpr + ", coppa=" + this.coppa + ")";
        }

        public Consent(CCPA ccpa, GDPR gdpr, COPPA coppa) {
            this.ccpa = ccpa;
            this.gdpr = gdpr;
            this.coppa = coppa;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Device {
        public static final Companion Companion = new Companion(null);
        private final BidTokenEncoder.AndroidInfo amazonInfo;
        private final BidTokenEncoder.AndroidInfo androidInfo;
        private final boolean batterySaverEnabled;
        private final Extension extension;
        private final String ifa;
        private final String language;
        private final String timezone;
        private final float volumeLevel;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return RtbTokens$Device$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Device(int i, boolean z, String str, float f, String str2, BidTokenEncoder.AndroidInfo androidInfo, BidTokenEncoder.AndroidInfo androidInfo2, String str3, Extension extension, vp2 vp2Var) {
            if (255 != (i & 255)) {
                pd0.R(i, 255, RtbTokens$Device$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.batterySaverEnabled = z;
            this.timezone = str;
            this.volumeLevel = f;
            this.ifa = str2;
            this.amazonInfo = androidInfo;
            this.androidInfo = androidInfo2;
            this.language = str3;
            this.extension = extension;
        }

        public static /* synthetic */ void getAmazonInfo$annotations() {
        }

        public static /* synthetic */ void getAndroidInfo$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getIfa$annotations() {
        }

        public static /* synthetic */ void getTimezone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static final void write$Self(Device device, g40 g40Var, mp2 mp2Var) {
            g40Var.n(mp2Var, 0, device.batterySaverEnabled);
            g40Var.o(1, device.timezone, mp2Var);
            g40Var.G(mp2Var, 2, device.volumeLevel);
            g40Var.A(mp2Var, 3, b23.f390a, device.ifa);
            BidTokenEncoder$AndroidInfo$$serializer bidTokenEncoder$AndroidInfo$$serializer = BidTokenEncoder$AndroidInfo$$serializer.INSTANCE;
            g40Var.A(mp2Var, 4, bidTokenEncoder$AndroidInfo$$serializer, device.amazonInfo);
            g40Var.A(mp2Var, 5, bidTokenEncoder$AndroidInfo$$serializer, device.androidInfo);
            g40Var.o(6, device.language, mp2Var);
            g40Var.p(mp2Var, 7, RtbTokens$Extension$$serializer.INSTANCE, device.extension);
        }

        public final boolean component1() {
            return this.batterySaverEnabled;
        }

        public final String component2() {
            return this.timezone;
        }

        public final float component3() {
            return this.volumeLevel;
        }

        public final String component4() {
            return this.ifa;
        }

        public final BidTokenEncoder.AndroidInfo component5() {
            return this.amazonInfo;
        }

        public final BidTokenEncoder.AndroidInfo component6() {
            return this.androidInfo;
        }

        public final String component7() {
            return this.language;
        }

        public final Extension component8() {
            return this.extension;
        }

        public final Device copy(boolean z, String str, float f, String str2, BidTokenEncoder.AndroidInfo androidInfo, BidTokenEncoder.AndroidInfo androidInfo2, String str3, Extension extension) {
            return new Device(z, str, f, str2, androidInfo, androidInfo2, str3, extension);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return false;
            }
            Device device = (Device) obj;
            return this.batterySaverEnabled == device.batterySaverEnabled && m20.L(this.timezone, device.timezone) && m20.L(Float.valueOf(this.volumeLevel), Float.valueOf(device.volumeLevel)) && m20.L(this.ifa, device.ifa) && m20.L(this.amazonInfo, device.amazonInfo) && m20.L(this.androidInfo, device.androidInfo) && m20.L(this.language, device.language) && m20.L(this.extension, device.extension);
        }

        public final BidTokenEncoder.AndroidInfo getAmazonInfo() {
            return this.amazonInfo;
        }

        public final BidTokenEncoder.AndroidInfo getAndroidInfo() {
            return this.androidInfo;
        }

        public final boolean getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final Extension getExtension() {
            return this.extension;
        }

        public final String getIfa() {
            return this.ifa;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getTimezone() {
            return this.timezone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v15 */
        /* JADX WARN: Type inference failed for: r0v16 */
        public int hashCode() {
            int hashCode;
            int hashCode2;
            boolean z = this.batterySaverEnabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int floatToIntBits = (Float.floatToIntBits(this.volumeLevel) + p71.h(this.timezone, r0 * 31, 31)) * 31;
            String str = this.ifa;
            int i = 0;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            int i2 = (floatToIntBits + hashCode) * 31;
            BidTokenEncoder.AndroidInfo androidInfo = this.amazonInfo;
            if (androidInfo == null) {
                hashCode2 = 0;
            } else {
                hashCode2 = androidInfo.hashCode();
            }
            int i3 = (i2 + hashCode2) * 31;
            BidTokenEncoder.AndroidInfo androidInfo2 = this.androidInfo;
            if (androidInfo2 != null) {
                i = androidInfo2.hashCode();
            }
            return this.extension.hashCode() + p71.h(this.language, (i3 + i) * 31, 31);
        }

        public String toString() {
            return "Device(batterySaverEnabled=" + this.batterySaverEnabled + ", timezone=" + this.timezone + ", volumeLevel=" + this.volumeLevel + ", ifa=" + this.ifa + ", amazonInfo=" + this.amazonInfo + ", androidInfo=" + this.androidInfo + ", language=" + this.language + ", extension=" + this.extension + ")";
        }

        public Device(boolean z, String str, float f, String str2, BidTokenEncoder.AndroidInfo androidInfo, BidTokenEncoder.AndroidInfo androidInfo2, String str3, Extension extension) {
            this.batterySaverEnabled = z;
            this.timezone = str;
            this.volumeLevel = f;
            this.ifa = str2;
            this.amazonInfo = androidInfo;
            this.androidInfo = androidInfo2;
            this.language = str3;
            this.extension = extension;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Extension {
        public static final Companion Companion = new Companion(null);
        private final boolean isSideLoadEnabled;
        private final boolean sdCardAvailable;
        private final boolean soundEnabled;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return RtbTokens$Extension$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Extension(int i, boolean z, boolean z2, boolean z3, vp2 vp2Var) {
            if (7 != (i & 7)) {
                pd0.R(i, 7, RtbTokens$Extension$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.isSideLoadEnabled = z;
            this.sdCardAvailable = z2;
            this.soundEnabled = z3;
        }

        public static /* synthetic */ Extension copy$default(Extension extension, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = extension.isSideLoadEnabled;
            }
            if ((i & 2) != 0) {
                z2 = extension.sdCardAvailable;
            }
            if ((i & 4) != 0) {
                z3 = extension.soundEnabled;
            }
            return extension.copy(z, z2, z3);
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void isSideLoadEnabled$annotations() {
        }

        public static final void write$Self(Extension extension, g40 g40Var, mp2 mp2Var) {
            g40Var.n(mp2Var, 0, extension.isSideLoadEnabled);
            g40Var.n(mp2Var, 1, extension.sdCardAvailable);
            g40Var.n(mp2Var, 2, extension.soundEnabled);
        }

        public final boolean component1() {
            return this.isSideLoadEnabled;
        }

        public final boolean component2() {
            return this.sdCardAvailable;
        }

        public final boolean component3() {
            return this.soundEnabled;
        }

        public final Extension copy(boolean z, boolean z2, boolean z3) {
            return new Extension(z, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Extension)) {
                return false;
            }
            Extension extension = (Extension) obj;
            return this.isSideLoadEnabled == extension.isSideLoadEnabled && this.sdCardAvailable == extension.sdCardAvailable && this.soundEnabled == extension.soundEnabled;
        }

        public final boolean getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final boolean getSoundEnabled() {
            return this.soundEnabled;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [int] */
        /* JADX WARN: Type inference failed for: r0v6 */
        /* JADX WARN: Type inference failed for: r0v7 */
        /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
        public int hashCode() {
            boolean z = this.isSideLoadEnabled;
            ?? r0 = z;
            if (z) {
                r0 = 1;
            }
            int i = r0 * 31;
            ?? r2 = this.sdCardAvailable;
            int i2 = r2;
            if (r2 != 0) {
                i2 = 1;
            }
            int i3 = (i + i2) * 31;
            boolean z2 = this.soundEnabled;
            return i3 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public final boolean isSideLoadEnabled() {
            return this.isSideLoadEnabled;
        }

        public String toString() {
            return "Extension(isSideLoadEnabled=" + this.isSideLoadEnabled + ", sdCardAvailable=" + this.sdCardAvailable + ", soundEnabled=" + this.soundEnabled + ")";
        }

        public Extension(boolean z, boolean z2, boolean z3) {
            this.isSideLoadEnabled = z;
            this.sdCardAvailable = z2;
            this.soundEnabled = z3;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class GDPR {
        public static final Companion Companion = new Companion(null);
        private final String messageVersion;
        private final String source;
        private final String status;
        private final long timestamp;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return RtbTokens$GDPR$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ GDPR(int i, String str, String str2, String str3, long j, vp2 vp2Var) {
            if (15 != (i & 15)) {
                pd0.R(i, 15, RtbTokens$GDPR$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.status = str;
            this.source = str2;
            this.messageVersion = str3;
            this.timestamp = j;
        }

        public static /* synthetic */ GDPR copy$default(GDPR gdpr, String str, String str2, String str3, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = gdpr.status;
            }
            if ((i & 2) != 0) {
                str2 = gdpr.source;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = gdpr.messageVersion;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                j = gdpr.timestamp;
            }
            return gdpr.copy(str, str4, str5, j);
        }

        public static /* synthetic */ void getMessageVersion$annotations() {
        }

        public static final void write$Self(GDPR gdpr, g40 g40Var, mp2 mp2Var) {
            g40Var.o(0, gdpr.status, mp2Var);
            g40Var.o(1, gdpr.source, mp2Var);
            g40Var.o(2, gdpr.messageVersion, mp2Var);
            g40Var.j(mp2Var, 3, gdpr.timestamp);
        }

        public final String component1() {
            return this.status;
        }

        public final String component2() {
            return this.source;
        }

        public final String component3() {
            return this.messageVersion;
        }

        public final long component4() {
            return this.timestamp;
        }

        public final GDPR copy(String str, String str2, String str3, long j) {
            return new GDPR(str, str2, str3, j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GDPR)) {
                return false;
            }
            GDPR gdpr = (GDPR) obj;
            return m20.L(this.status, gdpr.status) && m20.L(this.source, gdpr.source) && m20.L(this.messageVersion, gdpr.messageVersion) && this.timestamp == gdpr.timestamp;
        }

        public final String getMessageVersion() {
            return this.messageVersion;
        }

        public final String getSource() {
            return this.source;
        }

        public final String getStatus() {
            return this.status;
        }

        public final long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int h = p71.h(this.messageVersion, p71.h(this.source, this.status.hashCode() * 31, 31), 31);
            long j = this.timestamp;
            return h + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            String str = this.status;
            String str2 = this.source;
            String str3 = this.messageVersion;
            long j = this.timestamp;
            StringBuilder q = p71.q("GDPR(status=", str, ", source=", str2, ", messageVersion=");
            q.append(str3);
            q.append(", timestamp=");
            q.append(j);
            q.append(")");
            return q.toString();
        }

        public GDPR(String str, String str2, String str3, long j) {
            this.status = str;
            this.source = str2;
            this.messageVersion = str3;
            this.timestamp = j;
        }
    }

    public /* synthetic */ RtbTokens(int i, Device device, Request request, Consent consent, vp2 vp2Var) {
        if (7 != (i & 7)) {
            pd0.R(i, 7, RtbTokens$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.device = device;
        this.request = request;
        this.consent = consent;
    }

    public static /* synthetic */ RtbTokens copy$default(RtbTokens rtbTokens, Device device, Request request, Consent consent, int i, Object obj) {
        if ((i & 1) != 0) {
            device = rtbTokens.device;
        }
        if ((i & 2) != 0) {
            request = rtbTokens.request;
        }
        if ((i & 4) != 0) {
            consent = rtbTokens.consent;
        }
        return rtbTokens.copy(device, request, consent);
    }

    public static final void write$Self(RtbTokens rtbTokens, g40 g40Var, mp2 mp2Var) {
        g40Var.p(mp2Var, 0, RtbTokens$Device$$serializer.INSTANCE, rtbTokens.device);
        g40Var.p(mp2Var, 1, RtbTokens$Request$$serializer.INSTANCE, rtbTokens.request);
        g40Var.p(mp2Var, 2, RtbTokens$Consent$$serializer.INSTANCE, rtbTokens.consent);
    }

    public final Device component1() {
        return this.device;
    }

    public final Request component2() {
        return this.request;
    }

    public final Consent component3() {
        return this.consent;
    }

    public final RtbTokens copy(Device device, Request request, Consent consent) {
        return new RtbTokens(device, request, consent);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RtbTokens)) {
            return false;
        }
        RtbTokens rtbTokens = (RtbTokens) obj;
        return m20.L(this.device, rtbTokens.device) && m20.L(this.request, rtbTokens.request) && m20.L(this.consent, rtbTokens.consent);
    }

    public final Consent getConsent() {
        return this.consent;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final Request getRequest() {
        return this.request;
    }

    public int hashCode() {
        return this.consent.hashCode() + ((this.request.hashCode() + (this.device.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "RtbTokens(device=" + this.device + ", request=" + this.request + ", consent=" + this.consent + ")";
    }

    public RtbTokens(Device device, Request request, Consent consent) {
        this.device = device;
        this.request = request;
        this.consent = consent;
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class Request {
        public static final Companion Companion = new Companion(null);
        private final String configExtension;
        private final int ordinalView;
        private final List<String> preCachedToken;
        private final String sdkUserAgent;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return RtbTokens$Request$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Request(int i, String str, int i2, String str2, List list, vp2 vp2Var) {
            if (7 != (i & 7)) {
                pd0.R(i, 7, RtbTokens$Request$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.configExtension = str;
            this.ordinalView = i2;
            this.sdkUserAgent = str2;
            if ((i & 8) == 0) {
                this.preCachedToken = cr0.f1659a;
            } else {
                this.preCachedToken = list;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Request copy$default(Request request, String str, int i, String str2, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = request.configExtension;
            }
            if ((i2 & 2) != 0) {
                i = request.ordinalView;
            }
            if ((i2 & 4) != 0) {
                str2 = request.sdkUserAgent;
            }
            if ((i2 & 8) != 0) {
                list = request.preCachedToken;
            }
            return request.copy(str, i, str2, list);
        }

        public static /* synthetic */ void getConfigExtension$annotations() {
        }

        public static /* synthetic */ void getOrdinalView$annotations() {
        }

        public static /* synthetic */ void getPreCachedToken$annotations() {
        }

        public static /* synthetic */ void getSdkUserAgent$annotations() {
        }

        public static final void write$Self(Request request, g40 g40Var, mp2 mp2Var) {
            b23 b23Var = b23.f390a;
            g40Var.A(mp2Var, 0, b23Var, request.configExtension);
            boolean z = true;
            g40Var.x(1, request.ordinalView, mp2Var);
            g40Var.o(2, request.sdkUserAgent, mp2Var);
            if (!g40Var.D() && m20.L(request.preCachedToken, cr0.f1659a)) {
                z = false;
            }
            if (z) {
                g40Var.p(mp2Var, 3, new ig(b23Var, 0), request.preCachedToken);
            }
        }

        public final String component1() {
            return this.configExtension;
        }

        public final int component2() {
            return this.ordinalView;
        }

        public final String component3() {
            return this.sdkUserAgent;
        }

        public final List<String> component4() {
            return this.preCachedToken;
        }

        public final Request copy(String str, int i, String str2, List<String> list) {
            return new Request(str, i, str2, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Request)) {
                return false;
            }
            Request request = (Request) obj;
            return m20.L(this.configExtension, request.configExtension) && this.ordinalView == request.ordinalView && m20.L(this.sdkUserAgent, request.sdkUserAgent) && m20.L(this.preCachedToken, request.preCachedToken);
        }

        public final String getConfigExtension() {
            return this.configExtension;
        }

        public final int getOrdinalView() {
            return this.ordinalView;
        }

        public final List<String> getPreCachedToken() {
            return this.preCachedToken;
        }

        public final String getSdkUserAgent() {
            return this.sdkUserAgent;
        }

        public int hashCode() {
            int hashCode;
            String str = this.configExtension;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return this.preCachedToken.hashCode() + p71.h(this.sdkUserAgent, ((hashCode * 31) + this.ordinalView) * 31, 31);
        }

        public String toString() {
            return "Request(configExtension=" + this.configExtension + ", ordinalView=" + this.ordinalView + ", sdkUserAgent=" + this.sdkUserAgent + ", preCachedToken=" + this.preCachedToken + ")";
        }

        public Request(String str, int i, String str2, List<String> list) {
            this.configExtension = str;
            this.ordinalView = i;
            this.sdkUserAgent = str2;
            this.preCachedToken = list;
        }

        public /* synthetic */ Request(String str, int i, String str2, List list, int i2, ng0 ng0Var) {
            this(str, i, str2, (i2 & 8) != 0 ? cr0.f1659a : list);
        }
    }
}
