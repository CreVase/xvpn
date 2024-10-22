package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes.dex */
public class lr3 {
    public static final dr3 c;
    public static final fr3 d;
    public static final hr3 e;
    public static final /* synthetic */ lr3[] f;

    /* renamed from: a, reason: collision with root package name */
    public final nr3 f3180a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3181b;

    /* JADX INFO: Fake field, exist only in values array */
    lr3 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    lr3 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    lr3 EF2;

    static {
        lr3 lr3Var = new lr3("DOUBLE", 0, nr3.DOUBLE, 1);
        lr3 lr3Var2 = new lr3("FLOAT", 1, nr3.FLOAT, 5);
        nr3 nr3Var = nr3.LONG;
        lr3 lr3Var3 = new lr3("INT64", 2, nr3Var, 0);
        lr3 lr3Var4 = new lr3("UINT64", 3, nr3Var, 0);
        nr3 nr3Var2 = nr3.INT;
        lr3 lr3Var5 = new lr3("INT32", 4, nr3Var2, 0);
        lr3 lr3Var6 = new lr3("FIXED64", 5, nr3Var, 1);
        lr3 lr3Var7 = new lr3("FIXED32", 6, nr3Var2, 5);
        lr3 lr3Var8 = new lr3("BOOL", 7, nr3.BOOLEAN, 0);
        dr3 dr3Var = new dr3();
        c = dr3Var;
        nr3 nr3Var3 = nr3.MESSAGE;
        fr3 fr3Var = new fr3(nr3Var3);
        d = fr3Var;
        hr3 hr3Var = new hr3(nr3Var3);
        e = hr3Var;
        final nr3 nr3Var4 = nr3.BYTE_STRING;
        f = new lr3[]{lr3Var, lr3Var2, lr3Var3, lr3Var4, lr3Var5, lr3Var6, lr3Var7, lr3Var8, dr3Var, fr3Var, hr3Var, new lr3(nr3Var4) { // from class: jr3
        }, new lr3("UINT32", 12, nr3Var2, 0), new lr3("ENUM", 13, nr3.ENUM, 0), new lr3("SFIXED32", 14, nr3Var2, 5), new lr3("SFIXED64", 15, nr3Var, 1), new lr3("SINT32", 16, nr3Var2, 0), new lr3("SINT64", 17, nr3Var, 0)};
    }

    public lr3(String str, int i, nr3 nr3Var, int i2) {
        this.f3180a = nr3Var;
        this.f3181b = i2;
    }

    public static lr3 valueOf(String str) {
        return (lr3) Enum.valueOf(lr3.class, str);
    }

    public static lr3[] values() {
        return (lr3[]) f.clone();
    }
}
