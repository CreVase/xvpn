package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class ConfigPayload$Endpoints$$serializer implements n51 {
    public static final ConfigPayload$Endpoints$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$Endpoints$$serializer configPayload$Endpoints$$serializer = new ConfigPayload$Endpoints$$serializer();
        INSTANCE = configPayload$Endpoints$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.Endpoints", configPayload$Endpoints$$serializer, 7);
        f62Var.j("new", true);
        f62Var.j("ads", true);
        f62Var.j("ri", true);
        f62Var.j("sdk_bi", true);
        f62Var.j("mraid_js", true);
        f62Var.j("metrics", true);
        f62Var.j("error_logs", true);
        descriptor = f62Var;
    }

    private ConfigPayload$Endpoints$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001e. Please report as an issue. */
    @Override // defpackage.sk0
    public ConfigPayload.Endpoints deserialize(qe0 qe0Var) {
        int i;
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int j = c.j(descriptor2);
            switch (j) {
                case -1:
                    z = false;
                case 0:
                    obj2 = c.B(descriptor2, 0, b23.f390a, obj2);
                    i = i2 | 1;
                    i2 = i;
                case 1:
                    obj3 = c.B(descriptor2, 1, b23.f390a, obj3);
                    i = i2 | 2;
                    i2 = i;
                case 2:
                    obj4 = c.B(descriptor2, 2, b23.f390a, obj4);
                    i = i2 | 4;
                    i2 = i;
                case 3:
                    obj5 = c.B(descriptor2, 3, b23.f390a, obj5);
                    i = i2 | 8;
                    i2 = i;
                case 4:
                    obj6 = c.B(descriptor2, 4, b23.f390a, obj6);
                    i = i2 | 16;
                    i2 = i;
                case 5:
                    obj7 = c.B(descriptor2, 5, b23.f390a, obj7);
                    i = i2 | 32;
                    i2 = i;
                case 6:
                    obj = c.B(descriptor2, 6, b23.f390a, obj);
                    i = i2 | 64;
                    i2 = i;
                default:
                    throw new eh3(j);
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.Endpoints(i2, (String) obj2, (String) obj3, (String) obj4, (String) obj5, (String) obj6, (String) obj7, (String) obj, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.Endpoints endpoints) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.Endpoints.write$Self(endpoints, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
