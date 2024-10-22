package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class vg3 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public static final vg3 f4833a;

    /* renamed from: b, reason: collision with root package name */
    public static final Handler f4834b;
    public static final /* synthetic */ vg3[] c;

    static {
        vg3 vg3Var = new vg3();
        f4833a = vg3Var;
        c = new vg3[]{vg3Var};
        f4834b = new Handler(Looper.getMainLooper());
    }

    public static vg3 valueOf(String str) {
        return (vg3) Enum.valueOf(vg3.class, str);
    }

    public static vg3[] values() {
        return (vg3[]) c.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        f4834b.post(runnable);
    }
}
