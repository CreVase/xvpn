package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class b60 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final int f410a = tf3.K(20);

    /* renamed from: b, reason: collision with root package name */
    public final int f411b = tf3.K(15);

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        int i = this.f411b;
        int i2 = this.f410a;
        rect.set(i2, 0, i2, i);
    }
}
