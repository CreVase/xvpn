package androidx.databinding;

import android.util.Log;
import android.view.View;
import defpackage.ld0;
import defpackage.tl3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class MergedDataBinderMapper extends ld0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f201a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f202b = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();

    @Override // defpackage.ld0
    public final tl3 b(View view, int i) {
        Iterator it = this.f202b.iterator();
        while (it.hasNext()) {
            tl3 b2 = ((ld0) it.next()).b(view, i);
            if (b2 != null) {
                return b2;
            }
        }
        if (d()) {
            return b(view, i);
        }
        return null;
    }

    public final void c(ld0 ld0Var) {
        if (this.f201a.add(ld0Var.getClass())) {
            this.f202b.add(ld0Var);
            Iterator it = ld0Var.a().iterator();
            while (it.hasNext()) {
                c((ld0) it.next());
            }
        }
    }

    public final boolean d() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.c;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                Class<?> cls = Class.forName(str);
                if (ld0.class.isAssignableFrom(cls)) {
                    c((ld0) cls.newInstance());
                    copyOnWriteArrayList.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }
}
