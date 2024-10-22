package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k23;
import defpackage.k51;
import defpackage.l23;
import defpackage.s42;
import defpackage.wp1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class Struct extends o0 implements l23 {
    private static final Struct DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 1;
    private static volatile s42 PARSER;
    private wp1 fields_ = wp1.emptyMapField();

    static {
        Struct struct = new Struct();
        DEFAULT_INSTANCE = struct;
        o0.registerDefaultInstance(Struct.class, struct);
    }

    private Struct() {
    }

    public static Struct getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Value> getMutableFieldsMap() {
        return internalGetMutableFields();
    }

    private wp1 internalGetFields() {
        return this.fields_;
    }

    private wp1 internalGetMutableFields() {
        if (!this.fields_.isMutable()) {
            this.fields_ = this.fields_.mutableCopy();
        }
        return this.fields_;
    }

    public static k23 newBuilder() {
        return (k23) DEFAULT_INSTANCE.createBuilder();
    }

    public static Struct parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Struct) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // defpackage.l23
    public boolean containsFields(String str) {
        str.getClass();
        return internalGetFields().containsKey(str);
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        c1 c1Var = null;
        switch (c1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Struct();
            case 2:
                return new k23(c1Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"fields_", d1.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Struct.class) {
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

    @Override // defpackage.l23
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // defpackage.l23
    public int getFieldsCount() {
        return internalGetFields().size();
    }

    @Override // defpackage.l23
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(internalGetFields());
    }

    @Override // defpackage.l23
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        wp1 internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        return value;
    }

    @Override // defpackage.l23
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        wp1 internalGetFields = internalGetFields();
        if (internalGetFields.containsKey(str)) {
            return (Value) internalGetFields.get(str);
        }
        throw new IllegalArgumentException();
    }

    public static k23 newBuilder(Struct struct) {
        return (k23) DEFAULT_INSTANCE.createBuilder(struct);
    }

    public static Struct parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Struct) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Struct parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Struct parseFrom(g gVar) throws he1 {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Struct parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Struct parseFrom(byte[] bArr) throws he1 {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Struct parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Struct parseFrom(InputStream inputStream) throws IOException {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Struct parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Struct parseFrom(m mVar) throws IOException {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Struct parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Struct) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
