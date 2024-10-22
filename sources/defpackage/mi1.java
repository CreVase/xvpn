package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes2.dex */
public final class mi1 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3303a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3304b;

    public /* synthetic */ mi1(Object obj, int i) {
        this.f3303a = i;
        this.f3304b = obj;
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        int i;
        int i2 = this.f3303a;
        Object obj = this.f3304b;
        switch (i2) {
            case 0:
                super.c(rect, view, recyclerView, wh2Var);
                recyclerView.getClass();
                if (RecyclerView.K(view) != 0) {
                    rect.top = tf3.K(1);
                    return;
                }
                return;
            case 1:
                recyclerView.getClass();
                if (RecyclerView.K(view) == tf3.N((List) obj)) {
                    i = 25;
                } else {
                    i = 10;
                }
                rect.bottom = tf3.K(i);
                return;
            default:
                super.c(rect, view, recyclerView, wh2Var);
                recyclerView.getClass();
                if (RecyclerView.K(view) != 0) {
                    rect.top = ((kd2) obj).i;
                    return;
                }
                return;
        }
    }

    @Override // defpackage.mh2
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        switch (this.f3303a) {
            case 0:
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    Rect rect = (Rect) this.f3304b;
                    rect.set(0, childAt.getTop() - tf3.K(1), canvas.getWidth(), childAt.getTop());
                    System.out.getClass();
                    canvas.drawRect(rect, tf3.E(v73.j(1000011)));
                }
                return;
            default:
                return;
        }
    }

    public mi1() {
        this.f3303a = 0;
        this.f3304b = new Rect();
    }
}
