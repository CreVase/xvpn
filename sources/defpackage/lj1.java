package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* loaded from: classes2.dex */
public final class lj1 extends pe0 {
    public final /* synthetic */ int q;
    public final SideSheetBehavior r;

    public /* synthetic */ lj1(SideSheetBehavior sideSheetBehavior, int i) {
        this.q = i;
        this.r = sideSheetBehavior;
    }

    public final int Y(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.q) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    public final float Z(int i) {
        switch (this.q) {
            case 0:
                float b0 = b0();
                return (i - b0) / (a0() - b0);
            default:
                float b02 = b0();
                return (b02 - i) / (b02 - a0());
        }
    }

    public final int a0() {
        int i = this.q;
        SideSheetBehavior sideSheetBehavior = this.r;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.n + sideSheetBehavior.o);
            default:
                return Math.max(0, (b0() - sideSheetBehavior.l) - sideSheetBehavior.o);
        }
    }

    public final int b0() {
        int i = this.q;
        SideSheetBehavior sideSheetBehavior = this.r;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.l) - sideSheetBehavior.o;
            default:
                return sideSheetBehavior.m;
        }
    }

    public final int c0(View view) {
        int i = this.q;
        SideSheetBehavior sideSheetBehavior = this.r;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.o;
            default:
                return view.getLeft() - sideSheetBehavior.o;
        }
    }

    public final int d0(CoordinatorLayout coordinatorLayout) {
        switch (this.q) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    public final int e0() {
        switch (this.q) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean f0(float f) {
        switch (this.q) {
            case 0:
                return f > 0.0f;
            default:
                return f < 0.0f;
        }
    }

    public final boolean g0(View view) {
        switch (this.q) {
            case 0:
                if (view.getRight() >= (a0() - b0()) / 2) {
                    return false;
                }
                return true;
            default:
                if (view.getLeft() <= (a0() + b0()) / 2) {
                    return false;
                }
                return true;
        }
    }

    public final boolean h0(float f, float f2) {
        boolean z;
        boolean z2;
        int i = this.q;
        SideSheetBehavior sideSheetBehavior = this.r;
        switch (i) {
            case 0:
                if (Math.abs(f) > Math.abs(f2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
                float abs = Math.abs(f);
                sideSheetBehavior.getClass();
                if (abs <= 500) {
                    return false;
                }
                return true;
            default:
                if (Math.abs(f) > Math.abs(f2)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                float abs2 = Math.abs(f);
                sideSheetBehavior.getClass();
                if (abs2 <= 500) {
                    return false;
                }
                return true;
        }
    }

    public final boolean i0(View view, float f) {
        int i = this.q;
        SideSheetBehavior sideSheetBehavior = this.r;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.k) + view.getLeft()) <= 0.5f) {
                    return false;
                }
                return true;
            default:
                if (Math.abs((f * sideSheetBehavior.k) + view.getRight()) <= 0.5f) {
                    return false;
                }
                return true;
        }
    }
}
