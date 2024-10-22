package defpackage;

import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public abstract class w13 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f4927a;

    static {
        mp2[] mp2VarArr = {ig3.f2591b, ng3.f3456b, yf3.f5328b, sg3.f4340b};
        LinkedHashSet linkedHashSet = new LinkedHashSet(bx3.N(4));
        for (int i = 0; i < 4; i++) {
            linkedHashSet.add(mp2VarArr[i]);
        }
        f4927a = linkedHashSet;
    }

    public static final boolean a(mp2 mp2Var) {
        if (mp2Var.isInline() && f4927a.contains(mp2Var)) {
            return true;
        }
        return false;
    }
}
