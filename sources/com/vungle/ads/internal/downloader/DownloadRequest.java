package com.vungle.ads.internal.downloader;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.hx2;
import defpackage.ng0;
import defpackage.p71;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class DownloadRequest {
    private String advertisementId;
    private final AtomicBoolean cancelled;
    private String cookieString;
    private TimeIntervalMetric downloadDuration;
    private String id;
    private boolean isMainVideo;
    private boolean isTemplate;
    private int networkType;
    private String path;
    private boolean pauseOnConnectionLost;
    private AtomicReference<Priority> priority;
    private String url;

    /* loaded from: classes2.dex */
    public enum Priority {
        CRITICAL(-2147483647),
        HIGHEST(0),
        HIGH(1),
        LOWEST(Integer.MAX_VALUE);

        private final int priority;

        Priority(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    public /* synthetic */ DownloadRequest(Priority priority, String str, String str2, String str3, boolean z, boolean z2, int i, ng0 ng0Var) {
        this(priority, str, str2, str3, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2);
    }

    public static /* synthetic */ void stopRecord$default(DownloadRequest downloadRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        downloadRequest.stopRecord(str, str2, str3);
    }

    public final void cancel() {
        this.cancelled.set(true);
    }

    public final String getAdvertisementId() {
        return this.advertisementId;
    }

    public final String getCookieString() {
        return this.cookieString;
    }

    public final String getId() {
        return this.id;
    }

    public final int getNetworkType() {
        return this.networkType;
    }

    public final String getPath() {
        return this.path;
    }

    public final boolean getPauseOnConnectionLost() {
        return this.pauseOnConnectionLost;
    }

    public final int getPriority() {
        return this.priority.get().getPriority();
    }

    public final String getUrl() {
        return this.url;
    }

    public final boolean isCancelled() {
        return this.cancelled.get();
    }

    public final boolean isMainVideo() {
        return this.isMainVideo;
    }

    public final boolean isTemplate() {
        return this.isTemplate;
    }

    public final void setAdvertisementId(String str) {
        this.advertisementId = str;
    }

    public final void setCookieString(String str) {
        this.cookieString = str;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final void setMainVideo(boolean z) {
        this.isMainVideo = z;
    }

    public final void setNetworkType(int i) {
        this.networkType = i;
    }

    public final void setPath(String str) {
        this.path = str;
    }

    public final void setPauseOnConnectionLost(boolean z) {
        this.pauseOnConnectionLost = z;
    }

    public final void setPriority(Priority priority) {
        this.priority.set(priority);
    }

    public final void setTemplate(boolean z) {
        this.isTemplate = z;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final void startRecord() {
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.TEMPLATE_DOWNLOAD_DURATION_MS);
        this.downloadDuration = timeIntervalMetric;
        timeIntervalMetric.markStart();
    }

    public final void stopRecord(String str, String str2, String str3) {
        TimeIntervalMetric timeIntervalMetric = this.downloadDuration;
        if (timeIntervalMetric != null) {
            timeIntervalMetric.markEnd();
            AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(timeIntervalMetric, str2, str, str3, this.url);
        }
    }

    public String toString() {
        int i = this.networkType;
        AtomicReference<Priority> atomicReference = this.priority;
        String str = this.url;
        String str2 = this.path;
        boolean z = this.pauseOnConnectionLost;
        String str3 = this.id;
        String str4 = this.cookieString;
        AtomicBoolean atomicBoolean = this.cancelled;
        String str5 = this.advertisementId;
        StringBuilder sb = new StringBuilder("DownloadRequest{networkType=");
        sb.append(i);
        sb.append(", priority=");
        sb.append(atomicReference);
        sb.append(", url='");
        p71.A(sb, str, "', path='", str2, "', pauseOnConnectionLost=");
        sb.append(z);
        sb.append(", id='");
        sb.append(str3);
        sb.append("', cookieString='");
        sb.append(str4);
        sb.append("', cancelled=");
        sb.append(atomicBoolean);
        sb.append(", advertisementId=");
        return hx2.s(sb, str5, "}");
    }

    public DownloadRequest(Priority priority, String str, String str2, String str3, boolean z, boolean z2) {
        this(Downloader.NetworkType.Companion.getANY(), priority, str, str2, false, str3, null, z, z2);
    }

    public /* synthetic */ DownloadRequest(int i, Priority priority, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3, int i2, ng0 ng0Var) {
        this(i, priority, str, str2, z, str3, str4, (i2 & 128) != 0 ? false : z2, (i2 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 ? false : z3);
    }

    public DownloadRequest(@Downloader.NetworkType int i, Priority priority, String str, String str2, boolean z, String str3, String str4, boolean z2, boolean z3) {
        this.priority = new AtomicReference<>();
        this.cancelled = new AtomicBoolean(false);
        this.url = str;
        this.networkType = i;
        this.priority.set(priority);
        this.path = str2;
        this.pauseOnConnectionLost = z;
        this.cookieString = str3;
        this.advertisementId = str4;
        this.isTemplate = z2;
        this.isMainVideo = z3;
    }
}
