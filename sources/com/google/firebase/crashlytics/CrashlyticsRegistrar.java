package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.bx3;
import defpackage.ct1;
import defpackage.gy0;
import defpackage.h30;
import defpackage.hr2;
import defpackage.hy0;
import defpackage.jy0;
import defpackage.kk0;
import defpackage.ky1;
import defpackage.px0;
import defpackage.qa;
import defpackage.ra0;
import defpackage.rx0;
import defpackage.xx0;
import defpackage.z5;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1584a = 0;

    static {
        jy0 jy0Var = jy0.f2853a;
        hr2 hr2Var = hr2.CRASHLYTICS;
        Map map = jy0.f2854b;
        if (map.containsKey(hr2Var)) {
            hr2Var.toString();
        } else {
            map.put(hr2Var, new hy0(new ky1(true)));
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        ct1 b2 = h30.b(rx0.class);
        b2.f1671a = "fire-cls";
        b2.b(kk0.a(px0.class));
        b2.b(kk0.a(xx0.class));
        b2.b(kk0.a(gy0.class));
        b2.b(new kk0(0, 2, ra0.class));
        b2.b(new kk0(0, 2, qa.class));
        b2.f = new z5(this, 0);
        b2.d(2);
        return Arrays.asList(b2.c(), bx3.p("fire-cls", "18.5.1"));
    }
}
