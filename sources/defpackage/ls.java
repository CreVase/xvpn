package defpackage;

/* loaded from: classes2.dex */
public abstract class ls implements ss {
    @Override // defpackage.ss
    public abstract /* synthetic */ byte nextByte();

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public final Byte next() {
        return Byte.valueOf(nextByte());
    }
}
