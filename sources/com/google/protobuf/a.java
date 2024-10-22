package com.google.protobuf;

import defpackage.bh3;
import defpackage.ln2;
import defpackage.s42;
import defpackage.ts;
import defpackage.xv1;
import defpackage.yv1;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class a implements yv1 {
    protected int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        defpackage.g1.addAll((Iterable) iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(g gVar) throws IllegalArgumentException {
        if (gVar.isValidUtf8()) {
        } else {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    @Override // defpackage.yv1, defpackage.zv1
    public abstract /* synthetic */ yv1 getDefaultInstanceForType();

    int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yv1
    public abstract /* synthetic */ s42 getParserForType();

    @Override // defpackage.yv1
    public abstract /* synthetic */ int getSerializedSize();

    public int getSerializedSize(ln2 ln2Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int serializedSize = ln2Var.getSerializedSize(this);
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    @Override // defpackage.yv1, defpackage.zv1
    public abstract /* synthetic */ boolean isInitialized();

    @Override // defpackage.yv1
    public abstract /* synthetic */ xv1 newBuilderForType();

    public bh3 newUninitializedMessageException() {
        return new bh3(this);
    }

    void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.yv1
    public abstract /* synthetic */ xv1 toBuilder();

    @Override // defpackage.yv1
    public byte[] toByteArray() {
        try {
            byte[] bArr = new byte[getSerializedSize()];
            v newInstance = v.newInstance(bArr);
            writeTo(newInstance);
            newInstance.checkNoSpaceLeft();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    @Override // defpackage.yv1
    public g toByteString() {
        try {
            ts newCodedBuilder = g.newCodedBuilder(getSerializedSize());
            writeTo(newCodedBuilder.getCodedOutput());
            return newCodedBuilder.build();
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    @Override // defpackage.yv1
    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        v newInstance = v.newInstance(outputStream, v.computePreferredBufferSize(v.computeUInt32SizeNoTag(serializedSize) + serializedSize));
        newInstance.writeUInt32NoTag(serializedSize);
        writeTo(newInstance);
        newInstance.flush();
    }

    @Override // defpackage.yv1
    public abstract /* synthetic */ void writeTo(v vVar) throws IOException;

    @Override // defpackage.yv1
    public void writeTo(OutputStream outputStream) throws IOException {
        v newInstance = v.newInstance(outputStream, v.computePreferredBufferSize(getSerializedSize()));
        writeTo(newInstance);
        newInstance.flush();
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        defpackage.g1.addAll((Iterable) iterable, (List) list);
    }
}
