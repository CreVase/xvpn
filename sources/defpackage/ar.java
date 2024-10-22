package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class ar extends q70 {
    public final fd g;

    static {
        bo1.e("BrdcstRcvrCnstrntTrckr");
    }

    public ar(Context context, g63 g63Var) {
        super(context, g63Var);
        this.g = new fd(this, 2);
    }

    @Override // defpackage.q70
    public final void d() {
        bo1 c = bo1.c();
        String.format("%s: registering receiver", getClass().getSimpleName());
        c.a(new Throwable[0]);
        this.f3966b.registerReceiver(this.g, f());
    }

    @Override // defpackage.q70
    public final void e() {
        bo1 c = bo1.c();
        String.format("%s: unregistering receiver", getClass().getSimpleName());
        c.a(new Throwable[0]);
        this.f3966b.unregisterReceiver(this.g);
    }

    public abstract IntentFilter f();

    public abstract void g(Intent intent);
}
