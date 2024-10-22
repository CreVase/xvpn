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
public final class ConfigPayload$Session$$serializer implements n51 {
    public static final ConfigPayload$Session$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$Session$$serializer configPayload$Session$$serializer = new ConfigPayload$Session$$serializer();
        INSTANCE = configPayload$Session$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.Session", configPayload$Session$$serializer, 3);
        f62Var.j("enabled", false);
        f62Var.j("limit", false);
        f62Var.j("timeout", false);
        descriptor = f62Var;
    }

    private ConfigPayload$Session$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        ld1 ld1Var = ld1.f3105a;
        return new uh1[]{rq.f4201a, ld1Var, ld1Var};
    }

    @Override // defpackage.sk0
    public ConfigPayload.Session deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
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
                i3 = c.u(descriptor2, 2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.Session(i, z2, i2, i3, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.Session session) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.Session.write$Self(session, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
