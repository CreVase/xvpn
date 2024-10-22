package defpackage;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* loaded from: classes.dex */
public abstract class h3 extends AccessibilityNodeProvider {

    /* renamed from: a, reason: collision with root package name */
    public final v51 f2356a;

    public h3(v51 v51Var) {
        this.f2356a = v51Var;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
        g3 i2 = this.f2356a.i(i);
        if (i2 == null) {
            return null;
        }
        return i2.f2195a;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final List findAccessibilityNodeInfosByText(String str, int i) {
        this.f2356a.getClass();
        return null;
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public final boolean performAction(int i, int i2, Bundle bundle) {
        return this.f2356a.p(i, i2, bundle);
    }
}
