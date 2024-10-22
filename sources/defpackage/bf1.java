package defpackage;

import com.google.protobuf.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
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
public final class bf1 {
    private static final /* synthetic */ bf1[] $VALUES;
    public static final bf1 BOOLEAN;
    public static final bf1 BYTE_STRING;
    public static final bf1 DOUBLE;
    public static final bf1 ENUM;
    public static final bf1 FLOAT;
    public static final bf1 INT;
    public static final bf1 LONG;
    public static final bf1 MESSAGE;
    public static final bf1 STRING;
    public static final bf1 VOID = new bf1("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    private static /* synthetic */ bf1[] $values() {
        return new bf1[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    static {
        Class cls = Integer.TYPE;
        INT = new bf1("INT", 1, cls, Integer.class, 0);
        LONG = new bf1("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new bf1("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new bf1("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new bf1("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new bf1("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new bf1("BYTE_STRING", 7, g.class, g.class, g.EMPTY);
        ENUM = new bf1("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new bf1("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = $values();
    }

    private bf1(String str, int i, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static bf1 valueOf(String str) {
        return (bf1) Enum.valueOf(bf1.class, str);
    }

    public static bf1[] values() {
        return (bf1[]) $VALUES.clone();
    }

    public Class<?> getBoxedType() {
        return this.boxedType;
    }

    public Object getDefaultDefault() {
        return this.defaultDefault;
    }

    public Class<?> getType() {
        return this.type;
    }

    public boolean isValidType(Class<?> cls) {
        return this.type.isAssignableFrom(cls);
    }
}
