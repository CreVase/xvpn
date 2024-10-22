package defpackage;

import a.bx;
import a.du;
import a.wcyybbcujkCs;
import android.database.Cursor;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.AnimationUtils;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.b;
import androidx.work.ListenableWorker;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.facebook.ads.MediaView;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.google.ads.conversiontracking.e;
import com.google.ads.conversiontracking.g;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.security.xvpn.z35kb.DebugPageActivity;
import com.security.xvpn.z35kb.XTextViewNew;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;
import java.lang.ref.Reference;
import java.util.Collections;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class qw3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4064a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4065b;

    public /* synthetic */ qw3(Object obj, int i) {
        this.f4064a = i;
        this.f4065b = obj;
    }

    private void b() {
        Object obj;
        synchronized (((b) this.f4065b).f263a) {
            obj = ((b) this.f4065b).f;
            ((b) this.f4065b).f = b.k;
        }
        ((b) this.f4065b).i(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f4065b
            ne1 r0 = (defpackage.ne1) r0
            gl2 r0 = r0.c
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r0.h
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r0.readLock()
            r1 = 1
            r2 = 0
            r3 = 0
            r0.lock()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            java.lang.Object r4 = r5.f4065b     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            ne1 r4 = (defpackage.ne1) r4     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            boolean r4 = r4.a()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            if (r4 != 0) goto L20
            r0.unlock()
            return
        L20:
            java.lang.Object r4 = r5.f4065b     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            ne1 r4 = (defpackage.ne1) r4     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            java.util.concurrent.atomic.AtomicBoolean r4 = r4.d     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            boolean r1 = r4.compareAndSet(r1, r2)     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            if (r1 != 0) goto L30
            r0.unlock()
            return
        L30:
            java.lang.Object r1 = r5.f4065b     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            ne1 r1 = (defpackage.ne1) r1     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            gl2 r1 = r1.c     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            u33 r1 = r1.c     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            r33 r1 = r1.q()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            j31 r1 = (defpackage.j31) r1     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            android.database.sqlite.SQLiteDatabase r1 = r1.f2698a     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            boolean r1 = r1.inTransaction()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            if (r1 == 0) goto L4a
            r0.unlock()
            return
        L4a:
            java.lang.Object r1 = r5.f4065b     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            r2 = r1
            ne1 r2 = (defpackage.ne1) r2     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            gl2 r2 = r2.c     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            boolean r2 = r2.f     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            if (r2 == 0) goto L78
            ne1 r1 = (defpackage.ne1) r1     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            gl2 r1 = r1.c     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            u33 r1 = r1.c     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            r33 r1 = r1.q()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            j31 r1 = (defpackage.j31) r1     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            r1.a()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            java.util.HashSet r3 = r5.a()     // Catch: java.lang.Throwable -> L73
            r1.K()     // Catch: java.lang.Throwable -> L73
            r1.c()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            goto L86
        L6f:
            r1 = move-exception
            goto L7f
        L71:
            r1 = move-exception
            goto L7f
        L73:
            r2 = move-exception
            r1.c()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            throw r2     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
        L78:
            java.util.HashSet r3 = r5.a()     // Catch: android.database.sqlite.SQLiteException -> L6f java.lang.IllegalStateException -> L71 java.lang.Throwable -> L7d
            goto L86
        L7d:
            r1 = move-exception
            goto Lc1
        L7f:
            java.lang.String r2 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r2, r4, r1)     // Catch: java.lang.Throwable -> L7d
        L86:
            r0.unlock()
            if (r3 == 0) goto Lc0
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto Lc0
            java.lang.Object r0 = r5.f4065b
            ne1 r0 = (defpackage.ne1) r0
            jm2 r0 = r0.h
            monitor-enter(r0)
            java.lang.Object r1 = r5.f4065b     // Catch: java.lang.Throwable -> Lbd
            ne1 r1 = (defpackage.ne1) r1     // Catch: java.lang.Throwable -> Lbd
            jm2 r1 = r1.h     // Catch: java.lang.Throwable -> Lbd
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lbd
            hm2 r1 = (defpackage.hm2) r1     // Catch: java.lang.Throwable -> Lbd
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Lbd
            if (r2 != 0) goto Lac
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            goto Lc0
        Lac:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> Lbd
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> Lbd
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> Lbd
            me1 r1 = (defpackage.me1) r1     // Catch: java.lang.Throwable -> Lbd
            r1.getClass()     // Catch: java.lang.Throwable -> Lbd
            r1 = 0
            throw r1     // Catch: java.lang.Throwable -> Lbd
        Lbd:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lbd
            throw r1
        Lc0:
            return
        Lc1:
            r0.unlock()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qw3.c():void");
    }

    private void d() {
        String str;
        ConstraintTrackingWorker constraintTrackingWorker = (ConstraintTrackingWorker) this.f4065b;
        Object obj = constraintTrackingWorker.getInputData().f2751a.get("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            bo1.c().b(ConstraintTrackingWorker.f, "No worker to delegate to.", new Throwable[0]);
            constraintTrackingWorker.d.h(new nl1());
            return;
        }
        ListenableWorker a2 = constraintTrackingWorker.getWorkerFactory().a(constraintTrackingWorker.getApplicationContext(), str, constraintTrackingWorker.f299a);
        constraintTrackingWorker.e = a2;
        if (a2 == null) {
            bo1 c = bo1.c();
            String str2 = ConstraintTrackingWorker.f;
            c.a(new Throwable[0]);
            constraintTrackingWorker.d.h(new nl1());
            return;
        }
        rs3 h = hs3.a0(constraintTrackingWorker.getApplicationContext()).s.n().h(constraintTrackingWorker.getId().toString());
        if (h == null) {
            constraintTrackingWorker.d.h(new nl1());
            return;
        }
        wr3 wr3Var = new wr3(constraintTrackingWorker.getApplicationContext(), constraintTrackingWorker.getTaskExecutor(), constraintTrackingWorker);
        wr3Var.c(Collections.singletonList(h));
        if (wr3Var.a(constraintTrackingWorker.getId().toString())) {
            bo1 c2 = bo1.c();
            String str3 = ConstraintTrackingWorker.f;
            String.format("Constraints met for delegate %s", str);
            c2.a(new Throwable[0]);
            try {
                ml1 startWork = constraintTrackingWorker.e.startWork();
                startWork.addListener(new y4(10, constraintTrackingWorker, startWork), constraintTrackingWorker.getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                bo1 c3 = bo1.c();
                String str4 = ConstraintTrackingWorker.f;
                String.format("Delegated worker %s threw exception in startWork.", str);
                c3.a(th);
                synchronized (constraintTrackingWorker.f300b) {
                    if (constraintTrackingWorker.c) {
                        bo1.c().a(new Throwable[0]);
                        constraintTrackingWorker.d.h(new ol1());
                    } else {
                        constraintTrackingWorker.d.h(new nl1());
                    }
                    return;
                }
            }
        }
        bo1 c4 = bo1.c();
        String str5 = ConstraintTrackingWorker.f;
        String.format("Constraints not met for delegate %s. Requesting retry.", str);
        c4.a(new Throwable[0]);
        constraintTrackingWorker.d.h(new ol1());
    }

    private void e() {
        synchronized (((e) this.f4065b).f1385a) {
            Object obj = this.f4065b;
            if (((e) obj).e && g.d(((e) obj).c)) {
                Object obj2 = this.f4065b;
                if (!((e) obj2).d) {
                    ((e) obj2).f1386b.addAll(((e) obj2).f.a(100L));
                    g.c(((e) this.f4065b).c);
                    Object obj3 = this.f4065b;
                    ((e) obj3).d = true;
                    ((e) obj3).f1385a.notify();
                }
            }
        }
    }

    public final HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor g = ((ne1) this.f4065b).c.g(new x50("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
        while (g.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(g.getInt(0)));
            } catch (Throwable th) {
                g.close();
                throw th;
            }
        }
        g.close();
        if (!hashSet.isEmpty()) {
            ((ne1) this.f4065b).f.K();
        }
        return hashSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        View d;
        int width;
        int i;
        ju1 ju1Var;
        b5 b5Var;
        boolean z2 = true;
        int i2 = 0;
        switch (this.f4064a) {
            case 0:
                wcyybbcujkCs.f5b.h();
                return;
            case 1:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (TextUtils.equals(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        return;
                    } else {
                        throw e;
                    }
                } catch (NullPointerException e2) {
                    if (!TextUtils.equals(e2.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e2;
                    }
                    return;
                }
            case 2:
                v93 v93Var = (v93) this.f4065b;
                Window.Callback callback = v93Var.f4801b;
                Menu t = v93Var.t();
                if (t instanceof ju1) {
                    ju1Var = (ju1) t;
                } else {
                    ju1Var = null;
                }
                if (ju1Var != null) {
                    ju1Var.w();
                }
                try {
                    t.clear();
                    if (!callback.onCreatePanelMenu(0, t) || !callback.onPreparePanel(0, null, t)) {
                        t.clear();
                    }
                    if (ju1Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (ju1Var != null) {
                        ju1Var.v();
                    }
                }
            case 3:
                fn0 fn0Var = (fn0) this.f4065b;
                fn0Var.a(true);
                fn0Var.invalidateSelf();
                return;
            case 4:
                go0 go0Var = (go0) this.f4065b;
                go0Var.l = null;
                go0Var.drawableStateChanged();
                return;
            case 5:
                ActionMenuView actionMenuView = ((Toolbar) this.f4065b).f170a;
                if (actionMenuView != null && (b5Var = actionMenuView.t) != null) {
                    b5Var.l();
                    return;
                }
                return;
            case 6:
                kl1 kl1Var = (kl1) this.f4065b;
                if (kl1Var.o) {
                    if (kl1Var.m) {
                        kl1Var.m = false;
                        bk bkVar = kl1Var.f2967a;
                        bkVar.getClass();
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        bkVar.e = currentAnimationTimeMillis;
                        bkVar.g = -1L;
                        bkVar.f = currentAnimationTimeMillis;
                        bkVar.h = 0.5f;
                    }
                    bk bkVar2 = kl1Var.f2967a;
                    if (bkVar2.g <= 0 || AnimationUtils.currentAnimationTimeMillis() <= bkVar2.g + bkVar2.i) {
                        z2 = false;
                    }
                    if (!z2 && kl1Var.f()) {
                        if (kl1Var.n) {
                            kl1Var.n = false;
                            long uptimeMillis = SystemClock.uptimeMillis();
                            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                            kl1Var.c.onTouchEvent(obtain);
                            obtain.recycle();
                        }
                        if (bkVar2.f != 0) {
                            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                            float a2 = bkVar2.a(currentAnimationTimeMillis2);
                            long j = currentAnimationTimeMillis2 - bkVar2.f;
                            bkVar2.f = currentAnimationTimeMillis2;
                            ll1.b(kl1Var.q, (int) (((float) j) * ((a2 * 4.0f) + ((-4.0f) * a2 * a2)) * bkVar2.d));
                            View view = kl1Var.c;
                            WeakHashMap weakHashMap = ll3.f3151a;
                            uk3.m(view, this);
                            return;
                        }
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    kl1Var.o = false;
                    return;
                }
                return;
            case 7:
                ((vl3) this.f4065b).p(0);
                return;
            case 8:
                synchronized (this) {
                    ((tl3) this.f4065b).c = false;
                }
                while (true) {
                    Reference poll = tl3.m.poll();
                    if (poll != null) {
                        if (poll instanceof ro3) {
                            ((ro3) poll).a();
                        }
                    } else {
                        if (!((tl3) this.f4065b).e.isAttachedToWindow()) {
                            View view2 = ((tl3) this.f4065b).e;
                            pl3 pl3Var = tl3.n;
                            view2.removeOnAttachStateChangeListener(pl3Var);
                            ((tl3) this.f4065b).e.addOnAttachStateChangeListener(pl3Var);
                            return;
                        }
                        ((tl3) this.f4065b).g();
                        return;
                    }
                }
            case 9:
                b();
                return;
            case 10:
                c();
                return;
            case 11:
                d();
                return;
            case 12:
                zw3 zw3Var = (zw3) this.f4065b;
                zw3Var.c.f3888a = 0;
                zw3Var.c.g = null;
                x50 x50Var = zw3Var.c.f;
                wp wpVar = ax3.k;
                x50Var.C(pd0.T(24, 6, wpVar));
                zw3Var.a(wpVar);
                return;
            case 13:
                MediaView mediaView = (MediaView) this.f4065b;
                mediaView.removeAllViews();
                MediaView.access$002(mediaView, null);
                MediaView.access$102(mediaView, DynamicLoaderFactory.makeLoader(MediaView.access$200(mediaView).getContext()).createMediaViewApi());
                MediaView.access$300(mediaView, MediaView.access$100(mediaView));
                MediaView.access$100(mediaView).initialize(MediaView.access$200(mediaView), mediaView);
                return;
            case 14:
                e();
                return;
            case 15:
                try {
                    ((Runnable) this.f4065b).run();
                    return;
                } catch (Exception e3) {
                    pe0.o("Executor", "Background execution failure.", e3);
                    return;
                }
            case 16:
                u92 u92Var = (u92) ((dm1) this.f4065b);
                qm2[] qm2VarArr = u92Var.s;
                int length = qm2VarArr.length;
                while (i2 < length) {
                    qm2 qm2Var = qm2VarArr[i2];
                    qm2Var.p(true);
                    rn0 rn0Var = qm2Var.h;
                    if (rn0Var != null) {
                        rn0Var.c(qm2Var.e);
                        qm2Var.h = null;
                        qm2Var.g = null;
                    }
                    i2++;
                }
                y33 y33Var = u92Var.l;
                dv0 dv0Var = (dv0) y33Var.c;
                if (dv0Var != null) {
                    dv0Var.release();
                    y33Var.c = null;
                }
                y33Var.d = null;
                return;
            case 17:
                yq yqVar = (yq) this.f4065b;
                yqVar.c = false;
                vl3 vl3Var = ((BottomSheetBehavior) yqVar.e).M;
                if (vl3Var != null && vl3Var.g()) {
                    yqVar.a(yqVar.f5376b);
                    return;
                }
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) yqVar.e;
                if (bottomSheetBehavior.L == 2) {
                    bottomSheetBehavior.E(yqVar.f5376b);
                    return;
                }
                return;
            case 18:
                ((ThreadLocal) ((eb3) this.f4065b).d).set(Boolean.TRUE);
                return;
            case 19:
                ((hc3) this.f4065b).e.f();
                return;
            case 20:
                XTextViewNew xTextViewNew = ((DebugPageActivity) ((ia0) this.f4065b).f2559a).h;
                if (xTextViewNew != null) {
                    bx i3 = hx2.i(76);
                    String u = i3.u();
                    i3.h();
                    xTextViewNew.setText(u);
                    return;
                }
                return;
            case 21:
                sb sbVar = (sb) this.f4065b;
                sbVar.f = (sbVar.f + 1) % Integer.MAX_VALUE;
                return;
            case 22:
                om1 om1Var = (om1) this.f4065b;
                om1Var.f3693b++;
                om1Var.invalidate();
                om1Var.postDelayed(this, 200L);
                return;
            case 23:
                pe0.a("AppUpdateManager", "isUpdateChecked2 = " + uf.f4658b);
                if (!uf.f4658b) {
                    uf.f4658b = true;
                    ei2 ei2Var = new ei2();
                    bx i4 = hx2.i(144);
                    String u2 = i4.u();
                    i4.h();
                    ei2Var.f1938a = u2;
                    if (m20.L(u2, "NotNeed")) {
                        GoogleIABHelper.g.getClass();
                        uf ufVar = uf.f4657a;
                        boolean z3 = !uf.c(uf.g);
                        bx bxVar = new bx();
                        bxVar.z("GooglePlay");
                        bxVar.v(z3);
                        du.d(143, bxVar);
                        String u3 = bxVar.u();
                        bxVar.h();
                        ei2Var.f1938a = u3;
                    }
                    pe0.a("AppUpdateManager", "GetGoogleUpdateType_NotAllowedInMainThread:" + ei2Var.f1938a);
                    ew3.d0(new cq0(19, ei2Var, (lt3) this.f4065b, this));
                    if (!m20.L(ei2Var.f1938a, "NotNeed")) {
                        GoogleIABHelper.g.getClass();
                        uf ufVar2 = uf.f4657a;
                        boolean z4 = !uf.c(uf.g);
                        bx bxVar2 = new bx();
                        bxVar2.z("GooglePlay");
                        bxVar2.v(z4);
                        du.d(143, bxVar2);
                        String u4 = bxVar2.u();
                        bxVar2.h();
                        ei2Var.f1938a = u4;
                        return;
                    }
                    return;
                }
                return;
            default:
                t31 t31Var = (t31) this.f4065b;
                int i5 = t31Var.s.o;
                int i6 = 3;
                if (t31Var.r == 3) {
                    z = true;
                } else {
                    z = false;
                }
                FullDragDrawerLayout fullDragDrawerLayout = t31Var.t;
                if (z) {
                    d = fullDragDrawerLayout.d(3);
                    if (d != null) {
                        i = -d.getWidth();
                    } else {
                        i = 0;
                    }
                    width = i + i5;
                } else {
                    d = fullDragDrawerLayout.d(5);
                    width = fullDragDrawerLayout.getWidth() - i5;
                }
                if (d != null) {
                    if (((z && d.getLeft() < width) || (!z && d.getLeft() > width)) && fullDragDrawerLayout.g(d) == 0) {
                        fullDragDrawerLayout.invalidate();
                        if (t31Var.r == 3) {
                            i6 = 5;
                        }
                        FullDragDrawerLayout fullDragDrawerLayout2 = t31Var.t;
                        View d2 = fullDragDrawerLayout2.d(i6);
                        if (d2 != null) {
                            fullDragDrawerLayout2.b(d2);
                        }
                        if (!fullDragDrawerLayout.q) {
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            MotionEvent obtain2 = MotionEvent.obtain(uptimeMillis2, uptimeMillis2, 3, 0.0f, 0.0f, 0);
                            int childCount = fullDragDrawerLayout.getChildCount();
                            while (i2 < childCount) {
                                fullDragDrawerLayout.getChildAt(i2).dispatchTouchEvent(obtain2);
                                i2++;
                            }
                            obtain2.recycle();
                            fullDragDrawerLayout.q = true;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw3(e eVar) {
        this(eVar, 14);
        this.f4064a = 14;
    }
}
