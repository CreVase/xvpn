package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ur3 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4723a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f4724b;
    public final ScheduledExecutorService c;
    public final ArrayDeque d;
    public sr3 e;
    public boolean f;

    public ur3(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new NamedThreadFactory("Firebase-FirebaseInstanceIdServiceConnection"));
        this.d = new ArrayDeque();
        this.f = false;
        Context applicationContext = context.getApplicationContext();
        this.f4723a = applicationContext;
        this.f4724b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        while (!this.d.isEmpty()) {
            sr3 sr3Var = this.e;
            if (sr3Var != null && sr3Var.isBinderAlive()) {
                this.e.a((tr3) this.d.poll());
            } else {
                if (!this.f) {
                    this.f = true;
                    try {
                    } catch (SecurityException e) {
                        Log.e("FirebaseMessaging", "Exception while binding the service", e);
                    }
                    if (!ConnectionTracker.getInstance().bindService(this.f4723a, this.f4724b, this, 65)) {
                        Log.e("FirebaseMessaging", "binding to the service failed");
                        this.f = false;
                        while (true) {
                            ArrayDeque arrayDeque = this.d;
                            if (arrayDeque.isEmpty()) {
                                break;
                            } else {
                                ((tr3) arrayDeque.poll()).f4564b.trySetResult(null);
                            }
                        }
                    }
                }
                return;
            }
        }
    }

    public final synchronized Task b(Intent intent) {
        tr3 tr3Var;
        tr3Var = new tr3(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        tr3Var.f4564b.getTask().addOnCompleteListener(scheduledExecutorService, new z5(scheduledExecutorService.schedule(new nw3(tr3Var, 26), 20L, TimeUnit.SECONDS), 2));
        this.d.add(tr3Var);
        a();
        return tr3Var.f4564b.getTask();
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        this.f = false;
        if (!(iBinder instanceof sr3)) {
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.d;
                if (!arrayDeque.isEmpty()) {
                    ((tr3) arrayDeque.poll()).f4564b.trySetResult(null);
                } else {
                    return;
                }
            }
        } else {
            this.e = (sr3) iBinder;
            a();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
