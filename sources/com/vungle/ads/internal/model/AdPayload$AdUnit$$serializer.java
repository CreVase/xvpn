package com.vungle.ads.internal.model;

import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.vungle.ads.internal.model.AdPayload;
import defpackage.b23;
import defpackage.cp3;
import defpackage.f62;
import defpackage.g40;
import defpackage.ig;
import defpackage.ir0;
import defpackage.ld1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class AdPayload$AdUnit$$serializer implements n51 {
    public static final AdPayload$AdUnit$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        AdPayload$AdUnit$$serializer adPayload$AdUnit$$serializer = new AdPayload$AdUnit$$serializer();
        INSTANCE = adPayload$AdUnit$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.AdPayload.AdUnit", adPayload$AdUnit$$serializer, 24);
        f62Var.j(FacebookMediationAdapter.KEY_ID, true);
        f62Var.j("adType", true);
        f62Var.j("adSource", true);
        f62Var.j("campaign", true);
        f62Var.j("expiry", true);
        f62Var.j("app_id", true);
        f62Var.j("callToActionUrl", true);
        f62Var.j("deeplinkUrl", true);
        f62Var.j("click_coordinates_enabled", true);
        f62Var.j("tpat", true);
        f62Var.j("templateURL", true);
        f62Var.j("templateId", true);
        f62Var.j("template_type", true);
        f62Var.j("templateSettings", true);
        f62Var.j("bid_token", true);
        f62Var.j("ad_market_id", true);
        f62Var.j("info", true);
        f62Var.j("sleep", true);
        f62Var.j("viewability", true);
        f62Var.j("adExt", true);
        f62Var.j("notification", true);
        f62Var.j("timestamp", true);
        f62Var.j("showCloseIncentivized", true);
        f62Var.j("showClose", true);
        descriptor = f62Var;
    }

    private AdPayload$AdUnit$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        ld1 ld1Var = ld1.f3105a;
        return new uh1[]{t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(ld1Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(rq.f4201a), t9.K(AdPayload.TpatSerializer.INSTANCE), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(AdPayload$TemplateSettings$$serializer.INSTANCE), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(ld1Var), t9.K(AdPayload$Viewability$$serializer.INSTANCE), t9.K(b23Var), t9.K(new ig(b23Var, 0)), t9.K(ld1Var), t9.K(ld1Var), t9.K(ld1Var)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // defpackage.sk0
    public com.vungle.ads.internal.model.AdPayload.AdUnit deserialize(defpackage.qe0 r58) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.model.AdPayload$AdUnit$$serializer.deserialize(qe0):com.vungle.ads.internal.model.AdPayload$AdUnit");
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, AdPayload.AdUnit adUnit) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        AdPayload.AdUnit.write$Self(adUnit, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
