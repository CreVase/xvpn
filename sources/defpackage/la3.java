package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final class la3 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final f80 f3093b;
    public final jx0 c;
    public final FirebaseMessaging d;
    public final ScheduledExecutorService f;
    public final ja3 h;
    public final kg e = new kg();
    public boolean g = false;

    public la3(FirebaseMessaging firebaseMessaging, f80 f80Var, ja3 ja3Var, jx0 jx0Var, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.d = firebaseMessaging;
        this.f3093b = f80Var;
        this.h = ja3Var;
        this.c = jx0Var;
        this.f3092a = context;
        this.f = scheduledExecutorService;
    }

    public static void a(Task task) {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e = e;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof IOException)) {
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new IOException(e2);
            }
            throw ((IOException) cause);
        } catch (TimeoutException e3) {
            e = e3;
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        }
    }

    public final void b(String str) {
        String a2 = this.d.a();
        jx0 jx0Var = this.c;
        jx0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(jx0Var.j(jx0Var.D(bundle, a2, "/topics/" + str)));
    }

    public final void c(String str) {
        String a2 = this.d.a();
        jx0 jx0Var = this.c;
        jx0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(jx0Var.j(jx0Var.D(bundle, a2, "/topics/" + str)));
    }

    public final void d(ca3 ca3Var) {
        synchronized (this.e) {
            String str = ca3Var.c;
            if (!this.e.containsKey(str)) {
                return;
            }
            ArrayDeque arrayDeque = (ArrayDeque) this.e.getOrDefault(str, null);
            TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(null);
            }
            if (arrayDeque.isEmpty()) {
                this.e.remove(str);
            }
        }
    }

    public final synchronized void e(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088 A[LOOP:0: B:1:0x0000->B:19:0x0088, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d A[Catch: IOException -> 0x0041, TRY_LEAVE, TryCatch #1 {IOException -> 0x0041, blocks: (B:8:0x000e, B:17:0x0039, B:23:0x003d, B:24:0x001d, B:27:0x0027), top: B:7:0x000e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r6 = this;
        L0:
            monitor-enter(r6)
            ja3 r0 = r6.h     // Catch: java.lang.Throwable -> L92
            ca3 r0 = r0.a()     // Catch: java.lang.Throwable -> L92
            r1 = 1
            if (r0 != 0) goto Lc
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L92
            return r1
        Lc:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L92
            r2 = 0
            java.lang.String r3 = r0.f606b     // Catch: java.io.IOException -> L41
            int r4 = r3.hashCode()     // Catch: java.io.IOException -> L41
            r5 = 83
            if (r4 == r5) goto L27
            r5 = 85
            if (r4 == r5) goto L1d
            goto L31
        L1d:
            java.lang.String r4 = "U"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L41
            if (r3 == 0) goto L31
            r3 = 1
            goto L32
        L27:
            java.lang.String r4 = "S"
            boolean r3 = r3.equals(r4)     // Catch: java.io.IOException -> L41
            if (r3 == 0) goto L31
            r3 = 0
            goto L32
        L31:
            r3 = -1
        L32:
            java.lang.String r4 = r0.f605a
            if (r3 == 0) goto L3d
            if (r3 == r1) goto L39
            goto L85
        L39:
            r6.c(r4)     // Catch: java.io.IOException -> L41
            goto L85
        L3d:
            r6.b(r4)     // Catch: java.io.IOException -> L41
            goto L85
        L41:
            r1 = move-exception
            java.lang.String r3 = "SERVICE_NOT_AVAILABLE"
            java.lang.String r4 = r1.getMessage()
            boolean r3 = r3.equals(r4)
            java.lang.String r4 = "FirebaseMessaging"
            if (r3 != 0) goto L6a
            java.lang.String r3 = "INTERNAL_SERVER_ERROR"
            java.lang.String r5 = r1.getMessage()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L5d
            goto L6a
        L5d:
            java.lang.String r3 = r1.getMessage()
            if (r3 != 0) goto L69
            java.lang.String r1 = "Topic operation failed without exception message. Will retry Topic operation."
            android.util.Log.e(r4, r1)
            goto L84
        L69:
            throw r1
        L6a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "Topic operation failed: "
            r3.<init>(r5)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = ". Will retry Topic operation."
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            android.util.Log.e(r4, r1)
        L84:
            r1 = 0
        L85:
            if (r1 != 0) goto L88
            return r2
        L88:
            ja3 r1 = r6.h
            r1.c(r0)
            r6.d(r0)
            goto L0
        L92:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L92
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.la3.f():boolean");
    }

    public final void g(long j2) {
        this.f.schedule(new na3(this, this.f3092a, this.f3093b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        synchronized (this) {
            this.g = true;
        }
    }
}
