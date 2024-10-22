package defpackage;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;

/* loaded from: classes.dex */
public abstract class en0 extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final fn0 f1964a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f1965b;
    public int c;
    public int d;
    public int e;
    public SparseArray f;
    public Drawable[] g;
    public int h;
    public boolean i;
    public boolean j;
    public Rect k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;
    public int q;
    public boolean r;
    public int s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    public en0(en0 en0Var, fn0 fn0Var, Resources resources) {
        Resources resources2;
        int i;
        this.i = false;
        this.l = false;
        this.w = true;
        this.y = 0;
        this.z = 0;
        this.f1964a = fn0Var;
        if (resources != null) {
            resources2 = resources;
        } else if (en0Var != null) {
            resources2 = en0Var.f1965b;
        } else {
            resources2 = null;
        }
        this.f1965b = resources2;
        if (en0Var != null) {
            i = en0Var.c;
        } else {
            i = 0;
        }
        int i2 = fn0.m;
        i = resources != null ? resources.getDisplayMetrics().densityDpi : i;
        i = i == 0 ? 160 : i;
        this.c = i;
        if (en0Var != null) {
            this.d = en0Var.d;
            this.e = en0Var.e;
            this.u = true;
            this.v = true;
            this.i = en0Var.i;
            this.l = en0Var.l;
            this.w = en0Var.w;
            this.x = en0Var.x;
            this.y = en0Var.y;
            this.z = en0Var.z;
            this.A = en0Var.A;
            this.B = en0Var.B;
            this.C = en0Var.C;
            this.D = en0Var.D;
            this.E = en0Var.E;
            this.F = en0Var.F;
            this.G = en0Var.G;
            if (en0Var.c == i) {
                if (en0Var.j) {
                    this.k = en0Var.k != null ? new Rect(en0Var.k) : null;
                    this.j = true;
                }
                if (en0Var.m) {
                    this.n = en0Var.n;
                    this.o = en0Var.o;
                    this.p = en0Var.p;
                    this.q = en0Var.q;
                    this.m = true;
                }
            }
            if (en0Var.r) {
                this.s = en0Var.s;
                this.r = true;
            }
            if (en0Var.t) {
                this.t = true;
            }
            Drawable[] drawableArr = en0Var.g;
            this.g = new Drawable[drawableArr.length];
            this.h = en0Var.h;
            SparseArray sparseArray = en0Var.f;
            if (sparseArray != null) {
                this.f = sparseArray.clone();
            } else {
                this.f = new SparseArray(this.h);
            }
            int i3 = this.h;
            for (int i4 = 0; i4 < i3; i4++) {
                Drawable drawable = drawableArr[i4];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f.put(i4, constantState);
                    } else {
                        this.g[i4] = drawableArr[i4];
                    }
                }
            }
            return;
        }
        this.g = new Drawable[10];
        this.h = 0;
    }

    public final int a(Drawable drawable) {
        int i = this.h;
        if (i >= this.g.length) {
            int i2 = i + 10;
            d13 d13Var = (d13) this;
            Drawable[] drawableArr = new Drawable[i2];
            Drawable[] drawableArr2 = d13Var.g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i);
            }
            d13Var.g = drawableArr;
            int[][] iArr = new int[i2];
            System.arraycopy(d13Var.H, 0, iArr, 0, i);
            d13Var.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f1964a);
        this.g[i] = drawable;
        this.h++;
        this.e = drawable.getChangingConfigurations() | this.e;
        this.r = false;
        this.t = false;
        this.k = null;
        this.j = false;
        this.m = false;
        this.u = false;
        return i;
    }

    public final void b() {
        this.m = true;
        c();
        int i = this.h;
        Drawable[] drawableArr = this.g;
        this.o = -1;
        this.n = -1;
        this.q = 0;
        this.p = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.n) {
                this.n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.o) {
                this.o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.p) {
                this.p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = this.f.keyAt(i);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.valueAt(i);
                Drawable[] drawableArr = this.g;
                Drawable newDrawable = constantState.newDrawable(this.f1965b);
                if (Build.VERSION.SDK_INT >= 23) {
                    t9.o0(newDrawable, this.x);
                }
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f1964a);
                drawableArr[keyAt] = mutate;
            }
            this.f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i = this.h;
        Drawable[] drawableArr = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            Drawable drawable = drawableArr[i2];
            if (drawable != null) {
                if (bn0.b(drawable)) {
                    return true;
                }
            } else {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f.get(i2);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable d(int i) {
        int indexOfKey;
        Drawable drawable = this.g[i];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f.valueAt(indexOfKey)).newDrawable(this.f1965b);
        if (Build.VERSION.SDK_INT >= 23) {
            t9.o0(newDrawable, this.x);
        }
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f1964a);
        this.g[i] = mutate;
        this.f.removeAt(indexOfKey);
        if (this.f.size() == 0) {
            this.f = null;
        }
        return mutate;
    }

    public abstract void e();

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.d | this.e;
    }
}
