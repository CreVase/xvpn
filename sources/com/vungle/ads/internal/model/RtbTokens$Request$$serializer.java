package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.RtbTokens;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ig;
import defpackage.ir0;
import defpackage.ld1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;
import java.util.List;

/* loaded from: classes2.dex */
public final class RtbTokens$Request$$serializer implements n51 {
    public static final RtbTokens$Request$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        RtbTokens$Request$$serializer rtbTokens$Request$$serializer = new RtbTokens$Request$$serializer();
        INSTANCE = rtbTokens$Request$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.RtbTokens.Request", rtbTokens$Request$$serializer, 4);
        f62Var.j(Cookie.CONFIG_EXTENSION, false);
        f62Var.j("ordinal_view", false);
        f62Var.j("sdk_user_agent", false);
        f62Var.j("precached_tokens", true);
        descriptor = f62Var;
    }

    private RtbTokens$Request$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{t9.K(b23Var), ld1.f3105a, b23Var, new ig(b23Var, 0)};
    }

    @Override // defpackage.sk0
    public RtbTokens.Request deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        String str = null;
        int i = 0;
        boolean z = true;
        int i2 = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                obj2 = c.B(descriptor2, 0, b23.f390a, obj2);
                i |= 1;
            } else if (j == 1) {
                i2 = c.u(descriptor2, 1);
                i |= 2;
            } else if (j == 2) {
                str = c.o(descriptor2, 2);
                i |= 4;
            } else {
                if (j != 3) {
                    throw new eh3(j);
                }
                obj = c.t(descriptor2, 3, new ig(b23.f390a, 0), obj);
                i |= 8;
            }
        }
        c.a(descriptor2);
        return new RtbTokens.Request(i, (String) obj2, i2, str, (List) obj, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, RtbTokens.Request request) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        RtbTokens.Request.write$Self(request, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
