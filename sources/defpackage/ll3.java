package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class ll3 {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f3151a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f3152b;
    public static boolean c;
    public static ThreadLocal d;
    public static final int[] e;
    public static final pk3 f;
    public static final rk3 g;

    static {
        new AtomicInteger(1);
        f3151a = null;
        c = false;
        e = new int[]{af2.accessibility_custom_action_0, af2.accessibility_custom_action_1, af2.accessibility_custom_action_2, af2.accessibility_custom_action_3, af2.accessibility_custom_action_4, af2.accessibility_custom_action_5, af2.accessibility_custom_action_6, af2.accessibility_custom_action_7, af2.accessibility_custom_action_8, af2.accessibility_custom_action_9, af2.accessibility_custom_action_10, af2.accessibility_custom_action_11, af2.accessibility_custom_action_12, af2.accessibility_custom_action_13, af2.accessibility_custom_action_14, af2.accessibility_custom_action_15, af2.accessibility_custom_action_16, af2.accessibility_custom_action_17, af2.accessibility_custom_action_18, af2.accessibility_custom_action_19, af2.accessibility_custom_action_20, af2.accessibility_custom_action_21, af2.accessibility_custom_action_22, af2.accessibility_custom_action_23, af2.accessibility_custom_action_24, af2.accessibility_custom_action_25, af2.accessibility_custom_action_26, af2.accessibility_custom_action_27, af2.accessibility_custom_action_28, af2.accessibility_custom_action_29, af2.accessibility_custom_action_30, af2.accessibility_custom_action_31};
        f = new pk3();
        g = new rk3();
    }

    public static rm3 a(View view) {
        if (f3151a == null) {
            f3151a = new WeakHashMap();
        }
        rm3 rm3Var = (rm3) f3151a.get(view);
        if (rm3Var == null) {
            rm3 rm3Var2 = new rm3(view);
            f3151a.put(view, rm3Var2);
            return rm3Var2;
        }
        return rm3Var;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = kl3.d;
        int i = af2.tag_unhandled_key_event_manager;
        kl3 kl3Var = (kl3) view.getTag(i);
        if (kl3Var == null) {
            kl3Var = new kl3();
            view.setTag(i, kl3Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = kl3Var.f2969a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = kl3.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (kl3Var.f2969a == null) {
                        kl3Var.f2969a = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = kl3.d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            kl3Var.f2969a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                kl3Var.f2969a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a2 = kl3Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (kl3Var.f2970b == null) {
                    kl3Var.f2970b = new SparseArray();
                }
                kl3Var.f2970b.put(keyCode, new WeakReference(a2));
            }
        }
        if (a2 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return fl3.a(view);
        }
        if (c) {
            return null;
        }
        if (f3152b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f3152b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f3152b.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static CharSequence d(View view) {
        return (CharSequence) new qk3(af2.tag_accessibility_pane_title, 8, 28, 1).b(view);
    }

    public static ArrayList e(View view) {
        int i = af2.tag_accessibility_actions;
        ArrayList arrayList = (ArrayList) view.getTag(i);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(i, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static Rect f() {
        if (d == null) {
            d = new ThreadLocal();
        }
        Rect rect = (Rect) d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static String[] g(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return hl3.a(view);
        }
        return (String[]) view.getTag(af2.tag_on_receive_content_mime_types);
    }

    public static wq3 h(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return bl3.a(view);
        }
        return al3.j(view);
    }

    public static void i(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (d(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (xk3.a(view) == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                xk3.g(obtain, i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(d(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    xk3.e(view.getParent(), view, view, i);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = 2048;
        }
        obtain2.setEventType(i2);
        xk3.g(obtain2, i);
        if (z) {
            obtain2.getText().add(d(view));
            if (uk3.c(view) == 0) {
                uk3.s(view, 1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void j(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect f2 = f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !f2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z && f2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f2);
        }
    }

    public static void k(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect f2 = f();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            f2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !f2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            s(view);
            Object parent2 = view.getParent();
            if (parent2 instanceof View) {
                s((View) parent2);
            }
        }
        if (z && f2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(f2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static h80 l(View view, h80 h80Var) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(h80Var);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return hl3.b(view, h80Var);
        }
        z22 z22Var = (z22) view.getTag(af2.tag_on_receive_content_listener);
        a32 a32Var = f;
        if (z22Var != null) {
            h80 a2 = ((t73) z22Var).a(view, h80Var);
            if (a2 == null) {
                return null;
            }
            if (view instanceof a32) {
                a32Var = (a32) view;
            }
            return a32Var.a(a2);
        }
        if (view instanceof a32) {
            a32Var = (a32) view;
        }
        return a32Var.a(h80Var);
    }

    public static void m(View view, int i) {
        ArrayList e2 = e(view);
        for (int i2 = 0; i2 < e2.size(); i2++) {
            if (((a3) e2.get(i2)).a() == i) {
                e2.remove(i2);
                return;
            }
        }
    }

    public static void n(View view, a3 a3Var, t3 t3Var) {
        l2 l2Var;
        if (t3Var == null) {
            m(view, a3Var.a());
            i(view, 0);
            return;
        }
        a3 a3Var2 = new a3(null, a3Var.f19b, null, t3Var, a3Var.c);
        View.AccessibilityDelegate c2 = c(view);
        if (c2 == null) {
            l2Var = null;
        } else if (c2 instanceof j2) {
            l2Var = ((j2) c2).f2689a;
        } else {
            l2Var = new l2(c2);
        }
        if (l2Var == null) {
            l2Var = new l2();
        }
        p(view, l2Var);
        m(view, a3Var2.a());
        e(view).add(a3Var2);
        i(view, 0);
    }

    public static void o(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            fl3.d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void p(View view, l2 l2Var) {
        j2 j2Var;
        if (l2Var == null && (c(view) instanceof j2)) {
            l2Var = new l2();
        }
        if (uk3.c(view) == 0) {
            uk3.s(view, 1);
        }
        if (l2Var == null) {
            j2Var = null;
        } else {
            j2Var = l2Var.f3050b;
        }
        view.setAccessibilityDelegate(j2Var);
    }

    public static void q(View view, CharSequence charSequence) {
        boolean z = true;
        new qk3(af2.tag_accessibility_pane_title, 8, 28, true ? 1 : 0).c(view, charSequence);
        rk3 rk3Var = g;
        if (charSequence != null) {
            WeakHashMap weakHashMap = rk3Var.f4170a;
            if (!view.isShown() || view.getWindowVisibility() != 0) {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(rk3Var);
            if (xk3.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(rk3Var);
                return;
            }
            return;
        }
        rk3Var.f4170a.remove(view);
        view.removeOnAttachStateChangeListener(rk3Var);
        uk3.o(view.getViewTreeObserver(), rk3Var);
    }

    public static void r(View view, ColorStateList colorStateList) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        al3.q(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (al3.g(view) == null && al3.h(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                uk3.q(view, background);
            }
        }
    }

    public static void s(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
