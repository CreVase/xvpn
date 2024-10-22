package com.vungle.ads.internal.load;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.MraidJsError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.downloader.DownloadRequest;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.hx2;
import defpackage.p71;
import defpackage.x31;
import java.io.File;

/* loaded from: classes2.dex */
public final class MraidJsLoader {
    public static final MraidJsLoader INSTANCE = new MraidJsLoader();
    public static final int MRAID_DOWNLOADED = 10;
    public static final int MRAID_DOWNLOAD_FAILED = 12;
    public static final int MRAID_INVALID_ENDPOINT = 11;
    private static final String TAG = "MraidJsLoader";

    private MraidJsLoader() {
    }

    public final void downloadJs(PathProvider pathProvider, Downloader downloader, final x31 x31Var) {
        boolean z;
        ConfigManager configManager = ConfigManager.INSTANCE;
        String mraidEndpoint = configManager.getMraidEndpoint();
        if (mraidEndpoint != null && mraidEndpoint.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            x31Var.invoke(11);
            return;
        }
        final File file = new File(pathProvider.getJsAssetDir(configManager.getMraidJsVersion()), Constants.MRAID_JS_FILE_NAME);
        if (file.exists()) {
            x31Var.invoke(10);
            return;
        }
        final File jsDir = pathProvider.getJsDir();
        FileUtility.deleteContents(jsDir);
        downloader.download(new DownloadRequest(DownloadRequest.Priority.HIGH, p71.l(mraidEndpoint, "/mraid.min.js"), file.getAbsolutePath(), null, false, false, 48, null), new AssetDownloadListener() { // from class: com.vungle.ads.internal.load.MraidJsLoader$downloadJs$1
            @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
            public void onError(AssetDownloadListener.DownloadError downloadError, DownloadRequest downloadRequest) {
                Integer num;
                Throwable th = null;
                if (downloadError != null) {
                    num = Integer.valueOf(downloadError.getServerCode());
                } else {
                    num = null;
                }
                if (downloadError != null) {
                    th = downloadError.getCause();
                }
                new MraidJsError("download mraid js error: " + num + ":" + th).logErrorNoReturnValue$vungle_ads_release();
                FileUtility.deleteContents(jsDir);
                x31Var.invoke(12);
            }

            @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
            public void onProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest) {
            }

            @Override // com.vungle.ads.internal.downloader.AssetDownloadListener
            public void onSuccess(File file2, DownloadRequest downloadRequest) {
                if (!file.exists() || file.length() <= 0) {
                    AnalyticsClient.INSTANCE.logError$vungle_ads_release(131, hx2.p("Mraid js downloaded but write failure: ", file.getAbsolutePath()), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
                    FileUtility.deleteContents(jsDir);
                    x31Var.invoke(12);
                    return;
                }
                x31Var.invoke(10);
            }
        });
    }
}
