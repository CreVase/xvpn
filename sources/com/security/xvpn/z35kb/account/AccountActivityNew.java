package com.security.xvpn.z35kb.account;

import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.dn;
import defpackage.ew3;
import defpackage.hx2;
import defpackage.k02;
import defpackage.na;
import defpackage.pd0;
import defpackage.sn;

/* loaded from: classes2.dex */
public class AccountActivityNew extends dn {
    public boolean k;
    public boolean l = true;

    @Override // defpackage.lt3
    public final String M() {
        return "AccountPage";
    }

    @Override // defpackage.lt3
    public final void N() {
        super.N();
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_account_new);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.Account));
        toolbar.setShowBackBtn(true);
        addThemeInvalidateListener(toolbar);
    }

    @Override // defpackage.lt3
    public final void T() {
        super.T();
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        sn naVar;
        super.onResume();
        boolean z = !ew3.o();
        if (this.l || this.k != z) {
            p supportFragmentManager = getSupportFragmentManager();
            a k = hx2.k(supportFragmentManager, supportFragmentManager);
            if (z) {
                naVar = new k02();
            } else {
                naVar = new na();
            }
            k.e(R.id.account_container, naVar, null);
            k.g();
        }
        this.k = z;
        this.l = false;
    }
}
