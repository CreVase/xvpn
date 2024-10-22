package com.google.protobuf;

import defpackage.e93;
import defpackage.g93;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Timestamp extends o0 implements g93 {
    private static final Timestamp DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile s42 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Timestamp timestamp = new Timestamp();
        DEFAULT_INSTANCE = timestamp;
        o0.registerDefaultInstance(Timestamp.class, timestamp);
    }

    private Timestamp() {
    }

    public void clearNanos() {
        this.nanos_ = 0;
    }

    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Timestamp getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static e93 newBuilder() {
        return (e93) DEFAULT_INSTANCE.createBuilder();
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Timestamp) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setNanos(int i) {
        this.nanos_ = i;
    }

    public void setSeconds(long j) {
        this.seconds_ = j;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (e1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Timestamp();
            case 2:
                return new e93(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Timestamp.class) {
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

    @Override // defpackage.g93
    public int getNanos() {
        return this.nanos_;
    }

    @Override // defpackage.g93
    public long getSeconds() {
        return this.seconds_;
    }

    public static e93 newBuilder(Timestamp timestamp) {
        return (e93) DEFAULT_INSTANCE.createBuilder(timestamp);
    }

    public static Timestamp parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Timestamp) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Timestamp parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Timestamp parseFrom(g gVar) throws he1 {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Timestamp parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Timestamp parseFrom(byte[] bArr) throws he1 {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Timestamp parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Timestamp parseFrom(InputStream inputStream) throws IOException {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Timestamp parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Timestamp parseFrom(m mVar) throws IOException {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Timestamp parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Timestamp) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
