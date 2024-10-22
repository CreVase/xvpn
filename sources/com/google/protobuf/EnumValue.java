package com.google.protobuf;

import defpackage.bs0;
import defpackage.cs0;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.o32;
import defpackage.s42;
import defpackage.wd1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class EnumValue extends o0 implements cs0 {
    private static final EnumValue DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 2;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile s42 PARSER;
    private int number_;
    private String name_ = "";
    private wd1 options_ = o0.emptyProtobufList();

    static {
        EnumValue enumValue = new EnumValue();
        DEFAULT_INSTANCE = enumValue;
        o0.registerDefaultInstance(EnumValue.class, enumValue);
    }

    private EnumValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        a.addAll((Iterable) iterable, (List) this.options_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = o0.emptyProtobufList();
    }

    private void ensureOptionsIsMutable() {
        wd1 wd1Var = this.options_;
        if (!wd1Var.isModifiable()) {
            this.options_ = o0.mutableCopy(wd1Var);
        }
    }

    public static EnumValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bs0 newBuilder() {
        return (bs0) DEFAULT_INSTANCE.createBuilder();
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EnumValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
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
    public void setNumber(int i) {
        this.number_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        c0 c0Var = null;
        switch (c0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new EnumValue();
            case 2:
                return new bs0(c0Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u001b", new Object[]{"name_", "number_", "options_", Option.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (EnumValue.class) {
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

    @Override // defpackage.cs0
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.cs0
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.cs0
    public int getNumber() {
        return this.number_;
    }

    @Override // defpackage.cs0
    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    @Override // defpackage.cs0
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // defpackage.cs0
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public o32 getOptionsOrBuilder(int i) {
        return (o32) this.options_.get(i);
    }

    public List<? extends o32> getOptionsOrBuilderList() {
        return this.options_;
    }

    public static bs0 newBuilder(EnumValue enumValue) {
        return (bs0) DEFAULT_INSTANCE.createBuilder(enumValue);
    }

    public static EnumValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (EnumValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static EnumValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static EnumValue parseFrom(g gVar) throws he1 {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static EnumValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static EnumValue parseFrom(byte[] bArr) throws he1 {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EnumValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static EnumValue parseFrom(InputStream inputStream) throws IOException {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EnumValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static EnumValue parseFrom(m mVar) throws IOException {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static EnumValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (EnumValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
