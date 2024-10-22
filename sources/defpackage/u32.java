package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public final class u32 extends v32 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u32(c cVar, int i) {
        super(cVar);
        this.d = i;
    }

    @Override // defpackage.v32
    public final int b(View view) {
        int bottom;
        int i;
        int i2 = this.d;
        c cVar = this.f4775a;
        switch (i2) {
            case 0:
                d dVar = (d) view.getLayoutParams();
                cVar.getClass();
                bottom = view.getRight() + ((d) view.getLayoutParams()).f277b.right;
                i = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                break;
            default:
                d dVar2 = (d) view.getLayoutParams();
                cVar.getClass();
                bottom = view.getBottom() + ((d) view.getLayoutParams()).f277b.bottom;
                i = ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin;
                break;
        }
        return bottom + i;
    }

    @Override // defpackage.v32
    public final int c(View view) {
        int measuredHeight;
        int i;
        int i2 = this.d;
        c cVar = this.f4775a;
        switch (i2) {
            case 0:
                d dVar = (d) view.getLayoutParams();
                cVar.getClass();
                Rect rect = ((d) view.getLayoutParams()).f277b;
                measuredHeight = view.getMeasuredWidth() + rect.left + rect.right + ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) dVar).rightMargin;
                break;
            default:
                d dVar2 = (d) view.getLayoutParams();
                cVar.getClass();
                Rect rect2 = ((d) view.getLayoutParams()).f277b;
                measuredHeight = view.getMeasuredHeight() + rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) dVar2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) dVar2).bottomMargin;
                break;
        }
        return measuredHeight + i;
    }

    @Override // defpackage.v32
    public final int d(View view) {
        int top;
        int i;
        int i2 = this.d;
        c cVar = this.f4775a;
        switch (i2) {
            case 0:
                d dVar = (d) view.getLayoutParams();
                cVar.getClass();
                top = view.getLeft() - ((d) view.getLayoutParams()).f277b.left;
                i = ((ViewGroup.MarginLayoutParams) dVar).leftMargin;
                break;
            default:
                d dVar2 = (d) view.getLayoutParams();
                cVar.getClass();
                top = view.getTop() - ((d) view.getLayoutParams()).f277b.top;
                i = ((ViewGroup.MarginLayoutParams) dVar2).topMargin;
                break;
        }
        return top - i;
    }

    @Override // defpackage.v32
    public final int e() {
        int i = this.d;
        c cVar = this.f4775a;
        switch (i) {
            case 0:
                return cVar.n;
            default:
                return cVar.o;
        }
    }

    @Override // defpackage.v32
    public final int f() {
        int i;
        int B;
        int i2 = this.d;
        c cVar = this.f4775a;
        switch (i2) {
            case 0:
                i = cVar.n;
                B = cVar.D();
                break;
            default:
                i = cVar.o;
                B = cVar.B();
                break;
        }
        return i - B;
    }

    @Override // defpackage.v32
    public final int g() {
        int i = this.d;
        c cVar = this.f4775a;
        switch (i) {
            case 0:
                return cVar.l;
            default:
                return cVar.m;
        }
    }

    @Override // defpackage.v32
    public final int h() {
        int i = this.d;
        c cVar = this.f4775a;
        switch (i) {
            case 0:
                return cVar.C();
            default:
                return cVar.E();
        }
    }

    @Override // defpackage.v32
    public final int i() {
        int E;
        int B;
        int i = this.d;
        c cVar = this.f4775a;
        switch (i) {
            case 0:
                E = cVar.n - cVar.C();
                B = cVar.D();
                break;
            default:
                E = cVar.o - cVar.E();
                B = cVar.B();
                break;
        }
        return E - B;
    }

    @Override // defpackage.v32
    public final int j(View view) {
        int i = this.d;
        Rect rect = this.c;
        c cVar = this.f4775a;
        switch (i) {
            case 0:
                cVar.I(view, rect);
                return rect.right;
            default:
                cVar.I(view, rect);
                return rect.bottom;
        }
    }

    @Override // defpackage.v32
    public final int k(View view) {
        int i = this.d;
        Rect rect = this.c;
        c cVar = this.f4775a;
        switch (i) {
            case 0:
                cVar.I(view, rect);
                return rect.left;
            default:
                cVar.I(view, rect);
                return rect.top;
        }
    }

    @Override // defpackage.v32
    public final void l(int i) {
        int i2 = this.d;
        c cVar = this.f4775a;
        switch (i2) {
            case 0:
                cVar.M(i);
                return;
            default:
                cVar.N(i);
                return;
        }
    }

    public final int m(View view) {
        int measuredWidth;
        int i;
        int i2 = this.d;
        c cVar = this.f4775a;
        switch (i2) {
            case 0:
                d dVar = (d) view.getLayoutParams();
                cVar.getClass();
                Rect rect = ((d) view.getLayoutParams()).f277b;
                measuredWidth = view.getMeasuredHeight() + rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) dVar).topMargin;
                i = ((ViewGroup.MarginLayoutParams) dVar).bottomMargin;
                break;
            default:
                d dVar2 = (d) view.getLayoutParams();
                cVar.getClass();
                Rect rect2 = ((d) view.getLayoutParams()).f277b;
                measuredWidth = view.getMeasuredWidth() + rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) dVar2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) dVar2).rightMargin;
                break;
        }
        return measuredWidth + i;
    }
}
