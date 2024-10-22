package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.AdPayload;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.m71;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AdPayload$TemplateSettings$$serializer implements n51 {
    public static final AdPayload$TemplateSettings$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        AdPayload$TemplateSettings$$serializer adPayload$TemplateSettings$$serializer = new AdPayload$TemplateSettings$$serializer();
        INSTANCE = adPayload$TemplateSettings$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.AdPayload.TemplateSettings", adPayload$TemplateSettings$$serializer, 2);
        f62Var.j("normal_replacements", true);
        f62Var.j("cacheable_replacements", true);
        descriptor = f62Var;
    }

    private AdPayload$TemplateSettings$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{t9.K(new m71(b23Var, b23Var, 1)), t9.K(new m71(b23Var, AdPayload$CacheableReplacement$$serializer.INSTANCE, 1))};
    }

    @Override // defpackage.sk0
    public AdPayload.TemplateSettings deserialize(qe0 qe0Var) {
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
                b23 b23Var = b23.f390a;
                obj2 = c.B(descriptor2, 0, new m71(b23Var, b23Var, 1), obj2);
                i |= 1;
            } else {
                if (j != 1) {
                    throw new eh3(j);
                }
                obj = c.B(descriptor2, 1, new m71(b23.f390a, AdPayload$CacheableReplacement$$serializer.INSTANCE, 1), obj);
                i |= 2;
            }
        }
        c.a(descriptor2);
        return new AdPayload.TemplateSettings(i, (Map) obj2, (Map) obj, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, AdPayload.TemplateSettings templateSettings) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        AdPayload.TemplateSettings.write$Self(templateSettings, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
