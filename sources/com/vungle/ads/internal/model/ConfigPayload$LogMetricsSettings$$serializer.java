package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
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

/* loaded from: classes2.dex */
public final class ConfigPayload$LogMetricsSettings$$serializer implements n51 {
    public static final ConfigPayload$LogMetricsSettings$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$LogMetricsSettings$$serializer configPayload$LogMetricsSettings$$serializer = new ConfigPayload$LogMetricsSettings$$serializer();
        INSTANCE = configPayload$LogMetricsSettings$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.LogMetricsSettings", configPayload$LogMetricsSettings$$serializer, 2);
        f62Var.j("error_log_level", false);
        f62Var.j("metrics_is_enabled", false);
        descriptor = f62Var;
    }

    private ConfigPayload$LogMetricsSettings$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{ld1.f3105a, rq.f4201a};
    }

    @Override // defpackage.sk0
    public ConfigPayload.LogMetricsSettings deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        boolean z2 = false;
        int i = 0;
        int i2 = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                i2 = c.u(descriptor2, 0);
                i |= 1;
            } else {
                if (j != 1) {
                    throw new eh3(j);
                }
                z2 = c.C(descriptor2, 1);
                i |= 2;
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.LogMetricsSettings(i, i2, z2, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.LogMetricsSettings logMetricsSettings) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.LogMetricsSettings.write$Self(logMetricsSettings, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
