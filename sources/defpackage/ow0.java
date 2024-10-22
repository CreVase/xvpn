package defpackage;

import com.google.protobuf.r0;
import java.lang.reflect.Field;

/* loaded from: classes2.dex */
public final class ow0 {
    private Field cachedSizeField;
    private boolean enforceUtf8;
    private sd1 enumVerifier;
    private Field field;
    private int fieldNumber;
    private Object mapDefaultEntry;
    private g32 oneof;
    private Class<?> oneofStoredType;
    private Field presenceField;
    private int presenceMask;
    private boolean required;
    private ax0 type;

    private ow0() {
    }

    public /* synthetic */ ow0(nw0 nw0Var) {
        this();
    }

    public pw0 build() {
        g32 g32Var = this.oneof;
        if (g32Var != null) {
            return pw0.forOneofMemberField(this.fieldNumber, this.type, g32Var, this.oneofStoredType, this.enforceUtf8, this.enumVerifier);
        }
        Object obj = this.mapDefaultEntry;
        if (obj != null) {
            return pw0.forMapField(this.field, this.fieldNumber, obj, this.enumVerifier);
        }
        Field field = this.presenceField;
        if (field != null) {
            if (this.required) {
                return pw0.forProto2RequiredField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
            }
            return pw0.forProto2OptionalField(this.field, this.fieldNumber, this.type, field, this.presenceMask, this.enforceUtf8, this.enumVerifier);
        }
        sd1 sd1Var = this.enumVerifier;
        if (sd1Var != null) {
            Field field2 = this.cachedSizeField;
            if (field2 == null) {
                return pw0.forFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, sd1Var);
            }
            return pw0.forPackedFieldWithEnumVerifier(this.field, this.fieldNumber, this.type, sd1Var, field2);
        }
        Field field3 = this.cachedSizeField;
        if (field3 == null) {
            return pw0.forField(this.field, this.fieldNumber, this.type, this.enforceUtf8);
        }
        return pw0.forPackedField(this.field, this.fieldNumber, this.type, field3);
    }

    public ow0 withCachedSizeField(Field field) {
        this.cachedSizeField = field;
        return this;
    }

    public ow0 withEnforceUtf8(boolean z) {
        this.enforceUtf8 = z;
        return this;
    }

    public ow0 withEnumVerifier(sd1 sd1Var) {
        this.enumVerifier = sd1Var;
        return this;
    }

    public ow0 withField(Field field) {
        if (this.oneof == null) {
            this.field = field;
            return this;
        }
        throw new IllegalStateException("Cannot set field when building a oneof.");
    }

    public ow0 withFieldNumber(int i) {
        this.fieldNumber = i;
        return this;
    }

    public ow0 withMapDefaultEntry(Object obj) {
        this.mapDefaultEntry = obj;
        return this;
    }

    public ow0 withOneof(g32 g32Var, Class<?> cls) {
        if (this.field == null && this.presenceField == null) {
            this.oneof = g32Var;
            this.oneofStoredType = cls;
            return this;
        }
        throw new IllegalStateException("Cannot set oneof when field or presenceField have been provided");
    }

    public ow0 withPresence(Field field, int i) {
        this.presenceField = (Field) r0.checkNotNull(field, "presenceField");
        this.presenceMask = i;
        return this;
    }

    public ow0 withRequired(boolean z) {
        this.required = z;
        return this;
    }

    public ow0 withType(ax0 ax0Var) {
        this.type = ax0Var;
        return this;
    }
}
