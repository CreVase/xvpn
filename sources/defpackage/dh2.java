package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dh2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecyclerView f1781b;

    public /* synthetic */ dh2(RecyclerView recyclerView, int i) {
        this.f1780a = i;
        this.f1781b = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        long j;
        long j2;
        int i = this.f1780a;
        RecyclerView recyclerView = this.f1781b;
        switch (i) {
            case 0:
                if (recyclerView.u && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.s) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.x) {
                        recyclerView.w = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                lh2 lh2Var = recyclerView.L;
                if (lh2Var != null) {
                    zh0 zh0Var = (zh0) lh2Var;
                    ArrayList arrayList = zh0Var.h;
                    boolean z2 = !arrayList.isEmpty();
                    ArrayList arrayList2 = zh0Var.j;
                    boolean z3 = !arrayList2.isEmpty();
                    ArrayList arrayList3 = zh0Var.k;
                    boolean z4 = !arrayList3.isEmpty();
                    ArrayList arrayList4 = zh0Var.i;
                    boolean z5 = !arrayList4.isEmpty();
                    if (z2 || z3 || z5 || z4) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            h hVar = (h) it.next();
                            View view = hVar.f281a;
                            ViewPropertyAnimator animate = view.animate();
                            zh0Var.q.add(hVar);
                            animate.setDuration(zh0Var.d).alpha(0.0f).setListener(new uh0(zh0Var, hVar, animate, view)).start();
                            arrayList4 = arrayList4;
                            z5 = z5;
                        }
                        ArrayList arrayList5 = arrayList4;
                        boolean z6 = z5;
                        arrayList.clear();
                        if (z3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList2);
                            zh0Var.m.add(arrayList6);
                            arrayList2.clear();
                            th0 th0Var = new th0(zh0Var, arrayList6, 0);
                            if (z2) {
                                View view2 = ((yh0) arrayList6.get(0)).f5333a.f281a;
                                long j3 = zh0Var.d;
                                WeakHashMap weakHashMap = ll3.f3151a;
                                uk3.n(view2, th0Var, j3);
                            } else {
                                th0Var.run();
                            }
                        }
                        if (z4) {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList3);
                            zh0Var.n.add(arrayList7);
                            arrayList3.clear();
                            th0 th0Var2 = new th0(zh0Var, arrayList7, 1);
                            if (z2) {
                                View view3 = ((xh0) arrayList7.get(0)).f5159a.f281a;
                                long j4 = zh0Var.d;
                                WeakHashMap weakHashMap2 = ll3.f3151a;
                                uk3.n(view3, th0Var2, j4);
                            } else {
                                th0Var2.run();
                            }
                        }
                        if (z6) {
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.addAll(arrayList5);
                            zh0Var.l.add(arrayList8);
                            arrayList5.clear();
                            th0 th0Var3 = new th0(zh0Var, arrayList8, 2);
                            if (!z2 && !z3 && !z4) {
                                th0Var3.run();
                            } else {
                                long j5 = 0;
                                if (z2) {
                                    j = zh0Var.d;
                                } else {
                                    j = 0;
                                }
                                if (z3) {
                                    j2 = zh0Var.e;
                                } else {
                                    j2 = 0;
                                }
                                if (z4) {
                                    j5 = zh0Var.f;
                                }
                                long max = Math.max(j2, j5) + j;
                                z = false;
                                View view4 = ((h) arrayList8.get(0)).f281a;
                                WeakHashMap weakHashMap3 = ll3.f3151a;
                                uk3.n(view4, th0Var3, max);
                                recyclerView.y0 = z;
                                return;
                            }
                        }
                    }
                }
                z = false;
                recyclerView.y0 = z;
                return;
        }
    }
}
