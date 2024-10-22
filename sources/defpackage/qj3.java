package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class qj3 {
    public static final Matrix p = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f4006a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f4007b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final nj3 g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final kg o;

    public qj3() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new kg();
        this.g = new nj3();
        this.f4006a = new Path();
        this.f4007b = new Path();
    }

    public final void a(nj3 nj3Var, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Path.FillType fillType;
        Path.FillType fillType2;
        nj3Var.f3473a.set(matrix);
        Matrix matrix2 = nj3Var.f3473a;
        matrix2.preConcat(nj3Var.j);
        canvas.save();
        char c = 0;
        int i4 = 0;
        while (true) {
            ArrayList arrayList = nj3Var.f3474b;
            if (i4 < arrayList.size()) {
                oj3 oj3Var = (oj3) arrayList.get(i4);
                if (oj3Var instanceof nj3) {
                    a((nj3) oj3Var, matrix2, canvas, i, i2);
                } else if (oj3Var instanceof pj3) {
                    pj3 pj3Var = (pj3) oj3Var;
                    float f3 = i / this.j;
                    float f4 = i2 / this.k;
                    float min = Math.min(f3, f4);
                    Matrix matrix3 = this.c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f3, f4);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c], fArr[1]);
                    i3 = i4;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f5 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    if (max > 0.0f) {
                        f = Math.abs(f5) / max;
                    } else {
                        f = 0.0f;
                    }
                    if (f != 0.0f) {
                        pj3Var.getClass();
                        Path path = this.f4006a;
                        path.reset();
                        z42[] z42VarArr = pj3Var.f3856a;
                        if (z42VarArr != null) {
                            z42.b(z42VarArr, path);
                        }
                        Path path2 = this.f4007b;
                        path2.reset();
                        if (pj3Var instanceof lj3) {
                            if (pj3Var.c == 0) {
                                fillType2 = Path.FillType.WINDING;
                            } else {
                                fillType2 = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType2);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            mj3 mj3Var = (mj3) pj3Var;
                            float f6 = mj3Var.j;
                            if (f6 != 0.0f || mj3Var.k != 1.0f) {
                                float f7 = mj3Var.l;
                                float f8 = (f6 + f7) % 1.0f;
                                float f9 = (mj3Var.k + f7) % 1.0f;
                                if (this.f == null) {
                                    this.f = new PathMeasure();
                                }
                                this.f.setPath(path, false);
                                float length = this.f.getLength();
                                float f10 = f8 * length;
                                float f11 = f9 * length;
                                path.reset();
                                if (f10 > f11) {
                                    this.f.getSegment(f10, length, path, true);
                                    f2 = 0.0f;
                                    this.f.getSegment(0.0f, f11, path, true);
                                } else {
                                    f2 = 0.0f;
                                    this.f.getSegment(f10, f11, path, true);
                                }
                                path.rLineTo(f2, f2);
                            }
                            path2.addPath(path, matrix3);
                            f30 f30Var = mj3Var.g;
                            if (((Shader) f30Var.c) != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z && f30Var.f2037b == 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2) {
                                if (this.e == null) {
                                    Paint paint = new Paint(1);
                                    this.e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                }
                                Paint paint2 = this.e;
                                Object obj = f30Var.c;
                                if (((Shader) obj) != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (z6) {
                                    Shader shader = (Shader) obj;
                                    shader.setLocalMatrix(matrix3);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(mj3Var.i * 255.0f));
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i5 = f30Var.f2037b;
                                    float f12 = mj3Var.i;
                                    PorterDuff.Mode mode = tj3.j;
                                    paint2.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                                }
                                paint2.setColorFilter(null);
                                if (mj3Var.c == 0) {
                                    fillType = Path.FillType.WINDING;
                                } else {
                                    fillType = Path.FillType.EVEN_ODD;
                                }
                                path2.setFillType(fillType);
                                canvas.drawPath(path2, paint2);
                            }
                            f30 f30Var2 = mj3Var.e;
                            if (((Shader) f30Var2.c) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (!z3 && f30Var2.f2037b == 0) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (z4) {
                                if (this.d == null) {
                                    z5 = true;
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                } else {
                                    z5 = true;
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = mj3Var.n;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = mj3Var.m;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(mj3Var.o);
                                Object obj2 = f30Var2.c;
                                if (((Shader) obj2) == null) {
                                    z5 = false;
                                }
                                if (z5) {
                                    Shader shader2 = (Shader) obj2;
                                    shader2.setLocalMatrix(matrix3);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(mj3Var.h * 255.0f));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i6 = f30Var2.f2037b;
                                    float f13 = mj3Var.h;
                                    PorterDuff.Mode mode2 = tj3.j;
                                    paint4.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(mj3Var.f * f * min);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    i4 = i3 + 1;
                    c = 0;
                }
                i3 = i4;
                i4 = i3 + 1;
                c = 0;
            } else {
                canvas.restore();
                return;
            }
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public qj3(qj3 qj3Var) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        kg kgVar = new kg();
        this.o = kgVar;
        this.g = new nj3(qj3Var.g, kgVar);
        this.f4006a = new Path(qj3Var.f4006a);
        this.f4007b = new Path(qj3Var.f4007b);
        this.h = qj3Var.h;
        this.i = qj3Var.i;
        this.j = qj3Var.j;
        this.k = qj3Var.k;
        this.l = qj3Var.l;
        this.m = qj3Var.m;
        String str = qj3Var.m;
        if (str != null) {
            kgVar.put(str, this);
        }
        this.n = qj3Var.n;
    }
}
