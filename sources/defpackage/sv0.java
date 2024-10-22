package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class sv0 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4419a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4420b;

    public sv0() {
        this.f4419a = 0;
        this.f4420b = tf3.K(10);
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        int i;
        int i2 = this.f4419a;
        int i3 = this.f4420b;
        switch (i2) {
            case 0:
                super.c(rect, view, recyclerView, wh2Var);
                recyclerView.getClass();
                if (RecyclerView.K(view) == recyclerView.getAdapter().c() - 1) {
                    i = i3;
                } else {
                    i = 0;
                }
                rect.set(0, i3, 0, i);
                return;
            default:
                super.c(rect, view, recyclerView, wh2Var);
                rect.bottom = i3;
                return;
        }
    }

    public sv0(int i) {
        this.f4419a = 1;
        this.f4420b = i;
    }
}
