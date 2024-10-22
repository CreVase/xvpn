package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import com.google.android.play.core.install.zza;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ix3 {

    /* renamed from: a, reason: collision with root package name */
    public final pq0 f2672a;

    /* renamed from: b, reason: collision with root package name */
    public final IntentFilter f2673b;
    public final Context c;
    public final HashSet d;
    public fd e;

    public ix3(Context context) {
        pq0 pq0Var = new pq0("AppUpdateListenerRegistry", 3);
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.d = new HashSet();
        this.e = null;
        this.f2672a = pq0Var;
        this.f2673b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized void a(tf tfVar) {
        this.f2672a.g("registerListener", new Object[0]);
        this.d.add(tfVar);
        d();
    }

    public final synchronized void c(zza zzaVar) {
        Iterator it = new HashSet(this.d).iterator();
        while (it.hasNext()) {
            ((tf) ((wc1) it.next())).a(zzaVar);
        }
    }

    public final void d() {
        fd fdVar;
        HashSet hashSet = this.d;
        boolean isEmpty = hashSet.isEmpty();
        Context context = this.c;
        if (!isEmpty && this.e == null) {
            fd fdVar2 = new fd(this);
            this.e = fdVar2;
            int i = Build.VERSION.SDK_INT;
            IntentFilter intentFilter = this.f2673b;
            if (i >= 33) {
                context.registerReceiver(fdVar2, intentFilter, 2);
            } else {
                context.registerReceiver(fdVar2, intentFilter);
            }
        }
        if (hashSet.isEmpty() && (fdVar = this.e) != null) {
            context.unregisterReceiver(fdVar);
            this.e = null;
        }
    }
}
