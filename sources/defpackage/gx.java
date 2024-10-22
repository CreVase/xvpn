package defpackage;

import com.chartboost.sdk.callbacks.StartCallback;
import com.chartboost.sdk.events.StartError;
import com.google.ads.mediation.chartboost.ChartboostInitializer;
import com.google.android.gms.ads.AdError;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class gx implements StartCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ChartboostInitializer f2338a;

    public gx(ChartboostInitializer chartboostInitializer) {
        this.f2338a = chartboostInitializer;
    }

    @Override // com.chartboost.sdk.callbacks.StartCallback
    public final void onStartCompleted(StartError startError) {
        ChartboostInitializer chartboostInitializer = this.f2338a;
        chartboostInitializer.f1422a = false;
        if (startError == null) {
            chartboostInitializer.f1423b = true;
            Iterator it = chartboostInitializer.c.iterator();
            while (it.hasNext()) {
                ((hx) it.next()).onInitializationSucceeded();
            }
        } else {
            chartboostInitializer.f1423b = false;
            AdError adError = new AdError(startError.getCode().getErrorCode(), startError.toString(), "com.chartboost.sdk");
            Iterator it2 = chartboostInitializer.c.iterator();
            while (it2.hasNext()) {
                ((hx) it2.next()).a(adError);
            }
        }
        chartboostInitializer.c.clear();
    }
}
