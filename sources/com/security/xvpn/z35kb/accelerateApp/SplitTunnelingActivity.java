package com.security.xvpn.z35kb.accelerateApp;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.accelerateApp.AllAppActivity;
import com.security.xvpn.z35kb.accelerateApp.SplitTunnelingActivity;
import defpackage.d5;
import defpackage.ew3;
import defpackage.fl;
import defpackage.g43;
import defpackage.gf;
import defpackage.hz2;
import defpackage.k7;
import defpackage.kj1;
import defpackage.m20;
import defpackage.pd0;
import defpackage.tc0;
import defpackage.ui1;
import defpackage.v73;
import defpackage.x80;
import defpackage.y62;
import defpackage.zo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class SplitTunnelingActivity extends zo {
    public static final /* synthetic */ int m = 0;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 4));

    @Override // defpackage.lt3
    public final String M() {
        return "SplitTunnelingActivity";
    }

    @Override // defpackage.lt3
    public final void R() {
        Z().e.setTitle(pd0.y(R.string.SplitTunneling));
        final int i = 1;
        Z().e.setShowBackBtn(true);
        addThemeInvalidateListener(Z().e);
        fl.n(this, Z().f, 1000107);
        fl.n(this, Z().g, 1000013);
        fl.n(this, Z().k, 1000107);
        fl.n(this, Z().l, 1000013);
        fl.n(this, Z().j, 1000013);
        fl.g(this, Z().o, 1000008);
        fl.g(this, Z().p, 1000008);
        fl.g(this, Z().h, 1000008);
        fl.g(this, Z().i, 1000008);
        fl.g(this, Z().m, 1000008);
        fl.g(this, Z().n, 1000008);
        Drawable drawable = x80.getDrawable(this, R.drawable.ic_split_tunneling_arrow_right);
        if (drawable != null) {
            fl.o(this, drawable, 1000026);
            drawable.setAutoMirrored(true);
        } else {
            drawable = null;
        }
        Z().i.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        Z().h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, drawable, (Drawable) null);
        fl.n(this, Z().i, 1000107);
        fl.n(this, Z().h, 1000107);
        SwitchCompat switchCompat = Z().c;
        switchCompat.setThumbDrawable(v73.w());
        switchCompat.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat);
        SwitchCompat switchCompat2 = Z().d;
        switchCompat2.setThumbDrawable(v73.w());
        switchCompat2.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat2);
        g43 g43Var = new g43(Z().c);
        g43Var.b(ew3.C());
        g43.a(g43Var, y62.v, new hz2(this, 4));
        g43.a(g43Var, y62.w, new hz2(this, 5));
        g43.a(g43Var, y62.x, new hz2(this, 6));
        g43Var.d(new hz2(this, 7));
        g43 g43Var2 = new g43(Z().d);
        g43Var2.b(ew3.v());
        final int i2 = 0;
        g43.a(g43Var2, y62.s, new hz2(this, i2));
        g43.a(g43Var2, y62.t, new hz2(this, i));
        g43.a(g43Var2, y62.u, new hz2(this, 2));
        g43Var2.d(new hz2(this, 3));
        Z().h.setOnClickListener(new View.OnClickListener(this) { // from class: gz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitTunnelingActivity f2345b;

            {
                this.f2345b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplitTunnelingActivity splitTunnelingActivity = this.f2345b;
                int i3 = 0;
                switch (i2) {
                    case 0:
                        int i4 = SplitTunnelingActivity.m;
                        if (m20.B0()) {
                            t9.u0(splitTunnelingActivity, new jz2(splitTunnelingActivity, i3));
                            return;
                        } else {
                            tf3.h0(splitTunnelingActivity, AllAppActivity.class, null, 0, 6);
                            return;
                        }
                    default:
                        int i5 = SplitTunnelingActivity.m;
                        int i6 = 1;
                        if (m20.B0()) {
                            t9.u0(splitTunnelingActivity, new jz2(splitTunnelingActivity, i6));
                            return;
                        } else {
                            tf3.h0(splitTunnelingActivity, AllAppActivity.class, tf3.r(new n42("useVpn", Boolean.TRUE)), 0, 4);
                            return;
                        }
                }
            }
        });
        Z().i.setOnClickListener(new View.OnClickListener(this) { // from class: gz2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SplitTunnelingActivity f2345b;

            {
                this.f2345b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SplitTunnelingActivity splitTunnelingActivity = this.f2345b;
                int i3 = 0;
                switch (i) {
                    case 0:
                        int i4 = SplitTunnelingActivity.m;
                        if (m20.B0()) {
                            t9.u0(splitTunnelingActivity, new jz2(splitTunnelingActivity, i3));
                            return;
                        } else {
                            tf3.h0(splitTunnelingActivity, AllAppActivity.class, null, 0, 6);
                            return;
                        }
                    default:
                        int i5 = SplitTunnelingActivity.m;
                        int i6 = 1;
                        if (m20.B0()) {
                            t9.u0(splitTunnelingActivity, new jz2(splitTunnelingActivity, i6));
                            return;
                        } else {
                            tf3.h0(splitTunnelingActivity, AllAppActivity.class, tf3.r(new n42("useVpn", Boolean.TRUE)), 0, 4);
                            return;
                        }
                }
            }
        });
        c0();
    }

    @Override // defpackage.zo
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final k7 Z() {
        return (k7) this.l.getValue();
    }

    public final void c0() {
        int i;
        boolean z;
        d5 d5Var = gf.f2243a;
        ArrayList F = d5.F(true);
        ArrayList arrayList = new ArrayList();
        Iterator it = F.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((String) next).length() > 0) {
                z2 = true;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        d5 d5Var2 = gf.f2243a;
        ArrayList F2 = d5.F(false);
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = F2.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (((String) next2).length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList2.add(next2);
            }
        }
        int size = arrayList.size();
        int i2 = R.string.NAppsSelected;
        if (size < 2) {
            i = R.string.NAppsSelectedSingular;
        } else {
            i = R.string.NAppsSelected;
        }
        if (arrayList2.size() < 2) {
            i2 = R.string.NAppsSelectedSingular;
        }
        Z().i.setText(pd0.z(i, Integer.valueOf(arrayList.size())));
        Z().h.setText(pd0.z(i2, Integer.valueOf(arrayList2.size())));
        Z().i.setVisibility(8);
        Z().h.setVisibility(8);
        if (ew3.v()) {
            m20.Y0(Z().i);
        } else if (ew3.C()) {
            m20.Y0(Z().h);
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
        c0();
    }
}
