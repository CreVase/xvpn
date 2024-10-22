package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import defpackage.b5;
import defpackage.c80;
import defpackage.jd;
import defpackage.ju1;
import defpackage.rm3;
import defpackage.uc;
import defpackage.w4;
import defpackage.w93;
import defpackage.ye0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f164a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f165b;
    public TypedValue c;
    public TypedValue d;
    public TypedValue e;
    public TypedValue f;
    public final Rect g;
    public c80 h;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.e == null) {
            this.e = new TypedValue();
        }
        return this.e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f == null) {
            this.f = new TypedValue();
        }
        return this.f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.c == null) {
            this.c = new TypedValue();
        }
        return this.c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.d == null) {
            this.d = new TypedValue();
        }
        return this.d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f164a == null) {
            this.f164a = new TypedValue();
        }
        return this.f164a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f165b == null) {
            this.f165b = new TypedValue();
        }
        return this.f165b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c80 c80Var = this.h;
        if (c80Var != null) {
            c80Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        b5 b5Var;
        super.onDetachedFromWindow();
        c80 c80Var = this.h;
        if (c80Var != null) {
            jd jdVar = ((uc) c80Var).f4648a;
            ye0 ye0Var = jdVar.r;
            if (ye0Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) ye0Var;
                actionBarOverlayLayout.h();
                ActionMenuView actionMenuView = ((w93) actionBarOverlayLayout.e).f4966a.f170a;
                if (actionMenuView != null && (b5Var = actionMenuView.t) != null) {
                    b5Var.i();
                    w4 w4Var = b5Var.t;
                    if (w4Var != null && w4Var.b()) {
                        w4Var.j.dismiss();
                    }
                }
            }
            if (jdVar.w != null) {
                jdVar.l.getDecorView().removeCallbacks(jdVar.x);
                if (jdVar.w.isShowing()) {
                    try {
                        jdVar.w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                jdVar.w = null;
            }
            rm3 rm3Var = jdVar.y;
            if (rm3Var != null) {
                rm3Var.b();
            }
            ju1 ju1Var = jdVar.I(0).h;
            if (ju1Var != null) {
                ju1Var.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(c80 c80Var) {
        this.h = c80Var;
    }
}
