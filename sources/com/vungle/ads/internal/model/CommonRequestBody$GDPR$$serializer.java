package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.CommonRequestBody;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.jo1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class CommonRequestBody$GDPR$$serializer implements n51 {
    public static final CommonRequestBody$GDPR$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        CommonRequestBody$GDPR$$serializer commonRequestBody$GDPR$$serializer = new CommonRequestBody$GDPR$$serializer();
        INSTANCE = commonRequestBody$GDPR$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.CommonRequestBody.GDPR", commonRequestBody$GDPR$$serializer, 4);
        f62Var.j("consent_status", false);
        f62Var.j("consent_source", false);
        f62Var.j("consent_timestamp", false);
        f62Var.j("consent_message_version", false);
        descriptor = f62Var;
    }

    private CommonRequestBody$GDPR$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{b23Var, b23Var, jo1.f2800a, b23Var};
    }

    @Override // defpackage.sk0
    public CommonRequestBody.GDPR deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        boolean z = true;
        int i = 0;
        while (z) {
            int j2 = c.j(descriptor2);
            if (j2 == -1) {
                z = false;
            } else if (j2 == 0) {
                str = c.o(descriptor2, 0);
                i |= 1;
            } else if (j2 == 1) {
                str2 = c.o(descriptor2, 1);
                i |= 2;
            } else if (j2 == 2) {
                j = c.H(descriptor2, 2);
                i |= 4;
            } else {
                if (j2 != 3) {
                    throw new eh3(j2);
                }
                str3 = c.o(descriptor2, 3);
                i |= 8;
            }
        }
        c.a(descriptor2);
        return new CommonRequestBody.GDPR(i, str, str2, j, str3, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, CommonRequestBody.GDPR gdpr) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        CommonRequestBody.GDPR.write$Self(gdpr, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
