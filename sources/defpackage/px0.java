package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.util.Log;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class px0 {
    public static final Object k = new Object();
    public static final kg l = new kg();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3931a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3932b;
    public final dy0 c;
    public final b40 d;
    public final vi1 g;
    public final fb2 h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList j = new CopyOnWriteArrayList();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae A[LOOP:0: B:10:0x00a8->B:12:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public px0(android.content.Context r9, defpackage.dy0 r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px0.<init>(android.content.Context, dy0, java.lang.String):void");
    }

    public static px0 b() {
        px0 px0Var;
        synchronized (k) {
            px0Var = (px0) l.getOrDefault("[DEFAULT]", null);
            if (px0Var != null) {
                ((nh0) px0Var.h.get()).c();
            } else {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return px0Var;
    }

    public static px0 e(Context context, dy0 dy0Var) {
        px0 px0Var;
        boolean z;
        AtomicReference atomicReference = nx0.f3556a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = nx0.f3556a;
            if (atomicReference2.get() == null) {
                nx0 nx0Var = new nx0();
                while (true) {
                    if (atomicReference2.compareAndSet(null, nx0Var)) {
                        z = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(nx0Var);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            kg kgVar = l;
            Preconditions.checkState(true ^ kgVar.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            px0Var = new px0(context, dy0Var, "[DEFAULT]");
            kgVar.put("[DEFAULT]", px0Var);
        }
        px0Var.d();
        return px0Var;
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f3932b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.c.f1862b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void d() {
        HashMap hashMap;
        boolean z = true;
        if (!t9.T(this.f3931a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f3932b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f3931a;
            AtomicReference atomicReference = ox0.f3745b;
            if (atomicReference.get() == null) {
                ox0 ox0Var = new ox0(context);
                while (true) {
                    if (atomicReference.compareAndSet(null, ox0Var)) {
                        break;
                    } else if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    context.registerReceiver(ox0Var, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f3932b);
        Log.i("FirebaseApp", sb2.toString());
        b40 b40Var = this.d;
        a();
        boolean equals = "[DEFAULT]".equals(this.f3932b);
        AtomicReference atomicReference2 = b40Var.f;
        Boolean valueOf = Boolean.valueOf(equals);
        while (true) {
            if (atomicReference2.compareAndSet(null, valueOf)) {
                break;
            } else if (atomicReference2.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            synchronized (b40Var) {
                hashMap = new HashMap(b40Var.f395a);
            }
            b40Var.g(hashMap, equals);
        }
        ((nh0) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof px0)) {
            return false;
        }
        px0 px0Var = (px0) obj;
        px0Var.a();
        return this.f3932b.equals(px0Var.f3932b);
    }

    public final boolean f() {
        boolean z;
        a();
        od0 od0Var = (od0) this.g.get();
        synchronized (od0Var) {
            z = od0Var.f3646a;
        }
        return z;
    }

    public final int hashCode() {
        return this.f3932b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.f3932b).add("options", this.c).toString();
    }
}
