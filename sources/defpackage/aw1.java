package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
public final class aw1 implements mn2 {
    public static final int[] o = new int[0];
    public static final Unsafe p = zh3.o();

    /* renamed from: a, reason: collision with root package name */
    public final int[] f351a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f352b;
    public final int c;
    public final int d;
    public final i1 e;
    public final boolean f;
    public final boolean g;
    public final int[] h;
    public final int i;
    public final int j;
    public final zz1 k;
    public final wk1 l;
    public final ih3 m;
    public final aq1 n;

    public aw1(int[] iArr, Object[] objArr, int i, int i2, i1 i1Var, boolean z, int[] iArr2, int i3, int i4, zz1 zz1Var, wk1 wk1Var, ih3 ih3Var, av0 av0Var, aq1 aq1Var) {
        this.f351a = iArr;
        this.f352b = objArr;
        this.c = i;
        this.d = i2;
        this.f = i1Var instanceof m51;
        this.g = z;
        this.h = iArr2;
        this.i = i3;
        this.j = i4;
        this.k = zz1Var;
        this.l = wk1Var;
        this.m = ih3Var;
        this.e = i1Var;
        this.n = aq1Var;
    }

    public static void E(int i, Object obj, v51 v51Var) {
        if (obj instanceof String) {
            ((v10) v51Var.f4780b).I0(i, (String) obj);
        } else {
            v51Var.v(i, (vs) obj);
        }
    }

    public static List k(Object obj, long j) {
        return (List) zh3.n(obj, j);
    }

    public static aw1 o(uv1 uv1Var, zz1 zz1Var, wk1 wk1Var, ih3 ih3Var, av0 av0Var, aq1 aq1Var) {
        if (uv1Var instanceof og2) {
            return p((og2) uv1Var, zz1Var, wk1Var, ih3Var, av0Var, aq1Var);
        }
        p71.C(uv1Var);
        throw null;
    }

