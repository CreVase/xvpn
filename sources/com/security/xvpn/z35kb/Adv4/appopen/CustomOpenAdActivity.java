package com.security.xvpn.z35kb.Adv4.appopen;

import android.os.Bundle;
import android.view.View;
import defpackage.b6;
import defpackage.cr1;
import defpackage.kj1;
import defpackage.m20;
import defpackage.sc0;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.zf3;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class CustomOpenAdActivity extends zo {
    public static View m;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 0));

    @Override // defpackage.lt3
    public final String M() {
        return "CustomOpenAdPage";
    }

    @Override // defpackage.zo
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final b6 Z() {
        return (b6) this.l.getValue();
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
    }

    @Override // defpackage.zo, defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().getDecorView().setBackgroundColor(1879048192);
        if (m != null) {
            Z().f409b.addView(m);
        }
        Z().c.setEnabled(false);
        Z().c.setOnClickListener(new cr1(this, 5));
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        tf3.a0(m);
        m = null;
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
        zf3.T(this, null, new sc0(this, null), 3);
    }
}
