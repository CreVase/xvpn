package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class eq0 implements zp0 {

    /* renamed from: a, reason: collision with root package name */
    public Context f1973a;

    public eq0(Context context) {
        this.f1973a = context.getApplicationContext();
    }

    @Override // defpackage.zp0
    public final void a(m20 m20Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new p40("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new cq0(0, this, m20Var, threadPoolExecutor));
    }
}
