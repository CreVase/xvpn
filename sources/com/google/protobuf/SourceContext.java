package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.nx2;
import defpackage.ox2;
import defpackage.s42;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class SourceContext extends o0 implements ox2 {
    private static final SourceContext DEFAULT_INSTANCE;
    public static final int FILE_NAME_FIELD_NUMBER = 1;
    private static volatile s42 PARSER;
    private String fileName_ = "";

    static {
        SourceContext sourceContext = new SourceContext();
        DEFAULT_INSTANCE = sourceContext;
        o0.registerDefaultInstance(SourceContext.class, sourceContext);
    }

    private SourceContext() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFileName() {
        this.fileName_ = getDefaultInstance().getFileName();
    }

    public static SourceContext getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static nx2 newBuilder() {
        return (nx2) DEFAULT_INSTANCE.createBuilder();
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (SourceContext) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileName(String str) {
        str.getClass();
        this.fileName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFileNameBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.fileName_ = gVar.toStringUtf8();
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        a1 a1Var = null;
        switch (a1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new SourceContext();
            case 2:
                return new nx2(a1Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"fileName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (SourceContext.class) {
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

    @Override // defpackage.ox2
    public String getFileName() {
        return this.fileName_;
    }

    @Override // defpackage.ox2
    public g getFileNameBytes() {
        return g.copyFromUtf8(this.fileName_);
    }

    public static nx2 newBuilder(SourceContext sourceContext) {
        return (nx2) DEFAULT_INSTANCE.createBuilder(sourceContext);
    }

    public static SourceContext parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (SourceContext) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static SourceContext parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static SourceContext parseFrom(g gVar) throws he1 {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static SourceContext parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static SourceContext parseFrom(byte[] bArr) throws he1 {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SourceContext parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static SourceContext parseFrom(InputStream inputStream) throws IOException {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SourceContext parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static SourceContext parseFrom(m mVar) throws IOException {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static SourceContext parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (SourceContext) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
