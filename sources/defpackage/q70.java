package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class q70 {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final g63 f3965a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3966b;
    public final Object c = new Object();
    public final LinkedHashSet d = new LinkedHashSet();
    public Object e;

    static {
        bo1.e("ConstraintTracker");
    }

    public q70(Context context, g63 g63Var) {
        this.f3966b = context.getApplicationContext();
        this.f3965a = g63Var;
    }

    public abstract Object a();

    public final void b(c70 c70Var) {
        synchronized (this.c) {
            if (this.d.remove(c70Var) && this.d.isEmpty()) {
                e();
            }
        }
    }

    public final void c(Object obj) {
        synchronized (this.c) {
            Object obj2 = this.e;
            if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                this.e = obj;
                ((Executor) ((y33) this.f3965a).d).execute(new y4(8, this, new ArrayList(this.d)));
            }
        }
    }

    public abstract void d();

    public abstract void e();
}
