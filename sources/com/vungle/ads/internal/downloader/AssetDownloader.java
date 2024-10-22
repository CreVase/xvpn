package com.vungle.ads.internal.downloader;

import android.content.Context;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.internal.downloader.AssetDownloadListener;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.task.PriorityRunnable;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.cq0;
import defpackage.i23;
import defpackage.ng0;
import defpackage.w61;
import defpackage.xg2;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.RealResponseBody;

/* loaded from: classes2.dex */
public final class AssetDownloader implements Downloader {
    private static final String CONTENT_ENCODING = "Content-Encoding";
    private static final String CONTENT_TYPE = "Content-Type";
    public static final Companion Companion = new Companion(null);
    private static final int DOWNLOAD_CHUNK_SIZE = 2048;
    private static final String GZIP = "gzip";
    private static final String IDENTITY = "identity";
    private static final long MAX_PERCENT = 100;
    private static final int MINIMUM_SPACE_REQUIRED_MB = 20971520;
    private static final int PROGRESS_STEP = 5;
    private static final String TAG = "AssetDownloader";
    private static final int TIMEOUT = 30;
    private final VungleThreadPoolExecutor downloadExecutor;
    private OkHttpClient okHttpClient;
    private final PathProvider pathProvider;
    private final int progressStep = 5;
    private final List<DownloadRequest> transitioning = new ArrayList();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public AssetDownloader(VungleThreadPoolExecutor vungleThreadPoolExecutor, PathProvider pathProvider) {
        this.downloadExecutor = vungleThreadPoolExecutor;
        this.pathProvider = pathProvider;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.okHttpClient = builder.readTimeout(30L, timeUnit).connectTimeout(30L, timeUnit).cache(null).followRedirects(true).followSslRedirects(true).build();
    }

    private final boolean checkSpaceAvailable() {
        PathProvider pathProvider = this.pathProvider;
        long availableBytes = pathProvider.getAvailableBytes(pathProvider.getVungleDir$vungle_ads_release().toString());
        if (availableBytes < 20971520) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(126, "Insufficient space " + availableBytes, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            return false;
        }
        return true;
    }

    private final ResponseBody decodeGzipIfNeeded(Response response) {
        ResponseBody body = response.body();
        if (i23.U0(GZIP, Response.header$default(response, CONTENT_ENCODING, null, 2, null)) && body != null) {
            return new RealResponseBody(Response.header$default(response, CONTENT_TYPE, null, 2, null), -1L, new xg2(new w61(body.source())));
        }
        return body;
    }

    private final void deliverError(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener, AssetDownloadListener.DownloadError downloadError) {
        if (assetDownloadListener != null) {
            assetDownloadListener.onError(downloadError, downloadRequest);
        }
    }

    private final void deliverProgress(AssetDownloadListener.Progress progress, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Objects.toString(downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onProgress(progress, downloadRequest);
        }
    }

    private final void deliverSuccess(File file, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        Objects.toString(downloadRequest);
        if (assetDownloadListener != null) {
            assetDownloadListener.onSuccess(file, downloadRequest);
        }
    }

    /* renamed from: download$lambda-0 */
    public static final void m68download$lambda0(AssetDownloader assetDownloader, DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener) {
        assetDownloader.deliverError(downloadRequest, assetDownloadListener, new AssetDownloadListener.DownloadError(-1, new InternalError(3001, null, 2, null), AssetDownloadListener.DownloadError.ErrorReason.Companion.getINTERNAL_ERROR()));
    }

