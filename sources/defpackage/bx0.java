package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public final class bx0 {

    /* renamed from: b, reason: collision with root package name */
    public static final bx0 f544b;
    public static final bx0 c;
    public static final bx0[] d;
    public static final /* synthetic */ bx0[] e;

    /* renamed from: a, reason: collision with root package name */
    public final int f545a;

    /* JADX INFO: Fake field, exist only in values array */
    bx0 EF6;

    static {
        cf1 cf1Var = cf1.DOUBLE;
        bx0 bx0Var = new bx0("DOUBLE", 0, 0, 1, cf1Var);
        cf1 cf1Var2 = cf1.FLOAT;
        bx0 bx0Var2 = new bx0("FLOAT", 1, 1, 1, cf1Var2);
        cf1 cf1Var3 = cf1.LONG;
        bx0 bx0Var3 = new bx0("INT64", 2, 2, 1, cf1Var3);
        bx0 bx0Var4 = new bx0("UINT64", 3, 3, 1, cf1Var3);
        cf1 cf1Var4 = cf1.INT;
        bx0 bx0Var5 = new bx0("INT32", 4, 4, 1, cf1Var4);
        bx0 bx0Var6 = new bx0("FIXED64", 5, 5, 1, cf1Var3);
        bx0 bx0Var7 = new bx0("FIXED32", 6, 6, 1, cf1Var4);
        cf1 cf1Var5 = cf1.BOOLEAN;
        bx0 bx0Var8 = new bx0("BOOL", 7, 7, 1, cf1Var5);
        cf1 cf1Var6 = cf1.STRING;
        bx0 bx0Var9 = new bx0("STRING", 8, 8, 1, cf1Var6);
        cf1 cf1Var7 = cf1.MESSAGE;
        bx0 bx0Var10 = new bx0("MESSAGE", 9, 9, 1, cf1Var7);
        cf1 cf1Var8 = cf1.BYTE_STRING;
        bx0 bx0Var11 = new bx0("BYTES", 10, 10, 1, cf1Var8);
        bx0 bx0Var12 = new bx0("UINT32", 11, 11, 1, cf1Var4);
        cf1 cf1Var9 = cf1.ENUM;
        bx0 bx0Var13 = new bx0("ENUM", 12, 12, 1, cf1Var9);
        bx0 bx0Var14 = new bx0("SFIXED32", 13, 13, 1, cf1Var4);
        bx0 bx0Var15 = new bx0("SFIXED64", 14, 14, 1, cf1Var3);
        bx0 bx0Var16 = new bx0("SINT32", 15, 15, 1, cf1Var4);
        bx0 bx0Var17 = new bx0("SINT64", 16, 16, 1, cf1Var3);
        bx0 bx0Var18 = new bx0("GROUP", 17, 17, 1, cf1Var7);
        bx0 bx0Var19 = new bx0("DOUBLE_LIST", 18, 18, 2, cf1Var);
        bx0 bx0Var20 = new bx0("FLOAT_LIST", 19, 19, 2, cf1Var2);
        bx0 bx0Var21 = new bx0("INT64_LIST", 20, 20, 2, cf1Var3);
        bx0 bx0Var22 = new bx0("UINT64_LIST", 21, 21, 2, cf1Var3);
        bx0 bx0Var23 = new bx0("INT32_LIST", 22, 22, 2, cf1Var4);
        bx0 bx0Var24 = new bx0("FIXED64_LIST", 23, 23, 2, cf1Var3);
        bx0 bx0Var25 = new bx0("FIXED32_LIST", 24, 24, 2, cf1Var4);
        bx0 bx0Var26 = new bx0("BOOL_LIST", 25, 25, 2, cf1Var5);
        bx0 bx0Var27 = new bx0("STRING_LIST", 26, 26, 2, cf1Var6);
        bx0 bx0Var28 = new bx0("MESSAGE_LIST", 27, 27, 2, cf1Var7);
        bx0 bx0Var29 = new bx0("BYTES_LIST", 28, 28, 2, cf1Var8);
        bx0 bx0Var30 = new bx0("UINT32_LIST", 29, 29, 2, cf1Var4);
        bx0 bx0Var31 = new bx0("ENUM_LIST", 30, 30, 2, cf1Var9);
        bx0 bx0Var32 = new bx0("SFIXED32_LIST", 31, 31, 2, cf1Var4);
        bx0 bx0Var33 = new bx0("SFIXED64_LIST", 32, 32, 2, cf1Var3);
        bx0 bx0Var34 = new bx0("SINT32_LIST", 33, 33, 2, cf1Var4);
        bx0 bx0Var35 = new bx0("SINT64_LIST", 34, 34, 2, cf1Var3);
        bx0 bx0Var36 = new bx0("DOUBLE_LIST_PACKED", 35, 35, 3, cf1Var);
        f544b = bx0Var36;
        bx0 bx0Var37 = new bx0("FLOAT_LIST_PACKED", 36, 36, 3, cf1Var2);
        bx0 bx0Var38 = new bx0("INT64_LIST_PACKED", 37, 37, 3, cf1Var3);
        bx0 bx0Var39 = new bx0("UINT64_LIST_PACKED", 38, 38, 3, cf1Var3);
        bx0 bx0Var40 = new bx0("INT32_LIST_PACKED", 39, 39, 3, cf1Var4);
        bx0 bx0Var41 = new bx0("FIXED64_LIST_PACKED", 40, 40, 3, cf1Var3);
        bx0 bx0Var42 = new bx0("FIXED32_LIST_PACKED", 41, 41, 3, cf1Var4);
        bx0 bx0Var43 = new bx0("BOOL_LIST_PACKED", 42, 42, 3, cf1Var5);
        bx0 bx0Var44 = new bx0("UINT32_LIST_PACKED", 43, 43, 3, cf1Var4);
        bx0 bx0Var45 = new bx0("ENUM_LIST_PACKED", 44, 44, 3, cf1Var9);
        bx0 bx0Var46 = new bx0("SFIXED32_LIST_PACKED", 45, 45, 3, cf1Var4);
        bx0 bx0Var47 = new bx0("SFIXED64_LIST_PACKED", 46, 46, 3, cf1Var3);
        bx0 bx0Var48 = new bx0("SINT32_LIST_PACKED", 47, 47, 3, cf1Var4);
        bx0 bx0Var49 = new bx0("SINT64_LIST_PACKED", 48, 48, 3, cf1Var3);
        c = bx0Var49;
        e = new bx0[]{bx0Var, bx0Var2, bx0Var3, bx0Var4, bx0Var5, bx0Var6, bx0Var7, bx0Var8, bx0Var9, bx0Var10, bx0Var11, bx0Var12, bx0Var13, bx0Var14, bx0Var15, bx0Var16, bx0Var17, bx0Var18, bx0Var19, bx0Var20, bx0Var21, bx0Var22, bx0Var23, bx0Var24, bx0Var25, bx0Var26, bx0Var27, bx0Var28, bx0Var29, bx0Var30, bx0Var31, bx0Var32, bx0Var33, bx0Var34, bx0Var35, bx0Var36, bx0Var37, bx0Var38, bx0Var39, bx0Var40, bx0Var41, bx0Var42, bx0Var43, bx0Var44, bx0Var45, bx0Var46, bx0Var47, bx0Var48, bx0Var49, new bx0("GROUP_LIST", 49, 49, 2, cf1Var7), new bx0("MAP", 50, 50, 4, cf1.VOID)};
        bx0[] values = values();
        d = new bx0[values.length];
        for (bx0 bx0Var50 : values) {
            d[bx0Var50.f545a] = bx0Var50;
        }
    }

    public bx0(String str, int i, int i2, int i3, cf1 cf1Var) {
        this.f545a = i2;
        if (i3 != 0) {
            int i4 = i3 - 1;
            if (i4 != 1) {
                if (i4 == 3) {
                    cf1Var.getClass();
                }
            } else {
                cf1Var.getClass();
            }
            if (i3 == 1) {
                cf1Var.ordinal();
                return;
            }
            return;
        }
        throw null;
    }

    public static bx0 valueOf(String str) {
        return (bx0) Enum.valueOf(bx0.class, str);
    }

    public static bx0[] values() {
        return (bx0[]) e.clone();
    }

    public final int a() {
        return this.f545a;
    }
}
