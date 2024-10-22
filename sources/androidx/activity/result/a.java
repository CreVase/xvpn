package androidx.activity.result;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.o;
import defpackage.b7;
import defpackage.bk1;
import defpackage.c7;
import defpackage.ck1;
import defpackage.d7;
import defpackage.gg2;
import defpackage.tj1;
import defpackage.uj1;
import defpackage.vj1;
import defpackage.w6;
import defpackage.x6;
import defpackage.zj1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f138a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f139b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();

    public final boolean a(int i, int i2, Intent intent) {
        w6 w6Var;
        String str = (String) this.f138a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        c7 c7Var = (c7) this.e.get(str);
        if (c7Var != null && (w6Var = c7Var.f591a) != null && this.d.contains(str)) {
            ((o) w6Var).b(c7Var.f592b.c(i2, intent));
            this.d.remove(str);
            return true;
        }
        this.f.remove(str);
        this.g.putParcelable(str, new ActivityResult(i2, intent));
        return true;
    }

    public abstract void b(int i, x6 x6Var, Object obj);

    public final b7 c(String str, x6 x6Var, o oVar) {
        e(str);
        this.e.put(str, new c7(x6Var, oVar));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            oVar.b(obj);
        }
        Bundle bundle = this.g;
        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str);
        if (activityResult != null) {
            bundle.remove(str);
            oVar.b(x6Var.c(activityResult.f132a, activityResult.f133b));
        }
        return new b7(this, str, x6Var, 1);
    }

    public final b7 d(final String str, bk1 bk1Var, final x6 x6Var, final w6 w6Var) {
        vj1 lifecycle = bk1Var.getLifecycle();
        ck1 ck1Var = (ck1) lifecycle;
        if (!ck1Var.d.a(uj1.STARTED)) {
            e(str);
            HashMap hashMap = this.c;
            d7 d7Var = (d7) hashMap.get(str);
            if (d7Var == null) {
                d7Var = new d7(lifecycle);
            }
            zj1 zj1Var = new zj1() { // from class: androidx.activity.result.ActivityResultRegistry$1
                @Override // defpackage.zj1
                public final void e(bk1 bk1Var2, tj1 tj1Var) {
                    boolean equals = tj1.ON_START.equals(tj1Var);
                    String str2 = str;
                    a aVar = a.this;
                    if (equals) {
                        HashMap hashMap2 = aVar.e;
                        x6 x6Var2 = x6Var;
                        w6 w6Var2 = w6Var;
                        hashMap2.put(str2, new c7(x6Var2, w6Var2));
                        HashMap hashMap3 = aVar.f;
                        if (hashMap3.containsKey(str2)) {
                            Object obj = hashMap3.get(str2);
                            hashMap3.remove(str2);
                            ((o) w6Var2).b(obj);
                        }
                        Bundle bundle = aVar.g;
                        ActivityResult activityResult = (ActivityResult) bundle.getParcelable(str2);
                        if (activityResult != null) {
                            bundle.remove(str2);
                            ((o) w6Var2).b(x6Var2.c(activityResult.f132a, activityResult.f133b));
                            return;
                        }
                        return;
                    }
                    if (tj1.ON_STOP.equals(tj1Var)) {
                        aVar.e.remove(str2);
                    } else if (tj1.ON_DESTROY.equals(tj1Var)) {
                        aVar.f(str2);
                    }
                }
            };
            d7Var.f1739a.a(zj1Var);
            d7Var.f1740b.add(zj1Var);
            hashMap.put(str, d7Var);
            return new b7(this, str, x6Var, 0);
        }
        throw new IllegalStateException("LifecycleOwner " + bk1Var + " is attempting to register while current state is " + ck1Var.d + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final void e(String str) {
        HashMap hashMap = this.f139b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        gg2.f2251a.getClass();
        int nextInt = gg2.f2252b.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            HashMap hashMap2 = this.f138a;
            if (hashMap2.containsKey(Integer.valueOf(i))) {
                gg2.f2251a.getClass();
                nextInt = gg2.f2252b.a().nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            }
        }
    }

    public final void f(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.f139b.remove(str)) != null) {
            this.f138a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Objects.toString(hashMap.get(str));
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            Objects.toString(bundle.getParcelable(str));
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        d7 d7Var = (d7) hashMap2.get(str);
        if (d7Var != null) {
            ArrayList arrayList = d7Var.f1740b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d7Var.f1739a.b((zj1) it.next());
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
