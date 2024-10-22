package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.view.animation.Interpolator;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* loaded from: classes.dex */
public final class w42 implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4938a = 2;

    /* renamed from: b, reason: collision with root package name */
    public float[] f4939b;
    public float[] c;

    public w42(float f, float f2, float f3, float f4) {
        a(f, f2, f3, f4);
    }

    public final void a(float f, float f2, float f3, float f4) {
        switch (this.f4938a) {
            case 1:
                Path path = new Path();
                path.moveTo(0.0f, 0.0f);
                path.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                b(path);
                return;
            default:
                Path path2 = new Path();
                path2.moveTo(0.0f, 0.0f);
                path2.cubicTo(f, f2, f3, f4, 1.0f, 1.0f);
                b(path2);
                return;
        }
    }

    public final void b(Path path) {
        int i = 0;
        switch (this.f4938a) {
            case 1:
                PathMeasure pathMeasure = new PathMeasure(path, false);
                float length = pathMeasure.getLength();
                int min = Math.min(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, ((int) (length / 0.002f)) + 1);
                if (min > 0) {
                    this.f4939b = new float[min];
                    this.c = new float[min];
                    float[] fArr = new float[2];
                    for (int i2 = 0; i2 < min; i2++) {
                        pathMeasure.getPosTan((i2 * length) / (min - 1), fArr, null);
                        this.f4939b[i2] = fArr[0];
                        this.c[i2] = fArr[1];
                    }
                    if (Math.abs(this.f4939b[0]) <= 1.0E-5d && Math.abs(this.c[0]) <= 1.0E-5d) {
                        int i3 = min - 1;
                        if (Math.abs(this.f4939b[i3] - 1.0f) <= 1.0E-5d && Math.abs(this.c[i3] - 1.0f) <= 1.0E-5d) {
                            int i4 = 0;
                            float f = 0.0f;
                            while (i < min) {
                                float[] fArr2 = this.f4939b;
                                int i5 = i4 + 1;
                                float f2 = fArr2[i4];
                                if (f2 >= f) {
                                    fArr2[i] = f2;
                                    i++;
                                    f = f2;
                                    i4 = i5;
                                } else {
                                    throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f2);
                                }
                            }
                            if (!pathMeasure.nextContour()) {
                                return;
                            } else {
                                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                            }
                        }
                    }
                    StringBuilder sb = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
                    sb.append(this.f4939b[0]);
                    sb.append(",");
                    sb.append(this.c[0]);
                    sb.append(" end:");
                    int i6 = min - 1;
                    sb.append(this.f4939b[i6]);
                    sb.append(",");
                    sb.append(this.c[i6]);
                    throw new IllegalArgumentException(sb.toString());
                }
                throw new IllegalArgumentException("The Path has a invalid length " + length);
            default:
                PathMeasure pathMeasure2 = new PathMeasure(path, false);
                float length2 = pathMeasure2.getLength();
                int min2 = Math.min(AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS, ((int) (length2 / 0.002f)) + 1);
                if (min2 > 0) {
                    this.f4939b = new float[min2];
                    this.c = new float[min2];
                    float[] fArr3 = new float[2];
                    for (int i7 = 0; i7 < min2; i7++) {
                        pathMeasure2.getPosTan((i7 * length2) / (min2 - 1), fArr3, null);
                        this.f4939b[i7] = fArr3[0];
                        this.c[i7] = fArr3[1];
                    }
                    if (Math.abs(this.f4939b[0]) <= 1.0E-5d && Math.abs(this.c[0]) <= 1.0E-5d) {
                        int i8 = min2 - 1;
                        if (Math.abs(this.f4939b[i8] - 1.0f) <= 1.0E-5d && Math.abs(this.c[i8] - 1.0f) <= 1.0E-5d) {
                            int i9 = 0;
                            float f3 = 0.0f;
                            while (i < min2) {
                                float[] fArr4 = this.f4939b;
                                int i10 = i9 + 1;
                                float f4 = fArr4[i9];
                                if (f4 >= f3) {
                                    fArr4[i] = f4;
                                    i++;
                                    f3 = f4;
                                    i9 = i10;
                                } else {
                                    throw new IllegalArgumentException("The Path cannot loop back on itself, x :" + f4);
                                }
                            }
                            if (!pathMeasure2.nextContour()) {
                                return;
                            } else {
                                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
                            }
                        }
                    }
                    StringBuilder sb2 = new StringBuilder("The Path must start at (0,0) and end at (1,1) start: ");
                    sb2.append(this.f4939b[0]);
                    sb2.append(",");
                    sb2.append(this.c[0]);
                    sb2.append(" end:");
                    int i11 = min2 - 1;
                    sb2.append(this.f4939b[i11]);
                    sb2.append(",");
                    sb2.append(this.c[i11]);
                    throw new IllegalArgumentException(sb2.toString());
                }
                throw new IllegalArgumentException("The Path has a invalid length " + length2);
        }
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        int i = 0;
        switch (this.f4938a) {
            case 0:
                if (f <= 0.0f) {
                    return 0.0f;
                }
                if (f >= 1.0f) {
                    return 1.0f;
                }
                int length = this.f4939b.length - 1;
                while (length - i > 1) {
                    int i2 = (i + length) / 2;
                    if (f < this.f4939b[i2]) {
                        length = i2;
                    } else {
                        i = i2;
                    }
                }
                float[] fArr = this.f4939b;
                float f2 = fArr[length];
                float f3 = fArr[i];
                float f4 = f2 - f3;
                if (f4 == 0.0f) {
                    return this.c[i];
                }
                float f5 = (f - f3) / f4;
                float[] fArr2 = this.c;
                float f6 = fArr2[i];
                return hx2.f(fArr2[length], f6, f5, f6);
            case 1:
                if (f <= 0.0f) {
                    return 0.0f;
                }
                if (f >= 1.0f) {
                    return 1.0f;
                }
                int length2 = this.f4939b.length - 1;
                while (length2 - i > 1) {
                    int i3 = (i + length2) / 2;
                    if (f < this.f4939b[i3]) {
                        length2 = i3;
                    } else {
                        i = i3;
                    }
                }
                float[] fArr3 = this.f4939b;
                float f7 = fArr3[length2];
                float f8 = fArr3[i];
                float f9 = f7 - f8;
                if (f9 == 0.0f) {
                    return this.c[i];
                }
                float f10 = (f - f8) / f9;
                float[] fArr4 = this.c;
                float f11 = fArr4[i];
                return hx2.f(fArr4[length2], f11, f10, f11);
            default:
                if (f <= 0.0f) {
                    return 0.0f;
                }
                if (f >= 1.0f) {
                    return 1.0f;
                }
                int length3 = this.f4939b.length - 1;
                while (length3 - i > 1) {
                    int i4 = (i + length3) / 2;
                    if (f < this.f4939b[i4]) {
                        length3 = i4;
                    } else {
                        i = i4;
                    }
                }
                float[] fArr5 = this.f4939b;
                float f12 = fArr5[length3];
                float f13 = fArr5[i];
                float f14 = f12 - f13;
                if (f14 == 0.0f) {
                    return this.c[i];
                }
                float f15 = (f - f13) / f14;
                float[] fArr6 = this.c;
                float f16 = fArr6[i];
                return hx2.f(fArr6[length3], f16, f15, f16);
        }
    }
}
