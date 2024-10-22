package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes.dex */
public class i3 extends h3 {
    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo findFocus(int i) {
        g3 j = this.f2356a.j(i);
        if (j == null) {
            return null;
        }
        return j.f2195a;
    }
}
