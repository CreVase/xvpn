package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.dc3;
import defpackage.ft;
import defpackage.h30;
import defpackage.kk0;
import defpackage.qb0;
import defpackage.s30;
import defpackage.zb3;
import java.util.Arrays;
import java.util.List;

@Keep
/* loaded from: classes2.dex */
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public static /* synthetic */ zb3 lambda$getComponents$0(s30 s30Var) {
        dc3.b((Context) s30Var.a(Context.class));
        return dc3.a().c(ft.f);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<h30> getComponents() {
        ct1 b2 = h30.b(zb3.class);
        b2.f1671a = LIBRARY_NAME;
        b2.b(kk0.a(Context.class));
        b2.f = new qb0(4);
        return Arrays.asList(b2.c(), bx3.p(LIBRARY_NAME, "18.1.8"));
    }
}
