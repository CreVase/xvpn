package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import com.vungle.ads.internal.model.DeviceNode;
import defpackage.b23;
import defpackage.cp3;
import defpackage.cz0;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.jo1;
import defpackage.ld1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.rq;
import defpackage.t9;
import defpackage.uh1;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public final class DeviceNode$AndroidAmazonExt$$serializer implements n51 {
    public static final DeviceNode$AndroidAmazonExt$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        DeviceNode$AndroidAmazonExt$$serializer deviceNode$AndroidAmazonExt$$serializer = new DeviceNode$AndroidAmazonExt$$serializer();
        INSTANCE = deviceNode$AndroidAmazonExt$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.DeviceNode.AndroidAmazonExt", deviceNode$AndroidAmazonExt$$serializer, 20);
        f62Var.j("android_id", true);
        f62Var.j("is_google_play_services_available", true);
        f62Var.j("app_set_id", true);
        f62Var.j("battery_level", true);
        f62Var.j("battery_state", true);
        f62Var.j("battery_saver_enabled", true);
        f62Var.j("connection_type", true);
        f62Var.j("connection_type_detail", true);
        f62Var.j("locale", true);
        f62Var.j("language", true);
        f62Var.j("time_zone", true);
        f62Var.j("volume_level", true);
        f62Var.j("sound_enabled", true);
        f62Var.j("storage_bytes_available", true);
        f62Var.j("is_tv", true);
        f62Var.j("sd_card_available", true);
        f62Var.j("is_sideload_enabled", true);
        f62Var.j("os_name", true);
        f62Var.j("gaid", true);
        f62Var.j("amazonAdvertisingId", true);
        descriptor = f62Var;
    }

    private DeviceNode$AndroidAmazonExt$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        rq rqVar = rq.f4201a;
        cz0 cz0Var = cz0.f1704a;
        ld1 ld1Var = ld1.f3105a;
        return new uh1[]{t9.K(b23Var), rqVar, t9.K(b23Var), cz0Var, t9.K(b23Var), ld1Var, t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), t9.K(b23Var), cz0Var, ld1Var, jo1.f2800a, rqVar, ld1Var, rqVar, t9.K(b23Var), t9.K(b23Var), t9.K(b23Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0035. Please report as an issue. */
    @Override // defpackage.sk0
    public DeviceNode.AndroidAmazonExt deserialize(qe0 qe0Var) {
        float f;
        int i;
        int i2;
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        long j = 0;
        int i3 = 0;
        float f2 = 0.0f;
        boolean z = true;
        boolean z2 = false;
        int i4 = 0;
        float f3 = 0.0f;
        int i5 = 0;
        boolean z3 = false;
        int i6 = 0;
        boolean z4 = false;
        Object obj10 = null;
        Object obj11 = null;
        while (z) {
            int j2 = c.j(descriptor2);
            switch (j2) {
                case -1:
                    f2 = f2;
                    z = false;
                case 0:
                    f = f2;
                    obj2 = c.B(descriptor2, 0, b23.f390a, obj2);
                    i = i3 | 1;
                    i3 = i;
                    f2 = f;
                case 1:
                    f = f2;
                    z2 = c.C(descriptor2, 1);
                    i = i3 | 2;
                    i3 = i;
                    f2 = f;
                case 2:
                    f = f2;
                    obj11 = c.B(descriptor2, 2, b23.f390a, obj11);
                    i = i3 | 4;
                    i3 = i;
                    f2 = f;
                case 3:
                    i = i3 | 8;
                    f = c.i(descriptor2, 3);
                    i3 = i;
                    f2 = f;
                case 4:
                    f = f2;
                    obj7 = c.B(descriptor2, 4, b23.f390a, obj7);
                    i = i3 | 16;
                    i3 = i;
                    f2 = f;
                case 5:
                    f = f2;
                    i4 = c.u(descriptor2, 5);
                    i = i3 | 32;
                    i3 = i;
                    f2 = f;
                case 6:
                    f = f2;
                    obj8 = c.B(descriptor2, 6, b23.f390a, obj8);
                    i = i3 | 64;
                    i3 = i;
                    f2 = f;
                case 7:
                    f = f2;
                    obj4 = c.B(descriptor2, 7, b23.f390a, obj4);
                    i = i3 | 128;
                    i3 = i;
                    f2 = f;
                case 8:
                    f = f2;
                    obj3 = c.B(descriptor2, 8, b23.f390a, obj3);
                    i = i3 | UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    i3 = i;
                    f2 = f;
                case 9:
                    f = f2;
                    obj5 = c.B(descriptor2, 9, b23.f390a, obj5);
                    i = i3 | 512;
                    i3 = i;
                    f2 = f;
                case 10:
                    f = f2;
                    obj10 = c.B(descriptor2, 10, b23.f390a, obj10);
                    i = i3 | UserVerificationMethods.USER_VERIFY_ALL;
                    i3 = i;
                    f2 = f;
                case 11:
                    f = f2;
                    f3 = c.i(descriptor2, 11);
                    i = i3 | 2048;
                    i3 = i;
                    f2 = f;
                case 12:
                    f = f2;
                    i5 = c.u(descriptor2, 12);
                    i = i3 | v.DEFAULT_BUFFER_SIZE;
                    i3 = i;
                    f2 = f;
                case 13:
                    f = f2;
                    j = c.H(descriptor2, 13);
                    i = i3 | 8192;
                    i3 = i;
                    f2 = f;
                case 14:
                    f = f2;
                    z3 = c.C(descriptor2, 14);
                    i = i3 | Http2.INITIAL_MAX_FRAME_SIZE;
                    i3 = i;
                    f2 = f;
                case 15:
                    f = f2;
                    i6 = c.u(descriptor2, 15);
                    i2 = 32768;
                    i = i2 | i3;
                    i3 = i;
                    f2 = f;
                case 16:
                    f = f2;
                    z4 = c.C(descriptor2, 16);
                    i2 = 65536;
                    i = i2 | i3;
                    i3 = i;
                    f2 = f;
                case 17:
                    f = f2;
                    obj = c.B(descriptor2, 17, b23.f390a, obj);
                    i2 = 131072;
                    i = i2 | i3;
                    i3 = i;
                    f2 = f;
                case 18:
                    f = f2;
                    obj9 = c.B(descriptor2, 18, b23.f390a, obj9);
                    i2 = 262144;
                    i = i2 | i3;
                    i3 = i;
                    f2 = f;
                case 19:
                    f = f2;
                    i3 |= 524288;
                    obj6 = c.B(descriptor2, 19, b23.f390a, obj6);
                    f2 = f;
                default:
                    throw new eh3(j2);
            }
        }
        c.a(descriptor2);
        return new DeviceNode.AndroidAmazonExt(i3, (String) obj2, z2, (String) obj11, f2, (String) obj7, i4, (String) obj8, (String) obj4, (String) obj3, (String) obj5, (String) obj10, f3, i5, j, z3, i6, z4, (String) obj, (String) obj9, (String) obj6, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, DeviceNode.AndroidAmazonExt androidAmazonExt) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        DeviceNode.AndroidAmazonExt.write$Self(androidAmazonExt, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
