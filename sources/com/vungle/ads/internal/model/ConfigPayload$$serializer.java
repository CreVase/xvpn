package com.vungle.ads.internal.model;

import com.chartboost.sdk.privacy.model.GDPR;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import com.vungle.ads.internal.model.ConfigPayload;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ig;
import defpackage.ir0;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;
import java.util.List;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class ConfigPayload$$serializer implements n51 {
    public static final ConfigPayload$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$$serializer configPayload$$serializer = new ConfigPayload$$serializer();
        INSTANCE = configPayload$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload", configPayload$$serializer, 15);
        f62Var.j("endpoints", true);
        f62Var.j("placements", true);
        f62Var.j("config", true);
        f62Var.j(GDPR.GDPR_STANDARD, true);
        f62Var.j("logging", true);
        f62Var.j("crash_report", true);
        f62Var.j("viewability", true);
        f62Var.j("ad_load_optimization", true);
        f62Var.j("ri", true);
        f62Var.j(Cookie.COPPA_DISABLE_AD_ID, true);
        f62Var.j(Cookie.CONFIG_EXTENSION, true);
        f62Var.j(AdPayload.KEY_TEMPLATE, true);
        f62Var.j("log_metrics", true);
        f62Var.j("session", true);
        f62Var.j("clever_cache", true);
        descriptor = f62Var;
    }

    private ConfigPayload$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{t9.K(ConfigPayload$Endpoints$$serializer.INSTANCE), t9.K(new ig(Placement$$serializer.INSTANCE, 0)), t9.K(ConfigPayload$ConfigSettings$$serializer.INSTANCE), t9.K(ConfigPayload$GDPRSettings$$serializer.INSTANCE), t9.K(ConfigPayload$LoggingSettings$$serializer.INSTANCE), t9.K(ConfigPayload$CrashReportSettings$$serializer.INSTANCE), t9.K(ConfigPayload$ViewabilitySettings$$serializer.INSTANCE), t9.K(ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE), t9.K(ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE), t9.K(rq.f4201a), t9.K(b23.f390a), t9.K(ConfigPayload$Template$$serializer.INSTANCE), t9.K(ConfigPayload$LogMetricsSettings$$serializer.INSTANCE), t9.K(ConfigPayload$Session$$serializer.INSTANCE), t9.K(CleverCache$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0029. Please report as an issue. */
    @Override // defpackage.sk0
    public ConfigPayload deserialize(qe0 qe0Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        int i;
        Object obj8;
        int i2;
        Object obj9;
        int i3;
        int i4;
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        int i5 = 0;
        boolean z = true;
        while (z) {
            Object obj25 = obj10;
            int j = c.j(descriptor2);
            switch (j) {
                case -1:
                    obj13 = obj13;
                    obj10 = obj25;
                    obj20 = obj20;
                    obj15 = obj15;
                    obj16 = obj16;
                    obj14 = obj14;
                    z = false;
                case 0:
                    obj = obj14;
                    obj2 = obj15;
                    obj3 = obj16;
                    obj4 = obj25;
                    obj5 = obj13;
                    obj6 = obj20;
                    int i6 = i5 | 1;
                    obj23 = c.B(descriptor2, 0, ConfigPayload$Endpoints$$serializer.INSTANCE, obj23);
                    obj7 = obj24;
                    i = i6;
                    obj10 = obj4;
                    obj24 = obj7;
                    obj15 = obj2;
                    obj16 = obj3;
                    i5 = i;
                    obj13 = obj5;
                    obj14 = obj;
                    obj20 = obj6;
                case 1:
                    obj = obj14;
                    obj3 = obj16;
                    obj4 = obj25;
                    obj5 = obj13;
                    obj2 = obj15;
                    i = i5 | 2;
                    obj7 = c.B(descriptor2, 1, new ig(Placement$$serializer.INSTANCE, 0), obj24);
                    obj6 = obj20;
                    obj10 = obj4;
                    obj24 = obj7;
                    obj15 = obj2;
                    obj16 = obj3;
                    i5 = i;
                    obj13 = obj5;
                    obj14 = obj;
                    obj20 = obj6;
                case 2:
                    obj8 = obj14;
                    Object obj26 = obj13;
                    obj10 = c.B(descriptor2, 2, ConfigPayload$ConfigSettings$$serializer.INSTANCE, obj25);
                    i2 = i5 | 4;
                    obj9 = obj26;
                    obj16 = obj16;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 3:
                    obj8 = obj14;
                    obj9 = c.B(descriptor2, 3, ConfigPayload$GDPRSettings$$serializer.INSTANCE, obj13);
                    i2 = i5 | 8;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 4:
                    obj9 = obj13;
                    obj18 = c.B(descriptor2, 4, ConfigPayload$LoggingSettings$$serializer.INSTANCE, obj18);
                    i3 = i5 | 16;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 5:
                    obj9 = obj13;
                    obj11 = c.B(descriptor2, 5, ConfigPayload$CrashReportSettings$$serializer.INSTANCE, obj11);
                    i3 = i5 | 32;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 6:
                    obj9 = obj13;
                    obj19 = c.B(descriptor2, 6, ConfigPayload$ViewabilitySettings$$serializer.INSTANCE, obj19);
                    i3 = i5 | 64;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 7:
                    obj9 = obj13;
                    obj22 = c.B(descriptor2, 7, ConfigPayload$LoadOptimizationSettings$$serializer.INSTANCE, obj22);
                    i3 = i5 | 128;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 8:
                    obj9 = obj13;
                    obj12 = c.B(descriptor2, 8, ConfigPayload$ReportIncentivizedSettings$$serializer.INSTANCE, obj12);
                    i3 = i5 | UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 9:
                    obj9 = obj13;
                    obj21 = c.B(descriptor2, 9, rq.f4201a, obj21);
                    i3 = i5 | 512;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 10:
                    obj9 = obj13;
                    obj17 = c.B(descriptor2, 10, b23.f390a, obj17);
                    i3 = i5 | UserVerificationMethods.USER_VERIFY_ALL;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 11:
                    obj9 = obj13;
                    obj20 = c.B(descriptor2, 11, ConfigPayload$Template$$serializer.INSTANCE, obj20);
                    i3 = i5 | 2048;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 12:
                    obj9 = obj13;
                    obj15 = c.B(descriptor2, 12, ConfigPayload$LogMetricsSettings$$serializer.INSTANCE, obj15);
                    i4 = i5 | v.DEFAULT_BUFFER_SIZE;
                    i2 = i4;
                    obj10 = obj25;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 13:
                    obj9 = obj13;
                    obj16 = c.B(descriptor2, 13, ConfigPayload$Session$$serializer.INSTANCE, obj16);
                    i3 = i5 | 8192;
                    i2 = i3;
                    obj8 = obj14;
                    obj10 = obj25;
                    obj14 = obj8;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                case 14:
                    obj9 = obj13;
                    obj14 = c.B(descriptor2, 14, CleverCache$$serializer.INSTANCE, obj14);
                    i4 = i5 | Http2.INITIAL_MAX_FRAME_SIZE;
                    i2 = i4;
                    obj10 = obj25;
                    i5 = i2;
                    obj6 = obj20;
                    obj13 = obj9;
                    obj20 = obj6;
                default:
                    throw new eh3(j);
            }
        }
        Object obj27 = obj14;
        Object obj28 = obj15;
        Object obj29 = obj16;
        Object obj30 = obj13;
        c.a(descriptor2);
        return new ConfigPayload(i5, (ConfigPayload.Endpoints) obj23, (List) obj24, (ConfigPayload.ConfigSettings) obj10, (ConfigPayload.GDPRSettings) obj30, (ConfigPayload.LoggingSettings) obj18, (ConfigPayload.CrashReportSettings) obj11, (ConfigPayload.ViewabilitySettings) obj19, (ConfigPayload.LoadOptimizationSettings) obj22, (ConfigPayload.ReportIncentivizedSettings) obj12, (Boolean) obj21, (String) obj17, (ConfigPayload.Template) obj20, (ConfigPayload.LogMetricsSettings) obj28, (ConfigPayload.Session) obj29, (CleverCache) obj27, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload configPayload) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.write$Self(configPayload, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
