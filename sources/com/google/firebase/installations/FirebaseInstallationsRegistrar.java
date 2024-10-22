package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.g30;
import defpackage.h30;
import defpackage.hq;
import defpackage.kk0;
import defpackage.lp2;
import defpackage.px0;
import defpackage.qb0;
import defpackage.rd2;
import defpackage.s30;
import defpackage.s71;
import defpackage.t71;
import defpackage.um;
import defpackage.wx0;
import defpackage.xx0;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
/* loaded from: classes2.dex */
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    public static xx0 lambda$getComponents$0(s30 s30Var) {
        return new wx0((px0) s30Var.a(px0.class), s30Var.c(t71.class), (ExecutorService) s30Var.f(new rd2(um.class, ExecutorService.class)), new lp2((Executor) s30Var.f(new rd2(hq.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<h30> getComponents() {
        ct1 b2 = h30.b(xx0.class);
        b2.f1671a = LIBRARY_NAME;
        b2.b(kk0.a(px0.class));
        b2.b(new kk0(0, 1, t71.class));
        b2.b(new kk0(new rd2(um.class, ExecutorService.class), 1, 0));
        b2.b(new kk0(new rd2(hq.class, Executor.class), 1, 0));
        b2.f = new qb0(5);
        s71 s71Var = new s71(0);
        ct1 b3 = h30.b(s71.class);
        b3.c = 1;
        b3.f = new g30(s71Var, 0);
        return Arrays.asList(b2.c(), b3.c(), bx3.p(LIBRARY_NAME, "17.2.0"));
    }
}
