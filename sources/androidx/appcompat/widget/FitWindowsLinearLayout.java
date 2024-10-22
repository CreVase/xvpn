package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import defpackage.ly0;
import defpackage.vc;

/* loaded from: classes.dex */
public class FitWindowsLinearLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public ly0 f167a;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        ly0 ly0Var = this.f167a;
        if (ly0Var != null) {
            rect.top = ((vc) ly0Var).f4812a.S(null, rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(ly0 ly0Var) {
        this.f167a = ly0Var;
    }
}
