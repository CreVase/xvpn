package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.AdPayload;
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
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class AdPayload$ViewabilityInfo$$serializer implements n51 {
    public static final AdPayload$ViewabilityInfo$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        AdPayload$ViewabilityInfo$$serializer adPayload$ViewabilityInfo$$serializer = new AdPayload$ViewabilityInfo$$serializer();
        INSTANCE = adPayload$ViewabilityInfo$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.AdPayload.ViewabilityInfo", adPayload$ViewabilityInfo$$serializer, 2);
        f62Var.j("is_enabled", true);
        f62Var.j("extra_vast", true);
        descriptor = f62Var;
    }

    private AdPayload$ViewabilityInfo$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{t9.K(rq.f4201a), t9.K(b23.f390a)};
    }

    @Override // defpackage.sk0
    public AdPayload.ViewabilityInfo deserialize(qe0 qe0Var) {
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
                obj2 = c.B(descriptor2, 0, rq.f4201a, obj2);
                i |= 1;
            } else {
                if (j != 1) {
                    throw new eh3(j);
                }
                obj = c.B(descriptor2, 1, b23.f390a, obj);
                i |= 2;
            }
        }
        c.a(descriptor2);
        return new AdPayload.ViewabilityInfo(i, (Boolean) obj2, (String) obj, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, AdPayload.ViewabilityInfo viewabilityInfo) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        AdPayload.ViewabilityInfo.write$Self(viewabilityInfo, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
