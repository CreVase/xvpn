package defpackage;

import android.content.Context;
import java.io.Closeable;
import javax.inject.Provider;

/* loaded from: classes.dex */
public final class hd0 implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    public Provider f2403a = fm0.a(tf3.r);

    /* renamed from: b, reason: collision with root package name */
    public yc1 f2404b;
    public Provider c;
    public yb0 d;
    public Provider e;
    public Provider f;
    public Provider g;

    public hd0(Context context) {
        if (context != null) {
            yc1 yc1Var = new yc1(context);
            this.f2404b = yc1Var;
            s71 s71Var = cp3.k;
            c02 c02Var = ew3.v;
            int i = 22;
            this.c = fm0.a(new x50(i, yc1Var, new yb0(yc1Var, s71Var, c02Var, 0)));
            yc1 yc1Var2 = this.f2404b;
            this.d = new yb0(yc1Var2, pd0.f3828b, pe0.l, 1);
            Provider a2 = fm0.a(new ja1(yc1Var2, 19));
            this.e = a2;
            Provider a3 = fm0.a(new ec3(s71Var, c02Var, pg1.h, this.d, a2, 2));
            this.f = a3;
            v51 v51Var = new v51(s71Var, i);
            yc1 yc1Var3 = this.f2404b;
            eb3 eb3Var = new eb3(yc1Var3, a3, v51Var, c02Var);
            Provider provider = this.f2403a;
            Provider provider2 = this.c;
            this.g = fm0.a(new ec3(s71Var, c02Var, new ec3(provider, provider2, eb3Var, a3, a3, 1), new at3(yc1Var3, provider2, a3, eb3Var, provider, a3, a3), new wq2(provider, a3, eb3Var, a3), 0));
            return;
        }
        throw new NullPointerException("instance cannot be null");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void close() {
        ((am2) ((os0) this.f.get())).close();
    }
}
