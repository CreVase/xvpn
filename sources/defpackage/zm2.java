package defpackage;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zm2 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f5513b;
    public Bundle c;
    public boolean d;
    public gc e;

    /* renamed from: a, reason: collision with root package name */
    public final jm2 f5512a = new jm2();
    public boolean f = true;

    public final Bundle a(String str) {
        boolean z;
        if (this.d) {
            Bundle bundle = this.c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final ym2 b() {
        String str;
        ym2 ym2Var;
        Iterator it = this.f5512a.iterator();
        do {
            hm2 hm2Var = (hm2) it;
            if (hm2Var.hasNext()) {
                Map.Entry entry = (Map.Entry) hm2Var.next();
                str = (String) entry.getKey();
                ym2Var = (ym2) entry.getValue();
            } else {
                return null;
            }
        } while (!m20.L(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return ym2Var;
    }

    public final void c(String str, ym2 ym2Var) {
        boolean z;
        if (((ym2) this.f5512a.c(str, ym2Var)) == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (this.f) {
            gc gcVar = this.e;
            if (gcVar == null) {
                gcVar = new gc(this);
            }
            this.e = gcVar;
            try {
                mj1.class.getDeclaredConstructor(new Class[0]);
                gc gcVar2 = this.e;
                if (gcVar2 != null) {
                    ((Set) gcVar2.f2229b).add(mj1.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + mj1.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
