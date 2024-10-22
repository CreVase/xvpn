package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.ct1;
import defpackage.fk1;
import defpackage.h30;
import defpackage.hq;
import defpackage.kk0;
import defpackage.mp0;
import defpackage.rd2;
import defpackage.tf3;
import defpackage.um;
import defpackage.v90;
import defpackage.wg3;
import java.util.List;
import java.util.concurrent.Executor;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public List<h30> getComponents() {
        ct1 a2 = h30.a(new rd2(um.class, v90.class));
        a2.b(new kk0(new rd2(um.class, Executor.class), 1, 0));
        a2.f = mp0.f;
        ct1 a3 = h30.a(new rd2(fk1.class, v90.class));
        a3.b(new kk0(new rd2(fk1.class, Executor.class), 1, 0));
        a3.f = mp0.g;
        ct1 a4 = h30.a(new rd2(hq.class, v90.class));
        a4.b(new kk0(new rd2(hq.class, Executor.class), 1, 0));
        a4.f = mp0.h;
        ct1 a5 = h30.a(new rd2(wg3.class, v90.class));
        a5.b(new kk0(new rd2(wg3.class, Executor.class), 1, 0));
        a5.f = mp0.i;
        return tf3.b0(a2.c(), a3.c(), a4.c(), a5.c());
    }
}
