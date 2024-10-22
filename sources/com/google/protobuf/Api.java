package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.nx2;
import defpackage.o32;
import defpackage.o43;
import defpackage.s42;
import defpackage.sw1;
import defpackage.vb;
import defpackage.wd1;
import defpackage.xb;
import defpackage.xu0;
import defpackage.zw1;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Api extends o0 implements xb {
    private static final Api DEFAULT_INSTANCE;
    public static final int METHODS_FIELD_NUMBER = 2;
    public static final int MIXINS_FIELD_NUMBER = 6;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile s42 PARSER = null;
    public static final int SOURCE_CONTEXT_FIELD_NUMBER = 5;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    public static final int VERSION_FIELD_NUMBER = 4;
    private SourceContext sourceContext_;
    private int syntax_;
    private String name_ = "";
    private wd1 methods_ = o0.emptyProtobufList();
    private wd1 options_ = o0.emptyProtobufList();
    private String version_ = "";
    private wd1 mixins_ = o0.emptyProtobufList();

    static {
        Api api = new Api();
        DEFAULT_INSTANCE = api;
        o0.registerDefaultInstance(Api.class, api);
    }

    private Api() {
    }

    public void addAllMethods(Iterable<? extends Method> iterable) {
        ensureMethodsIsMutable();
        a.addAll((Iterable) iterable, (List) this.methods_);
    }

    public void addAllMixins(Iterable<? extends Mixin> iterable) {
        ensureMixinsIsMutable();
        a.addAll((Iterable) iterable, (List) this.mixins_);
    }

    public void addAllOptions(Iterable<? extends Option> iterable) {
        ensureOptionsIsMutable();
        a.addAll((Iterable) iterable, (List) this.options_);
    }

    public void addMethods(Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(method);
    }

    public void addMixins(Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(mixin);
    }

    public void addOptions(Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(option);
    }

    public void clearMethods() {
        this.methods_ = o0.emptyProtobufList();
    }

    public void clearMixins() {
        this.mixins_ = o0.emptyProtobufList();
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

    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureMethodsIsMutable() {
        wd1 wd1Var = this.methods_;
        if (!wd1Var.isModifiable()) {
            this.methods_ = o0.mutableCopy(wd1Var);
        }
    }

    private void ensureMixinsIsMutable() {
        wd1 wd1Var = this.mixins_;
        if (!wd1Var.isModifiable()) {
            this.mixins_ = o0.mutableCopy(wd1Var);
        }
    }

    private void ensureOptionsIsMutable() {
        wd1 wd1Var = this.options_;
        if (!wd1Var.isModifiable()) {
            this.options_ = o0.mutableCopy(wd1Var);
        }
    }

    public static Api getDefaultInstance() {
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

    public static vb newBuilder() {
        return (vb) DEFAULT_INSTANCE.createBuilder();
    }

    public static Api parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Api) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    public void removeMethods(int i) {
        ensureMethodsIsMutable();
        this.methods_.remove(i);
    }

    public void removeMixins(int i) {
        ensureMixinsIsMutable();
        this.mixins_.remove(i);
    }

    public void removeOptions(int i) {
        ensureOptionsIsMutable();
        this.options_.remove(i);
    }

    public void setMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.set(i, method);
    }

    public void setMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.set(i, mixin);
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

    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    public void setVersionBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.version_ = gVar.toStringUtf8();
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        switch (c.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Api();
            case 2:
                return new vb(null);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\u001b\u0003\u001b\u0004Ȉ\u0005\t\u0006\u001b\u0007\f", new Object[]{"name_", "methods_", Method.class, "options_", Option.class, "version_", "sourceContext_", "mixins_", Mixin.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Api.class) {
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

    @Override // defpackage.xb
    public Method getMethods(int i) {
        return (Method) this.methods_.get(i);
    }

    @Override // defpackage.xb
    public int getMethodsCount() {
        return this.methods_.size();
    }

    @Override // defpackage.xb
    public List<Method> getMethodsList() {
        return this.methods_;
    }

    public sw1 getMethodsOrBuilder(int i) {
        return (sw1) this.methods_.get(i);
    }

    public List<? extends sw1> getMethodsOrBuilderList() {
        return this.methods_;
    }

    @Override // defpackage.xb
    public Mixin getMixins(int i) {
        return (Mixin) this.mixins_.get(i);
    }

    @Override // defpackage.xb
    public int getMixinsCount() {
        return this.mixins_.size();
    }

    @Override // defpackage.xb
    public List<Mixin> getMixinsList() {
        return this.mixins_;
    }

    public zw1 getMixinsOrBuilder(int i) {
        return (zw1) this.mixins_.get(i);
    }

    public List<? extends zw1> getMixinsOrBuilderList() {
        return this.mixins_;
    }

    @Override // defpackage.xb
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.xb
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.xb
    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    @Override // defpackage.xb
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // defpackage.xb
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public o32 getOptionsOrBuilder(int i) {
        return (o32) this.options_.get(i);
    }

    public List<? extends o32> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // defpackage.xb
    public SourceContext getSourceContext() {
        SourceContext sourceContext = this.sourceContext_;
        if (sourceContext == null) {
            return SourceContext.getDefaultInstance();
        }
        return sourceContext;
    }

    @Override // defpackage.xb
    public o43 getSyntax() {
        o43 forNumber = o43.forNumber(this.syntax_);
        if (forNumber == null) {
            return o43.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // defpackage.xb
    public int getSyntaxValue() {
        return this.syntax_;
    }

    @Override // defpackage.xb
    public String getVersion() {
        return this.version_;
    }

    @Override // defpackage.xb
    public g getVersionBytes() {
        return g.copyFromUtf8(this.version_);
    }

    @Override // defpackage.xb
    public boolean hasSourceContext() {
        if (this.sourceContext_ != null) {
            return true;
        }
        return false;
    }

    public static vb newBuilder(Api api) {
        return (vb) DEFAULT_INSTANCE.createBuilder(api);
    }

    public static Api parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Api) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Api parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Api parseFrom(g gVar) throws he1 {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    public void addMethods(int i, Method method) {
        method.getClass();
        ensureMethodsIsMutable();
        this.methods_.add(i, method);
    }

    public void addMixins(int i, Mixin mixin) {
        mixin.getClass();
        ensureMixinsIsMutable();
        this.mixins_.add(i, mixin);
    }

    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Api parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Api parseFrom(byte[] bArr) throws he1 {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Api parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Api parseFrom(InputStream inputStream) throws IOException {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Api parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Api parseFrom(m mVar) throws IOException {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Api parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Api) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
