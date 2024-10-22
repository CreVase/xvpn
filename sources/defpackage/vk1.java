package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public abstract class vk1 {
    private static final vk1 FULL_INSTANCE;
    private static final vk1 LITE_INSTANCE;

    static {
        qk1 qk1Var = null;
        FULL_INSTANCE = new rk1();
        LITE_INSTANCE = new tk1();
    }

    private vk1() {
    }

    public static vk1 full() {
        return FULL_INSTANCE;
    }

    public static vk1 lite() {
        return LITE_INSTANCE;
    }

    public abstract void makeImmutableListAt(Object obj, long j);

    public abstract <L> void mergeListsAt(Object obj, Object obj2, long j);

    public abstract <L> List<L> mutableListAt(Object obj, long j);
}
