package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.h;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class pz {

    /* renamed from: a, reason: collision with root package name */
    public final b f3942a;
    public View e;
    public int d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final gw3 f3943b = new gw3(1);
    public final ArrayList c = new ArrayList();

    public pz(b bVar) {
        this.f3942a = bVar;
    }

    public final void a(View view, boolean z, int i) {
        int f;
        b bVar = this.f3942a;
        if (i < 0) {
            f = bVar.c();
        } else {
            f = f(i);
        }
        this.f3943b.e(f, z);
        if (z) {
            i(view);
        }
        RecyclerView recyclerView = bVar.f273a;
        recyclerView.addView(view, f);
        h M = RecyclerView.M(view);
        fh2 fh2Var = recyclerView.m;
        if (fh2Var != null && M != null) {
            fh2Var.w(M);
        }
    }

    public final void b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int f;
        b bVar = this.f3942a;
        if (i < 0) {
            f = bVar.c();
        } else {
            f = f(i);
        }
        this.f3943b.e(f, z);
        if (z) {
            i(view);
        }
        bVar.getClass();
        h M = RecyclerView.M(view);
        RecyclerView recyclerView = bVar.f273a;
        if (M != null) {
            if (!M.t() && !M.z()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(M);
                throw new IllegalArgumentException(hx2.l(recyclerView, sb));
            }
            if (RecyclerView.M0) {
                M.toString();
            }
            M.j &= -257;
        } else if (RecyclerView.L0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(f);
            throw new IllegalArgumentException(hx2.l(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, f, layoutParams);
    }

    public final void c(int i) {
        int f = f(i);
        this.f3943b.f(f);
        b bVar = this.f3942a;
        View childAt = bVar.f273a.getChildAt(f);
        RecyclerView recyclerView = bVar.f273a;
        if (childAt != null) {
            h M = RecyclerView.M(childAt);
            if (M != null) {
                if (M.t() && !M.z()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(M);
                    throw new IllegalArgumentException(hx2.l(recyclerView, sb));
                }
                if (RecyclerView.M0) {
                    M.toString();
                }
                M.c(UserVerificationMethods.USER_VERIFY_HANDPRINT);
            }
        } else if (RecyclerView.L0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f);
            throw new IllegalArgumentException(hx2.l(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f);
    }

    public final View d(int i) {
        return this.f3942a.f273a.getChildAt(f(i));
    }

    public final int e() {
        return this.f3942a.c() - this.c.size();
    }

    public final int f(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.f3942a.c();
        int i2 = i;
        while (i2 < c) {
            gw3 gw3Var = this.f3943b;
            int b2 = i - (i2 - gw3Var.b(i2));
            if (b2 == 0) {
                while (gw3Var.d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b2;
        }
        return -1;
    }

    public final View g(int i) {
        return this.f3942a.f273a.getChildAt(i);
    }

    public final int h() {
        return this.f3942a.c();
    }

    public final void i(View view) {
        this.c.add(view);
        b bVar = this.f3942a;
        bVar.getClass();
        h M = RecyclerView.M(view);
        if (M != null) {
            int i = M.q;
            View view2 = M.f281a;
            if (i != -1) {
                M.p = i;
            } else {
                WeakHashMap weakHashMap = ll3.f3151a;
                M.p = uk3.c(view2);
            }
            RecyclerView recyclerView = bVar.f273a;
            if (recyclerView.O()) {
                M.q = 4;
                recyclerView.F0.add(M);
            } else {
                WeakHashMap weakHashMap2 = ll3.f3151a;
                uk3.s(view2, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.c.contains(view);
    }

    public final void k(View view) {
        if (this.c.remove(view)) {
            b bVar = this.f3942a;
            bVar.getClass();
            h M = RecyclerView.M(view);
            if (M != null) {
                int i = M.p;
                RecyclerView recyclerView = bVar.f273a;
                if (recyclerView.O()) {
                    M.q = i;
                    recyclerView.F0.add(M);
                } else {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    uk3.s(M.f281a, i);
                }
                M.p = 0;
            }
        }
    }

    public final String toString() {
        return this.f3943b.toString() + ", hidden list:" + this.c.size();
    }
}
