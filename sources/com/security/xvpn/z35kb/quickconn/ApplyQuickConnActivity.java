package com.security.xvpn.z35kb.quickconn;

import android.os.Bundle;
import androidx.appcompat.widget.SwitchCompat;
import b.ContentWrapper;
import com.security.xvpn.z35kb.R;
import defpackage.d42;
import defpackage.e43;
import defpackage.ew3;
import defpackage.fl;
import defpackage.g43;
import defpackage.gv2;
import defpackage.kj1;
import defpackage.l5;
import defpackage.m20;
import defpackage.pd0;
import defpackage.tc0;
import defpackage.ui1;
import defpackage.v73;
import defpackage.xf;
import defpackage.yf;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class ApplyQuickConnActivity extends zo {
    public static final /* synthetic */ int m = 0;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 14));

    @Override // defpackage.lt3
    public final String M() {
        return "ApplyQuickConnPage";
    }

    @Override // defpackage.dn
    public final boolean X() {
        return true;
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        int i = 1;
        Z().j.setShowBackBtn(true);
        Z().j.setTitle(pd0.y(R.string.FastConnectBar));
        int i2 = 0;
        yf yfVar = new yf(this, i2);
        ContentWrapper contentWrapper = this.k;
        if (contentWrapper != null) {
            contentWrapper.f372a.add(yfVar);
            yfVar.invoke(contentWrapper.f373b);
        }
        m20.G0(Z().e, new yf(this, i));
        int i3 = 2;
        m20.G0(Z().h, new yf(this, i3));
        m20.G0(Z().f, new yf(this, 3));
        g43 g43Var = new g43(Z().i);
        g43Var.b(ew3.m0());
        g43.a(g43Var, d42.s, new xf(this, i));
        g43Var.f2205b.add(new e43(new yf(this, 4), new xf(this, i3), gv2.n));
        g43Var.d(new xf(this, i2));
        bindInvalidate(Z().j);
        fl.n(this, Z().m, 1000151);
        fl.g(this, Z().m, 1000008);
        bindInvalidate(Z().e);
        bindInvalidate(Z().h);
        bindInvalidate(Z().f);
        fl.g(this, Z().g, 1000008);
        fl.g(this, Z().f3064b, 1000008);
        fl.g(this, Z().c, 1000008);
        fl.g(this, Z().d, 1000008);
        fl.n(this, Z().k, 1000107);
        fl.n(this, Z().l, 1000013);
        SwitchCompat switchCompat = Z().i;
        switchCompat.setThumbDrawable(v73.w());
        switchCompat.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat);
    }

    @Override // defpackage.zo
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final l5 Z() {
        return (l5) this.l.getValue();
    }
}
