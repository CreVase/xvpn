package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeoutException;
import okhttp3.internal.http2.Http2;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class uo implements f22, yw3, ua, ou3, OnAdInspectorClosedListener, t3 {

    /* renamed from: b, reason: collision with root package name */
    public static uo f4706b;
    public static AccessibilityManager c;

    /* renamed from: a, reason: collision with root package name */
    public Object f4707a;

    public /* synthetic */ uo(Object obj) {
        this.f4707a = obj;
    }

    public static uo f(Context context) {
        if (f4706b == null) {
            f4706b = new uo();
        }
        if (c == null) {
            c = (AccessibilityManager) context.getSystemService("accessibility");
        }
        f4706b.f4707a = new WeakReference(context);
        return f4706b;
    }

    @Override // defpackage.ou3
    public final JSONObject a(View view) {
        JSONObject a2 = ev3.a(0, 0, 0, 0);
        int currentModeType = fl.q.getCurrentModeType();
        try {
            a2.put("noOutputDevice", cv3.f1687a[hx2.x((currentModeType != 1 ? currentModeType != 4 ? (char) 3 : (char) 1 : (char) 2) == 1 ? m20.j : 2)] == 1);
        } catch (JSONException e) {
            bx3.c("Error with setting output device status", e);
        }
        return a2;
    }

    @Override // defpackage.t3
    public final boolean b(View view) {
        ((FullDragDrawerLayout) this.f4707a).getClass();
        if (FullDragDrawerLayout.j(view) && ((FullDragDrawerLayout) this.f4707a).g(view) != 2) {
            ((FullDragDrawerLayout) this.f4707a).b(view);
            return true;
        }
        return false;
    }

    @Override // defpackage.ua
    public final void c(Bundle bundle) {
        ((ra) ((qa) this.f4707a)).a("clx", "_ae", bundle);
    }

    public final void d(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = (ArrayList) this.f4707a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll((ArrayList) this.f4707a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            ((ArrayList) this.f4707a).addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                ((ArrayList) this.f4707a).add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                ((ArrayList) this.f4707a).add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public final synchronized void e() {
        ((SharedPreferences) this.f4707a).edit().clear().commit();
    }

    public final void g(at3 at3Var, Thread thread, Throwable th) {
        na0 na0Var = (na0) this.f4707a;
        synchronized (na0Var) {
            Objects.toString(th);
            thread.getName();
            try {
                try {
                    aj3.a(na0Var.e.E(new ja0(na0Var, System.currentTimeMillis(), th, thread, at3Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    public final void h() {
        ((Semaphore) this.f4707a).release();
    }

    public final void i(String str) {
        Context context = (Context) ((WeakReference) this.f4707a).get();
        if (context != null && c.isTouchExplorationEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(Http2.INITIAL_MAX_FRAME_SIZE);
            obtain.setPackageName(context.getClass().getName());
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(str);
            c.sendAccessibilityEvent(obtain);
        }
    }

    @Override // com.google.android.gms.ads.OnAdInspectorClosedListener
    public final void onAdInspectorClosed(AdInspectorError adInspectorError) {
    }

    @Override // defpackage.f22
    public final wq3 q(View view, wq3 wq3Var) {
        ((yo) this.f4707a).m = wq3Var.b();
        ((yo) this.f4707a).n = wq3Var.c();
        ((yo) this.f4707a).o = wq3Var.d();
        ((yo) this.f4707a).e();
        return wq3Var;
    }

    @Override // defpackage.yw3
    public final Object zza() {
        xx3 xx3Var = (xx3) ((yw3) this.f4707a).zza();
        if (xx3Var != null) {
            return xx3Var;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public uo(hx2 hx2Var) {
        this.f4707a = new ArrayList(2);
    }

    public uo(Context context) {
        boolean isEmpty;
        this.f4707a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(x80.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    isEmpty = ((SharedPreferences) this.f4707a).getAll().isEmpty();
                }
                if (isEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                e();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                e.getMessage();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    @Override // defpackage.ou3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r7, org.json.JSONObject r8, defpackage.iu3 r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            dv3 r10 = defpackage.dv3.c
            if (r10 == 0) goto L8f
            java.util.Collection r10 = r10.a()
            int r0 = r10.size()
            int r0 = r0 * 2
            int r0 = r0 + 3
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L1e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r10.next()
            mu3 r0 = (defpackage.mu3) r0
            ru3 r0 = r0.c
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1e
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L3b
            goto L4e
        L3b:
            boolean r2 = r0.isShown()
            if (r2 != 0) goto L42
            goto L4e
        L42:
            r2 = r0
        L43:
            if (r2 == 0) goto L5d
            float r3 = r2.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L50
        L4e:
            r2 = 0
            goto L5e
        L50:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L5b
            android.view.View r2 = (android.view.View) r2
            goto L43
        L5b:
            r2 = 0
            goto L43
        L5d:
            r2 = 1
        L5e:
            if (r2 == 0) goto L1e
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L1e
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L1e
            r1.put(r0, r0)
            float r2 = r0.getZ()
            int r3 = r7.size()
        L77:
            if (r3 <= 0) goto L8b
            int r4 = r3 + (-1)
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            float r5 = r5.getZ()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L8b
            r3 = r4
            goto L77
        L8b:
            r7.add(r3, r0)
            goto L1e
        L8f:
            java.util.Iterator r7 = r7.iterator()
        L93:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r7.next()
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r0 = r6.f4707a
            ou3 r0 = (defpackage.ou3) r0
            r1 = r9
            hc3 r1 = (defpackage.hc3) r1
            r1.a(r10, r0, r8, r11)
            goto L93
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uo.a(android.view.View, org.json.JSONObject, iu3, boolean, boolean):void");
    }

    public uo(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.g = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.h = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.e = 0;
    }
}
