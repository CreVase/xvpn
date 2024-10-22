package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import defpackage.b23;
import defpackage.g40;
import defpackage.ld1;
import defpackage.m20;
import defpackage.mp2;
import defpackage.ng0;
import defpackage.p71;
import defpackage.pd0;
import defpackage.uh1;
import defpackage.up2;
import defpackage.vp2;
import okhttp3.internal.http2.Http2;

@up2
/* loaded from: classes2.dex */
public final class DeviceNode {
    public static final Companion Companion = new Companion(null);
    private final String carrier;
    private DeviceExt ext;
    private final int h;
    private String ifa;
    private Integer lmt;
    private final String make;
    private final String model;
    private final String os;
    private final String osv;
    private String ua;
    private final int w;

    @up2
    /* loaded from: classes2.dex */
    public static final class AndroidAmazonExt extends CommonVungleExt {
        public static final Companion Companion = new Companion(null);
        private String amazonAdvertisingId;
        private String gaid;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return DeviceNode$AndroidAmazonExt$$serializer.INSTANCE;
            }
        }

        public AndroidAmazonExt() {
            this(null, null, 3, null);
        }

        public static /* synthetic */ AndroidAmazonExt copy$default(AndroidAmazonExt androidAmazonExt, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = androidAmazonExt.gaid;
            }
            if ((i & 2) != 0) {
                str2 = androidAmazonExt.amazonAdvertisingId;
            }
            return androidAmazonExt.copy(str, str2);
        }

        public static final void write$Self(AndroidAmazonExt androidAmazonExt, g40 g40Var, mp2 mp2Var) {
            boolean z;
            CommonVungleExt.write$Self(androidAmazonExt, g40Var, mp2Var);
            boolean z2 = true;
            if (g40Var.D() || androidAmazonExt.gaid != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 18, b23.f390a, androidAmazonExt.gaid);
            }
            if (!g40Var.D() && androidAmazonExt.amazonAdvertisingId == null) {
                z2 = false;
            }
            if (z2) {
                g40Var.A(mp2Var, 19, b23.f390a, androidAmazonExt.amazonAdvertisingId);
            }
        }

        public final String component1() {
            return this.gaid;
        }

        public final String component2() {
            return this.amazonAdvertisingId;
        }

        public final AndroidAmazonExt copy(String str, String str2) {
            return new AndroidAmazonExt(str, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AndroidAmazonExt)) {
                return false;
            }
            AndroidAmazonExt androidAmazonExt = (AndroidAmazonExt) obj;
            return m20.L(this.gaid, androidAmazonExt.gaid) && m20.L(this.amazonAdvertisingId, androidAmazonExt.amazonAdvertisingId);
        }

        public final String getAmazonAdvertisingId() {
            return this.amazonAdvertisingId;
        }

        public final String getGaid() {
            return this.gaid;
        }

        public int hashCode() {
            String str = this.gaid;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.amazonAdvertisingId;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final void setAmazonAdvertisingId(String str) {
            this.amazonAdvertisingId = str;
        }

        public final void setGaid(String str) {
            this.gaid = str;
        }

        public String toString() {
            return "AndroidAmazonExt(gaid=" + this.gaid + ", amazonAdvertisingId=" + this.amazonAdvertisingId + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AndroidAmazonExt(int i, String str, boolean z, String str2, float f, String str3, int i2, String str4, String str5, String str6, String str7, String str8, float f2, int i3, long j, boolean z2, int i4, boolean z3, String str9, String str10, String str11, vp2 vp2Var) {
            super(i, str, z, str2, f, str3, i2, str4, str5, str6, str7, str8, f2, i3, j, z2, i4, z3, str9, vp2Var);
            AndroidAmazonExt androidAmazonExt;
            if ((i & 0) != 0) {
                pd0.R(i, 0, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((262144 & i) == 0) {
                androidAmazonExt = this;
                androidAmazonExt.gaid = null;
            } else {
                androidAmazonExt = this;
                androidAmazonExt.gaid = str10;
            }
            if ((i & 524288) == 0) {
                androidAmazonExt.amazonAdvertisingId = null;
            } else {
                androidAmazonExt.amazonAdvertisingId = str11;
            }
        }

        public /* synthetic */ AndroidAmazonExt(String str, String str2, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
        }

        public AndroidAmazonExt(String str, String str2) {
            this.gaid = str;
            this.amazonAdvertisingId = str2;
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
            return DeviceNode$$serializer.INSTANCE;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class DeviceExt {
        public static final Companion Companion = new Companion(null);
        private final VungleExt vungle;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return DeviceNode$DeviceExt$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DeviceExt(int i, VungleExt vungleExt, vp2 vp2Var) {
            if (1 == (i & 1)) {
                this.vungle = vungleExt;
            } else {
                pd0.R(i, 1, DeviceNode$DeviceExt$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public static /* synthetic */ DeviceExt copy$default(DeviceExt deviceExt, VungleExt vungleExt, int i, Object obj) {
            if ((i & 1) != 0) {
                vungleExt = deviceExt.vungle;
            }
            return deviceExt.copy(vungleExt);
        }

        public final VungleExt component1() {
            return this.vungle;
        }

        public final DeviceExt copy(VungleExt vungleExt) {
            return new DeviceExt(vungleExt);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeviceExt) && m20.L(this.vungle, ((DeviceExt) obj).vungle);
        }

        public final VungleExt getVungle() {
            return this.vungle;
        }

        public int hashCode() {
            return this.vungle.hashCode();
        }

        public String toString() {
            return "DeviceExt(vungle=" + this.vungle + ")";
        }

        public DeviceExt(VungleExt vungleExt) {
            this.vungle = vungleExt;
        }
    }

    @up2
    /* loaded from: classes2.dex */
    public static final class VungleExt {
        public static final Companion Companion = new Companion(null);
        private final AndroidAmazonExt amazon;

        /* renamed from: android */
        private final AndroidAmazonExt f1643android;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return DeviceNode$VungleExt$$serializer.INSTANCE;
            }
        }

        public VungleExt() {
            this((AndroidAmazonExt) null, (AndroidAmazonExt) null, 3, (ng0) null);
        }

        public static /* synthetic */ VungleExt copy$default(VungleExt vungleExt, AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2, int i, Object obj) {
            if ((i & 1) != 0) {
                androidAmazonExt = vungleExt.f1643android;
            }
            if ((i & 2) != 0) {
                androidAmazonExt2 = vungleExt.amazon;
            }
            return vungleExt.copy(androidAmazonExt, androidAmazonExt2);
        }

        public static final void write$Self(VungleExt vungleExt, g40 g40Var, mp2 mp2Var) {
            boolean z;
            boolean z2 = false;
            if (g40Var.D() || vungleExt.f1643android != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE, vungleExt.f1643android);
            }
            if (g40Var.D() || vungleExt.amazon != null) {
                z2 = true;
            }
            if (z2) {
                g40Var.A(mp2Var, 1, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE, vungleExt.amazon);
            }
        }

        public final AndroidAmazonExt component1() {
            return this.f1643android;
        }

        public final AndroidAmazonExt component2() {
            return this.amazon;
        }

        public final VungleExt copy(AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2) {
            return new VungleExt(androidAmazonExt, androidAmazonExt2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VungleExt)) {
                return false;
            }
            VungleExt vungleExt = (VungleExt) obj;
            return m20.L(this.f1643android, vungleExt.f1643android) && m20.L(this.amazon, vungleExt.amazon);
        }

        public final AndroidAmazonExt getAmazon() {
            return this.amazon;
        }

        public final AndroidAmazonExt getAndroid() {
            return this.f1643android;
        }

        public int hashCode() {
            AndroidAmazonExt androidAmazonExt = this.f1643android;
            int hashCode = (androidAmazonExt == null ? 0 : androidAmazonExt.hashCode()) * 31;
            AndroidAmazonExt androidAmazonExt2 = this.amazon;
            return hashCode + (androidAmazonExt2 != null ? androidAmazonExt2.hashCode() : 0);
        }

        public String toString() {
            return "VungleExt(android=" + this.f1643android + ", amazon=" + this.amazon + ")";
        }

        public /* synthetic */ VungleExt(int i, AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, DeviceNode$VungleExt$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.f1643android = null;
            } else {
                this.f1643android = androidAmazonExt;
            }
            if ((i & 2) == 0) {
                this.amazon = null;
            } else {
                this.amazon = androidAmazonExt2;
            }
        }

        public VungleExt(AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2) {
            this.f1643android = androidAmazonExt;
            this.amazon = androidAmazonExt2;
        }

        public /* synthetic */ VungleExt(AndroidAmazonExt androidAmazonExt, AndroidAmazonExt androidAmazonExt2, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? null : androidAmazonExt, (i & 2) != 0 ? null : androidAmazonExt2);
        }
    }

    public /* synthetic */ DeviceNode(int i, String str, String str2, String str3, String str4, String str5, int i2, int i3, String str6, String str7, Integer num, DeviceExt deviceExt, vp2 vp2Var) {
        if (119 != (i & 119)) {
            pd0.R(i, 119, DeviceNode$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.make = str;
        this.model = str2;
        this.osv = str3;
        if ((i & 8) == 0) {
            this.carrier = null;
        } else {
            this.carrier = str4;
        }
        this.os = str5;
        this.w = i2;
        this.h = i3;
        if ((i & 128) == 0) {
            this.ua = null;
        } else {
            this.ua = str6;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
            this.ifa = null;
        } else {
            this.ifa = str7;
        }
        if ((i & 512) == 0) {
            this.lmt = null;
        } else {
            this.lmt = num;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
            this.ext = null;
        } else {
            this.ext = deviceExt;
        }
    }

    public static final void write$Self(DeviceNode deviceNode, g40 g40Var, mp2 mp2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        g40Var.o(0, deviceNode.make, mp2Var);
        g40Var.o(1, deviceNode.model, mp2Var);
        g40Var.o(2, deviceNode.osv, mp2Var);
        if (g40Var.D() || deviceNode.carrier != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            g40Var.A(mp2Var, 3, b23.f390a, deviceNode.carrier);
        }
        g40Var.o(4, deviceNode.os, mp2Var);
        g40Var.x(5, deviceNode.w, mp2Var);
        g40Var.x(6, deviceNode.h, mp2Var);
        if (g40Var.D() || deviceNode.ua != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            g40Var.A(mp2Var, 7, b23.f390a, deviceNode.ua);
        }
        if (g40Var.D() || deviceNode.ifa != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            g40Var.A(mp2Var, 8, b23.f390a, deviceNode.ifa);
        }
        if (g40Var.D() || deviceNode.lmt != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            g40Var.A(mp2Var, 9, ld1.f3105a, deviceNode.lmt);
        }
        if (g40Var.D() || deviceNode.ext != null) {
            z5 = true;
        }
        if (z5) {
            g40Var.A(mp2Var, 10, DeviceNode$DeviceExt$$serializer.INSTANCE, deviceNode.ext);
        }
    }

    public final String component1() {
        return this.make;
    }

    public final Integer component10() {
        return this.lmt;
    }

    public final DeviceExt component11() {
        return this.ext;
    }

    public final String component2() {
        return this.model;
    }

    public final String component3() {
        return this.osv;
    }

    public final String component4() {
        return this.carrier;
    }

    public final String component5() {
        return this.os;
    }

    public final int component6() {
        return this.w;
    }

    public final int component7() {
        return this.h;
    }

    public final String component8() {
        return this.ua;
    }

    public final String component9() {
        return this.ifa;
    }

    public final DeviceNode copy(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, DeviceExt deviceExt) {
        return new DeviceNode(str, str2, str3, str4, str5, i, i2, str6, str7, num, deviceExt);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeviceNode)) {
            return false;
        }
        DeviceNode deviceNode = (DeviceNode) obj;
        return m20.L(this.make, deviceNode.make) && m20.L(this.model, deviceNode.model) && m20.L(this.osv, deviceNode.osv) && m20.L(this.carrier, deviceNode.carrier) && m20.L(this.os, deviceNode.os) && this.w == deviceNode.w && this.h == deviceNode.h && m20.L(this.ua, deviceNode.ua) && m20.L(this.ifa, deviceNode.ifa) && m20.L(this.lmt, deviceNode.lmt) && m20.L(this.ext, deviceNode.ext);
    }

    public final String getCarrier() {
        return this.carrier;
    }

    public final DeviceExt getExt() {
        return this.ext;
    }

    public final int getH() {
        return this.h;
    }

    public final String getIfa() {
        return this.ifa;
    }

    public final Integer getLmt() {
        return this.lmt;
    }

    public final String getMake() {
        return this.make;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOs() {
        return this.os;
    }

    public final String getOsv() {
        return this.osv;
    }

    public final String getUa() {
        return this.ua;
    }

    public final int getW() {
        return this.w;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int h = p71.h(this.osv, p71.h(this.model, this.make.hashCode() * 31, 31), 31);
        String str = this.carrier;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int h2 = (((p71.h(this.os, (h + hashCode) * 31, 31) + this.w) * 31) + this.h) * 31;
        String str2 = this.ua;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (h2 + hashCode2) * 31;
        String str3 = this.ifa;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        Integer num = this.lmt;
        if (num == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = num.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        DeviceExt deviceExt = this.ext;
        if (deviceExt != null) {
            i = deviceExt.hashCode();
        }
        return i4 + i;
    }

    public final void setExt(DeviceExt deviceExt) {
        this.ext = deviceExt;
    }

    public final void setIfa(String str) {
        this.ifa = str;
    }

    public final void setLmt(Integer num) {
        this.lmt = num;
    }

    public final void setUa(String str) {
        this.ua = str;
    }

    public String toString() {
        String str = this.make;
        String str2 = this.model;
        String str3 = this.osv;
        String str4 = this.carrier;
        String str5 = this.os;
        int i = this.w;
        int i2 = this.h;
        String str6 = this.ua;
        String str7 = this.ifa;
        Integer num = this.lmt;
        DeviceExt deviceExt = this.ext;
        StringBuilder q = p71.q("DeviceNode(make=", str, ", model=", str2, ", osv=");
        p71.A(q, str3, ", carrier=", str4, ", os=");
        q.append(str5);
        q.append(", w=");
        q.append(i);
        q.append(", h=");
        q.append(i2);
        q.append(", ua=");
        q.append(str6);
        q.append(", ifa=");
        q.append(str7);
        q.append(", lmt=");
        q.append(num);
        q.append(", ext=");
        q.append(deviceExt);
        q.append(")");
        return q.toString();
    }

    public DeviceNode(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, DeviceExt deviceExt) {
        this.make = str;
        this.model = str2;
        this.osv = str3;
        this.carrier = str4;
        this.os = str5;
        this.w = i;
        this.h = i2;
        this.ua = str6;
        this.ifa = str7;
        this.lmt = num;
        this.ext = deviceExt;
    }

    @up2
    /* loaded from: classes2.dex */
    public static class CommonVungleExt {
        public static final Companion Companion = new Companion(null);
        private String androidId;
        private String appSetId;
        private float batteryLevel;
        private int batterySaverEnabled;
        private String batteryState;
        private String connectionType;
        private String connectionTypeDetail;
        private boolean isGooglePlayServicesAvailable;
        private boolean isSideloadEnabled;
        private boolean isTv;
        private String language;
        private String locale;
        private String osName;
        private int sdCardAvailable;
        private int soundEnabled;
        private long storageBytesAvailable;
        private String timeZone;
        private float volumeLevel;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final uh1 serializer() {
                return DeviceNode$CommonVungleExt$$serializer.INSTANCE;
            }
        }

        public CommonVungleExt() {
            this.soundEnabled = 1;
            this.storageBytesAvailable = 1L;
            this.sdCardAvailable = 1;
        }

        public static /* synthetic */ void getAndroidId$annotations() {
        }

        public static /* synthetic */ void getAppSetId$annotations() {
        }

        public static /* synthetic */ void getBatteryLevel$annotations() {
        }

        public static /* synthetic */ void getBatterySaverEnabled$annotations() {
        }

        public static /* synthetic */ void getBatteryState$annotations() {
        }

        public static /* synthetic */ void getConnectionType$annotations() {
        }

        public static /* synthetic */ void getConnectionTypeDetail$annotations() {
        }

        public static /* synthetic */ void getOsName$annotations() {
        }

        public static /* synthetic */ void getSdCardAvailable$annotations() {
        }

        public static /* synthetic */ void getSoundEnabled$annotations() {
        }

        public static /* synthetic */ void getStorageBytesAvailable$annotations() {
        }

        public static /* synthetic */ void getTimeZone$annotations() {
        }

        public static /* synthetic */ void getVolumeLevel$annotations() {
        }

        public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
        }

        public static /* synthetic */ void isSideloadEnabled$annotations() {
        }

        public static /* synthetic */ void isTv$annotations() {
        }

        public static final void write$Self(CommonVungleExt commonVungleExt, g40 g40Var, mp2 mp2Var) {
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
            boolean z18 = false;
            if (g40Var.D() || commonVungleExt.androidId != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                g40Var.A(mp2Var, 0, b23.f390a, commonVungleExt.androidId);
            }
            if (g40Var.D() || commonVungleExt.isGooglePlayServicesAvailable) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                g40Var.n(mp2Var, 1, commonVungleExt.isGooglePlayServicesAvailable);
            }
            if (g40Var.D() || commonVungleExt.appSetId != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                g40Var.A(mp2Var, 2, b23.f390a, commonVungleExt.appSetId);
            }
            if (g40Var.D() || !m20.L(Float.valueOf(commonVungleExt.batteryLevel), Float.valueOf(0.0f))) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                g40Var.G(mp2Var, 3, commonVungleExt.batteryLevel);
            }
            if (g40Var.D() || commonVungleExt.batteryState != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (z5) {
                g40Var.A(mp2Var, 4, b23.f390a, commonVungleExt.batteryState);
            }
            if (g40Var.D() || commonVungleExt.batterySaverEnabled != 0) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (z6) {
                g40Var.x(5, commonVungleExt.batterySaverEnabled, mp2Var);
            }
            if (g40Var.D() || commonVungleExt.connectionType != null) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (z7) {
                g40Var.A(mp2Var, 6, b23.f390a, commonVungleExt.connectionType);
            }
            if (g40Var.D() || commonVungleExt.connectionTypeDetail != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (z8) {
                g40Var.A(mp2Var, 7, b23.f390a, commonVungleExt.connectionTypeDetail);
            }
            if (g40Var.D() || commonVungleExt.locale != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                g40Var.A(mp2Var, 8, b23.f390a, commonVungleExt.locale);
            }
            if (g40Var.D() || commonVungleExt.language != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                g40Var.A(mp2Var, 9, b23.f390a, commonVungleExt.language);
            }
            if (g40Var.D() || commonVungleExt.timeZone != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                g40Var.A(mp2Var, 10, b23.f390a, commonVungleExt.timeZone);
            }
            if (g40Var.D() || !m20.L(Float.valueOf(commonVungleExt.volumeLevel), Float.valueOf(0.0f))) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12) {
                g40Var.G(mp2Var, 11, commonVungleExt.volumeLevel);
            }
            if (g40Var.D() || commonVungleExt.soundEnabled != 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                g40Var.x(12, commonVungleExt.soundEnabled, mp2Var);
            }
            if (g40Var.D() || commonVungleExt.storageBytesAvailable != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (z14) {
                g40Var.j(mp2Var, 13, commonVungleExt.storageBytesAvailable);
            }
            if (g40Var.D() || commonVungleExt.isTv) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z15) {
                g40Var.n(mp2Var, 14, commonVungleExt.isTv);
            }
            if (g40Var.D() || commonVungleExt.sdCardAvailable != 1) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                g40Var.x(15, commonVungleExt.sdCardAvailable, mp2Var);
            }
            if (g40Var.D() || commonVungleExt.isSideloadEnabled) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z17) {
                g40Var.n(mp2Var, 16, commonVungleExt.isSideloadEnabled);
            }
            if (g40Var.D() || commonVungleExt.osName != null) {
                z18 = true;
            }
            if (z18) {
                g40Var.A(mp2Var, 17, b23.f390a, commonVungleExt.osName);
            }
        }

        public final String getAndroidId() {
            return this.androidId;
        }

        public final String getAppSetId() {
            return this.appSetId;
        }

        public final float getBatteryLevel() {
            return this.batteryLevel;
        }

        public final int getBatterySaverEnabled() {
            return this.batterySaverEnabled;
        }

        public final String getBatteryState() {
            return this.batteryState;
        }

        public final String getConnectionType() {
            return this.connectionType;
        }

        public final String getConnectionTypeDetail() {
            return this.connectionTypeDetail;
        }

        public final String getLanguage() {
            return this.language;
        }

        public final String getLocale() {
            return this.locale;
        }

        public final String getOsName() {
            return this.osName;
        }

        public final int getSdCardAvailable() {
            return this.sdCardAvailable;
        }

        public final int getSoundEnabled() {
            return this.soundEnabled;
        }

        public final long getStorageBytesAvailable() {
            return this.storageBytesAvailable;
        }

        public final String getTimeZone() {
            return this.timeZone;
        }

        public final float getVolumeLevel() {
            return this.volumeLevel;
        }

        public final boolean isGooglePlayServicesAvailable() {
            return this.isGooglePlayServicesAvailable;
        }

        public final boolean isSideloadEnabled() {
            return this.isSideloadEnabled;
        }

        public final boolean isTv() {
            return this.isTv;
        }

        public final void setAndroidId(String str) {
            this.androidId = str;
        }

        public final void setAppSetId(String str) {
            this.appSetId = str;
        }

        public final void setBatteryLevel(float f) {
            this.batteryLevel = f;
        }

        public final void setBatterySaverEnabled(int i) {
            this.batterySaverEnabled = i;
        }

        public final void setBatteryState(String str) {
            this.batteryState = str;
        }

        public final void setConnectionType(String str) {
            this.connectionType = str;
        }

        public final void setConnectionTypeDetail(String str) {
            this.connectionTypeDetail = str;
        }

        public final void setGooglePlayServicesAvailable(boolean z) {
            this.isGooglePlayServicesAvailable = z;
        }

        public final void setLanguage(String str) {
            this.language = str;
        }

        public final void setLocale(String str) {
            this.locale = str;
        }

        public final void setOsName(String str) {
            this.osName = str;
        }

        public final void setSdCardAvailable(int i) {
            this.sdCardAvailable = i;
        }

        public final void setSideloadEnabled(boolean z) {
            this.isSideloadEnabled = z;
        }

        public final void setSoundEnabled(int i) {
            this.soundEnabled = i;
        }

        public final void setStorageBytesAvailable(long j) {
            this.storageBytesAvailable = j;
        }

        public final void setTimeZone(String str) {
            this.timeZone = str;
        }

        public final void setTv(boolean z) {
            this.isTv = z;
        }

        public final void setVolumeLevel(float f) {
            this.volumeLevel = f;
        }

        public /* synthetic */ CommonVungleExt(int i, String str, boolean z, String str2, float f, String str3, int i2, String str4, String str5, String str6, String str7, String str8, float f2, int i3, long j, boolean z2, int i4, boolean z3, String str9, vp2 vp2Var) {
            if ((i & 0) != 0) {
                pd0.R(i, 0, DeviceNode$CommonVungleExt$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            if ((i & 1) == 0) {
                this.androidId = null;
            } else {
                this.androidId = str;
            }
            if ((i & 2) == 0) {
                this.isGooglePlayServicesAvailable = false;
            } else {
                this.isGooglePlayServicesAvailable = z;
            }
            if ((i & 4) == 0) {
                this.appSetId = null;
            } else {
                this.appSetId = str2;
            }
            if ((i & 8) == 0) {
                this.batteryLevel = 0.0f;
            } else {
                this.batteryLevel = f;
            }
            if ((i & 16) == 0) {
                this.batteryState = null;
            } else {
                this.batteryState = str3;
            }
            if ((i & 32) == 0) {
                this.batterySaverEnabled = 0;
            } else {
                this.batterySaverEnabled = i2;
            }
            if ((i & 64) == 0) {
                this.connectionType = null;
            } else {
                this.connectionType = str4;
            }
            if ((i & 128) == 0) {
                this.connectionTypeDetail = null;
            } else {
                this.connectionTypeDetail = str5;
            }
            if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) == 0) {
                this.locale = null;
            } else {
                this.locale = str6;
            }
            if ((i & 512) == 0) {
                this.language = null;
            } else {
                this.language = str7;
            }
            if ((i & UserVerificationMethods.USER_VERIFY_ALL) == 0) {
                this.timeZone = null;
            } else {
                this.timeZone = str8;
            }
            if ((i & 2048) == 0) {
                this.volumeLevel = 0.0f;
            } else {
                this.volumeLevel = f2;
            }
            if ((i & v.DEFAULT_BUFFER_SIZE) == 0) {
                this.soundEnabled = 1;
            } else {
                this.soundEnabled = i3;
            }
            this.storageBytesAvailable = (i & 8192) == 0 ? 1L : j;
            if ((i & Http2.INITIAL_MAX_FRAME_SIZE) == 0) {
                this.isTv = false;
            } else {
                this.isTv = z2;
            }
            if ((32768 & i) == 0) {
                this.sdCardAvailable = 1;
            } else {
                this.sdCardAvailable = i4;
            }
            if ((65536 & i) == 0) {
                this.isSideloadEnabled = false;
            } else {
                this.isSideloadEnabled = z3;
            }
            if ((i & 131072) == 0) {
                this.osName = null;
            } else {
                this.osName = str9;
            }
        }
    }

    public /* synthetic */ DeviceNode(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6, String str7, Integer num, DeviceExt deviceExt, int i3, ng0 ng0Var) {
        this(str, str2, str3, (i3 & 8) != 0 ? null : str4, str5, i, i2, (i3 & 128) != 0 ? null : str6, (i3 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? null : str7, (i3 & 512) != 0 ? null : num, (i3 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : deviceExt);
    }
}
