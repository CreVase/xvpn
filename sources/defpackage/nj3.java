package defpackage;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class nj3 extends oj3 {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f3473a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f3474b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public final int k;
    public String l;

    public nj3(nj3 nj3Var, kg kgVar) {
        pj3 lj3Var;
        this.f3473a = new Matrix();
        this.f3474b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.l = null;
        this.c = nj3Var.c;
        this.d = nj3Var.d;
        this.e = nj3Var.e;
        this.f = nj3Var.f;
        this.g = nj3Var.g;
        this.h = nj3Var.h;
        this.i = nj3Var.i;
        String str = nj3Var.l;
        this.l = str;
        this.k = nj3Var.k;
        if (str != null) {
            kgVar.put(str, this);
        }
        matrix.set(nj3Var.j);
        ArrayList arrayList = nj3Var.f3474b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof nj3) {
                this.f3474b.add(new nj3((nj3) obj, kgVar));
            } else {
                if (obj instanceof mj3) {
                    lj3Var = new mj3((mj3) obj);
                } else if (obj instanceof lj3) {
                    lj3Var = new lj3((lj3) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3474b.add(lj3Var);
                Object obj2 = lj3Var.f3857b;
                if (obj2 != null) {
                    kgVar.put(obj2, lj3Var);
                }
            }
        }
    }

    @Override // defpackage.oj3
    public final boolean a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3474b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((oj3) arrayList.get(i)).a()) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.oj3
    public final boolean b(int[] iArr) {
        int i = 0;
        boolean z = false;
        while (true) {
            ArrayList arrayList = this.f3474b;
            if (i < arrayList.size()) {
                z |= ((oj3) arrayList.get(i)).b(iArr);
                i++;
            } else {
                return z;
            }
        }
    }

    public final void c() {
        Matrix matrix = this.j;
        matrix.reset();
        matrix.postTranslate(-this.d, -this.e);
        matrix.postScale(this.f, this.g);
        matrix.postRotate(this.c, 0.0f, 0.0f);
        matrix.postTranslate(this.h + this.d, this.i + this.e);
    }

    public String getGroupName() {
        return this.l;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.d;
    }

    public float getPivotY() {
        return this.e;
    }

    public float getRotation() {
        return this.c;
    }

    public float getScaleX() {
        return this.f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f) {
        if (f != this.d) {
            this.d = f;
            c();
        }
    }

    public void setPivotY(float f) {
        if (f != this.e) {
            this.e = f;
            c();
        }
    }

    public void setRotation(float f) {
        if (f != this.c) {
            this.c = f;
            c();
        }
    }

    public void setScaleX(float f) {
        if (f != this.f) {
            this.f = f;
            c();
        }
    }

    public void setScaleY(float f) {
        if (f != this.g) {
            this.g = f;
            c();
        }
    }

    public void setTranslateX(float f) {
        if (f != this.h) {
            this.h = f;
            c();
        }
    }

    public void setTranslateY(float f) {
        if (f != this.i) {
            this.i = f;
            c();
        }
    }

    public nj3() {
        this.f3473a = new Matrix();
        this.f3474b = new ArrayList();
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.l = null;
    }
}
