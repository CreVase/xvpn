package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes.dex */
public final class bp0 {
    public static final byte[] h = {0, 7, 8, 15};
    public static final byte[] i = {0, 119, -120, -1};
    public static final byte[] j = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f501a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f502b;
    public final Canvas c;
    public final jg0 d;
    public final vo0 e;
    public final ap0 f;
    public Bitmap g;

    public bp0(int i2, int i3) {
        Paint paint = new Paint();
        this.f501a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f502b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.c = new Canvas();
        this.d = new jg0(719, 575, 0, 719, 0, 575);
        this.e = new vo0(0, new int[]{0, -1, -16777216, -8421505}, a(), b());
        this.f = new ap0(i2, i3);
    }

    public static int[] a() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i7 = 1; i7 < 16; i7++) {
            if (i7 < 8) {
                if ((i7 & 1) != 0) {
                    i4 = 255;
                } else {
                    i4 = 0;
                }
                if ((i7 & 2) != 0) {
                    i5 = 255;
                } else {
                    i5 = 0;
                }
                if ((i7 & 4) != 0) {
                    i6 = 255;
                } else {
                    i6 = 0;
                }
                iArr[i7] = c(255, i4, i5, i6);
            } else {
                int i8 = 127;
                if ((i7 & 1) != 0) {
                    i2 = 127;
                } else {
                    i2 = 0;
                }
                if ((i7 & 2) != 0) {
                    i3 = 127;
                } else {
                    i3 = 0;
                }
                if ((i7 & 4) == 0) {
                    i8 = 0;
                }
                iArr[i7] = c(255, i2, i3, i8);
            }
        }
        return iArr;
    }

    public static int[] b() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int[] iArr = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];
        iArr[0] = 0;
        for (int i20 = 0; i20 < 256; i20++) {
            int i21 = 255;
            if (i20 < 8) {
                if ((i20 & 1) != 0) {
                    i18 = 255;
                } else {
                    i18 = 0;
                }
                if ((i20 & 2) != 0) {
                    i19 = 255;
                } else {
                    i19 = 0;
                }
                if ((i20 & 4) == 0) {
                    i21 = 0;
                }
                iArr[i20] = c(63, i18, i19, i21);
            } else {
                int i22 = i20 & Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE;
                int i23 = 170;
                int i24 = 85;
                if (i22 != 0) {
                    if (i22 != 8) {
                        int i25 = 43;
                        if (i22 != 128) {
                            if (i22 == 136) {
                                if ((i20 & 1) != 0) {
                                    i14 = 43;
                                } else {
                                    i14 = 0;
                                }
                                if ((i20 & 16) != 0) {
                                    i15 = 85;
                                } else {
                                    i15 = 0;
                                }
                                int i26 = i14 + i15;
                                if ((i20 & 2) != 0) {
                                    i16 = 43;
                                } else {
                                    i16 = 0;
                                }
                                if ((i20 & 32) != 0) {
                                    i17 = 85;
                                } else {
                                    i17 = 0;
                                }
                                int i27 = i16 + i17;
                                if ((i20 & 4) == 0) {
                                    i25 = 0;
                                }
                                if ((i20 & 64) == 0) {
                                    i24 = 0;
                                }
                                iArr[i20] = c(255, i26, i27, i25 + i24);
                            }
                        } else {
                            if ((i20 & 1) != 0) {
                                i10 = 43;
                            } else {
                                i10 = 0;
                            }
                            int i28 = i10 + 127;
                            if ((i20 & 16) != 0) {
                                i11 = 85;
                            } else {
                                i11 = 0;
                            }
                            int i29 = i28 + i11;
                            if ((i20 & 2) != 0) {
                                i12 = 43;
                            } else {
                                i12 = 0;
                            }
                            int i30 = i12 + 127;
                            if ((i20 & 32) != 0) {
                                i13 = 85;
                            } else {
                                i13 = 0;
                            }
                            int i31 = i30 + i13;
                            if ((i20 & 4) == 0) {
                                i25 = 0;
                            }
                            int i32 = i25 + 127;
                            if ((i20 & 64) == 0) {
                                i24 = 0;
                            }
                            iArr[i20] = c(255, i29, i31, i32 + i24);
                        }
                    } else {
                        if ((i20 & 1) != 0) {
                            i6 = 85;
                        } else {
                            i6 = 0;
                        }
                        if ((i20 & 16) != 0) {
                            i7 = 170;
                        } else {
                            i7 = 0;
                        }
                        int i33 = i6 + i7;
                        if ((i20 & 2) != 0) {
                            i8 = 85;
                        } else {
                            i8 = 0;
                        }
                        if ((i20 & 32) != 0) {
                            i9 = 170;
                        } else {
                            i9 = 0;
                        }
                        int i34 = i8 + i9;
                        if ((i20 & 4) == 0) {
                            i24 = 0;
                        }
                        if ((i20 & 64) == 0) {
                            i23 = 0;
                        }
                        iArr[i20] = c(127, i33, i34, i24 + i23);
                    }
                } else {
                    if ((i20 & 1) != 0) {
                        i2 = 85;
                    } else {
                        i2 = 0;
                    }
                    if ((i20 & 16) != 0) {
                        i3 = 170;
                    } else {
                        i3 = 0;
                    }
                    int i35 = i2 + i3;
                    if ((i20 & 2) != 0) {
                        i4 = 85;
                    } else {
                        i4 = 0;
                    }
                    if ((i20 & 32) != 0) {
                        i5 = 170;
                    } else {
                        i5 = 0;
                    }
                    int i36 = i4 + i5;
                    if ((i20 & 4) == 0) {
                        i24 = 0;
                    }
                    if ((i20 & 64) == 0) {
                        i23 = 0;
                    }
                    iArr[i20] = c(255, i35, i36, i24 + i23);
                }
            }
        }
        return iArr;
    }

    public static int c(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01f2 A[LOOP:6: B:94:0x015d->B:107:0x01f2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013b A[LOOP:5: B:51:0x00a5->B:65:0x013b, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0164  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(byte[] r23, int[] r24, int r25, int r26, int r27, android.graphics.Paint r28, android.graphics.Canvas r29) {
        /*
            Method dump skipped, instructions count: 584
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp0.d(byte[], int[], int, int, int, android.graphics.Paint, android.graphics.Canvas):void");
    }

    public static vo0 e(int i2, nn3 nn3Var) {
        int[] iArr;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = 8;
        int i8 = nn3Var.i(8);
        nn3Var.r(8);
        int i9 = i2 - 2;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] a2 = a();
        int[] b2 = b();
        while (i9 > 0) {
            int i10 = nn3Var.i(i7);
            int i11 = nn3Var.i(i7);
            int i12 = i9 - 2;
            if ((i11 & 128) != 0) {
                iArr = iArr2;
            } else if ((i11 & 64) != 0) {
                iArr = a2;
            } else {
                iArr = b2;
            }
            if ((i11 & 1) != 0) {
                i5 = nn3Var.i(i7);
                i6 = nn3Var.i(i7);
                i3 = nn3Var.i(i7);
                i4 = nn3Var.i(i7);
                i9 = i12 - 4;
            } else {
                int i13 = nn3Var.i(6) << 2;
                int i14 = nn3Var.i(4) << 4;
                i9 = i12 - 2;
                i3 = nn3Var.i(4) << 4;
                i4 = nn3Var.i(2) << 6;
                i5 = i13;
                i6 = i14;
            }
            if (i5 == 0) {
                i6 = 0;
                i3 = 0;
                i4 = 255;
            }
            double d = i5;
            double d2 = i6 - 128;
            double d3 = i3 - 128;
            iArr[i10] = c((byte) (255 - (i4 & 255)), wi3.i((int) ((1.402d * d2) + d), 0, 255), wi3.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), wi3.i((int) ((d3 * 1.772d) + d), 0, 255));
            b2 = b2;
            i8 = i8;
            i7 = 8;
        }
        return new vo0(i8, iArr2, a2, b2);
    }

    public static wo0 f(nn3 nn3Var) {
        byte[] bArr;
        int i2 = nn3Var.i(16);
        nn3Var.r(4);
        int i3 = nn3Var.i(2);
        boolean h2 = nn3Var.h();
        nn3Var.r(1);
        byte[] bArr2 = wi3.f;
        if (i3 == 1) {
            nn3Var.r(nn3Var.i(8) * 16);
        } else if (i3 == 0) {
            int i4 = nn3Var.i(16);
            int i5 = nn3Var.i(16);
            if (i4 > 0) {
                bArr2 = new byte[i4];
                nn3Var.k(bArr2, i4);
            }
            if (i5 > 0) {
                bArr = new byte[i5];
                nn3Var.k(bArr, i5);
                return new wo0(i2, h2, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new wo0(i2, h2, bArr2, bArr);
    }
}
