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
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class ConfigPayload$ConfigSettings$$serializer implements n51 {
    public static final ConfigPayload$ConfigSettings$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$ConfigSettings$$serializer configPayload$ConfigSettings$$serializer = new ConfigPayload$ConfigSettings$$serializer();
        INSTANCE = configPayload$ConfigSettings$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.ConfigSettings", configPayload$ConfigSettings$$serializer, 1);
        f62Var.j("refresh_time", false);
        descriptor = f62Var;
    }

    private ConfigPayload$ConfigSettings$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{ld1.f3105a};
    }

    @Override // defpackage.sk0
    public ConfigPayload.ConfigSettings deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else {
                if (j != 0) {
                    throw new eh3(j);
                }
                i2 = c.u(descriptor2, 0);
                i |= 1;
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.ConfigSettings(i, i2, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.ConfigSettings configSettings) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        c.x(0, configSettings.refreshTime, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
