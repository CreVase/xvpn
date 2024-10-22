package com.vungle.ads.internal;

import android.net.Uri;
import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Placement;
import defpackage.hx2;
import defpackage.m20;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class ConfigManager {
    public static final ConfigManager INSTANCE = new ConfigManager();
    public static final String TAG = "ConfigManager";
    private static ConfigPayload config;
    private static ConfigPayload.Endpoints endpoints;
    private static List<Placement> placements;

    private ConfigManager() {
    }

    public final boolean adLoadOptimizationEnabled() {
        ConfigPayload.LoadOptimizationSettings isAdDownloadOptEnabled;
        ConfigPayload configPayload = config;
        if (configPayload != null && (isAdDownloadOptEnabled = configPayload.isAdDownloadOptEnabled()) != null) {
            return isAdDownloadOptEnabled.getEnabled();
        }
        return false;
    }

    public final String getAdsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getAdsEndpoint();
        }
        return null;
    }

    public final String getConfigExtension() {
        String configExtension;
        ConfigPayload configPayload = config;
        if (configPayload == null || (configExtension = configPayload.getConfigExtension()) == null) {
            return "";
        }
        return configExtension;
    }

    public final String getErrorLoggingEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getErrorLogsEndpoint();
        }
        return null;
    }

    public final String getGDPRButtonAccept() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload != null && (gdpr = configPayload.getGdpr()) != null) {
            return gdpr.getButtonAccept();
        }
        return null;
    }

    public final String getGDPRButtonDeny() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload != null && (gdpr = configPayload.getGdpr()) != null) {
            return gdpr.getButtonDeny();
        }
        return null;
    }

    public final String getGDPRConsentMessage() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload != null && (gdpr = configPayload.getGdpr()) != null) {
            return gdpr.getConsentMessage();
        }
        return null;
    }

    public final String getGDPRConsentMessageVersion() {
        ConfigPayload.GDPRSettings gdpr;
        String consentMessageVersion;
        ConfigPayload configPayload = config;
        if (configPayload == null || (gdpr = configPayload.getGdpr()) == null || (consentMessageVersion = gdpr.getConsentMessageVersion()) == null) {
            return "";
        }
        return consentMessageVersion;
    }

    public final String getGDPRConsentTitle() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload != null && (gdpr = configPayload.getGdpr()) != null) {
            return gdpr.getConsentTitle();
        }
        return null;
    }

    public final boolean getGDPRIsCountryDataProtected() {
        ConfigPayload.GDPRSettings gdpr;
        ConfigPayload configPayload = config;
        if (configPayload != null && (gdpr = configPayload.getGdpr()) != null) {
            return gdpr.isCountryDataProtected();
        }
        return false;
    }

    public final String getLogEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getBiEndpoint();
        }
        return null;
    }

    public final int getLogLevel() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        ConfigPayload configPayload = config;
        if (configPayload != null && (logMetricsSettings = configPayload.getLogMetricsSettings()) != null) {
            return logMetricsSettings.getErrorLogLevel();
        }
        return AnalyticsClient.LogLevel.ERROR_LOG_LEVEL_ERROR.getLevel();
    }

    public final boolean getMetricsEnabled() {
        ConfigPayload.LogMetricsSettings logMetricsSettings;
        ConfigPayload configPayload = config;
        if (configPayload != null && (logMetricsSettings = configPayload.getLogMetricsSettings()) != null) {
            return logMetricsSettings.getMetricsEnabled();
        }
        return false;
    }

    public final String getMetricsEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getMetricsEndpoint();
        }
        return null;
    }

    public final String getMraidEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getMraidEndpoint();
        }
        return null;
    }

    public final String getMraidJsVersion() {
        String p;
        String mraidEndpoint = getMraidEndpoint();
        if (mraidEndpoint == null || (p = hx2.p("mraid_", Uri.parse(mraidEndpoint).getLastPathSegment())) == null) {
            return "mraid_1";
        }
        return p;
    }

    public final Placement getPlacement(String str) {
        List<Placement> list = placements;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (m20.L(((Placement) next).getReferenceId(), str)) {
                obj = next;
                break;
            }
        }
        return (Placement) obj;
    }

    public final String getRiEndpoint() {
        ConfigPayload.Endpoints endpoints2 = endpoints;
        if (endpoints2 != null) {
            return endpoints2.getRiEndpoint();
        }
        return null;
    }

    public final int getSessionTimeoutInSecond() {
        ConfigPayload.Session session;
        ConfigPayload configPayload = config;
        if (configPayload != null && (session = configPayload.getSession()) != null) {
            return session.getTimeout();
        }
        return 900;
    }

    public final boolean heartbeatEnabled() {
        ConfigPayload.Template template;
        ConfigPayload configPayload = config;
        if (configPayload != null && (template = configPayload.getTemplate()) != null) {
            return template.getHeartbeatEnabled();
        }
        return false;
    }

    public final void initWithConfig(ConfigPayload configPayload) {
        config = configPayload;
        endpoints = configPayload.getEndpoints();
        placements = configPayload.getPlacements();
    }

    public final boolean isReportIncentivizedEnabled() {
        ConfigPayload.ReportIncentivizedSettings isReportIncentivizedEnabled;
        ConfigPayload configPayload = config;
        if (configPayload != null && (isReportIncentivizedEnabled = configPayload.isReportIncentivizedEnabled()) != null) {
            return isReportIncentivizedEnabled.getEnabled();
        }
        return false;
    }

    public final boolean omEnabled() {
        ConfigPayload.ViewabilitySettings viewability;
        ConfigPayload configPayload = config;
        if (configPayload != null && (viewability = configPayload.getViewability()) != null) {
            return viewability.getOm();
        }
        return false;
    }

    public final List<Placement> placements() {
        return placements;
    }

    public final boolean shouldDisableAdId() {
        Boolean disableAdId;
        ConfigPayload configPayload = config;
        if (configPayload != null && (disableAdId = configPayload.getDisableAdId()) != null) {
            return disableAdId.booleanValue();
        }
        return true;
    }

    public final boolean validateEndpoints$vungle_ads_release() {
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        String str4;
        boolean z5;
        ConfigPayload.Endpoints endpoints2 = endpoints;
        String str5 = null;
        if (endpoints2 != null) {
            str = endpoints2.getAdsEndpoint();
        } else {
            str = null;
        }
        boolean z6 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(122, "The ads endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            z2 = false;
        } else {
            z2 = true;
        }
        ConfigPayload.Endpoints endpoints3 = endpoints;
        if (endpoints3 != null) {
            str2 = endpoints3.getRiEndpoint();
        } else {
            str2 = null;
        }
        if (str2 != null && str2.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(123, "The ri endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        ConfigPayload.Endpoints endpoints4 = endpoints;
        if (endpoints4 != null) {
            str3 = endpoints4.getMraidEndpoint();
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(130, "The mraid endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            z2 = false;
        }
        ConfigPayload.Endpoints endpoints5 = endpoints;
        if (endpoints5 != null) {
            str4 = endpoints5.getMetricsEndpoint();
        } else {
            str4 = null;
        }
        if (str4 != null && str4.length() != 0) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (z5) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(125, "The metrics endpoint was not provided in the config.", (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        ConfigPayload.Endpoints endpoints6 = endpoints;
        if (endpoints6 != null) {
            str5 = endpoints6.getErrorLogsEndpoint();
        }
        if (str5 == null || str5.length() == 0) {
            z6 = true;
        }
        if (z6) {
            Log.e(TAG, "The error logging endpoint was not provided in the config.");
        }
        return z2;
    }
}
