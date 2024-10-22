package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class mp3 {

    /* renamed from: a, reason: collision with root package name */
    public int f3335a;

    /* renamed from: b, reason: collision with root package name */
    public int f3336b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final /* synthetic */ Object h;

    public mp3(np3 np3Var, r70 r70Var, ok1 ok1Var, int i) {
        this.h = np3Var;
        this.g = new WeakReference(r70Var);
        z60 z60Var = r70Var.I;
        ok1Var.getClass();
        this.f3335a = ok1.n(z60Var);
        this.f3336b = ok1.n(r70Var.J);
        this.c = ok1.n(r70Var.K);
        this.d = ok1.n(r70Var.L);
        this.e = ok1.n(r70Var.M);
        this.f = i;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void b(r70 r70Var, fp fpVar) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int baseline;
        int i6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i7;
        boolean z14;
        boolean z15;
        boolean z16;
        int i8;
        if (r70Var == null) {
            return;
        }
        if (r70Var.g0 == 8) {
            fpVar.e = 0;
            fpVar.f = 0;
            fpVar.g = 0;
            return;
        }
        if (r70Var.T == null) {
            return;
        }
        int i9 = fpVar.f2130a;
        int i10 = fpVar.f2131b;
        int i11 = fpVar.c;
        int i12 = fpVar.d;
        int i13 = this.f3335a + this.f3336b;
        int i14 = this.c;
        View view = (View) r70Var.f0;
        int x = hx2.x(i9);
        z60 z60Var = r70Var.K;
        z60 z60Var2 = r70Var.I;
        if (x != 0) {
            if (x != 1) {
                if (x != 2) {
                    if (x != 3) {
                        makeMeasureSpec = 0;
                    } else {
                        int i15 = this.e;
                        if (z60Var2 != null) {
                            i8 = z60Var2.g + 0;
                        } else {
                            i8 = 0;
                        }
                        if (z60Var != null) {
                            i8 += z60Var.g;
                        }
                        makeMeasureSpec = ViewGroup.getChildMeasureSpec(i15, i14 + i8, -1);
                    }
                } else {
                    makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
                    if (r70Var.r == 1) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    int i16 = fpVar.j;
                    if (i16 == 1 || i16 == 2) {
                        if (view.getMeasuredHeight() == r70Var.l()) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (fpVar.j != 2 && z14 && ((!z14 || !z15) && !r70Var.B())) {
                            z16 = false;
                        } else {
                            z16 = true;
                        }
                        if (z16) {
                            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(r70Var.r(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.e, i14, -2);
            }
        } else {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        int x2 = hx2.x(i10);
        if (x2 != 0) {
            if (x2 != 1) {
                if (x2 != 2) {
                    if (x2 != 3) {
                        makeMeasureSpec2 = 0;
                    } else {
                        int i17 = this.f;
                        if (z60Var2 != null) {
                            i7 = r70Var.J.g + 0;
                        } else {
                            i7 = 0;
                        }
                        if (z60Var != null) {
                            i7 += r70Var.L.g;
                        }
                        makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i17, i13 + i7, -1);
                    }
                } else {
                    makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
                    if (r70Var.s == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    int i18 = fpVar.j;
                    if (i18 == 1 || i18 == 2) {
                        if (view.getMeasuredWidth() == r70Var.r()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (fpVar.j != 2 && z11 && ((!z11 || !z12) && !r70Var.C())) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        if (z13) {
                            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(r70Var.l(), 1073741824);
                        }
                    }
                }
            } else {
                makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f, i13, -2);
            }
        } else {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        s70 s70Var = (s70) r70Var.T;
        Object obj = this.h;
        if (s70Var != null && pg1.d(((ConstraintLayout) obj).i, UserVerificationMethods.USER_VERIFY_HANDPRINT) && view.getMeasuredWidth() == r70Var.r() && view.getMeasuredWidth() < s70Var.r() && view.getMeasuredHeight() == r70Var.l() && view.getMeasuredHeight() < s70Var.l() && view.getBaseline() == r70Var.a0 && !r70Var.A()) {
            if (a(r70Var.G, makeMeasureSpec, r70Var.r()) && a(r70Var.H, makeMeasureSpec2, r70Var.l())) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                fpVar.e = r70Var.r();
                fpVar.f = r70Var.l();
                fpVar.g = r70Var.a0;
                return;
            }
        }
        if (i9 == 3) {
            z = true;
        } else {
            z = false;
        }
        if (i10 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i10 != 4 && i10 != 1) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i9 != 4 && i9 != 1) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z && r70Var.W > 0.0f) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z2 && r70Var.W > 0.0f) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (view == null) {
            return;
        }
        f70 f70Var = (f70) view.getLayoutParams();
        int i19 = fpVar.j;
        if (i19 != 1 && i19 != 2 && z && r70Var.r == 0 && z2 && r70Var.s == 0) {
            i6 = -1;
            baseline = 0;
            i = 0;
            i3 = 0;
        } else {
            if ((view instanceof jn3) && (r70Var instanceof hz0)) {
                ((jn3) view).l((hz0) r70Var, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            r70Var.G = makeMeasureSpec;
            r70Var.H = makeMeasureSpec2;
            r70Var.g = false;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i20 = r70Var.u;
            if (i20 > 0) {
                i = Math.max(i20, measuredWidth);
            } else {
                i = measuredWidth;
            }
            int i21 = r70Var.v;
            if (i21 > 0) {
                i = Math.min(i21, i);
            }
            int i22 = r70Var.x;
            if (i22 > 0) {
                i3 = Math.max(i22, measuredHeight);
                i2 = makeMeasureSpec2;
            } else {
                i2 = makeMeasureSpec2;
                i3 = measuredHeight;
            }
            int i23 = r70Var.y;
            if (i23 > 0) {
                i3 = Math.min(i23, i3);
            }
            if (!pg1.d(((ConstraintLayout) obj).i, 1)) {
                if (z5 && z3) {
                    i = (int) ((i3 * r70Var.W) + 0.5f);
                } else if (z6 && z4) {
                    i3 = (int) ((i / r70Var.W) + 0.5f);
                }
            }
            if (measuredWidth == i && measuredHeight == i3) {
                baseline = baseline2;
            } else {
                if (measuredWidth != i) {
                    i4 = 1073741824;
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
                } else {
                    i4 = 1073741824;
                }
                if (measuredHeight != i3) {
                    i5 = View.MeasureSpec.makeMeasureSpec(i3, i4);
                } else {
                    i5 = i2;
                }
                view.measure(makeMeasureSpec, i5);
                r70Var.G = makeMeasureSpec;
                r70Var.H = i5;
                r70Var.g = false;
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                i3 = measuredHeight2;
                i = measuredWidth2;
            }
            i6 = -1;
        }
        if (baseline != i6) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (i == fpVar.c && i3 == fpVar.d) {
            z8 = false;
        } else {
            z8 = true;
        }
        fpVar.i = z8;
        if (f70Var.c0) {
            z9 = true;
        } else {
            z9 = z7;
        }
        if (z9 && baseline != -1 && r70Var.a0 != baseline) {
            fpVar.i = true;
        }
        fpVar.e = i;
        fpVar.f = i3;
        fpVar.h = z9;
        fpVar.g = baseline;
    }

    public mp3(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.g = constraintLayout2;
    }
}
