package defpackage;

import android.animation.ValueAnimator;
import android.view.animation.DecelerateInterpolator;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class d83 {

    /* renamed from: a, reason: collision with root package name */
    public static int f1748a = 1;

    /* renamed from: b, reason: collision with root package name */
    public static int f1749b = 1;
    public static int c = 1;
    public static float d = 1.0f;
    public static final ArrayList e = new ArrayList();
    public static final ValueAnimator f;

    static {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        f = ofFloat;
        ofFloat.setDuration(200L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addListener(new c83());
        ofFloat.addUpdateListener(new b83());
    }

    public static void a(w73 w73Var) {
        ArrayList arrayList = e;
        int size = arrayList.size() - 1;
        boolean z = false;
        if (size >= 0) {
            while (true) {
                int i = size - 1;
                Object obj = ((WeakReference) arrayList.get(size)).get();
                if (obj == null) {
                    arrayList.remove(size);
                } else if (obj == w73Var) {
                    z = true;
                }
                if (i < 0) {
                    break;
                } else {
                    size = i;
                }
            }
        }
        if (!z) {
            arrayList.add(new WeakReference(w73Var));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(int r7, boolean r8) {
        /*
            int r0 = defpackage.d83.f1748a
            if (r0 == r7) goto L51
            if (r0 != 0) goto Lb
            int r1 = defpackage.d83.c
            if (r1 != r7) goto Lb
            goto L51
        Lb:
            r1 = 0
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 != 0) goto L29
            float r5 = defpackage.d83.d
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = 0
        L1b:
            if (r6 == 0) goto L1e
            goto L29
        L1e:
            int r0 = defpackage.d83.c
            defpackage.d83.f1749b = r0
            defpackage.d83.c = r7
            float r7 = r3 - r5
            defpackage.d83.d = r7
            goto L31
        L29:
            defpackage.d83.f1748a = r1
            defpackage.d83.f1749b = r0
            defpackage.d83.c = r7
            defpackage.d83.d = r4
        L31:
            if (r8 == 0) goto L48
            android.animation.ValueAnimator r7 = defpackage.d83.f
            r7.cancel()
            r8 = 2
            float[] r8 = new float[r8]
            float r0 = defpackage.d83.d
            r8[r1] = r0
            r8[r2] = r3
            r7.setFloatValues(r8)
            r7.start()
            goto L51
        L48:
            defpackage.d83.d = r3
            int r7 = defpackage.d83.c
            defpackage.d83.f1748a = r7
            c(r1)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d83.b(int, boolean):void");
    }

    public static void c(boolean z) {
        int size;
        ArrayList arrayList = e;
        if (arrayList.isEmpty() || arrayList.size() - 1 < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            w73 w73Var = (w73) ((WeakReference) arrayList.get(size)).get();
            if (w73Var == null) {
                arrayList.remove(size);
            } else if (!z || w73Var.h()) {
                w73Var.p(z);
            }
            if (i >= 0) {
                size = i;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:            r0.remove(r1);     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:            return;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(defpackage.w73 r4) {
        /*
            java.util.ArrayList r0 = defpackage.d83.e
            int r1 = r0.size()
            int r1 = r1 + (-1)
            if (r1 < 0) goto L23
        La:
            int r2 = r1 + (-1)
            java.lang.Object r3 = r0.get(r1)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L20
            if (r3 != r4) goto L1b
            goto L20
        L1b:
            if (r2 >= 0) goto L1e
            goto L23
        L1e:
            r1 = r2
            goto La
        L20:
            r0.remove(r1)
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d83.d(w73):void");
    }
}
