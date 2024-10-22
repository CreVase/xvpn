package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class sb3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ik f4309a = new ik();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f4310b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    public static void a(ViewGroup viewGroup, pb3 pb3Var) {
        ArrayList arrayList = c;
        if (!arrayList.contains(viewGroup)) {
            WeakHashMap weakHashMap = ll3.f3151a;
            if (xk3.c(viewGroup)) {
                arrayList.add(viewGroup);
                if (pb3Var == null) {
                    pb3Var = f4309a;
                }
                pb3 clone = pb3Var.clone();
                ArrayList arrayList2 = (ArrayList) b().getOrDefault(viewGroup, null);
                if (arrayList2 != null && arrayList2.size() > 0) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((pb3) it.next()).u(viewGroup);
                    }
                }
                if (clone != null) {
                    clone.h(viewGroup, true);
                }
                int i = we2.transition_current_scene;
                p71.C(viewGroup.getTag(i));
                viewGroup.setTag(i, null);
                if (clone != null) {
                    rb3 rb3Var = new rb3(viewGroup, clone);
                    viewGroup.addOnAttachStateChangeListener(rb3Var);
                    viewGroup.getViewTreeObserver().addOnPreDrawListener(rb3Var);
                }
            }
        }
    }

    public static kg b() {
        kg kgVar;
        ThreadLocal threadLocal = f4310b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (kgVar = (kg) weakReference.get()) != null) {
            return kgVar;
        }
        kg kgVar2 = new kg();
        threadLocal.set(new WeakReference(kgVar2));
        return kgVar2;
    }
}
