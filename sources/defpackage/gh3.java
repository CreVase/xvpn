package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.r1;
import com.google.protobuf.t0;
import com.google.protobuf.v;
import com.google.protobuf.x;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class gh3 {
    private static final gh3 DEFAULT_INSTANCE = new gh3(0, new int[0], new Object[0], false);
    private static final int MIN_CAPACITY = 8;
    private int count;
    private boolean isMutable;
    private int memoizedSerializedSize;
    private Object[] objects;
    private int[] tags;

    private gh3() {
        this(0, new int[8], new Object[8], true);
    }

    private void ensureCapacity(int i) {
        int[] iArr = this.tags;
        if (i > iArr.length) {
            int i2 = this.count;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.tags = Arrays.copyOf(iArr, i);
            this.objects = Arrays.copyOf(this.objects, i);
        }
    }

    public static gh3 getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static int hashCode(int[] iArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + iArr[i3];
        }
        return i2;
    }

    private gh3 mergeFrom(m mVar) throws IOException {
        int readTag;
        do {
            readTag = mVar.readTag();
            if (readTag == 0) {
                break;
            }
        } while (mergeFieldFrom(readTag, mVar));
        return this;
    }

    public static gh3 mutableCopyOf(gh3 gh3Var, gh3 gh3Var2) {
        int i = gh3Var.count + gh3Var2.count;
        int[] copyOf = Arrays.copyOf(gh3Var.tags, i);
        System.arraycopy(gh3Var2.tags, 0, copyOf, gh3Var.count, gh3Var2.count);
        Object[] copyOf2 = Arrays.copyOf(gh3Var.objects, i);
        System.arraycopy(gh3Var2.objects, 0, copyOf2, gh3Var.count, gh3Var2.count);
        return new gh3(i, copyOf, copyOf2, true);
    }

    public static gh3 newInstance() {
        return new gh3();
    }

    private static boolean objectsEquals(Object[] objArr, Object[] objArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (!objArr[i2].equals(objArr2[i2])) {
                return false;
            }
        }
        return true;
    }

    private static boolean tagsEquals(int[] iArr, int[] iArr2, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != iArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    private static void writeField(int i, Object obj, kt3 kt3Var) throws IOException {
        int tagFieldNumber = r1.getTagFieldNumber(i);
        int tagWireType = r1.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType == 5) {
                            ((x) kt3Var).writeFixed32(tagFieldNumber, ((Integer) obj).intValue());
                            return;
                        }
                        throw new RuntimeException(he1.invalidWireType());
                    }
                    x xVar = (x) kt3Var;
                    if (xVar.fieldOrder() == jt3.ASCENDING) {
                        xVar.writeStartGroup(tagFieldNumber);
                        ((gh3) obj).writeTo(xVar);
                        xVar.writeEndGroup(tagFieldNumber);
                        return;
                    } else {
                        xVar.writeEndGroup(tagFieldNumber);
                        ((gh3) obj).writeTo(xVar);
                        xVar.writeStartGroup(tagFieldNumber);
                        return;
                    }
                }
                ((x) kt3Var).writeBytes(tagFieldNumber, (g) obj);
                return;
            }
            ((x) kt3Var).writeFixed64(tagFieldNumber, ((Long) obj).longValue());
            return;
        }
        ((x) kt3Var).writeInt64(tagFieldNumber, ((Long) obj).longValue());
    }

    public void checkMutable() {
        if (this.isMutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof gh3)) {
            return false;
        }
        gh3 gh3Var = (gh3) obj;
        int i = this.count;
        if (i == gh3Var.count && tagsEquals(this.tags, gh3Var.tags, i) && objectsEquals(this.objects, gh3Var.objects, this.count)) {
            return true;
        }
        return false;
    }

    public int getSerializedSize() {
        int computeUInt64Size;
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.tags[i3];
            int tagFieldNumber = r1.getTagFieldNumber(i4);
            int tagWireType = r1.getTagWireType(i4);
            if (tagWireType != 0) {
                if (tagWireType != 1) {
                    if (tagWireType != 2) {
                        if (tagWireType != 3) {
                            if (tagWireType == 5) {
                                computeUInt64Size = v.computeFixed32Size(tagFieldNumber, ((Integer) this.objects[i3]).intValue());
                            } else {
                                throw new IllegalStateException(he1.invalidWireType());
                            }
                        } else {
                            i2 = ((gh3) this.objects[i3]).getSerializedSize() + (v.computeTagSize(tagFieldNumber) * 2) + i2;
                        }
                    } else {
                        computeUInt64Size = v.computeBytesSize(tagFieldNumber, (g) this.objects[i3]);
                    }
                } else {
                    computeUInt64Size = v.computeFixed64Size(tagFieldNumber, ((Long) this.objects[i3]).longValue());
                }
            } else {
                computeUInt64Size = v.computeUInt64Size(tagFieldNumber, ((Long) this.objects[i3]).longValue());
            }
            i2 = computeUInt64Size + i2;
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public int getSerializedSizeAsMessageSet() {
        int i = this.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            i2 += v.computeRawMessageSetExtensionSize(r1.getTagFieldNumber(this.tags[i3]), (g) this.objects[i3]);
        }
        this.memoizedSerializedSize = i2;
        return i2;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public boolean mergeFieldFrom(int i, m mVar) throws IOException {
        checkMutable();
        int tagFieldNumber = r1.getTagFieldNumber(i);
        int tagWireType = r1.getTagWireType(i);
        if (tagWireType != 0) {
            if (tagWireType != 1) {
                if (tagWireType != 2) {
                    if (tagWireType != 3) {
                        if (tagWireType != 4) {
                            if (tagWireType == 5) {
                                storeField(i, Integer.valueOf(mVar.readFixed32()));
                                return true;
                            }
                            throw he1.invalidWireType();
                        }
                        return false;
                    }
                    gh3 gh3Var = new gh3();
                    gh3Var.mergeFrom(mVar);
                    mVar.checkLastTagWas(r1.makeTag(tagFieldNumber, 4));
                    storeField(i, gh3Var);
                    return true;
                }
                storeField(i, mVar.readBytes());
                return true;
            }
            storeField(i, Long.valueOf(mVar.readFixed64()));
            return true;
        }
        storeField(i, Long.valueOf(mVar.readInt64()));
        return true;
    }

    public gh3 mergeLengthDelimitedField(int i, g gVar) {
        checkMutable();
        if (i != 0) {
            storeField(r1.makeTag(i, 2), gVar);
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public gh3 mergeVarintField(int i, int i2) {
        checkMutable();
        if (i != 0) {
            storeField(r1.makeTag(i, 0), Long.valueOf(i2));
            return this;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void printWithIndent(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            t0.printField(sb, i, String.valueOf(r1.getTagFieldNumber(this.tags[i2])), this.objects[i2]);
        }
    }

    public void storeField(int i, Object obj) {
        checkMutable();
        ensureCapacity(this.count + 1);
        int[] iArr = this.tags;
        int i2 = this.count;
        iArr[i2] = i;
        this.objects[i2] = obj;
        this.count = i2 + 1;
    }

    public void writeAsMessageSetTo(v vVar) throws IOException {
        for (int i = 0; i < this.count; i++) {
            vVar.writeRawMessageSetExtension(r1.getTagFieldNumber(this.tags[i]), (g) this.objects[i]);
        }
    }

    public void writeTo(v vVar) throws IOException {
        for (int i = 0; i < this.count; i++) {
            int i2 = this.tags[i];
            int tagFieldNumber = r1.getTagFieldNumber(i2);
            int tagWireType = r1.getTagWireType(i2);
            if (tagWireType == 0) {
                vVar.writeUInt64(tagFieldNumber, ((Long) this.objects[i]).longValue());
            } else if (tagWireType == 1) {
                vVar.writeFixed64(tagFieldNumber, ((Long) this.objects[i]).longValue());
            } else if (tagWireType == 2) {
                vVar.writeBytes(tagFieldNumber, (g) this.objects[i]);
            } else if (tagWireType == 3) {
                vVar.writeTag(tagFieldNumber, 3);
                ((gh3) this.objects[i]).writeTo(vVar);
                vVar.writeTag(tagFieldNumber, 4);
            } else if (tagWireType == 5) {
                vVar.writeFixed32(tagFieldNumber, ((Integer) this.objects[i]).intValue());
            } else {
                throw he1.invalidWireType();
            }
        }
    }

    private gh3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.memoizedSerializedSize = -1;
        this.count = i;
        this.tags = iArr;
        this.objects = objArr;
        this.isMutable = z;
    }

    private static int hashCode(Object[] objArr, int i) {
        int i2 = 17;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = (i2 * 31) + objArr[i3].hashCode();
        }
        return i2;
    }

    public int hashCode() {
        int i = this.count;
        return ((((527 + i) * 31) + hashCode(this.tags, i)) * 31) + hashCode(this.objects, this.count);
    }

    public gh3 mergeFrom(gh3 gh3Var) {
        if (gh3Var.equals(getDefaultInstance())) {
            return this;
        }
        checkMutable();
        int i = this.count + gh3Var.count;
        ensureCapacity(i);
        System.arraycopy(gh3Var.tags, 0, this.tags, this.count, gh3Var.count);
        System.arraycopy(gh3Var.objects, 0, this.objects, this.count, gh3Var.count);
        this.count = i;
        return this;
    }

    public void writeAsMessageSetTo(kt3 kt3Var) throws IOException {
        x xVar = (x) kt3Var;
        if (xVar.fieldOrder() == jt3.DESCENDING) {
            for (int i = this.count - 1; i >= 0; i--) {
                xVar.writeMessageSetItem(r1.getTagFieldNumber(this.tags[i]), this.objects[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            xVar.writeMessageSetItem(r1.getTagFieldNumber(this.tags[i2]), this.objects[i2]);
        }
    }

    public void writeTo(kt3 kt3Var) throws IOException {
        if (this.count == 0) {
            return;
        }
        x xVar = (x) kt3Var;
        if (xVar.fieldOrder() == jt3.ASCENDING) {
            for (int i = 0; i < this.count; i++) {
                writeField(this.tags[i], this.objects[i], xVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            writeField(this.tags[i2], this.objects[i2], xVar);
        }
    }
}
