package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.CommonRequestBody;
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
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class CommonRequestBody$CCPA$$serializer implements n51 {
    public static final CommonRequestBody$CCPA$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        CommonRequestBody$CCPA$$serializer commonRequestBody$CCPA$$serializer = new CommonRequestBody$CCPA$$serializer();
        INSTANCE = commonRequestBody$CCPA$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.CommonRequestBody.CCPA", commonRequestBody$CCPA$$serializer, 1);
        f62Var.j("status", false);
        descriptor = f62Var;
    }

    private CommonRequestBody$CCPA$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{b23.f390a};
    }

    @Override // defpackage.sk0
    public CommonRequestBody.CCPA deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        String str = null;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else {
                if (j != 0) {
                    throw new eh3(j);
                }
                str = c.o(descriptor2, 0);
                i |= 1;
            }
        }
        c.a(descriptor2);
        return new CommonRequestBody.CCPA(i, str, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, CommonRequestBody.CCPA ccpa) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        c.o(0, ccpa.status, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
