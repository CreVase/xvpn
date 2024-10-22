package com.vungle.ads.internal.bidding;

import com.vungle.ads.internal.bidding.BidTokenEncoder;
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
public final class BidTokenEncoder$AndroidInfo$$serializer implements n51 {
    public static final BidTokenEncoder$AndroidInfo$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        BidTokenEncoder$AndroidInfo$$serializer bidTokenEncoder$AndroidInfo$$serializer = new BidTokenEncoder$AndroidInfo$$serializer();
        INSTANCE = bidTokenEncoder$AndroidInfo$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.bidding.BidTokenEncoder.AndroidInfo", bidTokenEncoder$AndroidInfo$$serializer, 2);
        f62Var.j("android_id", true);
        f62Var.j("app_set_id", true);
        descriptor = f62Var;
    }

    private BidTokenEncoder$AndroidInfo$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{t9.K(b23Var), t9.K(b23Var)};
    }

    @Override // defpackage.sk0
    public BidTokenEncoder.AndroidInfo deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                obj = c.B(descriptor2, 0, b23.f390a, obj);
                i |= 1;
            } else {
                if (j != 1) {
                    throw new eh3(j);
                }
                obj2 = c.B(descriptor2, 1, b23.f390a, obj2);
                i |= 2;
            }
        }
        c.a(descriptor2);
        return new BidTokenEncoder.AndroidInfo(i, (String) obj, (String) obj2, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, BidTokenEncoder.AndroidInfo androidInfo) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        BidTokenEncoder.AndroidInfo.write$Self(androidInfo, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
