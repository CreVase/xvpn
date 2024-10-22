package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.ConfigPayload;
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
import defpackage.uh1;

/* loaded from: classes2.dex */
public final class ConfigPayload$GDPRSettings$$serializer implements n51 {
    public static final ConfigPayload$GDPRSettings$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        ConfigPayload$GDPRSettings$$serializer configPayload$GDPRSettings$$serializer = new ConfigPayload$GDPRSettings$$serializer();
        INSTANCE = configPayload$GDPRSettings$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.ConfigPayload.GDPRSettings", configPayload$GDPRSettings$$serializer, 6);
        f62Var.j("is_country_data_protected", false);
        f62Var.j("consent_title", false);
        f62Var.j("consent_message", false);
        f62Var.j("consent_message_version", false);
        f62Var.j("button_accept", false);
        f62Var.j("button_deny", false);
        descriptor = f62Var;
    }

    private ConfigPayload$GDPRSettings$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        return new uh1[]{rq.f4201a, b23Var, b23Var, b23Var, b23Var, b23Var};
    }

    @Override // defpackage.sk0
    public ConfigPayload.GDPRSettings deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        while (z) {
            int j = c.j(descriptor2);
            switch (j) {
                case -1:
                    z = false;
                    break;
                case 0:
                    z2 = c.C(descriptor2, 0);
                    i |= 1;
                    break;
                case 1:
                    i |= 2;
                    str = c.o(descriptor2, 1);
                    break;
                case 2:
                    i |= 4;
                    str2 = c.o(descriptor2, 2);
                    break;
                case 3:
                    i |= 8;
                    str3 = c.o(descriptor2, 3);
                    break;
                case 4:
                    i |= 16;
                    str4 = c.o(descriptor2, 4);
                    break;
                case 5:
                    i |= 32;
                    str5 = c.o(descriptor2, 5);
                    break;
                default:
                    throw new eh3(j);
            }
        }
        c.a(descriptor2);
        return new ConfigPayload.GDPRSettings(i, z2, str, str2, str3, str4, str5, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, ConfigPayload.GDPRSettings gDPRSettings) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        ConfigPayload.GDPRSettings.write$Self(gDPRSettings, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
