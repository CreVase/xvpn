package com.vungle.ads.internal.model;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
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
public final class AppNode$$serializer implements n51 {
    public static final AppNode$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        AppNode$$serializer appNode$$serializer = new AppNode$$serializer();
        INSTANCE = appNode$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.AppNode", appNode$$serializer, 3);
        f62Var.j("bundle", false);
        f62Var.j("ver", false);
        f62Var.j(FacebookMediationAdapter.KEY_ID, false);
        descriptor = f62Var;
    }

    private AppNode$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{b23Var, b23Var, b23Var};
    }

    @Override // defpackage.sk0
    public AppNode deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                str = c.o(descriptor2, 0);
                i |= 1;
            } else if (j == 1) {
                str2 = c.o(descriptor2, 1);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                str3 = c.o(descriptor2, 2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new AppNode(i, str, str2, str3, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, AppNode appNode) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        AppNode.write$Self(appNode, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
