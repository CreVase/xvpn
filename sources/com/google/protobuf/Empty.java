package com.google.protobuf;

import defpackage.er0;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.wq0;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Empty extends o0 implements er0 {
    private static final Empty DEFAULT_INSTANCE;
    private static volatile s42 PARSER;

    static {
        Empty empty = new Empty();
        DEFAULT_INSTANCE = empty;
        o0.registerDefaultInstance(Empty.class, empty);
    }

    private Empty() {
    }

    public static Empty getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wq0 newBuilder() {
        return (wq0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Empty parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Empty) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (a0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Empty();
            case 2:
                return new wq0(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Empty.class) {
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

    public static wq0 newBuilder(Empty empty) {
        return (wq0) DEFAULT_INSTANCE.createBuilder(empty);
    }

    public static Empty parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Empty) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Empty parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Empty parseFrom(g gVar) throws he1 {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Empty parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Empty parseFrom(byte[] bArr) throws he1 {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Empty parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Empty parseFrom(InputStream inputStream) throws IOException {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Empty parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Empty parseFrom(m mVar) throws IOException {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Empty parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Empty) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
