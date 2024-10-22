package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.lq;
import defpackage.mq;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class BoolValue extends o0 implements mq {
    private static final BoolValue DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private boolean value_;

    static {
        BoolValue boolValue = new BoolValue();
        DEFAULT_INSTANCE = boolValue;
        o0.registerDefaultInstance(BoolValue.class, boolValue);
    }

    private BoolValue() {
    }

    public void clearValue() {
        this.value_ = false;
    }

    public static BoolValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static lq newBuilder() {
        return (lq) DEFAULT_INSTANCE.createBuilder();
    }

    public static BoolValue of(boolean z) {
        return (BoolValue) newBuilder().setValue(z).build();
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (BoolValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(boolean z) {
        this.value_ = z;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (f.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new BoolValue();
            case 2:
                return new lq(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (BoolValue.class) {
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

    @Override // defpackage.mq
    public boolean getValue() {
        return this.value_;
    }

    public static lq newBuilder(BoolValue boolValue) {
        return (lq) DEFAULT_INSTANCE.createBuilder(boolValue);
    }

    public static BoolValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (BoolValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static BoolValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static BoolValue parseFrom(g gVar) throws he1 {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static BoolValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static BoolValue parseFrom(byte[] bArr) throws he1 {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static BoolValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static BoolValue parseFrom(InputStream inputStream) throws IOException {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static BoolValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static BoolValue parseFrom(m mVar) throws IOException {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static BoolValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (BoolValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
