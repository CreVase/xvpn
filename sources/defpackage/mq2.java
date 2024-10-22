package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.fragment.app.l;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class mq2 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3340b;
    public final int c;
    public final int d;
    public final int e;
    public final Rect f = new Rect();
    public final Paint g;

    public mq2(l lVar, int i) {
        Paint paint = new Paint();
        this.g = paint;
        this.f3339a = Math.max((int) (bx3.z(lVar) * 1), 1);
        this.f3340b = (int) (bx3.z(lVar) * i);
        this.c = (int) (bx3.z(lVar) * 0);
        this.e = 1000053;
        this.d = 1000050;
        paint.setColor(1000053);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        super.c(rect, view, recyclerView, wh2Var);
        rect.bottom = this.f3339a;
    }

    @Override // defpackage.mh2
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        Rect rect = this.f;
        rect.bottom = 0;
        for (int i = 0; i < recyclerView.getChildCount(); i++) {
            View childAt = recyclerView.getChildAt(i);
            int i2 = this.f3340b;
            rect.left = i2;
            int measuredWidth = recyclerView.getMeasuredWidth();
            int i3 = this.c;
            rect.right = measuredWidth - i3;
            int translationY = (int) (childAt.getTranslationY() + Math.round(childAt.getTop()));
            rect.bottom = translationY;
            rect.top = translationY - this.f3339a;
            Paint paint = this.g;
            paint.setColor(v73.j(this.e));
            canvas.drawRect(rect, paint);
            int i4 = this.d;
            if (i4 != 0) {
                paint.setColor(v73.j(i4));
                if (i2 > 0) {
                    rect.left = 0;
                    rect.right = i2;
                    canvas.drawRect(rect, paint);
                }
                if (i3 > 0) {
                    rect.left = recyclerView.getMeasuredWidth() - i3;
                    rect.right = recyclerView.getMeasuredWidth();
                    canvas.drawRect(rect, paint);
                }
            }
        }
    }
}
