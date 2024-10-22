package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.AdPayload;
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
public final class AdPayload$Viewability$$serializer implements n51 {
    public static final AdPayload$Viewability$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        AdPayload$Viewability$$serializer adPayload$Viewability$$serializer = new AdPayload$Viewability$$serializer();
        INSTANCE = adPayload$Viewability$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.AdPayload.Viewability", adPayload$Viewability$$serializer, 1);
        f62Var.j("om", true);
        descriptor = f62Var;
    }

    private AdPayload$Viewability$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{t9.K(AdPayload$ViewabilityInfo$$serializer.INSTANCE)};
    }

    @Override // defpackage.sk0
    public AdPayload.Viewability deserialize(qe0 qe0Var) {
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
                obj = c.B(descriptor2, 0, AdPayload$ViewabilityInfo$$serializer.INSTANCE, obj);
                i |= 1;
            }
        }
        c.a(descriptor2);
        return new AdPayload.Viewability(i, (AdPayload.ViewabilityInfo) obj, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, AdPayload.Viewability viewability) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        AdPayload.Viewability.write$Self(viewability, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
