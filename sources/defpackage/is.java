package defpackage;

import com.google.protobuf.g;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class is extends ls {
    private final int limit;
    private int position = 0;
    final /* synthetic */ g this$0;

    public is(g gVar) {
        this.this$0 = gVar;
        this.limit = gVar.size();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.position < this.limit) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ls, defpackage.ss
    public byte nextByte() {
        int i = this.position;
        if (i < this.limit) {
            this.position = i + 1;
            return this.this$0.internalByteAt(i);
        }
        throw new NoSuchElementException();
    }
}
