package com.security.xvpn.z35kb.purchase;

import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import b.ContentWrapper;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import defpackage.Cdo;
import defpackage.ew3;
import defpackage.kj1;
import defpackage.l7;
import defpackage.m20;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.zb2;
import defpackage.zo;

/* loaded from: classes2.dex */
public final class StartAppGuideToPurchaseActivity extends zo implements Cdo {
    public static final /* synthetic */ int n = 0;
    public final zb2[] l = ew3.F();
    public final ui1 m = m20.D0(kj1.f2953a, new tc0(this, 13));

    @Override // defpackage.Cdo
    public final /* synthetic */ void D(String str, String str2) {
    }

    @Override // defpackage.lt3
    public final String M() {
        return "StartAppGuideToPurchaseActivity";
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    @Override // defpackage.zo
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final l7 Z() {
        return (l7) this.m.getValue();
    }

    public final void c0() {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(tf3.I * 2, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(tf3.H, 1073741824);
        ContentWrapper contentWrapper = this.k;
        if (contentWrapper == null || contentWrapper.getWindowInsets() == null) {
            new Rect();
        }
        int S = tf3.I - tf3.S(25);
        Z().f.measure(makeMeasureSpec2, makeMeasureSpec);
        int min = Math.min(S, Z().f.getMeasuredHeight());
        Integer[] numArr = {Integer.valueOf(R.id.tmpSpace4), Integer.valueOf(R.id.tmpSpace1), Integer.valueOf(R.id.tmpSpace5), Integer.valueOf(R.id.tmpSpace6), Integer.valueOf(R.id.tmpSpace2), Integer.valueOf(R.id.tmpSpace3)};
        for (int i = 0; i < 6; i++) {
            int intValue = numArr[i].intValue();
            Z().g.measure(makeMeasureSpec2, makeMeasureSpec);
            if (min < Z().f.getMeasuredHeight()) {
                m20.u0(findViewById(intValue));
                Z().f.requestLayout();
            }
        }
        Z().f.measure(makeMeasureSpec2, makeMeasureSpec);
        Z().f.measure(makeMeasureSpec2, makeMeasureSpec);
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        moveTaskToBack(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ac  */
    @Override // defpackage.zo, defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r13) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.purchase.StartAppGuideToPurchaseActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (ew3.o()) {
            TextView textView = Z().m;
            if (textView != null) {
                textView.setVisibility(8);
            }
            View view = Z().p;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        if (ew3.X()) {
            tf3.h0(this, MainActivity.class, null, 0, 6);
            finish();
        }
    }
}
