package defpackage;

import com.google.protobuf.r0;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class pw0 implements Comparable {
    private final Field cachedSizeField;
    private final boolean enforceUtf8;
    private final sd1 enumVerifier;
    private final Field field;
    private final int fieldNumber;
    private final Object mapDefaultEntry;
    private final Class<?> messageClass;
    private final g32 oneof;
    private final Class<?> oneofStoredType;
    private final Field presenceField;
    private final int presenceMask;
    private final boolean required;
    private final ax0 type;

    private pw0(Field field, int i, ax0 ax0Var, Class<?> cls, Field field2, int i2, boolean z, boolean z2, g32 g32Var, Class<?> cls2, Object obj, sd1 sd1Var, Field field3) {
        this.field = field;
        this.type = ax0Var;
        this.messageClass = cls;
        this.fieldNumber = i;
        this.presenceField = field2;
        this.presenceMask = i2;
        this.required = z;
        this.enforceUtf8 = z2;
        this.oneof = g32Var;
        this.oneofStoredType = cls2;
        this.mapDefaultEntry = obj;
        this.enumVerifier = sd1Var;
        this.cachedSizeField = field3;
    }

    private static void checkFieldNumber(int i) {
        if (i > 0) {
        } else {
            throw new IllegalArgumentException(hx2.m("fieldNumber must be positive: ", i));
        }
    }

    public static pw0 forField(Field field, int i, ax0 ax0Var, boolean z) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        r0.checkNotNull(ax0Var, "fieldType");
        if (ax0Var != ax0.MESSAGE_LIST && ax0Var != ax0.GROUP_LIST) {
            return new pw0(field, i, ax0Var, null, null, 0, false, z, null, null, null, null, null);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static pw0 forFieldWithEnumVerifier(Field field, int i, ax0 ax0Var, sd1 sd1Var) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        return new pw0(field, i, ax0Var, null, null, 0, false, false, null, null, null, sd1Var, null);
    }

    public static pw0 forMapField(Field field, int i, Object obj, sd1 sd1Var) {
        r0.checkNotNull(obj, "mapDefaultEntry");
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        return new pw0(field, i, ax0.MAP, null, null, 0, false, true, null, null, obj, sd1Var, null);
    }

    public static pw0 forOneofMemberField(int i, ax0 ax0Var, g32 g32Var, Class<?> cls, boolean z, sd1 sd1Var) {
        checkFieldNumber(i);
        r0.checkNotNull(ax0Var, "fieldType");
        r0.checkNotNull(g32Var, "oneof");
        r0.checkNotNull(cls, "oneofStoredType");
        if (ax0Var.isScalar()) {
            return new pw0(null, i, ax0Var, null, null, 0, false, z, g32Var, cls, null, sd1Var, null);
        }
        throw new IllegalArgumentException("Oneof is only supported for scalar fields. Field " + i + " is of type " + ax0Var);
    }

    public static pw0 forPackedField(Field field, int i, ax0 ax0Var, Field field2) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        r0.checkNotNull(ax0Var, "fieldType");
        if (ax0Var != ax0.MESSAGE_LIST && ax0Var != ax0.GROUP_LIST) {
            return new pw0(field, i, ax0Var, null, null, 0, false, false, null, null, null, null, field2);
        }
        throw new IllegalStateException("Shouldn't be called for repeated message fields.");
    }

    public static pw0 forPackedFieldWithEnumVerifier(Field field, int i, ax0 ax0Var, sd1 sd1Var, Field field2) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        return new pw0(field, i, ax0Var, null, null, 0, false, false, null, null, null, sd1Var, field2);
    }

    public static pw0 forProto2OptionalField(Field field, int i, ax0 ax0Var, Field field2, int i2, boolean z, sd1 sd1Var) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        r0.checkNotNull(ax0Var, "fieldType");
        r0.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i2)) {
            throw new IllegalArgumentException(hx2.m("presenceMask must have exactly one bit set: ", i2));
        }
        return new pw0(field, i, ax0Var, null, field2, i2, false, z, null, null, null, sd1Var, null);
    }

    public static pw0 forProto2RequiredField(Field field, int i, ax0 ax0Var, Field field2, int i2, boolean z, sd1 sd1Var) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        r0.checkNotNull(ax0Var, "fieldType");
        r0.checkNotNull(field2, "presenceField");
        if (field2 != null && !isExactlyOneBitSet(i2)) {
            throw new IllegalArgumentException(hx2.m("presenceMask must have exactly one bit set: ", i2));
        }
        return new pw0(field, i, ax0Var, null, field2, i2, true, z, null, null, null, sd1Var, null);
    }

    public static pw0 forRepeatedMessageField(Field field, int i, ax0 ax0Var, Class<?> cls) {
        checkFieldNumber(i);
        r0.checkNotNull(field, "field");
        r0.checkNotNull(ax0Var, "fieldType");
        r0.checkNotNull(cls, "messageClass");
        return new pw0(field, i, ax0Var, cls, null, 0, false, false, null, null, null, null, null);
    }

    private static boolean isExactlyOneBitSet(int i) {
        return i != 0 && (i & (i + (-1))) == 0;
    }

    public static ow0 newBuilder() {
        return new ow0(null);
    }

    public Field getCachedSizeField() {
        return this.cachedSizeField;
    }

    public sd1 getEnumVerifier() {
        return this.enumVerifier;
    }

    public Field getField() {
        return this.field;
    }

    public int getFieldNumber() {
        return this.fieldNumber;
    }

    public Class<?> getListElementType() {
        return this.messageClass;
    }

    public Object getMapDefaultEntry() {
        return this.mapDefaultEntry;
    }

    public Class<?> getMessageFieldClass() {
        int i = nw0.$SwitchMap$com$google$protobuf$FieldType[this.type.ordinal()];
        if (i != 1 && i != 2) {
            if (i != 3 && i != 4) {
                return null;
            }
            return this.messageClass;
        }
        Field field = this.field;
        if (field != null) {
            return field.getType();
        }
        return this.oneofStoredType;
    }

    public g32 getOneof() {
        return this.oneof;
    }

    public Class<?> getOneofStoredType() {
        return this.oneofStoredType;
    }

    public Field getPresenceField() {
        return this.presenceField;
    }

    public int getPresenceMask() {
        return this.presenceMask;
    }

    public ax0 getType() {
        return this.type;
    }

    public boolean isEnforceUtf8() {
        return this.enforceUtf8;
    }

    public boolean isRequired() {
        return this.required;
    }

    @Override // java.lang.Comparable
    public int compareTo(pw0 pw0Var) {
        return this.fieldNumber - pw0Var.fieldNumber;
    }
}
