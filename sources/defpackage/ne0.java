package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class ne0 {

    /* renamed from: a, reason: collision with root package name */
    public static ia0 f3446a;

    /* renamed from: b, reason: collision with root package name */
    public static final ArrayList f3447b = new ArrayList();
    public static final Object c = new Object();
    public static StringBuilder d = new StringBuilder();

    public static void a(me0 me0Var) {
        synchronized (c) {
            boolean z = false;
            for (int size = f3447b.size() - 1; size >= 0; size--) {
                ArrayList arrayList = f3447b;
                me0 me0Var2 = (me0) ((WeakReference) arrayList.get(size)).get();
                if (me0Var2 == null) {
                    arrayList.remove(size);
                } else if (me0Var2 == me0Var) {
                    z = true;
                }
            }
            if (!z) {
                f3447b.add(new WeakReference(me0Var));
            }
        }
    }

    public static void b(me0 me0Var) {
        ArrayList arrayList = f3447b;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            me0 me0Var2 = (me0) ((WeakReference) arrayList.get(size)).get();
            if (me0Var2 == null || me0Var2 == me0Var) {
                arrayList.remove(size);
            }
        }
    }
}
