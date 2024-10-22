package com.vungle.ads.internal;

import android.content.Context;
import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConfigurationError;
import com.vungle.ads.ConfigurationResponseError;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.InvalidAppId;
import com.vungle.ads.Metric;
import com.vungle.ads.NetworkPermissionsNotGranted;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.OutOfMemory;
import com.vungle.ads.SdkAlreadyInitialized;
import com.vungle.ads.SdkInitializationInProgress;
import com.vungle.ads.SdkNotInitialized;
import com.vungle.ads.SdkVersionTooLow;
import com.vungle.ads.ServerRetryError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.UnknownConfigurationError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.load.MraidJsLoader;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.ThreadUtil;
import defpackage.ew3;
import defpackage.hx2;
import defpackage.i23;
import defpackage.kj1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.to1;
import defpackage.ui1;
import defpackage.vn3;
import defpackage.x31;
import defpackage.zu3;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class VungleInitializer {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "VungleInitializer";
    private boolean isInitialized;
    private AtomicBoolean isInitializing = new AtomicBoolean(false);
    private TimeIntervalMetric initRequestToResponseMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.INIT_REQUEST_TO_RESPONSE_DURATION_MS);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public static /* synthetic */ void a(InitializationListener initializationListener, VungleError vungleError) {
        initializationListener.onError(vungleError);
    }

    private final void configure(Context context, InitializationListener initializationListener, boolean z) {
        Response<ConfigPayload> response;
        ConfigPayload.Endpoints endpoints;
        boolean z2;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        kj1 kj1Var = kj1.f2953a;
        ui1 D0 = m20.D0(kj1Var, new VungleInitializer$configure$$inlined$inject$1(context));
        boolean z3 = true;
        try {
            this.initRequestToResponseMetric.markStart();
            Call<ConfigPayload> config = m51configure$lambda5(D0).config();
            if (config != null) {
                response = config.execute();
            } else {
                response = null;
            }
            if (response == null) {
                onInitError(initializationListener, new SdkNotInitialized().logError$vungle_ads_release());
                return;
            }
            if (!response.isSuccessful()) {
                if (m51configure$lambda5(D0).getRetryAfterHeaderValue(response) > 0) {
                    onInitError(initializationListener, new ServerRetryError());
                    this.isInitializing.set(false);
                    return;
                } else {
                    onInitError(initializationListener, new ConfigurationError().logError$vungle_ads_release());
                    this.isInitializing.set(false);
                    return;
                }
            }
            this.initRequestToResponseMetric.markEnd();
            ConfigPayload body = response.body();
            if (body != null) {
                endpoints = body.getEndpoints();
            } else {
                endpoints = null;
            }
            if (endpoints == null) {
                onInitError(initializationListener, new ConfigurationResponseError().logError$vungle_ads_release());
                this.isInitializing.set(false);
                return;
            }
            ConfigManager configManager = ConfigManager.INSTANCE;
            configManager.initWithConfig(body);
            AnalyticsClient.INSTANCE.init$vungle_ads_release(m51configure$lambda5(D0), m52configure$lambda6(m20.D0(kj1Var, new VungleInitializer$configure$$inlined$inject$2(context))).getLoggerExecutor(), configManager.getLogLevel(), configManager.getMetricsEnabled());
            if (!configManager.validateEndpoints$vungle_ads_release()) {
                onInitError(initializationListener, new ConfigurationError());
                this.isInitializing.set(false);
                return;
            }
            ui1 D02 = m20.D0(kj1Var, new VungleInitializer$configure$$inlined$inject$3(context));
            String configExtension = body.getConfigExtension();
            if (configExtension != null && configExtension.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                m53configure$lambda7(D02).remove(Cookie.CONFIG_EXTENSION).apply();
            } else {
                m53configure$lambda7(D02).put(Cookie.CONFIG_EXTENSION, configExtension).apply();
            }
            if (configManager.omEnabled()) {
                m54configure$lambda9(m20.D0(kj1Var, new VungleInitializer$configure$$inlined$inject$4(context))).init();
            }
            if (configManager.placements() == null) {
                onInitError(initializationListener, new ConfigurationError());
                this.isInitializing.set(false);
            } else {
                PrivacyManager.INSTANCE.updateDisableAdId(configManager.shouldDisableAdId());
                m50configure$lambda10(m20.D0(kj1Var, new VungleInitializer$configure$$inlined$inject$5(context))).execute(CleanupJob.Companion.makeJobInfo$default(CleanupJob.Companion, null, 1, null));
                downloadJs(context, new VungleInitializer$configure$2(this, initializationListener));
            }
        } catch (Throwable th) {
            this.isInitialized = false;
            this.isInitializing.set(false);
            Log.e(TAG, Log.getStackTraceString(th));
            if (!(th instanceof UnknownHostException)) {
                z3 = th instanceof SecurityException;
            }
            if (z3) {
                onInitError(initializationListener, new NetworkUnreachable().logError$vungle_ads_release());
            } else if (th instanceof VungleError) {
                onInitError(initializationListener, th);
            } else {
                onInitError(initializationListener, new UnknownConfigurationError().logError$vungle_ads_release());
            }
        }
    }

    /* renamed from: configure$lambda-10 */
    private static final JobRunner m50configure$lambda10(ui1 ui1Var) {
        return (JobRunner) ui1Var.getValue();
    }

    /* renamed from: configure$lambda-5 */
    private static final VungleApiClient m51configure$lambda5(ui1 ui1Var) {
        return (VungleApiClient) ui1Var.getValue();
    }

    /* renamed from: configure$lambda-6 */
    private static final Executors m52configure$lambda6(ui1 ui1Var) {
        return (Executors) ui1Var.getValue();
    }

    /* renamed from: configure$lambda-7 */
    private static final FilePreferences m53configure$lambda7(ui1 ui1Var) {
        return (FilePreferences) ui1Var.getValue();
    }

    /* renamed from: configure$lambda-9 */
    private static final OMInjector m54configure$lambda9(ui1 ui1Var) {
        return (OMInjector) ui1Var.getValue();
    }

    private final void downloadJs(Context context, x31 x31Var) {
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        kj1 kj1Var = kj1.f2953a;
        MraidJsLoader.INSTANCE.downloadJs(m55downloadJs$lambda13(m20.D0(kj1Var, new VungleInitializer$downloadJs$$inlined$inject$1(context))), m56downloadJs$lambda14(m20.D0(kj1Var, new VungleInitializer$downloadJs$$inlined$inject$2(context))), new VungleInitializer$downloadJs$1(x31Var));
    }

    /* renamed from: downloadJs$lambda-13 */
    private static final PathProvider m55downloadJs$lambda13(ui1 ui1Var) {
        return (PathProvider) ui1Var.getValue();
    }

    /* renamed from: downloadJs$lambda-14 */
    private static final Downloader m56downloadJs$lambda14(ui1 ui1Var) {
        return (Downloader) ui1Var.getValue();
    }

    /* renamed from: init$lambda-0 */
    private static final Platform m57init$lambda0(ui1 ui1Var) {
        return (Platform) ui1Var.getValue();
    }

    /* renamed from: init$lambda-1 */
    private static final Executors m58init$lambda1(ui1 ui1Var) {
        return (Executors) ui1Var.getValue();
    }

    /* renamed from: init$lambda-2 */
    private static final VungleApiClient m59init$lambda2(ui1 ui1Var) {
        return (VungleApiClient) ui1Var.getValue();
    }

    /* renamed from: init$lambda-3 */
    public static final void m60init$lambda3(Context context, String str, VungleInitializer vungleInitializer, InitializationListener initializationListener, ui1 ui1Var) {
        PrivacyManager.INSTANCE.init(context);
        m59init$lambda2(ui1Var).initialize(str);
        vungleInitializer.configure(context, initializationListener, false);
    }

    /* renamed from: init$lambda-4 */
    public static final void m61init$lambda4(VungleInitializer vungleInitializer, InitializationListener initializationListener) {
        vungleInitializer.onInitError(initializationListener, new OutOfMemory().logError$vungle_ads_release());
    }

    private final boolean isAppIdInvalid(String str) {
        return i23.b1(str);
    }

    public final void onInitError(InitializationListener initializationListener, VungleError vungleError) {
        ThreadUtil.INSTANCE.runOnUiThread(new to1(16, initializationListener, vungleError));
        String localizedMessage = vungleError.getLocalizedMessage();
        if (localizedMessage == null) {
            localizedMessage = hx2.m("Exception code is ", vungleError.getCode());
        }
        Log.e(TAG, localizedMessage);
    }

    public final void onInitSuccess(InitializationListener initializationListener) {
        ThreadUtil.INSTANCE.runOnUiThread(new vn3(initializationListener, this));
    }

    /* renamed from: onInitSuccess$lambda-12 */
    public static final void m63onInitSuccess$lambda12(InitializationListener initializationListener, VungleInitializer vungleInitializer) {
        initializationListener.onSuccess();
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release((Metric) vungleInitializer.initRequestToResponseMetric, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : VungleApiClient.Companion.getBASE_URL$vungle_ads_release());
    }

    public final void deInit$vungle_ads_release() {
        ServiceLocator.Companion.deInit();
        VungleApiClient.Companion.reset$vungle_ads_release();
        this.isInitialized = false;
        this.isInitializing.set(false);
    }

    public final void init(String str, Context context, InitializationListener initializationListener) {
        if (isAppIdInvalid(str)) {
            onInitError(initializationListener, new InvalidAppId().logError$vungle_ads_release());
            return;
        }
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        kj1 kj1Var = kj1.f2953a;
        if (!m57init$lambda0(m20.D0(kj1Var, new VungleInitializer$init$$inlined$inject$1(context))).isAtLeastMinimumSDK()) {
            Log.e(TAG, "SDK is supported only for API versions 21 and above");
            onInitError(initializationListener, new SdkVersionTooLow().logError$vungle_ads_release());
            return;
        }
        if (isInitialized()) {
            new SdkAlreadyInitialized().logError$vungle_ads_release();
            onInitSuccess(initializationListener);
            return;
        }
        if (this.isInitializing.getAndSet(true)) {
            onInitError(initializationListener, new SdkInitializationInProgress().logError$vungle_ads_release());
            return;
        }
        if (ew3.B0(context, "android.permission.ACCESS_NETWORK_STATE") == 0 && ew3.B0(context, "android.permission.INTERNET") == 0) {
            m58init$lambda1(m20.D0(kj1Var, new VungleInitializer$init$$inlined$inject$2(context))).getBackgroundExecutor().execute(new zu3(context, str, this, initializationListener, m20.D0(kj1Var, new VungleInitializer$init$$inlined$inject$3(context))), new vn3(this, initializationListener));
        } else {
            Log.e(TAG, "Network permissions not granted");
            onInitError(initializationListener, new NetworkPermissionsNotGranted());
            this.isInitializing.set(false);
        }
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public final boolean isInitialized$vungle_ads_release() {
        return this.isInitialized;
    }

    public final AtomicBoolean isInitializing$vungle_ads_release() {
        return this.isInitializing;
    }

    public final void setInitialized$vungle_ads_release(boolean z) {
        this.isInitialized = z;
    }

    public final void setInitializing$vungle_ads_release(AtomicBoolean atomicBoolean) {
        this.isInitializing = atomicBoolean;
    }
}
