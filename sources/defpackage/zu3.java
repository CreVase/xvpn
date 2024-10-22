package defpackage;

import android.content.Context;
import com.chartboost.sdk.ads.Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.events.CBError;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.impl.c;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.internal.VungleInitializer;

/* loaded from: classes.dex */
public final /* synthetic */ class zu3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5552a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5553b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zu3(Context context, String str, VungleInitializer vungleInitializer, InitializationListener initializationListener, ui1 ui1Var) {
        this.f5552a = 3;
        this.f5553b = context;
        this.d = str;
        this.c = vungleInitializer;
        this.f = initializationListener;
        this.e = ui1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5552a;
        String str = this.d;
        Object obj = this.e;
        Object obj2 = this.f;
        Object obj3 = this.c;
        Object obj4 = this.f5553b;
        switch (i) {
            case 0:
                c.a((Ad) obj4, (AdCallback) obj3, str, (ClickError) obj2, (c) obj);
                return;
            case 1:
                c.a((Ad) obj4, (AdCallback) obj3, str, (ShowError) obj2, (c) obj);
                return;
            case 2:
                c.a((Ad) obj4, (AdCallback) obj3, str, (CacheError) obj2, (c) obj);
                return;
            default:
                VungleInitializer.m60init$lambda3((Context) obj4, str, (VungleInitializer) obj3, (InitializationListener) obj2, (ui1) obj);
                return;
        }
    }

    public /* synthetic */ zu3(Ad ad, AdCallback adCallback, String str, CBError cBError, c cVar, int i) {
        this.f5552a = i;
        this.f5553b = ad;
        this.c = adCallback;
        this.d = str;
        this.f = cBError;
        this.e = cVar;
    }
}
