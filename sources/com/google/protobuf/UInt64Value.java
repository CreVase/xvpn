package com.google.protobuf;

import defpackage.cg3;
import defpackage.dg3;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class UInt64Value extends o0 implements dg3 {
    private static final UInt64Value DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        o0.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }

    private UInt64Value() {
    }

    public void clearValue() {
        this.value_ = 0L;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cg3 newBuilder() {
        return (cg3) DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt64Value of(long j) {
        return (UInt64Value) newBuilder().setValue(j).build();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(long j) {
        this.value_ = j;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (h1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new UInt64Value();
            case 2:
                return new cg3(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (UInt64Value.class) {
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

    @Override // defpackage.dg3
    public long getValue() {
        return this.value_;
    }

    public static cg3 newBuilder(UInt64Value uInt64Value) {
        return (cg3) DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (UInt64Value) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static UInt64Value parseFrom(g gVar) throws he1 {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static UInt64Value parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static UInt64Value parseFrom(byte[] bArr) throws he1 {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static UInt64Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static UInt64Value parseFrom(m mVar) throws IOException {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static UInt64Value parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (UInt64Value) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
