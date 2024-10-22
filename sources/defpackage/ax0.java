package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
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
public final class ax0 {
    private static final /* synthetic */ ax0[] $VALUES;
    public static final ax0 BOOL;
    public static final ax0 BOOL_LIST;
    public static final ax0 BOOL_LIST_PACKED;
    public static final ax0 BYTES;
    public static final ax0 BYTES_LIST;
    public static final ax0 DOUBLE;
    public static final ax0 DOUBLE_LIST;
    public static final ax0 DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final ax0 ENUM;
    public static final ax0 ENUM_LIST;
    public static final ax0 ENUM_LIST_PACKED;
    public static final ax0 FIXED32;
    public static final ax0 FIXED32_LIST;
    public static final ax0 FIXED32_LIST_PACKED;
    public static final ax0 FIXED64;
    public static final ax0 FIXED64_LIST;
    public static final ax0 FIXED64_LIST_PACKED;
    public static final ax0 FLOAT;
    public static final ax0 FLOAT_LIST;
    public static final ax0 FLOAT_LIST_PACKED;
    public static final ax0 GROUP;
    public static final ax0 GROUP_LIST;
    public static final ax0 INT32;
    public static final ax0 INT32_LIST;
    public static final ax0 INT32_LIST_PACKED;
    public static final ax0 INT64;
    public static final ax0 INT64_LIST;
    public static final ax0 INT64_LIST_PACKED;
    public static final ax0 MAP;
    public static final ax0 MESSAGE;
    public static final ax0 MESSAGE_LIST;
    public static final ax0 SFIXED32;
    public static final ax0 SFIXED32_LIST;
    public static final ax0 SFIXED32_LIST_PACKED;
    public static final ax0 SFIXED64;
    public static final ax0 SFIXED64_LIST;
    public static final ax0 SFIXED64_LIST_PACKED;
    public static final ax0 SINT32;
    public static final ax0 SINT32_LIST;
    public static final ax0 SINT32_LIST_PACKED;
    public static final ax0 SINT64;
    public static final ax0 SINT64_LIST;
    public static final ax0 SINT64_LIST_PACKED;
    public static final ax0 STRING;
    public static final ax0 STRING_LIST;
    public static final ax0 UINT32;
    public static final ax0 UINT32_LIST;
    public static final ax0 UINT32_LIST_PACKED;
    public static final ax0 UINT64;
    public static final ax0 UINT64_LIST;
    public static final ax0 UINT64_LIST_PACKED;
    private static final ax0[] VALUES;
    private final zw0 collection;
    private final Class<?> elementType;
    private final int id;
    private final bf1 javaType;
    private final boolean primitiveScalar;

