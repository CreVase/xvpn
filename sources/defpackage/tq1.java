package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* loaded from: classes2.dex */
public final class tq1 extends l2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ tq1(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.l2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.d) {
            case 1:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.e).isChecked());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        int i;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        int i2 = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        switch (i2) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i3 = MaterialButtonToggleGroup.k;
                materialButtonToggleGroup.getClass();
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    for (int i5 = 0; i5 < materialButtonToggleGroup.getChildCount(); i5++) {
                        if (materialButtonToggleGroup.getChildAt(i5) == view) {
                            i = i4;
                            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
                            return;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i5) instanceof MaterialButton) && materialButtonToggleGroup.d(i5)) {
                                i4++;
                            }
                        }
                    }
                }
                i = -1;
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.e);
                accessibilityNodeInfo.setChecked(checkableImageButton.isChecked());
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setCheckable(((NavigationMenuItemView) obj).x);
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                g3Var.a(1048576);
                accessibilityNodeInfo.setDismissable(true);
                return;
        }
    }

    @Override // defpackage.l2
    public final boolean g(View view, int i, Bundle bundle) {
        switch (this.d) {
            case 3:
                if (i == 1048576) {
                    ((xw2) ((yo) this.e)).a(3);
                    return true;
                }
                return super.g(view, i, bundle);
            default:
                return super.g(view, i, bundle);
        }
    }
}
