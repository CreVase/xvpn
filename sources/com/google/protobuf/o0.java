package com.google.protobuf;

import defpackage.bh3;
import defpackage.cm0;
import defpackage.do1;
import defpackage.ed1;
import defpackage.fg;
import defpackage.gh3;
import defpackage.he1;
import defpackage.hx2;
import defpackage.ja2;
import defpackage.k51;
import defpackage.kr3;
import defpackage.la2;
import defpackage.ln2;
import defpackage.ng2;
import defpackage.od1;
import defpackage.oq;
import defpackage.pd1;
import defpackage.rd1;
import defpackage.s42;
import defpackage.su0;
import defpackage.td1;
import defpackage.ud1;
import defpackage.vd1;
import defpackage.wd1;
import defpackage.xu0;
import defpackage.yv1;
import defpackage.yy0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public abstract class o0 extends a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, o0> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected gh3 unknownFields = gh3.getDefaultInstance();

    /* JADX INFO: Access modifiers changed from: private */
    public static <MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType, T> n0 checkIsLite(su0 su0Var) {
        if (su0Var.isLite()) {
            return (n0) su0Var;
        }
        throw new IllegalArgumentException("Expected a lite extension.");
    }

    private static <T extends o0> T checkMessageInitialized(T t) throws he1 {
        if (t != null && !t.isInitialized()) {
            throw t.newUninitializedMessageException().asInvalidProtocolBufferException().setUnfinishedMessage(t);
        }
        return t;
    }

    private int computeSerializedSize(ln2 ln2Var) {
        if (ln2Var == null) {
            return ja2.getInstance().schemaFor((ja2) this).getSerializedSize(this);
        }
        return ln2Var.getSerializedSize(this);
    }

    public static od1 emptyBooleanList() {
        return oq.emptyList();
    }

    public static pd1 emptyDoubleList() {
        return cm0.emptyList();
    }

    public static td1 emptyFloatList() {
        return yy0.emptyList();
    }

    public static ud1 emptyIntList() {
        return ed1.emptyList();
    }

    public static vd1 emptyLongList() {
        return do1.emptyList();
    }

    public static <E> wd1 emptyProtobufList() {
        return la2.emptyList();
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == gh3.getDefaultInstance()) {
            this.unknownFields = gh3.newInstance();
        }
    }

    public static <T extends o0> T getDefaultInstance(Class<T> cls) {
        o0 o0Var = defaultInstanceMap.get(cls);
        if (o0Var == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                o0Var = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (o0Var == null) {
            o0Var = (T) ((o0) n1.allocateInstance(cls)).getDefaultInstanceForType();
            if (o0Var != null) {
                defaultInstanceMap.put(cls, o0Var);
            } else {
                throw new IllegalStateException();
            }
        }
        return (T) o0Var;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static ud1 mutableCopy(ud1 ud1Var) {
        int size = ud1Var.size();
        return ((ed1) ud1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static Object newMessageInfo(yv1 yv1Var, String str, Object[] objArr) {
        return new ng2(yv1Var, str, objArr);
    }

    public static <ContainingType extends yv1, Type> n0 newRepeatedGeneratedExtension(ContainingType containingtype, yv1 yv1Var, rd1 rd1Var, int i, kr3 kr3Var, boolean z, Class cls) {
        return new n0(containingtype, Collections.emptyList(), yv1Var, new m0(rd1Var, i, kr3Var, true, z), cls);
    }

    public static <ContainingType extends yv1, Type> n0 newSingularGeneratedExtension(ContainingType containingtype, Type type, yv1 yv1Var, rd1 rd1Var, int i, kr3 kr3Var, Class cls) {
        return new n0(containingtype, type, yv1Var, new m0(rd1Var, i, kr3Var, false, false), cls);
    }

    public static <T extends o0> T parseDelimitedFrom(T t, InputStream inputStream) throws he1 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, xu0.getEmptyRegistry()));
    }

    public static <T extends o0> T parseFrom(T t, ByteBuffer byteBuffer, xu0 xu0Var) throws he1 {
        return (T) checkMessageInitialized(parseFrom(t, m.newInstance(byteBuffer), xu0Var));
    }

    private static <T extends o0> T parsePartialDelimitedFrom(T t, InputStream inputStream, xu0 xu0Var) throws he1 {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            m newInstance = m.newInstance(new defpackage.f1(inputStream, m.readRawVarint32(read, inputStream)));
            T t2 = (T) parsePartialFrom(t, newInstance, xu0Var);
            try {
                newInstance.checkLastTagWas(0);
                return t2;
            } catch (he1 e) {
                throw e.setUnfinishedMessage(t2);
            }
        } catch (he1 e2) {
            if (e2.getThrownFromInputStream()) {
                throw new he1((IOException) e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new he1(e3);
        }
    }

    public static <T extends o0> T parsePartialFrom(T t, m mVar, xu0 xu0Var) throws he1 {
        T t2 = (T) t.newMutableInstance();
        try {
            ln2 schemaFor = ja2.getInstance().schemaFor((ja2) t2);
            schemaFor.mergeFrom(t2, o.forCodedInput(mVar), xu0Var);
            schemaFor.makeImmutable(t2);
            return t2;
        } catch (bh3 e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (he1 e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new he1((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof he1) {
                throw ((he1) e3.getCause());
            }
            throw new he1(e3).setUnfinishedMessage(t2);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof he1) {
                throw ((he1) e4.getCause());
            }
            throw e4;
        }
    }

    public static <T extends o0> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        defaultInstanceMap.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(k51.BUILD_MESSAGE_INFO);
    }

    public void clearMemoizedHashCode() {
        this.memoizedHashCode = 0;
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public int computeHashCode() {
        return ja2.getInstance().schemaFor((ja2) this).hashCode(this);
    }

    public final <MessageType extends o0, BuilderType extends k0> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(k51.NEW_BUILDER);
    }

    public Object dynamicMethod(k51 k51Var, Object obj) {
        return dynamicMethod(k51Var, obj, null);
    }

    public abstract Object dynamicMethod(k51 k51Var, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ja2.getInstance().schemaFor((ja2) this).equals(this, (o0) obj);
    }

    public int getMemoizedHashCode() {
        return this.memoizedHashCode;
    }

    @Override // com.google.protobuf.a
    int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.a, defpackage.yv1
    public final s42 getParserForType() {
        return (s42) dynamicMethod(k51.GET_PARSER);
    }

    @Override // com.google.protobuf.a
    public int getSerializedSize(ln2 ln2Var) {
        if (isMutable()) {
            int computeSerializedSize = computeSerializedSize(ln2Var);
            if (computeSerializedSize >= 0) {
                return computeSerializedSize;
            }
            throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", computeSerializedSize));
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        int computeSerializedSize2 = computeSerializedSize(ln2Var);
        setMemoizedSerializedSize(computeSerializedSize2);
        return computeSerializedSize2;
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public boolean hashCodeIsNotMemoized() {
        if (getMemoizedHashCode() == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.a, defpackage.yv1, defpackage.zv1
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isMutable() {
        if ((this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0) {
            return true;
        }
        return false;
    }

    public void makeImmutable() {
        ja2.getInstance().schemaFor((ja2) this).makeImmutable(this);
        markImmutable();
    }

    public void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    public void mergeLengthDelimitedField(int i, g gVar) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeLengthDelimitedField(i, gVar);
    }

    public final void mergeUnknownFields(gh3 gh3Var) {
        this.unknownFields = gh3.mutableCopyOf(this.unknownFields, gh3Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        this.unknownFields.mergeVarintField(i, i2);
    }

    public o0 newMutableInstance() {
        return (o0) dynamicMethod(k51.NEW_MUTABLE_INSTANCE);
    }

    public boolean parseUnknownField(int i, m mVar) throws IOException {
        if (r1.getTagWireType(i) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mergeFieldFrom(i, mVar);
    }

    public void setMemoizedHashCode(int i) {
        this.memoizedHashCode = i;
    }

    @Override // com.google.protobuf.a
    void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
            return;
        }
        throw new IllegalStateException(hx2.m("serialized size must be non-negative, was ", i));
    }

    public String toString() {
        return t0.toString(this, super.toString());
    }

    @Override // com.google.protobuf.a, defpackage.yv1
    public void writeTo(v vVar) throws IOException {
        ja2.getInstance().schemaFor((ja2) this).writeTo(this, x.forCodedOutput(vVar));
    }

    public static final <T extends o0> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(k51.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean isInitialized = ja2.getInstance().schemaFor((ja2) t).isInitialized(t);
        if (z) {
            t.dynamicMethod(k51.SET_MEMOIZED_IS_INITIALIZED, isInitialized ? t : null);
        }
        return isInitialized;
    }

    public final <MessageType extends o0, BuilderType extends k0> BuilderType createBuilder(MessageType messagetype) {
        return (BuilderType) createBuilder().mergeFrom((o0) messagetype);
    }

    public Object dynamicMethod(k51 k51Var) {
        return dynamicMethod(k51Var, null, null);
    }

    @Override // com.google.protobuf.a, defpackage.yv1, defpackage.zv1
    public final o0 getDefaultInstanceForType() {
        return (o0) dynamicMethod(k51.GET_DEFAULT_INSTANCE);
    }

    @Override // com.google.protobuf.a, defpackage.yv1
    public final k0 newBuilderForType() {
        return (k0) dynamicMethod(k51.NEW_BUILDER);
    }

    @Override // com.google.protobuf.a, defpackage.yv1
    public final k0 toBuilder() {
        return ((k0) dynamicMethod(k51.NEW_BUILDER)).mergeFrom(this);
    }

    public static vd1 mutableCopy(vd1 vd1Var) {
        int size = vd1Var.size();
        return ((do1) vd1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o0> T parseFrom(T t, ByteBuffer byteBuffer) throws he1 {
        return (T) parseFrom(t, byteBuffer, xu0.getEmptyRegistry());
    }

    public static <T extends o0> T parseDelimitedFrom(T t, InputStream inputStream, xu0 xu0Var) throws he1 {
        return (T) checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, xu0Var));
    }

    public static <T extends o0> T parseFrom(T t, g gVar) throws he1 {
        return (T) checkMessageInitialized(parseFrom(t, gVar, xu0.getEmptyRegistry()));
    }

    public static td1 mutableCopy(td1 td1Var) {
        int size = td1Var.size();
        return ((yy0) td1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o0> T parseFrom(T t, g gVar, xu0 xu0Var) throws he1 {
        return (T) checkMessageInitialized(parsePartialFrom(t, gVar, xu0Var));
    }

    public static pd1 mutableCopy(pd1 pd1Var) {
        int size = pd1Var.size();
        return ((cm0) pd1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o0> T parseFrom(T t, byte[] bArr) throws he1 {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, xu0.getEmptyRegistry()));
    }

    public static od1 mutableCopy(od1 od1Var) {
        int size = od1Var.size();
        return ((oq) od1Var).mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o0> T parseFrom(T t, byte[] bArr, xu0 xu0Var) throws he1 {
        return (T) checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, xu0Var));
    }

    public static <E> wd1 mutableCopy(wd1 wd1Var) {
        int size = wd1Var.size();
        return wd1Var.mutableCopyWithCapacity(size == 0 ? 10 : size * 2);
    }

    public static <T extends o0> T parseFrom(T t, InputStream inputStream) throws he1 {
        return (T) checkMessageInitialized(parsePartialFrom(t, m.newInstance(inputStream), xu0.getEmptyRegistry()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T extends o0> T parsePartialFrom(T t, byte[] bArr, int i, int i2, xu0 xu0Var) throws he1 {
        T t2 = (T) t.newMutableInstance();
        try {
            ln2 schemaFor = ja2.getInstance().schemaFor((ja2) t2);
            schemaFor.mergeFrom(t2, bArr, i, i + i2, new fg(xu0Var));
            schemaFor.makeImmutable(t2);
            return t2;
        } catch (bh3 e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(t2);
        } catch (he1 e2) {
            e = e2;
            if (e.getThrownFromInputStream()) {
                e = new he1((IOException) e);
            }
            throw e.setUnfinishedMessage(t2);
        } catch (IOException e3) {
            if (e3.getCause() instanceof he1) {
                throw ((he1) e3.getCause());
            }
            throw new he1(e3).setUnfinishedMessage(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw he1.truncatedMessage().setUnfinishedMessage(t2);
        }
    }

    public static <T extends o0> T parseFrom(T t, InputStream inputStream, xu0 xu0Var) throws he1 {
        return (T) checkMessageInitialized(parsePartialFrom(t, m.newInstance(inputStream), xu0Var));
    }

    public static <T extends o0> T parseFrom(T t, m mVar) throws he1 {
        return (T) parseFrom(t, mVar, xu0.getEmptyRegistry());
    }

    public static <T extends o0> T parseFrom(T t, m mVar, xu0 xu0Var) throws he1 {
        return (T) checkMessageInitialized(parsePartialFrom(t, mVar, xu0Var));
    }

    public static <T extends o0> T parsePartialFrom(T t, m mVar) throws he1 {
        return (T) parsePartialFrom(t, mVar, xu0.getEmptyRegistry());
    }

    private static <T extends o0> T parsePartialFrom(T t, g gVar, xu0 xu0Var) throws he1 {
        m newCodedInput = gVar.newCodedInput();
        T t2 = (T) parsePartialFrom(t, newCodedInput, xu0Var);
        try {
            newCodedInput.checkLastTagWas(0);
            return t2;
        } catch (he1 e) {
            throw e.setUnfinishedMessage(t2);
        }
    }

    @Override // com.google.protobuf.a, defpackage.yv1
    public int getSerializedSize() {
        return getSerializedSize(null);
    }
}
