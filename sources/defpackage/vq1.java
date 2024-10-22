package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import com.google.android.material.datepicker.f;

/* loaded from: classes2.dex */
public final class vq1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4878b;

    public vq1(f fVar, int i) {
        this.f4878b = fVar;
        this.f4877a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RecyclerView recyclerView = this.f4878b.h;
        if (!recyclerView.x) {
            c cVar = recyclerView.n;
            if (cVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                cVar.x0(recyclerView, this.f4877a);
            }
        }
    }
}
