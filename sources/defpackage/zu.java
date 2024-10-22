package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class zu extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f5547a;

    /* renamed from: b, reason: collision with root package name */
    public List f5548b;

    public zu() {
        Paint paint = new Paint();
        this.f5547a = paint;
        this.f5548b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // defpackage.mh2
    public final void e(Canvas canvas, RecyclerView recyclerView) {
        Paint paint = this.f5547a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(re2.m3_carousel_debug_keyline_width));
        for (bi1 bi1Var : this.f5548b) {
            bi1Var.getClass();
            ThreadLocal threadLocal = h20.f2355a;
            float f = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).C0()) {
                bi1Var.getClass();
                float l = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.l();
                bi1Var.getClass();
                canvas.drawLine(0.0f, l, 0.0f, ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.i(), paint);
            } else {
                float j = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.j();
                bi1Var.getClass();
                float k = ((CarouselLayoutManager) recyclerView.getLayoutManager()).q.k();
                bi1Var.getClass();
                canvas.drawLine(j, 0.0f, k, 0.0f, paint);
            }
        }
    }
}
