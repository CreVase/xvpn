package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class lb3 implements fp2 {

    /* renamed from: a, reason: collision with root package name */
    public final fp2 f3098a;

    /* renamed from: b, reason: collision with root package name */
    public final x31 f3099b;

    public lb3(fp2 fp2Var, x31 x31Var) {
        this.f3098a = fp2Var;
        this.f3099b = x31Var;
    }

    @Override // defpackage.fp2
    public final Iterator iterator() {
        return new kb3(this);
    }
}
