package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.datepicker.f;

/* loaded from: classes2.dex */
public final class wq1 extends l2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wq1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        String string;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setScrollable(false);
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                f fVar = (f) this.e;
                if (fVar.l.getVisibility() == 0) {
                    string = fVar.getString(mf2.mtrl_picker_toggle_to_year_selection);
                } else {
                    string = fVar.getString(mf2.mtrl_picker_toggle_to_day_selection);
                }
                g3Var.j(string);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCollectionInfo(null);
                return;
        }
    }
}
