package defpackage;

import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ol0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final ol0 f3687a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ol0[] f3688b;

    static {
        ol0 ol0Var = new ol0();
        f3687a = ol0Var;
        f3688b = new ol0[]{ol0Var};
    }

    public static ol0 valueOf(String str) {
        return (ol0) Enum.valueOf(ol0.class, str);
    }

    public static ol0[] values() {
        return (ol0[]) f3688b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }
}
