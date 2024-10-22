package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class sq1 {
    public static final boolean u;
    public static final boolean v;

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f4396a;

    /* renamed from: b, reason: collision with root package name */
    public fs2 f4397b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public PorterDuff.Mode i;
    public ColorStateList j;
    public ColorStateList k;
    public ColorStateList l;
    public Drawable m;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean r = true;

    static {
        int i = Build.VERSION.SDK_INT;
        boolean z = true;
        u = true;
        if (i > 22) {
            z = false;
        }
        v = z;
    }

    public sq1(MaterialButton materialButton, fs2 fs2Var) {
        this.f4396a = materialButton;
        this.f4397b = fs2Var;
    }

    public final rs2 a() {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            if (this.s.getNumberOfLayers() > 2) {
                return (rs2) this.s.getDrawable(2);
            }
            return (rs2) this.s.getDrawable(1);
        }
        return null;
    }

    public final fr1 b(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 0) {
            if (u) {
                return (fr1) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
            }
            return (fr1) this.s.getDrawable(!z ? 1 : 0);
        }
        return null;
    }

    public final void c(fs2 fs2Var) {
        this.f4397b = fs2Var;
        if (v && !this.o) {
            WeakHashMap weakHashMap = ll3.f3151a;
            MaterialButton materialButton = this.f4396a;
            int f = vk3.f(materialButton);
            int paddingTop = materialButton.getPaddingTop();
            int e = vk3.e(materialButton);
            int paddingBottom = materialButton.getPaddingBottom();
            e();
            vk3.k(materialButton, f, paddingTop, e, paddingBottom);
            return;
        }
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(fs2Var);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(fs2Var);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(fs2Var);
        }
    }

    public final void d(int i, int i2) {
        WeakHashMap weakHashMap = ll3.f3151a;
        MaterialButton materialButton = this.f4396a;
        int f = vk3.f(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int e = vk3.e(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.e;
        int i4 = this.f;
        this.f = i2;
        this.e = i;
        if (!this.o) {
            e();
        }
        vk3.k(materialButton, f, (paddingTop + i) - i3, e, (paddingBottom + i2) - i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [android.graphics.drawable.LayerDrawable, android.graphics.drawable.RippleDrawable] */
    public final void e() {
        int i;
        InsetDrawable insetDrawable;
        fr1 fr1Var = new fr1(this.f4397b);
        MaterialButton materialButton = this.f4396a;
        fr1Var.h(materialButton.getContext());
        bn0.h(fr1Var, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            bn0.i(fr1Var, mode);
        }
        float f = this.h;
        ColorStateList colorStateList = this.k;
        fr1Var.f2139a.k = f;
        fr1Var.invalidateSelf();
        er1 er1Var = fr1Var.f2139a;
        if (er1Var.d != colorStateList) {
            er1Var.d = colorStateList;
            fr1Var.onStateChange(fr1Var.getState());
        }
        fr1 fr1Var2 = new fr1(this.f4397b);
        fr1Var2.setTint(0);
        float f2 = this.h;
        if (this.n) {
            i = zf3.x(materialButton, he2.colorSurface);
        } else {
            i = 0;
        }
        fr1Var2.f2139a.k = f2;
        fr1Var2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i);
        er1 er1Var2 = fr1Var2.f2139a;
        if (er1Var2.d != valueOf) {
            er1Var2.d = valueOf;
            fr1Var2.onStateChange(fr1Var2.getState());
        }
        if (u) {
            fr1 fr1Var3 = new fr1(this.f4397b);
            this.m = fr1Var3;
            bn0.g(fr1Var3, -1);
            ?? rippleDrawable = new RippleDrawable(ya0.d0(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fr1Var2, fr1Var}), this.c, this.e, this.d, this.f), this.m);
            this.s = rippleDrawable;
            insetDrawable = rippleDrawable;
        } else {
            dl2 dl2Var = new dl2(new cl2(new fr1(this.f4397b)));
            this.m = dl2Var;
            bn0.h(dl2Var, ya0.d0(this.l));
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{fr1Var2, fr1Var, this.m});
            this.s = layerDrawable;
            insetDrawable = new InsetDrawable((Drawable) layerDrawable, this.c, this.e, this.d, this.f);
        }
        materialButton.setInternalBackground(insetDrawable);
        fr1 b2 = b(false);
        if (b2 != null) {
            b2.i(this.t);
            b2.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i = 0;
        fr1 b2 = b(false);
        fr1 b3 = b(true);
        if (b2 != null) {
            float f = this.h;
            ColorStateList colorStateList = this.k;
            b2.f2139a.k = f;
            b2.invalidateSelf();
            er1 er1Var = b2.f2139a;
            if (er1Var.d != colorStateList) {
                er1Var.d = colorStateList;
                b2.onStateChange(b2.getState());
            }
            if (b3 != null) {
                float f2 = this.h;
                if (this.n) {
                    i = zf3.x(this.f4396a, he2.colorSurface);
                }
                b3.f2139a.k = f2;
                b3.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i);
                er1 er1Var2 = b3.f2139a;
                if (er1Var2.d != valueOf) {
                    er1Var2.d = valueOf;
                    b3.onStateChange(b3.getState());
                }
            }
        }
    }
}