    public static aw1 p(og2 og2Var, zz1 zz1Var, wk1 wk1Var, ih3 ih3Var, av0 av0Var, aq1 aq1Var) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int objectFieldOffset;
        int i23;
        int i24;
        int i25;
        Field y;
        char charAt11;
        int i26;
        int i27;
        Field y2;
        Field y3;
        int i28;
        char charAt12;
        int i29;
        char charAt13;
        int i30;
        char charAt14;
        int i31;
        char charAt15;
        char charAt16;
        int i32 = 0;
        boolean z = og2Var.d() == 2;
        String c = og2Var.c();
        int length = c.length();
        int charAt17 = c.charAt(0);
        if (charAt17 >= 55296) {
            int i33 = charAt17 & 8191;
            int i34 = 1;
            int i35 = 13;
            while (true) {
                i = i34 + 1;
                charAt16 = c.charAt(i34);
                if (charAt16 < 55296) {
                    break;
                }
                i33 |= (charAt16 & 8191) << i35;
                i35 += 13;
                i34 = i;
            }
            charAt17 = i33 | (charAt16 << i35);
        } else {
            i = 1;
        }
        int i36 = i + 1;
        int charAt18 = c.charAt(i);
        if (charAt18 >= 55296) {
            int i37 = charAt18 & 8191;
            int i38 = 13;
            while (true) {
                i31 = i36 + 1;
                charAt15 = c.charAt(i36);
                if (charAt15 < 55296) {
                    break;
                }
                i37 |= (charAt15 & 8191) << i38;
                i38 += 13;
                i36 = i31;
            }
            charAt18 = i37 | (charAt15 << i38);
            i36 = i31;
        }
        if (charAt18 == 0) {
            iArr = o;
            i6 = 0;
            i4 = 0;
            charAt = 0;
            i5 = 0;
            charAt2 = 0;
            i3 = 0;
        } else {
            int i39 = i36 + 1;
            int charAt19 = c.charAt(i36);
            if (charAt19 >= 55296) {
                int i40 = charAt19 & 8191;
                int i41 = 13;
                while (true) {
                    i14 = i39 + 1;
                    charAt10 = c.charAt(i39);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i40 |= (charAt10 & 8191) << i41;
                    i41 += 13;
                    i39 = i14;
                }
                charAt19 = i40 | (charAt10 << i41);
                i39 = i14;
            }
            int i42 = i39 + 1;
            int charAt20 = c.charAt(i39);
            if (charAt20 >= 55296) {
                int i43 = charAt20 & 8191;
                int i44 = 13;
                while (true) {
                    i13 = i42 + 1;
                    charAt9 = c.charAt(i42);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i43 |= (charAt9 & 8191) << i44;
                    i44 += 13;
                    i42 = i13;
                }
                charAt20 = i43 | (charAt9 << i44);
                i42 = i13;
            }
            int i45 = i42 + 1;
            int charAt21 = c.charAt(i42);
            if (charAt21 >= 55296) {
                int i46 = charAt21 & 8191;
                int i47 = 13;
                while (true) {
                    i12 = i45 + 1;
                    charAt8 = c.charAt(i45);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i46 |= (charAt8 & 8191) << i47;
                    i47 += 13;
                    i45 = i12;
                }
                charAt21 = i46 | (charAt8 << i47);
                i45 = i12;
            }
            int i48 = i45 + 1;
            charAt = c.charAt(i45);
            if (charAt >= 55296) {
                int i49 = charAt & 8191;
                int i50 = 13;
                while (true) {
                    i11 = i48 + 1;
                    charAt7 = c.charAt(i48);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i49 |= (charAt7 & 8191) << i50;
                    i50 += 13;
                    i48 = i11;
                }
                charAt = i49 | (charAt7 << i50);
                i48 = i11;
            }
            int i51 = i48 + 1;
            int charAt22 = c.charAt(i48);
            if (charAt22 >= 55296) {
                int i52 = charAt22 & 8191;
                int i53 = 13;
                while (true) {
                    i10 = i51 + 1;
                    charAt6 = c.charAt(i51);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i52 |= (charAt6 & 8191) << i53;
                    i53 += 13;
                    i51 = i10;
                }
                charAt22 = i52 | (charAt6 << i53);
                i51 = i10;
            }
            int i54 = i51 + 1;
            charAt2 = c.charAt(i51);
            if (charAt2 >= 55296) {
                int i55 = charAt2 & 8191;
                int i56 = 13;
                while (true) {
                    i9 = i54 + 1;
                    charAt5 = c.charAt(i54);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i55 |= (charAt5 & 8191) << i56;
                    i56 += 13;
                    i54 = i9;
                }
                charAt2 = i55 | (charAt5 << i56);
                i54 = i9;
            }
            int i57 = i54 + 1;
            int charAt23 = c.charAt(i54);
            if (charAt23 >= 55296) {
                int i58 = charAt23 & 8191;
                int i59 = i57;
                int i60 = 13;
                while (true) {
                    i8 = i59 + 1;
                    charAt4 = c.charAt(i59);
                    if (charAt4 < 55296) {
                        break;
                    }
                    i58 |= (charAt4 & 8191) << i60;
                    i60 += 13;
                    i59 = i8;
                }
                charAt23 = i58 | (charAt4 << i60);
                i2 = i8;
            } else {
                i2 = i57;
            }
            int i61 = i2 + 1;
            int charAt24 = c.charAt(i2);
            if (charAt24 >= 55296) {
                int i62 = charAt24 & 8191;
                int i63 = i61;
                int i64 = 13;
                while (true) {
                    i7 = i63 + 1;
                    charAt3 = c.charAt(i63);
                    if (charAt3 < 55296) {
                        break;
                    }
                    i62 |= (charAt3 & 8191) << i64;
                    i64 += 13;
                    i63 = i7;
                }
                charAt24 = i62 | (charAt3 << i64);
                i61 = i7;
            }
            int[] iArr2 = new int[charAt24 + charAt2 + charAt23];
            i3 = (charAt19 * 2) + charAt20;
            i4 = charAt22;
            i5 = charAt24;
            i32 = charAt19;
            i36 = i61;
            int i65 = charAt21;
            iArr = iArr2;
            i6 = i65;
        }
        Object[] b2 = og2Var.b();
        Class<?> cls = og2Var.a().getClass();
        int[] iArr3 = new int[i4 * 3];
        Object[] objArr = new Object[i4 * 2];
        int i66 = charAt2 + i5;
        int i67 = i5;
        int i68 = i66;
        int i69 = 0;
        int i70 = 0;
        while (i36 < length) {
            int i71 = i36 + 1;
            int charAt25 = c.charAt(i36);
            if (charAt25 >= 55296) {
                int i72 = charAt25 & 8191;
                int i73 = i71;
                int i74 = 13;
                while (true) {
                    i30 = i73 + 1;
                    charAt14 = c.charAt(i73);
                    i15 = length;
                    if (charAt14 < 55296) {
                        break;
                    }
                    i72 |= (charAt14 & 8191) << i74;
                    i74 += 13;
                    i73 = i30;
                    length = i15;
                }
                charAt25 = i72 | (charAt14 << i74);
                i16 = i30;
            } else {
                i15 = length;
                i16 = i71;
            }
            int i75 = i16 + 1;
            int charAt26 = c.charAt(i16);
            if (charAt26 >= 55296) {
                int i76 = charAt26 & 8191;
                int i77 = i75;
                int i78 = 13;
                while (true) {
                    i29 = i77 + 1;
                    charAt13 = c.charAt(i77);
                    i17 = i66;
                    if (charAt13 < 55296) {
                        break;
                    }
                    i76 |= (charAt13 & 8191) << i78;
                    i78 += 13;
                    i77 = i29;
                    i66 = i17;
                }
                charAt26 = i76 | (charAt13 << i78);
                i18 = i29;
            } else {
                i17 = i66;
                i18 = i75;
            }
            int i79 = charAt26 & 255;
            int i80 = i5;
            if ((charAt26 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                iArr[i70] = i69;
                i70++;
            }
            boolean z2 = z;
            Unsafe unsafe = p;
            if (i79 >= 51) {
                int i81 = i18 + 1;
                int charAt27 = c.charAt(i18);
                if (charAt27 >= 55296) {
                    int i82 = charAt27 & 8191;
                    int i83 = i81;
                    int i84 = 13;
                    while (true) {
                        i28 = i83 + 1;
                        charAt12 = c.charAt(i83);
                        i19 = charAt;
                        if (charAt12 < 55296) {
                            break;
                        }
                        i82 |= (charAt12 & 8191) << i84;
                        i84 += 13;
                        i83 = i28;
                        charAt = i19;
                    }
                    charAt27 = i82 | (charAt12 << i84);
                    i27 = i28;
                } else {
                    i19 = charAt;
                    i27 = i81;
                }
                int i85 = i79 - 51;
                int i86 = i27;
                if (i85 == 9 || i85 == 17) {
                    objArr[((i69 / 3) * 2) + 1] = b2[i3];
                    i3++;
                } else if (i85 == 12 && (charAt17 & 1) == 1) {
                    objArr[((i69 / 3) * 2) + 1] = b2[i3];
                    i3++;
                }
                int i87 = charAt27 * 2;
                Object obj = b2[i87];
                if (obj instanceof Field) {
                    y2 = (Field) obj;
                } else {
                    y2 = y(cls, (String) obj);
                    b2[i87] = y2;
                }
                int objectFieldOffset2 = (int) unsafe.objectFieldOffset(y2);
                int i88 = i87 + 1;
                Object obj2 = b2[i88];
                if (obj2 instanceof Field) {
                    y3 = (Field) obj2;
                } else {
                    y3 = y(cls, (String) obj2);
                    b2[i88] = y3;
                }
                int objectFieldOffset3 = (int) unsafe.objectFieldOffset(y3);
                i20 = i3;
                objectFieldOffset = objectFieldOffset2;
                i23 = i86;
                i21 = i6;
                i22 = charAt25;
                i25 = objectFieldOffset3;
                i24 = 0;
            } else {
                i19 = charAt;
                i20 = i3 + 1;
                Field y4 = y(cls, (String) b2[i3]);
                if (i79 == 9 || i79 == 17) {
                    i21 = i6;
                    objArr[((i69 / 3) * 2) + 1] = y4.getType();
                } else {
                    if (i79 == 27 || i79 == 49) {
                        i21 = i6;
                        i26 = i20 + 1;
                        objArr[((i69 / 3) * 2) + 1] = b2[i20];
                    } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                        i21 = i6;
                        if ((charAt17 & 1) == 1) {
                            i26 = i20 + 1;
                            objArr[((i69 / 3) * 2) + 1] = b2[i20];
                        }
                    } else {
                        if (i79 == 50) {
                            int i89 = i67 + 1;
                            iArr[i67] = i69;
                            int i90 = (i69 / 3) * 2;
                            int i91 = i20 + 1;
                            objArr[i90] = b2[i20];
                            if ((charAt26 & 2048) != 0) {
                                i20 = i91 + 1;
                                objArr[i90 + 1] = b2[i91];
                                i21 = i6;
                                i67 = i89;
                            } else {
                                i67 = i89;
                                i20 = i91;
                            }
                        }
                        i21 = i6;
                    }
                    i22 = charAt25;
                    i20 = i26;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                    if ((charAt17 & 1) == 1 || i79 > 17) {
                        i23 = i18;
                        i24 = 0;
                        i25 = 0;
                    } else {
                        int i92 = i18 + 1;
                        int charAt28 = c.charAt(i18);
                        if (charAt28 >= 55296) {
                            int i93 = charAt28 & 8191;
                            int i94 = 13;
                            while (true) {
                                i23 = i92 + 1;
                                charAt11 = c.charAt(i92);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i93 |= (charAt11 & 8191) << i94;
                                i94 += 13;
                                i92 = i23;
                            }
                            charAt28 = i93 | (charAt11 << i94);
                        } else {
                            i23 = i92;
                        }
                        int i95 = (charAt28 / 32) + (i32 * 2);
                        Object obj3 = b2[i95];
                        if (obj3 instanceof Field) {
                            y = (Field) obj3;
                        } else {
                            y = y(cls, (String) obj3);
                            b2[i95] = y;
                        }
                        i25 = (int) unsafe.objectFieldOffset(y);
                        i24 = charAt28 % 32;
                    }
                    if (i79 >= 18 && i79 <= 49) {
                        iArr[i68] = objectFieldOffset;
                        i68++;
                    }
                }
                i22 = charAt25;
                objectFieldOffset = (int) unsafe.objectFieldOffset(y4);
                if ((charAt17 & 1) == 1) {
                }
                i23 = i18;
                i24 = 0;
                i25 = 0;
                if (i79 >= 18) {
                    iArr[i68] = objectFieldOffset;
                    i68++;
                }
            }
            int i96 = i69 + 1;
            iArr3[i69] = i22;
            int i97 = i96 + 1;
            iArr3[i96] = ((charAt26 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? 268435456 : 0) | ((charAt26 & 512) != 0 ? 536870912 : 0) | (i79 << 20) | objectFieldOffset;
            i69 = i97 + 1;
            iArr3[i97] = (i24 << 20) | i25;
            i3 = i20;
            i5 = i80;
            i6 = i21;
            length = i15;
            i66 = i17;
            i36 = i23;
            z = z2;
            charAt = i19;
        }
        return new aw1(iArr3, objArr, i6, charAt, og2Var.a(), z, iArr, i5, i66, zz1Var, wk1Var, ih3Var, av0Var, aq1Var);
    }

