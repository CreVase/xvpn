package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ik0 implements fp2 {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f2612a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2613b;
    public final int c;
    public final l41 d;

    public ik0(CharSequence charSequence, int i, int i2, h23 h23Var) {
        this.f2612a = charSequence;
        this.f2613b = i;
        this.c = i2;
        this.d = h23Var;
    }

    @Override // defpackage.fp2
    public final Iterator iterator() {
        return new hk0(this);
    }
}
