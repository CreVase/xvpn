package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class uz extends l2 {
    public static final Rect o = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final c02 p = new c02(3);
    public static final mp0 q = new mp0(4);
    public final AccessibilityManager h;
    public final View i;
    public qu0 j;
    public final /* synthetic */ Chip n;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    public uz(Chip chip, Chip chip2) {
        this.n = chip;
        if (chip2 != null) {
            this.i = chip2;
            this.h = (AccessibilityManager) chip2.getContext().getSystemService("accessibility");
            chip2.setFocusable(true);
            WeakHashMap weakHashMap = ll3.f3151a;
            if (uk3.c(chip2) == 0) {
                uk3.s(chip2, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    @Override // defpackage.l2
    public final v51 b(View view) {
        if (this.j == null) {
            this.j = new qu0(this);
        }
        return this.j;
    }

    @Override // defpackage.l2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        boolean z;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = this.n;
        wz wzVar = chip.e;
        if (wzVar != null && wzVar.Q) {
            z = true;
        } else {
            z = false;
        }
        accessibilityNodeInfo.setCheckable(z);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        g3Var.i(chip.getAccessibilityClassName());
        CharSequence text = chip.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            g3Var.k(text);
        } else {
            accessibilityNodeInfo.setContentDescription(text);
        }
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        if (i == 1) {
            Chip chip = this.n;
            chip.m = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final g3 k(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        g3 g3Var = new g3(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        g3Var.i("android.view.View");
        Rect rect = o;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        g3Var.f2196b = -1;
        View view = this.i;
        obtain.setParent(view);
        o(i, g3Var);
        if (g3Var.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        g3Var.f(rect2);
        if (!rect2.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) == 0) {
                if ((actions & 128) == 0) {
                    obtain.setPackageName(view.getContext().getPackageName());
                    g3Var.c = i;
                    obtain.setSource(view, i);
                    boolean z2 = false;
                    if (this.k == i) {
                        obtain.setAccessibilityFocused(true);
                        g3Var.a(128);
                    } else {
                        obtain.setAccessibilityFocused(false);
                        g3Var.a(64);
                    }
                    if (this.l == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        g3Var.a(2);
                    } else if (obtain.isFocusable()) {
                        g3Var.a(1);
                    }
                    obtain.setFocused(z);
                    int[] iArr = this.g;
                    view.getLocationOnScreen(iArr);
                    Rect rect3 = this.d;
                    obtain.getBoundsInScreen(rect3);
                    if (rect3.equals(rect)) {
                        g3Var.f(rect3);
                        if (g3Var.f2196b != -1) {
                            g3 g3Var2 = new g3(AccessibilityNodeInfo.obtain());
                            for (int i2 = g3Var.f2196b; i2 != -1; i2 = g3Var2.f2196b) {
                                g3Var2.f2196b = -1;
                                AccessibilityNodeInfo accessibilityNodeInfo = g3Var2.f2195a;
                                accessibilityNodeInfo.setParent(view, -1);
                                accessibilityNodeInfo.setBoundsInParent(rect);
                                o(i2, g3Var2);
                                g3Var2.f(rect2);
                                rect3.offset(rect2.left, rect2.top);
                            }
                        }
                        rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    }
                    Rect rect4 = this.f;
                    if (view.getLocalVisibleRect(rect4)) {
                        rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                        if (rect3.intersect(rect4)) {
                            AccessibilityNodeInfo accessibilityNodeInfo2 = g3Var.f2195a;
                            accessibilityNodeInfo2.setBoundsInScreen(rect3);
                            if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                                Object parent = view.getParent();
                                while (true) {
                                    if (parent instanceof View) {
                                        View view2 = (View) parent;
                                        if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                            break;
                                        }
                                        parent = view2.getParent();
                                    } else if (parent != null) {
                                        z2 = true;
                                    }
                                }
                            }
                            if (z2) {
                                accessibilityNodeInfo2.setVisibleToUser(true);
                            }
                        }
                    }
                    return g3Var;
                }
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
    }

    public final void l(ArrayList arrayList) {
        boolean z = false;
        arrayList.add(0);
        int i = Chip.w;
        Chip chip = this.n;
        if (chip.c()) {
            wz wzVar = chip.e;
            if (wzVar != null && wzVar.K) {
                z = true;
            }
            if (z && chip.h != null) {
                arrayList.add(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0149, code lost:            if (r14 < ((r15 * r15) + ((r13 * 13) * r13))) goto L69;     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(int r19, android.graphics.Rect r20) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uz.m(int, android.graphics.Rect):boolean");
    }

    public final g3 n(int i) {
        if (i == -1) {
            View view = this.i;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(view);
            g3 g3Var = new g3(obtain);
            WeakHashMap weakHashMap = ll3.f3151a;
            view.onInitializeAccessibilityNodeInfo(obtain);
            ArrayList arrayList = new ArrayList();
            l(arrayList);
            if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
                throw new RuntimeException("Views cannot have both real and virtual children");
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                g3Var.f2195a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
            }
            return g3Var;
        }
        return k(i);
    }

    public final void o(int i, g3 g3Var) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        CharSequence charSequence = "";
        if (i == 1) {
            Chip chip = this.n;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                int i2 = mf2.mtrl_chip_close_icon_content_description;
                Object[] objArr = new Object[1];
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                objArr[0] = charSequence;
                accessibilityNodeInfo.setContentDescription(context.getString(i2, objArr).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            g3Var.b(a3.g);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.x);
    }

    public final boolean p(int i) {
        int i2;
        View view = this.i;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.l) != i) {
            if (i2 != Integer.MIN_VALUE) {
                j(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.l = i;
                if (i == 1) {
                    Chip chip = this.n;
                    chip.m = true;
                    chip.refreshDrawableState();
                }
                q(i, 8);
                return true;
            }
        }
        return false;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent obtain;
        if (i != Integer.MIN_VALUE && this.h.isEnabled() && (parent = (view = this.i).getParent()) != null) {
            if (i != -1) {
                obtain = AccessibilityEvent.obtain(i2);
                g3 n = n(i);
                obtain.getText().add(n.g());
                AccessibilityNodeInfo accessibilityNodeInfo = n.f2195a;
                obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
                obtain.setScrollable(accessibilityNodeInfo.isScrollable());
                obtain.setPassword(accessibilityNodeInfo.isPassword());
                obtain.setEnabled(accessibilityNodeInfo.isEnabled());
                obtain.setChecked(accessibilityNodeInfo.isChecked());
                if (obtain.getText().isEmpty() && obtain.getContentDescription() == null) {
                    throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
                }
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                l3.a(obtain, view, i);
                obtain.setPackageName(view.getContext().getPackageName());
            } else {
                obtain = AccessibilityEvent.obtain(i2);
                view.onInitializeAccessibilityEvent(obtain);
            }
            parent.requestSendAccessibilityEvent(view, obtain);
        }
    }
}
