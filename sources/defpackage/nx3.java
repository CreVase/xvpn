package defpackage;

import android.util.Log;
import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class nx3 extends FullScreenContentCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3559a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f3560b;
    public final Object c;

    public /* synthetic */ nx3(kn knVar, y82 y82Var, int i) {
        this.f3559a = i;
        this.f3560b = knVar;
        this.c = y82Var;
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdDismissedFullScreenContent() {
        int i = this.f3559a;
        Object obj = this.f3560b;
        switch (i) {
            case 0:
                ((MediationInterstitialListener) this.c).onAdClosed((AbstractAdViewAdapter) obj);
                return;
            case 1:
                String str = ((k8) obj).f2978a;
                lb2 s = ew3.s(str);
                String str2 = s.f3096a + " " + s.c + " " + s.f3097b + " close";
                Object[] objArr = new Object[0];
                if (ew3.T()) {
                    Log.i("===DebugLog===", str2 + " " + Arrays.toString(objArr));
                }
                ew3.l(str);
                return;
            default:
                ew3.l(((o8) obj).f2978a);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdFailedToShowFullScreenContent(AdError adError) {
        int i = this.f3559a;
        Object obj = this.c;
        Object obj2 = this.f3560b;
        switch (i) {
            case 1:
                ((k8) obj2).c((ep2) obj, adError.getMessage());
                return;
            case 2:
                ((o8) obj2).c((ep2) obj, adError.getMessage());
                return;
            default:
                super.onAdFailedToShowFullScreenContent(adError);
                return;
        }
    }

    @Override // com.google.android.gms.ads.FullScreenContentCallback
    public final void onAdShowedFullScreenContent() {
        int i = this.f3559a;
        Object obj = this.f3560b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((MediationInterstitialListener) obj2).onAdOpened((AbstractAdViewAdapter) obj);
                return;
            case 1:
                ((k8) obj).d((ep2) obj2);
                return;
            default:
                ((o8) obj).d((ep2) obj2);
                return;
        }
    }

    public nx3(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.f3559a = 0;
        this.f3560b = abstractAdViewAdapter;
        this.c = mediationInterstitialListener;
    }
}
