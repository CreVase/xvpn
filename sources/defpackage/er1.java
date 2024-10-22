package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class er1 extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public fs2 f1978a;

    /* renamed from: b, reason: collision with root package name */
    public rp0 f1979b;
    public ColorStateList c;
    public ColorStateList d;
    public final ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public final float o;
    public final int p;
    public int q;
    public int r;
    public final int s;
    public final boolean t;
    public final Paint.Style u;

    public er1(fs2 fs2Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.f1978a = fs2Var;
        this.f1979b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        fr1 fr1Var = new fr1(this);
        fr1Var.e = true;
        return fr1Var;
    }

    public er1(er1 er1Var) {
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = false;
        this.u = Paint.Style.FILL_AND_STROKE;
        this.f1978a = er1Var.f1978a;
        this.f1979b = er1Var.f1979b;
        this.k = er1Var.k;
        this.c = er1Var.c;
        this.d = er1Var.d;
        this.g = er1Var.g;
        this.f = er1Var.f;
        this.l = er1Var.l;
        this.i = er1Var.i;
        this.r = er1Var.r;
        this.p = er1Var.p;
        this.t = er1Var.t;
        this.j = er1Var.j;
        this.m = er1Var.m;
        this.n = er1Var.n;
        this.o = er1Var.o;
        this.q = er1Var.q;
        this.s = er1Var.s;
        this.e = er1Var.e;
        this.u = er1Var.u;
        if (er1Var.h != null) {
            this.h = new Rect(er1Var.h);
        }
    }
}
