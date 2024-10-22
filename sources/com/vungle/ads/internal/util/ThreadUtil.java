package com.vungle.ads.internal.util;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import defpackage.m20;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class ThreadUtil {
    public static final ThreadUtil INSTANCE = new ThreadUtil();
    private static final Handler UI_HANDLER = new Handler(Looper.getMainLooper());
    private static Executor uiExecutor;

    private ThreadUtil() {
    }

    public static /* synthetic */ void getUiExecutor$vungle_ads_release$annotations() {
    }

    public final Executor getUiExecutor$vungle_ads_release() {
        return uiExecutor;
    }

    public final boolean isMainThread() {
        boolean isCurrentThread;
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            isCurrentThread = mainLooper.isCurrentThread();
            return isCurrentThread;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper == null || !m20.L(mainLooper.getThread(), myLooper.getThread())) {
            return false;
        }
        return true;
    }

    public final void runOnUiThread(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
            return;
        }
        Executor executor = uiExecutor;
        if (executor != null) {
            if (executor != null) {
                executor.execute(runnable);
                return;
            }
            return;
        }
        UI_HANDLER.post(runnable);
    }

    public final void setUiExecutor$vungle_ads_release(Executor executor) {
        uiExecutor = executor;
    }
}
