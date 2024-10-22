package defpackage;

import android.adservices.measurement.DeletionRequest;
import android.adservices.measurement.MeasurementManager;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;

/* loaded from: classes.dex */
public abstract /* synthetic */ class x2 {
    public static /* bridge */ /* synthetic */ MeasurementManager c(Object obj) {
        return (MeasurementManager) obj;
    }

    public static /* synthetic */ GetTopicsRequest.Builder d() {
        return new GetTopicsRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ GetTopicsResponse h(Object obj) {
        return (GetTopicsResponse) obj;
    }

    public static /* bridge */ /* synthetic */ Topic i(Object obj) {
        return (Topic) obj;
    }

    public static /* bridge */ /* synthetic */ TopicsManager j(Object obj) {
        return (TopicsManager) obj;
    }

    public static /* bridge */ /* synthetic */ Class l() {
        return MeasurementManager.class;
    }

    public static /* bridge */ /* synthetic */ Object m(l00 l00Var, Class cls) {
        return l00Var.get(cls);
    }

    public static /* synthetic */ void p() {
        new DeletionRequest.Builder();
    }

    public static /* bridge */ /* synthetic */ Class v() {
        return TopicsManager.class;
    }

    public static /* synthetic */ void w() {
    }

    public static /* synthetic */ void x() {
    }
}
