package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes2.dex */
public final class ms2 extends os2 {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    public float f3344b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;

    public ms2(float f, float f2, float f3, float f4) {
        this.f3344b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
    }

    @Override // defpackage.os2
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3721a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f3344b, this.c, this.d, this.e);
        path.arcTo(rectF, this.f, this.g, false);
        path.transform(matrix);
    }
}
