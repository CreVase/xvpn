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

/* loaded from: classes2.dex */
public final class ConfigPayload$Template$$serializer implements n51 {
    public static final ConfigPayload$Template$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$Template$$serializer configPayload$Template$$serializer = new ConfigPayload$Template$$serializer();
        INSTANCE = configPayload$Template$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.Template", configPayload$Template$$serializer, 1);
        f62Var.j("heartbeat_check_enabled", false);
        descriptor = f62Var;
    }

    private ConfigPayload$Template$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{rq.f4201a};
    }

    @Override // defpackage.sk0
    public ConfigPayload.Template deserialize(qe0 qe0Var) {
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
        return new ConfigPayload.Template(i, z2, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.Template template) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        c.n(descriptor2, 0, template.heartbeatEnabled);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
