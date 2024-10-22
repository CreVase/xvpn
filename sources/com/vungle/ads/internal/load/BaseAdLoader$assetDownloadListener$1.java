package com.vungle.ads.internal.load;

import android.text.TextUtils;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.model.AdAsset;
import com.vungle.ads.internal.model.AdPayload;
import defpackage.cq0;
import defpackage.vu3;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class BaseAdLoader$assetDownloadListener$1 implements AssetDownloadListener {
    final /* synthetic */ BaseAdLoader this$0;

    public BaseAdLoader$assetDownloadListener$1(BaseAdLoader baseAdLoader) {
        this.this$0 = baseAdLoader;
    }

    public static /* synthetic */ void a(DownloadRequest downloadRequest, BaseAdLoader baseAdLoader, AssetDownloadListener.DownloadError downloadError) {
        m70onError$lambda0(downloadRequest, baseAdLoader, downloadError);
    }

    public static /* synthetic */ void b(File file, BaseAdLoader$assetDownloadListener$1 baseAdLoader$assetDownloadListener$1, DownloadRequest downloadRequest, BaseAdLoader baseAdLoader) {
        m71onSuccess$lambda2(file, baseAdLoader$assetDownloadListener$1, downloadRequest, baseAdLoader);
    }

    /* renamed from: onError$lambda-0 */
    public static final void m70onError$lambda0(DownloadRequest downloadRequest, BaseAdLoader baseAdLoader, AssetDownloadListener.DownloadError downloadError) {
        AtomicLong atomicLong;
        if (downloadRequest != null) {
            String cookieString = downloadRequest.getCookieString();
            AdAsset adAsset = null;
            for (AdAsset adAsset2 : baseAdLoader.getAdAssets()) {
                if (TextUtils.equals(adAsset2.getIdentifier(), cookieString)) {
                    adAsset = adAsset2;
                }
            }
            if (adAsset != null) {
                baseAdLoader.getErrors().add(downloadError);
            } else {
                baseAdLoader.getErrors().add(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR()));
            }
        } else {
            baseAdLoader.getErrors().add(new AssetDownloadListener.DownloadError(-1, new RuntimeException("error in request"), AssetDownloadListener.DownloadError.ErrorReason.Companion.getINTERNAL_ERROR()));
        }
        atomicLong = baseAdLoader.downloadCount;
        if (atomicLong == null) {
            atomicLong = null;
        }
        if (atomicLong.decrementAndGet() <= 0) {
            baseAdLoader.onAdLoadFailed(new InternalError(VungleError.ASSET_DOWNLOAD_ERROR, null, 2, null));
        }
    }

    /* renamed from: onSuccess$lambda-2 */
    public static final void m71onSuccess$lambda2(File file, BaseAdLoader$assetDownloadListener$1 baseAdLoader$assetDownloadListener$1, DownloadRequest downloadRequest, BaseAdLoader baseAdLoader) {
        SingleValueMetric singleValueMetric;
        SingleValueMetric singleValueMetric2;
        String str;
        String str2;
        AdAsset adAsset;
        AdAsset.FileType fileType;
        AtomicLong atomicLong;
        boolean processTemplate;
        String str3;
        String str4;
        SingleValueMetric singleValueMetric3;
        SingleValueMetric singleValueMetric4;
        String str5;
        String str6;
        if (!file.exists()) {
            baseAdLoader$assetDownloadListener$1.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.Companion.getFILE_NOT_FOUND_ERROR()), downloadRequest);
            return;
        }
        String str7 = null;
        if (downloadRequest.isTemplate()) {
            AdPayload advertisement = baseAdLoader.getAdvertisement();
            if (advertisement != null) {
                str3 = advertisement.getCreativeId();
            } else {
                str3 = null;
            }
            String referenceId = baseAdLoader.getAdRequest().getPlacement().getReferenceId();
            AdPayload advertisement2 = baseAdLoader.getAdvertisement();
            if (advertisement2 != null) {
                str4 = advertisement2.eventId();
            } else {
                str4 = null;
            }
            downloadRequest.stopRecord(str3, referenceId, str4);
            singleValueMetric3 = baseAdLoader.templateSizeMetric;
            singleValueMetric3.setValue(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            singleValueMetric4 = baseAdLoader.templateSizeMetric;
            String referenceId2 = baseAdLoader.getAdRequest().getPlacement().getReferenceId();
            AdPayload advertisement3 = baseAdLoader.getAdvertisement();
            if (advertisement3 != null) {
                str5 = advertisement3.getCreativeId();
            } else {
                str5 = null;
            }
            AdPayload advertisement4 = baseAdLoader.getAdvertisement();
            if (advertisement4 != null) {
                str6 = advertisement4.eventId();
            } else {
                str6 = null;
            }
            analyticsClient.logMetric$vungle_ads_release(singleValueMetric4, referenceId2, str5, str6, downloadRequest.getUrl());
        } else if (downloadRequest.isMainVideo()) {
            singleValueMetric = baseAdLoader.mainVideoSizeMetric;
            singleValueMetric.setValue(Long.valueOf(file.length()));
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            singleValueMetric2 = baseAdLoader.mainVideoSizeMetric;
            String referenceId3 = baseAdLoader.getAdRequest().getPlacement().getReferenceId();
            AdPayload advertisement5 = baseAdLoader.getAdvertisement();
            if (advertisement5 != null) {
                str = advertisement5.getCreativeId();
            } else {
                str = null;
            }
            AdPayload advertisement6 = baseAdLoader.getAdvertisement();
            if (advertisement6 != null) {
                str2 = advertisement6.eventId();
            } else {
                str2 = null;
            }
            analyticsClient2.logMetric$vungle_ads_release(singleValueMetric2, referenceId3, str, str2, downloadRequest.getUrl());
        }
        String cookieString = downloadRequest.getCookieString();
        Iterator<AdAsset> it = baseAdLoader.getAdAssets().iterator();
        while (true) {
            if (it.hasNext()) {
                adAsset = it.next();
                if (TextUtils.equals(adAsset.getIdentifier(), cookieString)) {
                    break;
                }
            } else {
                adAsset = null;
                break;
            }
        }
        if (adAsset == null) {
            baseAdLoader$assetDownloadListener$1.onError(new AssetDownloadListener.DownloadError(-1, new IOException("Downloaded file not found!"), AssetDownloadListener.DownloadError.ErrorReason.Companion.getREQUEST_ERROR()), downloadRequest);
            return;
        }
        if (baseAdLoader.isZip(file)) {
            fileType = AdAsset.FileType.ZIP;
        } else {
            fileType = AdAsset.FileType.ASSET;
        }
        adAsset.setFileType(fileType);
        adAsset.setFileSize(file.length());
        adAsset.setStatus(AdAsset.Status.DOWNLOAD_SUCCESS);
        if (baseAdLoader.isZip(file)) {
            baseAdLoader.injectOMIfNeeded(baseAdLoader.getAdvertisement());
            processTemplate = baseAdLoader.processTemplate(adAsset, baseAdLoader.getAdvertisement());
            if (!processTemplate) {
                baseAdLoader.getErrors().add(new AssetDownloadListener.DownloadError(-1, new InternalError(VungleError.ASSET_DOWNLOAD_ERROR, null, 2, null), AssetDownloadListener.DownloadError.ErrorReason.Companion.getINTERNAL_ERROR()));
            }
        }
        atomicLong = baseAdLoader.downloadCount;
        if (atomicLong == null) {
            atomicLong = null;
        }
        if (atomicLong.decrementAndGet() <= 0) {
            if (baseAdLoader.getErrors().isEmpty()) {
                AdRequest adRequest = baseAdLoader.getAdRequest();
                AdPayload advertisement7 = baseAdLoader.getAdvertisement();
                if (advertisement7 != null) {
                    str7 = advertisement7.eventId();
                }
                baseAdLoader.onDownloadCompleted(adRequest, str7);
                return;
            }
            baseAdLoader.onAdLoadFailed(new InternalError(VungleError.ASSET_DOWNLOAD_ERROR, null, 2, null));
        }
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onError(AssetDownloadListener.DownloadError downloadError, DownloadRequest downloadRequest) {
        if (downloadError != null) {
            downloadError.getReason();
        }
        this.this$0.getSdkExecutors().getBackgroundExecutor().execute(new cq0(21, downloadRequest, this.this$0, downloadError));
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
        progress.getProgressPercent();
        downloadRequest.getUrl();
    }

    @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
    public void onSuccess(File file, DownloadRequest downloadRequest) {
        this.this$0.getSdkExecutors().getBackgroundExecutor().execute(new vu3(file, this, downloadRequest, this.this$0, 6));
    }
}
