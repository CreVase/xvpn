package defpackage;

import a.bx;
import a.du;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannableString;
import android.view.ViewGroup;
import android.widget.Toast;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.firebase.XFirebaseMessagingService;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final /* synthetic */ class le0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3109a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f3110b;

    public /* synthetic */ le0(String str, int i) {
        this.f3109a = i;
        this.f3110b = str;
    }

    private final void a() {
        Activity activity;
        String str = this.f3110b;
        ReentrantLock reentrantLock = yv3.c;
        synchronized (reentrantLock) {
            reentrantLock.lock();
            Activity activity2 = tf3.t;
            if (activity2 == null) {
                reentrantLock.unlock();
                return;
            }
            ViewGroup viewGroup = (ViewGroup) activity2.getWindow().getDecorView();
            if (viewGroup.findViewById(520093697) == null) {
                synchronized (yv3.class) {
                    if (viewGroup.findViewById(520093697) == null) {
                        Context context = tf3.t;
                        if (context != null) {
                            while (context instanceof ContextWrapper) {
                                if (context instanceof Activity) {
                                    activity = (Activity) context;
                                    break;
                                }
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        }
                        activity = null;
                        yv3.a(activity);
                    }
                }
            }
            Iterator it = yv3.d.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                if (weakReference.get() == null) {
                    it.remove();
                } else {
                    xv3 xv3Var = (xv3) ((wv3) weakReference.get());
                    xv3Var.f5233a.append(str + "\n");
                    xv3Var.f5234b.fullScroll(130);
                }
            }
            yv3.c.unlock();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = 1;
        switch (this.f3109a) {
            case 0:
                String str = this.f3110b;
                ew3.d0(new le0(str, i));
                if (ew3.c(str)) {
                    ne0.d = new StringBuilder();
                    return;
                }
                return;
            case 1:
                String str2 = this.f3110b;
                synchronized (ne0.c) {
                    int size = ne0.f3447b.size();
                    while (true) {
                        size--;
                        if (size >= 0) {
                            ArrayList arrayList = ne0.f3447b;
                            me0 me0Var = (me0) ((WeakReference) arrayList.get(size)).get();
                            if (me0Var != null) {
                                me0Var.B(str2);
                            } else {
                                arrayList.remove(size);
                            }
                        }
                    }
                }
                return;
            case 2:
                a();
                return;
            case 3:
                int i2 = XFirebaseMessagingService.h;
                bx bxVar = new bx();
                bxVar.z(this.f3110b);
                du.d(496, bxVar);
                bxVar.h();
                return;
            case 4:
                GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
                du.d(381, null);
                bx bxVar2 = new bx();
                du.d(385, bxVar2);
                boolean q = bxVar2.q();
                bxVar2.h();
                GoogleIABHelper googleIABHelper2 = GoogleIABHelper.g;
                if (q) {
                    googleIABHelper2.getClass();
                    ew3.d0(new le0(this.f3110b, 5));
                }
                bx i3 = hx2.i(386);
                boolean q2 = i3.q();
                i3.h();
                if (q2) {
                    googleIABHelper2.getClass();
                    yc2.f5315b.g(qc2.f3980a);
                    if (googleIABHelper2.f1607a instanceof lt3) {
                        ew3.d0(new d9(14));
                        return;
                    }
                    return;
                }
                return;
            case 5:
                GoogleIABHelper googleIABHelper3 = GoogleIABHelper.g;
                boolean z = XApplication.c;
                String str3 = this.f3110b;
                if (z) {
                    yc2.f5315b.g(new pc2());
                    return;
                }
                GoogleIABHelper googleIABHelper4 = GoogleIABHelper.g;
                if (googleIABHelper4.f1607a != null) {
                    SpannableString valueOf = SpannableString.valueOf(pd0.y(R.string.AccountPurchaseHoldPrompt));
                    bx3.i(valueOf, pd0.y(R.string.AccountPurchaseHoldPromptHighlight), new x9(str3, 4));
                    try {
                        r9 r9Var = GoogleIABHelper.n;
                        if (r9Var != null) {
                            r9Var.dismissAllowingStateLoss();
                        }
                    } catch (Exception unused) {
                    }
                    ic icVar = googleIABHelper4.f1607a;
                    if (icVar instanceof lt3) {
                        GoogleIABHelper.n = t9.w0(((lt3) icVar).getSupportFragmentManager(), new q90(12, valueOf, str3));
                        return;
                    }
                    return;
                }
                return;
            case 6:
                GoogleIABHelper.g.q(this.f3110b);
                return;
            default:
                Toast.makeText(zf3.f5472a, "Error: " + this.f3110b, 0).show();
                return;
        }
    }
}
