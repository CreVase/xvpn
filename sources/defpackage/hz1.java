package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class hz1 {

    /* renamed from: a, reason: collision with root package name */
    public ViewParent f2505a;

    /* renamed from: b, reason: collision with root package name */
    public ViewParent f2506b;
    public final View c;
    public boolean d;
    public int[] e;

    public hz1(View view) {
        this.c = view;
    }

    public final boolean a(float f, float f2, boolean z) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return om3.a(f3, this.c, f, f2, z);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedFling", e);
            return false;
        }
    }

    public final boolean b(float f, float f2) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        try {
            return om3.b(f3, this.c, f, f2);
        } catch (AbstractMethodError e) {
            Log.e("ViewParentCompat", "ViewParent " + f3 + " does not implement interface method onNestedPreFling", e);
            return false;
        }
    }

    public final boolean c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent f;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.d || (f = f(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            iArr3 = this.e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.c;
        if (f instanceof iz1) {
            ((iz1) f).m(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                om3.c(f, view2, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void d(int i, int i2, int i3, int[] iArr) {
        e(0, i, 0, i2, null, i3, iArr);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.d || (f = f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr4 = this.e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.c;
        if (f instanceof jz1) {
            ((jz1) f).d(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (f instanceof iz1) {
                ((iz1) f).f(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    om3.d(f, view2, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onNestedScroll", e);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.f2506b;
        }
        return this.f2505a;
    }

    public final boolean g(int i) {
        if (f(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean h(int i, int i2) {
        boolean f;
        if (g(i2)) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof iz1;
                if (z) {
                    f = ((iz1) parent).g(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            f = om3.f(parent, view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    }
                    f = false;
                }
                if (f) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.f2506b = parent;
                        }
                    } else {
                        this.f2505a = parent;
                    }
                    if (z) {
                        ((iz1) parent).i(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            om3.e(parent, view2, view, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    public final void i(int i) {
        ViewParent f = f(i);
        if (f != null) {
            boolean z = f instanceof iz1;
            View view = this.c;
            if (z) {
                ((iz1) f).l(view, i);
            } else if (i == 0) {
                try {
                    om3.g(f, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.f2506b = null;
                    return;
                }
                return;
            }
            this.f2505a = null;
        }
    }
}
