package com.vungle.ads.internal.model;

import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.bidding.BidTokenEncoder$AndroidInfo$$serializer;
import com.vungle.ads.internal.model.RtbTokens;
import defpackage.b23;
import defpackage.cp3;
import defpackage.cz0;
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

/* loaded from: classes2.dex */
public final class RtbTokens$Device$$serializer implements n51 {
    public static final RtbTokens$Device$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        RtbTokens$Device$$serializer rtbTokens$Device$$serializer = new RtbTokens$Device$$serializer();
        INSTANCE = rtbTokens$Device$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.RtbTokens.Device", rtbTokens$Device$$serializer, 8);
        f62Var.j("battery_saver_enabled", false);
        f62Var.j("time_zone", false);
        f62Var.j("volume_level", false);
        f62Var.j("ifa", false);
        f62Var.j("amazon", false);
        f62Var.j("android", false);
        f62Var.j("language", false);
        f62Var.j("extension", false);
        descriptor = f62Var;
    }

    private RtbTokens$Device$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        BidTokenEncoder$AndroidInfo$$serializer bidTokenEncoder$AndroidInfo$$serializer = BidTokenEncoder$AndroidInfo$$serializer.INSTANCE;
        return new uh1[]{rq.f4201a, b23Var, cz0.f1704a, t9.K(b23Var), t9.K(bidTokenEncoder$AndroidInfo$$serializer), t9.K(bidTokenEncoder$AndroidInfo$$serializer), b23Var, RtbTokens$Extension$$serializer.INSTANCE};
    }

    @Override // defpackage.sk0
    public RtbTokens.Device deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        String str = null;
        String str2 = null;
        int i = 0;
        boolean z = false;
        float f = 0.0f;
        boolean z2 = true;
        while (z2) {
            int j = c.j(descriptor2);
            switch (j) {
                case -1:
                    z2 = false;
                    break;
                case 0:
                    z = c.C(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    str = c.o(descriptor2, 1);
                    i |= 2;
                    break;
                case 2:
                    f = c.i(descriptor2, 2);
                    i |= 4;
                    break;
                case 3:
                    obj3 = c.B(descriptor2, 3, b23.f390a, obj3);
                    i |= 8;
                    break;
                case 4:
                    obj4 = c.B(descriptor2, 4, BidTokenEncoder$AndroidInfo$$serializer.INSTANCE, obj4);
                    i |= 16;
                    break;
                case 5:
                    obj2 = c.B(descriptor2, 5, BidTokenEncoder$AndroidInfo$$serializer.INSTANCE, obj2);
                    i |= 32;
                    break;
                case 6:
                    i |= 64;
                    str2 = c.o(descriptor2, 6);
                    break;
                case 7:
                    obj = c.t(descriptor2, 7, RtbTokens$Extension$$serializer.INSTANCE, obj);
                    i |= 128;
                    break;
                default:
                    throw new eh3(j);
            }
        }
        c.a(descriptor2);
        return new RtbTokens.Device(i, z, str, f, (String) obj3, (BidTokenEncoder.AndroidInfo) obj4, (BidTokenEncoder.AndroidInfo) obj2, str2, (RtbTokens.Extension) obj, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, RtbTokens.Device device) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        RtbTokens.Device.write$Self(device, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
