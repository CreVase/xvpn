package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes2.dex */
public final class ns2 extends os2 {

    /* renamed from: b, reason: collision with root package name */
    public float f3529b;
    public float c;

    @Override // defpackage.os2
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f3721a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f3529b, this.c);
        path.transform(matrix);
    }
}
