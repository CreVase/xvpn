package com.chartboost.sdk.impl;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import defpackage.aa0;
import defpackage.ba0;
import defpackage.c90;
import defpackage.ch3;
import defpackage.df1;
import defpackage.fl;
import defpackage.ke0;
import defpackage.kw3;
import defpackage.l41;
import defpackage.ng0;
import defpackage.pd0;
import defpackage.qi0;
import defpackage.sh0;
import defpackage.t90;
import defpackage.vl0;
import defpackage.w90;
import defpackage.z33;
import defpackage.zf3;
import defpackage.zo1;
import java.lang.ref.WeakReference;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes.dex */
public final class sa {
    public static final a o = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final View f1131a;

    /* renamed from: b, reason: collision with root package name */
    public final View f1132b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public b g;
    public final WeakReference<Activity> h;
    public df1 i;
    public WeakReference<ViewTreeObserver> j;
    public ViewTreeObserver.OnPreDrawListener k;
    public boolean l;
    public Long m;
    public final Rect n;

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(ng0 ng0Var) {
            this();
        }

        public final View a(Context context, View view) {
            Activity activity;
            View view2;
            View rootView;
            Window window;
            View decorView;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null || (view2 = decorView.findViewById(R.id.content)) == null) {
                if (view != null && (rootView = view.getRootView()) != null) {
                    view2 = rootView.findViewById(R.id.content);
                } else {
                    view2 = null;
                }
                if (view2 == null) {
                    if (view == null) {
                        return null;
                    }
                    return view.getRootView();
                }
            }
            return view2;
        }

        public a() {
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a();
    }

    /* loaded from: classes.dex */
    public static final class c extends defpackage.w implements CoroutineExceptionHandler {
        public c(w90 w90Var) {
            super(w90Var);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public void handleException(t90 t90Var, Throwable th) {
            String str;
            str = ta.f1161a;
            f6.a(str, "Visibility check ran into a problem: " + th);
        }
    }

    @ke0(c = "com.chartboost.sdk.internal.measurement.VisibilityTracker$scheduleVisibilityCheck$2", f = "VisibilityTracker.kt", l = {150}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends z33 implements l41 {

        /* renamed from: a, reason: collision with root package name */
        public int f1133a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1134b;

        @ke0(c = "com.chartboost.sdk.internal.measurement.VisibilityTracker$scheduleVisibilityCheck$2$1", f = "VisibilityTracker.kt", l = {151}, m = "invokeSuspend")
        /* loaded from: classes.dex */
        public static final class a extends z33 implements l41 {

            /* renamed from: a, reason: collision with root package name */
            public int f1135a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ sa f1136b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(sa saVar, c90 c90Var) {
                super(2, c90Var);
                this.f1136b = saVar;
            }

            @Override // defpackage.l41
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(aa0 aa0Var, c90 c90Var) {
                return ((a) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
            }

            @Override // defpackage.mn
            public final c90 create(Object obj, c90 c90Var) {
                return new a(this.f1136b, c90Var);
            }

            @Override // defpackage.mn
            public final Object invokeSuspend(Object obj) {
                ba0 ba0Var = ba0.f430a;
                int i = this.f1135a;
                if (i != 0) {
                    if (i == 1) {
                        fl.a0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    fl.a0(obj);
                    long j = this.f1136b.e;
                    this.f1135a = 1;
                    if (defpackage.t9.C(j, this) == ba0Var) {
                        return ba0Var;
                    }
                }
                return ch3.f636a;
            }
        }

        public d(c90 c90Var) {
            super(2, c90Var);
        }

        @Override // defpackage.l41
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(aa0 aa0Var, c90 c90Var) {
            return ((d) create(aa0Var, c90Var)).invokeSuspend(ch3.f636a);
        }

        @Override // defpackage.mn
        public final c90 create(Object obj, c90 c90Var) {
            d dVar = new d(c90Var);
            dVar.f1134b = obj;
            return dVar;
        }

        @Override // defpackage.mn
        public final Object invokeSuspend(Object obj) {
            aa0 aa0Var;
            sh0 sh0Var;
            a aVar;
            ba0 ba0Var = ba0.f430a;
            int i = this.f1133a;
            if (i != 0) {
                if (i == 1) {
                    aa0Var = (aa0) this.f1134b;
                    fl.a0(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                fl.a0(obj);
                aa0Var = (aa0) this.f1134b;
            }
            do {
                if (pd0.F(aa0Var) && !sa.this.l) {
                    if (sa.this.e()) {
                        sa saVar = sa.this;
                        Long l = saVar.m;
                        if (l == null) {
                            l = new Long(SystemClock.uptimeMillis());
                        }
                        saVar.m = l;
                        if (sa.this.d()) {
                            b c = sa.this.c();
                            if (c != null) {
                                c.a();
                            }
                            sa.this.l = true;
                        }
                    }
                    sh0Var = vl0.c;
                    aVar = new a(sa.this, null);
                    this.f1134b = aa0Var;
                    this.f1133a = 1;
                }
                return ch3.f636a;
            } while (zf3.p0(this, sh0Var, aVar) != ba0Var);
            return ba0Var;
        }
    }

    public sa(Context context, View view, View view2, int i, int i2, long j, int i3) {
        Activity activity;
        this.f1131a = view;
        this.f1132b = view2;
        this.c = i;
        this.d = i2;
        this.e = j;
        this.f = i3;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        this.h = new WeakReference<>(activity);
        this.j = new WeakReference<>(null);
        this.k = new kw3(this, 0);
        this.n = new Rect();
    }

    public static final boolean f(sa saVar) {
        saVar.f();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000f, code lost:            if (r0.isAlive() == true) goto L9;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.view.ViewTreeObserver> r0 = r3.j     // Catch: java.lang.Exception -> L16
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L16
            android.view.ViewTreeObserver r0 = (android.view.ViewTreeObserver) r0     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L12
            boolean r0 = r0.isAlive()     // Catch: java.lang.Exception -> L16
            r1 = 1
            if (r0 != r1) goto L12
            goto L13
        L12:
            r1 = 0
        L13:
            if (r1 == 0) goto L1f
            return
        L16:
            java.lang.String r0 = com.chartboost.sdk.impl.ta.a()
            java.lang.String r1 = "Exception when accessing view tree observer."
            com.chartboost.sdk.impl.f6.a(r0, r1)
        L1f:
            com.chartboost.sdk.impl.sa$a r0 = com.chartboost.sdk.impl.sa.o
            java.lang.ref.WeakReference<android.app.Activity> r1 = r3.h
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            android.view.View r2 = r3.f1131a
            android.view.View r0 = r0.a(r1, r2)
            if (r0 == 0) goto L36
            android.view.ViewTreeObserver r0 = r0.getViewTreeObserver()
            goto L37
        L36:
            r0 = 0
        L37:
            if (r0 != 0) goto L3a
            return
        L3a:
            boolean r1 = r0.isAlive()
            if (r1 != 0) goto L4a
            java.lang.String r0 = com.chartboost.sdk.impl.ta.a()
            java.lang.String r1 = "Unable to set ViewTreeObserver since it is not alive"
            com.chartboost.sdk.impl.f6.c(r0, r1)
            return
        L4a:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r3.j = r1
            android.view.ViewTreeObserver$OnPreDrawListener r1 = r3.k
            r0.addOnPreDrawListener(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.sa.g():void");
    }

    public final void h() {
        g();
    }

    public final void b() {
        a();
        ViewTreeObserver viewTreeObserver = this.j.get();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this.k);
        }
        this.j.clear();
        this.g = null;
    }

    public final b c() {
        return this.g;
    }

    public final boolean d() {
        Long l = this.m;
        if (l != null) {
            if (SystemClock.uptimeMillis() - l.longValue() >= this.d) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        if (this.f1131a.getVisibility() != 0 || this.f1132b.getParent() == null || this.f1131a.getWidth() <= 0 || this.f1131a.getHeight() <= 0) {
            return false;
        }
        int i = 0;
        for (ViewParent parent = this.f1131a.getParent(); parent != null && i < this.f; parent = parent.getParent()) {
            if ((parent instanceof View) && ((View) parent).getVisibility() != 0) {
                return false;
            }
            i++;
        }
        if (this.f1131a.getGlobalVisibleRect(this.n)) {
            return a(this.n.height(), this.f1131a.getContext()) * a(this.n.width(), this.f1131a.getContext()) >= this.c;
        }
        return false;
    }

    public final void f() {
        if (this.i != null) {
            return;
        }
        qi0 qi0Var = vl0.f4854a;
        this.i = zf3.T(pd0.d(zo1.f5522a), new c(w90.f4963a), new d(null), 2);
    }

    public final void a(b bVar) {
        this.g = bVar;
    }

    public final void a() {
        df1 df1Var = this.i;
        if (df1Var != null) {
            df1Var.c(null);
        }
        this.i = null;
    }

    public final int a(int i, Context context) {
        return defpackage.t9.h0(i * context.getResources().getDisplayMetrics().density);
    }
}
