package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;
import androidx.recyclerview.widget.d;
import androidx.recyclerview.widget.h;
import com.vungle.ads.VungleError;

/* loaded from: classes.dex */
public class nk1 {

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f3478b;
    public c c;
    public boolean d;
    public boolean e;
    public View f;
    public PointF j;
    public final DisplayMetrics k;
    public float m;

    /* renamed from: a, reason: collision with root package name */
    public int f3477a = -1;
    public final xp g = new xp(0);
    public final LinearInterpolator h = new LinearInterpolator();
    public final DecelerateInterpolator i = new DecelerateInterpolator();
    public boolean l = false;
    public int n = 0;
    public int o = 0;

    public nk1(Context context) {
        this.k = context.getResources().getDisplayMetrics();
    }

    public static int a(int i, int i2, int i3, int i4, int i5) {
        if (i5 != -1) {
            if (i5 != 0) {
                if (i5 == 1) {
                    return i4 - i2;
                }
                throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
            }
            int i6 = i3 - i;
            if (i6 > 0) {
                return i6;
            }
            int i7 = i4 - i2;
            if (i7 < 0) {
                return i7;
            }
            return 0;
        }
        return i3 - i;
    }

    public int b(View view, int i) {
        c cVar = this.c;
        if (cVar != null && cVar.d()) {
            d dVar = (d) view.getLayoutParams();
            return a((view.getLeft() - ((d) view.getLayoutParams()).f277b.left) - ((ViewGroup.MarginLayoutParams) dVar).leftMargin, view.getRight() + ((d) view.getLayoutParams()).f277b.right + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, cVar.C(), cVar.n - cVar.D(), i);
        }
        return 0;
    }

    public int c(View view, int i) {
        c cVar = this.c;
        if (cVar != null && cVar.e()) {
            d dVar = (d) view.getLayoutParams();
            return a((view.getTop() - ((d) view.getLayoutParams()).f277b.top) - ((ViewGroup.MarginLayoutParams) dVar).topMargin, view.getBottom() + ((d) view.getLayoutParams()).f277b.bottom + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin, cVar.E(), cVar.o - cVar.B(), i);
        }
        return 0;
    }

    public float d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int e(int i) {
        float abs = Math.abs(i);
        if (!this.l) {
            this.m = d(this.k);
            this.l = true;
        }
        return (int) Math.ceil(abs * this.m);
    }

    public PointF f(int i) {
        Object obj = this.c;
        if (obj instanceof vh2) {
            return ((vh2) obj).a(i);
        }
        return null;
    }

    public final void g(int i, int i2) {
        PointF f;
        RecyclerView recyclerView = this.f3478b;
        int i3 = -1;
        if (this.f3477a == -1 || recyclerView == null) {
            i();
        }
        if (this.d && this.f == null && this.c != null && (f = f(this.f3477a)) != null) {
            float f2 = f.x;
            if (f2 != 0.0f || f.y != 0.0f) {
                recyclerView.e0((int) Math.signum(f2), (int) Math.signum(f.y), null);
            }
        }
        boolean z = false;
        this.d = false;
        View view = this.f;
        xp xpVar = this.g;
        if (view != null) {
            this.f3478b.getClass();
            h M = RecyclerView.M(view);
            if (M != null) {
                i3 = M.f();
            }
            if (i3 == this.f3477a) {
                h(this.f, recyclerView.s0, xpVar);
                xpVar.t(recyclerView);
                i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f = null;
            }
        }
        if (this.e) {
            wh2 wh2Var = recyclerView.s0;
            if (this.f3478b.n.v() == 0) {
                i();
            } else {
                int i4 = this.n;
                int i5 = i4 - i;
                if (i4 * i5 <= 0) {
                    i5 = 0;
                }
                this.n = i5;
                int i6 = this.o;
                int i7 = i6 - i2;
                if (i6 * i7 <= 0) {
                    i7 = 0;
                }
                this.o = i7;
                if (i5 == 0 && i7 == 0) {
                    PointF f3 = f(this.f3477a);
                    if (f3 != null) {
                        if (f3.x != 0.0f || f3.y != 0.0f) {
                            float f4 = f3.y;
                            float sqrt = (float) Math.sqrt((f4 * f4) + (r10 * r10));
                            float f5 = f3.x / sqrt;
                            f3.x = f5;
                            float f6 = f3.y / sqrt;
                            f3.y = f6;
                            this.j = f3;
                            this.n = (int) (f5 * 10000.0f);
                            this.o = (int) (f6 * 10000.0f);
                            int e = e(VungleError.DEFAULT);
                            LinearInterpolator linearInterpolator = this.h;
                            xpVar.f5198a = (int) (this.n * 1.2f);
                            xpVar.f5199b = (int) (this.o * 1.2f);
                            xpVar.c = (int) (e * 1.2f);
                            xpVar.g = linearInterpolator;
                            xpVar.e = true;
                        }
                    }
                    xpVar.d = this.f3477a;
                    i();
                }
            }
            if (xpVar.d >= 0) {
                z = true;
            }
            xpVar.t(recyclerView);
            if (z && this.e) {
                this.d = true;
                recyclerView.p0.b();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void h(android.view.View r6, defpackage.wh2 r7, defpackage.xp r8) {
        /*
            r5 = this;
            android.graphics.PointF r7 = r5.j
            r0 = -1
            r1 = 0
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L15
            float r7 = r7.x
            int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r7 != 0) goto Lf
            goto L15
        Lf:
            if (r7 <= 0) goto L13
            r7 = 1
            goto L16
        L13:
            r7 = -1
            goto L16
        L15:
            r7 = 0
        L16:
            int r7 = r5.b(r6, r7)
            android.graphics.PointF r4 = r5.j
            if (r4 == 0) goto L29
            float r4 = r4.y
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 != 0) goto L25
            goto L29
        L25:
            if (r3 <= 0) goto L2a
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            int r6 = r5.c(r6, r0)
            int r0 = r7 * r7
            int r1 = r6 * r6
            int r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            int r0 = (int) r0
            int r0 = r5.e(r0)
            double r0 = (double) r0
            r3 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r3
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            if (r0 <= 0) goto L59
            int r7 = -r7
            int r6 = -r6
            android.view.animation.DecelerateInterpolator r1 = r5.i
            r8.f5198a = r7
            r8.f5199b = r6
            r8.c = r0
            r8.g = r1
            r8.e = r2
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk1.h(android.view.View, wh2, xp):void");
    }

    public final void i() {
        if (this.e) {
            this.e = false;
            this.o = 0;
            this.n = 0;
            this.j = null;
            this.f3478b.s0.f5010a = -1;
            this.f = null;
            this.f3477a = -1;
            this.d = false;
            c cVar = this.c;
            if (cVar.e == this) {
                cVar.e = null;
            }
            this.c = null;
            this.f3478b = null;
        }
    }
}
