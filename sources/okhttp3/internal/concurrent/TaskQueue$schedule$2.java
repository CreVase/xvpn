package okhttp3.internal.concurrent;

import defpackage.v31;

/* loaded from: classes2.dex */
public final class TaskQueue$schedule$2 extends Task {
    final /* synthetic */ v31 $block;
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$schedule$2(String str, v31 v31Var) {
        super(str, false, 2, null);
        this.$name = str;
        this.$block = v31Var;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        return ((Number) this.$block.invoke()).longValue();
    }
}
