package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class eb3 implements g5, ym3, mv0, wt1, vn0 {
    public static eb3 e;

    /* renamed from: a, reason: collision with root package name */
    public Object f1907a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1908b;
    public Object c;
    public Object d;

    public /* synthetic */ eb3(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f1907a = obj;
        this.f1908b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public static synchronized eb3 y(Context context, g63 g63Var) {
        eb3 eb3Var;
        synchronized (eb3.class) {
            if (e == null) {
                e = new eb3(context, g63Var);
            }
            eb3Var = e;
        }
        return eb3Var;
    }

    public final void A(js3 js3Var) {
        ((gl2) this.f1907a).b();
        ((gl2) this.f1907a).c();
        try {
            ((ur0) this.f1908b).e(js3Var);
            ((gl2) this.f1907a).h();
        } finally {
            ((gl2) this.f1907a).f();
        }
    }

    public final boolean B(int i, rt1 rt1Var) {
        rt1 rt1Var2;
        if (rt1Var != null) {
            rt1Var2 = ((j40) this.d).r(this.f1907a, rt1Var);
            if (rt1Var2 == null) {
                return false;
            }
        } else {
            rt1Var2 = null;
        }
        int t = ((j40) this.d).t(i, this.f1907a);
        vt1 vt1Var = (vt1) this.f1908b;
        if (vt1Var.f4892a != t || !wi3.a(vt1Var.f4893b, rt1Var2)) {
            this.f1908b = new vt1(((j40) this.d).c.c, t, rt1Var2);
        }
        un0 un0Var = (un0) this.c;
        if (un0Var.f4702a != t || !wi3.a(un0Var.f4703b, rt1Var2)) {
            this.c = new un0(((j40) this.d).d.c, t, rt1Var2);
            return true;
        }
        return true;
    }

    public final et1 C(et1 et1Var) {
        long s = ((j40) this.d).s(et1Var.f, this.f1907a);
        j40 j40Var = (j40) this.d;
        Object obj = this.f1907a;
        long j = et1Var.g;
        long s2 = j40Var.s(j, obj);
        if (s == et1Var.f && s2 == j) {
            return et1Var;
        }
        return new et1(et1Var.f1992a, et1Var.f1993b, et1Var.c, et1Var.d, et1Var.e, s, s2);
    }

    public final Task D(Callable callable) {
        Task continueWith;
        synchronized (this.c) {
            continueWith = ((Task) this.f1908b).continueWith((Executor) this.f1907a, new uy0(this, callable, 18));
            this.f1908b = continueWith.continueWith((Executor) this.f1907a, new ia0(this));
        }
        return continueWith;
    }

    public final Task E(Callable callable) {
        Task continueWithTask;
        synchronized (this.c) {
            continueWithTask = ((Task) this.f1908b).continueWithTask((Executor) this.f1907a, new uy0(this, callable, 18));
            this.f1908b = continueWithTask.continueWith((Executor) this.f1907a, new ia0(this));
        }
        return continueWithTask;
    }

    @Override // defpackage.vn0
    public final void a(int i, rt1 rt1Var, Exception exc) {
        if (B(i, rt1Var)) {
            ((un0) this.c).e(exc);
        }
    }

    @Override // defpackage.wt1
    public final void b(int i, rt1 rt1Var, et1 et1Var) {
        if (B(i, rt1Var)) {
            ((vt1) this.f1908b).b(C(et1Var));
        }
    }

    @Override // defpackage.g5
    public final boolean c(h5 h5Var, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f1907a).onActionItemClicked(x(h5Var), new yu1((Context) this.f1908b, (q33) menuItem));
    }

    @Override // defpackage.vn0
    public final void d(int i, rt1 rt1Var, int i2) {
        if (B(i, rt1Var)) {
            ((un0) this.c).d(i2);
        }
    }

    @Override // defpackage.wt1
    public final void e(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        if (B(i, rt1Var)) {
            ((vt1) this.f1908b).j(xl1Var, C(et1Var));
        }
    }

    @Override // defpackage.wt1
    public final void f(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        if (B(i, rt1Var)) {
            ((vt1) this.f1908b).d(xl1Var, C(et1Var));
        }
    }

    @Override // defpackage.g5
    public final void g(h5 h5Var) {
        ((ActionMode.Callback) this.f1907a).onDestroyActionMode(x(h5Var));
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) ((Provider) this.f1907a).get();
        os0 os0Var = (os0) ((Provider) this.f1908b).get();
        cm cmVar = (cm) ((Provider) this.c).get();
        return new hf1(context, os0Var, cmVar);
    }

    @Override // defpackage.wt1
    public final void h(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var) {
        if (B(i, rt1Var)) {
            ((vt1) this.f1908b).f(xl1Var, C(et1Var));
        }
    }

    @Override // defpackage.wt1
    public final void i(int i, rt1 rt1Var, xl1 xl1Var, et1 et1Var, IOException iOException, boolean z) {
        if (B(i, rt1Var)) {
            ((vt1) this.f1908b).h(xl1Var, C(et1Var), iOException, z);
        }
    }

    @Override // defpackage.g5
    public final boolean j(h5 h5Var, ju1 ju1Var) {
        return ((ActionMode.Callback) this.f1907a).onCreateActionMode(x(h5Var), z(ju1Var));
    }

    @Override // defpackage.vn0
    public final void k(int i, rt1 rt1Var) {
        if (B(i, rt1Var)) {
            ((un0) this.c).c();
        }
    }

    @Override // defpackage.g5
    public final boolean l(h5 h5Var, ju1 ju1Var) {
        return ((ActionMode.Callback) this.f1907a).onPrepareActionMode(x(h5Var), z(ju1Var));
    }

    @Override // defpackage.vn0
    public final void m(int i, rt1 rt1Var) {
        if (B(i, rt1Var)) {
            ((un0) this.c).b();
        }
    }

    @Override // defpackage.ym3
    public final int n(int i) {
        int indexOfKey = ((SparseIntArray) this.f1908b).indexOfKey(i);
        if (indexOfKey >= 0) {
            return ((SparseIntArray) this.f1908b).valueAt(indexOfKey);
        }
        StringBuilder o = p71.o("requested global type ", i, " does not belong to the adapter:");
        o.append(((cz1) this.c).c);
        throw new IllegalStateException(o.toString());
    }

    @Override // defpackage.ym3
    public final int o(int i) {
        int indexOfKey = ((SparseIntArray) this.f1907a).indexOfKey(i);
        if (indexOfKey > -1) {
            return ((SparseIntArray) this.f1907a).valueAt(indexOfKey);
        }
        q9 q9Var = (q9) this.d;
        cz1 cz1Var = (cz1) this.c;
        int i2 = q9Var.f3969a;
        q9Var.f3969a = i2 + 1;
        ((SparseArray) q9Var.f3970b).put(i2, cz1Var);
        ((SparseIntArray) this.f1907a).put(i, i2);
        ((SparseIntArray) this.f1908b).put(i2, i);
        return i2;
    }

    @Override // defpackage.vn0
    public final void p(int i, rt1 rt1Var) {
        if (B(i, rt1Var)) {
            ((un0) this.c).a();
        }
    }

    @Override // defpackage.vn0
    public final void q(int i, rt1 rt1Var) {
        if (B(i, rt1Var)) {
            ((un0) this.c).f();
        }
    }

    @Override // defpackage.vn0
    public final /* synthetic */ void r() {
    }

    public final void s(xu3 xu3Var) {
        xu3Var.f5228a = this;
        ((ArrayDeque) this.c).add(xu3Var);
        if (((xu3) this.d) == null) {
            xu3 xu3Var2 = (xu3) ((ArrayDeque) this.c).poll();
            this.d = xu3Var2;
            if (xu3Var2 != null) {
                xu3Var2.executeOnExecutor((ThreadPoolExecutor) this.f1908b, new Object[0]);
            }
        }
    }

    public final ll t() {
        String str;
        if (((Integer) this.f1907a) == null) {
            str = " platform";
        } else {
            str = "";
        }
        if (((String) this.f1908b) == null) {
            str = str.concat(" version");
        }
        if (((String) this.c) == null) {
            str = p71.l(str, " buildVersion");
        }
        if (((Boolean) this.d) == null) {
            str = p71.l(str, " jailbroken");
        }
        if (str.isEmpty()) {
            return new ll(((Integer) this.f1907a).intValue(), (String) this.f1908b, (String) this.c, ((Boolean) this.d).booleanValue());
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public final void u(String str) {
        ((gl2) this.f1907a).b();
        o31 a2 = ((ys2) this.c).a();
        if (str == null) {
            a2.w(1);
        } else {
            a2.x(1, str);
        }
        ((gl2) this.f1907a).c();
        try {
            a2.K();
            ((gl2) this.f1907a).h();
        } finally {
            ((gl2) this.f1907a).f();
            ((ys2) this.c).c(a2);
        }
    }

    public final void v() {
        ((gl2) this.f1907a).b();
        o31 a2 = ((ys2) this.d).a();
        ((gl2) this.f1907a).c();
        try {
            a2.K();
            ((gl2) this.f1907a).h();
        } finally {
            ((gl2) this.f1907a).f();
            ((ys2) this.d).c(a2);
        }
    }

    public final void w(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (!hashSet.contains(obj)) {
            hashSet.add(obj);
            ArrayList arrayList2 = (ArrayList) ((uu2) this.f1908b).getOrDefault(obj, null);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    w(arrayList2.get(i), arrayList, hashSet);
                }
            }
            hashSet.remove(obj);
            arrayList.add(obj);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    public final k33 x(h5 h5Var) {
        int size = ((ArrayList) this.c).size();
        for (int i = 0; i < size; i++) {
            k33 k33Var = (k33) ((ArrayList) this.c).get(i);
            if (k33Var != null && k33Var.f2881b == h5Var) {
                return k33Var;
            }
        }
        k33 k33Var2 = new k33((Context) this.f1908b, h5Var);
        ((ArrayList) this.c).add(k33Var2);
        return k33Var2;
    }

    public final Menu z(ju1 ju1Var) {
        Menu menu = (Menu) ((uu2) this.d).getOrDefault(ju1Var, null);
        if (menu == null) {
            nv1 nv1Var = new nv1((Context) this.f1908b, ju1Var);
            ((uu2) this.d).put(ju1Var, nv1Var);
            return nv1Var;
        }
        return menu;
    }

    public eb3(gl2 gl2Var) {
        this.f1907a = gl2Var;
        this.f1908b = new nk0(this, gl2Var, 4);
        this.c = new ks3(this, gl2Var, 0);
        this.d = new ks3(this, gl2Var, 1);
    }

    public eb3(int i) {
        if (i != 10) {
            if (i != 11) {
                this.f1907a = new m62(10, 1);
                this.f1908b = new uu2();
                this.c = new ArrayList();
                this.d = new HashSet();
                return;
            }
            this.c = new ArrayDeque();
            this.d = null;
            LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
            this.f1907a = linkedBlockingQueue;
            this.f1908b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
        }
    }

    public eb3(Executor executor) {
        this.f1908b = Tasks.forResult(null);
        this.c = new Object();
        this.d = new ThreadLocal();
        this.f1907a = executor;
        executor.execute(new qw3(this, 18));
    }

    public eb3(Context context, g63 g63Var) {
        Context applicationContext = context.getApplicationContext();
        this.f1907a = new jp(applicationContext, g63Var);
        this.f1908b = new kp(applicationContext, g63Var);
        this.c = new tz1(applicationContext, g63Var);
        this.d = new n13(applicationContext, g63Var);
    }

    public eb3(Context context, ActionMode.Callback callback) {
        this.f1908b = context;
        this.f1907a = callback;
        this.c = new ArrayList();
        this.d = new uu2();
    }

    public eb3(q9 q9Var, cz1 cz1Var) {
        this.d = q9Var;
        this.f1907a = new SparseIntArray(1);
        this.f1908b = new SparseIntArray(1);
        this.c = cz1Var;
    }

    public eb3(j40 j40Var, Object obj) {
        this.d = j40Var;
        this.f1908b = new vt1(j40Var.c.c, 0, null);
        this.c = new un0(j40Var.d.c, 0, null);
        this.f1907a = obj;
    }
}
