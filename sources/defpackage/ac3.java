package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class ac3 implements zb3 {

    /* renamed from: a, reason: collision with root package name */
    public final Set f57a;

    /* renamed from: b, reason: collision with root package name */
    public final lm f58b;
    public final cc3 c;

    public ac3(Set set, lm lmVar, cc3 cc3Var) {
        this.f57a = set;
        this.f58b = lmVar;
        this.c = cc3Var;
    }

    public final bc3 a(String str, lr0 lr0Var, jb3 jb3Var) {
        Set set = this.f57a;
        if (set.contains(lr0Var)) {
            return new bc3(this.f58b, str, lr0Var, jb3Var, this.c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", lr0Var, set));
    }
}
