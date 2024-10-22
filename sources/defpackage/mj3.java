package defpackage;

import android.graphics.Paint;

/* loaded from: classes.dex */
public final class mj3 extends pj3 {
    public f30 e;
    public float f;
    public f30 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public Paint.Cap m;
    public Paint.Join n;
    public float o;

    public mj3() {
        this.f = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 1.0f;
        this.l = 0.0f;
        this.m = Paint.Cap.BUTT;
        this.n = Paint.Join.MITER;
        this.o = 4.0f;
    }

    @Override // defpackage.oj3
    public final boolean a() {
        if (!this.g.j() && !this.e.j()) {
            return false;
        }
        return true;
    }

    @Override // defpackage.oj3
    public final boolean b(int[] iArr) {
        return this.e.k(iArr) | this.g.k(iArr);
    }

    public float getFillAlpha() {
        return this.i;
    }

    public int getFillColor() {
        return this.g.f2037b;
    }

    public float getStrokeAlpha() {
        return this.h;
    }

    public int getStrokeColor() {
        return this.e.f2037b;
    }

    public float getStrokeWidth() {
        return this.f;
    }

    public float getTrimPathEnd() {
        return this.k;
    }

    public float getTrimPathOffset() {
        return this.l;
    }

    public float getTrimPathStart() {
        return this.j;
    }

    public void setFillAlpha(float f) {
        this.i = f;
    }

    public void setFillColor(int i) {
        this.g.f2037b = i;
    }

    public void setStrokeAlpha(float f) {
        this.h = f;
    }

    public void setStrokeColor(int i) {
        this.e.f2037b = i;
    }

    public void setStrokeWidth(float f) {
        this.f = f;
    }

    public void setTrimPathEnd(float f) {
        this.k = f;
    }

    public void setTrimPathOffset(float f) {
        this.l = f;
    }

    public void setTrimPathStart(float f) {
        this.j = f;
    }

    public mj3(mj3 mj3Var) {
        super(mj3Var);
        this.f = 0.0f;
        this.h = 1.0f;
        this.i = 1.0f;
        this.j = 0.0f;
        this.k = 1.0f;
        this.l = 0.0f;
        this.m = Paint.Cap.BUTT;
        this.n = Paint.Join.MITER;
        this.o = 4.0f;
        this.e = mj3Var.e;
        this.f = mj3Var.f;
        this.h = mj3Var.h;
        this.g = mj3Var.g;
        this.c = mj3Var.c;
        this.i = mj3Var.i;
        this.j = mj3Var.j;
        this.k = mj3Var.k;
        this.l = mj3Var.l;
        this.m = mj3Var.m;
        this.n = mj3Var.n;
        this.o = mj3Var.o;
    }
}
