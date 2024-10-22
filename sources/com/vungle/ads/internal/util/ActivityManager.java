package com.vungle.ads.internal.util;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ActivityManager;
import defpackage.g53;
import defpackage.ng0;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes2.dex */
public final class ActivityManager implements Application.ActivityLifecycleCallbacks {
    private Handler handler;
    private boolean isInitialized;
    private int resumed;
    private int started;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "ActivityManager";
    private static final ActivityManager instance = new ActivityManager();
    private static final long TIMEOUT = 3000;
    private static final long CONFIG_CHANGE_DELAY = 700;
    private final CopyOnWriteArraySet<LifeCycleCallback> callbacks = new CopyOnWriteArraySet<>();
    private final ConcurrentHashMap<LeftApplicationCallback, LifeCycleCallback> adLeftCallbacks = new ConcurrentHashMap<>();
    private boolean paused = true;
    private boolean stopped = true;
    private final Runnable configChangeRunnable = new g53(this, 12);

    /* loaded from: classes2.dex */
    public interface LeftApplicationCallback {
        void onLeftApplication();
    }

    /* loaded from: classes2.dex */
    public static class LifeCycleCallback {
        public void onPause() {
        }

        public void onResume() {
        }

        public void onStart() {
        }

        public void onStop() {
        }
    }

