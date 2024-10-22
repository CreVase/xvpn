package com.vungle.ads.internal.model;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.model.DeviceNode;
import defpackage.b23;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.ld1;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class DeviceNode$$serializer implements n51 {
    public static final DeviceNode$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        DeviceNode$$serializer deviceNode$$serializer = new DeviceNode$$serializer();
        INSTANCE = deviceNode$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.DeviceNode", deviceNode$$serializer, 11);
        f62Var.j("make", false);
        f62Var.j("model", false);
        f62Var.j("osv", false);
        f62Var.j("carrier", true);
        f62Var.j("os", false);
        f62Var.j("w", false);
        f62Var.j("h", false);
        f62Var.j("ua", true);
        f62Var.j("ifa", true);
        f62Var.j("lmt", true);
        f62Var.j("ext", true);
        descriptor = f62Var;
    }

    private DeviceNode$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        b23 b23Var = b23.f390a;
        ld1 ld1Var = ld1.f3105a;
        return new uh1[]{b23Var, b23Var, b23Var, t9.K(b23Var), b23Var, ld1Var, ld1Var, t9.K(b23Var), t9.K(b23Var), t9.K(ld1Var), t9.K(DeviceNode$DeviceExt$$serializer.INSTANCE)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0021. Please report as an issue. */
    @Override // defpackage.sk0
    public DeviceNode deserialize(qe0 qe0Var) {
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
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i3 = 0;
        boolean z = true;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int j = c.j(descriptor2);
            switch (j) {
                case -1:
                    z = false;
                case 0:
                    str = c.o(descriptor2, 0);
                    i3 |= 1;
                case 1:
                    i3 |= 2;
                    str2 = c.o(descriptor2, 1);
                case 2:
                    i2 = i3 | 4;
                    str3 = c.o(descriptor2, 2);
                    i3 = i2;
                case 3:
                    i2 = i3 | 8;
                    obj4 = c.B(descriptor2, 3, b23.f390a, obj4);
                    i3 = i2;
                case 4:
                    str4 = c.o(descriptor2, 4);
                    i3 |= 16;
                case 5:
                    i4 = c.u(descriptor2, 5);
                    i3 |= 32;
                case 6:
                    i5 = c.u(descriptor2, 6);
                    i3 |= 64;
                case 7:
                    i = i3 | 128;
                    obj3 = c.B(descriptor2, 7, b23.f390a, obj3);
                    i3 = i;
                case 8:
                    Object B = c.B(descriptor2, 8, b23.f390a, obj5);
                    i = i3 | UserVerificationMethods.USER_VERIFY_HANDPRINT;
                    obj5 = B;
                    i3 = i;
                case 9:
                    i = i3 | 512;
                    obj = c.B(descriptor2, 9, ld1.f3105a, obj);
                    i3 = i;
                case 10:
                    Object B2 = c.B(descriptor2, 10, DeviceNode$DeviceExt$$serializer.INSTANCE, obj2);
                    i = i3 | UserVerificationMethods.USER_VERIFY_ALL;
                    obj2 = B2;
                    i3 = i;
                default:
                    throw new eh3(j);
            }
        }
        c.a(descriptor2);
        return new DeviceNode(i3, str, str2, str3, (String) obj4, str4, i4, i5, (String) obj3, (String) obj5, (Integer) obj, (DeviceNode.DeviceExt) obj2, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, DeviceNode deviceNode) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        DeviceNode.write$Self(deviceNode, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
