package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public class jb extends xb {

    @SuppressLint({"StaticFieldLeak"})
    public static jb d = new jb();

    public static jb g() {
        return d;
    }

    @Override // com.chartboost.sdk.impl.xb
    public void b(boolean z) {
        Iterator<xa> it = rb.c().b().iterator();
        while (it.hasNext()) {
            it.next().k().a(z);
        }
    }

    @Override // com.chartboost.sdk.impl.xb
    public boolean d() {
        Iterator<xa> it = rb.c().a().iterator();
        while (it.hasNext()) {
            View e = it.next().e();
            if (e != null && e.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
