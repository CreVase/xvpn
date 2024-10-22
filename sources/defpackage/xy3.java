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
public final class xy3 {
    public static final HashMap n = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f5249a;

    /* renamed from: b, reason: collision with root package name */
    public final i4 f5250b;
    public boolean g;
    public final Intent h;
    public rx1 l;
    public IInterface m;
    public final ArrayList d = new ArrayList();
    public final HashSet e = new HashSet();
    public final Object f = new Object();
    public final qy3 j = new qy3(this, 1);
    public final AtomicInteger k = new AtomicInteger(0);
    public final String c = "com.google.android.finsky.inappreviewservice.InAppReviewService";
    public final WeakReference i = new WeakReference(null);

    public xy3(Context context, i4 i4Var, Intent intent) {
        this.f5249a = context;
        this.f5250b = i4Var;
        this.h = intent;
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

    public final void b() {
        synchronized (this.f) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                ((TaskCompletionSource) it.next()).trySetException(new RemoteException(String.valueOf(this.c).concat(" : Binder has died.")));
            }
            this.e.clear();
        }
    }
}
