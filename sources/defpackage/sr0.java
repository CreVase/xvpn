package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class sr0 extends Service {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final ExecutorService f4398a;

    /* renamed from: b, reason: collision with root package name */
    public sr3 f4399b;
    public final Object c;
    public int d;
    public int e;

    public sr0() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-Intent-Handle"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f4398a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.e = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            fo3.a(intent);
        }
        synchronized (this.c) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                stopSelfResult(this.d);
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        if (this.f4399b == null) {
            this.f4399b = new sr3(new uo((Object) this));
        }
        return this.f4399b;
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f4398a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.d = i2;
            this.e++;
        }
        Intent intent2 = (Intent) ((Queue) wq2.b().d).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f4398a.execute(new cq0(15, this, intent2, taskCompletionSource));
        Task task = taskCompletionSource.getTask();
        if (task.isComplete()) {
            a(intent);
            return 2;
        }
        task.addOnCompleteListener(new zf(13), new ti0(0, this, intent));
        return 3;
    }
}
