package com.security.xvpn.z35kb.speedtest;

import a.du;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.j7;
import defpackage.kj1;
import defpackage.m20;
import defpackage.nk3;
import defpackage.pd0;
import defpackage.tc0;
import defpackage.ui1;
import defpackage.v73;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class SpeedTestExplainActivity extends zo {
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 17));

    @Override // defpackage.lt3
    public final String M() {
        return "SpeedTestExplain";
    }

    @Override // defpackage.zo
    public final nk3 Z() {
        return (j7) this.l.getValue();
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.SpeedTest));
        toolbar.setShowBackBtn(true);
        du.d(455, null);
        NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = ((j7) this.l.getValue()).f2714b;
        int childCount = navigationBarContentConstraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = navigationBarContentConstraintLayout.getChildAt(i);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(v73.z());
            }
        }
    }
}
