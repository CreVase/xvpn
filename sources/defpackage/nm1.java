package defpackage;

import android.os.Looper;
import androidx.lifecycle.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* loaded from: classes.dex */
public final class nm1 extends im1 {

    /* renamed from: a, reason: collision with root package name */
    public final bk1 f3487a;

    /* renamed from: b, reason: collision with root package name */
    public final mm1 f3488b;

    public nm1(bk1 bk1Var, km3 km3Var) {
        this.f3487a = bk1Var;
        this.f3488b = (mm1) new y33(km3Var, mm1.f).s(mm1.class);
    }

    @Override // defpackage.im1
    public final gm1 b(int i, hm1 hm1Var) {
        mm1 mm1Var = this.f3488b;
        if (!mm1Var.e) {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                rx2 rx2Var = mm1Var.d;
                jm1 jm1Var = (jm1) rx2Var.d(i, null);
                bk1 bk1Var = this.f3487a;
                if (jm1Var == null) {
                    try {
                        mm1Var.e = true;
                        gm1 onCreateLoader = hm1Var.onCreateLoader(i, null);
                        if (onCreateLoader != null) {
                            if (onCreateLoader.getClass().isMemberClass() && !Modifier.isStatic(onCreateLoader.getClass().getModifiers())) {
                                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + onCreateLoader);
                            }
                            jm1 jm1Var2 = new jm1(i, onCreateLoader);
                            rx2Var.e(i, jm1Var2);
                            mm1Var.e = false;
                            gm1 gm1Var = jm1Var2.n;
                            km1 km1Var = new km1(gm1Var, hm1Var);
                            jm1Var2.d(bk1Var, km1Var);
                            km1 km1Var2 = jm1Var2.p;
                            if (km1Var2 != null) {
                                jm1Var2.h(km1Var2);
                            }
                            jm1Var2.o = bk1Var;
                            jm1Var2.p = km1Var;
                            return gm1Var;
                        }
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
                    } catch (Throwable th) {
                        mm1Var.e = false;
                        throw th;
                    }
                }
                gm1 gm1Var2 = jm1Var.n;
                km1 km1Var3 = new km1(gm1Var2, hm1Var);
                jm1Var.d(bk1Var, km1Var3);
                km1 km1Var4 = jm1Var.p;
                if (km1Var4 != null) {
                    jm1Var.h(km1Var4);
                }
                jm1Var.o = bk1Var;
                jm1Var.p = km1Var3;
                return gm1Var2;
            }
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final void c(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        boolean z;
        mm1 mm1Var = this.f3488b;
        if (mm1Var.d.f() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < mm1Var.d.f(); i++) {
                jm1 jm1Var = (jm1) mm1Var.d.g(i);
                printWriter.print(str);
                printWriter.print("  #");
                rx2 rx2Var = mm1Var.d;
                if (rx2Var.f4231a) {
                    rx2Var.c();
                }
                printWriter.print(rx2Var.f4232b[i]);
                printWriter.print(": ");
                printWriter.println(jm1Var.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(jm1Var.l);
                printWriter.print(" mArgs=");
                printWriter.println(jm1Var.m);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(jm1Var.n);
                jm1Var.n.dump(p71.l(str2, "  "), fileDescriptor, printWriter, strArr);
                if (jm1Var.p != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(jm1Var.p);
                    km1 km1Var = jm1Var.p;
                    km1Var.getClass();
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(km1Var.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                gm1 gm1Var = jm1Var.n;
                Object obj = jm1Var.e;
                if (obj == b.k) {
                    obj = null;
                }
                printWriter.println(gm1Var.dataToString(obj));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                if (jm1Var.c > 0) {
                    z = true;
                } else {
                    z = false;
                }
                printWriter.println(z);
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        pe0.g(sb, this.f3487a);
        sb.append("}}");
        return sb.toString();
    }
}