    private ActivityManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: configChangeRunnable$lambda-0, reason: not valid java name */
    public static final void m93configChangeRunnable$lambda0(ActivityManager activityManager) {
        if (activityManager.resumed == 0 && !activityManager.paused) {
            activityManager.paused = true;
            Iterator<LifeCycleCallback> it = activityManager.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onPause();
            }
        }
        if (activityManager.started == 0 && activityManager.paused && !activityManager.stopped) {
            activityManager.stopped = true;
            Iterator<LifeCycleCallback> it2 = activityManager.callbacks.iterator();
            while (it2.hasNext()) {
                it2.next().onStop();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.remove(lifeCycleCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeOnNextAppLeftCallback(LeftApplicationCallback leftApplicationCallback) {
        LifeCycleCallback remove;
        if (leftApplicationCallback != null && (remove = this.adLeftCallbacks.remove(leftApplicationCallback)) != null) {
            removeListener(remove);
        }
    }

    public final void addListener(LifeCycleCallback lifeCycleCallback) {
        this.callbacks.add(lifeCycleCallback);
    }

    public final void addOnNextAppLeftCallback(LeftApplicationCallback leftApplicationCallback) {
        if (leftApplicationCallback == null) {
            return;
        }
        if (!this.isInitialized) {
            leftApplicationCallback.onLeftApplication();
            return;
        }
        final WeakReference weakReference = new WeakReference(leftApplicationCallback);
        final Runnable runnable = new Runnable() { // from class: com.vungle.ads.internal.util.ActivityManager$addOnNextAppLeftCallback$cancelRunnable$1
            @Override // java.lang.Runnable
            public void run() {
                Handler handler;
                handler = ActivityManager.this.handler;
                if (handler != null) {
                    handler.removeCallbacks(this);
                }
                ActivityManager.this.removeOnNextAppLeftCallback(weakReference.get());
            }
        };
        LifeCycleCallback lifeCycleCallback = new LifeCycleCallback() { // from class: com.vungle.ads.internal.util.ActivityManager$addOnNextAppLeftCallback$callback$1
            private boolean wasPaused;

            public final boolean getWasPaused() {
                return this.wasPaused;
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onPause() {
                Handler handler;
                super.onPause();
                this.wasPaused = true;
                handler = this.handler;
                if (handler != null) {
                    handler.removeCallbacks(runnable);
                }
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onResume() {
                Handler handler;
                super.onResume();
                handler = this.handler;
                if (handler != null) {
                    handler.postDelayed(runnable, ActivityManager.Companion.getCONFIG_CHANGE_DELAY() * 2);
                }
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onStop() {
                Handler handler;
                ConcurrentHashMap concurrentHashMap;
                super.onStop();
                ActivityManager.LeftApplicationCallback leftApplicationCallback2 = weakReference.get();
                if (this.wasPaused && leftApplicationCallback2 != null) {
                    concurrentHashMap = this.adLeftCallbacks;
                    if (concurrentHashMap.containsKey(leftApplicationCallback2)) {
                        leftApplicationCallback2.onLeftApplication();
                    }
                }
                this.removeOnNextAppLeftCallback(leftApplicationCallback2);
                handler = this.handler;
                if (handler != null) {
                    handler.removeCallbacks(runnable);
                }
            }

            public final void setWasPaused(boolean z) {
                this.wasPaused = z;
            }
        };
        this.adLeftCallbacks.put(leftApplicationCallback, lifeCycleCallback);
        if (inForeground()) {
            Handler handler = this.handler;
            if (handler != null) {
                handler.postDelayed(runnable, TIMEOUT);
            }
            addListener(lifeCycleCallback);
            return;
        }
        instance.addListener(new LifeCycleCallback() { // from class: com.vungle.ads.internal.util.ActivityManager$addOnNextAppLeftCallback$1
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onStart() {
                ConcurrentHashMap concurrentHashMap;
                Handler handler2;
                ActivityManager.Companion companion = ActivityManager.Companion;
                companion.getInstance().removeListener(this);
                concurrentHashMap = ActivityManager.this.adLeftCallbacks;
                ActivityManager.LifeCycleCallback lifeCycleCallback2 = (ActivityManager.LifeCycleCallback) concurrentHashMap.get(weakReference.get());
                if (lifeCycleCallback2 != null) {
                    handler2 = ActivityManager.this.handler;
                    if (handler2 != null) {
                        handler2.postDelayed(runnable, companion.getTIMEOUT());
                    }
                    ActivityManager.this.addListener(lifeCycleCallback2);
                }
            }
        });
    }

    public final void deInit(Context context) {
        ((Application) context.getApplicationContext()).unregisterActivityLifecycleCallbacks(this);
        this.started = 0;
        this.resumed = 0;
        this.paused = true;
        this.stopped = true;
        this.isInitialized = false;
        this.callbacks.clear();
        this.adLeftCallbacks.clear();
    }

    public final boolean inForeground() {
        if (this.isInitialized && this.started <= 0) {
            return false;
        }
        return true;
    }

    public final void init(Context context) {
        if (this.isInitialized) {
            return;
        }
        this.handler = new Handler(Looper.getMainLooper());
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(this);
        this.isInitialized = true;
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        this.resumed = Math.max(0, this.resumed - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        int i = this.resumed + 1;
        this.resumed = i;
        if (i == 1) {
            if (this.paused) {
                this.paused = false;
                Iterator<LifeCycleCallback> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onResume();
                }
                return;
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.configChangeRunnable);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        int i = this.started + 1;
        this.started = i;
        if (i == 1 && this.stopped) {
            this.stopped = false;
            Iterator<LifeCycleCallback> it = this.callbacks.iterator();
            while (it.hasNext()) {
                it.next().onStart();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        this.started = Math.max(0, this.started - 1);
        Handler handler = this.handler;
        if (handler != null) {
            handler.postDelayed(this.configChangeRunnable, CONFIG_CHANGE_DELAY);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ void getCONFIG_CHANGE_DELAY$annotations() {
        }

        public static /* synthetic */ void getTIMEOUT$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean startActivityHandleException(Context context, Intent intent, Intent intent2, PresenterAdOpenCallback presenterAdOpenCallback) {
            if (intent == null && intent2 == null) {
                return false;
            }
            try {
                if (intent != null) {
                    context.startActivity(intent);
                    if (presenterAdOpenCallback != null) {
                        presenterAdOpenCallback.onDeeplinkClick(true);
                    }
                } else {
                    context.startActivity(intent2);
                }
                return true;
            } catch (Exception e) {
                Log.e(getTAG(), "Cannot launch/find activity to handle the Implicit intent: " + e);
                if (intent != null) {
                    try {
                        AnalyticsClient.INSTANCE.logError$vungle_ads_release(312, "Fail to open " + intent.getDataString(), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                        if (presenterAdOpenCallback != null) {
                            presenterAdOpenCallback.onDeeplinkClick(false);
                        }
                    } catch (Exception unused) {
                        return false;
                    }
                }
                if (intent != null && intent2 != null) {
                    context.startActivity(intent2);
                    return true;
                }
                return false;
            }
        }

        public final void addLifecycleListener(LifeCycleCallback lifeCycleCallback) {
            getInstance().addListener(lifeCycleCallback);
        }

        public final long getCONFIG_CHANGE_DELAY() {
            return ActivityManager.CONFIG_CHANGE_DELAY;
        }

        public final ActivityManager getInstance() {
            return ActivityManager.instance;
        }

        public final String getTAG() {
            return ActivityManager.TAG;
        }

        public final long getTIMEOUT() {
            return ActivityManager.TIMEOUT;
        }

        public final void startWhenForeground(Context context, final Intent intent, final Intent intent2, final LeftApplicationCallback leftApplicationCallback, final PresenterAdOpenCallback presenterAdOpenCallback) {
            final WeakReference weakReference = new WeakReference(context);
            if (getInstance().inForeground()) {
                if (startActivityHandleException(context, intent, intent2, presenterAdOpenCallback)) {
                    getInstance().addOnNextAppLeftCallback(leftApplicationCallback);
                    return;
                }
                return;
            }
            getInstance().addListener(new LifeCycleCallback() { // from class: com.vungle.ads.internal.util.ActivityManager$Companion$startWhenForeground$1
                @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
                public void onStart() {
                    boolean startActivityHandleException;
                    super.onStart();
                    ActivityManager.Companion companion = ActivityManager.Companion;
                    companion.getInstance().removeListener(this);
                    Context context2 = weakReference.get();
                    if (context2 != null) {
                        startActivityHandleException = companion.startActivityHandleException(context2, intent, intent2, presenterAdOpenCallback);
                        if (startActivityHandleException) {
                            companion.getInstance().addOnNextAppLeftCallback(leftApplicationCallback);
                        }
                    }
                }
            });
        }

        public final void startWhenForeground(Context context, Intent intent, Intent intent2, LeftApplicationCallback leftApplicationCallback) {
            startWhenForeground(context, intent, intent2, leftApplicationCallback, null);
        }
    }
}
