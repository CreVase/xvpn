package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.ef0;
import defpackage.h30;
import defpackage.ii1;
import defpackage.kk0;
import defpackage.nh0;
import defpackage.pj0;
import defpackage.px0;
import defpackage.qb0;
import defpackage.rd2;
import defpackage.s71;
import defpackage.t71;
import defpackage.u71;
import defpackage.um;
import defpackage.vl;
import defpackage.z5;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        ct1 b2 = h30.b(pj0.class);
        b2.b(new kk0(2, 0, vl.class));
        b2.f = new qb0(7);
        arrayList.add(b2.c());
        rd2 rd2Var = new rd2(um.class, Executor.class);
        ct1 ct1Var = new ct1(nh0.class, new Class[]{t71.class, u71.class});
        ct1Var.b(kk0.a(Context.class));
        ct1Var.b(kk0.a(px0.class));
        ct1Var.b(new kk0(2, 0, s71.class));
        ct1Var.b(new kk0(1, 1, pj0.class));
        ct1Var.b(new kk0(rd2Var, 1, 0));
        ct1Var.f = new z5(rd2Var, 1);
        arrayList.add(ct1Var.c());
        arrayList.add(bx3.p("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(bx3.p("fire-core", "20.4.2"));
        arrayList.add(bx3.p("device-name", a(Build.PRODUCT)));
        arrayList.add(bx3.p("device-model", a(Build.DEVICE)));
        arrayList.add(bx3.p("device-brand", a(Build.BRAND)));
        arrayList.add(bx3.w("android-target-sdk", new ef0(19)));
        arrayList.add(bx3.w("android-min-sdk", new ef0(20)));
        arrayList.add(bx3.w("android-platform", new ef0(21)));
        arrayList.add(bx3.w("android-installer", new ef0(22)));
        try {
            ii1.f2602b.getClass();
            str = "1.9.20";
        } catch (NoClassDefFoundError unused) {
            str = null;
        }
        if (str != null) {
            arrayList.add(bx3.p("kotlin", str));
        }
        return arrayList;
    }
}
