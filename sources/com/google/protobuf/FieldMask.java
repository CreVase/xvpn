package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.qw0;
import defpackage.rw0;
import defpackage.s42;
import defpackage.wd1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class FieldMask extends o0 implements rw0 {
    private static final FieldMask DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int PATHS_FIELD_NUMBER = 1;
    private wd1 paths_ = o0.emptyProtobufList();

    static {
        FieldMask fieldMask = new FieldMask();
        DEFAULT_INSTANCE = fieldMask;
        o0.registerDefaultInstance(FieldMask.class, fieldMask);
    }

    private FieldMask() {
    }

    public void addAllPaths(Iterable<String> iterable) {
        ensurePathsIsMutable();
        a.addAll((Iterable) iterable, (List) this.paths_);
    }

    public void addPaths(String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.add(str);
    }

    public void addPathsBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        ensurePathsIsMutable();
        this.paths_.add(gVar.toStringUtf8());
    }

    public void clearPaths() {
        this.paths_ = o0.emptyProtobufList();
    }

    private void ensurePathsIsMutable() {
        wd1 wd1Var = this.paths_;
        if (!wd1Var.isModifiable()) {
            this.paths_ = o0.mutableCopy(wd1Var);
        }
    }

    public static FieldMask getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qw0 newBuilder() {
        return (qw0) DEFAULT_INSTANCE.createBuilder();
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (FieldMask) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setPaths(int i, String str) {
        str.getClass();
        ensurePathsIsMutable();
        this.paths_.set(i, str);
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (g0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new FieldMask();
            case 2:
                return new qw0(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"paths_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (FieldMask.class) {
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

    @Override // defpackage.rw0
    public String getPaths(int i) {
        return (String) this.paths_.get(i);
    }

    @Override // defpackage.rw0
    public g getPathsBytes(int i) {
        return g.copyFromUtf8((String) this.paths_.get(i));
    }

    @Override // defpackage.rw0
    public int getPathsCount() {
        return this.paths_.size();
    }

    @Override // defpackage.rw0
    public List<String> getPathsList() {
        return this.paths_;
    }

    public static qw0 newBuilder(FieldMask fieldMask) {
        return (qw0) DEFAULT_INSTANCE.createBuilder(fieldMask);
    }

    public static FieldMask parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (FieldMask) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static FieldMask parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static FieldMask parseFrom(g gVar) throws he1 {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static FieldMask parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static FieldMask parseFrom(byte[] bArr) throws he1 {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static FieldMask parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static FieldMask parseFrom(InputStream inputStream) throws IOException {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static FieldMask parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static FieldMask parseFrom(m mVar) throws IOException {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static FieldMask parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (FieldMask) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
