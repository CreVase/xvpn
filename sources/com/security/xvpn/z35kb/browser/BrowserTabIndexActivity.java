package com.security.xvpn.z35kb.browser;

import android.graphics.Color;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import defpackage.br;
import defpackage.dn;
import defpackage.hx2;
import defpackage.s53;

/* loaded from: classes2.dex */
public final class BrowserTabIndexActivity extends dn {
    public static final /* synthetic */ int k = 0;

    @Override // defpackage.lt3
    public final String M() {
        return "BrowserTabIndexPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_browser_tab_index);
        getWindow().setStatusBarColor(Color.parseColor("#595959"));
        Fragment C = getSupportFragmentManager().C("tabIndex");
        if (C == null) {
            C = new s53();
        }
        p supportFragmentManager = getSupportFragmentManager();
        a k2 = hx2.k(supportFragmentManager, supportFragmentManager);
        if (!C.isAdded()) {
            k2.d(R.id.fl, C, "tabIndex", 1);
        }
        k2.l(C);
        if (!k2.g) {
            k2.h = false;
            k2.q.y(k2, false);
            br.h = true;
            return;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }
}
