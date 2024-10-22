package defpackage;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.internal.util.common.ANActivityLifecycleCallbacksListener;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class dp0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1813a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1814b;
    public final /* synthetic */ MultithreadedBundleWrapper c;
    public final /* synthetic */ AudienceNetworkAds.InitListener d;

    public dp0(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, boolean z) {
        this.f1813a = context;
        this.f1814b = z;
        this.c = multithreadedBundleWrapper;
        this.d = initListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th;
        DynamicLoader dynamicLoader;
        AtomicBoolean atomicBoolean;
        ANActivityLifecycleCallbacksListener.registerActivityCallbacks(this.f1813a);
        synchronized (DynamicLoaderFactory.class) {
            DynamicLoader dynamicLoader2 = null;
            th = null;
            int i = 0;
            while (i < 3) {
                try {
                    dynamicLoader2 = DynamicLoaderFactory.doMakeLoader(this.f1813a, false);
                    break;
                } finally {
                }
            }
            dynamicLoader = dynamicLoader2;
        }
        DynamicLoaderFactory.doCallInitialize(this.f1813a, dynamicLoader, th, this.f1814b, this.c, this.d);
        atomicBoolean = DynamicLoaderFactory.sInitializing;
        atomicBoolean.set(false);
    }
}
