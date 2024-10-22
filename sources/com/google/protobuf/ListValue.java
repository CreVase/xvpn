package com.google.protobuf;

import defpackage.h51;
import defpackage.he1;
import defpackage.hj3;
import defpackage.il1;
import defpackage.jl1;
import defpackage.k51;
import defpackage.s42;
import defpackage.wd1;
import defpackage.xu0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes2.dex */
public final class ListValue extends o0 implements jl1 {
    private static final ListValue DEFAULT_INSTANCE;
    private static volatile s42 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private wd1 values_ = o0.emptyProtobufList();

    static {
        ListValue listValue = new ListValue();
        DEFAULT_INSTANCE = listValue;
        o0.registerDefaultInstance(ListValue.class, listValue);
    }

    private ListValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends Value> iterable) {
        ensureValuesIsMutable();
        a.addAll((Iterable) iterable, (List) this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = o0.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        wd1 wd1Var = this.values_;
        if (!wd1Var.isModifiable()) {
            this.values_ = o0.mutableCopy(wd1Var);
        }
    }

    public static ListValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static il1 newBuilder() {
        return (il1) DEFAULT_INSTANCE.createBuilder();
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ListValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer) throws he1 {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static s42 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, value);
    }

    @Override // com.google.protobuf.o0
    public final Object dynamicMethod(k51 k51Var, Object obj, Object obj2) {
        s0 s0Var = null;
        switch (s0.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[k51Var.ordinal()]) {
            case 1:
                return new ListValue();
            case 2:
                return new il1(s0Var);
            case 3:
                return o0.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", Value.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                s42 s42Var = PARSER;
                if (s42Var == null) {
                    synchronized (ListValue.class) {
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

    @Override // defpackage.jl1
    public Value getValues(int i) {
        return (Value) this.values_.get(i);
    }

    @Override // defpackage.jl1
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // defpackage.jl1
    public List<Value> getValuesList() {
        return this.values_;
    }

    public hj3 getValuesOrBuilder(int i) {
        return (hj3) this.values_.get(i);
    }

    public List<? extends hj3> getValuesOrBuilderList() {
        return this.values_;
    }

    public static il1 newBuilder(ListValue listValue) {
        return (il1) DEFAULT_INSTANCE.createBuilder(listValue);
    }

    public static ListValue parseDelimitedFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (ListValue) o0.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static ListValue parseFrom(ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, byteBuffer, xu0Var);
    }

    public static ListValue parseFrom(g gVar) throws he1 {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, gVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, Value value) {
        value.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, value);
    }

    public static ListValue parseFrom(g gVar, xu0 xu0Var) throws he1 {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, gVar, xu0Var);
    }

    public static ListValue parseFrom(byte[] bArr) throws he1 {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ListValue parseFrom(byte[] bArr, xu0 xu0Var) throws he1 {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, bArr, xu0Var);
    }

    public static ListValue parseFrom(InputStream inputStream) throws IOException {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ListValue parseFrom(InputStream inputStream, xu0 xu0Var) throws IOException {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, inputStream, xu0Var);
    }

    public static ListValue parseFrom(m mVar) throws IOException {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, mVar);
    }

    public static ListValue parseFrom(m mVar, xu0 xu0Var) throws IOException {
        return (ListValue) o0.parseFrom(DEFAULT_INSTANCE, mVar, xu0Var);
    }
}
