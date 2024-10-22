package defpackage;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.c;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class m03 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f3215a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public int f3216b = Integer.MIN_VALUE;
    public int c = Integer.MIN_VALUE;
    public int d = 0;
    public final int e;
    public final /* synthetic */ StaggeredGridLayoutManager f;

    public m03(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f = staggeredGridLayoutManager;
        this.e = i;
    }

    public static l03 h(View view) {
        return (l03) view.getLayoutParams();
    }

    public final void a() {
        View view = (View) this.f3215a.get(r0.size() - 1);
        l03 h = h(view);
        this.c = this.f.r.b(view);
        h.getClass();
    }

    public final void b() {
        this.f3215a.clear();
        this.f3216b = Integer.MIN_VALUE;
        this.c = Integer.MIN_VALUE;
        this.d = 0;
    }

    public final int c() {
        boolean z = this.f.w;
        ArrayList arrayList = this.f3215a;
        if (z) {
            return e(arrayList.size() - 1, -1);
        }
        return e(0, arrayList.size());
    }

    public final int d() {
        boolean z = this.f.w;
        ArrayList arrayList = this.f3215a;
        if (z) {
            return e(0, arrayList.size());
        }
        return e(arrayList.size() - 1, -1);
    }

    public final int e(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        int h = staggeredGridLayoutManager.r.h();
        int f = staggeredGridLayoutManager.r.f();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) this.f3215a.get(i);
            int d = staggeredGridLayoutManager.r.d(view);
            int b2 = staggeredGridLayoutManager.r.b(view);
            boolean z2 = false;
            if (d <= f) {
                z = true;
            } else {
                z = false;
            }
            if (b2 >= h) {
                z2 = true;
            }
            if (z && z2 && (d < h || b2 > f)) {
                return c.F(view);
            }
            i += i3;
        }
        return -1;
    }

    public final int f(int i) {
        int i2 = this.c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f3215a.size() == 0) {
            return i;
        }
        a();
        return this.c;
    }

    public final View g(int i, int i2) {
        ArrayList arrayList = this.f3215a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.w && c.F(view2) <= i) || ((!staggeredGridLayoutManager.w && c.F(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.w && c.F(view3) >= i) || ((!staggeredGridLayoutManager.w && c.F(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int i(int i) {
        int i2 = this.f3216b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        ArrayList arrayList = this.f3215a;
        if (arrayList.size() == 0) {
            return i;
        }
        View view = (View) arrayList.get(0);
        l03 h = h(view);
        this.f3216b = this.f.r.d(view);
        h.getClass();
        return this.f3216b;
    }
}
