package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class j2 extends View.AccessibilityDelegate {

    /* renamed from: a, reason: collision with root package name */
    public final l2 f2689a;

    public j2(l2 l2Var) {
        this.f2689a = l2Var;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f2689a.a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        v51 b2 = this.f2689a.b(view);
        if (b2 != null) {
            return (AccessibilityNodeProvider) b2.f4780b;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2689a.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        ClickableSpan[] clickableSpanArr;
        int i;
        g3 g3Var = new g3(accessibilityNodeInfo);
        WeakHashMap weakHashMap = ll3.f3151a;
        Boolean bool = (Boolean) new qk3(af2.tag_screen_reader_focusable, 0).b(view);
        boolean z2 = true;
        if (bool != null && bool.booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            accessibilityNodeInfo.setScreenReaderFocusable(z);
        } else {
            g3Var.h(1, z);
        }
        Boolean bool2 = (Boolean) new qk3(af2.tag_accessibility_heading, 3).b(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z2 = false;
        }
        int i3 = 2;
        if (i2 >= 28) {
            accessibilityNodeInfo.setHeading(z2);
        } else {
            g3Var.h(2, z2);
        }
        CharSequence d = ll3.d(view);
        if (i2 >= 28) {
            accessibilityNodeInfo.setPaneTitle(d);
        } else {
            b3.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", d);
        }
        CharSequence charSequence = (CharSequence) new qk3(af2.tag_state_description, 64, 30, i3).b(view);
        if (i2 >= 30) {
            c3.c(accessibilityNodeInfo, charSequence);
        } else {
            b3.c(accessibilityNodeInfo).putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f2689a.d(view, g3Var);
        CharSequence text = accessibilityNodeInfo.getText();
        if (i2 < 26) {
            b3.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            b3.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            b3.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            b3.c(accessibilityNodeInfo).remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SparseArray sparseArray = (SparseArray) view.getTag(af2.tag_accessibility_clickable_spans);
            if (sparseArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < sparseArray.size(); i4++) {
                    if (((WeakReference) sparseArray.valueAt(i4)).get() == null) {
                        arrayList.add(Integer.valueOf(i4));
                    }
                }
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    sparseArray.remove(((Integer) arrayList.get(i5)).intValue());
                }
            }
            if (text instanceof Spanned) {
                clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
            } else {
                clickableSpanArr = null;
            }
            if (clickableSpanArr != null && clickableSpanArr.length > 0) {
                b3.c(g3Var.f2195a).putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", af2.accessibility_action_clickable_span);
                int i6 = af2.tag_accessibility_clickable_spans;
                SparseArray sparseArray2 = (SparseArray) view.getTag(i6);
                if (sparseArray2 == null) {
                    sparseArray2 = new SparseArray();
                    view.setTag(i6, sparseArray2);
                }
                for (int i7 = 0; i7 < clickableSpanArr.length; i7++) {
                    ClickableSpan clickableSpan = clickableSpanArr[i7];
                    int i8 = 0;
                    while (true) {
                        if (i8 < sparseArray2.size()) {
                            if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i8)).get())) {
                                i = sparseArray2.keyAt(i8);
                                break;
                            }
                            i8++;
                        } else {
                            i = g3.d;
                            g3.d = i + 1;
                            break;
                        }
                    }
                    sparseArray2.put(i, new WeakReference(clickableSpanArr[i7]));
                    ClickableSpan clickableSpan2 = clickableSpanArr[i7];
                    Spanned spanned = (Spanned) text;
                    g3Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                    g3Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                    g3Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                    g3Var.c("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                }
            }
        }
        List list = (List) view.getTag(af2.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            g3Var.b((a3) list.get(i9));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f2689a.e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f2689a.f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f2689a.g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f2689a.h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f2689a.i(view, accessibilityEvent);
    }
}
