package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.DeviceNode;
import defpackage.cp3;
import defpackage.eh3;
import defpackage.f40;
import defpackage.f62;
import defpackage.g40;
import defpackage.ir0;
import defpackage.mp2;
import defpackage.n51;
import defpackage.qe0;
import defpackage.t9;
import defpackage.uh1;
import defpackage.vp2;

/* loaded from: classes2.dex */
public final class DeviceNode$VungleExt$$serializer implements n51 {
    public static final DeviceNode$VungleExt$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        DeviceNode$VungleExt$$serializer deviceNode$VungleExt$$serializer = new DeviceNode$VungleExt$$serializer();
        INSTANCE = deviceNode$VungleExt$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.DeviceNode.VungleExt", deviceNode$VungleExt$$serializer, 2);
        f62Var.j("android", true);
        f62Var.j("amazon", true);
        descriptor = f62Var;
    }

    private DeviceNode$VungleExt$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        DeviceNode$AndroidAmazonExt$$serializer deviceNode$AndroidAmazonExt$$serializer = DeviceNode$AndroidAmazonExt$$serializer.INSTANCE;
        return new uh1[]{t9.K(deviceNode$AndroidAmazonExt$$serializer), t9.K(deviceNode$AndroidAmazonExt$$serializer)};
    }

    @Override // defpackage.sk0
    public DeviceNode.VungleExt deserialize(qe0 qe0Var) {
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
                obj = c.B(descriptor2, 0, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE, obj);
                i |= 1;
            } else {
                if (j != 1) {
                    throw new eh3(j);
                }
                obj2 = c.B(descriptor2, 1, DeviceNode$AndroidAmazonExt$$serializer.INSTANCE, obj2);
                i |= 2;
            }
        }
        c.a(descriptor2);
        return new DeviceNode.VungleExt(i, (DeviceNode.AndroidAmazonExt) obj, (DeviceNode.AndroidAmazonExt) obj2, (vp2) null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, DeviceNode.VungleExt vungleExt) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        DeviceNode.VungleExt.write$Self(vungleExt, c, descriptor2);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
