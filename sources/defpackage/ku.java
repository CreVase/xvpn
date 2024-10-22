package defpackage;

import a.bx;
import a.du;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebView;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.material.appbar.AppBarLayout;
import com.security.xvpn.z35kb.account.ForgetPasswordActivity;
import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class ku implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3010a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3011b;
    public final Object c;
    public final Object d;

    public /* synthetic */ ku(int i, Object obj, Object obj2, Object obj3) {
        this.f3010a = i;
        this.d = obj;
        this.f3011b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [bt3] */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        n71 n71Var;
        OverScroller overScroller;
        boolean z = true;
        ?? r2 = 1;
        switch (this.f3010a) {
            case 0:
                v51 v51Var = (v51) this.f3011b;
                Typeface typeface = (Typeface) this.c;
                tf3 tf3Var = (tf3) v51Var.f4780b;
                if (tf3Var != null) {
                    tf3Var.m0(typeface);
                    return;
                }
                return;
            case 1:
                ((y70) this.f3011b).accept(this.c);
                return;
            case 2:
                try {
                    obj = ((Callable) this.f3011b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.d).post(new ku((int) (r2 == true ? 1 : 0), this, (y70) this.c, obj));
                return;
            case 3:
                try {
                    z = ((Boolean) ((ml1) this.d).get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused2) {
                }
                ((ss0) this.f3011b).b((String) this.c, z);
                return;
            case 4:
                Object obj2 = this.c;
                Object obj3 = this.d;
                try {
                    ((ml1) this.f3011b).get();
                    bo1 c = bo1.c();
                    String str = bt3.t;
                    String.format("Starting work for %s", ((bt3) obj3).e.c);
                    c.a(new Throwable[0]);
                    ((bt3) obj3).r = ((bt3) obj3).f.startWork();
                    ((rr2) obj2).j(((bt3) obj3).r);
                    return;
                } catch (Throwable th) {
                    ((rr2) obj2).i(th);
                    return;
                }
            case 5:
                Object obj4 = this.c;
                ?? r3 = this.d;
                try {
                    try {
                        ql1 ql1Var = (ql1) ((rr2) this.f3011b).get();
                        if (ql1Var == null) {
                            bo1.c().b(bt3.t, String.format("%s returned a null result. Treating it as a failure.", ((bt3) r3).e.c), new Throwable[0]);
                        } else {
                            bo1 c2 = bo1.c();
                            String str2 = bt3.t;
                            String.format("%s returned a %s result.", ((bt3) r3).e.c, ql1Var);
                            c2.a(new Throwable[0]);
                            ((bt3) r3).h = ql1Var;
                        }
                    } catch (InterruptedException e) {
                        e = e;
                        bo1.c().b(bt3.t, String.format("%s failed because it threw an exception/error", (String) obj4), e);
                    } catch (CancellationException e2) {
                        bo1.c().d(bt3.t, String.format("%s was cancelled", (String) obj4), e2);
                    } catch (ExecutionException e3) {
                        e = e3;
                        bo1.c().b(bt3.t, String.format("%s failed because it threw an exception/error", (String) obj4), e);
                    }
                    return;
                } finally {
                    ((bt3) r3).c();
                }
            case 6:
                rs3 h = ((WorkDatabase) this.f3011b).n().h((String) this.c);
                if (h != null && h.b()) {
                    synchronized (((v43) this.d).c) {
                        ((v43) this.d).f.put((String) this.c, h);
                        ((v43) this.d).g.add(h);
                        Object obj5 = this.d;
                        ((v43) obj5).h.c(((v43) obj5).g);
                    }
                    return;
                }
                return;
            case 7:
                ((hs3) this.f3011b).v.h((String) this.c, (y33) this.d);
                return;
            case 8:
                View view = (View) this.c;
                if (view != null && (overScroller = (n71Var = (n71) this.d).d) != null) {
                    boolean computeScrollOffset = overScroller.computeScrollOffset();
                    Object obj6 = this.f3011b;
                    if (computeScrollOffset) {
                        n71Var.x((CoordinatorLayout) obj6, view, n71Var.d.getCurrY());
                        uk3.m(view, this);
                        return;
                    }
                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) obj6;
                    AppBarLayout appBarLayout = (AppBarLayout) view;
                    ((AppBarLayout.BaseBehavior) n71Var).C(coordinatorLayout, appBarLayout);
                    if (appBarLayout.l) {
                        appBarLayout.f(appBarLayout.g(AppBarLayout.BaseBehavior.z(coordinatorLayout)));
                        return;
                    }
                    return;
                }
                return;
            case 9:
                kj2 kj2Var = (kj2) this.d;
                kj2Var.b((qk) this.f3011b, (TaskCompletionSource) this.c);
                ((AtomicInteger) kj2Var.i.c).set(0);
                double min = Math.min(3600000.0d, Math.pow(kj2Var.f2956b, kj2Var.a()) * (60000.0d / kj2Var.f2955a));
                String.format(Locale.US, "%.2f", Double.valueOf(min / 1000.0d));
                try {
                    Thread.sleep((long) min);
                    return;
                } catch (InterruptedException unused3) {
                    return;
                }
            case 10:
                v73 v73Var = (v73) this.d;
                WebView webView = (WebView) this.f3011b;
                String str3 = (String) this.c;
                v73Var.getClass();
                v73.d(webView, str3);
                return;
            case 11:
                Object obj7 = this.f3011b;
                InputMethodManager inputMethodManager = (InputMethodManager) ((View) obj7).getContext().getSystemService("input_method");
                StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
                try {
                    try {
                        inputMethodManager.showSoftInput((View) obj7, 0);
                    } catch (IllegalArgumentException e4) {
                        if (((AtomicInteger) this.c).incrementAndGet() <= 10) {
                            ((Handler) this.d).postDelayed(this, 100L);
                        } else {
                            Log.e("keyboard", "Unable to open keyboard.  Giving up.", e4);
                        }
                    }
                    return;
                } finally {
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                }
            case 12:
                String str4 = (String) this.f3011b;
                String str5 = (String) this.c;
                bx bxVar = new bx();
                bxVar.z(str4);
                bxVar.z(str5);
                du.d(100, bxVar);
                fc2 fc2Var = new fc2();
                ew3.w0(bxVar, fc2Var);
                bxVar.h();
                if (!((ForgetPasswordActivity) this.d).d) {
                    ew3.d0(new vu3(this, fc2Var, str4, str5, 4));
                    return;
                }
                return;
            case 13:
                String str6 = (String) this.f3011b;
                String str7 = (String) this.c;
                bx bxVar2 = new bx();
                bxVar2.z(str6);
                bxVar2.z(str7);
                du.d(89, bxVar2);
                fc2 fc2Var2 = new fc2();
                ew3.w0(bxVar2, fc2Var2);
                bxVar2.h();
                rt3.e().i(true, ew3.X());
                ew3.d0(new y4(21, this, fc2Var2));
                return;
            default:
                String str8 = (String) this.f3011b;
                String str9 = (String) this.c;
                bx bxVar3 = new bx();
                bxVar3.z(str8);
                bxVar3.z(str9);
                du.d(90, bxVar3);
                fc2 fc2Var3 = new fc2();
                ew3.w0(bxVar3, fc2Var3);
                bxVar3.h();
                ew3.d0(new to1(8, this, fc2Var3));
                return;
        }
    }

    public /* synthetic */ ku(Object obj, Serializable serializable, Object obj2, int i) {
        this.f3010a = i;
        this.f3011b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ku(kj2 kj2Var, qk qkVar, TaskCompletionSource taskCompletionSource) {
        this(9, kj2Var, qkVar, taskCompletionSource);
        this.f3010a = 9;
    }
}
