package com.google.android.material.timepicker;

import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import defpackage.a3;
import defpackage.g3;
import defpackage.l2;
import defpackage.xe2;

/* loaded from: classes2.dex */
public final class c extends l2 {
    public final /* synthetic */ ClockFaceView d;

    public c(ClockFaceView clockFaceView) {
        this.d = clockFaceView;
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        int intValue = ((Integer) view.getTag(xe2.material_value_index)).intValue();
        if (intValue > 0) {
            View view2 = (View) this.d.x.get(intValue - 1);
            if (Build.VERSION.SDK_INT >= 22) {
                accessibilityNodeInfo.setTraversalAfter(view2);
            }
        }
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, intValue, 1, false, view.isSelected()));
        accessibilityNodeInfo.setClickable(true);
        g3Var.b(a3.g);
    }

    @Override // defpackage.l2
    public final boolean g(View view, int i, Bundle bundle) {
        if (i == 16) {
            long uptimeMillis = SystemClock.uptimeMillis();
            ClockFaceView clockFaceView = this.d;
            view.getHitRect(clockFaceView.u);
            float centerX = clockFaceView.u.centerX();
            float centerY = clockFaceView.u.centerY();
            clockFaceView.t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, centerX, centerY, 0));
            clockFaceView.t.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, centerX, centerY, 0));
            return true;
        }
        return super.g(view, i, bundle);
    }
}