    private final long getContentLength(Response response) {
        boolean z;
        String str = response.headers().get("Content-Length");
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Response networkResponse = response.networkResponse();
            str = null;
            if (networkResponse != null) {
                str = Response.header$default(networkResponse, "Content-Length", null, 2, null);
            }
        }
        if (str == null || str.length() == 0) {
            z2 = true;
        }
        if (!z2) {
            try {
            } catch (Throwable unused) {
                return -1L;
            }
        }
        return Long.parseLong(str);
    }

    private final boolean isValidUrl(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || HttpUrl.Companion.parse(str) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0221, code lost:            r26 = com.vungle.ads.AnalyticsClient.INSTANCE;        r0 = new java.lang.StringBuilder();        r0.append("Asset save error ");     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x022f, code lost:            r6 = r25;     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0231, code lost:            r0.append(r6);        r26.logError$vungle_ads_release(114, r0.toString(), (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x024c, code lost:            throw new com.vungle.ads.internal.downloader.Downloader.RequestException("File is not existing");     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02b9, code lost:            r0 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x024f, code lost:            r6 = r25;        r4.flush();        r0 = r5.getStatus();        r7 = com.vungle.ads.internal.downloader.AssetDownloadListener.Progress.ProgressStatus.Companion;     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x025e, code lost:            if (r0 != r7.getIN_PROGRESS()) goto L419;     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0260, code lost:            r5.setStatus(r7.getDONE());     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x026b, code lost:            if (r15.body() == null) goto L424;     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x026d, code lost:            r0 = r15.body();     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x0271, code lost:            if (r0 == null) goto L424;     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0273, code lost:            r0.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0276, code lost:            r24.cancel();        r0 = com.vungle.ads.internal.util.FileUtility.INSTANCE;        r0.closeQuietly(r4);        r0.closeQuietly(r8);        r0 = r5.getStatus();     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0289, code lost:            if (r0 != r7.getCANCELLED()) goto L427;     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x028b, code lost:            deliverProgress(r5, r35, r36);     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x02b5, code lost:            r7 = r22;     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0293, code lost:            if (r0 != r7.getDONE()) goto L430;     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0295, code lost:            deliverSuccess(r9, r35, r36);     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x029d, code lost:            if (r0 != r7.getSTARTED()) goto L434;     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x029f, code lost:            if (r12 == null) goto L438;     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x02a1, code lost:            deliverError(r35, r36, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x02a9, code lost:            if (r0 != r7.getERROR()) goto L437;     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x02ab, code lost:            deliverError(r35, r36, r12);     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x02af, code lost:            r5.getStatus();        deliverError(r35, r36, r12);     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0353 A[Catch: all -> 0x0410, TryCatch #10 {all -> 0x0410, blocks: (B:152:0x019f, B:155:0x01be, B:157:0x01c4, B:173:0x01ca, B:159:0x01d5, B:161:0x01e3, B:163:0x01eb, B:165:0x01f4, B:167:0x0200, B:175:0x0221, B:177:0x0231, B:178:0x024c, B:53:0x0346, B:55:0x0353, B:56:0x03a2, B:82:0x037a, B:84:0x037e, B:86:0x0382, B:185:0x024f, B:187:0x0260), top: B:151:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x037a A[Catch: all -> 0x0410, TryCatch #10 {all -> 0x0410, blocks: (B:152:0x019f, B:155:0x01be, B:157:0x01c4, B:173:0x01ca, B:159:0x01d5, B:161:0x01e3, B:163:0x01eb, B:165:0x01f4, B:167:0x0200, B:175:0x0221, B:177:0x0231, B:178:0x024c, B:53:0x0346, B:55:0x0353, B:56:0x03a2, B:82:0x037a, B:84:0x037e, B:86:0x0382, B:185:0x024f, B:187:0x0260), top: B:151:0x019f }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0428  */
    /* JADX WARN: Type inference failed for: r0v23, types: [okhttp3.Request$Builder] */
    /* JADX WARN: Type inference failed for: r0v55, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r24v1, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r24v10 */
    /* JADX WARN: Type inference failed for: r24v25 */
    /* JADX WARN: Type inference failed for: r24v26 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [wg2, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [long] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v4, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v13, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [okhttp3.Call] */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void launchRequest(com.vungle.ads.internal.downloader.DownloadRequest r35, com.vungle.ads.internal.downloader.AssetDownloadListener r36) {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.downloader.AssetDownloader.launchRequest(com.vungle.ads.internal.downloader.DownloadRequest, com.vungle.ads.internal.downloader.AssetDownloadListener):void");
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancel(DownloadRequest downloadRequest) {
        if (downloadRequest != null && !downloadRequest.isCancelled()) {
            downloadRequest.cancel();
        }
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void cancelAll() {
        Iterator<T> it = this.transitioning.iterator();
        while (it.hasNext()) {
            cancel((DownloadRequest) it.next());
        }
        this.transitioning.clear();
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public void download(final DownloadRequest downloadRequest, final AssetDownloadListener assetDownloadListener) {
        if (downloadRequest == null) {
            return;
        }
        this.transitioning.add(downloadRequest);
        this.downloadExecutor.execute(new PriorityRunnable() { // from class: com.vungle.ads.internal.downloader.AssetDownloader$download$1
            @Override // com.vungle.ads.internal.task.PriorityRunnable
            public int getPriority() {
                return downloadRequest.getPriority();
            }

            @Override // java.lang.Runnable
            public void run() {
                AssetDownloader.this.launchRequest(downloadRequest, assetDownloadListener);
            }
        }, new cq0(20, this, downloadRequest, assetDownloadListener));
    }

    @Override // com.vungle.ads.internal.downloader.Downloader
    public File getDestinationDir(Context context) {
        return this.pathProvider.getDownloadsDir$vungle_ads_release();
    }
}
