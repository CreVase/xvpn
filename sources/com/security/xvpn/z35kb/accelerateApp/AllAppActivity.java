package com.security.xvpn.z35kb.accelerateApp;

import a.bx;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.XEditText;
import defpackage.Cif;
import defpackage.aa;
import defpackage.cr0;
import defpackage.cr1;
import defpackage.ef;
import defpackage.ew3;
import defpackage.fl;
import defpackage.fv2;
import defpackage.g43;
import defpackage.hx2;
import defpackage.i23;
import defpackage.k5;
import defpackage.kj1;
import defpackage.li1;
import defpackage.m20;
import defpackage.pd0;
import defpackage.sq;
import defpackage.t00;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.u9;
import defpackage.ui1;
import defpackage.v73;
import defpackage.v9;
import defpackage.w9;
import defpackage.x9;
import defpackage.y9;
import defpackage.z73;
import defpackage.zf3;
import defpackage.zg2;
import defpackage.zo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class AllAppActivity extends zo {
    public static final /* synthetic */ int t = 0;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 3));
    public boolean m;
    public li1 n;
    public List o;
    public List p;
    public final ArrayList q;
    public boolean r;
    public String s;

    public AllAppActivity() {
        cr0 cr0Var = cr0.f1659a;
        this.o = cr0Var;
        this.p = cr0Var;
        this.q = new ArrayList();
        bx i = hx2.i(526);
        boolean q = i.q();
        i.h();
        this.r = q;
        this.s = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b0(com.security.xvpn.z35kb.accelerateApp.AllAppActivity r12) {
        /*
            Method dump skipped, instructions count: 237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.accelerateApp.AllAppActivity.b0(com.security.xvpn.z35kb.accelerateApp.AllAppActivity):void");
    }

    @Override // defpackage.lt3
    public final String M() {
        return "AllAppActivity";
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        int i;
        Drawable drawable;
        int i2 = 0;
        boolean booleanExtra = getIntent().getBooleanExtra("useVpn", false);
        this.m = booleanExtra;
        if (booleanExtra) {
            i = R.string.SelectAppsUseVPN;
        } else {
            i = R.string.SelectAppsNotUseVPN;
        }
        Z().e.setTitle(i23.k1(pd0.y(i), " - ", "-", false));
        int i3 = 1;
        Z().e.setShowBackBtn(true);
        k5 Z = Z();
        bindInvalidate(Z.e);
        boolean R = zf3.R();
        XEditText xEditText = Z.f2887b;
        if (R) {
            xEditText.setGravity(21);
        }
        xEditText.setBackground(new zg2(1000146, tf3.F * 100));
        fl.n(this, xEditText, 1000147);
        xEditText.setHintTextColor(v73.j(1000147));
        this.i.a(new z73(3, 1000147, xEditText));
        Drawable P0 = ew3.P0(this, R.drawable.icon_search);
        if (P0 != null && (drawable = P0.mutate()) != null) {
            fl.o(this, drawable, 1000148);
        } else {
            drawable = null;
        }
        xEditText.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        bindInvalidate(xEditText);
        fl.g(this, Z.k, 1000008);
        fl.g(this, Z.l, 1000008);
        ImageView imageView = Z.j;
        fl.o(this, imageView.getDrawable(), 1000026);
        fl.n(this, Z.f, 1000107);
        fl.n(this, Z.i, 1000144);
        fl.n(this, Z.h, 1000144);
        TextView textView = Z.g;
        fl.n(this, textView, 1000144);
        SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.NoAppInstalled));
        int Z0 = i23.Z0(valueOf, "X-VPN >", 0, false, 6);
        if (Z0 != -1) {
            int i4 = Z0 + 5;
            valueOf.setSpan(new w9(), Z0, i4, 33);
            valueOf.setSpan(new x9(this, i2), Z0, i4, 33);
        }
        textView.setText(valueOf);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        sq w = v73.w();
        SwitchCompat switchCompat = Z.d;
        switchCompat.setThumbDrawable(w);
        switchCompat.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat);
        xEditText.addTextChangedListener(new v9(this, Z));
        xEditText.setOnFocusChangeListener(new t00(Z, 2));
        imageView.setOnClickListener(new cr1(Z, 10));
        g43 g43Var = new g43(Z().d);
        g43Var.b(this.r);
        g43Var.d(new y9(this, i2));
        ArrayList arrayList = this.q;
        this.n = new li1(i3, this, arrayList, new fv2(this, 4));
        Z().c.setAdapter(this.n);
        Z().c.setLayoutManager(new LinearLayoutManager());
        Z().c.i(new Cif(arrayList));
        T();
        zf3.T(this, null, new aa(this, null), 3);
    }

    public final ArrayList c0(List list, List list2, boolean z, String str) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (str.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z || z2) {
            u9 u9Var = new u9(str, z, z2);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((Boolean) u9Var.invoke(obj)).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((Boolean) u9Var.invoke(obj2)).booleanValue()) {
                    arrayList2.add(obj2);
                }
            }
            list2 = arrayList2;
            list = arrayList;
        }
        int i = 0;
        for (Object obj3 : list) {
            int i2 = i + 1;
            if (i >= 0) {
                ef efVar = (ef) obj3;
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                efVar.f = z5;
                i = i2;
            } else {
                tf3.y0();
                throw null;
            }
        }
        int i3 = 0;
        for (Object obj4 : list2) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                ef efVar2 = (ef) obj4;
                if (i3 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                efVar2.f = z4;
                i3 = i4;
            } else {
                tf3.y0();
                throw null;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(list);
        arrayList3.addAll(list2);
        LinearLayout linearLayout = Z().n;
        if (z2 && arrayList3.isEmpty()) {
            z3 = true;
        } else {
            z3 = false;
        }
        m20.g1(linearLayout, z3);
        LinearLayout linearLayout2 = Z().m;
        if (!z2 && arrayList3.isEmpty()) {
            z6 = true;
        }
        m20.g1(linearLayout2, z6);
        return arrayList3;
    }

    @Override // defpackage.zo
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final k5 Z() {
        return (k5) this.l.getValue();
    }
}
