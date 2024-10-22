package com.google.protobuf;

import defpackage.dz0;
import defpackage.ez0;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class FloatValue extends o0 implements ez0 {
    private static final FloatValue DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private float value_;

    static {
        FloatValue floatValue = new FloatValue();
        DEFAULT_INSTANCE = floatValue;
        o0.registerDefaultInstance(FloatValue.class, floatValue);
    }

    private FloatValue() {
    }

    public void clearValue() {
        this.value_ = 0.0f;
    }

    public static FloatValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static dz0 newBuilder() {
        return (dz0) DEFAULT_INSTANCE.createBuilder();
    }

    public static FloatValue of(float f) {
        return (FloatValue) newBuilder().setValue(f).build();
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FloatValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(float f) {
        this.value_ = f;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (h0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new FloatValue();
            case 2:
                return new dz0(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (FloatValue.class) {
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

    @Override // defpackage.ez0
    public float getValue() {
        return this.value_;
    }

    public static dz0 newBuilder(FloatValue floatValue) {
        return (dz0) DEFAULT_INSTANCE.createBuilder(floatValue);
    }

    public static FloatValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (FloatValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static FloatValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static FloatValue parseFrom(g gVar) throws he1 {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static FloatValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static FloatValue parseFrom(byte[] bArr) throws he1 {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FloatValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static FloatValue parseFrom(InputStream inputStream) throws IOException {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FloatValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static FloatValue parseFrom(m mVar) throws IOException {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static FloatValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (FloatValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
