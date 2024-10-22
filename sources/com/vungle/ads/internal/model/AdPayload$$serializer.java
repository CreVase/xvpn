package com.vungle.ads.internal.model;

import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ig;
import defpackage.ir0;
import defpackage.m71;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AdPayload$$serializer implements n51 {
    public static final AdPayload$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        AdPayload$$serializer adPayload$$serializer = new AdPayload$$serializer();
        INSTANCE = adPayload$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.AdPayload", adPayload$$serializer, 4);
        f62Var.j("ads", true);
        f62Var.j("mraidFiles", true);
        f62Var.j("incentivizedTextSettings", true);
        f62Var.j("assetsFullyDownloaded", true);
        descriptor = f62Var;
    }

    private AdPayload$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{t9.K(new ig(AdPayload$PlacementAdUnit$$serializer.INSTANCE, 0)), new m71(b23Var, b23Var, 1), new m71(b23Var, b23Var, 1), rq.f4201a};
    }

    @Override // defpackage.sk0
    public AdPayload deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                obj2 = c.B(descriptor2, 0, new ig(AdPayload$PlacementAdUnit$$serializer.INSTANCE, 0), obj2);
                i |= 1;
            } else if (j == 1) {
                b23 b23Var = b23.f390a;
                obj = c.t(descriptor2, 1, new m71(b23Var, b23Var, 1), obj);
                i |= 2;
            } else if (j == 2) {
                b23 b23Var2 = b23.f390a;
                obj3 = c.t(descriptor2, 2, new m71(b23Var2, b23Var2, 1), obj3);
                i |= 4;
            } else {
                if (j != 3) {
                    throw new eh3(j);
                }
                z2 = c.C(descriptor2, 3);
                i |= 8;
            }
        }
        c.a(descriptor2);
        return new AdPayload(i, (List) obj2, (Map) obj, (Map) obj3, z2, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, AdPayload adPayload) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        AdPayload.write$Self(adPayload, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
