package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.RtbTokens;
import com.vungle.ads.internal.ui.AdActivity;
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
public final class RtbTokens$$serializer implements n51 {
    public static final RtbTokens$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        RtbTokens$$serializer rtbTokens$$serializer = new RtbTokens$$serializer();
        INSTANCE = rtbTokens$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.RtbTokens", rtbTokens$$serializer, 3);
        f62Var.j("device", false);
        f62Var.j(AdActivity.REQUEST_KEY_EXTRA, false);
        f62Var.j("consent", false);
        descriptor = f62Var;
    }

    private RtbTokens$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{RtbTokens$Device$$serializer.INSTANCE, RtbTokens$Request$$serializer.INSTANCE, RtbTokens$Consent$$serializer.INSTANCE};
    }

    @Override // defpackage.sk0
    public RtbTokens deserialize(qe0 qe0Var) {
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
                obj3 = c.t(descriptor2, 0, RtbTokens$Device$$serializer.INSTANCE, obj3);
                i |= 1;
            } else if (j == 1) {
                obj = c.t(descriptor2, 1, RtbTokens$Request$$serializer.INSTANCE, obj);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                obj2 = c.t(descriptor2, 2, RtbTokens$Consent$$serializer.INSTANCE, obj2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new RtbTokens(i, (RtbTokens.Device) obj3, (RtbTokens.Request) obj, (RtbTokens.Consent) obj2, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, RtbTokens rtbTokens) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        RtbTokens.write$Self(rtbTokens, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