    public static long q(int i) {
        return i & 1048575;
    }

    public static int r(Object obj, long j) {
        return ((Integer) zh3.n(obj, j)).intValue();
    }

    public static long s(Object obj, long j) {
        return ((Long) zh3.n(obj, j)).longValue();
    }

    public static Field y(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            StringBuilder u = hx2.u("Field ", str, " for ");
            u.append(cls.getName());
            u.append(" not found. Known fields are ");
            u.append(Arrays.toString(declaredFields));
            throw new RuntimeException(u.toString());
        }
    }

    public final void A(Object obj, int i, int i2) {
        zh3.s(obj, this.f351a[i2 + 2] & 1048575, i);
    }

    public final int B(int i) {
        return this.f351a[i + 1];
    }

    public final void C(Object obj, v51 v51Var) {
        int i;
        int[] iArr = this.f351a;
        int length = iArr.length;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4 += 3) {
            int B = B(i4);
            int i5 = iArr[i4];
            int i6 = (267386880 & B) >>> 20;
            boolean z = this.g;
            Unsafe unsafe = p;
            if (!z && i6 <= 17) {
                int i7 = iArr[i4 + 2];
                int i8 = i7 & 1048575;
                if (i8 != i2) {
                    i3 = unsafe.getInt(obj, i8);
                    i2 = i8;
                }
                i = 1 << (i7 >>> 20);
            } else {
                i = 0;
            }
            long j = B & 1048575;
            switch (i6) {
                case 0:
                    if ((i & i3) == 0) {
                        break;
                    } else {
                        v51Var.w(i5, zh3.j(obj, j));
                        continue;
                    }
                case 1:
                    if ((i & i3) != 0) {
                        v51Var.A(i5, zh3.k(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 2:
                    if ((i & i3) != 0) {
                        v51Var.D(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if ((i & i3) != 0) {
                        v51Var.K(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if ((i & i3) != 0) {
                        v51Var.C(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if ((i & i3) != 0) {
                        v51Var.z(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 6:
                    if ((i & i3) != 0) {
                        v51Var.y(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 7:
                    if ((i & i3) != 0) {
                        v51Var.t(i5, zh3.f(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    if ((i & i3) != 0) {
                        E(i5, unsafe.getObject(obj, j), v51Var);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if ((i & i3) != 0) {
                        v51Var.E(i5, f(i4), unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 10:
                    if ((i & i3) != 0) {
                        v51Var.v(i5, (vs) unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 11:
                    if ((i & i3) != 0) {
                        v51Var.J(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if ((i & i3) != 0) {
                        v51Var.x(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if ((i & i3) != 0) {
                        v51Var.F(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 14:
                    if ((i & i3) != 0) {
                        v51Var.G(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 15:
                    if ((i & i3) != 0) {
                        v51Var.H(i5, unsafe.getInt(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if ((i & i3) != 0) {
                        v51Var.I(i5, unsafe.getLong(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if ((i & i3) != 0) {
                        v51Var.B(i5, f(i4), unsafe.getObject(obj, j));
                        break;
                    } else {
                        continue;
                    }
                case 18:
                    sn2.F(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 19:
                    sn2.J(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 20:
                    sn2.M(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 21:
                    sn2.U(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 22:
                    sn2.L(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 23:
                    sn2.I(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 24:
                    sn2.H(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 25:
                    sn2.D(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    continue;
                case 26:
                    sn2.S(iArr[i4], (List) unsafe.getObject(obj, j), v51Var);
                    break;
                case 27:
                    sn2.N(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, f(i4));
                    break;
                case 28:
                    sn2.E(iArr[i4], (List) unsafe.getObject(obj, j), v51Var);
                    break;
                case 29:
                    sn2.T(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    break;
                case 30:
                    sn2.G(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    break;
                case 31:
                    sn2.O(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    break;
                case 32:
                    sn2.P(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    break;
                case 33:
                    sn2.Q(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    break;
                case 34:
                    sn2.R(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, false);
                    break;
                case 35:
                    sn2.F(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 36:
                    sn2.J(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 37:
                    sn2.M(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 38:
                    sn2.U(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 39:
                    sn2.L(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 40:
                    sn2.I(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 41:
                    sn2.H(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 42:
                    sn2.D(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 43:
                    sn2.T(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 44:
                    sn2.G(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 45:
                    sn2.O(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 46:
                    sn2.P(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 47:
                    sn2.Q(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 48:
                    sn2.R(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, true);
                    break;
                case 49:
                    sn2.K(iArr[i4], (List) unsafe.getObject(obj, j), v51Var, f(i4));
                    break;
                case 50:
                    D(v51Var, i5, unsafe.getObject(obj, j), i4);
                    break;
                case 51:
                    if (j(obj, i5, i4)) {
                        v51Var.w(i5, ((Double) zh3.n(obj, j)).doubleValue());
                        break;
                    }
                    break;
                case 52:
                    if (j(obj, i5, i4)) {
                        v51Var.A(i5, ((Float) zh3.n(obj, j)).floatValue());
                        break;
                    }
                    break;
                case 53:
                    if (j(obj, i5, i4)) {
                        v51Var.D(i5, s(obj, j));
                        break;
                    }
                    break;
                case 54:
                    if (j(obj, i5, i4)) {
                        v51Var.K(i5, s(obj, j));
                        break;
                    }
                    break;
                case 55:
                    if (j(obj, i5, i4)) {
                        v51Var.C(i5, r(obj, j));
                        break;
                    }
                    break;
                case 56:
                    if (j(obj, i5, i4)) {
                        v51Var.z(i5, s(obj, j));
                        break;
                    }
                    break;
                case 57:
                    if (j(obj, i5, i4)) {
                        v51Var.y(i5, r(obj, j));
                        break;
                    }
                    break;
                case 58:
                    if (j(obj, i5, i4)) {
                        v51Var.t(i5, ((Boolean) zh3.n(obj, j)).booleanValue());
                        break;
                    }
                    break;
                case 59:
                    if (j(obj, i5, i4)) {
                        E(i5, unsafe.getObject(obj, j), v51Var);
                        break;
                    }
                    break;
                case 60:
                    if (j(obj, i5, i4)) {
                        v51Var.E(i5, f(i4), unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 61:
                    if (j(obj, i5, i4)) {
                        v51Var.v(i5, (vs) unsafe.getObject(obj, j));
                        break;
                    }
                    break;
                case 62:
                    if (j(obj, i5, i4)) {
                        v51Var.J(i5, r(obj, j));
                        break;
                    }
                    break;
                case 63:
                    if (j(obj, i5, i4)) {
                        v51Var.x(i5, r(obj, j));
                        break;
                    }
                    break;
                case 64:
                    if (j(obj, i5, i4)) {
                        v51Var.F(i5, r(obj, j));
                        break;
                    }
                    break;
                case 65:
                    if (j(obj, i5, i4)) {
                        v51Var.G(i5, s(obj, j));
                        break;
                    }
                    break;
                case 66:
                    if (j(obj, i5, i4)) {
                        v51Var.H(i5, r(obj, j));
                        break;
                    }
                    break;
                case 67:
                    if (j(obj, i5, i4)) {
                        v51Var.I(i5, s(obj, j));
                        break;
                    }
                    break;
                case 68:
                    if (j(obj, i5, i4)) {
                        v51Var.B(i5, f(i4), unsafe.getObject(obj, j));
                        break;
                    }
                    break;
            }
        }
        this.m.getClass();
        ((m51) obj).unknownFields.d(v51Var);
    }

    public final void D(v51 v51Var, int i, Object obj, int i2) {
        if (obj != null) {
            Object obj2 = this.f352b[(i2 / 3) * 2];
            this.n.getClass();
            eb3 eb3Var = ((sp1) obj2).f4392a;
            ((v10) v51Var.f4780b).getClass();
            for (Map.Entry entry : ((xp1) obj).entrySet()) {
                ((v10) v51Var.f4780b).K0(i, 2);
                ((v10) v51Var.f4780b).M0(sp1.a(eb3Var, entry.getKey(), entry.getValue()));
                v10 v10Var = (v10) v51Var.f4780b;
                Object key = entry.getKey();
                Object value = entry.getValue();
                xw0.b(v10Var, (lr3) eb3Var.f1907a, 1, key);
                xw0.b(v10Var, (lr3) eb3Var.c, 2, value);
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x006a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:29:0x05c8 A[Catch: all -> 0x0524, TryCatch #1 {all -> 0x0524, blocks: (B:52:0x0072, B:53:0x05a9, B:12:0x05ae, B:27:0x05c3, B:29:0x05c8, B:31:0x05cf, B:33:0x05d6, B:78:0x0229, B:79:0x0233, B:80:0x0243, B:81:0x0252, B:82:0x0261, B:83:0x0270, B:84:0x0285, B:85:0x0294, B:86:0x02a3, B:87:0x02b2, B:88:0x02c1, B:89:0x02d0, B:90:0x02df, B:91:0x02ee, B:92:0x02fd, B:93:0x030c, B:94:0x031b, B:95:0x032a, B:96:0x0339, B:97:0x0348, B:98:0x035d, B:99:0x036c, B:100:0x037b, B:101:0x038f, B:102:0x0397, B:103:0x03a6, B:104:0x03b5, B:105:0x03c4, B:106:0x03d3, B:107:0x03e2, B:108:0x03f1, B:109:0x0400, B:110:0x040f, B:112:0x0418, B:113:0x0435, B:114:0x0449, B:115:0x045b, B:116:0x046d, B:117:0x047f, B:118:0x0491, B:119:0x04a7, B:120:0x04b9, B:121:0x04cb, B:123:0x04d4, B:124:0x04f1, B:125:0x0505, B:126:0x0510, B:127:0x0527, B:128:0x0539, B:129:0x054b, B:130:0x055d, B:131:0x056f, B:132:0x0581, B:133:0x0594), top: B:51:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x05dc A[SYNTHETIC] */
    @Override // defpackage.mn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(java.lang.Object r18, defpackage.tg2 r19, defpackage.yu0 r20) {
        /*
            Method dump skipped, instructions count: 1692
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw1.a(java.lang.Object, tg2, yu0):void");
    }

    @Override // defpackage.mn2
    public final void b(Object obj, v51 v51Var) {
        v51Var.getClass();
        if (this.g) {
            int[] iArr = this.f351a;
            int length = iArr.length;
            for (int i = 0; i < length; i += 3) {
                int B = B(i);
                int i2 = iArr[i];
                switch ((267386880 & B) >>> 20) {
                    case 0:
                        if (i(obj, i)) {
                            v51Var.w(i2, zh3.j(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (i(obj, i)) {
                            v51Var.A(i2, zh3.k(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (i(obj, i)) {
                            v51Var.D(i2, zh3.m(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (i(obj, i)) {
                            v51Var.K(i2, zh3.m(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (i(obj, i)) {
                            v51Var.C(i2, zh3.l(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (i(obj, i)) {
                            v51Var.z(i2, zh3.m(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (i(obj, i)) {
                            v51Var.y(i2, zh3.l(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (i(obj, i)) {
                            v51Var.t(i2, zh3.f(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (i(obj, i)) {
                            E(i2, zh3.n(obj, B & 1048575), v51Var);
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (i(obj, i)) {
                            v51Var.E(i2, f(i), zh3.n(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (i(obj, i)) {
                            v51Var.v(i2, (vs) zh3.n(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (i(obj, i)) {
                            v51Var.J(i2, zh3.l(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (i(obj, i)) {
                            v51Var.x(i2, zh3.l(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (i(obj, i)) {
                            v51Var.F(i2, zh3.l(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (i(obj, i)) {
                            v51Var.G(i2, zh3.m(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (i(obj, i)) {
                            v51Var.H(i2, zh3.l(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (i(obj, i)) {
                            v51Var.I(i2, zh3.m(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (i(obj, i)) {
                            v51Var.B(i2, f(i), zh3.n(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        sn2.F(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 19:
                        sn2.J(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 20:
                        sn2.M(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 21:
                        sn2.U(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 22:
                        sn2.L(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 23:
                        sn2.I(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 24:
                        sn2.H(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 25:
                        sn2.D(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 26:
                        sn2.S(i2, (List) zh3.n(obj, B & 1048575), v51Var);
                        break;
                    case 27:
                        sn2.N(i2, (List) zh3.n(obj, B & 1048575), v51Var, f(i));
                        break;
                    case 28:
                        sn2.E(i2, (List) zh3.n(obj, B & 1048575), v51Var);
                        break;
                    case 29:
                        sn2.T(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 30:
                        sn2.G(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 31:
                        sn2.O(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 32:
                        sn2.P(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 33:
                        sn2.Q(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 34:
                        sn2.R(i2, (List) zh3.n(obj, B & 1048575), v51Var, false);
                        break;
                    case 35:
                        sn2.F(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 36:
                        sn2.J(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 37:
                        sn2.M(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 38:
                        sn2.U(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 39:
                        sn2.L(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 40:
                        sn2.I(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 41:
                        sn2.H(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 42:
                        sn2.D(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 43:
                        sn2.T(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 44:
                        sn2.G(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 45:
                        sn2.O(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 46:
                        sn2.P(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 47:
                        sn2.Q(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 48:
                        sn2.R(i2, (List) zh3.n(obj, B & 1048575), v51Var, true);
                        break;
                    case 49:
                        sn2.K(i2, (List) zh3.n(obj, B & 1048575), v51Var, f(i));
                        break;
                    case 50:
                        D(v51Var, i2, zh3.n(obj, B & 1048575), i);
                        break;
                    case 51:
                        if (j(obj, i2, i)) {
                            v51Var.w(i2, ((Double) zh3.n(obj, B & 1048575)).doubleValue());
                            break;
                        } else {
                            break;
                        }
                    case 52:
                        if (j(obj, i2, i)) {
                            v51Var.A(i2, ((Float) zh3.n(obj, B & 1048575)).floatValue());
                            break;
                        } else {
                            break;
                        }
                    case 53:
                        if (j(obj, i2, i)) {
                            v51Var.D(i2, s(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 54:
                        if (j(obj, i2, i)) {
                            v51Var.K(i2, s(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 55:
                        if (j(obj, i2, i)) {
                            v51Var.C(i2, r(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (j(obj, i2, i)) {
                            v51Var.z(i2, s(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (j(obj, i2, i)) {
                            v51Var.y(i2, r(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (j(obj, i2, i)) {
                            v51Var.t(i2, ((Boolean) zh3.n(obj, B & 1048575)).booleanValue());
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (j(obj, i2, i)) {
                            E(i2, zh3.n(obj, B & 1048575), v51Var);
                            break;
                        } else {
                            break;
                        }
                    case 60:
                        if (j(obj, i2, i)) {
                            v51Var.E(i2, f(i), zh3.n(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 61:
                        if (j(obj, i2, i)) {
                            v51Var.v(i2, (vs) zh3.n(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (j(obj, i2, i)) {
                            v51Var.J(i2, r(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 63:
                        if (j(obj, i2, i)) {
                            v51Var.x(i2, r(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (j(obj, i2, i)) {
                            v51Var.F(i2, r(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (j(obj, i2, i)) {
                            v51Var.G(i2, s(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 66:
                        if (j(obj, i2, i)) {
                            v51Var.H(i2, r(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 67:
                        if (j(obj, i2, i)) {
                            v51Var.I(i2, s(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (j(obj, i2, i)) {
                            v51Var.B(i2, f(i), zh3.n(obj, B & 1048575));
                            break;
                        } else {
                            break;
                        }
                }
            }
            this.m.getClass();
            ((m51) obj).unknownFields.d(v51Var);
            return;
        }
        C(obj, v51Var);
    }

    public final boolean c(Object obj, Object obj2, int i) {
        if (i(obj, i) == i(obj2, i)) {
            return true;
        }
        return false;
    }

    public final void d(Object obj, int i, Object obj2) {
        int i2 = this.f351a[i];
        if (zh3.n(obj, B(i) & 1048575) == null) {
            return;
        }
        e(i);
    }

    public final void e(int i) {
        p71.C(this.f352b[((i / 3) * 2) + 1]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:            if (defpackage.sn2.C(defpackage.zh3.n(r11, r7), defpackage.zh3.n(r12, r7)) != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:            if (defpackage.sn2.C(defpackage.zh3.n(r11, r7), defpackage.zh3.n(r12, r7)) != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:            if (defpackage.zh3.m(r11, r7) == defpackage.zh3.m(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:            if (defpackage.zh3.l(r11, r7) == defpackage.zh3.l(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:            if (defpackage.zh3.m(r11, r7) == defpackage.zh3.m(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bb, code lost:            if (defpackage.zh3.l(r11, r7) == defpackage.zh3.l(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00cd, code lost:            if (defpackage.zh3.l(r11, r7) == defpackage.zh3.l(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00df, code lost:            if (defpackage.zh3.l(r11, r7) == defpackage.zh3.l(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00f5, code lost:            if (defpackage.sn2.C(defpackage.zh3.n(r11, r7), defpackage.zh3.n(r12, r7)) != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x010b, code lost:            if (defpackage.sn2.C(defpackage.zh3.n(r11, r7), defpackage.zh3.n(r12, r7)) != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0121, code lost:            if (defpackage.sn2.C(defpackage.zh3.n(r11, r7), defpackage.zh3.n(r12, r7)) != false) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0133, code lost:            if (defpackage.zh3.f(r11, r7) == defpackage.zh3.f(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0145, code lost:            if (defpackage.zh3.l(r11, r7) == defpackage.zh3.l(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0159, code lost:            if (defpackage.zh3.m(r11, r7) == defpackage.zh3.m(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016b, code lost:            if (defpackage.zh3.l(r11, r7) == defpackage.zh3.l(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x017e, code lost:            if (defpackage.zh3.m(r11, r7) == defpackage.zh3.m(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0191, code lost:            if (defpackage.zh3.m(r11, r7) == defpackage.zh3.m(r12, r7)) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01aa, code lost:            if (java.lang.Float.floatToIntBits(defpackage.zh3.k(r11, r7)) == java.lang.Float.floatToIntBits(defpackage.zh3.k(r12, r7))) goto L109;     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x01c5, code lost:            if (java.lang.Double.doubleToLongBits(defpackage.zh3.j(r11, r7)) == java.lang.Double.doubleToLongBits(defpackage.zh3.j(r12, r7))) goto L109;     */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01cc A[LOOP:0: B:2:0x0005->B:89:0x01cc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01cb A[SYNTHETIC] */
    @Override // defpackage.mn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw1.equals(java.lang.Object, java.lang.Object):boolean");
    }

    public final mn2 f(int i) {
        int i2 = (i / 3) * 2;
        Object[] objArr = this.f352b;
        mn2 mn2Var = (mn2) objArr[i2];
        if (mn2Var != null) {
            return mn2Var;
        }
        mn2 a2 = ka2.c.a((Class) objArr[i2 + 1]);
        objArr[i2] = a2;
        return a2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x0035. Please report as an issue. */
    public final int g(Object obj) {
        int i;
        int a0;
        int n0;
        int i2;
        int p0;
        int r0;
        int i3 = -1;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.f351a;
            if (i4 < iArr.length) {
                int B = B(i4);
                int i7 = iArr[i4];
                int i8 = (267386880 & B) >>> 20;
                Unsafe unsafe = p;
                if (i8 <= 17) {
                    int i9 = iArr[i4 + 2];
                    int i10 = i9 & 1048575;
                    i = 1 << (i9 >>> 20);
                    if (i10 != i3) {
                        i6 = unsafe.getInt(obj, i10);
                        i3 = i10;
                    }
                } else {
                    i = 0;
                }
                long j = B & 1048575;
                switch (i8) {
                    case 0:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.a0(i7);
                            i5 += a0;
                            break;
                        }
                    case 1:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.e0(i7);
                            i5 += a0;
                            break;
                        }
                    case 2:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.i0(i7, unsafe.getLong(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 3:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.s0(i7, unsafe.getLong(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 4:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.g0(i7, unsafe.getInt(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 5:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.d0(i7);
                            i5 += a0;
                            break;
                        }
                    case 6:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.c0(i7);
                            i5 += a0;
                            break;
                        }
                    case 7:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.Y(i7);
                            i5 += a0;
                            break;
                        }
                    case 8:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            Object object = unsafe.getObject(obj, j);
                            if (object instanceof vs) {
                                n0 = v10.Z(i7, (vs) object);
                            } else {
                                n0 = v10.n0(i7, (String) object);
                            }
                            i5 = n0 + i5;
                            break;
                        }
                    case 9:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = sn2.o(i7, f(i4), unsafe.getObject(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 10:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.Z(i7, (vs) unsafe.getObject(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 11:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.q0(i7, unsafe.getInt(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 12:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.b0(i7, unsafe.getInt(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 13:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.j0(i7);
                            i5 += a0;
                            break;
                        }
                    case 14:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.k0(i7);
                            i5 += a0;
                            break;
                        }
                    case 15:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.l0(i7, unsafe.getInt(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 16:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.m0(i7, unsafe.getLong(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 17:
                        if ((i & i6) == 0) {
                            break;
                        } else {
                            a0 = v10.f0(i7, (i1) unsafe.getObject(obj, j), f(i4));
                            i5 += a0;
                            break;
                        }
                    case 18:
                        a0 = sn2.h(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 19:
                        a0 = sn2.f(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 20:
                        a0 = sn2.m(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 21:
                        a0 = sn2.x(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 22:
                        a0 = sn2.k(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 23:
                        a0 = sn2.h(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 24:
                        a0 = sn2.f(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 25:
                        a0 = sn2.a(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 26:
                        a0 = sn2.u(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 27:
                        a0 = sn2.p(i7, (List) unsafe.getObject(obj, j), f(i4));
                        i5 += a0;
                        break;
                    case 28:
                        a0 = sn2.c(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 29:
                        a0 = sn2.v(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 30:
                        a0 = sn2.d(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 31:
                        a0 = sn2.f(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 32:
                        a0 = sn2.h(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 33:
                        a0 = sn2.q(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 34:
                        a0 = sn2.s(i7, (List) unsafe.getObject(obj, j));
                        i5 += a0;
                        break;
                    case 35:
                        i2 = sn2.i((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 36:
                        i2 = sn2.g((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 37:
                        i2 = sn2.n((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 38:
                        i2 = sn2.y((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 39:
                        i2 = sn2.l((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 40:
                        i2 = sn2.i((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 41:
                        i2 = sn2.g((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 42:
                        i2 = sn2.b((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 43:
                        i2 = sn2.w((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 44:
                        i2 = sn2.e((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 45:
                        i2 = sn2.g((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 46:
                        i2 = sn2.i((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 47:
                        i2 = sn2.r((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 48:
                        i2 = sn2.t((List) unsafe.getObject(obj, j));
                        if (i2 <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i7);
                            r0 = v10.r0(i2);
                            i5 = r0 + p0 + i2 + i5;
                            break;
                        }
                    case 49:
                        a0 = sn2.j(i7, (List) unsafe.getObject(obj, j), f(i4));
                        i5 += a0;
                        break;
                    case 50:
                        Object object2 = unsafe.getObject(obj, j);
                        Object obj2 = this.f352b[(i4 / 3) * 2];
                        this.n.getClass();
                        a0 = aq1.a(i7, object2, obj2);
                        i5 += a0;
                        break;
                    case 51:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.a0(i7);
                            i5 += a0;
                            break;
                        }
                    case 52:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.e0(i7);
                            i5 += a0;
                            break;
                        }
                    case 53:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.i0(i7, s(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 54:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.s0(i7, s(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 55:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.g0(i7, r(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 56:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.d0(i7);
                            i5 += a0;
                            break;
                        }
                    case 57:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.c0(i7);
                            i5 += a0;
                            break;
                        }
                    case 58:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.Y(i7);
                            i5 += a0;
                            break;
                        }
                    case 59:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            Object object3 = unsafe.getObject(obj, j);
                            if (object3 instanceof vs) {
                                n0 = v10.Z(i7, (vs) object3);
                            } else {
                                n0 = v10.n0(i7, (String) object3);
                            }
                            i5 = n0 + i5;
                            break;
                        }
                    case 60:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = sn2.o(i7, f(i4), unsafe.getObject(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 61:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.Z(i7, (vs) unsafe.getObject(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 62:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.q0(i7, r(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 63:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.b0(i7, r(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 64:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.j0(i7);
                            i5 += a0;
                            break;
                        }
                    case 65:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.k0(i7);
                            i5 += a0;
                            break;
                        }
                    case 66:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.l0(i7, r(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 67:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.m0(i7, s(obj, j));
                            i5 += a0;
                            break;
                        }
                    case 68:
                        if (!j(obj, i7, i4)) {
                            break;
                        } else {
                            a0 = v10.f0(i7, (i1) unsafe.getObject(obj, j), f(i4));
                            i5 += a0;
                            break;
                        }
                }
                i4 += 3;
            } else {
                this.m.getClass();
                return ((m51) obj).unknownFields.a() + i5;
            }
        }
    }

    @Override // defpackage.mn2
    public final int getSerializedSize(Object obj) {
        if (this.g) {
            return h(obj);
        }
        return g(obj);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:10:0x002d. Please report as an issue. */
    public final int h(Object obj) {
        int a0;
        int n0;
        int i;
        int p0;
        int r0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int[] iArr = this.f351a;
            if (i2 < iArr.length) {
                int B = B(i2);
                int i4 = (267386880 & B) >>> 20;
                int i5 = iArr[i2];
                long j = B & 1048575;
                if (i4 >= bx0.f544b.a() && i4 <= bx0.c.a()) {
                    int i6 = iArr[i2 + 2];
                }
                Unsafe unsafe = p;
                switch (i4) {
                    case 0:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.a0(i5);
                            i3 += a0;
                            break;
                        }
                    case 1:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.e0(i5);
                            i3 += a0;
                            break;
                        }
                    case 2:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.i0(i5, zh3.m(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 3:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.s0(i5, zh3.m(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 4:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.g0(i5, zh3.l(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 5:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.d0(i5);
                            i3 += a0;
                            break;
                        }
                    case 6:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.c0(i5);
                            i3 += a0;
                            break;
                        }
                    case 7:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.Y(i5);
                            i3 += a0;
                            break;
                        }
                    case 8:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            Object n = zh3.n(obj, j);
                            if (n instanceof vs) {
                                n0 = v10.Z(i5, (vs) n);
                            } else {
                                n0 = v10.n0(i5, (String) n);
                            }
                            i3 = n0 + i3;
                            break;
                        }
                    case 9:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = sn2.o(i5, f(i2), zh3.n(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 10:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.Z(i5, (vs) zh3.n(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 11:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.q0(i5, zh3.l(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 12:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.b0(i5, zh3.l(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 13:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.j0(i5);
                            i3 += a0;
                            break;
                        }
                    case 14:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.k0(i5);
                            i3 += a0;
                            break;
                        }
                    case 15:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.l0(i5, zh3.l(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 16:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.m0(i5, zh3.m(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 17:
                        if (!i(obj, i2)) {
                            break;
                        } else {
                            a0 = v10.f0(i5, (i1) zh3.n(obj, j), f(i2));
                            i3 += a0;
                            break;
                        }
                    case 18:
                        a0 = sn2.h(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 19:
                        a0 = sn2.f(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 20:
                        a0 = sn2.m(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 21:
                        a0 = sn2.x(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 22:
                        a0 = sn2.k(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 23:
                        a0 = sn2.h(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 24:
                        a0 = sn2.f(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 25:
                        a0 = sn2.a(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 26:
                        a0 = sn2.u(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 27:
                        a0 = sn2.p(i5, k(obj, j), f(i2));
                        i3 += a0;
                        break;
                    case 28:
                        a0 = sn2.c(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 29:
                        a0 = sn2.v(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 30:
                        a0 = sn2.d(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 31:
                        a0 = sn2.f(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 32:
                        a0 = sn2.h(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 33:
                        a0 = sn2.q(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 34:
                        a0 = sn2.s(i5, k(obj, j));
                        i3 += a0;
                        break;
                    case 35:
                        i = sn2.i((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 36:
                        i = sn2.g((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 37:
                        i = sn2.n((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 38:
                        i = sn2.y((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 39:
                        i = sn2.l((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 40:
                        i = sn2.i((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 41:
                        i = sn2.g((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 42:
                        i = sn2.b((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 43:
                        i = sn2.w((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 44:
                        i = sn2.e((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 45:
                        i = sn2.g((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 46:
                        i = sn2.i((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 47:
                        i = sn2.r((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 48:
                        i = sn2.t((List) unsafe.getObject(obj, j));
                        if (i <= 0) {
                            break;
                        } else {
                            p0 = v10.p0(i5);
                            r0 = v10.r0(i);
                            i3 = r0 + p0 + i + i3;
                            break;
                        }
                    case 49:
                        a0 = sn2.j(i5, k(obj, j), f(i2));
                        i3 += a0;
                        break;
                    case 50:
                        Object n2 = zh3.n(obj, j);
                        Object obj2 = this.f352b[(i2 / 3) * 2];
                        this.n.getClass();
                        a0 = aq1.a(i5, n2, obj2);
                        i3 += a0;
                        break;
                    case 51:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.a0(i5);
                            i3 += a0;
                            break;
                        }
                    case 52:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.e0(i5);
                            i3 += a0;
                            break;
                        }
                    case 53:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.i0(i5, s(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 54:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.s0(i5, s(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 55:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.g0(i5, r(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 56:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.d0(i5);
                            i3 += a0;
                            break;
                        }
                    case 57:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.c0(i5);
                            i3 += a0;
                            break;
                        }
                    case 58:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.Y(i5);
                            i3 += a0;
                            break;
                        }
                    case 59:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            Object n3 = zh3.n(obj, j);
                            if (n3 instanceof vs) {
                                n0 = v10.Z(i5, (vs) n3);
                            } else {
                                n0 = v10.n0(i5, (String) n3);
                            }
                            i3 = n0 + i3;
                            break;
                        }
                    case 60:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = sn2.o(i5, f(i2), zh3.n(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 61:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.Z(i5, (vs) zh3.n(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 62:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.q0(i5, r(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 63:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.b0(i5, r(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 64:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.j0(i5);
                            i3 += a0;
                            break;
                        }
                    case 65:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.k0(i5);
                            i3 += a0;
                            break;
                        }
                    case 66:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.l0(i5, r(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 67:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.m0(i5, s(obj, j));
                            i3 += a0;
                            break;
                        }
                    case 68:
                        if (!j(obj, i5, i2)) {
                            break;
                        } else {
                            a0 = v10.f0(i5, (i1) zh3.n(obj, j), f(i2));
                            i3 += a0;
                            break;
                        }
                }
                i2 += 3;
            } else {
                this.m.getClass();
                return ((m51) obj).unknownFields.a() + i3;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f2, code lost:            if (r4 != false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:            if (r4 != false) goto L85;     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01f5, code lost:            r8 = 1237;     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01f7, code lost:            r4 = r8;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x001b. Please report as an issue. */
    @Override // defpackage.mn2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int hashCode(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 742
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aw1.hashCode(java.lang.Object):int");
    }

    public final boolean i(Object obj, int i) {
        boolean equals;
        if (this.g) {
            int B = B(i);
            long j = B & 1048575;
            switch ((B & 267386880) >>> 20) {
                case 0:
                    if (zh3.j(obj, j) == 0.0d) {
                        return false;
                    }
                    return true;
                case 1:
                    if (zh3.k(obj, j) == 0.0f) {
                        return false;
                    }
                    return true;
                case 2:
                    if (zh3.m(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 3:
                    if (zh3.m(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 4:
                    if (zh3.l(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 5:
                    if (zh3.m(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 6:
                    if (zh3.l(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 7:
                    return zh3.f(obj, j);
                case 8:
                    Object n = zh3.n(obj, j);
                    if (n instanceof String) {
                        equals = ((String) n).isEmpty();
                        break;
                    } else if (n instanceof vs) {
                        equals = vs.f4885b.equals(n);
                        break;
                    } else {
                        throw new IllegalArgumentException();
                    }
                case 9:
                    if (zh3.n(obj, j) == null) {
                        return false;
                    }
                    return true;
                case 10:
                    equals = vs.f4885b.equals(zh3.n(obj, j));
                    break;
                case 11:
                    if (zh3.l(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 12:
                    if (zh3.l(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 13:
                    if (zh3.l(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 14:
                    if (zh3.m(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 15:
                    if (zh3.l(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 16:
                    if (zh3.m(obj, j) == 0) {
                        return false;
                    }
                    return true;
                case 17:
                    if (zh3.n(obj, j) == null) {
                        return false;
                    }
                    return true;
                default:
                    throw new IllegalArgumentException();
            }
            return !equals;
        }
        if ((zh3.l(obj, r8 & 1048575) & (1 << (this.f351a[i + 2] >>> 20))) == 0) {
            return false;
        }
        return true;
    }

    @Override // defpackage.mn2
    public final boolean isInitialized(Object obj) {
        int i;
        boolean z;
        boolean z2;
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            boolean z3 = true;
            if (i3 >= this.i) {
                return true;
            }
            int i5 = this.h[i3];
            int[] iArr = this.f351a;
            int i6 = iArr[i5];
            int B = B(i5);
            boolean z4 = this.g;
            if (!z4) {
                int i7 = iArr[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i4 = p.getInt(obj, i8);
                    i2 = i8;
                }
            } else {
                i = 0;
            }
            if ((268435456 & B) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (z4) {
                    z2 = i(obj, i5);
                } else if ((i4 & i) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return false;
                }
            }
            int i9 = (267386880 & B) >>> 20;
            if (i9 != 9 && i9 != 17) {
                if (i9 != 27) {
                    if (i9 != 60 && i9 != 68) {
                        if (i9 != 49) {
                            if (i9 != 50) {
                                continue;
                            } else {
                                Object n = zh3.n(obj, B & 1048575);
                                this.n.getClass();
                                xp1 xp1Var = (xp1) n;
                                if (!xp1Var.isEmpty()) {
                                    if (((lr3) ((sp1) this.f352b[(i5 / 3) * 2]).f4392a.c).f3180a == nr3.MESSAGE) {
                                        Iterator it = xp1Var.values().iterator();
                                        mn2 mn2Var = null;
                                        while (true) {
                                            if (!it.hasNext()) {
                                                break;
                                            }
                                            Object next = it.next();
                                            if (mn2Var == null) {
                                                mn2Var = ka2.c.a(next.getClass());
                                            }
                                            if (!mn2Var.isInitialized(next)) {
                                                z3 = false;
                                                break;
                                            }
                                        }
                                    }
                                }
                                if (!z3) {
                                    return false;
                                }
                            }
                        }
                    } else if (j(obj, i6, i5) && !f(i5).isInitialized(zh3.n(obj, B & 1048575))) {
                        return false;
                    }
                }
                List list = (List) zh3.n(obj, B & 1048575);
                if (!list.isEmpty()) {
                    mn2 f = f(i5);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            break;
                        }
                        if (!f.isInitialized(list.get(i10))) {
                            z3 = false;
                            break;
                        }
                        i10++;
                    }
                }
                if (!z3) {
                    return false;
                }
            } else {
                if (z4) {
                    z3 = i(obj, i5);
                } else if ((i & i4) == 0) {
                    z3 = false;
                }
                if (z3 && !f(i5).isInitialized(zh3.n(obj, B & 1048575))) {
                    return false;
                }
            }
            i3++;
        }
    }

    public final boolean j(Object obj, int i, int i2) {
        if (zh3.l(obj, this.f351a[i2 + 2] & 1048575) == i) {
            return true;
        }
        return false;
    }

    public final void l(Object obj, int i, Object obj2, yu0 yu0Var, tg2 tg2Var) {
        long B = B(i) & 1048575;
        Object n = zh3.n(obj, B);
        aq1 aq1Var = this.n;
        if (n == null) {
            aq1Var.getClass();
            n = xp1.f5200b.c();
            zh3.u(obj, B, n);
        } else {
            aq1Var.getClass();
            if (!((xp1) n).f5201a) {
                Object c = xp1.f5200b.c();
                aq1.b(c, n);
                zh3.u(obj, B, c);
                n = c;
            }
        }
        aq1Var.getClass();
        tg2Var.b((xp1) n, ((sp1) obj2).f4392a, yu0Var);
    }

    public final void m(Object obj, Object obj2, int i) {
        long B = B(i) & 1048575;
        if (!i(obj2, i)) {
            return;
        }
        Object n = zh3.n(obj, B);
        Object n2 = zh3.n(obj2, B);
        if (n != null && n2 != null) {
            zh3.u(obj, B, yd1.b(n, n2));
            z(obj, i);
        } else if (n2 != null) {
            zh3.u(obj, B, n2);
            z(obj, i);
        }
    }

    @Override // defpackage.mn2
    public final void makeImmutable(Object obj) {
        int[] iArr;
        int i;
        int i2 = this.i;
        while (true) {
            iArr = this.h;
            i = this.j;
            if (i2 >= i) {
                break;
            }
            long B = B(iArr[i2]) & 1048575;
            Object n = zh3.n(obj, B);
            if (n != null) {
                this.n.getClass();
                ((xp1) n).f5201a = false;
                zh3.u(obj, B, n);
            }
            i2++;
        }
        int length = iArr.length;
        while (i < length) {
            this.l.a(obj, iArr[i]);
            i++;
        }
        this.m.getClass();
        ((m51) obj).unknownFields.e = false;
    }

    @Override // defpackage.mn2
    public final void mergeFrom(Object obj, Object obj2) {
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.f351a;
            if (i < iArr.length) {
                int B = B(i);
                long j = 1048575 & B;
                int i2 = iArr[i];
                switch ((B & 267386880) >>> 20) {
                    case 0:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.d.m(obj, j, zh3.j(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 1:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.d.n(obj, j, zh3.k(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 2:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.t(obj, j, zh3.m(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 3:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.t(obj, j, zh3.m(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 4:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.s(obj, j, zh3.l(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 5:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.t(obj, j, zh3.m(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 6:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.s(obj, j, zh3.l(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 7:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.d.k(obj, j, zh3.f(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 8:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.u(obj, j, zh3.n(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 9:
                        m(obj, obj2, i);
                        break;
                    case 10:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.u(obj, j, zh3.n(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 11:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.s(obj, j, zh3.l(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 12:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.s(obj, j, zh3.l(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 13:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.s(obj, j, zh3.l(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 14:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.t(obj, j, zh3.m(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 15:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.s(obj, j, zh3.l(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 16:
                        if (!i(obj2, i)) {
                            break;
                        } else {
                            zh3.t(obj, j, zh3.m(obj2, j));
                            z(obj, i);
                            break;
                        }
                    case 17:
                        m(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.l.b(obj, obj2, j);
                        break;
                    case 50:
                        Class cls = sn2.f4380a;
                        Object n = zh3.n(obj, j);
                        Object n2 = zh3.n(obj2, j);
                        this.n.getClass();
                        zh3.u(obj, j, aq1.b(n, n2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!j(obj2, i2, i)) {
                            break;
                        } else {
                            zh3.u(obj, j, zh3.n(obj2, j));
                            A(obj, i2, i);
                            break;
                        }
                    case 60:
                        n(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!j(obj2, i2, i)) {
                            break;
                        } else {
                            zh3.u(obj, j, zh3.n(obj2, j));
                            A(obj, i2, i);
                            break;
                        }
                    case 68:
                        n(obj, obj2, i);
                        break;
                }
                i += 3;
            } else {
                if (!this.g) {
                    sn2.B(this.m, obj, obj2);
                    return;
                }
                return;
            }
        }
    }

    public final void n(Object obj, Object obj2, int i) {
        int B = B(i);
        int i2 = this.f351a[i];
        long j = B & 1048575;
        if (!j(obj2, i2, i)) {
            return;
        }
        Object n = zh3.n(obj, j);
        Object n2 = zh3.n(obj2, j);
        if (n != null && n2 != null) {
            zh3.u(obj, j, yd1.b(n, n2));
            A(obj, i2, i);
        } else if (n2 != null) {
            zh3.u(obj, j, n2);
            A(obj, i2, i);
        }
    }

    @Override // defpackage.mn2
    public final Object newInstance() {
        this.k.getClass();
        return ((m51) this.e).d(l51.NEW_MUTABLE_INSTANCE);
    }

    public final int t(int i) {
        if (i < this.c || i > this.d) {
            return -1;
        }
        int[] iArr = this.f351a;
        int length = (iArr.length / 3) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final void u(Object obj, long j, tg2 tg2Var, mn2 mn2Var, yu0 yu0Var) {
        tg2Var.e(this.l.c(obj, j), mn2Var, yu0Var);
    }

    public final void v(Object obj, int i, tg2 tg2Var, mn2 mn2Var, yu0 yu0Var) {
        tg2Var.a(this.l.c(obj, i & 1048575), mn2Var, yu0Var);
    }

    public final void w(Object obj, int i, tg2 tg2Var) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            zh3.u(obj, i & 1048575, tg2Var.readStringRequireUtf8());
        } else if (this.f) {
            zh3.u(obj, i & 1048575, tg2Var.readString());
        } else {
            zh3.u(obj, i & 1048575, tg2Var.readBytes());
        }
    }

    public final void x(Object obj, int i, tg2 tg2Var) {
        boolean z;
        if ((536870912 & i) != 0) {
            z = true;
        } else {
            z = false;
        }
        wk1 wk1Var = this.l;
        if (z) {
            tg2Var.readStringListRequireUtf8(wk1Var.c(obj, i & 1048575));
        } else {
            tg2Var.readStringList(wk1Var.c(obj, i & 1048575));
        }
    }

    public final void z(Object obj, int i) {
        if (this.g) {
            return;
        }
        int i2 = this.f351a[i + 2];
        long j = i2 & 1048575;
        zh3.s(obj, j, zh3.l(obj, j) | (1 << (i2 >>> 20)));
    }
}
