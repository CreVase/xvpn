package com.vungle.ads.internal.model;

import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.GDPR;
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
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class CommonRequestBody$User$$serializer implements n51 {
    public static final CommonRequestBody$User$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        CommonRequestBody$User$$serializer commonRequestBody$User$$serializer = new CommonRequestBody$User$$serializer();
        INSTANCE = commonRequestBody$User$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.CommonRequestBody.User", commonRequestBody$User$$serializer, 3);
        f62Var.j(GDPR.GDPR_STANDARD, true);
        f62Var.j("ccpa", true);
        f62Var.j(COPPA.COPPA_STANDARD, true);
        descriptor = f62Var;
    }

    private CommonRequestBody$User$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{t9.K(CommonRequestBody$GDPR$$serializer.INSTANCE), t9.K(CommonRequestBody$CCPA$$serializer.INSTANCE), t9.K(CommonRequestBody$COPPA$$serializer.INSTANCE)};
    }

    @Override // defpackage.sk0
    public CommonRequestBody.User deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                obj3 = c.B(descriptor2, 0, CommonRequestBody$GDPR$$serializer.INSTANCE, obj3);
                i |= 1;
            } else if (j == 1) {
                obj = c.B(descriptor2, 1, CommonRequestBody$CCPA$$serializer.INSTANCE, obj);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                obj2 = c.B(descriptor2, 2, CommonRequestBody$COPPA$$serializer.INSTANCE, obj2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new CommonRequestBody.User(i, (CommonRequestBody.GDPR) obj3, (CommonRequestBody.CCPA) obj, (CommonRequestBody.COPPA) obj2, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, CommonRequestBody.User user) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        CommonRequestBody.User.write$Self(user, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
