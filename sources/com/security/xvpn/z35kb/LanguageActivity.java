package com.security.xvpn.z35kb;

import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import defpackage.kj1;
import defpackage.l6;
import defpackage.li1;
import defpackage.m20;
import defpackage.mi1;
import defpackage.pd0;
import defpackage.tc0;
import defpackage.ui1;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class LanguageActivity extends zo {
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 2));

    @Override // defpackage.lt3
    public final String M() {
        return "LanguagePage";
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        Z().c.setTitle(pd0.y(R.string.Language));
        Z().c.setShowBackBtn(true);
        bindInvalidate(Z().c);
        Z().f3072b.setLayoutManager(new LinearLayoutManager());
        Z().f3072b.setAdapter(new li1(this));
        Z().f3072b.i(new mi1());
    }

    @Override // defpackage.zo
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final l6 Z() {
        return (l6) this.l.getValue();
    }
}
