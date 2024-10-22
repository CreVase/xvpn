package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes2.dex */
public final class px1 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3933a;

    public /* synthetic */ px1(int i) {
        this.f3933a = i;
    }

    @Override // defpackage.mh2
    public final void c(Rect rect, View view, RecyclerView recyclerView, wh2 wh2Var) {
        int i;
        switch (this.f3933a) {
            case 0:
                rx rxVar = (rx) recyclerView.getAdapter();
                int K = RecyclerView.K(view);
                int e = rxVar.e(K);
                if ((e == 0 || e == 3 || e == 4) && K == 0) {
                    i = cz.f1703b * 2;
                } else {
                    i = 0;
                }
                rect.set(0, i, 0, 0);
                return;
            default:
                super.c(rect, view, recyclerView, wh2Var);
                rect.bottom = tf3.K(17);
                return;
        }
    }
}
