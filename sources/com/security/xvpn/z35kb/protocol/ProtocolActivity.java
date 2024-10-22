package com.security.xvpn.z35kb.protocol;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.a20;
import defpackage.ab2;
import defpackage.bc2;
import defpackage.cr1;
import defpackage.ew3;
import defpackage.fl;
import defpackage.kj1;
import defpackage.m20;
import defpackage.mi1;
import defpackage.n6;
import defpackage.nk3;
import defpackage.pd0;
import defpackage.pe0;
import defpackage.ra2;
import defpackage.ta2;
import defpackage.tc0;
import defpackage.to1;
import defpackage.ui1;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ProtocolActivity extends zo {
    public static final /* synthetic */ int o = 0;
    public ta2 m;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 8));
    public ArrayList n = new ArrayList();

    @Override // defpackage.lt3
    public final String M() {
        return "ProtocolPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        Drawable drawable;
        String str;
        this.n = new ArrayList();
        bc2[] N = ew3.N();
        if (N.length > 0) {
            bc2 D = ew3.D();
            String str2 = D.f445a;
            if (TextUtils.isEmpty(str2) && !m20.L(D.f446b, "Auto")) {
                if (N.length > 1) {
                    str = N[1].f445a;
                } else {
                    str = N[0].f445a;
                }
                str2 = str;
                pe0.d(str2);
            }
            for (bc2 bc2Var : N) {
                ab2 ab2Var = new ab2();
                ab2Var.f49a = bc2Var.f446b;
                ab2Var.f50b = bc2Var.c;
                ab2Var.d = bc2Var.d;
                ab2Var.e = bc2Var.e;
                ab2Var.c = TextUtils.equals(str2, bc2Var.f445a);
                ab2Var.f = new to1(11, this, bc2Var);
                ArrayList arrayList = this.n;
                if (arrayList != null) {
                    arrayList.add(ab2Var);
                }
            }
        }
        ui1 ui1Var = this.l;
        RecyclerView recyclerView = ((n6) ui1Var.getValue()).f3400b;
        Toolbar toolbar = ((n6) ui1Var.getValue()).c;
        toolbar.setShowBackBtn(true);
        toolbar.setTitle(pd0.y(R.string.EverestProtocol));
        toolbar.setShowCloseBtn(true);
        ImageView btnClose = toolbar.getBtnClose();
        if (btnClose != null) {
            btnClose.setImageResource(R.drawable.ic_protocol_setting);
        }
        ImageView btnClose2 = toolbar.getBtnClose();
        if (btnClose2 != null && (drawable = btnClose2.getDrawable()) != null) {
            fl.o(this, drawable, 1000026);
        }
        ImageView btnClose3 = toolbar.getBtnClose();
        if (btnClose3 != null) {
            btnClose3.setOnClickListener(new cr1(this, 18));
        }
        addThemeInvalidateListener(toolbar);
        recyclerView.setLayoutManager(new LinearLayoutManager());
        ta2 ta2Var = new ta2(this);
        this.m = ta2Var;
        recyclerView.setAdapter(ta2Var);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new ra2());
        ArrayList arrayList3 = this.n;
        ArrayList arrayList4 = new ArrayList(a20.C0(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(new ra2((ab2) it.next()));
        }
        arrayList2.addAll(arrayList4);
        recyclerView.i(new mi1(arrayList2, 1));
        ta2 ta2Var2 = this.m;
        ArrayList arrayList5 = ta2Var2.e;
        arrayList5.clear();
        arrayList5.addAll(arrayList2);
        ta2Var2.f();
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    @Override // defpackage.zo
    public final nk3 Z() {
        return (n6) this.l.getValue();
    }

    @Override // defpackage.dn, defpackage.lt3, android.app.Activity
    public final void finish() {
        super.finish();
        m20.v0(getWindow().getDecorView());
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        super.onBackPressed();
        m20.v0(getWindow().getDecorView());
    }
}
