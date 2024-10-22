package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.firebase.messaging.FirebaseMessaging;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class la0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3088a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3089b;
    public final Object c;
    public final Object d;
    public final Object e;

    public la0(FirebaseMessaging firebaseMessaging, long j) {
        this.f3088a = 1;
        this.e = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.d = firebaseMessaging;
        this.f3089b = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.c = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public final Context a() {
        return ((FirebaseMessaging) this.d).f1586b;
    }

    public final boolean b() {
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        if (connectivityManager != null) {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } else {
            networkInfo = null;
        }
        if (networkInfo != null && networkInfo.isConnected()) {
            return true;
        }
        return false;
    }

    public final boolean c() {
        boolean z = true;
        try {
            if (((FirebaseMessaging) this.d).a() != null) {
                return true;
            }
            Log.e("FirebaseMessaging", "Token retrieval failed: null");
            return false;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                z = false;
            }
            if (z) {
                e.getMessage();
                return false;
            }
            if (e.getMessage() == null) {
                return false;
            }
            throw e;
        } catch (SecurityException unused) {
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3088a;
        Object obj = this.d;
        Object obj2 = this.c;
        long j = this.f3089b;
        boolean z = true;
        switch (i) {
            case 0:
                na0 na0Var = (na0) this.e;
                vb0 vb0Var = na0Var.n;
                if (vb0Var == null || !vb0Var.e.get()) {
                    z = false;
                }
                if (!z) {
                    long j2 = j / 1000;
                    String d = na0Var.d();
                    if (d != null) {
                        na0Var.m.t((Throwable) obj2, (Thread) obj, d, MRAIDPresenter.ERROR, j2, false);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (wq2.b().d(a())) {
                    ((PowerManager.WakeLock) obj2).acquire();
                }
                try {
                    try {
                        FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj;
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.j = true;
                        }
                        if (!((FirebaseMessaging) obj).i.g()) {
                            ((FirebaseMessaging) obj).e(false);
                            if (!wq2.b().d(a())) {
                                return;
                            }
                        } else if (wq2.b().c(a()) && !b()) {
                            fd fdVar = new fd(this);
                            ((la0) fdVar.f2078b).a().registerReceiver(fdVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!wq2.b().d(a())) {
                                return;
                            }
                        } else {
                            if (c()) {
                                ((FirebaseMessaging) obj).e(false);
                            } else {
                                ((FirebaseMessaging) obj).f(j);
                            }
                            if (!wq2.b().d(a())) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        ((FirebaseMessaging) obj).e(false);
                        if (!wq2.b().d(a())) {
                            return;
                        }
                    }
                    ((PowerManager.WakeLock) obj2).release();
                    return;
                } catch (Throwable th) {
                    if (wq2.b().d(a())) {
                        ((PowerManager.WakeLock) obj2).release();
                    }
                    throw th;
                }
        }
    }

    public la0(na0 na0Var, long j, Throwable th, Thread thread) {
        this.f3088a = 0;
        this.e = na0Var;
        this.f3089b = j;
        this.c = th;
        this.d = thread;
    }
}
