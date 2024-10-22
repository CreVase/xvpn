package com.vungle.ads.internal.model;

import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.jo1;
import defpackage.ld1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class CleverCache$$serializer implements n51 {
    public static final CleverCache$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        CleverCache$$serializer cleverCache$$serializer = new CleverCache$$serializer();
        INSTANCE = cleverCache$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.CleverCache", cleverCache$$serializer, 3);
        f62Var.j("enabled", true);
        f62Var.j("disk_size", true);
        f62Var.j("disk_percentage", true);
        descriptor = f62Var;
    }

    private CleverCache$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{t9.K(rq.f4201a), t9.K(jo1.f2800a), t9.K(ld1.f3105a)};
    }

    @Override // defpackage.sk0
    public CleverCache deserialize(qe0 qe0Var) {
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
                obj3 = c.B(descriptor2, 0, rq.f4201a, obj3);
                i |= 1;
            } else if (j == 1) {
                obj = c.B(descriptor2, 1, jo1.f2800a, obj);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                obj2 = c.B(descriptor2, 2, ld1.f3105a, obj2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new CleverCache(i, (Boolean) obj3, (Long) obj, (Integer) obj2, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, CleverCache cleverCache) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        CleverCache.write$Self(cleverCache, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
