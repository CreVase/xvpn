package com.vungle.ads.internal.model;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
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
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;
import java.util.List;

/* loaded from: classes2.dex */
public final class Placement$$serializer implements n51 {
    public static final Placement$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        Placement$$serializer placement$$serializer = new Placement$$serializer();
        INSTANCE = placement$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.Placement", placement$$serializer, 10);
        f62Var.j(FacebookMediationAdapter.KEY_ID, false);
        f62Var.j("reference_id", false);
        f62Var.j("is_incentivized", true);
        f62Var.j("supported_template_types", true);
        f62Var.j("supported_ad_formats", true);
        f62Var.j("ad_refresh_duration", true);
        f62Var.j("header_bidding", true);
        f62Var.j("ad_size", true);
        f62Var.j("isIncentivized", true);
        f62Var.j("placementAdType", true);
        descriptor = f62Var;
    }

    private Placement$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        rq rqVar = rq.f4201a;
        return new uh1[]{b23Var, b23Var, t9.K(rqVar), new ig(b23Var, 0), new ig(b23Var, 0), ld1.f3105a, rqVar, t9.K(b23Var), rqVar, b23Var};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    @Override // defpackage.sk0
    public Placement deserialize(qe0 qe0Var) {
        int i;
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        String str = null;
        Object obj4 = null;
        String str2 = null;
        String str3 = null;
        int i2 = 0;
        boolean z = true;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (z) {
            int j = c.j(descriptor2);
            switch (j) {
                case -1:
                    z = false;
                case 0:
                    str = c.o(descriptor2, 0);
                    i2 |= 1;
                case 1:
                    str2 = c.o(descriptor2, 1);
                    i2 |= 2;
                case 2:
                    obj4 = c.B(descriptor2, 2, rq.f4201a, obj4);
                    i = i2 | 4;
                    i2 = i;
                case 3:
                    obj3 = c.t(descriptor2, 3, new ig(b23.f390a, 0), obj3);
                    i = i2 | 8;
                    i2 = i;
                case 4:
                    obj2 = c.t(descriptor2, 4, new ig(b23.f390a, 0), obj2);
                    i = i2 | 16;
                    i2 = i;
                case 5:
                    i3 = c.u(descriptor2, 5);
                    i = i2 | 32;
                    i2 = i;
                case 6:
                    z2 = c.C(descriptor2, 6);
                    i = i2 | 64;
                    i2 = i;
                case 7:
                    i2 |= 128;
                    obj = c.B(descriptor2, 7, b23.f390a, obj);
                case 8:
                    z3 = c.C(descriptor2, 8);
                    i2 |= UserVerificationMethods.USER_VERIFY_HANDPRINT;
                case 9:
                    i2 |= 512;
                    str3 = c.o(descriptor2, 9);
                default:
                    throw new eh3(j);
            }
        }
        c.a(descriptor2);
        return new Placement(i2, str, str2, (Boolean) obj4, (List) obj3, (List) obj2, i3, z2, (String) obj, z3, str3, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, Placement placement) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        Placement.write$Self(placement, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
