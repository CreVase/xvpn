package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class on0 extends mh2 implements w73 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3698a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3699b = Math.max(1, tf3.J(0.5f));
    public final int c = tf3.K(15);
    public final int d = tf3.K(20);
    public final Rect e;
    public final Paint f;
    public final Paint g;
    public final Paint h;

    public on0(ArrayList arrayList) {
        this.f3698a = arrayList;
        int j = v73.j(1000003);
        int j2 = v73.j(1000010);
        this.e = new Rect();
        Paint paint = new Paint(5);
        paint.setColor(j2);
        this.f = paint;
        Paint paint2 = new Paint(5);
        paint2.setColor(j);
        this.g = paint2;
        Paint paint3 = new Paint(5);
        paint3.setColor(v73.j(1000008));
        this.h = paint3;
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        boolean z;
        boolean z2;
        super.c(rect, view, recyclerView, wh2Var);
        recyclerView.getClass();
        int K = RecyclerView.K(view);
        boolean z3 = false;
        List list = this.f3698a;
        if (K >= 0 && K < list.size()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return;
        }
        int i = ((nn0) list.get(K)).d;
        int i2 = i & 1;
        int i3 = this.f3699b;
        if (i2 > 0) {
            rect.top = this.d + i3 + rect.top;
        }
        if ((i & 8) > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 2) > 0) {
            z3 = true;
        }
        if (z3 | z2) {
            rect.top += i3;
        }
        if ((i & 4) > 0) {
            rect.bottom += i3;
        }
    }

    @Override // defpackage.mh2
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        boolean Y = tf3.Y(recyclerView);
        Iterator it = ew3.O0(recyclerView).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            recyclerView.getClass();
            int K = RecyclerView.K(view);
            boolean z3 = true;
            List list = this.f3698a;
            if (K >= 0 && K < list.size()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return;
            }
            int i3 = ((nn0) list.get(K)).d;
            int i4 = i3 & 1;
            int i5 = this.f3699b;
            Rect rect = this.e;
            if (i4 > 0) {
                rect.set(0, (view.getTop() - i5) - this.d, canvas.getWidth(), view.getTop());
                canvas.drawRect(rect, this.g);
            }
            if ((i3 & 2) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i4 <= 0) {
                z3 = false;
            }
            boolean z4 = z3 | z2;
            Paint paint = this.f;
            if (z4) {
                rect.set(0, view.getTop() - i5, canvas.getWidth(), view.getTop());
                canvas.drawRect(rect, paint);
            }
            if ((i3 & 8) > 0) {
                int width = canvas.getWidth();
                int i6 = this.c;
                if (Y) {
                    width = canvas.getWidth() - i6;
                    i = 0;
                } else {
                    i = i6;
                }
                rect.set(i, view.getTop() - i5, width, view.getTop());
                canvas.drawRect(rect, paint);
                if (Y) {
                    i2 = canvas.getWidth() - i6;
                    i6 = canvas.getWidth();
                } else {
                    i2 = 0;
                }
                rect.set(i2, view.getTop() - i5, i6, view.getTop());
                canvas.drawRect(rect, this.h);
            }
            if ((i3 & 4) > 0) {
                rect.set(0, view.getBottom(), canvas.getWidth(), view.getBottom() + i5);
                canvas.drawRect(rect, paint);
            }
        }
    }

    @Override // defpackage.w73
    public final boolean h() {
        return true;
    }

    @Override // defpackage.w73
    public final void p(boolean z) {
        this.f.setColor(v73.j(1000010));
        this.g.setColor(v73.j(1000003));
        this.h.setColor(v73.j(1000008));
    }
}
