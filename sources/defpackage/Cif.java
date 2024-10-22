package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.security.xvpn.z35kb.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: if, reason: invalid class name */
/* loaded from: classes2.dex */
public final class Cif extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2579a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2580b;
    public final float c;
    public final TextPaint d;
    public final RectF e;
    public final Paint f;
    public final int g;

    public Cif(ArrayList arrayList) {
        this.f2579a = arrayList;
        int D = tf3.D(54);
        this.f2580b = D;
        this.c = 20 * tf3.F;
        int D2 = tf3.D(10);
        this.g = tf3.D(1);
        TextPaint textPaint = new TextPaint(5);
        this.d = textPaint;
        textPaint.setTextSize(tf3.D(16));
        textPaint.setColor(v73.j(1000107));
        this.e = new RectF(0.0f, D2, 0.0f, D);
        Paint paint = new Paint(5);
        this.f = paint;
        paint.setColor(v73.j(1000055));
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        int i;
        super.c(rect, view, recyclerView, wh2Var);
        List list = this.f2579a;
        if (list != null && list.size() != 0) {
            this.e.right = recyclerView.getWidth();
            int K = RecyclerView.K(view);
            if (K != -1 && list.size() > K) {
                ef efVar = (ef) list.get(K);
                if (f(K)) {
                    i = this.g;
                } else {
                    i = 0;
                }
                if (efVar.f) {
                    rect.set(0, this.f2580b, 0, i);
                } else {
                    rect.set(0, 0, 0, i);
                }
            }
        }
    }

    @Override // defpackage.mh2
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        View childAt;
        int K;
        int i;
        float f;
        List list = this.f2579a;
        if (list != null && list.size() != 0) {
            Paint paint = this.f;
            paint.setColor(v73.j(1000008));
            TextPaint textPaint = this.d;
            textPaint.setColor(v73.j(1000107));
            float U = (this.f2580b / 2.0f) - tf3.U(textPaint);
            for (int i2 = 0; i2 < recyclerView.getChildCount() && (K = RecyclerView.K((childAt = recyclerView.getChildAt(i2)))) >= 0 && list.size() > K; i2++) {
                ef efVar = (ef) list.get(K);
                boolean z = efVar.f;
                float f2 = this.c;
                if (z) {
                    Context context = recyclerView.getContext();
                    if (efVar.d) {
                        i = R.string.AllApps;
                    } else {
                        i = R.string.SelectedApps;
                    }
                    String string = context.getString(i);
                    if (zf3.R()) {
                        f = (recyclerView.getWidth() - f2) - tf3.d0(string, textPaint);
                    } else {
                        f = f2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, childAt.getTop() - r9);
                    canvas.drawRect(this.e, paint);
                    canvas.restore();
                    canvas.drawText(string, f, (childAt.getTop() - U) + tf3.D(8), textPaint);
                }
                if (f(K)) {
                    float bottom = childAt.getBottom() + this.g;
                    if (zf3.R()) {
                        canvas.drawRect(childAt.getRight() - f2, childAt.getBottom(), childAt.getRight(), bottom, paint);
                    } else {
                        canvas.drawRect(0.0f, childAt.getBottom(), this.c, bottom, paint);
                    }
                }
            }
        }
    }

    public final boolean f(int i) {
        if (i != -1) {
            List list = this.f2579a;
            if (i < list.size() - 1) {
                return !((ef) list.get(i + 1)).f;
            }
            return false;
        }
        return false;
    }
}
