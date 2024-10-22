package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public class eu3 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1998a;

    public eu3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1998a = true;
    }

    public final boolean getAttachToParent() {
        return this.f1998a;
    }

    public final void setAttachToParent(boolean z) {
        this.f1998a = z;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return (LinearLayout.LayoutParams) layoutParams;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LinearLayout.LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return super.generateLayoutParams(layoutParams);
    }

    public /* synthetic */ eu3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
