package defpackage;

import com.google.protobuf.q1;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes2.dex */
public class kr3 {
    private static final /* synthetic */ kr3[] $VALUES;
    public static final kr3 BOOL;
    public static final kr3 BYTES;
    public static final kr3 ENUM;
    public static final kr3 FIXED32;
    public static final kr3 FIXED64;
    public static final kr3 GROUP;
    public static final kr3 INT32;
    public static final kr3 INT64;
    public static final kr3 MESSAGE;
    public static final kr3 SFIXED32;
    public static final kr3 SFIXED64;
    public static final kr3 SINT32;
    public static final kr3 SINT64;
    public static final kr3 STRING;
    public static final kr3 UINT32;
    public static final kr3 UINT64;
    private final mr3 javaType;
    private final int wireType;
    public static final kr3 DOUBLE = new kr3("DOUBLE", 0, mr3.DOUBLE, 1);
    public static final kr3 FLOAT = new kr3("FLOAT", 1, mr3.FLOAT, 5);

    private static /* synthetic */ kr3[] $values() {
        return new kr3[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, GROUP, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64};
    }

    static {
        mr3 mr3Var = mr3.LONG;
        final int i = 2;
        INT64 = new kr3("INT64", 2, mr3Var, 0);
        final int i2 = 3;
        UINT64 = new kr3("UINT64", 3, mr3Var, 0);
        mr3 mr3Var2 = mr3.INT;
        INT32 = new kr3("INT32", 4, mr3Var2, 0);
        FIXED64 = new kr3("FIXED64", 5, mr3Var, 1);
        FIXED32 = new kr3("FIXED32", 6, mr3Var2, 5);
        BOOL = new kr3("BOOL", 7, mr3.BOOLEAN, 0);
        final int i3 = 8;
        final mr3 mr3Var3 = mr3.STRING;
        final String str = "STRING";
        STRING = new kr3(str, i3, mr3Var3, i) { // from class: cr3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.kr3
            public boolean isPackable() {
                return false;
            }
        };
        final mr3 mr3Var4 = mr3.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        GROUP = new kr3(str2, i4, mr3Var4, i2) { // from class: er3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.kr3
            public boolean isPackable() {
                return false;
            }
        };
        final String str3 = "MESSAGE";
        final int i5 = 10;
        MESSAGE = new kr3(str3, i5, mr3Var4, i) { // from class: gr3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.kr3
            public boolean isPackable() {
                return false;
            }
        };
        final int i6 = 11;
        final mr3 mr3Var5 = mr3.BYTE_STRING;
        final String str4 = "BYTES";
        BYTES = new kr3(str4, i6, mr3Var5, i) { // from class: ir3
            {
                q1 q1Var = null;
            }

            @Override // defpackage.kr3
            public boolean isPackable() {
                return false;
            }
        };
        UINT32 = new kr3("UINT32", 12, mr3Var2, 0);
        ENUM = new kr3("ENUM", 13, mr3.ENUM, 0);
        SFIXED32 = new kr3("SFIXED32", 14, mr3Var2, 5);
        SFIXED64 = new kr3("SFIXED64", 15, mr3Var, 1);
        SINT32 = new kr3("SINT32", 16, mr3Var2, 0);
        SINT64 = new kr3("SINT64", 17, mr3Var, 0);
        $VALUES = $values();
    }

    public /* synthetic */ kr3(String str, int i, mr3 mr3Var, int i2, q1 q1Var) {
        this(str, i, mr3Var, i2);
    }

    public static kr3 valueOf(String str) {
        return (kr3) Enum.valueOf(kr3.class, str);
    }

    public static kr3[] values() {
        return (kr3[]) $VALUES.clone();
    }

    public mr3 getJavaType() {
        return this.javaType;
    }

    public int getWireType() {
        return this.wireType;
    }

    public boolean isPackable() {
        return true;
    }

    private kr3(String str, int i, mr3 mr3Var, int i2) {
        this.javaType = mr3Var;
        this.wireType = i2;
    }
}
