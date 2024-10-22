package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class fh2 {

    /* renamed from: a, reason: collision with root package name */
    public final gh2 f2091a = new gh2();

    /* renamed from: b, reason: collision with root package name */
    public boolean f2092b = false;
    public int c = 1;

    public final void A(boolean z) {
        if (!this.f2091a.a()) {
            this.f2092b = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public final void a(h hVar, int i) {
        boolean z;
        if (hVar.s == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hVar.c = i;
            if (this.f2092b) {
                hVar.e = d(i);
            }
            hVar.j = (hVar.j & (-520)) | 1;
            int i2 = qa3.f3976a;
            pa3.a("RV OnBindView");
        }
        hVar.s = this;
        boolean z2 = RecyclerView.L0;
        View view = hVar.f281a;
        if (z2) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (xk3.b(view) != hVar.t()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + hVar.t() + ", attached to window: " + xk3.b(view) + ", holder: " + hVar);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = ll3.f3151a;
                if (xk3.b(view)) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + hVar);
                }
            }
        }
        o(hVar, i, hVar.g());
        if (z) {
            ArrayList arrayList = hVar.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            hVar.j &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof d) {
                ((d) layoutParams).c = true;
            }
            int i3 = qa3.f3976a;
            pa3.b();
        }
    }

    public int b(fh2 fh2Var, h hVar, int i) {
        if (fh2Var == this) {
            return i;
        }
        return -1;
    }

    public abstract int c();

    public long d(int i) {
        return -1L;
    }

    public int e(int i) {
        return 0;
    }

    public final void f() {
        this.f2091a.b();
    }

    public final void g(int i) {
        this.f2091a.c(i, 1, null);
    }

    public final void i(int i, Object obj) {
        this.f2091a.c(i, 1, obj);
    }

    public final void l(int i, int i2) {
        this.f2091a.d(i, i2);
    }

    public void m(RecyclerView recyclerView) {
    }

    public abstract void n(h hVar, int i);

    public void o(h hVar, int i, List list) {
        n(hVar, i);
    }

    public abstract h s(RecyclerView recyclerView, int i);

    public void t(RecyclerView recyclerView) {
    }

    public boolean v(h hVar) {
        return false;
    }

    public void w(h hVar) {
    }

    public void y(h hVar) {
    }

    public void z(h hVar) {
    }
}
