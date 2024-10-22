package com.google.protobuf;

import defpackage.dj3;
import defpackage.ej3;
import defpackage.h51;
import defpackage.he1;
import defpackage.hj3;
import defpackage.il1;
import defpackage.k23;
import defpackage.k51;
import defpackage.r12;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Value extends o0 implements hj3 {
    public static final int BOOL_VALUE_FIELD_NUMBER = 4;
    private static final Value DEFAULT_INSTANCE;
    public static final int LIST_VALUE_FIELD_NUMBER = 6;
    public static final int NULL_VALUE_FIELD_NUMBER = 1;
    public static final int NUMBER_VALUE_FIELD_NUMBER = 2;
    private static volatile s42 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 3;
    public static final int STRUCT_VALUE_FIELD_NUMBER = 5;
    private int kindCase_ = 0;
    private Object kind_;

    static {
        Value value = new Value();
        DEFAULT_INSTANCE = value;
        o0.registerDefaultInstance(Value.class, value);
    }

    private Value() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.kindCase_ == 4) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kindCase_ = 0;
        this.kind_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearListValue() {
        if (this.kindCase_ == 6) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNullValue() {
        if (this.kindCase_ == 1) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumberValue() {
        if (this.kindCase_ == 2) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.kindCase_ == 3) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStructValue() {
        if (this.kindCase_ == 5) {
            this.kindCase_ = 0;
            this.kind_ = null;
        }
    }

    public static Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeListValue(ListValue listValue) {
        listValue.getClass();
        if (this.kindCase_ == 6 && this.kind_ != ListValue.getDefaultInstance()) {
            this.kind_ = ((il1) ListValue.newBuilder((ListValue) this.kind_).mergeFrom((o0) listValue)).buildPartial();
        } else {
            this.kind_ = listValue;
        }
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStructValue(Struct struct) {
        struct.getClass();
        if (this.kindCase_ == 5 && this.kind_ != Struct.getDefaultInstance()) {
            this.kind_ = ((k23) Struct.newBuilder((Struct) this.kind_).mergeFrom((o0) struct)).buildPartial();
        } else {
            this.kind_ = struct;
        }
        this.kindCase_ = 5;
    }

    public static dj3 newBuilder() {
        return (dj3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Value) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.kindCase_ = 4;
        this.kind_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setListValue(ListValue listValue) {
        listValue.getClass();
        this.kind_ = listValue;
        this.kindCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValue(r12 r12Var) {
        this.kind_ = Integer.valueOf(r12Var.getNumber());
        this.kindCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNullValueValue(int i) {
        this.kindCase_ = 1;
        this.kind_ = Integer.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumberValue(double d) {
        this.kindCase_ = 2;
        this.kind_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.kindCase_ = 3;
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.kind_ = gVar.toStringUtf8();
        this.kindCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStructValue(Struct struct) {
        struct.getClass();
        this.kind_ = struct;
        this.kindCase_ = 5;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        p1 p1Var = null;
        switch (p1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Value();
            case 2:
                return new dj3(p1Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001?\u0000\u00023\u0000\u0003Ȼ\u0000\u0004:\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"kind_", "kindCase_", Struct.class, ListValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Value.class) {
                        s42Var = PARSER;
                        if (s42Var == null) {
                            s42Var = new h51(DEFAULT_INSTANCE);
                            PARSER = s42Var;
                        }
                    }
                }
                return s42Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // defpackage.hj3
    public boolean getBoolValue() {
        if (this.kindCase_ == 4) {
            return ((Boolean) this.kind_).booleanValue();
        }
        return false;
    }

    @Override // defpackage.hj3
    public ej3 getKindCase() {
        return ej3.forNumber(this.kindCase_);
    }

    @Override // defpackage.hj3
    public ListValue getListValue() {
        if (this.kindCase_ == 6) {
            return (ListValue) this.kind_;
        }
        return ListValue.getDefaultInstance();
    }

    @Override // defpackage.hj3
    public r12 getNullValue() {
        if (this.kindCase_ == 1) {
            r12 forNumber = r12.forNumber(((Integer) this.kind_).intValue());
            if (forNumber == null) {
                return r12.UNRECOGNIZED;
            }
            return forNumber;
        }
        return r12.NULL_VALUE;
    }

    @Override // defpackage.hj3
    public int getNullValueValue() {
        if (this.kindCase_ == 1) {
            return ((Integer) this.kind_).intValue();
        }
        return 0;
    }

    @Override // defpackage.hj3
    public double getNumberValue() {
        if (this.kindCase_ == 2) {
            return ((Double) this.kind_).doubleValue();
        }
        return 0.0d;
    }

    @Override // defpackage.hj3
    public String getStringValue() {
        if (this.kindCase_ == 3) {
            return (String) this.kind_;
        }
        return "";
    }

    @Override // defpackage.hj3
    public g getStringValueBytes() {
        String str;
        if (this.kindCase_ == 3) {
            str = (String) this.kind_;
        } else {
            str = "";
        }
        return g.copyFromUtf8(str);
    }

    @Override // defpackage.hj3
    public Struct getStructValue() {
        if (this.kindCase_ == 5) {
            return (Struct) this.kind_;
        }
        return Struct.getDefaultInstance();
    }

    @Override // defpackage.hj3
    public boolean hasBoolValue() {
        if (this.kindCase_ == 4) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hj3
    public boolean hasListValue() {
        if (this.kindCase_ == 6) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hj3
    public boolean hasNullValue() {
        if (this.kindCase_ == 1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hj3
    public boolean hasNumberValue() {
        if (this.kindCase_ == 2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hj3
    public boolean hasStringValue() {
        if (this.kindCase_ == 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hj3
    public boolean hasStructValue() {
        if (this.kindCase_ == 5) {
            return true;
        }
        return false;
    }

    public static dj3 newBuilder(Value value) {
        return (dj3) DEFAULT_INSTANCE.createBuilder(value);
    }

    public static Value parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Value) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Value parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Value parseFrom(g gVar) throws he1 {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Value parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Value parseFrom(byte[] bArr) throws he1 {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Value parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Value parseFrom(InputStream inputStream) throws IOException {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Value parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Value parseFrom(m mVar) throws IOException {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Value parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Value) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
