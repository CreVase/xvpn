package com.google.protobuf;

import defpackage.c23;
import defpackage.d23;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class StringValue extends o0 implements d23 {
    private static final StringValue DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        o0.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c23 newBuilder() {
        return (c23) DEFAULT_INSTANCE.createBuilder();
    }

    public static StringValue of(String str) {
        return (StringValue) newBuilder().setValue(str).build();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    public void setValueBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.value_ = gVar.toStringUtf8();
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (b1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new StringValue();
            case 2:
                return new c23(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (StringValue.class) {
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

    @Override // defpackage.d23
    public String getValue() {
        return this.value_;
    }

    @Override // defpackage.d23
    public g getValueBytes() {
        return g.copyFromUtf8(this.value_);
    }

    public static c23 newBuilder(StringValue stringValue) {
        return (c23) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (StringValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static StringValue parseFrom(g gVar) throws he1 {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static StringValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static StringValue parseFrom(byte[] bArr) throws he1 {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static StringValue parseFrom(m mVar) throws IOException {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static StringValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (StringValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
