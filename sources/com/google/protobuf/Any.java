package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.tb;
import defpackage.ub;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Any extends o0 implements ub {
    private static final Any DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private String typeUrl_ = "";
    private g value_ = g.EMPTY;

    static {
        Any any = new Any();
        DEFAULT_INSTANCE = any;
        o0.registerDefaultInstance(Any.class, any);
    }

    private Any() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static Any getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static tb newBuilder() {
        return (tb) DEFAULT_INSTANCE.createBuilder();
    }

    public static Any parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Any) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrl(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeUrlBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.typeUrl_ = gVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        b bVar = null;
        switch (b.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Any();
            case 2:
                return new tb(bVar);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"typeUrl_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Any.class) {
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

    @Override // defpackage.ub
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // defpackage.ub
    public g getTypeUrlBytes() {
        return g.copyFromUtf8(this.typeUrl_);
    }

    @Override // defpackage.ub
    public g getValue() {
        return this.value_;
    }

    public static tb newBuilder(Any any) {
        return (tb) DEFAULT_INSTANCE.createBuilder(any);
    }

    public static Any parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Any) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Any parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Any parseFrom(g gVar) throws he1 {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Any parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Any parseFrom(byte[] bArr) throws he1 {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Any parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Any parseFrom(InputStream inputStream) throws IOException {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Any parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Any parseFrom(m mVar) throws IOException {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Any parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Any) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
