package defpackage;

import android.graphics.BitmapFactory;

/* loaded from: classes2.dex */
public final class ry extends z33 implements l41 {
    public final /* synthetic */ String e;
    public final /* synthetic */ BitmapFactory.Options f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry(String str, BitmapFactory.Options options, c90 c90Var) {
        super(2, c90Var);
        this.e = str;
        this.f = options;
    }

    @Override // defpackage.mn
    public final c90 create(Object obj, c90 c90Var) {
        return new ry(this.e, this.f, c90Var);
    }

    @Override // defpackage.l41
    public final Object invoke(Object obj, Object obj2) {
        return ((ry) create((aa0) obj, (c90) obj2)).invokeSuspend(ch3.f636a);
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        ba0 ba0Var = ba0.f430a;
        fl.a0(obj);
        return BitmapFactory.decodeFile(this.e, this.f);
    }
}
