package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class qs2 {

    /* renamed from: a, reason: collision with root package name */
    public float f4049a;

    /* renamed from: b, reason: collision with root package name */
    public float f4050b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public qs2() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f) {
        float f2 = this.e;
        if (f2 == f) {
            return;
        }
        float f3 = ((f - f2) + 360.0f) % 360.0f;
        if (f3 > 180.0f) {
            return;
        }
        float f4 = this.c;
        float f5 = this.d;
        ms2 ms2Var = new ms2(f4, f5, f4, f5);
        ms2Var.f = this.e;
        ms2Var.g = f3;
        this.h.add(new ks2(ms2Var));
        this.e = f;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((os2) arrayList.get(i)).a(matrix, path);
        }
    }

    public final void c(float f, float f2) {
        ns2 ns2Var = new ns2();
        ns2Var.f3529b = f;
        ns2Var.c = f2;
        this.g.add(ns2Var);
        ls2 ls2Var = new ls2(ns2Var, this.c, this.d);
        float b2 = ls2Var.b() + 270.0f;
        float b3 = ls2Var.b() + 270.0f;
        a(b2);
        this.h.add(ls2Var);
        this.e = b3;
        this.c = f;
        this.d = f2;
    }

    public final void d(float f, float f2, float f3) {
        this.f4049a = 0.0f;
        this.f4050b = f;
        this.c = 0.0f;
        this.d = f;
        this.e = f2;
        this.f = (f2 + f3) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
