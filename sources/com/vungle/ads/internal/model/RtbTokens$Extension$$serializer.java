package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.RtbTokens;
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
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class RtbTokens$Extension$$serializer implements n51 {
    public static final RtbTokens$Extension$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        RtbTokens$Extension$$serializer rtbTokens$Extension$$serializer = new RtbTokens$Extension$$serializer();
        INSTANCE = rtbTokens$Extension$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.RtbTokens.Extension", rtbTokens$Extension$$serializer, 3);
        f62Var.j("is_sideload_enabled", false);
        f62Var.j("sd_card_available", false);
        f62Var.j("sound_enabled", false);
        descriptor = f62Var;
    }

    private RtbTokens$Extension$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        rq rqVar = rq.f4201a;
        return new uh1[]{rqVar, rqVar, rqVar};
    }

    @Override // defpackage.sk0
    public RtbTokens.Extension deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else if (j == 0) {
                z2 = c.C(descriptor2, 0);
                i |= 1;
            } else if (j == 1) {
                z3 = c.C(descriptor2, 1);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                z4 = c.C(descriptor2, 2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new RtbTokens.Extension(i, z2, z3, z4, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, RtbTokens.Extension extension) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        RtbTokens.Extension.write$Self(extension, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
