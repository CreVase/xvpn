package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public final class pq2 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public List f3900a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3901b;
    public final float c;
    public final TextPaint d;
    public final RectF e;
    public final Paint f;

    public pq2() {
        new HashMap();
        TextPaint textPaint = new TextPaint(5);
        this.f3900a = null;
        int D = tf3.D(20);
        this.f3901b = D;
        this.c = 15 * tf3.F;
        TextPaint textPaint2 = new TextPaint(5);
        this.d = textPaint2;
        textPaint2.setTextSize(tf3.D(12));
        textPaint2.setColor(v73.j(1000056));
        this.e = new RectF(0.0f, 0.0f, 0.0f, D);
        Paint paint = new Paint(5);
        this.f = paint;
        paint.setColor(v73.j(1000055));
        textPaint.setTypeface(n01.b());
        textPaint.setTextSize(tf3.D(12));
        textPaint.setColor(v73.j(1000014));
        tf3.D(6);
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        super.c(rect, view, recyclerView, wh2Var);
        List list = this.f3900a;
        if (list != null && list.size() != 0) {
            this.e.right = recyclerView.getWidth();
            int K = RecyclerView.K(view);
            if (K != -1 && this.f3900a.size() > K && f(K)) {
                rect.set(0, this.f3901b, 0, 0);
            }
        }
    }

    @Override // defpackage.mh2
    public final void d(Canvas canvas, RecyclerView recyclerView) {
    }

    @Override // defpackage.mh2
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        View childAt;
        int K;
        boolean z;
        float f;
        List list = this.f3900a;
        if (list != null && list.size() != 0) {
            Paint paint = this.f;
            paint.setColor(v73.j(1000055));
            TextPaint textPaint = this.d;
            textPaint.setColor(v73.j(1000056));
            int i = this.f3901b;
            float U = tf3.U(textPaint) + (i / 2.0f);
            int i2 = 0;
            while (i2 < recyclerView.getChildCount() && (K = RecyclerView.K((childAt = recyclerView.getChildAt(i2)))) >= 0 && this.f3900a.size() > K) {
                zp2 zp2Var = (zp2) ((gc3) this.f3900a.get(K)).d;
                String str = zp2Var.f;
                boolean R = zf3.R();
                float f2 = this.c;
                if (R) {
                    f2 = (recyclerView.getWidth() - f2) - tf3.d0(str, textPaint);
                }
                float top = childAt.getTop() - i;
                boolean f3 = f(K);
                RectF rectF = this.e;
                int i3 = i;
                if (f3 && top >= 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, top);
                    canvas.drawRect(rectF, paint);
                    canvas.drawText(str, f2, U, textPaint);
                    canvas.restore();
                }
                if (K != this.f3900a.size() - 1 && (this.f3900a.size() <= 0 || TextUtils.equals(((zp2) ((gc3) this.f3900a.get(K + 1)).d).f, zp2Var.f))) {
                    z = false;
                } else {
                    z = true;
                }
                if (z && childAt.getBottom() < childAt.getTop() - top) {
                    f = (childAt.getBottom() - childAt.getTop()) + top;
                } else {
                    f = 0.0f;
                }
                if (this.f3900a.size() > K && ((zp2) ((gc3) this.f3900a.get(K)).d).k >= 0 && top < 0.0f) {
                    canvas.save();
                    canvas.translate(0.0f, f);
                    canvas.drawRect(rectF, paint);
                    canvas.drawText(str, f2, U, textPaint);
                    canvas.restore();
                }
                i2++;
                i = i3;
            }
        }
    }

    public final boolean f(int i) {
        zp2 zp2Var = (zp2) ((gc3) this.f3900a.get(i)).d;
        if (i == 0) {
            return !TextUtils.isEmpty(zp2Var.f);
        }
        return !TextUtils.equals(((zp2) ((gc3) this.f3900a.get(i - 1)).d).f, zp2Var.f);
    }
}
