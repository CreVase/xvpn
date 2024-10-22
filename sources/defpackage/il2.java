package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class il2 extends ls {
    ss current = nextPiece();
    final kl2 pieces;
    final /* synthetic */ ml2 this$0;

    public il2(ml2 ml2Var) {
        this.this$0 = ml2Var;
        this.pieces = new kl2(ml2Var, null);
    }

    private ss nextPiece() {
        if (this.pieces.hasNext()) {
            return this.pieces.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.current != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ls, defpackage.ss
    public byte nextByte() {
        ss ssVar = this.current;
        if (ssVar != null) {
            byte nextByte = ssVar.nextByte();
            if (!this.current.hasNext()) {
                this.current = nextPiece();
            }
            return nextByte;
        }
        throw new NoSuchElementException();
    }
}
