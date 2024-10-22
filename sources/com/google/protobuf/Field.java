package com.google.protobuf;

import defpackage.fw0;
import defpackage.h51;
import defpackage.he1;
import defpackage.iw0;
import defpackage.k51;
import defpackage.lw0;
import defpackage.o32;
import defpackage.s42;
import defpackage.sw0;
import defpackage.wd1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Field extends o0 implements sw0 {
    public static final int CARDINALITY_FIELD_NUMBER = 2;
    private static final Field DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 11;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int KIND_FIELD_NUMBER = 1;
    public static final int NAME_FIELD_NUMBER = 4;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 7;
    public static final int OPTIONS_FIELD_NUMBER = 9;
    public static final int PACKED_FIELD_NUMBER = 8;
    private static volatile s42 PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 6;
    private int cardinality_;
    private int kind_;
    private int number_;
    private int oneofIndex_;
    private boolean packed_;
    private String name_ = "";
    private String typeUrl_ = "";
    private wd1 options_ = o0.emptyProtobufList();
    private String jsonName_ = "";
    private String defaultValue_ = "";

    static {
        Field field = new Field();
        DEFAULT_INSTANCE = field;
        o0.registerDefaultInstance(Field.class, field);
    }

    private Field() {
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
    public void clearCardinality() {
        this.cardinality_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = 0;
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
    public void clearOneofIndex() {
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = o0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeUrl() {
        this.typeUrl_ = getDefaultInstance().getTypeUrl();
    }

    private void ensureOptionsIsMutable() {
        wd1 wd1Var = this.options_;
        if (!wd1Var.isModifiable()) {
            this.options_ = o0.mutableCopy(wd1Var);
        }
    }

    public static Field getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static fw0 newBuilder() {
        return (fw0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Field parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Field) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setCardinality(iw0 iw0Var) {
        this.cardinality_ = iw0Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCardinalityValue(int i) {
        this.cardinality_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.defaultValue_ = gVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.jsonName_ = gVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(lw0 lw0Var) {
        this.kind_ = lw0Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindValue(int i) {
        this.kind_ = i;
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
    public void setOneofIndex(int i) {
        this.oneofIndex_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z) {
        this.packed_ = z;
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

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        f0 f0Var = null;
        switch (f0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Field();
            case 2:
                return new fw0(f0Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0000\u0001\u000b\n\u0000\u0001\u0000\u0001\f\u0002\f\u0003\u0004\u0004Ȉ\u0006Ȉ\u0007\u0004\b\u0007\t\u001b\nȈ\u000bȈ", new Object[]{"kind_", "cardinality_", "number_", "name_", "typeUrl_", "oneofIndex_", "packed_", "options_", Option.class, "jsonName_", "defaultValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Field.class) {
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

    @Override // defpackage.sw0
    public iw0 getCardinality() {
        iw0 forNumber = iw0.forNumber(this.cardinality_);
        if (forNumber == null) {
            return iw0.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // defpackage.sw0
    public int getCardinalityValue() {
        return this.cardinality_;
    }

    @Override // defpackage.sw0
    public String getDefaultValue() {
        return this.defaultValue_;
    }

    @Override // defpackage.sw0
    public g getDefaultValueBytes() {
        return g.copyFromUtf8(this.defaultValue_);
    }

    @Override // defpackage.sw0
    public String getJsonName() {
        return this.jsonName_;
    }

    @Override // defpackage.sw0
    public g getJsonNameBytes() {
        return g.copyFromUtf8(this.jsonName_);
    }

    @Override // defpackage.sw0
    public lw0 getKind() {
        lw0 forNumber = lw0.forNumber(this.kind_);
        if (forNumber == null) {
            return lw0.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // defpackage.sw0
    public int getKindValue() {
        return this.kind_;
    }

    @Override // defpackage.sw0
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.sw0
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.sw0
    public int getNumber() {
        return this.number_;
    }

    @Override // defpackage.sw0
    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    @Override // defpackage.sw0
    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    @Override // defpackage.sw0
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // defpackage.sw0
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public o32 getOptionsOrBuilder(int i) {
        return (o32) this.options_.get(i);
    }

    public List<? extends o32> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // defpackage.sw0
    public boolean getPacked() {
        return this.packed_;
    }

    @Override // defpackage.sw0
    public String getTypeUrl() {
        return this.typeUrl_;
    }

    @Override // defpackage.sw0
    public g getTypeUrlBytes() {
        return g.copyFromUtf8(this.typeUrl_);
    }

    public static fw0 newBuilder(Field field) {
        return (fw0) DEFAULT_INSTANCE.createBuilder(field);
    }

    public static Field parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Field) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Field parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Field parseFrom(g gVar) throws he1 {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Field parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Field parseFrom(byte[] bArr) throws he1 {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Field parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Field parseFrom(InputStream inputStream) throws IOException {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Field parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Field parseFrom(m mVar) throws IOException {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Field parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Field) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
