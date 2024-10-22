package defpackage;

import android.view.View;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class yu3 extends iv3 {
    public static final yu3 d = new yu3();

    @Override // defpackage.iv3
    public final void b(boolean z) {
        boolean z2;
        String str;
        Iterator it = Collections.unmodifiableCollection(dv3.c.f1844a).iterator();
        while (it.hasNext()) {
            v7 v7Var = ((mu3) it.next()).d;
            if (v7Var.f4787a.get() != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (z) {
                    str = "foregrounded";
                } else {
                    str = "backgrounded";
                }
                v73.d.a(v7Var.e(), "setState", str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iv3
    public final boolean c() {
        Iterator it = dv3.c.a().iterator();
        while (it.hasNext()) {
            View view = (View) ((mu3) it.next()).c.get();
            if (view != null && view.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
