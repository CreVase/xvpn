package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.n32;
import defpackage.o32;
import defpackage.s42;
import defpackage.tb;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Option extends o0 implements o32 {
    private static final Option DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile s42 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String name_ = "";
    private Any value_;

    static {
        Option option = new Option();
        DEFAULT_INSTANCE = option;
        o0.registerDefaultInstance(Option.class, option);
    }

    private Option() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
    }

    public static Option getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(Any any) {
        any.getClass();
        Any any2 = this.value_;
        if (any2 != null && any2 != Any.getDefaultInstance()) {
            this.value_ = (Any) ((tb) Any.newBuilder(this.value_).mergeFrom((o0) any)).buildPartial();
        } else {
            this.value_ = any;
        }
    }

    public static n32 newBuilder() {
        return (n32) DEFAULT_INSTANCE.createBuilder();
    }

    public static Option parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Option) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.name_ = gVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(Any any) {
        any.getClass();
        this.value_ = any;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        z0 z0Var = null;
        switch (z0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Option();
            case 2:
                return new n32(z0Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"name_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Option.class) {
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

    @Override // defpackage.o32
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.o32
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.o32
    public Any getValue() {
        Any any = this.value_;
        if (any == null) {
            return Any.getDefaultInstance();
        }
        return any;
    }

    @Override // defpackage.o32
    public boolean hasValue() {
        if (this.value_ != null) {
            return true;
        }
        return false;
    }

    public static n32 newBuilder(Option option) {
        return (n32) DEFAULT_INSTANCE.createBuilder(option);
    }

    public static Option parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Option) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Option parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Option parseFrom(g gVar) throws he1 {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Option parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Option parseFrom(byte[] bArr) throws he1 {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Option parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Option parseFrom(InputStream inputStream) throws IOException {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Option parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Option parseFrom(m mVar) throws IOException {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Option parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Option) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
