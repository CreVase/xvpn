package defpackage;

import com.google.protobuf.g;

/* loaded from: classes2.dex */
public final class a73 implements c73 {
    final /* synthetic */ g val$input;

    public a73(g gVar) {
        this.val$input = gVar;
    }

    @Override // defpackage.c73
    public byte byteAt(int i) {
        return this.val$input.byteAt(i);
    }

    @Override // defpackage.c73
    public int size() {
        return this.val$input.size();
    }
}
