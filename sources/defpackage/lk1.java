package defpackage;

import android.view.View;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.h;
import java.util.List;

/* loaded from: classes.dex */
public final class lk1 {

    /* renamed from: b, reason: collision with root package name */
    public int f3144b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int j;
    public boolean l;

    /* renamed from: a, reason: collision with root package name */
    public boolean f3143a = true;
    public int h = 0;
    public int i = 0;
    public List k = null;

    public final void a(View view) {
        int a2;
        int size = this.k.size();
        View view2 = null;
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((h) this.k.get(i2)).f281a;
            d dVar = (d) view3.getLayoutParams();
            if (view3 != view && !dVar.c() && (a2 = (dVar.a() - this.d) * this.e) >= 0 && a2 < i) {
                view2 = view3;
                if (a2 == 0) {
                    break;
                } else {
                    i = a2;
                }
            }
        }
        if (view2 == null) {
            this.d = -1;
        } else {
            this.d = ((d) view2.getLayoutParams()).a();
        }
    }

    public final View b(e eVar) {
        List list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = ((h) this.k.get(i)).f281a;
                d dVar = (d) view.getLayoutParams();
                if (!dVar.c() && this.d == dVar.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }
        View d = eVar.d(this.d);
        this.d += this.e;
        return d;
    }
}
