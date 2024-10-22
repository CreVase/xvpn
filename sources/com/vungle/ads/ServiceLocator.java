package com.vungle.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import com.vungle.ads.internal.downloader.AssetDownloader;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.locale.LocaleInfo;
import com.vungle.ads.internal.locale.SystemLocaleInfo;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.task.JobCreator;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.task.JobRunnerThreadPriorityHelper;
import com.vungle.ads.internal.task.VungleJobCreator;
import com.vungle.ads.internal.task.VungleJobRunner;
import com.vungle.ads.internal.util.ConcurrencyTimeoutProvider;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.kj1;
import defpackage.ng0;
import defpackage.ui1;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ServiceLocator {
    public static final Companion Companion = new Companion(null);

    @SuppressLint({"StaticFieldLeak"})
    private static volatile ServiceLocator INSTANCE;
    private final Map<Class<?>, Object> cache;
    private final Map<Class<?>, Creator<?>> creators;
    private final Context ctx;

    @Keep
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ void getINSTANCE$vungle_ads_release$annotations() {
        }

        public final synchronized void deInit() {
            setINSTANCE$vungle_ads_release(null);
        }

        public final ServiceLocator getINSTANCE$vungle_ads_release() {
            return ServiceLocator.INSTANCE;
        }

        public final ServiceLocator getInstance(Context context) {
            ServiceLocator iNSTANCE$vungle_ads_release = getINSTANCE$vungle_ads_release();
            if (iNSTANCE$vungle_ads_release == null) {
                synchronized (this) {
                    Companion companion = ServiceLocator.Companion;
                    ServiceLocator iNSTANCE$vungle_ads_release2 = companion.getINSTANCE$vungle_ads_release();
                    if (iNSTANCE$vungle_ads_release2 == null) {
                        iNSTANCE$vungle_ads_release2 = new ServiceLocator(context, null);
                        companion.setINSTANCE$vungle_ads_release(iNSTANCE$vungle_ads_release2);
                    }
                    iNSTANCE$vungle_ads_release = iNSTANCE$vungle_ads_release2;
                }
            }
            return iNSTANCE$vungle_ads_release;
        }

        public final <T> ui1 inject(Context context) {
            kj1 kj1Var = kj1.f2953a;
            throw new UnsupportedOperationException("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
        }

        public final void setINSTANCE$vungle_ads_release(ServiceLocator serviceLocator) {
            ServiceLocator.INSTANCE = serviceLocator;
        }
    }

    /* loaded from: classes2.dex */
    public abstract class Creator<T> {
        private final boolean isSingleton;

        public Creator(boolean z) {
            this.isSingleton = z;
        }

        public abstract T create();

        public final boolean isSingleton() {
            return this.isSingleton;
        }

        public /* synthetic */ Creator(ServiceLocator serviceLocator, boolean z, int i, ng0 ng0Var) {
            this((i & 1) != 0 ? true : z);
        }
    }

    public /* synthetic */ ServiceLocator(Context context, ng0 ng0Var) {
        this(context);
    }

    private final void buildCreators() {
        this.creators.put(JobCreator.class, new Creator<JobCreator>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$1
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobCreator create() {
                Context context;
                context = ServiceLocator.this.ctx;
                return new VungleJobCreator(context, (PathProvider) ServiceLocator.this.getOrBuild$vungle_ads_release(PathProvider.class));
            }
        });
        this.creators.put(JobRunner.class, new Creator<JobRunner>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$2
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public JobRunner create() {
                return new VungleJobRunner((JobCreator) ServiceLocator.this.getOrBuild$vungle_ads_release(JobCreator.class), ((Executors) ServiceLocator.this.getOrBuild$vungle_ads_release(Executors.class)).getJobExecutor(), new JobRunnerThreadPriorityHelper());
            }
        });
        this.creators.put(VungleApiClient.class, new Creator<VungleApiClient>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$3
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public VungleApiClient create() {
                Context context;
                context = ServiceLocator.this.ctx;
                return new VungleApiClient(context, (Platform) ServiceLocator.this.getOrBuild$vungle_ads_release(Platform.class), (FilePreferences) ServiceLocator.this.getOrBuild$vungle_ads_release(FilePreferences.class), (PathProvider) ServiceLocator.this.getOrBuild$vungle_ads_release(PathProvider.class));
            }
        });
        this.creators.put(Platform.class, new Creator<Platform>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$4
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Platform create() {
                Context context;
                Executors executors = (Executors) ServiceLocator.this.getOrBuild$vungle_ads_release(Executors.class);
                context = ServiceLocator.this.ctx;
                return new AndroidPlatform(context, executors.getUaExecutor());
            }
        });
        this.creators.put(Executors.class, new Creator<Executors>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$5
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Executors create() {
                return new SDKExecutors();
            }
        });
        this.creators.put(OMInjector.class, new Creator<OMInjector>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$6
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMInjector create() {
                Context context;
                context = ServiceLocator.this.ctx;
                return new OMInjector(context);
            }
        });
        this.creators.put(OMTracker.Factory.class, new Creator<OMTracker.Factory>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$7
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public OMTracker.Factory create() {
                return new OMTracker.Factory();
            }
        });
        this.creators.put(FilePreferences.class, new Creator<FilePreferences>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$8
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public FilePreferences create() {
                return new FilePreferences(((Executors) ServiceLocator.this.getOrBuild$vungle_ads_release(Executors.class)).getIoExecutor(), (PathProvider) ServiceLocator.this.getOrBuild$vungle_ads_release(PathProvider.class));
            }
        });
        this.creators.put(LocaleInfo.class, new Creator<LocaleInfo>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$9
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public LocaleInfo create() {
                return new SystemLocaleInfo();
            }
        });
        this.creators.put(BidTokenEncoder.class, new Creator<BidTokenEncoder>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$10
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public BidTokenEncoder create() {
                return new BidTokenEncoder((LocaleInfo) ServiceLocator.this.getOrBuild$vungle_ads_release(LocaleInfo.class), (Platform) ServiceLocator.this.getOrBuild$vungle_ads_release(Platform.class), (FilePreferences) ServiceLocator.this.getOrBuild$vungle_ads_release(FilePreferences.class));
            }
        });
        this.creators.put(PathProvider.class, new Creator<PathProvider>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$11
            {
                super(ServiceLocator.this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public PathProvider create() {
                Context context;
                context = ServiceLocator.this.ctx;
                return new PathProvider(context);
            }
        });
        this.creators.put(Downloader.class, new Creator<Downloader>() { // from class: com.vungle.ads.ServiceLocator$buildCreators$12
            {
                super(false);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public Downloader create() {
                return new AssetDownloader(((Executors) ServiceLocator.this.getOrBuild$vungle_ads_release(Executors.class)).getDownloaderExecutor(), (PathProvider) ServiceLocator.this.getOrBuild$vungle_ads_release(PathProvider.class));
            }
        });
        this.creators.put(ConcurrencyTimeoutProvider.class, new Creator<ConcurrencyTimeoutProvider>(this) { // from class: com.vungle.ads.ServiceLocator$buildCreators$13
            {
                super(this, false, 1, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.vungle.ads.ServiceLocator.Creator
            public ConcurrencyTimeoutProvider create() {
                return new ConcurrencyTimeoutProvider();
            }
        });
    }

    private final Class<?> getServiceClass(Class<?> cls) {
        for (Class<?> cls2 : this.creators.keySet()) {
            if (cls2.isAssignableFrom(cls)) {
                return cls2;
            }
        }
        throw new IllegalArgumentException("Unknown dependency for " + cls);
    }

    public final <T> void bindService$vungle_ads_release(Class<?> cls, T t) {
        this.cache.put(cls, t);
    }

    public final <T> T getOrBuild$vungle_ads_release(Class<T> cls) {
        Class<?> serviceClass = getServiceClass(cls);
        T t = (T) this.cache.get(serviceClass);
        if (t == null) {
            Creator<?> creator = this.creators.get(serviceClass);
            if (creator != null) {
                T t2 = (T) creator.create();
                if (creator.isSingleton()) {
                    this.cache.put(serviceClass, t2);
                }
                return t2;
            }
            throw new IllegalArgumentException("Unknown class");
        }
        return t;
    }

    public final synchronized <T> T getService(Class<T> cls) {
        return (T) getOrBuild$vungle_ads_release(cls);
    }

    public final synchronized <T> boolean isCreated(Class<T> cls) {
        return this.cache.containsKey(getServiceClass(cls));
    }

    private ServiceLocator(Context context) {
        this.ctx = context.getApplicationContext();
        this.creators = new HashMap();
        this.cache = new HashMap();
        buildCreators();
    }
}
