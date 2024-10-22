package com.google.protobuf;

import defpackage.cs0;
import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.nx2;
import defpackage.o32;
import defpackage.o43;
import defpackage.s42;
import defpackage.vr0;
import defpackage.wd1;
import defpackage.xu0;
import defpackage.zr0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Enum extends o0 implements zr0 {
    private static final Enum DEFAULT_INSTANCE;
    public static final int ENUMVALUE_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile s42 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 5;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private wd1 enumvalue_ = o0.emptyProtobufList();
    private wd1 options_ = o0.emptyProtobufList();

    static {
        Enum r0 = new Enum();
        DEFAULT_INSTANCE = r0;
        o0.registerDefaultInstance(Enum.class, r0);
    }

    private Enum() {
    }

    public void addAllEnumvalue(Iterable<? extends EnumValue> iterable) {
        ensureEnumvalueIsMutable();
        a.addAll((Iterable) iterable, (List) this.enumvalue_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        a.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addEnumvalue(EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(enumValue);
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearEnumvalue() {
        this.enumvalue_ = o0.emptyProtobufList();
    }

    public void clearName() {
        this.name_ = getDefaultInstance().getName();
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

    private void ensureEnumvalueIsMutable() {
        wd1 wd1Var = this.enumvalue_;
        if (!wd1Var.isModifiable()) {
            this.enumvalue_ = o0.mutableCopy(wd1Var);
        }
    }

    private void ensureOptionsIsMutable() {
        wd1 wd1Var = this.options_;
        if (!wd1Var.isModifiable()) {
            this.options_ = o0.mutableCopy(wd1Var);
        }
    }

    public static Enum getDefaultInstance() {
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

    public static vr0 newBuilder() {
        return (vr0) DEFAULT_INSTANCE.createBuilder();
    }

    public static Enum parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Enum) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeEnumvalue(int i) {
        ensureEnumvalueIsMutable();
        this.enumvalue_.remove(i);
    }

    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public void setEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.set(i, enumValue);
    }

    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    public void setNameBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.name_ = gVar.toStringUtf8();
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
        switch (b0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Enum();
            case 2:
                return new vr0(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0002\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004\t\u0005\f", new Object[]{"name_", "enumvalue_", EnumValue.class, "options_", Option.class, "sourceContext_", "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Enum.class) {
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

    @Override // defpackage.zr0
    public EnumValue getEnumvalue(int i) {
        return (EnumValue) this.enumvalue_.get(i);
    }

    @Override // defpackage.zr0
    public int getEnumvalueCount() {
        return this.enumvalue_.size();
    }

    @Override // defpackage.zr0
    public List<EnumValue> getEnumvalueList() {
        return this.enumvalue_;
    }

    public cs0 getEnumvalueOrBuilder(int i) {
        return (cs0) this.enumvalue_.get(i);
    }

    public List<? extends cs0> getEnumvalueOrBuilderList() {
        return this.enumvalue_;
    }

    @Override // defpackage.zr0
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.zr0
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.zr0
    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    @Override // defpackage.zr0
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // defpackage.zr0
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public o32 getOptionsOrBuilder(int i) {
        return (o32) this.options_.get(i);
    }

    public List<? extends o32> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // defpackage.zr0
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // defpackage.zr0
    public o43 getSyntax() {
        o43 forNumber = o43.forNumber(this.syntax_);
        if (forNumber == null) {
            return o43.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // defpackage.zr0
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // defpackage.zr0
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static vr0 newBuilder(Enum r1) {
        return (vr0) DEFAULT_INSTANCE.createBuilder(r1);
    }

    public static Enum parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Enum) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Enum parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Enum parseFrom(g gVar) throws he1 {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public void addEnumvalue(int i, EnumValue enumValue) {
        enumValue.getClass();
        ensureEnumvalueIsMutable();
        this.enumvalue_.add(i, enumValue);
    }

    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Enum parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Enum parseFrom(byte[] bArr) throws he1 {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Enum parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Enum parseFrom(InputStream inputStream) throws IOException {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Enum parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Enum parseFrom(m mVar) throws IOException {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Enum parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Enum) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
