package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class is2 {

    /* renamed from: a, reason: collision with root package name */
    public final qs2[] f2640a = new qs2[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f2641b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final qs2 g = new qs2();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public final boolean l = true;

    public is2() {
        for (int i = 0; i < 4; i++) {
            this.f2640a[i] = new qs2();
            this.f2641b[i] = new Matrix();
            this.c[i] = new Matrix();
        }
    }

    public final void a(fs2 fs2Var, float f, RectF rectF, ja1 ja1Var, Path path) {
        int i;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        qs2[] qs2VarArr;
        mp0 mp0Var;
        Path path2;
        ja1 ja1Var2;
        p90 p90Var;
        tf3 tf3Var;
        is2 is2Var = this;
        ja1 ja1Var3 = ja1Var;
        Path path3 = path;
        path.rewind();
        Path path4 = is2Var.e;
        path4.rewind();
        Path path5 = is2Var.f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            i = 4;
            matrixArr = is2Var.c;
            fArr = is2Var.h;
            matrixArr2 = is2Var.f2641b;
            qs2VarArr = is2Var.f2640a;
            if (i2 >= 4) {
                break;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        p90Var = fs2Var.f;
                    } else {
                        p90Var = fs2Var.e;
                    }
                } else {
                    p90Var = fs2Var.h;
                }
            } else {
                p90Var = fs2Var.g;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        tf3Var = fs2Var.f2144b;
                    } else {
                        tf3Var = fs2Var.f2143a;
                    }
                } else {
                    tf3Var = fs2Var.d;
                }
            } else {
                tf3Var = fs2Var.c;
            }
            qs2 qs2Var = qs2VarArr[i2];
            tf3Var.getClass();
            tf3Var.I(f, p90Var.a(rectF), qs2Var);
            int i3 = i2 + 1;
            float f2 = (i3 % 4) * 90;
            matrixArr2[i2].reset();
            PointF pointF = is2Var.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        pointF.set(rectF.right, rectF.top);
                    } else {
                        pointF.set(rectF.left, rectF.top);
                    }
                } else {
                    pointF.set(rectF.left, rectF.bottom);
                }
            } else {
                pointF.set(rectF.right, rectF.bottom);
            }
            matrixArr2[i2].setTranslate(pointF.x, pointF.y);
            matrixArr2[i2].preRotate(f2);
            qs2 qs2Var2 = qs2VarArr[i2];
            fArr[0] = qs2Var2.c;
            fArr[1] = qs2Var2.d;
            matrixArr2[i2].mapPoints(fArr);
            matrixArr[i2].reset();
            matrixArr[i2].setTranslate(fArr[0], fArr[1]);
            matrixArr[i2].preRotate(f2);
            i2 = i3;
        }
        char c = 1;
        char c2 = 0;
        int i4 = 0;
        while (i4 < i) {
            qs2 qs2Var3 = qs2VarArr[i4];
            fArr[c2] = qs2Var3.f4049a;
            fArr[c] = qs2Var3.f4050b;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 == 0) {
                path3.moveTo(fArr[c2], fArr[c]);
            } else {
                path3.lineTo(fArr[c2], fArr[c]);
            }
            qs2VarArr[i4].b(matrixArr2[i4], path3);
            if (ja1Var3 != null) {
                qs2 qs2Var4 = qs2VarArr[i4];
                Matrix matrix = matrixArr2[i4];
                BitSet bitSet = ((fr1) ja1Var3.f2735b).d;
                qs2Var4.getClass();
                bitSet.set(i4, false);
                ps2[] ps2VarArr = ((fr1) ja1Var3.f2735b).f2140b;
                qs2Var4.a(qs2Var4.f);
                ps2VarArr[i4] = new js2(new ArrayList(qs2Var4.h), new Matrix(matrix));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            qs2 qs2Var5 = qs2VarArr[i4];
            fArr[0] = qs2Var5.c;
            fArr[1] = qs2Var5.d;
            matrixArr2[i4].mapPoints(fArr);
            qs2 qs2Var6 = qs2VarArr[i6];
            float f3 = qs2Var6.f4049a;
            float[] fArr2 = is2Var.i;
            fArr2[0] = f3;
            fArr2[1] = qs2Var6.f4050b;
            matrixArr2[i6].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            qs2 qs2Var7 = qs2VarArr[i4];
            fArr[0] = qs2Var7.c;
            fArr[1] = qs2Var7.d;
            matrixArr2[i4].mapPoints(fArr);
            if (i4 != 1 && i4 != 3) {
                Math.abs(rectF.centerY() - fArr[1]);
            } else {
                Math.abs(rectF.centerX() - fArr[0]);
            }
            qs2 qs2Var8 = is2Var.g;
            qs2Var8.d(0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        mp0Var = fs2Var.j;
                    } else {
                        mp0Var = fs2Var.i;
                    }
                } else {
                    mp0Var = fs2Var.l;
                }
            } else {
                mp0Var = fs2Var.k;
            }
            mp0Var.getClass();
            qs2Var8.c(max, 0.0f);
            Path path6 = is2Var.j;
            path6.reset();
            qs2Var8.b(matrixArr[i4], path6);
            if (is2Var.l && (is2Var.b(path6, i4) || is2Var.b(path6, i6))) {
                path6.op(path6, path5, Path.Op.DIFFERENCE);
                fArr[0] = qs2Var8.f4049a;
                fArr[1] = qs2Var8.f4050b;
                matrixArr[i4].mapPoints(fArr);
                path4.moveTo(fArr[0], fArr[1]);
                qs2Var8.b(matrixArr[i4], path4);
                ja1Var2 = ja1Var;
                path2 = path;
            } else {
                path2 = path;
                qs2Var8.b(matrixArr[i4], path2);
                ja1Var2 = ja1Var;
            }
            if (ja1Var2 != null) {
                Matrix matrix2 = matrixArr[i4];
                ((fr1) ja1Var2.f2735b).d.set(i4 + 4, false);
                ps2[] ps2VarArr2 = ((fr1) ja1Var2.f2735b).c;
                qs2Var8.a(qs2Var8.f);
                ps2VarArr2[i4] = new js2(new ArrayList(qs2Var8.h), new Matrix(matrix2));
            }
            is2Var = this;
            path3 = path2;
            i4 = i5;
            c = 1;
            i = 4;
            c2 = 0;
            ja1Var3 = ja1Var2;
        }
        Path path7 = path3;
        path.close();
        path4.close();
        if (!path4.isEmpty()) {
            path7.op(path4, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i) {
        Path path2 = this.k;
        path2.reset();
        this.f2640a[i].b(this.f2641b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() > 1.0f && rectF.height() > 1.0f) {
            return true;
        }
        return false;
    }
}
