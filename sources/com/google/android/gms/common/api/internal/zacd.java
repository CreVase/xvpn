package com.google.android.gms.common.api.internal;

import android.os.SystemClock;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfigManager;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zacd implements OnCompleteListener {
    private final GoogleApiManager zaa;
    private final int zab;
    private final ApiKey zac;
    private final long zad;
    private final long zae;

    @VisibleForTesting
    public zacd(GoogleApiManager googleApiManager, int i, ApiKey apiKey, long j, long j2, String str, String str2) {
        this.zaa = googleApiManager;
        this.zab = i;
        this.zac = apiKey;
        this.zad = j;
        this.zae = j2;
    }

    public static zacd zaa(GoogleApiManager googleApiManager, int i, ApiKey apiKey) {
        boolean z;
        long j;
        long j2;
        if (!googleApiManager.zaD()) {
            return null;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if (config != null) {
            if (!config.getMethodInvocationTelemetryEnabled()) {
                return null;
            }
            z = config.getMethodTimingTelemetryEnabled();
            zabq zai = googleApiManager.zai(apiKey);
            if (zai != null) {
                if (!(zai.zaf() instanceof BaseGmsClient)) {
                    return null;
                }
                BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, i);
                    if (zab == null) {
                        return null;
                    }
                    zai.zaq();
                    z = zab.getMethodTimingTelemetryEnabled();
                }
            }
        } else {
            z = true;
        }
        if (z) {
            j = System.currentTimeMillis();
        } else {
            j = 0;
        }
        if (z) {
            j2 = SystemClock.elapsedRealtime();
        } else {
            j2 = 0;
        }
        return new zacd(googleApiManager, i, apiKey, j, j2, null, null);
    }

    private static ConnectionTelemetryConfiguration zab(zabq zabqVar, BaseGmsClient baseGmsClient, int i) {
        int[] methodInvocationMethodKeyAllowlist;
        int[] methodInvocationMethodKeyDisallowlist;
        ConnectionTelemetryConfiguration telemetryConfiguration = baseGmsClient.getTelemetryConfiguration();
        if (telemetryConfiguration == null || !telemetryConfiguration.getMethodInvocationTelemetryEnabled() || ((methodInvocationMethodKeyAllowlist = telemetryConfiguration.getMethodInvocationMethodKeyAllowlist()) != null ? !ArrayUtils.contains(methodInvocationMethodKeyAllowlist, i) : !((methodInvocationMethodKeyDisallowlist = telemetryConfiguration.getMethodInvocationMethodKeyDisallowlist()) == null || !ArrayUtils.contains(methodInvocationMethodKeyDisallowlist, i))) || zabqVar.zac() >= telemetryConfiguration.getMaxMethodInvocationsLogged()) {
            return null;
        }
        return telemetryConfiguration;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        zabq zai;
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int errorCode;
        long j;
        long j2;
        int i5;
        if (!this.zaa.zaD()) {
            return;
        }
        RootTelemetryConfiguration config = RootTelemetryConfigManager.getInstance().getConfig();
        if ((config == null || config.getMethodInvocationTelemetryEnabled()) && (zai = this.zaa.zai(this.zac)) != null && (zai.zaf() instanceof BaseGmsClient)) {
            BaseGmsClient baseGmsClient = (BaseGmsClient) zai.zaf();
            boolean z2 = true;
            if (this.zad > 0) {
                z = true;
            } else {
                z = false;
            }
            int gCoreServiceId = baseGmsClient.getGCoreServiceId();
            if (config != null) {
                z &= config.getMethodTimingTelemetryEnabled();
                int batchPeriodMillis = config.getBatchPeriodMillis();
                int maxMethodInvocationsInBatch = config.getMaxMethodInvocationsInBatch();
                i = config.getVersion();
                if (baseGmsClient.hasConnectionInfo() && !baseGmsClient.isConnecting()) {
                    ConnectionTelemetryConfiguration zab = zab(zai, baseGmsClient, this.zab);
                    if (zab == null) {
                        return;
                    }
                    if (!zab.getMethodTimingTelemetryEnabled() || this.zad <= 0) {
                        z2 = false;
                    }
                    maxMethodInvocationsInBatch = zab.getMaxMethodInvocationsLogged();
                    z = z2;
                }
                i2 = batchPeriodMillis;
                i3 = maxMethodInvocationsInBatch;
            } else {
                i = 0;
                i2 = 5000;
                i3 = 100;
            }
            GoogleApiManager googleApiManager = this.zaa;
            if (task.isSuccessful()) {
                i4 = 0;
                errorCode = 0;
            } else {
                if (task.isCanceled()) {
                    i4 = 100;
                } else {
                    Exception exception = task.getException();
                    if (exception instanceof ApiException) {
                        Status status = ((ApiException) exception).getStatus();
                        int statusCode = status.getStatusCode();
                        ConnectionResult connectionResult = status.getConnectionResult();
                        if (connectionResult == null) {
                            i4 = statusCode;
                        } else {
                            errorCode = connectionResult.getErrorCode();
                            i4 = statusCode;
                        }
                    } else {
                        i4 = 101;
                    }
                }
                errorCode = -1;
            }
            if (z) {
                long j3 = this.zad;
                j2 = System.currentTimeMillis();
                j = j3;
                i5 = (int) (SystemClock.elapsedRealtime() - this.zae);
            } else {
                j = 0;
                j2 = 0;
                i5 = -1;
            }
            googleApiManager.zaw(new MethodInvocation(this.zab, i4, errorCode, j, j2, null, null, gCoreServiceId, i5), i, i2, i3);
        }
    }
}
