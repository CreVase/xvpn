package com.google.protobuf;

import defpackage.ag3;
import defpackage.bg3;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class UInt32Value extends o0 implements bg3 {
    private static final UInt32Value DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;

    static {
        UInt32Value uInt32Value = new UInt32Value();
        DEFAULT_INSTANCE = uInt32Value;
        o0.registerDefaultInstance(UInt32Value.class, uInt32Value);
    }

    private UInt32Value() {
    }

    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt32Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ag3 newBuilder() {
        return (ag3) DEFAULT_INSTANCE.createBuilder();
    }

    public static UInt32Value of(int i) {
        return (UInt32Value) newBuilder().setValue(i).build();
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(int i) {
        this.value_ = i;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (g1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new UInt32Value();
            case 2:
                return new ag3(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (UInt32Value.class) {
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

    @Override // defpackage.bg3
    public int getValue() {
        return this.value_;
    }

    public static ag3 newBuilder(UInt32Value uInt32Value) {
        return (ag3) DEFAULT_INSTANCE.createBuilder(uInt32Value);
    }

    public static UInt32Value parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (UInt32Value) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static UInt32Value parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static UInt32Value parseFrom(g gVar) throws he1 {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static UInt32Value parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static UInt32Value parseFrom(byte[] bArr) throws he1 {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt32Value parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static UInt32Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt32Value parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static UInt32Value parseFrom(m mVar) throws IOException {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static UInt32Value parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (UInt32Value) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
