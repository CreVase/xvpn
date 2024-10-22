package com.security.xvpn.z35kb.speedtest;

import a.bx;
import a.du;
import android.content.Intent;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.StateSet;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestExplainActivity;
import com.security.xvpn.z35kb.util.WrapContentLinearLayoutManager;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.bx3;
import defpackage.by2;
import defpackage.c00;
import defpackage.cr0;
import defpackage.cy2;
import defpackage.dw3;
import defpackage.dy2;
import defpackage.ew3;
import defpackage.fl;
import defpackage.gc3;
import defpackage.hx2;
import defpackage.hy2;
import defpackage.i7;
import defpackage.jy;
import defpackage.kj1;
import defpackage.l92;
import defpackage.m20;
import defpackage.mq2;
import defpackage.pd0;
import defpackage.qi0;
import defpackage.rb2;
import defpackage.t9;
import defpackage.t90;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.vl0;
import defpackage.x9;
import defpackage.xx2;
import defpackage.z80;
import defpackage.zf3;
import defpackage.zg2;
import defpackage.zo;
import defpackage.zo1;
import defpackage.zp2;
import defpackage.zx2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SpeedTestActivity extends zo {
    public static final /* synthetic */ int u = 0;
    public hy2 m;
    public dw3 o;
    public final StateListDrawable q;
    public final ui1 r;
    public final jy s;
    public c00 t;
    public final /* synthetic */ z80 l = pd0.e();
    public final ArrayList n = new ArrayList();
    public final l92 p = new l92();

    public SpeedTestActivity() {
        float f = 100 * tf3.F;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{-16842910}, new zg2(1000073, f));
        stateListDrawable.addState(ew3.p, new zg2(1000072, f));
        stateListDrawable.addState(ew3.o, new zg2(1000071, f));
        stateListDrawable.addState(StateSet.WILD_CARD, new zg2(1000070, f));
        this.q = stateListDrawable;
        this.r = m20.D0(kj1.f2953a, new tc0(this, 16));
        this.s = new jy(this, this.c);
    }

    public static List c0(ArrayList arrayList) {
        boolean z;
        if (arrayList != null && !arrayList.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return cr0.f1659a;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            gc3 gc3Var = (gc3) it.next();
            Object obj = gc3Var.d;
            if (((zp2) obj).o) {
                arrayList2.add(obj);
            } else {
                arrayList2.addAll(c0(gc3Var.f2235b));
            }
        }
        return arrayList2;
    }

    @Override // defpackage.lt3
    public final String M() {
        return "SpeedTestActivity";
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.SpeedTest));
        final int i = 1;
        toolbar.setShowBackBtn(true);
        bindInvalidate(toolbar);
        hy2 hy2Var = new hy2(this, this.n);
        this.m = hy2Var;
        hy2Var.A(true);
        Z().m.setLayoutManager(new WrapContentLinearLayoutManager());
        Z().m.setAdapter(this.m);
        Z().m.i(new mq2(this.c, tf3.K(20)));
        Z().m.setItemAnimator(null);
        final int i2 = 0;
        Z().c.setOnClickListener(new View.OnClickListener(this) { // from class: yx2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedTestActivity f5402b;

            {
                this.f5402b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                SpeedTestActivity speedTestActivity = this.f5402b;
                switch (i3) {
                    case 0:
                        int i4 = SpeedTestActivity.u;
                        if (!ew3.X()) {
                            m20.C0(speedTestActivity, 37);
                            return;
                        }
                        du.d(454, null);
                        int i5 = 0;
                        if (speedTestActivity.Z().c.isSelected()) {
                            speedTestActivity.g0(false);
                            return;
                        }
                        if (!speedTestActivity.b0().isEmpty()) {
                            if (!m20.A0() && !m20.B0()) {
                                t9.u0(speedTestActivity, new by2(speedTestActivity, i5));
                                return;
                            } else {
                                t9.u0(speedTestActivity, d42.u);
                                return;
                            }
                        }
                        return;
                    default:
                        int i6 = SpeedTestActivity.u;
                        ya0.H(speedTestActivity.c, SpeedTestExplainActivity.class);
                        return;
                }
            }
        });
        findViewById(R.id.iv_ping_ask).setOnClickListener(new View.OnClickListener(this) { // from class: yx2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SpeedTestActivity f5402b;

            {
                this.f5402b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                SpeedTestActivity speedTestActivity = this.f5402b;
                switch (i3) {
                    case 0:
                        int i4 = SpeedTestActivity.u;
                        if (!ew3.X()) {
                            m20.C0(speedTestActivity, 37);
                            return;
                        }
                        du.d(454, null);
                        int i5 = 0;
                        if (speedTestActivity.Z().c.isSelected()) {
                            speedTestActivity.g0(false);
                            return;
                        }
                        if (!speedTestActivity.b0().isEmpty()) {
                            if (!m20.A0() && !m20.B0()) {
                                t9.u0(speedTestActivity, new by2(speedTestActivity, i5));
                                return;
                            } else {
                                t9.u0(speedTestActivity, d42.u);
                                return;
                            }
                        }
                        return;
                    default:
                        int i6 = SpeedTestActivity.u;
                        ya0.H(speedTestActivity.c, SpeedTestExplainActivity.class);
                        return;
                }
            }
        });
        fl.g(this, Z().l, 1000004);
        fl.n(this, Z().j, 1000014);
        fl.n(this, Z().f, 1000013);
        fl.n(this, Z().d, 1000013);
        fl.n(this, Z().g, 1000013);
        fl.n(this, Z().e, 1000015);
        fl.g(this, Z().f2546b, 1000010);
        fl.g(this, Z().k, 1000003);
        fl.g(this, Z().j, 1000008);
        fl.g(this, Z().i, 1000029);
        TextView textView = Z().j;
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.SpeedTestSaveToConnLogTips));
        bx3.i(valueOf, pd0.y(R.string.StaticIP), new x9(this, 5));
        textView.setText(valueOf);
        Z().j.setMovementMethod(LinkMovementMethod.getInstance());
        if (Build.VERSION.SDK_INT <= 21) {
            Z().c.setLayerType(1, null);
        }
        Z().c.setBackground(this.q);
        bindInvalidate(Z().c);
        f0();
        zf3.T(this, null, new zx2(this, null), 3);
        du.d(453, null);
        ew3.g("bsxdcst8eb");
        Z().c.post(new xx2(this, i));
    }

    public final ArrayList b0() {
        List<gc3> list;
        ArrayList arrayList = new ArrayList();
        c00 c00Var = this.t;
        if (c00Var != null && (list = c00Var.f) != null) {
            for (gc3 gc3Var : list) {
                if (!m20.L(((zp2) gc3Var.d).a(), "8ebagyhr8n") && gc3Var.f2234a == null) {
                    Object obj = gc3Var.d;
                    if (((zp2) obj).o) {
                        arrayList.add(obj);
                    } else {
                        arrayList.addAll(c0(gc3Var.f2235b));
                    }
                }
            }
        }
        return arrayList;
    }

    @Override // defpackage.zo
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final i7 Z() {
        return (i7) this.r.getValue();
    }

    public final void e0() {
        bx i = hx2.i(460);
        int t = (int) i.t();
        rb2[] rb2VarArr = new rb2[t];
        for (int i2 = 0; i2 < t; i2++) {
            rb2 rb2Var = new rb2();
            ew3.s0(i, rb2Var);
            rb2VarArr[i2] = rb2Var;
        }
        i.h();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < t; i3++) {
            rb2 rb2Var2 = rb2VarArr[i3];
            if (rb2Var2 != null && !TextUtils.isEmpty(rb2Var2.f4125a)) {
                arrayList.add(rb2Var2);
            }
        }
        qi0 qi0Var = vl0.f4854a;
        zf3.T(this, zo1.f5522a, new cy2(this, arrayList, null), 2);
    }

    public final void f0() {
        c00 c00Var = this.t;
        if (c00Var == null) {
            c00Var = new c00(new WeakReference(Z().m), new dy2(this));
        }
        this.t = c00Var;
        RecyclerView recyclerView = Z().m;
        ArrayList arrayList = recyclerView.q;
        jy jyVar = this.s;
        arrayList.remove(jyVar);
        if (recyclerView.r == jyVar) {
            recyclerView.r = null;
        }
        Z().m.setAdapter(this.t);
        m20.Y0(Z().i);
        m20.u0(Z().j);
        m20.u0(Z().h);
    }

    public final void g0(boolean z) {
        dw3 dw3Var = this.o;
        int i = 0;
        if (dw3Var != null) {
            hy2 hy2Var = this.m;
            if (hy2Var != null) {
                hy2Var.e = false;
            }
            dw3Var.f1852a = true;
        }
        if (!z) {
            du.d(458, null);
        }
        runOnUiThread(new xx2(this, i));
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8 && i2 == -1) {
            m20.R();
            setResult(-1);
            finish();
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Z().c.isSelected()) {
            t9.u0(this, new by2(this, 1));
        } else if (!Z().i.isShown()) {
            f0();
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        pd0.l(this);
    }

    @Override // defpackage.dn, defpackage.aa0
    public final t90 w() {
        return this.l.f5442a;
    }
}