    private static /* synthetic */ ax0[] $values() {
        return new ax0[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    static {
        zw0 zw0Var = zw0.SCALAR;
        bf1 bf1Var = bf1.DOUBLE;
        DOUBLE = new ax0("DOUBLE", 0, 0, zw0Var, bf1Var);
        bf1 bf1Var2 = bf1.FLOAT;
        FLOAT = new ax0("FLOAT", 1, 1, zw0Var, bf1Var2);
        bf1 bf1Var3 = bf1.LONG;
        INT64 = new ax0("INT64", 2, 2, zw0Var, bf1Var3);
        UINT64 = new ax0("UINT64", 3, 3, zw0Var, bf1Var3);
        bf1 bf1Var4 = bf1.INT;
        INT32 = new ax0("INT32", 4, 4, zw0Var, bf1Var4);
        FIXED64 = new ax0("FIXED64", 5, 5, zw0Var, bf1Var3);
        FIXED32 = new ax0("FIXED32", 6, 6, zw0Var, bf1Var4);
        bf1 bf1Var5 = bf1.BOOLEAN;
        BOOL = new ax0("BOOL", 7, 7, zw0Var, bf1Var5);
        bf1 bf1Var6 = bf1.STRING;
        STRING = new ax0("STRING", 8, 8, zw0Var, bf1Var6);
        bf1 bf1Var7 = bf1.MESSAGE;
        MESSAGE = new ax0("MESSAGE", 9, 9, zw0Var, bf1Var7);
        bf1 bf1Var8 = bf1.BYTE_STRING;
        BYTES = new ax0("BYTES", 10, 10, zw0Var, bf1Var8);
        UINT32 = new ax0("UINT32", 11, 11, zw0Var, bf1Var4);
        bf1 bf1Var9 = bf1.ENUM;
        ENUM = new ax0("ENUM", 12, 12, zw0Var, bf1Var9);
        SFIXED32 = new ax0("SFIXED32", 13, 13, zw0Var, bf1Var4);
        SFIXED64 = new ax0("SFIXED64", 14, 14, zw0Var, bf1Var3);
        SINT32 = new ax0("SINT32", 15, 15, zw0Var, bf1Var4);
        SINT64 = new ax0("SINT64", 16, 16, zw0Var, bf1Var3);
        GROUP = new ax0("GROUP", 17, 17, zw0Var, bf1Var7);
        zw0 zw0Var2 = zw0.VECTOR;
        DOUBLE_LIST = new ax0("DOUBLE_LIST", 18, 18, zw0Var2, bf1Var);
        FLOAT_LIST = new ax0("FLOAT_LIST", 19, 19, zw0Var2, bf1Var2);
        INT64_LIST = new ax0("INT64_LIST", 20, 20, zw0Var2, bf1Var3);
        UINT64_LIST = new ax0("UINT64_LIST", 21, 21, zw0Var2, bf1Var3);
        INT32_LIST = new ax0("INT32_LIST", 22, 22, zw0Var2, bf1Var4);
        FIXED64_LIST = new ax0("FIXED64_LIST", 23, 23, zw0Var2, bf1Var3);
        FIXED32_LIST = new ax0("FIXED32_LIST", 24, 24, zw0Var2, bf1Var4);
        BOOL_LIST = new ax0("BOOL_LIST", 25, 25, zw0Var2, bf1Var5);
        STRING_LIST = new ax0("STRING_LIST", 26, 26, zw0Var2, bf1Var6);
        MESSAGE_LIST = new ax0("MESSAGE_LIST", 27, 27, zw0Var2, bf1Var7);
        BYTES_LIST = new ax0("BYTES_LIST", 28, 28, zw0Var2, bf1Var8);
        UINT32_LIST = new ax0("UINT32_LIST", 29, 29, zw0Var2, bf1Var4);
        ENUM_LIST = new ax0("ENUM_LIST", 30, 30, zw0Var2, bf1Var9);
        SFIXED32_LIST = new ax0("SFIXED32_LIST", 31, 31, zw0Var2, bf1Var4);
        SFIXED64_LIST = new ax0("SFIXED64_LIST", 32, 32, zw0Var2, bf1Var3);
        SINT32_LIST = new ax0("SINT32_LIST", 33, 33, zw0Var2, bf1Var4);
        SINT64_LIST = new ax0("SINT64_LIST", 34, 34, zw0Var2, bf1Var3);
        zw0 zw0Var3 = zw0.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new ax0("DOUBLE_LIST_PACKED", 35, 35, zw0Var3, bf1Var);
        FLOAT_LIST_PACKED = new ax0("FLOAT_LIST_PACKED", 36, 36, zw0Var3, bf1Var2);
        INT64_LIST_PACKED = new ax0("INT64_LIST_PACKED", 37, 37, zw0Var3, bf1Var3);
        UINT64_LIST_PACKED = new ax0("UINT64_LIST_PACKED", 38, 38, zw0Var3, bf1Var3);
        INT32_LIST_PACKED = new ax0("INT32_LIST_PACKED", 39, 39, zw0Var3, bf1Var4);
        FIXED64_LIST_PACKED = new ax0("FIXED64_LIST_PACKED", 40, 40, zw0Var3, bf1Var3);
        FIXED32_LIST_PACKED = new ax0("FIXED32_LIST_PACKED", 41, 41, zw0Var3, bf1Var4);
        BOOL_LIST_PACKED = new ax0("BOOL_LIST_PACKED", 42, 42, zw0Var3, bf1Var5);
        UINT32_LIST_PACKED = new ax0("UINT32_LIST_PACKED", 43, 43, zw0Var3, bf1Var4);
        ENUM_LIST_PACKED = new ax0("ENUM_LIST_PACKED", 44, 44, zw0Var3, bf1Var9);
        SFIXED32_LIST_PACKED = new ax0("SFIXED32_LIST_PACKED", 45, 45, zw0Var3, bf1Var4);
        SFIXED64_LIST_PACKED = new ax0("SFIXED64_LIST_PACKED", 46, 46, zw0Var3, bf1Var3);
        SINT32_LIST_PACKED = new ax0("SINT32_LIST_PACKED", 47, 47, zw0Var3, bf1Var4);
        SINT64_LIST_PACKED = new ax0("SINT64_LIST_PACKED", 48, 48, zw0Var3, bf1Var3);
        GROUP_LIST = new ax0("GROUP_LIST", 49, 49, zw0Var2, bf1Var7);
        MAP = new ax0("MAP", 50, 50, zw0.MAP, bf1.VOID);
        $VALUES = $values();
        EMPTY_TYPES = new Type[0];
        ax0[] values = values();
        VALUES = new ax0[values.length];
        for (ax0 ax0Var : values) {
            VALUES[ax0Var.id] = ax0Var;
        }
    }

    private ax0(String str, int i, int i2, zw0 zw0Var, bf1 bf1Var) {
        int i3;
        this.id = i2;
        this.collection = zw0Var;
        this.javaType = bf1Var;
        int i4 = yw0.$SwitchMap$com$google$protobuf$FieldType$Collection[zw0Var.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                this.elementType = null;
            } else {
                this.elementType = bf1Var.getBoxedType();
            }
        } else {
            this.elementType = bf1Var.getBoxedType();
        }
        this.primitiveScalar = (zw0Var != zw0.SCALAR || (i3 = yw0.$SwitchMap$com$google$protobuf$JavaType[bf1Var.ordinal()]) == 1 || i3 == 2 || i3 == 3) ? false : true;
    }

    public static ax0 forId(int i) {
        if (i >= 0) {
            ax0[] ax0VarArr = VALUES;
            if (i < ax0VarArr.length) {
                return ax0VarArr[i];
            }
            return null;
        }
        return null;
    }

    private static Type getGenericSuperList(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                return type;
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if ((genericSuperclass instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    private static Type getListParameter(Class<?> cls, Type[] typeArr) {
        boolean z;
        while (true) {
            int i = 0;
            if (cls != List.class) {
                Type genericSuperList = getGenericSuperList(cls);
                if (genericSuperList instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) genericSuperList;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 < typeParameters.length) {
                                        if (type == typeParameters[i3]) {
                                            actualTypeArguments[i2] = typeArr[i3];
                                            z = true;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        z = false;
                                        break;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    cls = (Class) parameterizedType.getRawType();
                    typeArr = actualTypeArguments;
                } else {
                    typeArr = EMPTY_TYPES;
                    Class<?>[] interfaces = cls.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i < length) {
                            Class<?> cls2 = interfaces[i];
                            if (List.class.isAssignableFrom(cls2)) {
                                cls = cls2;
                                break;
                            }
                            i++;
                        } else {
                            cls = cls.getSuperclass();
                            break;
                        }
                    }
                }
            } else {
                if (typeArr.length == 1) {
                    return typeArr[0];
                }
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    private boolean isValidForList(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = EMPTY_TYPES;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type listParameter = getListParameter(type, typeArr);
        if (!(listParameter instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) listParameter);
    }

    public static ax0 valueOf(String str) {
        return (ax0) Enum.valueOf(ax0.class, str);
    }

    public static ax0[] values() {
        return (ax0[]) $VALUES.clone();
    }

    public bf1 getJavaType() {
        return this.javaType;
    }

    public int id() {
        return this.id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        if (this.collection == zw0.MAP) {
            return true;
        }
        return false;
    }

    public boolean isPacked() {
        return zw0.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        if (this.collection == zw0.SCALAR) {
            return true;
        }
        return false;
    }

    public boolean isValidForField(Field field) {
        if (zw0.VECTOR.equals(this.collection)) {
            return isValidForList(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
