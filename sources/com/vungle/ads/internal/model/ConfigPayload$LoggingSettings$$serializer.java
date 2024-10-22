package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.rq;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class ConfigPayload$LoggingSettings$$serializer implements n51 {
    public static final ConfigPayload$LoggingSettings$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$LoggingSettings$$serializer configPayload$LoggingSettings$$serializer = new ConfigPayload$LoggingSettings$$serializer();
        INSTANCE = configPayload$LoggingSettings$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.LoggingSettings", configPayload$LoggingSettings$$serializer, 1);
        f62Var.j("enabled", true);
        descriptor = f62Var;
    }

    private ConfigPayload$LoggingSettings$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{rq.f4201a};
    }

    @Override // defpackage.sk0
    public ConfigPayload.LoggingSettings deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else {
                if (j != 0) {
                    throw new eh3(j);
                }
                z2 = c.C(descriptor2, 0);
                i |= 1;
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.LoggingSettings(i, z2, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.LoggingSettings loggingSettings) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.LoggingSettings.write$Self(loggingSettings, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
