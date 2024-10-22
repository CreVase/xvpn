package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class to0 {

    /* renamed from: b, reason: collision with root package name */
    public static final to0 f4550b;
    public static final to0 c;
    public static final to0 d;
    public static final to0 e;
    public static final to0 f;
    public static final to0 g;
    public static final /* synthetic */ to0[] h;

    /* renamed from: a, reason: collision with root package name */
    public final TimeUnit f4551a;

    static {
        to0 to0Var = new to0("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f4550b = to0Var;
        to0 to0Var2 = new to0("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        to0 to0Var3 = new to0("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        c = to0Var3;
        to0 to0Var4 = new to0("SECONDS", 3, TimeUnit.SECONDS);
        d = to0Var4;
        to0 to0Var5 = new to0("MINUTES", 4, TimeUnit.MINUTES);
        e = to0Var5;
        to0 to0Var6 = new to0("HOURS", 5, TimeUnit.HOURS);
        f = to0Var6;
        to0 to0Var7 = new to0("DAYS", 6, TimeUnit.DAYS);
        g = to0Var7;
        to0[] to0VarArr = {to0Var, to0Var2, to0Var3, to0Var4, to0Var5, to0Var6, to0Var7};
        h = to0VarArr;
        new yr0(to0VarArr);
    }

    public to0(String str, int i, TimeUnit timeUnit) {
        this.f4551a = timeUnit;
    }

    public static to0 valueOf(String str) {
        return (to0) Enum.valueOf(to0.class, str);
    }

    public static to0[] values() {
        return (to0[]) h.clone();
    }
}
