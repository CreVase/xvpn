package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.widget.b;

/* loaded from: classes.dex */
public final class he extends hl1 implements ie {
    public CharSequence D;
    public ListAdapter E;
    public final Rect F;
    public int G;
    public final /* synthetic */ b H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he(b bVar, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.H = bVar;
        this.F = new Rect();
        this.o = bVar;
        this.y = true;
        this.z.setFocusable(true);
        this.p = new i9(1, this, bVar);
    }

    @Override // defpackage.ie
    public final CharSequence f() {
        return this.D;
    }

    @Override // defpackage.ie
    public final void h(CharSequence charSequence) {
        this.D = charSequence;
    }

    @Override // defpackage.ie
    public final void m(int i) {
        this.G = i;
    }

    @Override // defpackage.ie
    public final void n(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean b2 = b();
        r();
        td tdVar = this.z;
        tdVar.setInputMethodMode(2);
        show();
        go0 go0Var = this.c;
        go0Var.setChoiceMode(1);
        ce.d(go0Var, i);
        ce.c(go0Var, i2);
        b bVar = this.H;
        int selectedItemPosition = bVar.getSelectedItemPosition();
        go0 go0Var2 = this.c;
        if (b() && go0Var2 != null) {
            go0Var2.setListSelectionHidden(false);
            go0Var2.setSelection(selectedItemPosition);
            if (go0Var2.getChoiceMode() != 0) {
                go0Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!b2 && (viewTreeObserver = bVar.getViewTreeObserver()) != null) {
            bv bvVar = new bv(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(bvVar);
            tdVar.setOnDismissListener(new ge(this, bvVar));
        }
    }

    @Override // defpackage.hl1, defpackage.ie
    public final void p(ListAdapter listAdapter) {
        super.p(listAdapter);
        this.E = listAdapter;
    }

    public final void r() {
        int i;
        int i2;
        Drawable g = g();
        b bVar = this.H;
        if (g != null) {
            g.getPadding(bVar.h);
            if (bn3.a(bVar)) {
                i = bVar.h.right;
            } else {
                i = -bVar.h.left;
            }
        } else {
            Rect rect = bVar.h;
            rect.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = bVar.getPaddingLeft();
        int paddingRight = bVar.getPaddingRight();
        int width = bVar.getWidth();
        int i3 = bVar.g;
        if (i3 == -2) {
            int a2 = bVar.a((SpinnerAdapter) this.E, g());
            int i4 = bVar.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = bVar.h;
            int i5 = (i4 - rect2.left) - rect2.right;
            if (a2 > i5) {
                a2 = i5;
            }
            q(Math.max(a2, (width - paddingLeft) - paddingRight));
        } else if (i3 == -1) {
            q((width - paddingLeft) - paddingRight);
        } else {
            q(i3);
        }
        if (bn3.a(bVar)) {
            i2 = (((width - paddingRight) - this.e) - this.G) + i;
        } else {
            i2 = paddingLeft + this.G + i;
        }
        this.f = i2;
    }
}
