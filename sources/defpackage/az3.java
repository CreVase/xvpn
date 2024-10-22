package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class az3 {
    public static final HashMap n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f369a;

    /* renamed from: b, reason: collision with root package name */
    public final pq0 f370b;
    public boolean g;
    public final Intent h;
    public rx1 l;
    public IInterface m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final qy3 j = new qy3(this, 0);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "AppUpdateService";
    public final WeakReference i = new WeakReference(null);

    public az3(Context context, pq0 pq0Var, Intent intent) {
        this.f369a = context;
        this.f370b = pq0Var;
        this.h = intent;
    }

    public static void b(az3 az3Var, ny3 ny3Var) {
        IInterface iInterface = az3Var.m;
        ArrayList arrayList = az3Var.d;
        pq0 pq0Var = az3Var.f370b;
        if (iInterface == null && !az3Var.g) {
            pq0Var.g("Initiate binding to the service.", new Object[0]);
            arrayList.add(ny3Var);
            rx1 rx1Var = new rx1(1, az3Var);
            az3Var.l = rx1Var;
            az3Var.g = true;
            if (!az3Var.f369a.bindService(az3Var.h, rx1Var, 1)) {
                pq0Var.g("Failed to bind to the service.", new Object[0]);
                az3Var.g = false;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ny3 ny3Var2 = (ny3) it.next();
                    j11 j11Var = new j11();
                    TaskCompletionSource taskCompletionSource = ny3Var2.f3565a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(j11Var);
                    }
                }
                arrayList.clear();
                return;
            }
            return;
        }
        if (az3Var.g) {
            pq0Var.g("Waiting to bind to the service.", new Object[0]);
            arrayList.add(ny3Var);
        } else {
            ny3Var.run();
        }
    }

    public final Handler a() {
        Handler handler;
        HashMap hashMap = n;
        synchronized (hashMap) {
            if (!hashMap.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                hashMap.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = (Handler) hashMap.get(this.c);
        }
        return handler;
    }

    public final void c() {
        HashSet hashSet = this.e;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
        }
        hashSet.clear();
    }
}
