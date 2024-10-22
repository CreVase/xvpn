package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class ba0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ba0 f430a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ba0[] f431b;

    static {
        ba0 ba0Var = new ba0("COROUTINE_SUSPENDED", 0);
        f430a = ba0Var;
        ba0[] ba0VarArr = {ba0Var, new ba0("UNDECIDED", 1), new ba0("RESUMED", 2)};
        f431b = ba0VarArr;
        new yr0(ba0VarArr);
    }

    public ba0(String str, int i) {
    }

    public static ba0 valueOf(String str) {
        return (ba0) Enum.valueOf(ba0.class, str);
    }

    public static ba0[] values() {
        return (ba0[]) f431b.clone();
    }
}
