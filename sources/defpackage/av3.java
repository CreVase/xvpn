package defpackage;

import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.impl.c;

/* loaded from: classes.dex */
public final /* synthetic */ class av3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f345a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ad f346b;
    public final /* synthetic */ AdCallback c;
    public final /* synthetic */ String d;
    public final /* synthetic */ c e;

    public /* synthetic */ av3(Ad ad, AdCallback adCallback, String str, c cVar, int i) {
        this.f345a = i;
        this.f346b = ad;
        this.c = adCallback;
        this.d = str;
        this.e = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f345a;
        AdCallback adCallback = this.c;
        Ad ad = this.f346b;
        c cVar = this.e;
        String str = this.d;
        switch (i) {
            case 0:
                c.b(ad, adCallback, str, cVar);
                return;
            default:
                c.a(ad, adCallback, str, cVar);
                return;
        }
    }
}
