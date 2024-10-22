package com.vungle.ads.internal.model;

import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.GDPR;
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
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class RtbTokens$Consent$$serializer implements n51 {
    public static final RtbTokens$Consent$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        RtbTokens$Consent$$serializer rtbTokens$Consent$$serializer = new RtbTokens$Consent$$serializer();
        INSTANCE = rtbTokens$Consent$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.RtbTokens.Consent", rtbTokens$Consent$$serializer, 3);
        f62Var.j("ccpa", false);
        f62Var.j(GDPR.GDPR_STANDARD, false);
        f62Var.j(COPPA.COPPA_STANDARD, false);
        descriptor = f62Var;
    }

    private RtbTokens$Consent$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{RtbTokens$CCPA$$serializer.INSTANCE, RtbTokens$GDPR$$serializer.INSTANCE, RtbTokens$COPPA$$serializer.INSTANCE};
    }

    @Override // defpackage.sk0
    public RtbTokens.Consent deserialize(qe0 qe0Var) {
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
                obj3 = c.t(descriptor2, 0, RtbTokens$CCPA$$serializer.INSTANCE, obj3);
                i |= 1;
            } else if (j == 1) {
                obj = c.t(descriptor2, 1, RtbTokens$GDPR$$serializer.INSTANCE, obj);
                i |= 2;
            } else {
                if (j != 2) {
                    throw new eh3(j);
                }
                obj2 = c.t(descriptor2, 2, RtbTokens$COPPA$$serializer.INSTANCE, obj2);
                i |= 4;
            }
        }
        c.a(descriptor2);
        return new RtbTokens.Consent(i, (RtbTokens.CCPA) obj3, (RtbTokens.GDPR) obj, (RtbTokens.COPPA) obj2, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, RtbTokens.Consent consent) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        RtbTokens.Consent.write$Self(consent, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
