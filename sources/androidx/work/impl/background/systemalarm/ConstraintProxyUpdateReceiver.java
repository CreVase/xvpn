package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.bo1;
import defpackage.dv;
import defpackage.hs3;
import defpackage.y33;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f292a = 0;

    static {
        bo1.e("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        if (!"androidx.work.impl.background.systemalarm.UpdateProxies".equals(str)) {
            bo1 c = bo1.c();
            String.format("Ignoring unknown action %s", str);
            c.a(new Throwable[0]);
        } else {
            ((y33) hs3.a0(context).t).r(new dv(this, intent, context, goAsync(), 1));
        }
    }
}
