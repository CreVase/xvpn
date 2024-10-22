package defpackage;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;

/* loaded from: classes.dex */
public final class kl1 implements View.OnTouchListener {
    public static final int r = ViewConfiguration.getTapTimeout();

    /* renamed from: a, reason: collision with root package name */
    public final bk f2967a;

    /* renamed from: b, reason: collision with root package name */
    public final AccelerateInterpolator f2968b;
    public final View c;
    public qw3 d;
    public final float[] e;
    public final float[] f;
    public int g;
    public int h;
    public final float[] i;
    public final float[] j;
    public final float[] k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public final ListView q;

    public kl1(ListView listView) {
        bk bkVar = new bk();
        this.f2967a = bkVar;
        this.f2968b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.i = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.j = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.k = fArr5;
        this.c = listView;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        this.g = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.h = r;
        bkVar.f476a = 500;
        bkVar.f477b = 500;
        this.q = listView;
    }

    public static float b(float f, float f2, float f3) {
        return f > f3 ? f3 : f < f2 ? f2 : f;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float a(float r4, float r5, float r6, int r7) {
        /*
            r3 = this;
            float[] r0 = r3.e
            r0 = r0[r7]
            float[] r1 = r3.f
            r1 = r1[r7]
            float r0 = r0 * r5
            r2 = 0
            float r0 = b(r0, r2, r1)
            float r1 = r3.c(r4, r0)
            float r5 = r5 - r4
            float r4 = r3.c(r5, r0)
            float r4 = r4 - r1
            android.view.animation.AccelerateInterpolator r5 = r3.f2968b
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L26
            float r4 = -r4
            float r4 = r5.getInterpolation(r4)
            float r4 = -r4
            goto L2e
        L26:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r4 = r5.getInterpolation(r4)
        L2e:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0 = 1065353216(0x3f800000, float:1.0)
            float r4 = b(r4, r5, r0)
            goto L38
        L37:
            r4 = 0
        L38:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 != 0) goto L3d
            goto L5c
        L3d:
            float[] r0 = r3.i
            r0 = r0[r7]
            float[] r1 = r3.j
            r1 = r1[r7]
            float[] r2 = r3.k
            r7 = r2[r7]
            float r0 = r0 * r6
            if (r5 <= 0) goto L54
            float r4 = r4 * r0
            float r2 = b(r4, r1, r7)
            goto L5c
        L54:
            float r4 = -r4
            float r4 = r4 * r0
            float r4 = b(r4, r1, r7)
            float r2 = -r4
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl1.a(float, float, float, int):float");
    }

    public final float c(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        int i = this.g;
        if (i != 0 && i != 1) {
            if (i != 2 || f >= 0.0f) {
                return 0.0f;
            }
            return f / (-f2);
        }
        if (f >= f2) {
            return 0.0f;
        }
        if (f >= 0.0f) {
            return 1.0f - (f / f2);
        }
        if (!this.o || i != 1) {
            return 0.0f;
        }
        return 1.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0013, code lost:            if (r0 != 3) goto L29;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.p
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 == r2) goto L16
            r3 = 2
            if (r0 == r3) goto L1e
            r8 = 3
            if (r0 == r8) goto L16
            goto L7c
        L16:
            r7.e()
            goto L7c
        L1a:
            r7.n = r2
            r7.l = r1
        L1e:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            android.view.View r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            bk r9 = r7.f2967a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.o
            if (r8 != 0) goto L7c
            boolean r8 = r7.f()
            if (r8 == 0) goto L7c
            qw3 r8 = r7.d
            if (r8 != 0) goto L60
            qw3 r8 = new qw3
            r9 = 6
            r8.<init>(r7, r9)
            r7.d = r8
        L60:
            r7.o = r2
            r7.m = r2
            boolean r8 = r7.l
            if (r8 != 0) goto L75
            int r8 = r7.h
            if (r8 <= 0) goto L75
            qw3 r9 = r7.d
            long r5 = (long) r8
            java.util.WeakHashMap r8 = defpackage.ll3.f3151a
            defpackage.uk3.n(r4, r9, r5)
            goto L7a
        L75:
            qw3 r8 = r7.d
            r8.run()
        L7a:
            r7.l = r2
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl1.d(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void e() {
        int i = 0;
        if (this.m) {
            this.o = false;
            return;
        }
        bk bkVar = this.f2967a;
        bkVar.getClass();
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - bkVar.e);
        int i3 = bkVar.f477b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        bkVar.i = i;
        bkVar.h = bkVar.a(currentAnimationTimeMillis);
        bkVar.g = currentAnimationTimeMillis;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f() {
        /*
            r8 = this;
            bk r0 = r8.f2967a
            float r1 = r0.d
            float r2 = java.lang.Math.abs(r1)
            float r1 = r1 / r2
            int r1 = (int) r1
            float r0 = r0.c
            java.lang.Math.abs(r0)
            r0 = 0
            if (r1 == 0) goto L50
            android.widget.ListView r2 = r8.q
            int r3 = r2.getCount()
            r4 = 1
            if (r3 != 0) goto L1c
            goto L4b
        L1c:
            int r5 = r2.getChildCount()
            int r6 = r2.getFirstVisiblePosition()
            int r7 = r6 + r5
            if (r1 <= 0) goto L3a
            if (r7 < r3) goto L49
            int r5 = r5 - r4
            android.view.View r1 = r2.getChildAt(r5)
            int r1 = r1.getBottom()
            int r2 = r2.getHeight()
            if (r1 > r2) goto L49
            goto L4b
        L3a:
            if (r1 >= 0) goto L4b
            if (r6 > 0) goto L49
            android.view.View r1 = r2.getChildAt(r0)
            int r1 = r1.getTop()
            if (r1 < 0) goto L49
            goto L4b
        L49:
            r1 = 1
            goto L4c
        L4b:
            r1 = 0
        L4c:
            if (r1 != 0) goto L4f
            goto L50
        L4f:
            r0 = 1
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kl1.f():boolean");
    }

    @Override // android.view.View.OnTouchListener
    public final /* bridge */ /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        d(view, motionEvent);
        return false;
    }
}
