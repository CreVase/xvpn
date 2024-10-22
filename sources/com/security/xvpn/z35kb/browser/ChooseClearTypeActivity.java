package com.security.xvpn.z35kb.browser;

import a.bx;
import android.content.Intent;
import android.util.SparseArray;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.dn;
import defpackage.ew3;
import defpackage.fl;
import defpackage.hx2;
import defpackage.md0;
import defpackage.pd0;
import defpackage.q5;
import defpackage.r5;
import defpackage.sm1;
import defpackage.tl3;
import defpackage.ut0;
import defpackage.v73;
import defpackage.ya0;

/* loaded from: classes2.dex */
public class ChooseClearTypeActivity extends dn {
    public q5 k;
    public final SparseArray l = new SparseArray();

    @Override // defpackage.lt3
    public final String M() {
        return "ChooseClearTypePage";
    }

    @Override // defpackage.lt3
    public final void R() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = q5.z;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        q5 q5Var = (q5) tl3.i(layoutInflater, R.layout.activity_choose_clear_type, null, null);
        this.k = q5Var;
        setContentView(q5Var.e);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.CleanBrowsingHistory));
        toolbar.setShowBackBtn(true);
        q5 q5Var2 = this.k;
        bx i2 = hx2.i(512);
        long t = i2.t();
        i2.h();
        q5Var2.p(Integer.valueOf((int) t));
        r5 r5Var = (r5) this.k;
        r5Var.y = new ut0(this, 7);
        synchronized (r5Var) {
            r5Var.I |= 4;
        }
        r5Var.e(1);
        r5Var.m();
        this.k.o(Boolean.valueOf(true ^ ew3.X()));
        bindInvalidate(this.k.s);
        fl.n(this, this.k.t, 1000013);
        fl.n(this, this.k.v, 1000014);
        fl.n(this, this.k.u, 1000014);
        fl.g(this, this.k.o.f5504a, 1000010);
        fl.g(this, this.k.p.f5504a, 1000010);
        this.k.q.setBackground(v73.u(1000008));
        this.k.r.setBackground(v73.u(1000008));
        bindInvalidate(this.k.q);
        bindInvalidate(this.k.r);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!((XApplication) this.c.getApplication()).c() && ya0.e0()) {
            sm1.a(this.c).c(new Intent("ClearHistory"));
        }
    }
}
