package defpackage;

import androidx.activity.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u31 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4620a;
    public boolean c;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4621b = new Object();
    public final ArrayList d = new ArrayList();

    public u31(a aVar, i30 i30Var) {
        this.f4620a = aVar;
    }

    public final void a() {
        synchronized (this.f4621b) {
            this.c = true;
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((v31) it.next()).invoke();
            }
            this.d.clear();
        }
    }
}
