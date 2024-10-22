package defpackage;

import android.content.Context;
import android.os.ConditionVariable;

/* loaded from: classes.dex */
public final class xk0 extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5171a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5172b;
    public final /* synthetic */ Object c;

    public xk0(Context context, String str) {
        this.f5172b = context;
        this.c = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x018b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk0.run():void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk0(vu2 vu2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = vu2Var;
        this.f5172b = conditionVariable;
    }
}
