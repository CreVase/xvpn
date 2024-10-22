package defpackage;

import android.view.accessibility.AccessibilityManager;

/* loaded from: classes.dex */
public abstract class n2 {
    public static boolean a(AccessibilityManager accessibilityManager, o2 o2Var) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new p2(o2Var));
    }

    public static boolean b(AccessibilityManager accessibilityManager, o2 o2Var) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new p2(o2Var));
    }
}
