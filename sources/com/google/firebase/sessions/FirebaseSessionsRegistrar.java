package com.google.firebase.sessions;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.gy0;
import defpackage.h30;
import defpackage.hq;
import defpackage.kk0;
import defpackage.ky0;
import defpackage.px0;
import defpackage.qb0;
import defpackage.rd2;
import defpackage.s30;
import defpackage.tf3;
import defpackage.um;
import defpackage.v90;
import defpackage.xx0;
import defpackage.zb3;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-sessions";
    public static final ky0 Companion = new ky0();
    private static final rd2 firebaseApp = rd2.a(px0.class);
    private static final rd2 firebaseInstallationsApi = rd2.a(xx0.class);
    private static final rd2 backgroundDispatcher = new rd2(um.class, v90.class);
    private static final rd2 blockingDispatcher = new rd2(hq.class, v90.class);
    private static final rd2 transportFactory = rd2.a(zb3.class);

    /* renamed from: getComponents$lambda-0 */
    public static final gy0 m7getComponents$lambda0(s30 s30Var) {
        return new gy0((px0) s30Var.f(firebaseApp), (xx0) s30Var.f(firebaseInstallationsApi), (v90) s30Var.f(backgroundDispatcher), (v90) s30Var.f(blockingDispatcher), s30Var.e(transportFactory));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<h30> getComponents() {
        ct1 b2 = h30.b(gy0.class);
        b2.f1671a = LIBRARY_NAME;
        b2.b(new kk0(firebaseApp, 1, 0));
        b2.b(new kk0(firebaseInstallationsApi, 1, 0));
        b2.b(new kk0(backgroundDispatcher, 1, 0));
        b2.b(new kk0(blockingDispatcher, 1, 0));
        b2.b(new kk0(transportFactory, 1, 1));
        b2.f = new qb0(8);
        return tf3.b0(b2.c(), bx3.p(LIBRARY_NAME, "1.1.0"));
    }
}
