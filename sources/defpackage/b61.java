package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class b61 implements hn2, vr3, ss0 {
    public static final String i = bo1.e("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f412a;

    /* renamed from: b, reason: collision with root package name */
    public final hs3 f413b;
    public final wr3 c;
    public final xj0 e;
    public boolean f;
    public Boolean h;
    public final HashSet d = new HashSet();
    public final Object g = new Object();

    public b61(Context context, u40 u40Var, y33 y33Var, hs3 hs3Var) {
        this.f412a = context;
        this.f413b = hs3Var;
        this.c = new wr3(context, y33Var, this);
        this.e = new xj0(this, u40Var.e);
    }

    @Override // defpackage.hn2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ss0
    public final void b(String str, boolean z) {
        synchronized (this.g) {
            Iterator it = this.d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                rs3 rs3Var = (rs3) it.next();
                if (rs3Var.f4206a.equals(str)) {
                    bo1 c = bo1.c();
                    String.format("Stopping tracking for %s", str);
                    c.a(new Throwable[0]);
                    this.d.remove(rs3Var);
                    this.c.c(this.d);
                    break;
                }
            }
        }
    }

    @Override // defpackage.hn2
    public final void c(String str) {
        Runnable runnable;
        Boolean bool = this.h;
        hs3 hs3Var = this.f413b;
        if (bool == null) {
            this.h = Boolean.valueOf(u82.a(this.f412a, hs3Var.r));
        }
        if (!this.h.booleanValue()) {
            bo1.c().d(i, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        if (!this.f) {
            hs3Var.v.a(this);
            this.f = true;
        }
        bo1 c = bo1.c();
        String.format("Cancelling work ID %s", str);
        c.a(new Throwable[0]);
        xj0 xj0Var = this.e;
        if (xj0Var != null && (runnable = (Runnable) xj0Var.c.remove(str)) != null) {
            ((Handler) xj0Var.f5168b.f4780b).removeCallbacks(runnable);
        }
        hs3Var.f0(str);
    }

    @Override // defpackage.vr3
    public final void d(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bo1 c = bo1.c();
            String.format("Constraints not met: Cancelling work ID %s", str);
            c.a(new Throwable[0]);
            this.f413b.f0(str);
        }
    }

    @Override // defpackage.hn2
    public final void e(rs3... rs3VarArr) {
        boolean z;
        if (this.h == null) {
            this.h = Boolean.valueOf(u82.a(this.f412a, this.f413b.r));
        }
        if (!this.h.booleanValue()) {
            bo1.c().d(i, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        if (!this.f) {
            this.f413b.v.a(this);
            this.f = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (rs3 rs3Var : rs3VarArr) {
            long a2 = rs3Var.a();
            long currentTimeMillis = System.currentTimeMillis();
            if (rs3Var.f4207b == fs3.ENQUEUED) {
                if (currentTimeMillis < a2) {
                    xj0 xj0Var = this.e;
                    if (xj0Var != null) {
                        HashMap hashMap = xj0Var.c;
                        Runnable runnable = (Runnable) hashMap.remove(rs3Var.f4206a);
                        v51 v51Var = xj0Var.f5168b;
                        if (runnable != null) {
                            ((Handler) v51Var.f4780b).removeCallbacks(runnable);
                        }
                        y4 y4Var = new y4(7, xj0Var, rs3Var);
                        hashMap.put(rs3Var.f4206a, y4Var);
                        ((Handler) v51Var.f4780b).postDelayed(y4Var, rs3Var.a() - System.currentTimeMillis());
                    }
                } else if (rs3Var.b()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 23 && rs3Var.j.c) {
                        bo1 c = bo1.c();
                        String.format("Ignoring WorkSpec %s, Requires device idle.", rs3Var);
                        c.a(new Throwable[0]);
                    } else {
                        if (i2 >= 24) {
                            if (rs3Var.j.h.f2720a.size() > 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                bo1 c2 = bo1.c();
                                String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", rs3Var);
                                c2.a(new Throwable[0]);
                            }
                        }
                        hashSet.add(rs3Var);
                        hashSet2.add(rs3Var.f4206a);
                    }
                } else {
                    bo1 c3 = bo1.c();
                    String.format("Starting work for %s", rs3Var.f4206a);
                    c3.a(new Throwable[0]);
                    this.f413b.e0(rs3Var.f4206a, null);
                }
            }
        }
        synchronized (this.g) {
            if (!hashSet.isEmpty()) {
                bo1 c4 = bo1.c();
                String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2));
                c4.a(new Throwable[0]);
                this.d.addAll(hashSet);
                this.c.c(this.d);
            }
        }
    }

    @Override // defpackage.vr3
    public final void f(List list) {
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            bo1 c = bo1.c();
            String.format("Constraints met: Scheduling work ID %s", str);
            c.a(new Throwable[0]);
            this.f413b.e0(str, null);
        }
    }
}
