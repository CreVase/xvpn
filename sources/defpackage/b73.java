package defpackage;

/* loaded from: classes2.dex */
public final class b73 implements c73 {
    final /* synthetic */ byte[] val$input;

    public b73(byte[] bArr) {
        this.val$input = bArr;
    }

    @Override // defpackage.c73
    public byte byteAt(int i) {
        return this.val$input[i];
    }

    @Override // defpackage.c73
    public int size() {
        return this.val$input.length;
    }
}
