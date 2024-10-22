package defpackage;

import android.graphics.Canvas;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.f;
import com.google.android.material.datepicker.m;

/* loaded from: classes2.dex */
public final class yq1 extends mh2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f5377a;

    public yq1(f fVar) {
        this.f5377a = fVar;
        mi3.d(null);
        mi3.d(null);
    }

    @Override // defpackage.mh2
    public final void d(Canvas canvas, RecyclerView recyclerView) {
        if ((recyclerView.getAdapter() instanceof m) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            int i = f.m;
            this.f5377a.getClass();
            throw null;
        }
    }
}
