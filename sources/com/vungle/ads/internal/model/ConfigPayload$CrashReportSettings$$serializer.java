package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.ld1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.rq;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class ConfigPayload$CrashReportSettings$$serializer implements n51 {
    public static final ConfigPayload$CrashReportSettings$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$CrashReportSettings$$serializer configPayload$CrashReportSettings$$serializer = new ConfigPayload$CrashReportSettings$$serializer();
        INSTANCE = configPayload$CrashReportSettings$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.CrashReportSettings", configPayload$CrashReportSettings$$serializer, 3);
        f62Var.j("enabled", true);
        f62Var.j("max_send_amount", false);
        f62Var.j("collect_filter", false);
        descriptor = f62Var;
    }

    private ConfigPayload$CrashReportSettings$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{rq.f4201a, ld1.f3105a, b23.f390a};
    }

    @Override // defpackage.sk0
    public ConfigPayload.CrashReportSettings deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        String str = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                z2 = c.C(descriptor2, 0);
                i |= 1;
            } else if (j == 1) {
                i2 = c.u(descriptor2, 1);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                str = c.o(descriptor2, 2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.CrashReportSettings(i, z2, i2, str, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.CrashReportSettings crashReportSettings) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.CrashReportSettings.write$Self(crashReportSettings, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
