package defpackage;

import android.database.Observable;

/* loaded from: classes.dex */
public final class gh2 extends Observable {
    public final boolean a() {
        return !((Observable) this).mObservers.isEmpty();
    }

    public final void b() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((hh2) ((Observable) this).mObservers.get(size)).a();
        }
    }

    public final void c(int i, int i2, Object obj) {
        int size = ((Observable) this).mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((hh2) ((Observable) this).mObservers.get(size)).c(i, i2, obj);
            } else {
                return;
            }
        }
    }

    public final void d(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((hh2) ((Observable) this).mObservers.get(size)).d(i, i2);
        }
    }

    public final void e(int i, int i2) {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((hh2) ((Observable) this).mObservers.get(size)).e(i, i2);
        }
    }

    public final void f() {
        for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
            ((hh2) ((Observable) this).mObservers.get(size)).f();
        }
    }
}
