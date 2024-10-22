package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.h30;
import defpackage.kk0;
import defpackage.p71;
import defpackage.pj0;
import defpackage.px0;
import defpackage.qb0;
import defpackage.s30;
import defpackage.u23;
import defpackage.u71;
import defpackage.xx0;
import defpackage.zb3;
import defpackage.zx0;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
/* loaded from: classes2.dex */
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(s30 s30Var) {
        px0 px0Var = (px0) s30Var.a(px0.class);
        p71.C(s30Var.a(zx0.class));
        return new FirebaseMessaging(px0Var, s30Var.c(pj0.class), s30Var.c(u71.class), (xx0) s30Var.a(xx0.class), (zb3) s30Var.a(zb3.class), (u23) s30Var.a(u23.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<h30> getComponents() {
        ct1 b2 = h30.b(FirebaseMessaging.class);
        b2.f1671a = LIBRARY_NAME;
        b2.b(kk0.a(px0.class));
        b2.b(new kk0(0, 0, zx0.class));
        b2.b(new kk0(0, 1, pj0.class));
        b2.b(new kk0(0, 1, u71.class));
        b2.b(new kk0(0, 0, zb3.class));
        b2.b(kk0.a(xx0.class));
        b2.b(kk0.a(u23.class));
        b2.f = new qb0(6);
        b2.d(1);
        return Arrays.asList(b2.c(), bx3.p(LIBRARY_NAME, "23.3.1"));
    }
}
