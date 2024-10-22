package com.google.protobuf;

import defpackage.bt;
import defpackage.ct;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class BytesValue extends o0 implements ct {
    private static final BytesValue DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private g value_ = g.EMPTY;

    static {
        BytesValue bytesValue = new BytesValue();
        DEFAULT_INSTANCE = bytesValue;
        o0.registerDefaultInstance(BytesValue.class, bytesValue);
    }

    private BytesValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static BytesValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bt newBuilder() {
        return (bt) DEFAULT_INSTANCE.createBuilder();
    }

    public static BytesValue of(g gVar) {
        return (BytesValue) newBuilder().setValue(gVar).build();
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BytesValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (h.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new BytesValue();
            case 2:
                return new bt(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (BytesValue.class) {
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

    @Override // defpackage.ct
    public g getValue() {
        return this.value_;
    }

    public static bt newBuilder(BytesValue bytesValue) {
        return (bt) DEFAULT_INSTANCE.createBuilder(bytesValue);
    }

    public static BytesValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (BytesValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static BytesValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static BytesValue parseFrom(g gVar) throws he1 {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static BytesValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static BytesValue parseFrom(byte[] bArr) throws he1 {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BytesValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static BytesValue parseFrom(InputStream inputStream) throws IOException {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BytesValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static BytesValue parseFrom(m mVar) throws IOException {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static BytesValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (BytesValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
