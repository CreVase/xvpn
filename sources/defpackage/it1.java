package defpackage;

import android.content.pm.ApkChecksum;
import android.content.res.Configuration;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.telephony.TelephonyManager;
import android.window.SplashScreenView;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract /* synthetic */ class it1 {
    public static /* bridge */ /* synthetic */ int b(Configuration configuration) {
        return configuration.fontWeightAdjustment;
    }

    public static /* bridge */ /* synthetic */ ApkChecksum c(Object obj) {
        return (ApkChecksum) obj;
    }

    public static /* synthetic */ PlaybackMetrics.Builder h() {
        return new PlaybackMetrics.Builder();
    }

    public static /* synthetic */ PlaybackStateEvent.Builder i() {
        return new PlaybackStateEvent.Builder();
    }

    public static /* synthetic */ TrackChangeEvent.Builder j(int i) {
        return new TrackChangeEvent.Builder(i);
    }

    public static /* bridge */ /* synthetic */ SplashScreenView m(Object obj) {
        return (SplashScreenView) obj;
    }

    public static /* bridge */ /* synthetic */ void s(TelephonyManager telephonyManager, vz1 vz1Var) {
        telephonyManager.unregisterTelephonyCallback(vz1Var);
    }

    public static /* bridge */ /* synthetic */ void t(TelephonyManager telephonyManager, Executor executor, vz1 vz1Var) {
        telephonyManager.registerTelephonyCallback(executor, vz1Var);
    }

    public static /* bridge */ /* synthetic */ boolean w(Object obj) {
        return obj instanceof SplashScreenView;
    }
}
