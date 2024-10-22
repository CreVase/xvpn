package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class kj1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kj1 f2953a;

    /* renamed from: b, reason: collision with root package name */
    public static final kj1 f2954b;
    public static final kj1 c;
    public static final /* synthetic */ kj1[] d;

    static {
        kj1 kj1Var = new kj1("SYNCHRONIZED", 0);
        f2953a = kj1Var;
        kj1 kj1Var2 = new kj1("PUBLICATION", 1);
        f2954b = kj1Var2;
        kj1 kj1Var3 = new kj1("NONE", 2);
        c = kj1Var3;
        kj1[] kj1VarArr = {kj1Var, kj1Var2, kj1Var3};
        d = kj1VarArr;
        new yr0(kj1VarArr);
    }

    public kj1(String str, int i) {
    }

    public static kj1 valueOf(String str) {
        return (kj1) Enum.valueOf(kj1.class, str);
    }

    public static kj1[] values() {
        return (kj1[]) d.clone();
    }
}
