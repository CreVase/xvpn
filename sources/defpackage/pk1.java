package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class pk1 implements om {

    /* renamed from: a, reason: collision with root package name */
    public final hb1 f3861a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3862b;

    public pk1(int i, ji2 ji2Var) {
        this.f3862b = i;
        this.f3861a = ji2Var;
    }

    public static pk1 b(int i, r42 r42Var) {
        om omVar;
        String str;
        String str2;
        int i2 = 4;
        m20.T(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i3 = r42Var.c;
        int i4 = -2;
        int i5 = 0;
        int i6 = 0;
        while (r42Var.c - r42Var.f4099b > 8) {
            int i7 = r42Var.i();
            int i8 = r42Var.f4099b + r42Var.i();
            r42Var.F(i8);
            if (i7 == 1414744396) {
                omVar = b(r42Var.i(), r42Var);
            } else {
                switch (i7) {
                    case 1718776947:
                        if (i4 == 2) {
                            r42Var.H(i2);
                            int i9 = r42Var.i();
                            int i10 = r42Var.i();
                            r42Var.H(i2);
                            switch (r42Var.i()) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                sn1.f();
                                break;
                            } else {
                                x01 x01Var = new x01();
                                x01Var.p = i9;
                                x01Var.q = i10;
                                x01Var.k = str2;
                                omVar = new p13(new y01(x01Var));
                                break;
                            }
                        } else if (i4 == 1) {
                            int n = r42Var.n();
                            if (n == 1) {
                                str = "audio/raw";
                            } else if (n != 85) {
                                if (n == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (n != 8192) {
                                    if (n != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                sn1.f();
                                break;
                            } else {
                                int n2 = r42Var.n();
                                int i11 = r42Var.i();
                                r42Var.H(6);
                                int r = wi3.r(r42Var.A());
                                int n3 = r42Var.n();
                                byte[] bArr = new byte[n3];
                                r42Var.d(i5, bArr, n3);
                                x01 x01Var2 = new x01();
                                x01Var2.k = str;
                                x01Var2.x = n2;
                                x01Var2.y = i11;
                                if ("audio/raw".equals(str) && r != 0) {
                                    x01Var2.z = r;
                                }
                                if ("audio/mp4a-latm".equals(str) && n3 > 0) {
                                    x01Var2.m = hb1.q(bArr);
                                }
                                omVar = new p13(new y01(x01Var2));
                                break;
                            }
                        } else {
                            wi3.w(i4);
                            sn1.f();
                            break;
                        }
                    case 1751742049:
                        int i12 = r42Var.i();
                        r42Var.H(8);
                        int i13 = r42Var.i();
                        int i14 = r42Var.i();
                        r42Var.H(i2);
                        r42Var.i();
                        r42Var.H(12);
                        omVar = new rm(i12, i13, i14);
                        break;
                    case 1752331379:
                        int i15 = r42Var.i();
                        r42Var.H(12);
                        r42Var.i();
                        int i16 = r42Var.i();
                        int i17 = r42Var.i();
                        r42Var.H(i2);
                        int i18 = r42Var.i();
                        int i19 = r42Var.i();
                        r42Var.H(8);
                        omVar = new sm(i15, i16, i17, i18, i19);
                        break;
                    case 1852994675:
                        omVar = new q13(r42Var.s(r42Var.c - r42Var.f4099b));
                        break;
                }
                omVar = null;
            }
            if (omVar != null) {
                if (omVar.getType() == 1752331379) {
                    int i20 = ((sm) omVar).f4368a;
                    if (i20 != 1935960438) {
                        if (i20 != 1935963489) {
                            if (i20 != 1937012852) {
                                Integer.toHexString(i20);
                                sn1.f();
                                i4 = -1;
                            } else {
                                i4 = 3;
                            }
                        } else {
                            i4 = 1;
                        }
                    } else {
                        i4 = 2;
                    }
                }
                int i21 = i6 + 1;
                if (objArr.length < i21) {
                    objArr = Arrays.copyOf(objArr, pe0.q(objArr.length, i21));
                }
                objArr[i6] = omVar;
                i6 = i21;
            }
            r42Var.G(i8);
            r42Var.F(i3);
            i2 = 4;
            i5 = 0;
        }
        return new pk1(i, hb1.j(i6, objArr));
    }

    public final om a(Class cls) {
        db1 listIterator = this.f3861a.listIterator(0);
        while (listIterator.hasNext()) {
            om omVar = (om) listIterator.next();
            if (omVar.getClass() == cls) {
                return omVar;
            }
        }
        return null;
    }

    @Override // defpackage.om
    public final int getType() {
        return this.f3862b;
    }
}
