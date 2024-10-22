package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;

/* loaded from: classes.dex */
public final class nh2 implements ok3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f3461b;

    public /* synthetic */ nh2(c cVar, int i) {
        this.f3460a = i;
        this.f3461b = cVar;
    }

    public final int a(View view) {
        int bottom;
        int i;
        int i2 = this.f3460a;
        c cVar = this.f3461b;
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

    public final int b(View view) {
        int top;
        int i;
        int i2 = this.f3460a;
        c cVar = this.f3461b;
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

    public final int c() {
        int i;
        int B;
        int i2 = this.f3460a;
        c cVar = this.f3461b;
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
}
