package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.hm0;
import defpackage.im0;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class DoubleValue extends o0 implements im0 {
    private static final DoubleValue DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private double value_;

    static {
        DoubleValue doubleValue = new DoubleValue();
        DEFAULT_INSTANCE = doubleValue;
        o0.registerDefaultInstance(DoubleValue.class, doubleValue);
    }

    private DoubleValue() {
    }

    public void clearValue() {
        this.value_ = 0.0d;
    }

    public static DoubleValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hm0 newBuilder() {
        return (hm0) DEFAULT_INSTANCE.createBuilder();
    }

    public static DoubleValue of(double d) {
        return (DoubleValue) newBuilder().setValue(d).build();
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(double d) {
        this.value_ = d;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (y.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new DoubleValue();
            case 2:
                return new hm0(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (DoubleValue.class) {
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

    @Override // defpackage.im0
    public double getValue() {
        return this.value_;
    }

    public static hm0 newBuilder(DoubleValue doubleValue) {
        return (hm0) DEFAULT_INSTANCE.createBuilder(doubleValue);
    }

    public static DoubleValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (DoubleValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static DoubleValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static DoubleValue parseFrom(g gVar) throws he1 {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static DoubleValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static DoubleValue parseFrom(byte[] bArr) throws he1 {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DoubleValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static DoubleValue parseFrom(InputStream inputStream) throws IOException {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DoubleValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static DoubleValue parseFrom(m mVar) throws IOException {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static DoubleValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (DoubleValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
