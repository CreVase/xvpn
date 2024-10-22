package defpackage;

import android.view.View;
import android.view.WindowInsets;
import android.view.animation.LinearInterpolator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class sc1 {

    /* renamed from: a, reason: collision with root package name */
    public WindowInsets f4313a;

    /* renamed from: b, reason: collision with root package name */
    public final View f4314b;
    public int c;
    public int d;
    public final int[] e = new int[2];

    public sc1(View view) {
        this.f4314b = view;
    }

    public final void a(wq3 wq3Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            iq3 iq3Var = (iq3) it.next();
            if ((iq3Var.f2634a.c() & 8) != 0) {
                int i = this.d;
                float b2 = iq3Var.f2634a.b();
                LinearInterpolator linearInterpolator = pb.f3811a;
                this.f4314b.setTranslationY(Math.round(b2 * (0 - i)) + i);
                return;
            }
        }
    }
}
