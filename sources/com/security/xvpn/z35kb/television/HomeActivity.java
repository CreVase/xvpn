package com.security.xvpn.z35kb.television;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import defpackage.b81;
import defpackage.c81;
import defpackage.d42;
import defpackage.d81;
import defpackage.du3;
import defpackage.e;
import defpackage.e81;
import defpackage.ew3;
import defpackage.f33;
import defpackage.f4;
import defpackage.f81;
import defpackage.fl;
import defpackage.g81;
import defpackage.gi2;
import defpackage.gm3;
import defpackage.h71;
import defpackage.hx2;
import defpackage.ic2;
import defpackage.id3;
import defpackage.in1;
import defpackage.j50;
import defpackage.j81;
import defpackage.k43;
import defpackage.k81;
import defpackage.l81;
import defpackage.m81;
import defpackage.nd3;
import defpackage.pe3;
import defpackage.qi0;
import defpackage.rd3;
import defpackage.sd3;
import defpackage.sn;
import defpackage.t00;
import defpackage.tf3;
import defpackage.tr2;
import defpackage.vj1;
import defpackage.vl0;
import defpackage.wd3;
import defpackage.wj1;
import defpackage.xa2;
import defpackage.yc2;
import defpackage.yd3;
import defpackage.zf3;
import defpackage.zh1;
import defpackage.zo1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class HomeActivity extends nd3 {
    public static final /* synthetic */ int l = 0;
    public final gm3 f;
    public zh1 i;
    public boolean j;
    public final sn[] g = new sn[5];
    public int h = -1;
    public final k43 k = new k43(e.v);

    public HomeActivity() {
        int i = 0;
        this.f = new gm3(gi2.a(pe3.class), new l81(this, 1), new l81(this, i), new m81(this, i));
    }

    @Override // defpackage.nd3
    public final String M() {
        return "TVHomePage";
    }

    public final pe3 R() {
        return (pe3) this.f.getValue();
    }

    public final void S(g81 g81Var) {
        sn snVar;
        sn j50Var;
        boolean z;
        zh1 zh1Var = this.i;
        if (zh1Var != null) {
            Iterator it = ew3.O0(zh1Var).iterator();
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i >= 0) {
                    View view = (View) next;
                    if (g81Var.c == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    view.setSelected(z);
                    i = i2;
                } else {
                    tf3.y0();
                    throw null;
                }
            }
        }
        p supportFragmentManager = getSupportFragmentManager();
        a k = hx2.k(supportFragmentManager, supportFragmentManager);
        int i3 = g81Var.c;
        sn[] snVarArr = this.g;
        if (snVarArr[i3] == null) {
            if (g81Var instanceof b81) {
                j50Var = new f4();
            } else if (g81Var instanceof c81) {
                j50Var = new j50();
            } else if (g81Var instanceof d81) {
                j50Var = new in1();
            } else if (g81Var instanceof e81) {
                j50Var = new xa2();
            } else if (g81Var instanceof f81) {
                j50Var = new tr2();
            } else {
                j50Var = new j50();
            }
            snVarArr[i3] = j50Var;
            k.d(R.id.mainContainer, j50Var, String.valueOf(i3), 1);
        }
        int i4 = this.h;
        if (i4 != -1 && (snVar = snVarArr[i4]) != null) {
            k.k(snVar);
        }
        sn snVar2 = snVarArr[i3];
        if (snVar2 != null) {
            k.l(snVar2);
        }
        if (!k.g) {
            k.h = false;
            k.q.y(k, true);
            if (g81Var instanceof c81) {
                this.j = true;
                R().d.o(yd3.f5321a);
            }
            this.h = i3;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    public final void T(int i) {
        ArrayList q = tf3.q(b81.e);
        q.addAll((ArrayList) this.k.getValue());
        S((g81) q.get(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void U() {
        zh1 zh1Var = this.i;
        View view = null;
        if (zh1Var != null) {
            Iterator it = ew3.O0(zh1Var).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((View) next).isSelected()) {
                    view = next;
                    break;
                }
            }
            view = view;
        }
        if (view != null) {
            view.requestFocus();
            return;
        }
        zh1 zh1Var2 = this.i;
        if (zh1Var2 != null) {
            zh1Var2.requestFocus();
        }
    }

    @Override // defpackage.nd3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        sn snVar;
        boolean z;
        super.onCreate(bundle);
        tf3.B0(this);
        wd3 wd3Var = new wd3(this);
        wd3Var.setId(-1);
        zh1 zh1Var = new zh1(wd3Var.getContext());
        zh1Var.setId(-1);
        zh1Var.setOrientation(1);
        zh1Var.setOnKeyAction(new j81(this, 2));
        sd3 sd3Var = new sd3(zh1Var.getContext());
        zh1Var.addView(sd3Var);
        sd3Var.setOnFocusChangeListener(new t00(this, 7));
        k43 k43Var = this.k;
        Iterator it = ((ArrayList) k43Var.getValue()).iterator();
        while (true) {
            int i = 3;
            if (!it.hasNext()) {
                break;
            }
            final g81 g81Var = (g81) it.next();
            final j81 j81Var = new j81(this, i);
            rd3 rd3Var = new rd3(zh1Var.getContext(), g81Var.f2215a, g81Var.f2216b);
            rd3Var.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: td3
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    if (z2) {
                        j81Var.invoke(g81Var);
                    }
                }
            });
            rd3Var.setNextFocusRightId(g81Var.d);
            zh1Var.addView(rd3Var);
        }
        wd3Var.addView(zh1Var);
        this.i = zh1Var;
        j50 j50Var = null;
        du3 du3Var = new du3(wd3Var.getContext(), null, 6, 0);
        du3Var.setId(R.id.mainContainer);
        if (du3Var.getAttachToParent()) {
            wd3Var.addView(du3Var);
        }
        ViewGroup.LayoutParams layoutParams2 = du3Var.getLayoutParams();
        if (layoutParams2 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        du3Var.setLayoutParams(layoutParams);
        setContentView(wd3Var);
        pe3 R = R();
        k81 k81Var = new k81(this, null);
        vj1 lifecycle = getLifecycle();
        while (true) {
            AtomicReference atomicReference = lifecycle.f4845a;
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) atomicReference.get();
            if (lifecycleCoroutineScopeImpl != null) {
                break;
            }
            f33 f33Var = new f33(null);
            qi0 qi0Var = vl0.f4854a;
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, fl.V(f33Var, ((h71) zo1.f5522a).e));
            while (true) {
                if (atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                    z = true;
                    break;
                } else if (atomicReference.get() != null) {
                    z = false;
                    break;
                }
            }
            if (z) {
                qi0 qi0Var2 = vl0.f4854a;
                zf3.T(lifecycleCoroutineScopeImpl, ((h71) zo1.f5522a).e, new wj1(lifecycleCoroutineScopeImpl, null), 2);
                break;
            }
        }
        zf3.T(lifecycleCoroutineScopeImpl, null, new id3(R, k81Var, null), 3);
        sn[] snVarArr = this.g;
        if (bundle == null) {
            T(1);
            sn snVar2 = snVarArr[1];
            if (snVar2 instanceof j50) {
                j50Var = (j50) snVar2;
            }
            if (j50Var != null) {
                j50Var.j = true;
                return;
            }
            return;
        }
        for (int i2 = 0; i2 < 5; i2++) {
            Fragment C = getSupportFragmentManager().C(String.valueOf(i2));
            if (C instanceof sn) {
                snVar = (sn) C;
            } else {
                snVar = null;
            }
            snVarArr[i2] = snVar;
        }
        this.h = bundle.getInt("lastDrawerItemIndex", 1);
        p supportFragmentManager = getSupportFragmentManager();
        a k = hx2.k(supportFragmentManager, supportFragmentManager);
        for (sn snVar3 : snVarArr) {
            if (snVar3 != null) {
                k.k(snVar3);
            }
        }
        if (!k.g) {
            k.h = false;
            k.q.y(k, true);
            ArrayList q = tf3.q(b81.e);
            q.addAll((ArrayList) k43Var.getValue());
            g81 g81Var2 = (g81) q.get(this.h);
            S(g81Var2);
            this.h = g81Var2.c;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        int intExtra;
        super.onNewIntent(intent);
        if (intent == null || (intExtra = intent.getIntExtra("page", -1)) == -1) {
            return;
        }
        T(intExtra);
    }

    @Override // defpackage.nd3, androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.j = false;
    }

    @Override // defpackage.nd3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.j) {
            pe3 R = R();
            R.d.o(yd3.f5321a);
        }
        this.j = false;
    }

    @Override // androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("lastDrawerItemIndex", this.h);
        new StringBuilder("lastDrawerItemIndex:").append(this.h);
    }

    @Override // defpackage.nd3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
        if (yc2.f5314a) {
            yc2.f5314a = false;
            if (ew3.Y() && ew3.o()) {
                yc2.f5315b.g(ic2.f2567a);
            } else {
                d42 d42Var = d42.z;
                yc2.a();
                d42Var.invoke(GoogleIABHelper.g);
            }
        }
    }
}
