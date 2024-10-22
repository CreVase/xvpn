package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class br {

    /* renamed from: b, reason: collision with root package name */
    public static int f514b;
    public static o82 c;
    public static z91 e;
    public static ViewGroup f;
    public static boolean h;
    public static long i;

    /* renamed from: a, reason: collision with root package name */
    public static final br f513a = new br();
    public static final ArrayList d = new ArrayList();
    public static final ArrayList g = new ArrayList();

    static {
        new ArrayList();
    }

    public static void a(boolean z) {
        ArrayList arrayList = d;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            j53 j53Var = (j53) ((z91) it.next());
            j53Var.q = true;
            j53Var.d.setEnabled(false);
            j53Var.m.stopLoading();
            j53Var.m.loadUrl("about:blank");
            if (!z) {
                j53Var.d.setEnabled(true);
            }
            j53Var.a(z);
            ViewGroup viewGroup = f;
            if (viewGroup != null) {
                viewGroup.removeView(j53Var.h);
            }
            if (j53Var.m.getParent() != null) {
                j53Var.i.removeView(j53Var.m);
            }
        }
        arrayList.clear();
        e = null;
        Iterator it2 = g.iterator();
        if (!it2.hasNext()) {
            ViewGroup viewGroup2 = f;
            if (viewGroup2 != null) {
                ExecutorService executorService = ta1.f4474a;
                Context context = viewGroup2.getContext();
                ta1.a(context.getApplicationContext().getApplicationContext());
                new File(context.getCacheDir(), "browser_snapshot").delete();
                return;
            }
            return;
        }
        p71.C(it2.next());
        throw null;
    }

    public static void b() {
        ViewGroup viewGroup;
        if (!d.isEmpty() || (viewGroup = f) == null) {
            return;
        }
        c(new j53((dn) viewGroup.getContext(), c));
    }

    public static void c(z91 z91Var) {
        ViewGroup viewGroup;
        if (m20.L(z91Var, e) || f == null) {
            return;
        }
        z91 z91Var2 = e;
        ArrayList arrayList = d;
        int indexOf = arrayList.indexOf(z91Var);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
        }
        arrayList.add(z91Var);
        e = z91Var;
        Iterator it = g.iterator();
        if (!it.hasNext()) {
            j53 j53Var = (j53) z91Var;
            j53Var.o(arrayList.size());
            if (z91Var2 != null && (viewGroup = f) != null) {
                viewGroup.removeView(((j53) z91Var2).h);
            }
            ViewGroup.LayoutParams layoutParams = j53Var.h.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new f70(-1, -1);
            }
            ViewGroup viewGroup2 = f;
            if (viewGroup2 != null) {
                viewGroup2.addView(j53Var.h, layoutParams);
            }
            if (z91Var2 != null) {
                ((j53) z91Var2).m.onPause();
            }
            j53Var.i();
            return;
        }
        p71.C(it.next());
        throw null;
    }
}
