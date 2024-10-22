package okhttp3.internal.concurrent;

import defpackage.v31;

/* loaded from: classes2.dex */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ v31 $block;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, v31 v31Var) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.$block = v31Var;
    }

    @Override // okhttp3.internal.concurrent.Task
    public long runOnce() {
        this.$block.invoke();
        return -1L;
    }
}
