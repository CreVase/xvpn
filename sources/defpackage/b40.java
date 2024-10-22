package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class b40 implements s30, y30 {
    public static final a40 h = new a40(0);
    public final es0 e;
    public final z30 g;

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f395a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f396b = new HashMap();
    public final HashMap c = new HashMap();
    public final HashSet d = new HashSet();
    public final AtomicReference f = new AtomicReference();

    public b40(Executor executor, List list, List list2, z30 z30Var) {
        es0 es0Var = new es0(executor);
        this.e = es0Var;
        this.g = z30Var;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        arrayList.add(h30.c(es0Var, es0.class, u23.class, hc2.class));
        arrayList.add(h30.c(this, y30.class, new Class[0]));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            h30 h30Var = (h30) it.next();
            if (h30Var != null) {
                arrayList.add(h30Var);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next());
        }
        ArrayList arrayList3 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((fb2) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList.addAll(this.g.a(componentRegistrar));
                        it3.remove();
                    }
                } catch (je1 unused) {
                    it3.remove();
                }
            }
            Iterator it4 = arrayList.iterator();
            while (it4.hasNext()) {
                Object[] array = ((h30) it4.next()).f2358b.toArray();
                int length = array.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        Object obj = array[i2];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.d.contains(obj.toString())) {
                                it4.remove();
                                break;
                            }
                            this.d.add(obj.toString());
                        }
                        i2++;
                    }
                }
            }
            if (this.f395a.isEmpty()) {
                bx3.s(arrayList);
            } else {
                ArrayList arrayList4 = new ArrayList(this.f395a.keySet());
                arrayList4.addAll(arrayList);
                bx3.s(arrayList4);
            }
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                h30 h30Var2 = (h30) it5.next();
                this.f395a.put(h30Var2, new vi1(new lx0(i, this, h30Var2)));
            }
            arrayList3.addAll(i(arrayList));
            arrayList3.addAll(j());
            h();
        }
        Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            ((Runnable) it6.next()).run();
        }
        Boolean bool = (Boolean) this.f.get();
        if (bool != null) {
            g(this.f395a, bool.booleanValue());
        }
    }

    @Override // defpackage.s30
    public final Object a(Class cls) {
        return f(rd2.a(cls));
    }

    @Override // defpackage.s30
    public final Set b(rd2 rd2Var) {
        return (Set) k(rd2Var).get();
    }

    @Override // defpackage.s30
    public final fb2 c(Class cls) {
        return e(rd2.a(cls));
    }

    @Override // defpackage.s30
    public final sj0 d(rd2 rd2Var) {
        fb2 e = e(rd2Var);
        if (e == null) {
            return new q32(q32.c, q32.d);
        }
        if (e instanceof q32) {
            return (q32) e;
        }
        return new q32(null, e);
    }

    @Override // defpackage.s30
    public final synchronized fb2 e(rd2 rd2Var) {
        if (rd2Var != null) {
        } else {
            throw new NullPointerException("Null interface requested.");
        }
        return (fb2) this.f396b.get(rd2Var);
    }

    @Override // defpackage.s30
    public final Object f(rd2 rd2Var) {
        fb2 e = e(rd2Var);
        if (e == null) {
            return null;
        }
        return e.get();
    }

    public final void g(Map map, boolean z) {
        ArrayDeque arrayDeque;
        boolean z2;
        for (Map.Entry entry : map.entrySet()) {
            h30 h30Var = (h30) entry.getKey();
            fb2 fb2Var = (fb2) entry.getValue();
            int i = h30Var.d;
            boolean z3 = false;
            if (i == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (i == 2) {
                    z3 = true;
                }
                if (z3 && z) {
                }
            }
            fb2Var.get();
        }
        es0 es0Var = this.e;
        synchronized (es0Var) {
            try {
                arrayDeque = es0Var.f1983b;
                if (arrayDeque != null) {
                    es0Var.f1983b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                p71.C(it.next());
                throw null;
            }
        }
    }

    public final void h() {
        boolean z;
        boolean z2;
        for (h30 h30Var : this.f395a.keySet()) {
            for (kk0 kk0Var : h30Var.c) {
                boolean z3 = true;
                if (kk0Var.f2961b == 2) {
                    z = true;
                } else {
                    z = false;
                }
                rd2 rd2Var = kk0Var.f2960a;
                if (z) {
                    HashMap hashMap = this.c;
                    if (!hashMap.containsKey(rd2Var)) {
                        hashMap.put(rd2Var, new cj1(Collections.emptySet()));
                    }
                }
                HashMap hashMap2 = this.f396b;
                if (hashMap2.containsKey(rd2Var)) {
                    continue;
                } else {
                    int i = kk0Var.f2961b;
                    if (i == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        if (i != 2) {
                            z3 = false;
                        }
                        if (!z3) {
                            hashMap2.put(rd2Var, new q32(q32.c, q32.d));
                        }
                    } else {
                        throw new ww1(String.format("Unsatisfied dependency for component %s: %s", h30Var, rd2Var));
                    }
                }
            }
        }
    }

    public final ArrayList i(ArrayList arrayList) {
        boolean z;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            h30 h30Var = (h30) it.next();
            if (h30Var.e == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                fb2 fb2Var = (fb2) this.f395a.get(h30Var);
                for (rd2 rd2Var : h30Var.f2358b) {
                    HashMap hashMap = this.f396b;
                    if (!hashMap.containsKey(rd2Var)) {
                        hashMap.put(rd2Var, fb2Var);
                    } else {
                        arrayList2.add(new lf(21, (q32) ((fb2) hashMap.get(rd2Var)), fb2Var));
                    }
                }
            }
        }
        return arrayList2;
    }

    public final ArrayList j() {
        boolean z;
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.f395a.entrySet()) {
            h30 h30Var = (h30) entry.getKey();
            if (h30Var.e == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                fb2 fb2Var = (fb2) entry.getValue();
                for (rd2 rd2Var : h30Var.f2358b) {
                    if (!hashMap.containsKey(rd2Var)) {
                        hashMap.put(rd2Var, new HashSet());
                    }
                    ((Set) hashMap.get(rd2Var)).add(fb2Var);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            Object key = entry2.getKey();
            HashMap hashMap2 = this.c;
            if (!hashMap2.containsKey(key)) {
                hashMap2.put((rd2) entry2.getKey(), new cj1((Set) ((Collection) entry2.getValue())));
            } else {
                cj1 cj1Var = (cj1) hashMap2.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new lf(22, cj1Var, (fb2) it.next()));
                }
            }
        }
        return arrayList;
    }

    public final synchronized fb2 k(rd2 rd2Var) {
        cj1 cj1Var = (cj1) this.c.get(rd2Var);
        if (cj1Var != null) {
            return cj1Var;
        }
        return h;
    }
}
