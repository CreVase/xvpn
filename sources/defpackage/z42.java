package defpackage;

import android.graphics.Path;

/* loaded from: classes.dex */
public final class z42 {

    /* renamed from: a, reason: collision with root package name */
    public char f5423a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f5424b;

    public z42(char c, float[] fArr) {
        this.f5423a = c;
        this.f5424b = fArr;
    }

    public static void a(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        boolean z3;
        double radians = Math.toRadians(f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = f;
        double d4 = f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = f5;
        double d8 = d5 / d7;
        double d9 = f6;
        double d10 = ((d4 * cos) + ((-f) * sin)) / d9;
        double d11 = d4;
        double d12 = f4;
        double d13 = ((d12 * sin) + (f3 * cos)) / d7;
        double d14 = ((d12 * cos) + ((-f3) * sin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            a(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z == z2) {
            d = d17 - d22;
            d2 = d18 + d21;
        } else {
            d = d17 + d22;
            d2 = d18 - d21;
        }
        double atan2 = Math.atan2(d10 - d2, d8 - d);
        double atan22 = Math.atan2(d14 - d2, d13 - d) - atan2;
        int i = 0;
        if (atan22 >= 0.0d) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 != z3) {
            if (atan22 > 0.0d) {
                atan22 -= 6.283185307179586d;
            } else {
                atan22 += 6.283185307179586d;
            }
        }
        double d23 = d * d7;
        double d24 = d2 * d9;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d7;
        double d28 = d27 * cos2;
        double d29 = d9 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d9 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = atan22 / ceil;
        double d35 = atan2;
        while (i < ceil) {
            double d36 = d35 + d34;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            double d37 = d34;
            double d38 = (((d7 * cos2) * cos4) + d25) - (d29 * sin4);
            double d39 = d25;
            double d40 = (d32 * sin4) + (d7 * sin2 * cos4) + d26;
            double d41 = (d28 * sin4) - (d29 * cos4);
            double d42 = (cos4 * d32) + (sin4 * d31);
            double d43 = d36 - d35;
            double tan = Math.tan(d43 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d43)) / 3.0d;
            double d44 = (d30 * sqrt3) + d6;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) d44, (float) ((d33 * sqrt3) + d11), (float) (d38 - (sqrt3 * d41)), (float) (d40 - (sqrt3 * d42)), (float) d38, (float) d40);
            i++;
            d32 = d32;
            d31 = d31;
            ceil = ceil;
            cos2 = cos2;
            d35 = d36;
            d7 = d7;
            d33 = d42;
            d30 = d41;
            d6 = d38;
            d11 = d40;
            d34 = d37;
            d25 = d39;
        }
    }

    public static void b(z42[] z42VarArr, Path path) {
        int i;
        int i2;
        char c;
        z42 z42Var;
        int i3;
        boolean z;
        boolean z2;
        float f;
        float f2;
        boolean z3;
        boolean z4;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        float f21;
        z42[] z42VarArr2 = z42VarArr;
        float[] fArr = new float[6];
        char c2 = 'm';
        char c3 = 0;
        char c4 = 'm';
        int i4 = 0;
        while (i4 < z42VarArr2.length) {
            z42 z42Var2 = z42VarArr2[i4];
            char c5 = z42Var2.f5423a;
            float f22 = fArr[c3];
            float f23 = fArr[1];
            float f24 = fArr[2];
            float f25 = fArr[3];
            float f26 = fArr[4];
            float f27 = fArr[5];
            switch (c5) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f26, f27);
                    f22 = f26;
                    f24 = f22;
                    f23 = f27;
                    f25 = f23;
                    break;
            }
            i = 2;
            float f28 = f26;
            float f29 = f27;
            float f30 = f22;
            float f31 = f23;
            int i5 = 0;
            while (true) {
                float[] fArr2 = z42Var2.f5424b;
                if (i5 < fArr2.length) {
                    if (c5 != 'A') {
                        if (c5 != 'C') {
                            if (c5 != 'H') {
                                if (c5 != 'Q') {
                                    if (c5 != 'V') {
                                        if (c5 != 'a') {
                                            if (c5 != 'c') {
                                                if (c5 != 'h') {
                                                    if (c5 != 'q') {
                                                        if (c5 != 'v') {
                                                            if (c5 != 'L') {
                                                                if (c5 != 'M') {
                                                                    if (c5 != 'S') {
                                                                        if (c5 != 'T') {
                                                                            if (c5 != 'l') {
                                                                                if (c5 != c2) {
                                                                                    if (c5 != 's') {
                                                                                        if (c5 == 't') {
                                                                                            if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                                f21 = 0.0f;
                                                                                                f20 = 0.0f;
                                                                                            } else {
                                                                                                f20 = f30 - f24;
                                                                                                f21 = f31 - f25;
                                                                                            }
                                                                                            int i6 = i5 + 0;
                                                                                            int i7 = i5 + 1;
                                                                                            path.rQuadTo(f20, f21, fArr2[i6], fArr2[i7]);
                                                                                            float f32 = f20 + f30;
                                                                                            float f33 = f21 + f31;
                                                                                            f30 += fArr2[i6];
                                                                                            f31 += fArr2[i7];
                                                                                            f25 = f33;
                                                                                            f24 = f32;
                                                                                        }
                                                                                        i2 = i5;
                                                                                    } else {
                                                                                        if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                                            f18 = 0.0f;
                                                                                            f19 = 0.0f;
                                                                                        } else {
                                                                                            float f34 = f30 - f24;
                                                                                            f18 = f31 - f25;
                                                                                            f19 = f34;
                                                                                        }
                                                                                        int i8 = i5 + 0;
                                                                                        int i9 = i5 + 1;
                                                                                        int i10 = i5 + 2;
                                                                                        int i11 = i5 + 3;
                                                                                        i2 = i5;
                                                                                        f3 = f31;
                                                                                        float f35 = f30;
                                                                                        path.rCubicTo(f19, f18, fArr2[i8], fArr2[i9], fArr2[i10], fArr2[i11]);
                                                                                        f4 = fArr2[i8] + f35;
                                                                                        f5 = fArr2[i9] + f3;
                                                                                        f6 = f35 + fArr2[i10];
                                                                                        f7 = fArr2[i11];
                                                                                    }
                                                                                } else {
                                                                                    i2 = i5;
                                                                                    float f36 = fArr2[i2 + 0];
                                                                                    f30 += f36;
                                                                                    float f37 = fArr2[i2 + 1];
                                                                                    f31 += f37;
                                                                                    if (i2 > 0) {
                                                                                        path.rLineTo(f36, f37);
                                                                                    } else {
                                                                                        path.rMoveTo(f36, f37);
                                                                                        f29 = f31;
                                                                                        f28 = f30;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                i2 = i5;
                                                                                f10 = f31;
                                                                                int i12 = i2 + 0;
                                                                                float f38 = fArr2[i12];
                                                                                int i13 = i2 + 1;
                                                                                path.rLineTo(f38, fArr2[i13]);
                                                                                f30 += fArr2[i12];
                                                                                f11 = fArr2[i13];
                                                                            }
                                                                        } else {
                                                                            i2 = i5;
                                                                            float f39 = f31;
                                                                            float f40 = f30;
                                                                            if (c4 != 'q' && c4 != 't' && c4 != 'Q' && c4 != 'T') {
                                                                                f16 = f40;
                                                                                f17 = f39;
                                                                            } else {
                                                                                f16 = (f40 * 2.0f) - f24;
                                                                                f17 = (f39 * 2.0f) - f25;
                                                                            }
                                                                            int i14 = i2 + 0;
                                                                            int i15 = i2 + 1;
                                                                            path.quadTo(f16, f17, fArr2[i14], fArr2[i15]);
                                                                            f25 = f17;
                                                                            f24 = f16;
                                                                            c = c5;
                                                                            z42Var = z42Var2;
                                                                            i3 = i4;
                                                                            f30 = fArr2[i14];
                                                                            f31 = fArr2[i15];
                                                                        }
                                                                    } else {
                                                                        i2 = i5;
                                                                        float f41 = f31;
                                                                        float f42 = f30;
                                                                        if (c4 != 'c' && c4 != 's' && c4 != 'C' && c4 != 'S') {
                                                                            f15 = f42;
                                                                            f14 = f41;
                                                                        } else {
                                                                            f14 = (f41 * 2.0f) - f25;
                                                                            f15 = (f42 * 2.0f) - f24;
                                                                        }
                                                                        int i16 = i2 + 0;
                                                                        int i17 = i2 + 1;
                                                                        int i18 = i2 + 2;
                                                                        int i19 = i2 + 3;
                                                                        path.cubicTo(f15, f14, fArr2[i16], fArr2[i17], fArr2[i18], fArr2[i19]);
                                                                        float f43 = fArr2[i16];
                                                                        float f44 = fArr2[i17];
                                                                        f9 = fArr2[i18];
                                                                        f8 = fArr2[i19];
                                                                        f24 = f43;
                                                                        f25 = f44;
                                                                        f30 = f9;
                                                                        f31 = f8;
                                                                    }
                                                                } else {
                                                                    i2 = i5;
                                                                    f12 = fArr2[i2 + 0];
                                                                    f13 = fArr2[i2 + 1];
                                                                    if (i2 > 0) {
                                                                        path.lineTo(f12, f13);
                                                                    } else {
                                                                        path.moveTo(f12, f13);
                                                                        f28 = f12;
                                                                        f29 = f13;
                                                                    }
                                                                }
                                                                f30 = f28;
                                                                f31 = f29;
                                                            } else {
                                                                i2 = i5;
                                                                int i20 = i2 + 0;
                                                                int i21 = i2 + 1;
                                                                path.lineTo(fArr2[i20], fArr2[i21]);
                                                                f12 = fArr2[i20];
                                                                f13 = fArr2[i21];
                                                            }
                                                            f30 = f12;
                                                            f31 = f13;
                                                        } else {
                                                            i2 = i5;
                                                            f10 = f31;
                                                            int i22 = i2 + 0;
                                                            path.rLineTo(0.0f, fArr2[i22]);
                                                            f11 = fArr2[i22];
                                                        }
                                                        f31 = f10 + f11;
                                                    } else {
                                                        i2 = i5;
                                                        f3 = f31;
                                                        float f45 = f30;
                                                        int i23 = i2 + 0;
                                                        float f46 = fArr2[i23];
                                                        int i24 = i2 + 1;
                                                        int i25 = i2 + 2;
                                                        int i26 = i2 + 3;
                                                        path.rQuadTo(f46, fArr2[i24], fArr2[i25], fArr2[i26]);
                                                        f4 = fArr2[i23] + f45;
                                                        f5 = fArr2[i24] + f3;
                                                        float f47 = f45 + fArr2[i25];
                                                        float f48 = fArr2[i26];
                                                        f6 = f47;
                                                        f7 = f48;
                                                    }
                                                } else {
                                                    i2 = i5;
                                                    int i27 = i2 + 0;
                                                    path.rLineTo(fArr2[i27], 0.0f);
                                                    f30 += fArr2[i27];
                                                }
                                                c = c5;
                                                z42Var = z42Var2;
                                                i3 = i4;
                                            } else {
                                                i2 = i5;
                                                f3 = f31;
                                                float f49 = f30;
                                                int i28 = i2 + 2;
                                                int i29 = i2 + 3;
                                                int i30 = i2 + 4;
                                                int i31 = i2 + 5;
                                                path.rCubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i28], fArr2[i29], fArr2[i30], fArr2[i31]);
                                                f4 = fArr2[i28] + f49;
                                                f5 = fArr2[i29] + f3;
                                                f6 = f49 + fArr2[i30];
                                                f7 = fArr2[i31];
                                            }
                                            f8 = f3 + f7;
                                            f24 = f4;
                                            f25 = f5;
                                            f9 = f6;
                                            f30 = f9;
                                            f31 = f8;
                                            c = c5;
                                            z42Var = z42Var2;
                                            i3 = i4;
                                        } else {
                                            i2 = i5;
                                            float f50 = f31;
                                            float f51 = f30;
                                            int i32 = i2 + 5;
                                            float f52 = fArr2[i32] + f51;
                                            int i33 = i2 + 6;
                                            float f53 = fArr2[i33] + f50;
                                            float f54 = fArr2[i2 + 0];
                                            float f55 = fArr2[i2 + 1];
                                            float f56 = fArr2[i2 + 2];
                                            if (fArr2[i2 + 3] != 0.0f) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            if (fArr2[i2 + 4] != 0.0f) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            c = c5;
                                            z42Var = z42Var2;
                                            i3 = i4;
                                            a(path, f51, f50, f52, f53, f54, f55, f56, z3, z4);
                                            f30 = f51 + fArr2[i32];
                                            f31 = f50 + fArr2[i33];
                                        }
                                    } else {
                                        i2 = i5;
                                        c = c5;
                                        z42Var = z42Var2;
                                        i3 = i4;
                                        int i34 = i2 + 0;
                                        path.lineTo(f30, fArr2[i34]);
                                        f31 = fArr2[i34];
                                    }
                                } else {
                                    i2 = i5;
                                    c = c5;
                                    z42Var = z42Var2;
                                    i3 = i4;
                                    int i35 = i2 + 0;
                                    int i36 = i2 + 1;
                                    int i37 = i2 + 2;
                                    int i38 = i2 + 3;
                                    path.quadTo(fArr2[i35], fArr2[i36], fArr2[i37], fArr2[i38]);
                                    f = fArr2[i35];
                                    f2 = fArr2[i36];
                                    f30 = fArr2[i37];
                                    f31 = fArr2[i38];
                                }
                            } else {
                                i2 = i5;
                                c = c5;
                                z42Var = z42Var2;
                                i3 = i4;
                                int i39 = i2 + 0;
                                path.lineTo(fArr2[i39], f31);
                                f30 = fArr2[i39];
                            }
                            i5 = i2 + i;
                            z42Var2 = z42Var;
                            c4 = c;
                            c5 = c4;
                            i4 = i3;
                            c2 = 'm';
                        } else {
                            i2 = i5;
                            c = c5;
                            z42Var = z42Var2;
                            i3 = i4;
                            int i40 = i2 + 2;
                            int i41 = i2 + 3;
                            int i42 = i2 + 4;
                            int i43 = i2 + 5;
                            path.cubicTo(fArr2[i2 + 0], fArr2[i2 + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                            float f57 = fArr2[i42];
                            float f58 = fArr2[i43];
                            f = fArr2[i40];
                            f30 = f57;
                            f31 = f58;
                            f2 = fArr2[i41];
                        }
                        f24 = f;
                        f25 = f2;
                        i5 = i2 + i;
                        z42Var2 = z42Var;
                        c4 = c;
                        c5 = c4;
                        i4 = i3;
                        c2 = 'm';
                    } else {
                        i2 = i5;
                        float f59 = f31;
                        float f60 = f30;
                        c = c5;
                        z42Var = z42Var2;
                        i3 = i4;
                        int i44 = i2 + 5;
                        float f61 = fArr2[i44];
                        int i45 = i2 + 6;
                        float f62 = fArr2[i45];
                        float f63 = fArr2[i2 + 0];
                        float f64 = fArr2[i2 + 1];
                        float f65 = fArr2[i2 + 2];
                        if (fArr2[i2 + 3] != 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (fArr2[i2 + 4] != 0.0f) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        a(path, f60, f59, f61, f62, f63, f64, f65, z, z2);
                        f30 = fArr2[i44];
                        f31 = fArr2[i45];
                    }
                    f25 = f31;
                    f24 = f30;
                    i5 = i2 + i;
                    z42Var2 = z42Var;
                    c4 = c;
                    c5 = c4;
                    i4 = i3;
                    c2 = 'm';
                }
            }
            int i46 = i4;
            fArr[0] = f30;
            fArr[1] = f31;
            fArr[2] = f24;
            fArr[3] = f25;
            fArr[4] = f28;
            fArr[5] = f29;
            i4 = i46 + 1;
            c4 = z42VarArr[i46].f5423a;
            c2 = 'm';
            c3 = 0;
            z42VarArr2 = z42VarArr;
        }
    }

    public z42(z42 z42Var) {
        this.f5423a = z42Var.f5423a;
        float[] fArr = z42Var.f5424b;
        this.f5424b = ew3.F0(fArr, fArr.length);
    }
}
