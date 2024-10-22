package com.vungle.ads.internal.load;

import android.content.Context;
import android.webkit.URLUtil;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.NativeAdInternal;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.HackMraid;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import com.vungle.ads.internal.util.UnzipUtility;
import defpackage.d20;
import defpackage.hx2;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import defpackage.to1;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public abstract class BaseAdLoader {
    public static final Companion Companion = new Companion(null);
    private static final String DOWNLOADED_FILE_NOT_FOUND = "Downloaded file not found!";
    private static final String TAG = "BaseAdLoader";
    public AdLoaderCallback adLoaderCallback;
    public AdRequest adRequest;
    public String adSize;
    private AdPayload advertisement;
    private final Context context;
    private AtomicLong downloadCount;
    private final Downloader downloader;
    private boolean notifySuccess;
    private final OMInjector omInjector;
    private final PathProvider pathProvider;
    private final Executors sdkExecutors;
    private final VungleApiClient vungleApiClient;
    private final boolean adLoadOptimizationEnabled = ConfigManager.INSTANCE.adLoadOptimizationEnabled();
    private final List<AdAsset> adAssets = new ArrayList();
    private final List<AssetDownloadListener.DownloadError> errors = Collections.synchronizedList(new ArrayList());
    private SingleValueMetric mainVideoSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.ASSET_FILE_SIZE);
    private SingleValueMetric templateSizeMetric = new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_ZIP_SIZE);
    private TimeIntervalMetric assetDownloadDurationMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.ASSET_DOWNLOAD_DURATION_MS);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class ErrorInfo {
        private final String description;
        private final int reason;

        public ErrorInfo(int i, String str) {
            this.reason = i;
            this.description = str;
        }

        public final String getDescription() {
            return this.description;
        }

        public final int getReason() {
            return this.reason;
        }
    }

    public BaseAdLoader(Context context, VungleApiClient vungleApiClient, Executors executors, OMInjector oMInjector, Downloader downloader, PathProvider pathProvider) {
        this.context = context;
        this.vungleApiClient = vungleApiClient;
        this.sdkExecutors = executors;
        this.omInjector = oMInjector;
        this.downloader = downloader;
        this.pathProvider = pathProvider;
    }

    public static /* synthetic */ void a(BaseAdLoader baseAdLoader, AdLoaderCallback adLoaderCallback) {
        m69loadAd$lambda0(baseAdLoader, adLoaderCallback);
    }

    private final void downloadAssets() {
        this.assetDownloadDurationMetric.markStart();
        this.downloadCount = new AtomicLong(this.adAssets.size());
        for (AdAsset adAsset : this.adAssets) {
            DownloadRequest downloadRequest = new DownloadRequest(getAssetPriority(adAsset), adAsset.getServerPath(), adAsset.getLocalPath(), adAsset.getIdentifier(), isTemplateUrl(adAsset), isMainVideo(adAsset));
            if (downloadRequest.isTemplate()) {
                downloadRequest.startRecord();
            }
            this.downloader.download(downloadRequest, getAssetDownloadListener());
        }
    }

    private final boolean fileIsValid(File file, AdAsset adAsset) {
        if (file.exists() && file.length() == adAsset.getFileSize()) {
            return true;
        }
        return false;
    }

    private final AdAsset getAsset(AdPayload adPayload, File file, String str, String str2) {
        AdAsset.FileType fileType;
        boolean z;
        String m = p71.m(file.getPath(), File.separator, str);
        if (m.endsWith(AdPayload.KEY_TEMPLATE)) {
            fileType = AdAsset.FileType.ZIP;
        } else {
            fileType = AdAsset.FileType.ASSET;
        }
        String eventId = adPayload.eventId();
        if (eventId != null && eventId.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        AdAsset adAsset = new AdAsset(eventId, str2, m);
        adAsset.setStatus(AdAsset.Status.NEW);
        adAsset.setFileType(fileType);
        return adAsset;
    }

    private final AssetDownloadListener getAssetDownloadListener() {
        return new BaseAdLoader$assetDownloadListener$1(this);
    }

    private final DownloadRequest.Priority getAssetPriority(AdAsset adAsset) {
        boolean z;
        if (this.adLoadOptimizationEnabled) {
            String localPath = adAsset.getLocalPath();
            if (localPath != null && localPath.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z && adAsset.getLocalPath().endsWith(AdPayload.KEY_TEMPLATE)) {
                return DownloadRequest.Priority.CRITICAL;
            }
            return DownloadRequest.Priority.HIGHEST;
        }
        return DownloadRequest.Priority.CRITICAL;
    }

    private final File getDestinationDir(AdPayload adPayload) {
        return this.pathProvider.getDownloadsDirForAd(adPayload.eventId());
    }

    public final boolean injectOMIfNeeded(AdPayload adPayload) {
        if (adPayload == null) {
            return false;
        }
        if (adPayload.omEnabled()) {
            int i = 2;
            int i2 = VungleError.ASSET_DOWNLOAD_ERROR;
            String str = null;
            byte b2 = 0;
            try {
                File destinationDir = getDestinationDir(adPayload);
                if (destinationDir != null && destinationDir.isDirectory()) {
                    this.omInjector.injectJsFiles(destinationDir);
                    return true;
                }
                onAdLoadFailed(new InternalError(i2, str, i, b2 == true ? 1 : 0));
                return false;
            } catch (IOException unused) {
                onAdLoadFailed(new InternalError(i2, 0 == true ? 1 : 0, i, 0 == true ? 1 : 0));
                return false;
            }
        }
        return true;
    }

    private final boolean isAdLoadOptimizationEnabled(AdPayload adPayload) {
        if (this.adLoadOptimizationEnabled && adPayload != null && m20.L(adPayload.getAdType(), AdPayload.TYPE_VUNGLE_MRAID)) {
            return true;
        }
        return false;
    }

    private final boolean isMainVideo(AdAsset adAsset) {
        String str;
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            str = adPayload.getMainVideoUrl();
        } else {
            str = null;
        }
        return m20.L(str, adAsset.getServerPath());
    }

    private final boolean isTemplateUrl(AdAsset adAsset) {
        if (adAsset.getFileType() == AdAsset.FileType.ZIP) {
            return true;
        }
        return false;
    }

    private final boolean isUrlValid(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        if (!URLUtil.isHttpsUrl(str) && !URLUtil.isHttpUrl(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: loadAd$lambda-0 */
    public static final void m69loadAd$lambda0(BaseAdLoader baseAdLoader, AdLoaderCallback adLoaderCallback) {
        MraidJsLoader.INSTANCE.downloadJs(baseAdLoader.pathProvider, baseAdLoader.downloader, new BaseAdLoader$loadAd$1$1(baseAdLoader, adLoaderCallback));
    }

    private final void onAdReady() {
        String localPath;
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            File destinationDir = getDestinationDir(adPayload);
            if (destinationDir != null) {
                ArrayList arrayList = new ArrayList();
                for (AdAsset adAsset : this.adAssets) {
                    if (adAsset.getStatus() == AdAsset.Status.DOWNLOAD_SUCCESS && (localPath = adAsset.getLocalPath()) != null) {
                        arrayList.add(localPath);
                    }
                }
                adPayload.setMraidAssetDir(destinationDir, arrayList);
            }
            if (!this.notifySuccess) {
                onAdLoadReady();
                getAdLoaderCallback().onSuccess(adPayload);
                this.notifySuccess = true;
            }
        }
    }

    public final boolean processTemplate(AdAsset adAsset, AdPayload adPayload) {
        boolean z;
        if (adPayload == null || adAsset.getStatus() != AdAsset.Status.DOWNLOAD_SUCCESS) {
            return false;
        }
        String localPath = adAsset.getLocalPath();
        if (localPath != null && localPath.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return false;
        }
        File file = new File(adAsset.getLocalPath());
        if (!fileIsValid(file, adAsset)) {
            return false;
        }
        if (adAsset.getFileType() == AdAsset.FileType.ZIP && !unzipFile(adPayload, file)) {
            return false;
        }
        if (isAdLoadOptimizationEnabled(adPayload)) {
            onAdReady();
        }
        return true;
    }

    private final boolean unzipFile(AdPayload adPayload, File file) {
        final ArrayList arrayList = new ArrayList();
        for (AdAsset adAsset : this.adAssets) {
            if (adAsset.getFileType() == AdAsset.FileType.ASSET && adAsset.getLocalPath() != null) {
                arrayList.add(adAsset.getLocalPath());
            }
        }
        File destinationDir = getDestinationDir(adPayload);
        if (destinationDir != null && destinationDir.isDirectory()) {
            try {
                UnzipUtility.INSTANCE.unzip(file.getPath(), destinationDir.getPath(), new UnzipUtility.Filter() { // from class: com.vungle.ads.internal.load.BaseAdLoader$unzipFile$1
                    @Override // com.vungle.ads.internal.util.UnzipUtility.Filter
                    public boolean matches(String str) {
                        boolean z;
                        if (str != null && str.length() != 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            return true;
                        }
                        File file2 = new File(str);
                        Iterator<String> it = arrayList.iterator();
                        while (it.hasNext()) {
                            File file3 = new File(it.next());
                            if (m20.L(file3, file2)) {
                                return false;
                            }
                            if (i23.q1(file2.getPath(), file3.getPath() + File.separator, false)) {
                                return false;
                            }
                        }
                        return true;
                    }
                });
                String path = destinationDir.getPath();
                String str = File.separator;
                if (!new File(path + str + "index.html").exists()) {
                    AnalyticsClient.INSTANCE.logError$vungle_ads_release(115, "Failed to retrieve indexFileUrl from the Ad.", getAdRequest().getPlacement().getReferenceId(), adPayload.getCreativeId(), adPayload.eventId());
                    return false;
                }
                if (m20.L(file.getName(), AdPayload.KEY_TEMPLATE)) {
                    File file2 = new File(p71.m(destinationDir.getPath(), str, "mraid.js"));
                    if (!file2.exists() && !file2.createNewFile()) {
                        throw new IOException("mraid.js can not be created");
                    }
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter(file2, true)));
                    HackMraid.INSTANCE.apply(this.pathProvider, printWriter);
                    printWriter.close();
                }
                FileUtility.printDirectoryTree(destinationDir);
                FileUtility.delete(file);
                return true;
            } catch (Exception e) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(109, hx2.p("Unzip failed: ", e.getMessage()), getAdRequest().getPlacement().getReferenceId(), adPayload.getCreativeId(), adPayload.eventId());
                return false;
            }
        }
        throw new IOException("Unable to access Destination Directory");
    }

    private final ErrorInfo validateAdMetadata(AdPayload adPayload) throws IllegalArgumentException {
        Integer num;
        String str;
        String str2;
        AdPayload.TemplateSettings templateSettings;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        String str4;
        String str5;
        AdPayload.AdUnit adUnit = adPayload.adUnit();
        if (adUnit != null) {
            num = adUnit.getSleep();
        } else {
            num = null;
        }
        if (num == null) {
            String referenceId = getAdRequest().getPlacement().getReferenceId();
            AdPayload adPayload2 = this.advertisement;
            if (adPayload2 != null) {
                str = adPayload2.placementId();
            } else {
                str = null;
            }
            if (!m20.L(referenceId, str)) {
                return new ErrorInfo(215, "The ad response is missing placement reference id.");
            }
            List<String> supportedTemplateTypes = getAdRequest().getPlacement().getSupportedTemplateTypes();
            AdPayload adPayload3 = this.advertisement;
            if (adPayload3 != null) {
                str2 = adPayload3.templateType();
            } else {
                str2 = null;
            }
            if (!d20.F0(supportedTemplateTypes, str2)) {
                return new ErrorInfo(216, "The ad response has an unexpected template type.");
            }
            AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            if (adUnit2 != null) {
                templateSettings = adUnit2.getTemplateSettings();
            } else {
                templateSettings = null;
            }
            if (templateSettings == null) {
                return new ErrorInfo(113, "Missing assets URLs");
            }
            Map<String, AdPayload.CacheableReplacement> cacheableReplacements = templateSettings.getCacheableReplacements();
            if (adPayload.isNativeTemplateType()) {
                if (cacheableReplacements != null) {
                    AdPayload.CacheableReplacement cacheableReplacement = cacheableReplacements.get(NativeAdInternal.TOKEN_MAIN_IMAGE);
                    if (cacheableReplacement != null) {
                        str4 = cacheableReplacement.getUrl();
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        return new ErrorInfo(600, "Unable to load main image.");
                    }
                    AdPayload.CacheableReplacement cacheableReplacement2 = cacheableReplacements.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_ICON_URL);
                    if (cacheableReplacement2 != null) {
                        str5 = cacheableReplacement2.getUrl();
                    } else {
                        str5 = null;
                    }
                    if (str5 == null) {
                        return new ErrorInfo(600, "Unable to load privacy image.");
                    }
                }
            } else {
                AdPayload.AdUnit adUnit3 = adPayload.adUnit();
                if (adUnit3 != null) {
                    str3 = adUnit3.getTemplateURL();
                } else {
                    str3 = null;
                }
                if (str3 != null && str3.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    return new ErrorInfo(105, "Failed to prepare URL for template download.");
                }
                if (!isUrlValid(str3)) {
                    return new ErrorInfo(112, "Failed to load template asset.");
                }
            }
            if (adPayload.hasExpired()) {
                return new ErrorInfo(304, "The ad markup has expired for playback.");
            }
            String eventId = adPayload.eventId();
            if (eventId != null && eventId.length() != 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                return new ErrorInfo(200, "Event id is invalid.");
            }
            if (cacheableReplacements != null) {
                Iterator<Map.Entry<String, AdPayload.CacheableReplacement>> it = cacheableReplacements.entrySet().iterator();
                while (it.hasNext()) {
                    String url = it.next().getValue().getUrl();
                    if (url != null && url.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        return new ErrorInfo(111, hx2.p("Invalid asset URL ", url));
                    }
                    if (!isUrlValid(url)) {
                        return new ErrorInfo(112, hx2.p("Invalid asset URL ", url));
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("no serve");
    }

    public final void cancel() {
        this.downloader.cancelAll();
    }

    public final List<AdAsset> getAdAssets() {
        return this.adAssets;
    }

    public final AdLoaderCallback getAdLoaderCallback() {
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            return adLoaderCallback;
        }
        return null;
    }

    public final AdRequest getAdRequest() {
        AdRequest adRequest = this.adRequest;
        if (adRequest != null) {
            return adRequest;
        }
        return null;
    }

    public final String getAdSize() {
        String str = this.adSize;
        if (str != null) {
            return str;
        }
        return null;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final Context getContext() {
        return this.context;
    }

    public final List<AssetDownloadListener.DownloadError> getErrors() {
        return this.errors;
    }

    public final Executors getSdkExecutors() {
        return this.sdkExecutors;
    }

    public final VungleApiClient getVungleApiClient() {
        return this.vungleApiClient;
    }

    public final void handleAdMetaData(AdPayload adPayload) throws IllegalArgumentException {
        this.advertisement = adPayload;
        ErrorInfo validateAdMetadata = validateAdMetadata(adPayload);
        if (validateAdMetadata != null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(validateAdMetadata.getReason(), validateAdMetadata.getDescription(), getAdRequest().getPlacement().getReferenceId(), adPayload.getCreativeId(), adPayload.eventId());
            onAdLoadFailed(new InternalError(validateAdMetadata.getReason(), validateAdMetadata.getDescription()));
            return;
        }
        Set<Map.Entry<String, String>> entrySet = adPayload.getDownloadableUrls().entrySet();
        File destinationDir = getDestinationDir(adPayload);
        if (destinationDir != null && destinationDir.isDirectory() && !entrySet.isEmpty()) {
            for (Map.Entry<String, String> entry : entrySet) {
                AdAsset asset = getAsset(adPayload, destinationDir, entry.getKey(), entry.getValue());
                if (asset != null) {
                    this.adAssets.add(asset);
                }
            }
            downloadAssets();
            return;
        }
        onAdLoadFailed(new InternalError(VungleError.ASSET_DOWNLOAD_ERROR, null, 2, 0 == true ? 1 : 0));
    }

    public boolean isZip(File file) {
        return m20.L(file.getName(), AdPayload.KEY_TEMPLATE);
    }

    public final void loadAd(AdRequest adRequest, String str, AdLoaderCallback adLoaderCallback) {
        setAdRequest(adRequest);
        setAdSize(str);
        setAdLoaderCallback(adLoaderCallback);
        this.sdkExecutors.getBackgroundExecutor().execute(new to1(17, this, adLoaderCallback));
    }

    public final void onAdLoadFailed(VungleError vungleError) {
        getAdLoaderCallback().onFailure(vungleError);
    }

    public abstract void onAdLoadReady();

    public void onDownloadCompleted(AdRequest adRequest, String str) {
        String str2;
        String str3;
        adRequest.toString();
        AdPayload adPayload = this.advertisement;
        if (adPayload != null) {
            adPayload.setAssetFullyDownloaded();
        }
        onAdReady();
        this.assetDownloadDurationMetric.markEnd();
        AdPayload adPayload2 = this.advertisement;
        String str4 = null;
        if (adPayload2 != null) {
            str2 = adPayload2.placementId();
        } else {
            str2 = null;
        }
        AdPayload adPayload3 = this.advertisement;
        if (adPayload3 != null) {
            str3 = adPayload3.getCreativeId();
        } else {
            str3 = null;
        }
        AdPayload adPayload4 = this.advertisement;
        if (adPayload4 != null) {
            str4 = adPayload4.eventId();
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, this.assetDownloadDurationMetric, str2, str3, str4, (String) null, 16, (Object) null);
    }

    public abstract void requestAd();

    public final void setAdLoaderCallback(AdLoaderCallback adLoaderCallback) {
        this.adLoaderCallback = adLoaderCallback;
    }

    public final void setAdRequest(AdRequest adRequest) {
        this.adRequest = adRequest;
    }

    public final void setAdSize(String str) {
        this.adSize = str;
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }
}
