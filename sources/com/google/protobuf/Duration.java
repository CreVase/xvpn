package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.oo0;
import defpackage.ro0;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Duration extends o0 implements ro0 {
    private static final Duration DEFAULT_INSTANCE;
    public static final int NANOS_FIELD_NUMBER = 2;
    private static volatile s42 PARSER = null;
    public static final int SECONDS_FIELD_NUMBER = 1;
    private int nanos_;
    private long seconds_;

    static {
        Duration duration = new Duration();
        DEFAULT_INSTANCE = duration;
        o0.registerDefaultInstance(Duration.class, duration);
    }

    private Duration() {
    }

    public void clearNanos() {
        this.nanos_ = 0;
    }

    public void clearSeconds() {
        this.seconds_ = 0L;
    }

    public static Duration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static oo0 newBuilder() {
        return (oo0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Duration parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Duration) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
        switch (z.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Duration();
            case 2:
                return new oo0(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"seconds_", "nanos_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Duration.class) {
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

    @Override // defpackage.ro0
    public int getNanos() {
        return this.nanos_;
    }

    @Override // defpackage.ro0
    public long getSeconds() {
        return this.seconds_;
    }

    public static oo0 newBuilder(Duration duration) {
        return (oo0) DEFAULT_INSTANCE.createBuilder(duration);
    }

    public static Duration parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Duration) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Duration parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Duration parseFrom(g gVar) throws he1 {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Duration parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Duration parseFrom(byte[] bArr) throws he1 {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Duration parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Duration parseFrom(InputStream inputStream) throws IOException {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Duration parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Duration parseFrom(m mVar) throws IOException {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Duration parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Duration) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
