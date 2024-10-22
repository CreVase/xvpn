package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ox0 extends BroadcastReceiver {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReference f3745b = new AtomicReference();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3746a;

    public ox0(Context context) {
        this.f3746a = context;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        synchronized (px0.k) {
            Iterator it = ((op1) px0.l.values()).iterator();
            while (it.hasNext()) {
                ((px0) it.next()).d();
            }
        }
        this.f3746a.unregisterReceiver(this);
    }
}
