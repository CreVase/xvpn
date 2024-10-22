package com.google.protobuf;

import defpackage.gf3;
import defpackage.h51;
import defpackage.he1;
import defpackage.hf3;
import defpackage.k51;
import defpackage.nx2;
import defpackage.o32;
import defpackage.o43;
import defpackage.s42;
import defpackage.sw0;
import defpackage.wd1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Type extends o0 implements hf3 {
    private static final Type DEFAULT_INSTANCE;
    public static final int FIELDS_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int ONEOFS_FIELD_NUMBER = 3;
    public static final int OPTIONS_FIELD_NUMBER = 4;
    private static volatile s42 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 6;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private wd1 fields_ = o0.emptyProtobufList();
    private wd1 oneofs_ = o0.emptyProtobufList();
    private wd1 options_ = o0.emptyProtobufList();

    static {
        Type type = new Type();
        DEFAULT_INSTANCE = type;
        o0.registerDefaultInstance(Type.class, type);
    }

    private Type() {
    }

    public void addAllFields(Iterable<? extends Field> iterable) {
        ensureFieldsIsMutable();
        a.addAll((Iterable) iterable, (List) this.fields_);
    }

    public void addAllOneofs(Iterable<String> iterable) {
        ensureOneofsIsMutable();
        a.addAll((Iterable) iterable, (List) this.oneofs_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        a.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addFields(Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(field);
    }

    public void addOneofs(String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.add(str);
    }

    public void addOneofsBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        ensureOneofsIsMutable();
        this.oneofs_.add(gVar.toStringUtf8());
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearFields() {
        this.fields_ = o0.emptyProtobufList();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    public void clearOneofs() {
        this.oneofs_ = o0.emptyProtobufList();
    }

    public void clearOptions() {
        this.options_ = o0.emptyProtobufList();
    }

    public void clearSourceContext() {
        this.sourceContext_ = null;
    }

    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureFieldsIsMutable() {
        wd1 wd1Var = this.fields_;
        if (!wd1Var.isModifiable()) {
            this.fields_ = o0.mutableCopy(wd1Var);
        }
    }

    private void ensureOneofsIsMutable() {
        wd1 wd1Var = this.oneofs_;
        if (!wd1Var.isModifiable()) {
            this.oneofs_ = o0.mutableCopy(wd1Var);
        }
    }

    private void ensureOptionsIsMutable() {
        wd1 wd1Var = this.options_;
        if (!wd1Var.isModifiable()) {
            this.options_ = o0.mutableCopy(wd1Var);
        }
    }

    public static Type getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public void mergeSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        SourceContext sourceContext2 = this.sourceContext_;
        if (sourceContext2 != null && sourceContext2 != SourceContext.getDefaultInstance()) {
            this.sourceContext_ = (SourceContext) ((nx2) SourceContext.newBuilder(this.sourceContext_).mergeFrom((o0) sourceContext)).buildPartial();
        } else {
            this.sourceContext_ = sourceContext;
        }
    }

    public static gf3 newBuilder() {
        return (gf3) DEFAULT_INSTANCE.createBuilder();
    }

    public static Type parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Type) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeFields(int i) {
        ensureFieldsIsMutable();
        this.fields_.remove(i);
    }

    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public void setFields(int i, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.set(i, field);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.name_ = gVar.toStringUtf8();
    }

    public void setOneofs(int i, String str) {
        str.getClass();
        ensureOneofsIsMutable();
        this.oneofs_.set(i, str);
    }

    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    public void setSourceContext(SourceContext sourceContext) {
        sourceContext.getClass();
        this.sourceContext_ = sourceContext;
    }

    public void setSyntax(o43 o43Var) {
        this.syntax_ = o43Var.getNumber();
    }

    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (f1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Type();
            case 2:
                return new gf3(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003Ț\u0004\u001b\u0005\t\u0006\f", new Object[]{"name_", "fields_", Field.class, "oneofs_", "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Type.class) {
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

    @Override // defpackage.hf3
    public Field getFields(int i) {
        return (Field) this.fields_.get(i);
    }

    @Override // defpackage.hf3
    public int getFieldsCount() {
        return this.fields_.size();
    }

    @Override // defpackage.hf3
    public List<Field> getFieldsList() {
        return this.fields_;
    }

    public sw0 getFieldsOrBuilder(int i) {
        return (sw0) this.fields_.get(i);
    }

    public List<? extends sw0> getFieldsOrBuilderList() {
        return this.fields_;
    }

    @Override // defpackage.hf3
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.hf3
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.hf3
    public String getOneofs(int i) {
        return (String) this.oneofs_.get(i);
    }

    @Override // defpackage.hf3
    public g getOneofsBytes(int i) {
        return g.copyFromUtf8((String) this.oneofs_.get(i));
    }

    @Override // defpackage.hf3
    public int getOneofsCount() {
        return this.oneofs_.size();
    }

    @Override // defpackage.hf3
    public List<String> getOneofsList() {
        return this.oneofs_;
    }

    @Override // defpackage.hf3
    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    @Override // defpackage.hf3
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // defpackage.hf3
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public o32 getOptionsOrBuilder(int i) {
        return (o32) this.options_.get(i);
    }

    public List<? extends o32> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // defpackage.hf3
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // defpackage.hf3
    public o43 getSyntax() {
        o43 forNumber = o43.forNumber(this.syntax_);
        if (forNumber == null) {
            return o43.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // defpackage.hf3
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // defpackage.hf3
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static gf3 newBuilder(Type type) {
        return (gf3) DEFAULT_INSTANCE.createBuilder(type);
    }

    public static Type parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Type) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Type parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Type parseFrom(g gVar) throws he1 {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public void addFields(int i, Field field) {
        field.getClass();
        ensureFieldsIsMutable();
        this.fields_.add(i, field);
    }

    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Type parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Type parseFrom(byte[] bArr) throws he1 {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Type parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Type parseFrom(InputStream inputStream) throws IOException {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Type parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Type parseFrom(m mVar) throws IOException {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Type parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Type) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
