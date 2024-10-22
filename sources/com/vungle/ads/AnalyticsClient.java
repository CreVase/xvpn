package com.vungle.ads;

import android.os.Build;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.Logger;
import defpackage.d9;
import defpackage.ng0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class AnalyticsClient {
    private static VungleThreadPoolExecutor executor = null;
    private static final int maxBatchSize = 20;
    private static boolean metricsEnabled = false;
    private static boolean paused = false;
    private static final long refreshTimeMillis = 5000;
    private static VungleApiClient vungleApiClient;
    public static final AnalyticsClient INSTANCE = new AnalyticsClient();
    private static final String TAG = "AnalyticsClient";
    private static final BlockingQueue<Sdk.SDKError.Builder> errors = new LinkedBlockingQueue();
    private static final BlockingQueue<Sdk.SDKMetric.Builder> metrics = new LinkedBlockingQueue();
    private static int maxErrorLogLevel = Integer.MAX_VALUE;
    private static LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_ERROR;

    /* loaded from: classes2.dex */
    public enum LogLevel {
        ERROR_LOG_LEVEL_OFF(0),
        ERROR_LOG_LEVEL_ERROR(1),
        ERROR_LOG_LEVEL_DEBUG(2);

        public static final Companion Companion = new Companion(null);
        private final int level;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }

            public final LogLevel fromValue(int i) {
                LogLevel logLevel = LogLevel.ERROR_LOG_LEVEL_DEBUG;
                if (i == logLevel.getLevel()) {
                    return logLevel;
                }
                LogLevel logLevel2 = LogLevel.ERROR_LOG_LEVEL_ERROR;
                if (i == logLevel2.getLevel()) {
                    return logLevel2;
                }
                LogLevel logLevel3 = LogLevel.ERROR_LOG_LEVEL_OFF;
                if (i == logLevel3.getLevel()) {
                    return logLevel3;
                }
                return logLevel2;
            }
        }

        LogLevel(int i) {
            this.level = i;
        }

        public final int getLevel() {
            return this.level;
        }
    }

    /* loaded from: classes2.dex */
    public interface RequestListener {
        void onFailure();

        void onSuccess();
    }

    private AnalyticsClient() {
    }

    private final void flushErrors() {
        Logger.Companion.d(TAG, "Sending " + errors.size() + " errors");
        VungleThreadPoolExecutor vungleThreadPoolExecutor = executor;
        if (vungleThreadPoolExecutor != null) {
            vungleThreadPoolExecutor.execute(new d9(21));
        }
    }

    /* renamed from: flushErrors$lambda-3 */
    public static final void m9flushErrors$lambda3() {
        VungleApiClient vungleApiClient2;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        errors.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (vungleApiClient2 = vungleApiClient) != null) {
            vungleApiClient2.reportErrors(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient$flushErrors$1$1
                @Override // com.vungle.ads.AnalyticsClient.RequestListener
                public void onFailure() {
                    String str;
                    Logger.Companion companion = Logger.Companion;
                    str = AnalyticsClient.TAG;
                    companion.d(str, "Failed to send " + linkedBlockingQueue.size() + " errors");
                    AnalyticsClient.INSTANCE.getErrors$vungle_ads_release().addAll(linkedBlockingQueue);
                }

                @Override // com.vungle.ads.AnalyticsClient.RequestListener
                public void onSuccess() {
                    String str;
                    Logger.Companion companion = Logger.Companion;
                    str = AnalyticsClient.TAG;
                    companion.d(str, "Sent " + linkedBlockingQueue.size() + " errors");
                }
            });
        }
    }

    private final void flushMetrics() {
        Logger.Companion.d(TAG, "Sending " + metrics.size() + " metrics");
        VungleThreadPoolExecutor vungleThreadPoolExecutor = executor;
        if (vungleThreadPoolExecutor != null) {
            vungleThreadPoolExecutor.execute(new d9(23));
        }
    }

    /* renamed from: flushMetrics$lambda-2 */
    public static final void m10flushMetrics$lambda2() {
        VungleApiClient vungleApiClient2;
        final LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        metrics.drainTo(linkedBlockingQueue);
        if (!linkedBlockingQueue.isEmpty() && (vungleApiClient2 = vungleApiClient) != null) {
            vungleApiClient2.reportMetrics(linkedBlockingQueue, new RequestListener() { // from class: com.vungle.ads.AnalyticsClient$flushMetrics$1$1
                @Override // com.vungle.ads.AnalyticsClient.RequestListener
                public void onFailure() {
                    String str;
                    Logger.Companion companion = Logger.Companion;
                    str = AnalyticsClient.TAG;
                    companion.d(str, "Failed to send " + linkedBlockingQueue.size() + " metrics");
                    AnalyticsClient.INSTANCE.getMetrics$vungle_ads_release().addAll(linkedBlockingQueue);
                }

                @Override // com.vungle.ads.AnalyticsClient.RequestListener
                public void onSuccess() {
                    String str;
                    Logger.Companion companion = Logger.Companion;
                    str = AnalyticsClient.TAG;
                    companion.d(str, "Sent " + linkedBlockingQueue.size() + " metrics");
                }
            });
        }
    }

    public static /* synthetic */ void getErrors$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getExecutor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetrics$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMetricsEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    /* renamed from: init$lambda-0 */
    public static final void m11init$lambda0() {
        INSTANCE.report();
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, Sdk.SDKMetric.SDKMetricType sDKMetricType, long j, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        analyticsClient.logMetric$vungle_ads_release(sDKMetricType, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) == 0 ? str4 : null, (i & 64) != 0 ? false : z);
    }

    private final synchronized void report() {
        if (paused) {
            return;
        }
        if (logLevel != LogLevel.ERROR_LOG_LEVEL_OFF && errors.size() > 0) {
            flushErrors();
        }
        if (metricsEnabled && metrics.size() > 0) {
            flushMetrics();
        }
    }

    public final BlockingQueue<Sdk.SDKError.Builder> getErrors$vungle_ads_release() {
        return errors;
    }

    public final VungleThreadPoolExecutor getExecutor$vungle_ads_release() {
        return executor;
    }

    public final BlockingQueue<Sdk.SDKMetric.Builder> getMetrics$vungle_ads_release() {
        return metrics;
    }

    public final boolean getMetricsEnabled$vungle_ads_release() {
        return metricsEnabled;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return vungleApiClient;
    }

    public final void init$vungle_ads_release(VungleApiClient vungleApiClient2, VungleThreadPoolExecutor vungleThreadPoolExecutor, int i, boolean z) {
        executor = vungleThreadPoolExecutor;
        vungleApiClient = vungleApiClient2;
        metricsEnabled = z;
        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(new d9(22), 0L, refreshTimeMillis, TimeUnit.MILLISECONDS);
        maxErrorLogLevel = i;
        logLevel = LogLevel.Companion.fromValue(i);
        if (i == LogLevel.ERROR_LOG_LEVEL_DEBUG.getLevel()) {
            Logger.Companion.enable(true);
        } else if (i == LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel()) {
            Logger.Companion.enable(false);
        } else if (i == LogLevel.ERROR_LOG_LEVEL_OFF.getLevel()) {
            Logger.Companion.enable(false);
        }
        ActivityManager.Companion.getInstance().addListener(new ActivityManager.LifeCycleCallback() { // from class: com.vungle.ads.AnalyticsClient$init$2
            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onPause() {
                super.onPause();
                AnalyticsClient.INSTANCE.pause();
            }

            @Override // com.vungle.ads.internal.util.ActivityManager.LifeCycleCallback
            public void onResume() {
                super.onResume();
                AnalyticsClient.INSTANCE.resume();
            }
        });
    }

    public final synchronized void logError$vungle_ads_release(Sdk.SDKError.Reason reason, String str, String str2, String str3, String str4) {
        if (logLevel == LogLevel.ERROR_LOG_LEVEL_OFF) {
            return;
        }
        try {
            Sdk.SDKError.Builder at = Sdk.SDKError.newBuilder().setOs("Android").setOsVersion(String.valueOf(Build.VERSION.SDK_INT)).setMake(Build.MANUFACTURER).setModel(Build.MODEL).setReason(reason).setMessage(str).setAt(System.currentTimeMillis());
            if (str2 == null) {
                str2 = "";
            }
            Sdk.SDKError.Builder placementReferenceId = at.setPlacementReferenceId(str2);
            if (str3 == null) {
                str3 = "";
            }
            Sdk.SDKError.Builder creativeId = placementReferenceId.setCreativeId(str3);
            if (str4 == null) {
                str4 = "";
            }
            Sdk.SDKError.Builder eventId = creativeId.setEventId(str4);
            BlockingQueue<Sdk.SDKError.Builder> blockingQueue = errors;
            blockingQueue.put(eventId);
            if (blockingQueue.size() >= 20) {
                report();
            }
        } catch (Exception e) {
            Logger.Companion.e(TAG, "Cannot logError", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0046 A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0033, B:14:0x003a, B:19:0x0046, B:21:0x004b, B:26:0x0057, B:28:0x005c, B:31:0x0065, B:32:0x0068, B:34:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0033, B:14:0x003a, B:19:0x0046, B:21:0x004b, B:26:0x0057, B:28:0x005c, B:31:0x0065, B:32:0x0068, B:34:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005c A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0033, B:14:0x003a, B:19:0x0046, B:21:0x004b, B:26:0x0057, B:28:0x005c, B:31:0x0065, B:32:0x0068, B:34:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[Catch: all -> 0x007a, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0033, B:14:0x003a, B:19:0x0046, B:21:0x004b, B:26:0x0057, B:28:0x005c, B:31:0x0065, B:32:0x0068, B:34:0x0075), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075 A[Catch: all -> 0x007a, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:9:0x0009, B:11:0x0033, B:14:0x003a, B:19:0x0046, B:21:0x004b, B:26:0x0057, B:28:0x005c, B:31:0x0065, B:32:0x0068, B:34:0x0075), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void logMetric$vungle_ads_release(com.vungle.ads.internal.protos.Sdk.SDKMetric.SDKMetricType r2, long r3, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = com.vungle.ads.AnalyticsClient.metricsEnabled     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L9
            if (r9 != 0) goto L9
            monitor-exit(r1)
            return
        L9:
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r9 = com.vungle.ads.internal.protos.Sdk.SDKMetric.newBuilder()     // Catch: java.lang.Throwable -> L7a
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r2 = r9.setType(r2)     // Catch: java.lang.Throwable -> L7a
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r2 = r2.setValue(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> L7a
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r2 = r2.setMake(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = android.os.Build.MODEL     // Catch: java.lang.Throwable -> L7a
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r2 = r2.setModel(r3)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = "Android"
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r2 = r2.setOs(r3)     // Catch: java.lang.Throwable -> L7a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7a
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L7a
            com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder r2 = r2.setOsVersion(r3)     // Catch: java.lang.Throwable -> L7a
            if (r8 == 0) goto L36
            r2.setMeta(r8)     // Catch: java.lang.Throwable -> L7a
        L36:
            r3 = 0
            r4 = 1
            if (r5 == 0) goto L43
            int r8 = r5.length()     // Catch: java.lang.Throwable -> L7a
            if (r8 != 0) goto L41
            goto L43
        L41:
            r8 = 0
            goto L44
        L43:
            r8 = 1
        L44:
            if (r8 != 0) goto L49
            r2.setPlacementReferenceId(r5)     // Catch: java.lang.Throwable -> L7a
        L49:
            if (r6 == 0) goto L54
            int r5 = r6.length()     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L52
            goto L54
        L52:
            r5 = 0
            goto L55
        L54:
            r5 = 1
        L55:
            if (r5 != 0) goto L5a
            r2.setCreativeId(r6)     // Catch: java.lang.Throwable -> L7a
        L5a:
            if (r7 == 0) goto L62
            int r5 = r7.length()     // Catch: java.lang.Throwable -> L7a
            if (r5 != 0) goto L63
        L62:
            r3 = 1
        L63:
            if (r3 != 0) goto L68
            r2.setEventId(r7)     // Catch: java.lang.Throwable -> L7a
        L68:
            java.util.concurrent.BlockingQueue<com.vungle.ads.internal.protos.Sdk$SDKMetric$Builder> r3 = com.vungle.ads.AnalyticsClient.metrics     // Catch: java.lang.Throwable -> L7a
            r3.put(r2)     // Catch: java.lang.Throwable -> L7a
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L7a
            r3 = 20
            if (r2 < r3) goto L78
            r1.report()     // Catch: java.lang.Throwable -> L7a
        L78:
            monitor-exit(r1)
            return
        L7a:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.AnalyticsClient.logMetric$vungle_ads_release(com.vungle.ads.internal.protos.Sdk$SDKMetric$SDKMetricType, long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public final void pause() {
        paused = true;
    }

    public final void resume() {
        paused = false;
    }

    public final void setExecutor$vungle_ads_release(VungleThreadPoolExecutor vungleThreadPoolExecutor) {
        executor = vungleThreadPoolExecutor;
    }

    public final void setMetricsEnabled$vungle_ads_release(boolean z) {
        metricsEnabled = z;
    }

    public final void setVungleApiClient$vungle_ads_release(VungleApiClient vungleApiClient2) {
        vungleApiClient = vungleApiClient2;
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, Metric metric, String str, String str2, String str3, String str4, int i, Object obj) {
        analyticsClient.logMetric$vungle_ads_release(metric, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, SingleValueMetric singleValueMetric, String str, String str2, String str3, String str4, int i, Object obj) {
        analyticsClient.logMetric$vungle_ads_release(singleValueMetric, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
    }

    public static /* synthetic */ void logMetric$vungle_ads_release$default(AnalyticsClient analyticsClient, TimeIntervalMetric timeIntervalMetric, String str, String str2, String str3, String str4, int i, Object obj) {
        String str5 = (i & 2) != 0 ? null : str;
        String str6 = (i & 4) != 0 ? null : str2;
        String str7 = (i & 8) != 0 ? null : str3;
        if ((i & 16) != 0) {
            str4 = timeIntervalMetric.getMeta();
        }
        analyticsClient.logMetric$vungle_ads_release(timeIntervalMetric, str5, str6, str7, str4);
    }

    public final synchronized void logError$vungle_ads_release(int i, String str, String str2, String str3, String str4) {
        logError$vungle_ads_release(Sdk.SDKError.Reason.forNumber(i), str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(Metric metric, String str, String str2, String str3, String str4) {
        logMetric$vungle_ads_release$default(this, metric.getMetricType(), metric.getValue(), str, str2, str3, str4 == null ? metric.getMeta() : str4, false, 64, null);
    }

    public final synchronized void logMetric$vungle_ads_release(SingleValueMetric singleValueMetric, String str, String str2, String str3, String str4) {
        logMetric$vungle_ads_release((Metric) singleValueMetric, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(TimeIntervalMetric timeIntervalMetric, String str, String str2, String str3, String str4) {
        logMetric$vungle_ads_release((Metric) timeIntervalMetric, str, str2, str3, str4);
    }

    public final synchronized void logMetric$vungle_ads_release(OneShotTimeIntervalMetric oneShotTimeIntervalMetric, String str, String str2, String str3, String str4) {
        if (!oneShotTimeIntervalMetric.isLogged()) {
            logMetric$vungle_ads_release((TimeIntervalMetric) oneShotTimeIntervalMetric, str, str2, str3, str4);
            oneShotTimeIntervalMetric.markLogged();
        }
    }
}
