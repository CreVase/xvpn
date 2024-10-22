package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class du3 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1841a;

    public du3(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1841a = true;
    }

    public final boolean getAttachToParent() {
        return this.f1841a;
    }

    public final void setAttachToParent(boolean z) {
        this.f1841a = z;
    }

    public /* synthetic */ du3(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
