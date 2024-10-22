package defpackage;

import android.view.View;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class k62 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2898a = bf2.pooling_container_listener_holder_tag;

    /* renamed from: b, reason: collision with root package name */
    public static final int f2899b = bf2.is_pooling_container_tag;

    public static final void a(View view) {
        dm3 dm3Var = new dm3(view, null);
        gp2 gp2Var = new gp2();
        gp2Var.d = t9.z(gp2Var, gp2Var, dm3Var);
        while (gp2Var.hasNext()) {
            View view2 = (View) gp2Var.next();
            int i = f2898a;
            l62 l62Var = (l62) view2.getTag(i);
            if (l62Var == null) {
                l62Var = new l62();
                view2.setTag(i, l62Var);
            }
            ArrayList arrayList = l62Var.f3073a;
            int N = tf3.N(arrayList);
            if (-1 < N) {
                p71.C(arrayList.get(N));
                throw null;
            }
        }
    }
}
