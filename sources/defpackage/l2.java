package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class l2 {
    public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();

    /* renamed from: a, reason: collision with root package name */
    public final View.AccessibilityDelegate f3049a;

    /* renamed from: b, reason: collision with root package name */
    public final j2 f3050b;

    public l2() {
        this(c);
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3049a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public v51 b(View view) {
        AccessibilityNodeProvider a2 = k2.a(this.f3049a, view);
        if (a2 != null) {
            return new v51(a2, 12);
        }
        return null;
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.f3049a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, g3 g3Var) {
        this.f3049a.onInitializeAccessibilityNodeInfo(view, g3Var.f2195a);
    }

    public void e(View view, AccessibilityEvent accessibilityEvent) {
        this.f3049a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3049a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean g(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(af2.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            a3 a3Var = (a3) list.get(i2);
            if (a3Var.a() == i) {
                t3 t3Var = a3Var.d;
                if (t3Var != null) {
                    Class cls = a3Var.c;
                    if (cls != null) {
                        try {
                            p71.C(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                            throw null;
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    z = t3Var.b(view);
                }
            } else {
                i2++;
            }
        }
        z = false;
        if (!z) {
            z = k2.b(this.f3049a, view, i, bundle);
        }
        if (!z && i == af2.accessibility_action_clickable_span && bundle != null) {
            int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
            SparseArray sparseArray = (SparseArray) view.getTag(af2.tag_accessibility_clickable_spans);
            if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null) {
                ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
                if (clickableSpan != null) {
                    CharSequence text = view.createAccessibilityNodeInfo().getText();
                    if (text instanceof Spanned) {
                        clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                    }
                    for (int i4 = 0; clickableSpanArr != null && i4 < clickableSpanArr.length; i4++) {
                        if (clickableSpan.equals(clickableSpanArr[i4])) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (z2) {
                    clickableSpan.onClick(view);
                    z3 = true;
                }
            }
            return z3;
        }
        return z;
    }

    public void h(View view, int i) {
        this.f3049a.sendAccessibilityEvent(view, i);
    }

    public void i(View view, AccessibilityEvent accessibilityEvent) {
        this.f3049a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public l2(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3049a = accessibilityDelegate;
        this.f3050b = new j2(this);
    }
}
