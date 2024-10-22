package defpackage;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class tm3 {
    public Interpolator c;
    public um3 d;
    public boolean e;

    /* renamed from: b, reason: collision with root package name */
    public long f4539b = -1;
    public final sm3 f = new sm3(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f4538a = new ArrayList();

    public final void a() {
        if (!this.e) {
            return;
        }
        Iterator it = this.f4538a.iterator();
        while (it.hasNext()) {
            ((rm3) it.next()).b();
        }
        this.e = false;
    }

    public final void b() {
        View view;
        if (this.e) {
            return;
        }
        Iterator it = this.f4538a.iterator();
        while (it.hasNext()) {
            rm3 rm3Var = (rm3) it.next();
            long j = this.f4539b;
            if (j >= 0) {
                rm3Var.c(j);
            }
            Interpolator interpolator = this.c;
            if (interpolator != null && (view = (View) rm3Var.f4181a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.d != null) {
                rm3Var.d(this.f);
            }
            View view2 = (View) rm3Var.f4181a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.e = true;
    }
}
