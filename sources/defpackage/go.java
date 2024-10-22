package defpackage;

import android.content.Context;
import android.view.MenuItem;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class go {

    /* renamed from: a, reason: collision with root package name */
    public Object f2287a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2288b;
    public op1 c;

    public go(Context context) {
        this.f2287a = context;
    }

    public static boolean l(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean n(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    public abstract void c();

    public abstract Object d(int i, int i2);

    public abstract kg e();

    public abstract int f();

    public abstract int g(Object obj);

    public abstract int h(Object obj);

    public abstract void i(Object obj, Object obj2);

    public abstract void j(int i);

    public abstract Object k(int i, Object obj);

    public final MenuItem m(MenuItem menuItem) {
        if (menuItem instanceof q33) {
            q33 q33Var = (q33) menuItem;
            if (((uu2) this.f2288b) == null) {
                this.f2288b = new uu2();
            }
            MenuItem menuItem2 = (MenuItem) ((uu2) this.f2288b).getOrDefault(q33Var, null);
            if (menuItem2 == null) {
                yu1 yu1Var = new yu1((Context) this.f2287a, q33Var);
                ((uu2) this.f2288b).put(q33Var, yu1Var);
                return yu1Var;
            }
            return menuItem2;
        }
        return menuItem;
    }

    public final Object[] o(int i, Object[] objArr) {
        int f = f();
        if (objArr.length < f) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), f);
        }
        for (int i2 = 0; i2 < f; i2++) {
            objArr[i2] = d(i2, i);
        }
        if (objArr.length > f) {
            objArr[f] = null;
        }
        return objArr;
    }
}
