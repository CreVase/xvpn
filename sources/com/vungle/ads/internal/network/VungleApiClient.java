package com.vungle.ads.internal.network;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAds;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.ew3;
import defpackage.lr;
import defpackage.m20;
import defpackage.ng0;
import defpackage.rr;
import defpackage.v61;
import defpackage.wg2;
import defpackage.y70;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes2.dex */
public final class VungleApiClient {
    private static final String BASE_URL;
    public static final Companion Companion;
    private static final String MANUFACTURER_AMAZON = "Amazon";
    private static final String TAG = "VungleApiClient";
    private static VungleAds.WrapperFramework WRAPPER_FRAMEWORK_SELECTED;
    private static String headerUa;
    private static final Set<Interceptor> logInterceptors;
    private static final Set<Interceptor> networkInterceptors;
    private VungleApi api;
    public AppNode appBody;
    private final Context applicationContext;
    private DeviceNode baseDeviceInfo;
    private final OkHttpClient client;
    private final FilePreferences filePreferences;
    public VungleApi gzipApi;
    private final OkHttpClient gzipClient;
    private Boolean isGooglePlayServicesAvailable;
    private final PathProvider pathProvider;
    private final Platform platform;
    private long retryAfterValue;
    private String uaString = System.getProperty("http.agent");
    private String appSetId = "";
    private Interceptor responseInterceptor = new Interceptor() { // from class: un3
        @Override // okhttp3.Interceptor
        public final Response intercept(Interceptor.Chain chain) {
            Response m76responseInterceptor$lambda0;
            m76responseInterceptor$lambda0 = VungleApiClient.m76responseInterceptor$lambda0(VungleApiClient.this, chain);
            return m76responseInterceptor$lambda0;
        }
    };

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String defaultHeader() {
            String str;
            if (m20.L("Amazon", Build.MANUFACTURER)) {
                str = "VungleAmazon/";
            } else {
                str = "VungleDroid/";
            }
            return str.concat(BuildConfig.VERSION_NAME);
        }

        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }

        public final String getHeaderUa() {
            return VungleApiClient.headerUa;
        }

        public final VungleAds.WrapperFramework getWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release() {
            return VungleApiClient.WRAPPER_FRAMEWORK_SELECTED;
        }

        public final void reset$vungle_ads_release() {
            setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(null);
            setHeaderUa(defaultHeader());
        }

        public final void setHeaderUa(String str) {
            VungleApiClient.headerUa = str;
        }

        public final void setWRAPPER_FRAMEWORK_SELECTED$vungle_ads_release(VungleAds.WrapperFramework wrapperFramework) {
            VungleApiClient.WRAPPER_FRAMEWORK_SELECTED = wrapperFramework;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes2.dex */
    public @interface ConnectionTypeDetail {
        public static final String CDMA_1XRTT = "cdma_1xrtt";
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";
        public static final String CDMA_EVDO_A = "cdma_evdo_a";
        public static final String CDMA_EVDO_B = "cdma_evdo_b";
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final String EDGE = "edge";
        public static final String GPRS = "gprs";
        public static final String HRPD = "hrpd";
        public static final String HSDPA = "hsdpa";
        public static final String HSUPA = "hsupa";
        public static final String LTE = "LTE";
        public static final String UNKNOWN = "unknown";
        public static final String WCDMA = "wcdma";

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final String CDMA_1XRTT = "cdma_1xrtt";
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";
            public static final String CDMA_EVDO_A = "cdma_evdo_a";
            public static final String CDMA_EVDO_B = "cdma_evdo_b";
            public static final String EDGE = "edge";
            public static final String GPRS = "gprs";
            public static final String HRPD = "hrpd";
            public static final String HSDPA = "hsdpa";
            public static final String HSUPA = "hsupa";
            public static final String LTE = "LTE";
            public static final String UNKNOWN = "unknown";
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class GzipRequestInterceptor implements Interceptor {
        private static final String CONTENT_ENCODING = "Content-Encoding";
        public static final Companion Companion = new Companion(null);
        private static final String GZIP = "gzip";

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }
        }

        private final RequestBody gzip(final RequestBody requestBody) throws IOException {
            final lr lrVar = new lr();
            wg2 wg2Var = new wg2(new v61(lrVar));
            requestBody.writeTo(wg2Var);
            wg2Var.close();
            return new RequestBody() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // okhttp3.RequestBody
                public long contentLength() {
                    return lrVar.f3176b;
                }

                @Override // okhttp3.RequestBody
                public MediaType contentType() {
                    return RequestBody.this.contentType();
                }

                @Override // okhttp3.RequestBody
                public void writeTo(rr rrVar) throws IOException {
                    rrVar.r(lrVar.Q());
                }
            };
        }

        @Override // okhttp3.Interceptor
        public okhttp3.Response intercept(Interceptor.Chain chain) throws IOException {
            Request request = chain.request();
            RequestBody body = request.body();
            if (body != null && request.header(CONTENT_ENCODING) == null) {
                return chain.proceed(request.newBuilder().header(CONTENT_ENCODING, GZIP).method(request.method(), gzip(body)).build());
            }
            return chain.proceed(request);
        }
    }

    static {
        Companion companion = new Companion(null);
        Companion = companion;
        BASE_URL = "https://config.ads.vungle.com/api/v5/";
        headerUa = companion.defaultHeader();
        networkInterceptors = new HashSet();
        logInterceptors = new HashSet();
    }

    public VungleApiClient(Context context, Platform platform, FilePreferences filePreferences, PathProvider pathProvider) {
        this.applicationContext = context;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.pathProvider = pathProvider;
        OkHttpClient.Builder proxySelector = new OkHttpClient.Builder().addInterceptor(this.responseInterceptor).proxySelector(new ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
                try {
                    ProxySelector.getDefault().connectFailed(uri, socketAddress, iOException);
                } catch (Exception unused) {
                }
            }

            @Override // java.net.ProxySelector
            public List<Proxy> select(URI uri) {
                try {
                    return ProxySelector.getDefault().select(uri);
                } catch (Exception unused) {
                    return Collections.singletonList(Proxy.NO_PROXY);
                }
            }
        });
        this.client = proxySelector.build();
        this.gzipClient = proxySelector.addInterceptor(new GzipRequestInterceptor()).build();
    }

    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final String getConnectionType() {
        if (ew3.B0(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type != 1 && type != 6) {
                        if (type != 7) {
                            if (type != 9) {
                                return "UNKNOWN";
                            }
                            return "ETHERNET";
                        }
                        return "BLUETOOTH";
                    }
                    return "WIFI";
                }
                return "MOBILE";
            }
            return "NONE";
        }
        return null;
    }

    private final String getConnectionTypeDetail(int i) {
        if (i == 0) {
            return "unknown";
        }
        if (i == 1) {
            return "gprs";
        }
        if (i == 2) {
            return "edge";
        }
        if (i != 20) {
            switch (i) {
                case 4:
                    return "wcdma";
                case 5:
                    return "cdma_evdo_0";
                case 6:
                    return "cdma_evdo_a";
                case 7:
                    return "cdma_1xrtt";
                case 8:
                    return "hsdpa";
                case 9:
                    return "hsupa";
                default:
                    switch (i) {
                        case 12:
                            return "cdma_evdo_b";
                        case 13:
                            return "LTE";
                        case 14:
                            return "hrpd";
                        default:
                            return "unknown";
                    }
            }
        }
        return "unknown";
    }

    private final DeviceNode getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final com.vungle.ads.internal.model.CommonRequestBody.RequestExt getExtBody() {
        /*
            r5 = this;
            com.vungle.ads.internal.ConfigManager r0 = com.vungle.ads.internal.ConfigManager.INSTANCE
            java.lang.String r0 = r0.getConfigExtension()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L17
            int r3 = r0.length()
            if (r3 != 0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            if (r3 != r1) goto L17
            r3 = 1
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L22
            com.vungle.ads.internal.persistence.FilePreferences r0 = r5.filePreferences
            java.lang.String r3 = "config_extension"
            java.lang.String r0 = r0.getString(r3)
        L22:
            if (r0 == 0) goto L2d
            int r3 = r0.length()
            if (r3 != 0) goto L2b
            goto L2d
        L2b:
            r3 = 0
            goto L2e
        L2d:
            r3 = 1
        L2e:
            java.lang.String r4 = ""
            if (r3 == 0) goto L3e
            int r3 = r4.length()
            if (r3 != 0) goto L39
            goto L3a
        L39:
            r1 = 0
        L3a:
            if (r1 == 0) goto L3e
            r0 = 0
            return r0
        L3e:
            com.vungle.ads.internal.model.CommonRequestBody$RequestExt r1 = new com.vungle.ads.internal.model.CommonRequestBody$RequestExt
            r1.<init>(r0, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.VungleApiClient.getExtBody():com.vungle.ads.internal.model.CommonRequestBody$RequestExt");
    }

    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getRetryAfterValue$vungle_ads_release$annotations() {
    }

    private final CommonRequestBody.User getUserBody() {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, 7, (ng0) null);
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        user.setGdpr(new CommonRequestBody.GDPR(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentTimestamp(), privacyManager.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(privacyManager.getCcpaStatus()));
        if (privacyManager.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(privacyManager.getCoppaStatus().getValue()));
        }
        return user;
    }

    private final synchronized void init(Context context, String str) {
        String str2;
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        String str3 = com.davemorrissey.labs.subscaleview.BuildConfig.VERSION_NAME;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String packageName = context.getPackageName();
                of = PackageManager.PackageInfoFlags.of(0L);
                packageInfo = packageManager.getPackageInfo(packageName, of);
            } else {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            }
            str3 = packageInfo.versionName;
        } catch (Exception unused) {
        }
        String str4 = str3;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String str5 = Build.MANUFACTURER;
        String str6 = Build.MODEL;
        String str7 = Build.VERSION.RELEASE;
        String networkOperatorName = ((TelephonyManager) context.getSystemService("phone")).getNetworkOperatorName();
        if (m20.L("Amazon", str5)) {
            str2 = "amazon";
        } else {
            str2 = "android";
        }
        DeviceNode deviceNode = new DeviceNode(str5, str6, str7, networkOperatorName, str2, displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.DeviceExt) null, 1792, (ng0) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
        } catch (Exception e) {
            Log.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e.getLocalizedMessage());
        }
        this.baseDeviceInfo = deviceNode;
        setAppBody$vungle_ads_release(new AppNode(context.getPackageName(), str4, str));
        this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
    }

    private final void initUserAgentLazy() {
        final TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new y70() { // from class: com.vungle.ads.internal.network.VungleApiClient$initUserAgentLazy$1
            @Override // defpackage.y70
            public void accept(String str) {
                if (str == null) {
                    Log.e("VungleApiClient", "Cannot Get UserAgent. Setting Default Device UserAgent");
                    AnalyticsClient.INSTANCE.logError$vungle_ads_release(7, "Fail to get user agent.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                } else {
                    TimeIntervalMetric.this.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, TimeIntervalMetric.this.getMetricType(), TimeIntervalMetric.this.calculateIntervalDuration(), null, null, null, null, true, 60, null);
                    this.uaString = str;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final okhttp3.Response m76responseInterceptor$lambda0(VungleApiClient vungleApiClient, Interceptor.Chain chain) {
        boolean z;
        okhttp3.Response proceed = chain.proceed(chain.request());
        String str = proceed.headers().get("Retry-After");
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            try {
                long parseLong = Long.parseLong(str);
                if (parseLong > 0) {
                    vungleApiClient.retryAfterValue = (parseLong * 1000) + System.currentTimeMillis();
                    AnalyticsClient.INSTANCE.logError$vungle_ads_release(220, "Server is busy.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                }
            } catch (NumberFormatException unused) {
            }
        }
        return proceed;
    }

    public final void addPlaySvcAvailabilityInCookie(boolean z) {
        this.filePreferences.put(Cookie.IS_PLAY_SERVICE_AVAILABLE, z).apply();
    }

    public final boolean checkIsRetryAfterActive() {
        if (this.retryAfterValue > 0) {
            if (TimeUnit.MILLISECONDS.toSeconds(this.retryAfterValue - System.currentTimeMillis()) > 0) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(221, "Server is busy.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                return true;
            }
            this.retryAfterValue = 0L;
            return false;
        }
        return false;
    }

    public final Call<ConfigPayload> config() throws IOException {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), getAppBody$vungle_ads_release(), getUserBody(), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (ng0) null);
        CommonRequestBody.RequestExt extBody = getExtBody();
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        FileUtility fileUtility = FileUtility.INSTANCE;
        String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/api/v5/";
        }
        if (!str.endsWith("/")) {
            str = str.concat("/");
        }
        VungleApi vungleApi = this.api;
        if (vungleApi == null) {
            vungleApi = null;
        }
        return vungleApi.config(headerUa, str + "config", commonRequestBody);
    }

    public final AppNode getAppBody$vungle_ads_release() {
        AppNode appNode = this.appBody;
        if (appNode != null) {
            return appNode;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01d7, code lost:            if (r17.applicationContext.getPackageManager().hasSystemFeature("android.hardware.touchscreen") != false) goto L90;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bc A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d2 A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0132 A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013b A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0182 A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199 A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204 A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020a A[Catch: all -> 0x0219, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000b, B:9:0x002c, B:11:0x0034, B:12:0x003e, B:15:0x0048, B:17:0x0052, B:18:0x0059, B:19:0x0056, B:20:0x005d, B:23:0x0069, B:25:0x006e, B:27:0x0071, B:30:0x0085, B:32:0x008f, B:33:0x0098, B:35:0x00b0, B:40:0x00bc, B:41:0x00c1, B:43:0x00d2, B:46:0x00e3, B:47:0x00e9, B:53:0x0116, B:55:0x0132, B:56:0x0135, B:58:0x013b, B:59:0x013e, B:62:0x0173, B:64:0x0182, B:65:0x018f, B:67:0x0199, B:68:0x01da, B:71:0x01ef, B:73:0x0204, B:74:0x020f, B:79:0x020a, B:82:0x01aa, B:87:0x01bd, B:89:0x01cb, B:92:0x00f9, B:103:0x0094, B:104:0x0079), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.vungle.ads.internal.model.DeviceNode getDeviceBody$vungle_ads_release(boolean r18) throws java.lang.IllegalStateException {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.network.VungleApiClient.getDeviceBody$vungle_ads_release(boolean):com.vungle.ads.internal.model.DeviceNode");
    }

    public final VungleApi getGzipApi$vungle_ads_release() {
        VungleApi vungleApi = this.gzipApi;
        if (vungleApi != null) {
            return vungleApi;
        }
        return null;
    }

    public final Boolean getPlayServicesAvailabilityFromAPI() {
        boolean z;
        Boolean bool = null;
        try {
            try {
                if (GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(this.applicationContext) == 0) {
                    z = true;
                } else {
                    z = false;
                }
                bool = Boolean.valueOf(z);
                addPlaySvcAvailabilityInCookie(bool.booleanValue());
                return bool;
            } catch (NoClassDefFoundError unused) {
                bool = Boolean.FALSE;
                addPlaySvcAvailabilityInCookie(false);
                return bool;
            }
        } catch (Exception unused2) {
            return bool;
        }
    }

    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    public final Interceptor getResponseInterceptor$vungle_ads_release() {
        return this.responseInterceptor;
    }

    public final long getRetryAfterHeaderValue(Response<ConfigPayload> response) {
        String str = response.headers().get("Retry-After");
        if (str == null) {
            return 0L;
        }
        try {
            return Long.parseLong(str) * 1000;
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public final long getRetryAfterValue$vungle_ads_release() {
        return this.retryAfterValue;
    }

    public final void initialize(String str) {
        this.api = new APIFactory(this.client).createAPI(str);
        setGzipApi$vungle_ads_release(new APIFactory(this.gzipClient).createAPI(str));
        init(this.applicationContext, str);
    }

    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    public final BaseAdLoader.ErrorInfo pingTPAT(String str) {
        boolean z;
        NetworkSecurityPolicy networkSecurityPolicy;
        NetworkSecurityPolicy networkSecurityPolicy2;
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && HttpUrl.Companion.parse(str) != null) {
            try {
                String host = new URL(str).getHost();
                int i = Build.VERSION.SDK_INT;
                if (i >= 24) {
                    networkSecurityPolicy2 = NetworkSecurityPolicy.getInstance();
                    z2 = networkSecurityPolicy2.isCleartextTrafficPermitted(host);
                } else if (i >= 23) {
                    networkSecurityPolicy = NetworkSecurityPolicy.getInstance();
                    z2 = networkSecurityPolicy.isCleartextTrafficPermitted();
                }
                if (!z2 && URLUtil.isHttpUrl(str)) {
                    return new BaseAdLoader.ErrorInfo(121, "Clear Text Traffic is blocked");
                }
                try {
                    String str2 = this.uaString;
                    if (str2 == null) {
                        str2 = "";
                    }
                    VungleApi vungleApi = this.api;
                    if (vungleApi == null) {
                        vungleApi = null;
                    }
                    Response<Void> execute = vungleApi.pingTPAT(str2, str).execute();
                    if (execute != null && execute.isSuccessful()) {
                        return null;
                    }
                    return new BaseAdLoader.ErrorInfo(121, "Tpat ping was not successful");
                } catch (Exception e) {
                    String localizedMessage = e.getLocalizedMessage();
                    if (localizedMessage == null) {
                        localizedMessage = "IOException";
                    }
                    return new BaseAdLoader.ErrorInfo(121, localizedMessage);
                }
            } catch (MalformedURLException e2) {
                String localizedMessage2 = e2.getLocalizedMessage();
                if (localizedMessage2 == null) {
                    localizedMessage2 = "MalformedURLException";
                }
                return new BaseAdLoader.ErrorInfo(121, localizedMessage2);
            }
        }
        return new BaseAdLoader.ErrorInfo(121, "Invalid URL : ".concat(str));
    }

    public final void reportErrors(BlockingQueue<Sdk.SDKError.Builder> blockingQueue, final AnalyticsClient.RequestListener requestListener) {
        boolean z;
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint != null && errorLoggingEndpoint.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            requestListener.onFailure();
            return;
        }
        for (Sdk.SDKError.Builder builder : blockingQueue) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Sdk.SDKError.Builder> it = blockingQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        Sdk.SDKErrorBatch sDKErrorBatch = (Sdk.SDKErrorBatch) Sdk.SDKErrorBatch.newBuilder().addAllErrors(arrayList).build();
        RequestBody create = RequestBody.Companion.create(sDKErrorBatch.toByteArray(), MediaType.Companion.parse("application/x-protobuf"), 0, sDKErrorBatch.toByteArray().length);
        VungleApi vungleApi = this.api;
        if (vungleApi == null) {
            vungleApi = null;
        }
        vungleApi.sendErrors(headerUa, errorLoggingEndpoint, create).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient$reportErrors$3
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                AnalyticsClient.RequestListener.this.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                AnalyticsClient.RequestListener.this.onSuccess();
            }
        });
    }

    public final void reportMetrics(BlockingQueue<Sdk.SDKMetric.Builder> blockingQueue, final AnalyticsClient.RequestListener requestListener) {
        boolean z;
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint != null && metricsEndpoint.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            requestListener.onFailure();
            return;
        }
        for (Sdk.SDKMetric.Builder builder : blockingQueue) {
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail = getConnectionTypeDetail();
            if (connectionTypeDetail != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail);
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Sdk.SDKMetric.Builder> it = blockingQueue.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().build());
        }
        RequestBody create$default = RequestBody.Companion.create$default(RequestBody.Companion, MediaType.Companion.parse("application/x-protobuf"), ((Sdk.MetricBatch) Sdk.MetricBatch.newBuilder().addAllMetrics(arrayList).build()).toByteArray(), 0, 0, 12, (Object) null);
        VungleApi vungleApi = this.api;
        if (vungleApi == null) {
            vungleApi = null;
        }
        vungleApi.sendMetrics(headerUa, metricsEndpoint, create$default).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient$reportMetrics$3
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(Call<Void> call, Throwable th) {
                AnalyticsClient.RequestListener.this.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(Call<Void> call, Response<Void> response) {
                AnalyticsClient.RequestListener.this.onSuccess();
            }
        });
    }

    public final Call<AdPayload> requestAd(String str, String str2, boolean z) throws IllegalStateException {
        boolean z2;
        String adsEndpoint = ConfigManager.INSTANCE.getAdsEndpoint();
        boolean z3 = false;
        if (adsEndpoint != null && adsEndpoint.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), getAppBody$vungle_ads_release(), getUserBody(), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (ng0) null);
        CommonRequestBody.RequestExt extBody = getExtBody();
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(Collections.singletonList(str), Boolean.valueOf(z), (String) null, (Long) null, (String) null, (String) null, (String) null, 124, (ng0) null);
        if (str2 == null || str2.length() == 0) {
            z3 = true;
        }
        if (!z3) {
            requestParam.setAdSize(str2);
        }
        commonRequestBody.setRequest(requestParam);
        return getGzipApi$vungle_ads_release().ads(headerUa, adsEndpoint, commonRequestBody);
    }

    public final Call<Void> ri(CommonRequestBody.RequestParam requestParam) {
        boolean z;
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        if (riEndpoint != null && riEndpoint.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        VungleApi vungleApi = null;
        if (z) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), getAppBody$vungle_ads_release(), getUserBody(), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (ng0) null);
        commonRequestBody.setRequest(requestParam);
        CommonRequestBody.RequestExt extBody = getExtBody();
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        VungleApi vungleApi2 = this.api;
        if (vungleApi2 != null) {
            vungleApi = vungleApi2;
        }
        return vungleApi.ri(headerUa, riEndpoint, commonRequestBody);
    }

    public final void setAppBody$vungle_ads_release(AppNode appNode) {
        this.appBody = appNode;
    }

    public final void setGzipApi$vungle_ads_release(VungleApi vungleApi) {
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(Interceptor interceptor) {
        this.responseInterceptor = interceptor;
    }

    public final void setRetryAfterValue$vungle_ads_release(long j) {
        this.retryAfterValue = j;
    }

    private final String getConnectionTypeDetail() {
        if (ew3.B0(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.applicationContext.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }
}
