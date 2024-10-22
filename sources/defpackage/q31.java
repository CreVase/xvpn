package defpackage;

import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class q31 extends l2 {
    public final /* synthetic */ FullDragDrawerLayout d;

    public q31(FullDragDrawerLayout fullDragDrawerLayout) {
        this.d = fullDragDrawerLayout;
        new Rect();
    }

    @Override // defpackage.l2
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32) {
            accessibilityEvent.getText();
            FullDragDrawerLayout fullDragDrawerLayout = this.d;
            View f = fullDragDrawerLayout.f();
            if (f != null) {
                int h = fullDragDrawerLayout.h(f);
                fullDragDrawerLayout.getClass();
                WeakHashMap weakHashMap = ll3.f3151a;
                Gravity.getAbsoluteGravity(h, vk3.d(fullDragDrawerLayout));
                return true;
            }
            return true;
        }
        return super.a(view, accessibilityEvent);
    }

    @Override // defpackage.l2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        int[] iArr = FullDragDrawerLayout.C;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        g3Var.i("androidx.drawerlayout.widget.DrawerLayout");
        accessibilityNodeInfo.setFocusable(false);
        accessibilityNodeInfo.setFocused(false);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) a3.e.f18a);
        accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) a3.f.f18a);
    }

    @Override // defpackage.l2
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        int[] iArr = FullDragDrawerLayout.C;
        return super.f(viewGroup, view, accessibilityEvent);
    }
}
