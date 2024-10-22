package defpackage;

import com.facebook.ads.AudienceNetworkAds;
import com.google.android.gms.ads.AdError;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class hv0 implements AudienceNetworkAds.InitListener {
    public static hv0 d;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2492a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2493b = false;
    public final ArrayList c = new ArrayList();

    @Override // com.facebook.ads.AudienceNetworkAds.InitListener
    public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
        this.f2492a = false;
        this.f2493b = initResult.isSuccess();
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iv0 iv0Var = (iv0) it.next();
            if (initResult.isSuccess()) {
                iv0Var.f2654a.onInitializationSucceeded();
            } else {
                iv0Var.f2654a.onInitializationFailed(new AdError(104, initResult.getMessage(), "com.google.ads.mediation.facebook").getMessage());
            }
        }
        arrayList.clear();
    }
}
