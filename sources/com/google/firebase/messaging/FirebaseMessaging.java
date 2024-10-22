package com.google.firebase.messaging;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import defpackage.et2;
import defpackage.ew0;
import defpackage.f80;
import defpackage.fb2;
import defpackage.jx0;
import defpackage.la0;
import defpackage.la3;
import defpackage.lj2;
import defpackage.o13;
import defpackage.px0;
import defpackage.ti0;
import defpackage.u23;
import defpackage.uo;
import defpackage.xx0;
import defpackage.zb3;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class FirebaseMessaging {
    public static final long k = TimeUnit.HOURS.toSeconds(8);
    public static uo l;
    public static zb3 m;
    public static ScheduledThreadPoolExecutor n;

    /* renamed from: a, reason: collision with root package name */
    public final px0 f1585a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f1586b;
    public final jx0 c;
    public final lj2 d;
    public final et2 e;
    public final Executor f;
    public final Executor g;
    public final Executor h;
    public final f80 i;
    public boolean j;

    public FirebaseMessaging(px0 px0Var, fb2 fb2Var, fb2 fb2Var2, xx0 xx0Var, zb3 zb3Var, u23 u23Var) {
        px0Var.a();
        Context context = px0Var.f3931a;
        final f80 f80Var = new f80(context);
        px0Var.a();
        final jx0 jx0Var = new jx0(px0Var, f80Var, new Rpc(context), fb2Var, fb2Var2, xx0Var);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
        final int i = 1;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("Firebase-Messaging-File-Io"));
        final int i2 = 0;
        this.j = false;
        m = zb3Var;
        this.f1585a = px0Var;
        this.e = new et2(this, u23Var);
        px0Var.a();
        final Context context2 = px0Var.f3931a;
        this.f1586b = context2;
        ew0 ew0Var = new ew0();
        this.i = f80Var;
        this.g = newSingleThreadExecutor;
        this.c = jx0Var;
        this.d = new lj2(newSingleThreadExecutor);
        this.f = scheduledThreadPoolExecutor;
        this.h = threadPoolExecutor;
        px0Var.a();
        if (context instanceof Application) {
            ((Application) context).registerActivityLifecycleCallbacks(ew0Var);
        } else {
            Objects.toString(context);
        }
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: by0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f551b;

            {
                this.f551b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
            /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final void run() {
                /*
                    r6 = this;
                    int r0 = r2
                    com.google.firebase.messaging.FirebaseMessaging r1 = r6.f551b
                    switch(r0) {
                        case 0: goto L8;
                        default: goto L7;
                    }
                L7:
                    goto L2c
                L8:
                    uo r0 = com.google.firebase.messaging.FirebaseMessaging.l
                    et2 r0 = r1.e
                    boolean r0 = r0.e()
                    if (r0 == 0) goto L2b
                    o13 r0 = r1.d()
                    boolean r0 = r1.g(r0)
                    if (r0 == 0) goto L2b
                    monitor-enter(r1)
                    boolean r0 = r1.j     // Catch: java.lang.Throwable -> L28
                    if (r0 != 0) goto L26
                    r2 = 0
                    r1.f(r2)     // Catch: java.lang.Throwable -> L28
                L26:
                    monitor-exit(r1)
                    goto L2b
                L28:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                L2b:
                    return
                L2c:
                    android.content.Context r0 = r1.f1586b
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L35
                    r1 = r0
                L35:
                    java.lang.String r2 = "com.google.firebase.messaging"
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                    java.lang.String r2 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r2, r3)
                    if (r1 == 0) goto L45
                    goto L91
                L45:
                    zf r1 = new zf
                    r2 = 18
                    r1.<init>(r2)
                    java.lang.String r2 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r3 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r4 == 0) goto L75
                    java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    r5 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r3 == 0) goto L75
                    android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r4 == 0) goto L75
                    boolean r4 = r4.containsKey(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r4 == 0) goto L75
                    android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    boolean r2 = r3.getBoolean(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    goto L76
                L75:
                    r2 = 1
                L76:
                    boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
                    if (r3 != 0) goto L81
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                    goto L91
                L81:
                    com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource
                    r3.<init>()
                    gb2 r4 = new gb2
                    r4.<init>(r0, r2, r3)
                    r1.execute(r4)
                    r3.getTask()
                L91:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.by0.run():void");
            }
        });
        final ScheduledThreadPoolExecutor scheduledThreadPoolExecutor2 = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
        int i3 = la3.j;
        Tasks.call(scheduledThreadPoolExecutor2, new Callable() { // from class: ka3
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ja3 ja3Var;
                Context context3 = context2;
                ScheduledExecutorService scheduledExecutorService = scheduledThreadPoolExecutor2;
                FirebaseMessaging firebaseMessaging = this;
                f80 f80Var2 = f80Var;
                jx0 jx0Var2 = jx0Var;
                synchronized (ja3.class) {
                    WeakReference weakReference = ja3.d;
                    if (weakReference != null) {
                        ja3Var = (ja3) weakReference.get();
                    } else {
                        ja3Var = null;
                    }
                    if (ja3Var == null) {
                        ja3 ja3Var2 = new ja3(context3.getSharedPreferences("com.google.android.gms.appid", 0), scheduledExecutorService);
                        ja3Var2.b();
                        ja3.d = new WeakReference(ja3Var2);
                        ja3Var = ja3Var2;
                    }
                }
                return new la3(firebaseMessaging, f80Var2, ja3Var, jx0Var2, context3, scheduledExecutorService);
            }
        }).addOnSuccessListener(scheduledThreadPoolExecutor, new OnSuccessListener() { // from class: ay0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                boolean z;
                boolean z2;
                FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                la3 la3Var = (la3) obj;
                uo uoVar = FirebaseMessaging.l;
                if (firebaseMessaging.e.e()) {
                    if (la3Var.h.a() != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        synchronized (la3Var) {
                            z2 = la3Var.g;
                        }
                        if (!z2) {
                            la3Var.g(0L);
                        }
                    }
                }
            }
        });
        scheduledThreadPoolExecutor.execute(new Runnable(this) { // from class: by0

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FirebaseMessaging f551b;

            {
                this.f551b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.IContainer.get(jadx.api.plugins.input.data.attributes.IJadxAttrType)" because "cont" is null
                    	at jadx.core.codegen.RegionGen.declareVars(RegionGen.java:70)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:65)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    */
                /*
                    this = this;
                    int r0 = r2
                    com.google.firebase.messaging.FirebaseMessaging r1 = r6.f551b
                    switch(r0) {
                        case 0: goto L8;
                        default: goto L7;
                    }
                L7:
                    goto L2c
                L8:
                    uo r0 = com.google.firebase.messaging.FirebaseMessaging.l
                    et2 r0 = r1.e
                    boolean r0 = r0.e()
                    if (r0 == 0) goto L2b
                    o13 r0 = r1.d()
                    boolean r0 = r1.g(r0)
                    if (r0 == 0) goto L2b
                    monitor-enter(r1)
                    boolean r0 = r1.j     // Catch: java.lang.Throwable -> L28
                    if (r0 != 0) goto L26
                    r2 = 0
                    r1.f(r2)     // Catch: java.lang.Throwable -> L28
                L26:
                    monitor-exit(r1)
                    goto L2b
                L28:
                    r0 = move-exception
                    monitor-exit(r1)
                    throw r0
                L2b:
                    return
                L2c:
                    android.content.Context r0 = r1.f1586b
                    android.content.Context r1 = r0.getApplicationContext()
                    if (r1 != 0) goto L35
                    r1 = r0
                L35:
                    java.lang.String r2 = "com.google.firebase.messaging"
                    r3 = 0
                    android.content.SharedPreferences r1 = r1.getSharedPreferences(r2, r3)
                    java.lang.String r2 = "proxy_notification_initialized"
                    boolean r1 = r1.getBoolean(r2, r3)
                    if (r1 == 0) goto L45
                    goto L91
                L45:
                    zf r1 = new zf
                    r2 = 18
                    r1.<init>(r2)
                    java.lang.String r2 = "firebase_messaging_notification_delegation_enabled"
                    android.content.Context r3 = r0.getApplicationContext()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    android.content.pm.PackageManager r4 = r3.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r4 == 0) goto L75
                    java.lang.String r3 = r3.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    r5 = 128(0x80, float:1.8E-43)
                    android.content.pm.ApplicationInfo r3 = r4.getApplicationInfo(r3, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r3 == 0) goto L75
                    android.os.Bundle r4 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r4 == 0) goto L75
                    boolean r4 = r4.containsKey(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    if (r4 == 0) goto L75
                    android.os.Bundle r3 = r3.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    boolean r2 = r3.getBoolean(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
                    goto L76
                L75:
                    r2 = 1
                L76:
                    boolean r3 = com.google.android.gms.common.util.PlatformVersion.isAtLeastQ()
                    if (r3 != 0) goto L81
                    r0 = 0
                    com.google.android.gms.tasks.Tasks.forResult(r0)
                    goto L91
                L81:
                    com.google.android.gms.tasks.TaskCompletionSource r3 = new com.google.android.gms.tasks.TaskCompletionSource
                    r3.<init>()
                    gb2 r4 = new gb2
                    r4.<init>(r0, r2, r3)
                    r1.execute(r4)
                    r3.getTask()
                L91:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.by0.run():void");
            }
        });
    }

    public static void b(la0 la0Var, long j) {
        synchronized (FirebaseMessaging.class) {
            if (n == null) {
                n = new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("TAG"));
            }
            n.schedule(la0Var, j, TimeUnit.SECONDS);
        }
    }

    public static synchronized uo c(Context context) {
        uo uoVar;
        synchronized (FirebaseMessaging.class) {
            try {
                if (l == null) {
                    l = new uo(context);
                }
                uoVar = l;
            } catch (Throwable th) {
                throw th;
            }
        }
        return uoVar;
    }

    @Keep
    public static synchronized FirebaseMessaging getInstance(px0 px0Var) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            px0Var.a();
            firebaseMessaging = (FirebaseMessaging) px0Var.d.a(FirebaseMessaging.class);
            Preconditions.checkNotNull(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public final String a() {
        Task task;
        final o13 d = d();
        if (!g(d)) {
            return d.f3582a;
        }
        final String f = f80.f(this.f1585a);
        lj2 lj2Var = this.d;
        synchronized (lj2Var) {
            task = (Task) lj2Var.f3140b.getOrDefault(f, null);
            if (task == null) {
                jx0 jx0Var = this.c;
                task = jx0Var.j(jx0Var.D(new Bundle(), f80.f((px0) jx0Var.f2845a), "*")).onSuccessTask(this.h, new SuccessContinuation() { // from class: cy0
                    @Override // com.google.android.gms.tasks.SuccessContinuation
                    public final Task then(Object obj) {
                        String c;
                        String str;
                        FirebaseMessaging firebaseMessaging = FirebaseMessaging.this;
                        String str2 = f;
                        o13 o13Var = d;
                        String str3 = (String) obj;
                        uo c2 = FirebaseMessaging.c(firebaseMessaging.f1586b);
                        px0 px0Var = firebaseMessaging.f1585a;
                        px0Var.a();
                        if ("[DEFAULT]".equals(px0Var.f3932b)) {
                            c = "";
                        } else {
                            c = px0Var.c();
                        }
                        String d2 = firebaseMessaging.i.d();
                        synchronized (c2) {
                            long currentTimeMillis = System.currentTimeMillis();
                            int i = o13.e;
                            try {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("token", str3);
                                jSONObject.put("appVersion", d2);
                                jSONObject.put("timestamp", currentTimeMillis);
                                str = jSONObject.toString();
                            } catch (JSONException e) {
                                e.toString();
                                str = null;
                            }
                            if (str != null) {
                                SharedPreferences.Editor edit = ((SharedPreferences) c2.f4707a).edit();
                                edit.putString(c + "|T|" + str2 + "|*", str);
                                edit.commit();
                            }
                        }
                        if (o13Var == null || !str3.equals(o13Var.f3582a)) {
                            px0 px0Var2 = firebaseMessaging.f1585a;
                            px0Var2.a();
                            if ("[DEFAULT]".equals(px0Var2.f3932b)) {
                                if (Log.isLoggable("FirebaseMessaging", 3)) {
                                    px0Var2.a();
                                }
                                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                                intent.putExtra("token", str3);
                                new dw0(firebaseMessaging.f1586b).b(intent);
                            }
                        }
                        return Tasks.forResult(str3);
                    }
                }).continueWithTask(lj2Var.f3139a, new ti0(19, lj2Var, f));
                lj2Var.f3140b.put(f, task);
            }
        }
        try {
            return (String) Tasks.await(task);
        } catch (InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }

    public final o13 d() {
        String c;
        o13 a2;
        uo c2 = c(this.f1586b);
        px0 px0Var = this.f1585a;
        px0Var.a();
        if ("[DEFAULT]".equals(px0Var.f3932b)) {
            c = "";
        } else {
            c = px0Var.c();
        }
        String f = f80.f(this.f1585a);
        synchronized (c2) {
            a2 = o13.a(((SharedPreferences) c2.f4707a).getString(c + "|T|" + f + "|*", null));
        }
        return a2;
    }

    public final synchronized void e(boolean z) {
        this.j = z;
    }

    public final synchronized void f(long j) {
        b(new la0(this, Math.min(Math.max(30L, 2 * j), k)), j);
        this.j = true;
    }

    public final boolean g(o13 o13Var) {
        boolean z;
        if (o13Var == null) {
            return true;
        }
        String d = this.i.d();
        if (System.currentTimeMillis() <= o13Var.c + o13.d && d.equals(o13Var.f3583b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return false;
    }
}
