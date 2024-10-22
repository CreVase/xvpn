package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.s42;
import defpackage.xu0;
import defpackage.yw1;
import defpackage.zw1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class Mixin extends o0 implements zw1 {
    private static final Mixin DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile s42 PARSER = null;
    public static final int ROOT_FIELD_NUMBER = 2;
    private String name_ = "";
    private String root_ = "";

    static {
        Mixin mixin = new Mixin();
        DEFAULT_INSTANCE = mixin;
        o0.registerDefaultInstance(Mixin.class, mixin);
    }

    private Mixin() {
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearRoot() {
        this.root_ = getDefaultInstance().getRoot();
    }

    public static Mixin getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static yw1 newBuilder() {
        return (yw1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Mixin) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.name_ = gVar.toStringUtf8();
    }

    public void setRoot(String str) {
        str.getClass();
        this.root_ = str;
    }

    public void setRootBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.root_ = gVar.toStringUtf8();
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (y0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Mixin();
            case 2:
                return new yw1(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "root_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Mixin.class) {
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

    @Override // defpackage.zw1
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.zw1
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.zw1
    public String getRoot() {
        return this.root_;
    }

    @Override // defpackage.zw1
    public g getRootBytes() {
        return g.copyFromUtf8(this.root_);
    }

    public static yw1 newBuilder(Mixin mixin) {
        return (yw1) DEFAULT_INSTANCE.createBuilder(mixin);
    }

    public static Mixin parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Mixin) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Mixin parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Mixin parseFrom(g gVar) throws he1 {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public static Mixin parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Mixin parseFrom(byte[] bArr) throws he1 {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Mixin parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Mixin parseFrom(InputStream inputStream) throws IOException {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Mixin parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Mixin parseFrom(m mVar) throws IOException {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Mixin parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Mixin) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
