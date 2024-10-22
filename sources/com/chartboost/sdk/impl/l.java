package com.chartboost.sdk.impl;

import android.view.View;

/* loaded from: classes.dex */
public abstract class l {
    public static l a(m mVar, n nVar) {
        kc.a();
        kc.a(mVar, "AdSessionConfiguration is null");
        kc.a(nVar, "AdSessionContext is null");
        return new xa(mVar, nVar);
    }

    public abstract void a();

    public abstract void a(View view);

    public abstract void b();
}
