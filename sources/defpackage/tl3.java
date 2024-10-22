package defpackage;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import java.lang.ref.ReferenceQueue;

/* loaded from: classes.dex */
public abstract class tl3 extends ho implements nk3 {
    public static final boolean k = true;

    /* renamed from: b, reason: collision with root package name */
    public final qw3 f4530b;
    public boolean c;
    public final ro3[] d;
    public final View e;
    public boolean f;
    public final Choreographer g;
    public final ql3 h;
    public final Handler i;
    public static final int j = Build.VERSION.SDK_INT;
    public static final s71 l = new s71(4);
    public static final ReferenceQueue m = new ReferenceQueue();
    public static final pl3 n = new pl3(0);

    public tl3(Object obj, View view, int i) {
        if (obj == null) {
            this.f4530b = new qw3(this, 8);
            this.c = false;
            this.d = new ro3[i];
            this.e = view;
            if (Looper.myLooper() != null) {
                if (k) {
                    this.g = Choreographer.getInstance();
                    this.h = new ql3(this);
                    return;
                } else {
                    this.h = null;
                    this.i = new Handler(Looper.myLooper());
                    return;
                }
            }
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static tl3 i(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, Object obj) {
        if (obj == null) {
            DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
            return md0.f3279a.b(layoutInflater.inflate(i, viewGroup, false), i);
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j(android.view.View r6, java.lang.Object[] r7, android.util.SparseIntArray r8, boolean r9) {
        /*
            r0 = 0
            if (r6 == 0) goto Lc
            int r1 = defpackage.cf2.dataBinding
            java.lang.Object r1 = r6.getTag(r1)
            tl3 r1 = (defpackage.tl3) r1
            goto Ld
        Lc:
            r1 = r0
        Ld:
            if (r1 == 0) goto L10
            return
        L10:
            java.lang.Object r1 = r6.getTag()
            boolean r2 = r1 instanceof java.lang.String
            if (r2 == 0) goto L1b
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
        L1b:
            r1 = 1
            r2 = 0
            if (r9 == 0) goto L68
            if (r0 == 0) goto L68
            java.lang.String r9 = "layout"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L68
            r9 = 95
            int r9 = r0.lastIndexOf(r9)
            if (r9 <= 0) goto L8e
            int r9 = r9 + r1
            int r3 = r0.length()
            if (r3 != r9) goto L3a
        L38:
            r3 = 0
            goto L4c
        L3a:
            r4 = r9
        L3b:
            if (r4 >= r3) goto L4b
            char r5 = r0.charAt(r4)
            boolean r5 = java.lang.Character.isDigit(r5)
            if (r5 != 0) goto L48
            goto L38
        L48:
            int r4 = r4 + 1
            goto L3b
        L4b:
            r3 = 1
        L4c:
            if (r3 == 0) goto L8e
            int r3 = r0.length()
            r4 = 0
        L53:
            if (r9 >= r3) goto L61
            int r4 = r4 * 10
            char r5 = r0.charAt(r9)
            int r5 = r5 + (-48)
            int r4 = r4 + r5
            int r9 = r9 + 1
            goto L53
        L61:
            r9 = r7[r4]
            if (r9 != 0) goto L8f
            r7[r4] = r6
            goto L8f
        L68:
            if (r0 == 0) goto L8e
            java.lang.String r9 = "binding_"
            boolean r9 = r0.startsWith(r9)
            if (r9 == 0) goto L8e
            int r9 = r0.length()
            r3 = 8
            r4 = 0
        L79:
            if (r3 >= r9) goto L87
            int r4 = r4 * 10
            char r5 = r0.charAt(r3)
            int r5 = r5 + (-48)
            int r4 = r4 + r5
            int r3 = r3 + 1
            goto L79
        L87:
            r9 = r7[r4]
            if (r9 != 0) goto L8f
            r7[r4] = r6
            goto L8f
        L8e:
            r1 = 0
        L8f:
            if (r1 != 0) goto La6
            int r9 = r6.getId()
            if (r9 <= 0) goto La6
            if (r8 == 0) goto La6
            r0 = -1
            int r9 = r8.get(r9, r0)
            if (r9 < 0) goto La6
            r0 = r7[r9]
            if (r0 != 0) goto La6
            r7[r9] = r6
        La6:
            boolean r9 = r6 instanceof android.view.ViewGroup
            if (r9 == 0) goto Lbd
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r9 = r6.getChildCount()
            r0 = 0
        Lb1:
            if (r0 >= r9) goto Lbd
            android.view.View r1 = r6.getChildAt(r0)
            j(r1, r7, r8, r2)
            int r0 = r0 + 1
            goto Lb1
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tl3.j(android.view.View, java.lang.Object[], android.util.SparseIntArray, boolean):void");
    }

    public static Object[] k(View view, int i, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i];
        j(view, objArr, sparseIntArray, true);
        return objArr;
    }

    public abstract void f();

    public final void g() {
        if (this.f) {
            m();
        } else if (h()) {
            this.f = true;
            f();
            this.f = false;
        }
    }

    @Override // defpackage.nk3
    public final View getRoot() {
        return this.e;
    }

    public abstract boolean h();

    public abstract boolean l(int i, int i2, Object obj);

    public final void m() {
        synchronized (this) {
            if (this.c) {
                return;
            }
            this.c = true;
            if (k) {
                this.g.postFrameCallback(this.h);
            } else {
                this.i.post(this.f4530b);
            }
        }
    }

    public final void n(int i, y12 y12Var) {
        s71 s71Var = l;
        ro3[] ro3VarArr = this.d;
        if (y12Var == null) {
            ro3 ro3Var = ro3VarArr[i];
            if (ro3Var != null) {
                ro3Var.a();
                return;
            }
            return;
        }
        ro3 ro3Var2 = ro3VarArr[i];
        ReferenceQueue referenceQueue = m;
        if (ro3Var2 == null) {
            if (ro3Var2 == null) {
                ro3Var2 = s71Var.j(this, i, referenceQueue);
                ro3VarArr[i] = ro3Var2;
            }
            ro3Var2.a();
            ro3Var2.c = y12Var;
            ro3Var2.f4193a.b(y12Var);
            return;
        }
        if (ro3Var2.c != y12Var) {
            if (ro3Var2 != null) {
                ro3Var2.a();
            }
            ro3 ro3Var3 = ro3VarArr[i];
            if (ro3Var3 == null) {
                ro3Var3 = s71Var.j(this, i, referenceQueue);
                ro3VarArr[i] = ro3Var3;
            }
            ro3Var3.a();
            ro3Var3.c = y12Var;
            ro3Var3.f4193a.b(y12Var);
        }
    }
}
