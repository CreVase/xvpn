package com.vungle.ads.internal.model;

import com.facebook.ads.AdSDKNotificationListener;
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
import java.util.List;

/* loaded from: classes2.dex */
public final class BidPayload$$serializer implements n51 {
    public static final BidPayload$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        BidPayload$$serializer bidPayload$$serializer = new BidPayload$$serializer();
        INSTANCE = bidPayload$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.BidPayload", bidPayload$$serializer, 4);
        f62Var.j("version", true);
        f62Var.j("adunit", true);
        f62Var.j(AdSDKNotificationListener.IMPRESSION_EVENT, true);
        f62Var.j("ad", true);
        descriptor = f62Var;
    }

    private BidPayload$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{t9.K(ld1.f3105a), t9.K(b23Var), t9.K(new ig(b23Var, 0)), t9.K(AdPayload$$serializer.INSTANCE)};
    }

    @Override // defpackage.sk0
    public BidPayload deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        boolean z = true;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                obj4 = c.B(descriptor2, 0, ld1.f3105a, obj4);
                i |= 1;
            } else if (j == 1) {
                obj = c.B(descriptor2, 1, b23.f390a, obj);
                i |= 2;
            } else if (j == 2) {
                obj2 = c.B(descriptor2, 2, new ig(b23.f390a, 0), obj2);
                i |= 4;
            } else {
                if (j != 3) {
                    throw new eh3(j);
                }
                obj3 = c.B(descriptor2, 3, AdPayload$$serializer.INSTANCE, obj3);
                i |= 8;
            }
        }
        c.a(descriptor2);
        return new BidPayload(i, (Integer) obj4, (String) obj, (List) obj2, (AdPayload) obj3, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, BidPayload bidPayload) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        BidPayload.write$Self(bidPayload, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
