package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.CommonRequestBody;
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
import defpackage.t9;
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class CommonRequestBody$COPPA$$serializer implements n51 {
    public static final CommonRequestBody$COPPA$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        CommonRequestBody$COPPA$$serializer commonRequestBody$COPPA$$serializer = new CommonRequestBody$COPPA$$serializer();
        INSTANCE = commonRequestBody$COPPA$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.CommonRequestBody.COPPA", commonRequestBody$COPPA$$serializer, 1);
        f62Var.j(Cookie.COPPA_STATUS_KEY, false);
        descriptor = f62Var;
    }

    private CommonRequestBody$COPPA$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{t9.K(rq.f4201a)};
    }

    @Override // defpackage.sk0
    public CommonRequestBody.COPPA deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        Object obj = null;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else {
                if (j != 0) {
                    throw new eh3(j);
                }
                obj = c.B(descriptor2, 0, rq.f4201a, obj);
                i |= 1;
            }
        }
        c.a(descriptor2);
        return new CommonRequestBody.COPPA(i, (Boolean) obj, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, CommonRequestBody.COPPA coppa) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        c.A(descriptor2, 0, rq.f4201a, coppa.isCoppa);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
