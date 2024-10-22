package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
public final class ll2 extends InputStream {
    private us currentPiece;
    private int currentPieceIndex;
    private int currentPieceOffsetInRope;
    private int currentPieceSize;
    private int mark;
    private kl2 pieceIterator;
    final /* synthetic */ ml2 this$0;

    public ll2(ml2 ml2Var) {
        this.this$0 = ml2Var;
        initialize();
    }

    private void advanceIfCurrentPieceFullyRead() {
        if (this.currentPiece != null) {
            int i = this.currentPieceIndex;
            int i2 = this.currentPieceSize;
            if (i == i2) {
                this.currentPieceOffsetInRope += i2;
                this.currentPieceIndex = 0;
                if (this.pieceIterator.hasNext()) {
                    us next = this.pieceIterator.next();
                    this.currentPiece = next;
                    this.currentPieceSize = next.size();
                } else {
                    this.currentPiece = null;
                    this.currentPieceSize = 0;
                }
            }
        }
    }

    private int availableInternal() {
        return this.this$0.size() - (this.currentPieceOffsetInRope + this.currentPieceIndex);
    }

    private void initialize() {
        kl2 kl2Var = new kl2(this.this$0, null);
        this.pieceIterator = kl2Var;
        us next = kl2Var.next();
        this.currentPiece = next;
        this.currentPieceSize = next.size();
        this.currentPieceIndex = 0;
        this.currentPieceOffsetInRope = 0;
    }

    private int readSkipInternal(byte[] bArr, int i, int i2) {
        int i3 = i2;
        while (i3 > 0) {
            advanceIfCurrentPieceFullyRead();
            if (this.currentPiece == null) {
                break;
            }
            int min = Math.min(this.currentPieceSize - this.currentPieceIndex, i3);
            if (bArr != null) {
                this.currentPiece.copyTo(bArr, this.currentPieceIndex, i, min);
                i += min;
            }
            this.currentPieceIndex += min;
            i3 -= min;
        }
        return i2 - i3;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return availableInternal();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.mark = this.currentPieceOffsetInRope + this.currentPieceIndex;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
            int readSkipInternal = readSkipInternal(bArr, i, i2);
            if (readSkipInternal != 0) {
                return readSkipInternal;
            }
            if (i2 > 0 || availableInternal() == 0) {
                return -1;
            }
            return readSkipInternal;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        initialize();
        readSkipInternal(null, 0, this.mark);
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        if (j >= 0) {
            if (j > 2147483647L) {
                j = 2147483647L;
            }
            return readSkipInternal(null, 0, (int) j);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        advanceIfCurrentPieceFullyRead();
        us usVar = this.currentPiece;
        if (usVar == null) {
            return -1;
        }
        int i = this.currentPieceIndex;
        this.currentPieceIndex = i + 1;
        return usVar.byteAt(i) & 255;
    }
}
