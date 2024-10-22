package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.k51;
import defpackage.o32;
import defpackage.o43;
import defpackage.qw1;
import defpackage.s42;
import defpackage.sw1;
import defpackage.wd1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class Method extends o0 implements sw1 {
    private static final Method DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 6;
    private static volatile s42 PARSER = null;
    public static final int REQUEST_STREAMING_FIELD_NUMBER = 3;
    public static final int REQUEST_TYPE_URL_FIELD_NUMBER = 2;
    public static final int RESPONSE_STREAMING_FIELD_NUMBER = 5;
    public static final int RESPONSE_TYPE_URL_FIELD_NUMBER = 4;
    public static final int SYNTAX_FIELD_NUMBER = 7;
    private boolean requestStreaming_;
    private boolean responseStreaming_;
    private int syntax_;
    private String name_ = "";
    private String requestTypeUrl_ = "";
    private String responseTypeUrl_ = "";
    private wd1 options_ = o0.emptyProtobufList();

    static {
        Method method = new Method();
        DEFAULT_INSTANCE = method;
        o0.registerDefaultInstance(Method.class, method);
    }

    private Method() {
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
    public void clearOptions() {
        this.options_ = o0.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestStreaming() {
        this.requestStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestTypeUrl() {
        this.requestTypeUrl_ = getDefaultInstance().getRequestTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseStreaming() {
        this.responseStreaming_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseTypeUrl() {
        this.responseTypeUrl_ = getDefaultInstance().getResponseTypeUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSyntax() {
        this.syntax_ = 0;
    }

    private void ensureOptionsIsMutable() {
        wd1 wd1Var = this.options_;
        if (!wd1Var.isModifiable()) {
            this.options_ = o0.mutableCopy(wd1Var);
        }
    }

    public static Method getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qw1 newBuilder() {
        return (qw1) DEFAULT_INSTANCE.createBuilder();
    }

    public static Method parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Method) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.set(i, option);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestStreaming(boolean z) {
        this.requestStreaming_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrl(String str) {
        str.getClass();
        this.requestTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestTypeUrlBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.requestTypeUrl_ = gVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseStreaming(boolean z) {
        this.responseStreaming_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrl(String str) {
        str.getClass();
        this.responseTypeUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseTypeUrlBytes(g gVar) {
        a.checkByteStringIsUtf8(gVar);
        this.responseTypeUrl_ = gVar.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntax(o43 o43Var) {
        this.syntax_ = o43Var.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSyntaxValue(int i) {
        this.syntax_ = i;
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        x0 x0Var = null;
        switch (x0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new Method();
            case 2:
                return new qw1(x0Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u0007\u0004Ȉ\u0005\u0007\u0006\u001b\u0007\f", new Object[]{"name_", "requestTypeUrl_", "requestStreaming_", "responseTypeUrl_", "responseStreaming_", "options_", Option.class, "syntax_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (Method.class) {
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

    @Override // defpackage.sw1
    public String getName() {
        return this.name_;
    }

    @Override // defpackage.sw1
    public g getNameBytes() {
        return g.copyFromUtf8(this.name_);
    }

    @Override // defpackage.sw1
    public Option getOptions(int i) {
        return (Option) this.options_.get(i);
    }

    @Override // defpackage.sw1
    public int getOptionsCount() {
        return this.options_.size();
    }

    @Override // defpackage.sw1
    public List<Option> getOptionsList() {
        return this.options_;
    }

    public o32 getOptionsOrBuilder(int i) {
        return (o32) this.options_.get(i);
    }

    public List<? extends o32> getOptionsOrBuilderList() {
        return this.options_;
    }

    @Override // defpackage.sw1
    public boolean getRequestStreaming() {
        return this.requestStreaming_;
    }

    @Override // defpackage.sw1
    public String getRequestTypeUrl() {
        return this.requestTypeUrl_;
    }

    @Override // defpackage.sw1
    public g getRequestTypeUrlBytes() {
        return g.copyFromUtf8(this.requestTypeUrl_);
    }

    @Override // defpackage.sw1
    public boolean getResponseStreaming() {
        return this.responseStreaming_;
    }

    @Override // defpackage.sw1
    public String getResponseTypeUrl() {
        return this.responseTypeUrl_;
    }

    @Override // defpackage.sw1
    public g getResponseTypeUrlBytes() {
        return g.copyFromUtf8(this.responseTypeUrl_);
    }

    @Override // defpackage.sw1
    public o43 getSyntax() {
        o43 forNumber = o43.forNumber(this.syntax_);
        if (forNumber == null) {
            return o43.UNRECOGNIZED;
        }
        return forNumber;
    }

    @Override // defpackage.sw1
    public int getSyntaxValue() {
        return this.syntax_;
    }

    public static qw1 newBuilder(Method method) {
        return (qw1) DEFAULT_INSTANCE.createBuilder(method);
    }

    public static Method parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Method) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Method parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static Method parseFrom(g gVar) throws he1 {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOptions(int i, Option option) {
        option.getClass();
        ensureOptionsIsMutable();
        this.options_.add(i, option);
    }

    public static Method parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static Method parseFrom(byte[] bArr) throws he1 {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Method parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static Method parseFrom(InputStream inputStream) throws IOException {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Method parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static Method parseFrom(m mVar) throws IOException {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static Method parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (Method) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
