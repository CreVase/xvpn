package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class ls2 extends ps2 {
    public final ns2 c;
    public final float d;
    public final float e;

    public ls2(ns2 ns2Var, float f, float f2) {
        this.c = ns2Var;
        this.d = f;
        this.e = f2;
    }

    @Override // defpackage.ps2
    public final void a(Matrix matrix, es2 es2Var, int i, Canvas canvas) {
        ns2 ns2Var = this.c;
        float f = ns2Var.c;
        float f2 = this.e;
        float f3 = ns2Var.f3529b;
        float f4 = this.d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f - f2, f3 - f4), 0.0f);
        Matrix matrix2 = this.f3909a;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate(b());
        es2Var.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = es2.i;
        iArr[0] = es2Var.f;
        iArr[1] = es2Var.e;
        iArr[2] = es2Var.d;
        Paint paint = es2Var.c;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, es2.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        ns2 ns2Var = this.c;
        return (float) Math.toDegrees(Math.atan((ns2Var.c - this.e) / (ns2Var.f3529b - this.d)));
    }
}
