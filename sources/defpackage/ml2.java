package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ml2 extends g {
    static final int[] minLengthByDepth = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private static final long serialVersionUID = 1;
    private final g left;
    private final int leftLength;
    private final g right;
    private final int totalLength;
    private final int treeDepth;

    public /* synthetic */ ml2(g gVar, g gVar2, il2 il2Var) {
        this(gVar, gVar2);
    }

    public static g concatenate(g gVar, g gVar2) {
        if (gVar2.size() == 0) {
            return gVar;
        }
        if (gVar.size() == 0) {
            return gVar2;
        }
        int size = gVar2.size() + gVar.size();
        if (size < 128) {
            return concatenateBytes(gVar, gVar2);
        }
        if (gVar instanceof ml2) {
            ml2 ml2Var = (ml2) gVar;
            if (gVar2.size() + ml2Var.right.size() < 128) {
                return new ml2(ml2Var.left, concatenateBytes(ml2Var.right, gVar2));
            }
            if (ml2Var.left.getTreeDepth() > ml2Var.right.getTreeDepth() && ml2Var.getTreeDepth() > gVar2.getTreeDepth()) {
                return new ml2(ml2Var.left, new ml2(ml2Var.right, gVar2));
            }
        }
        if (size >= minLength(Math.max(gVar.getTreeDepth(), gVar2.getTreeDepth()) + 1)) {
            return new ml2(gVar, gVar2);
        }
        return jl2.access$100(new jl2(null), gVar, gVar2);
    }

    private static g concatenateBytes(g gVar, g gVar2) {
        int size = gVar.size();
        int size2 = gVar2.size();
        byte[] bArr = new byte[size + size2];
        gVar.copyTo(bArr, 0, 0, size);
        gVar2.copyTo(bArr, 0, size, size2);
        return g.wrap(bArr);
    }

    private boolean equalsFragments(g gVar) {
        boolean equalsRange;
        il2 il2Var = null;
        kl2 kl2Var = new kl2(this, il2Var);
        us usVar = (us) kl2Var.next();
        kl2 kl2Var2 = new kl2(gVar, il2Var);
        us usVar2 = (us) kl2Var2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int size = usVar.size() - i;
            int size2 = usVar2.size() - i2;
            int min = Math.min(size, size2);
            if (i == 0) {
                equalsRange = usVar.equalsRange(usVar2, i2, min);
            } else {
                equalsRange = usVar2.equalsRange(usVar, i, min);
            }
            if (!equalsRange) {
                return false;
            }
            i3 += min;
            int i4 = this.totalLength;
            if (i3 >= i4) {
                if (i3 == i4) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (min == size) {
                i = 0;
                usVar = (us) kl2Var.next();
            } else {
                i += min;
                usVar = usVar;
            }
            if (min == size2) {
                usVar2 = (us) kl2Var2.next();
                i2 = 0;
            } else {
                i2 += min;
            }
        }
    }

    public static int minLength(int i) {
        int[] iArr = minLengthByDepth;
        if (i >= iArr.length) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public static ml2 newInstanceForTest(g gVar, g gVar2) {
        return new ml2(gVar, gVar2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.g
    public ByteBuffer asReadOnlyByteBuffer() {
        return ByteBuffer.wrap(toByteArray()).asReadOnlyBuffer();
    }

    @Override // com.google.protobuf.g
    public List<ByteBuffer> asReadOnlyByteBufferList() {
        ArrayList arrayList = new ArrayList();
        kl2 kl2Var = new kl2(this, null);
        while (kl2Var.hasNext()) {
            arrayList.add(kl2Var.next().asReadOnlyByteBuffer());
        }
        return arrayList;
    }

    @Override // com.google.protobuf.g
    public byte byteAt(int i) {
        g.checkIndex(i, this.totalLength);
        return internalByteAt(i);
    }

    @Override // com.google.protobuf.g
    public void copyTo(ByteBuffer byteBuffer) {
        this.left.copyTo(byteBuffer);
        this.right.copyTo(byteBuffer);
    }

    @Override // com.google.protobuf.g
    public void copyToInternal(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            this.left.copyToInternal(bArr, i, i2, i3);
        } else {
            if (i >= i5) {
                this.right.copyToInternal(bArr, i - i5, i2, i3);
                return;
            }
            int i6 = i5 - i;
            this.left.copyToInternal(bArr, i, i2, i6);
            this.right.copyToInternal(bArr, 0, i2 + i6, i3 - i6);
        }
    }

    @Override // com.google.protobuf.g
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.totalLength != gVar.size()) {
            return false;
        }
        if (this.totalLength == 0) {
            return true;
        }
        int peekCachedHashCode = peekCachedHashCode();
        int peekCachedHashCode2 = gVar.peekCachedHashCode();
        if (peekCachedHashCode != 0 && peekCachedHashCode2 != 0 && peekCachedHashCode != peekCachedHashCode2) {
            return false;
        }
        return equalsFragments(gVar);
    }

    @Override // com.google.protobuf.g
    public int getTreeDepth() {
        return this.treeDepth;
    }

    @Override // com.google.protobuf.g
    public byte internalByteAt(int i) {
        int i2 = this.leftLength;
        if (i < i2) {
            return this.left.internalByteAt(i);
        }
        return this.right.internalByteAt(i - i2);
    }

    @Override // com.google.protobuf.g
    public boolean isBalanced() {
        if (this.totalLength >= minLength(this.treeDepth)) {
            return true;
        }
        return false;
    }

    @Override // com.google.protobuf.g
    public boolean isValidUtf8() {
        int partialIsValidUtf8 = this.left.partialIsValidUtf8(0, 0, this.leftLength);
        g gVar = this.right;
        if (gVar.partialIsValidUtf8(partialIsValidUtf8, 0, gVar.size()) != 0) {
            return false;
        }
        return true;
    }

    @Override // com.google.protobuf.g
    public m newCodedInput() {
        return m.newInstance((Iterable<ByteBuffer>) asReadOnlyByteBufferList(), true);
    }

    @Override // com.google.protobuf.g
    public InputStream newInput() {
        return new ll2(this);
    }

    @Override // com.google.protobuf.g
    public int partialHash(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialHash(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialHash(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialHash(this.left.partialHash(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.g
    public int partialIsValidUtf8(int i, int i2, int i3) {
        int i4 = i2 + i3;
        int i5 = this.leftLength;
        if (i4 <= i5) {
            return this.left.partialIsValidUtf8(i, i2, i3);
        }
        if (i2 >= i5) {
            return this.right.partialIsValidUtf8(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return this.right.partialIsValidUtf8(this.left.partialIsValidUtf8(i, i2, i6), 0, i3 - i6);
    }

    @Override // com.google.protobuf.g
    public int size() {
        return this.totalLength;
    }

    @Override // com.google.protobuf.g
    public g substring(int i, int i2) {
        int checkRange = g.checkRange(i, i2, this.totalLength);
        if (checkRange == 0) {
            return g.EMPTY;
        }
        if (checkRange == this.totalLength) {
            return this;
        }
        int i3 = this.leftLength;
        if (i2 <= i3) {
            return this.left.substring(i, i2);
        }
        if (i >= i3) {
            return this.right.substring(i - i3, i2 - i3);
        }
        return new ml2(this.left.substring(i), this.right.substring(0, i2 - this.leftLength));
    }

    @Override // com.google.protobuf.g
    public String toStringInternal(Charset charset) {
        return new String(toByteArray(), charset);
    }

    public Object writeReplace() {
        return g.wrap(toByteArray());
    }

    @Override // com.google.protobuf.g
    public void writeTo(OutputStream outputStream) throws IOException {
        this.left.writeTo(outputStream);
        this.right.writeTo(outputStream);
    }

    @Override // com.google.protobuf.g
    public void writeToInternal(OutputStream outputStream, int i, int i2) throws IOException {
        int i3 = i + i2;
        int i4 = this.leftLength;
        if (i3 <= i4) {
            this.left.writeToInternal(outputStream, i, i2);
        } else {
            if (i >= i4) {
                this.right.writeToInternal(outputStream, i - i4, i2);
                return;
            }
            int i5 = i4 - i;
            this.left.writeToInternal(outputStream, i, i5);
            this.right.writeToInternal(outputStream, 0, i2 - i5);
        }
    }

    @Override // com.google.protobuf.g
    public void writeToReverse(fs fsVar) throws IOException {
        this.right.writeToReverse(fsVar);
        this.left.writeToReverse(fsVar);
    }

    private ml2(g gVar, g gVar2) {
        this.left = gVar;
        this.right = gVar2;
        int size = gVar.size();
        this.leftLength = size;
        this.totalLength = gVar2.size() + size;
        this.treeDepth = Math.max(gVar.getTreeDepth(), gVar2.getTreeDepth()) + 1;
    }

    @Override // com.google.protobuf.g, java.lang.Iterable
    public ss iterator() {
        return new il2(this);
    }

    @Override // com.google.protobuf.g
    public void writeTo(fs fsVar) throws IOException {
        this.left.writeTo(fsVar);
        this.right.writeTo(fsVar);
    }
}
