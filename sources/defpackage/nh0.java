package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class nh0 implements t71, u71 {

    /* renamed from: a, reason: collision with root package name */
    public final fb2 f3458a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f3459b;
    public final fb2 c;
    public final Set d;
    public final Executor e;

    public nh0(Context context, String str, Set set, fb2 fb2Var, Executor executor) {
        this.f3458a = new lx0(context, str);
        this.d = set;
        this.e = executor;
        this.c = fb2Var;
        this.f3459b = context;
    }

    public final synchronized int a() {
        long currentTimeMillis = System.currentTimeMillis();
        v71 v71Var = (v71) this.f3458a.get();
        if (v71Var.i(currentTimeMillis)) {
            v71Var.g();
            return 3;
        }
        return 1;
    }

    public final Task b() {
        if (!t9.T(this.f3459b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new mh0(this, 0));
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!t9.T(this.f3459b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new mh0(this, 1));
        }
    }
}
