package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes2.dex */
public final class ks2 extends ps2 {
    public final ms2 c;

    public ks2(ms2 ms2Var) {
        this.c = ms2Var;
    }

    @Override // defpackage.ps2
    public final void a(Matrix matrix, es2 es2Var, int i, Canvas canvas) {
        boolean z;
        ms2 ms2Var = this.c;
        float f = ms2Var.f;
        float f2 = ms2Var.g;
        RectF rectF = new RectF(ms2Var.f3344b, ms2Var.c, ms2Var.d, ms2Var.e);
        es2Var.getClass();
        if (f2 < 0.0f) {
            z = true;
        } else {
            z = false;
        }
        Path path = es2Var.g;
        int[] iArr = es2.k;
        if (z) {
            iArr[0] = 0;
            iArr[1] = es2Var.f;
            iArr[2] = es2Var.e;
            iArr[3] = es2Var.d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f, f2);
            path.close();
            float f3 = -i;
            rectF.inset(f3, f3);
            iArr[0] = 0;
            iArr[1] = es2Var.d;
            iArr[2] = es2Var.e;
            iArr[3] = es2Var.f;
        }
        float width = rectF.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (i / width);
            float[] fArr = es2.l;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = es2Var.f1985b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, es2Var.h);
            }
            canvas.drawArc(rectF, f, f2, true, paint);
            canvas.restore();
        }
    }
}
