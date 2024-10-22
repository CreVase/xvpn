package com.vungle.ads.internal.model;

import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.util.PathProvider;
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
public final class DeviceNode$DeviceExt$$serializer implements n51 {
    public static final DeviceNode$DeviceExt$$serializer INSTANCE;
    public static final /* synthetic */ mp2 descriptor;

    static {
        DeviceNode$DeviceExt$$serializer deviceNode$DeviceExt$$serializer = new DeviceNode$DeviceExt$$serializer();
        INSTANCE = deviceNode$DeviceExt$$serializer;
        f62 f62Var = new f62("com.vungle.ads.internal.model.DeviceNode.DeviceExt", deviceNode$DeviceExt$$serializer, 1);
        f62Var.j(PathProvider.VUNGLE_FOLDER, false);
        descriptor = f62Var;
    }

    private DeviceNode$DeviceExt$$serializer() {
    }

    @Override // defpackage.n51
    public uh1[] childSerializers() {
        return new uh1[]{DeviceNode$VungleExt$$serializer.INSTANCE};
    }

    @Override // defpackage.sk0
    public DeviceNode.DeviceExt deserialize(qe0 qe0Var) {
        mp2 descriptor2 = getDescriptor();
        f40 c = qe0Var.c(descriptor2);
        c.A();
        boolean z = true;
        Object obj = null;
        int i = 0;
        while (z) {
            int j = c.j(descriptor2);
            if (j == -1) {
                z = false;
            } else {
                if (j != 0) {
                    throw new eh3(j);
                }
                obj = c.t(descriptor2, 0, DeviceNode$VungleExt$$serializer.INSTANCE, obj);
                i |= 1;
            }
        }
        c.a(descriptor2);
        return new DeviceNode.DeviceExt(i, (DeviceNode.VungleExt) obj, null);
    }

    @Override // defpackage.sk0
    public mp2 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.uh1
    public void serialize(ir0 ir0Var, DeviceNode.DeviceExt deviceExt) {
        mp2 descriptor2 = getDescriptor();
        g40 c = ir0Var.c(descriptor2);
        c.p(descriptor2, 0, DeviceNode$VungleExt$$serializer.INSTANCE, deviceExt.vungle);
        c.a(descriptor2);
    }

    @Override // defpackage.n51
    public uh1[] typeParametersSerializers() {
        return cp3.j;
    }
}
