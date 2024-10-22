package com.security.xvpn.z35kb.purchase;

import a.du;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import defpackage.Cdo;
import defpackage.dn;
import defpackage.ew3;
import defpackage.hx2;
import defpackage.kd2;
import defpackage.t60;

/* loaded from: classes2.dex */
public class PurchaseActivity extends dn implements Cdo {
    public int k;

    @Override // defpackage.Cdo
    public final void D(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            du.d(265, null);
            du.d(283, null);
        }
        int i = this.k;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            if (i != 7) {
                                if (i == 40) {
                                    ew3.i0(str2, t60.H, str);
                                    return;
                                }
                                return;
                            }
                            ew3.i0(str2, t60.B, str);
                            return;
                        }
                        ew3.i0(str2, t60.k, str);
                        return;
                    }
                    ew3.i0(str2, t60.j, str);
                    return;
                }
                ew3.i0(str2, t60.i, str);
                return;
            }
            ew3.i0(str2, t60.l, str);
            return;
        }
        ew3.i0(str2, t60.h, str);
    }

    @Override // defpackage.lt3
    public final String M() {
        return "PurchaseActivity";
    }

    @Override // defpackage.lt3
    public final void R() {
        setContentView(R.layout.activity_base_fragment_container);
        this.k = getIntent().getIntExtra("from", -1);
        p supportFragmentManager = getSupportFragmentManager();
        a k = hx2.k(supportFragmentManager, supportFragmentManager);
        int i = this.k;
        int i2 = kd2.j;
        Bundle bundle = new Bundle();
        bundle.putInt("from", i);
        kd2 kd2Var = new kd2();
        kd2Var.setArguments(bundle);
        k.e(R.id.fragment_container, kd2Var, null);
        k.c("");
        k.h();
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    @Override // defpackage.dn, defpackage.lt3, android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.none, R.anim.slide_bottom_out);
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (this.k == 7) {
            moveTaskToBack(true);
            return;
        }
        finish();
        if (System.currentTimeMillis() == 0) {
            super.onBackPressed();
        }
        if (!ew3.X()) {
            du.d(97, null);
        }
    }
}
