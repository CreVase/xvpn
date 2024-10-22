package defpackage;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zh2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public int f5480a;

    /* renamed from: b, reason: collision with root package name */
    public int f5481b;
    public OverScroller c;
    public Interpolator d;
    public boolean e;
    public boolean f;
    public final /* synthetic */ RecyclerView g;

    public zh2(RecyclerView recyclerView) {
        this.g = recyclerView;
        eh2 eh2Var = RecyclerView.T0;
        this.d = eh2Var;
        this.e = false;
        this.f = false;
        this.c = new OverScroller(recyclerView.getContext(), eh2Var);
    }

    public final void a(int i, int i2) {
        RecyclerView recyclerView = this.g;
        recyclerView.setScrollState(2);
        this.f5481b = 0;
        this.f5480a = 0;
        Interpolator interpolator = this.d;
        eh2 eh2Var = RecyclerView.T0;
        if (interpolator != eh2Var) {
            this.d = eh2Var;
            this.c = new OverScroller(recyclerView.getContext(), eh2Var);
        }
        this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public final void b() {
        if (this.e) {
            this.f = true;
            return;
        }
        RecyclerView recyclerView = this.g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.m(recyclerView, this);
    }

    public final void c(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        RecyclerView recyclerView = this.g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            if (!z) {
                abs = abs2;
            }
            i3 = Math.min((int) (((abs / height) + 1.0f) * 300.0f), 2000);
        }
        int i4 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.T0;
        }
        if (this.d != interpolator) {
            this.d = interpolator;
            this.c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f5481b = 0;
        this.f5480a = 0;
        recyclerView.setScrollState(2);
        this.c.startScroll(0, 0, i, i2, i4);
        if (Build.VERSION.SDK_INT < 23) {
            this.c.computeScrollOffset();
        }
        b();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        RecyclerView recyclerView = this.g;
        if (recyclerView.n == null) {
            recyclerView.removeCallbacks(this);
            this.c.abortAnimation();
            return;
        }
        this.f = false;
        this.e = true;
        recyclerView.p();
        OverScroller overScroller = this.c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.f5480a;
            int i7 = currY - this.f5481b;
            this.f5480a = currX;
            this.f5481b = currY;
            int o = RecyclerView.o(i6, recyclerView.H, recyclerView.J, recyclerView.getWidth());
            int o2 = RecyclerView.o(i7, recyclerView.I, recyclerView.K, recyclerView.getHeight());
            int[] iArr = recyclerView.E0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u = recyclerView.u(o, o2, 1, iArr, null);
            int[] iArr2 = recyclerView.E0;
            if (u) {
                o -= iArr2[0];
                o2 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.n(o, o2);
            }
            if (recyclerView.m != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.e0(o, o2, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = o - i8;
                int i11 = o2 - i9;
                nk1 nk1Var = recyclerView.n.e;
                if (nk1Var != null && !nk1Var.d && nk1Var.e) {
                    int b2 = recyclerView.s0.b();
                    if (b2 == 0) {
                        nk1Var.i();
                    } else if (nk1Var.f3477a >= b2) {
                        nk1Var.f3477a = b2 - 1;
                        nk1Var.g(i8, i9);
                    } else {
                        nk1Var.g(i8, i9);
                    }
                }
                i4 = i8;
                i = i10;
                i2 = i11;
                i3 = i9;
            } else {
                i = o;
                i2 = o2;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.p.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.E0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i3;
            recyclerView.v(i4, i3, i, i2, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i2 - iArr2[1];
            if (i4 != 0 || i12 != 0) {
                recyclerView.w(i4, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!overScroller.isFinished() && ((!z && i13 == 0) || (!z2 && i14 == 0))) {
                z3 = false;
            } else {
                z3 = true;
            }
            nk1 nk1Var2 = recyclerView.n.e;
            if (nk1Var2 != null && nk1Var2.d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4 && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i13 < 0) {
                        i5 = -currVelocity;
                    } else if (i13 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.y();
                        if (recyclerView.H.isFinished()) {
                            recyclerView.H.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.z();
                        if (recyclerView.J.isFinished()) {
                            recyclerView.J.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.A();
                        if (recyclerView.I.isFinished()) {
                            recyclerView.I.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.x();
                        if (recyclerView.K.isFinished()) {
                            recyclerView.K.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = ll3.f3151a;
                        uk3.k(recyclerView);
                    }
                }
                if (RecyclerView.R0) {
                    p10 p10Var = recyclerView.r0;
                    int[] iArr4 = (int[]) p10Var.d;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    p10Var.c = 0;
                }
            } else {
                b();
                c51 c51Var = recyclerView.q0;
                if (c51Var != null) {
                    c51Var.a(recyclerView, i4, i12);
                }
            }
        }
        nk1 nk1Var3 = recyclerView.n.e;
        if (nk1Var3 != null && nk1Var3.d) {
            nk1Var3.g(0, 0);
        }
        this.e = false;
        if (this.f) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = ll3.f3151a;
            uk3.m(recyclerView, this);
        } else {
            recyclerView.setScrollState(0);
            recyclerView.k0(1);
        }
    }
}
