package com.vungle.ads.internal.presenter;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.ContextThemeWrapper;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.network.TpatSender;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.privacy.PrivacyConsent;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.ui.PresenterAppLeftCallback;
import com.vungle.ads.internal.util.ExternalRouter;
import defpackage.cd3;
import defpackage.gi2;
import defpackage.hx2;
import defpackage.kj1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.ui1;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class NativeAdPresenter {
    public static final String DOWNLOAD = "download";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String TPAT = "tpat";
    public static final String VIDEO_VIEWED = "videoViewed";
    private boolean adViewed;
    private AdEventListener bus;
    private final Context context;
    private Dialog currentDialog;
    private final NativePresenterDelegate delegate;
    private Executor executor;
    private final ui1 vungleApiClient$delegate;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = gi2.a(NativeAdPresenter.class).b();

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public NativeAdPresenter(Context context, NativePresenterDelegate nativePresenterDelegate, Executor executor) {
        this.context = context;
        this.delegate = nativePresenterDelegate;
        this.executor = executor;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = m20.D0(kj1.f2953a, new NativeAdPresenter$special$$inlined$inject$1(context));
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    private final boolean needShowGdpr() {
        if (ConfigManager.INSTANCE.getGDPRIsCountryDataProtected() && m20.L("unknown", PrivacyManager.INSTANCE.getConsentStatus())) {
            return true;
        }
        return false;
    }

    private final void onDownload(String str) {
        boolean z;
        List tpatUrls$default = NativePresenterDelegate.DefaultImpls.getTpatUrls$default(this.delegate, "clickUrl", null, 2, null);
        final TpatSender tpatSender = new TpatSender(getVungleApiClient(), this.delegate.getPlacementRefId(), this.delegate.getCreativeId(), this.delegate.getEventId());
        List list = tpatUrls$default;
        if (list != null && !list.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key: clickUrl", (r13 & 4) != 0 ? null : this.delegate.getPlacementRefId(), (r13 & 8) != 0 ? null : this.delegate.getCreativeId(), (r13 & 16) != 0 ? null : null);
        } else {
            Iterator it = tpatUrls$default.iterator();
            while (it.hasNext()) {
                tpatSender.sendTpat((String) it.next(), this.executor);
            }
        }
        if (str != null) {
            tpatSender.sendTpat(str, this.executor);
        }
        ExternalRouter.launch(this.delegate.getDeepLinkUrl(), str, this.context, true, new PresenterAppLeftCallback(this.bus, null), new PresenterAdOpenCallback() { // from class: com.vungle.ads.internal.presenter.NativeAdPresenter$onDownload$3
            @Override // com.vungle.ads.internal.ui.PresenterAdOpenCallback
            public void onDeeplinkClick(boolean z2) {
                NativePresenterDelegate nativePresenterDelegate;
                Executor executor;
                nativePresenterDelegate = NativeAdPresenter.this.delegate;
                List<String> tpatUrls = nativePresenterDelegate.getTpatUrls(Constants.DEEPLINK_CLICK, String.valueOf(z2));
                if (tpatUrls != null) {
                    TpatSender tpatSender2 = tpatSender;
                    NativeAdPresenter nativeAdPresenter = NativeAdPresenter.this;
                    for (String str2 : tpatUrls) {
                        executor = nativeAdPresenter.executor;
                        tpatSender2.sendTpat(str2, executor);
                    }
                }
            }
        });
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext(MRAIDPresenter.OPEN, "adClick", this.delegate.getPlacementRefId());
        }
    }

    private final void onPrivacy(String str) {
        if (str != null) {
            ExternalRouter.launch(null, str, this.context, true, new PresenterAppLeftCallback(this.bus, this.delegate.getPlacementRefId()), null);
        }
    }

    public static /* synthetic */ void processCommand$default(NativeAdPresenter nativeAdPresenter, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        nativeAdPresenter.processCommand(str, str2);
    }

    private final void showGdpr() {
        boolean z;
        PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", null);
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: vy1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                NativeAdPresenter.m88showGdpr$lambda6(NativeAdPresenter.this, dialogInterface, i);
            }
        };
        ConfigManager configManager = ConfigManager.INSTANCE;
        String gDPRConsentTitle = configManager.getGDPRConsentTitle();
        String gDPRConsentMessage = configManager.getGDPRConsentMessage();
        String gDPRButtonAccept = configManager.getGDPRButtonAccept();
        String gDPRButtonDeny = configManager.getGDPRButtonDeny();
        Context context = this.context;
        AlertDialog.Builder builder = new AlertDialog.Builder(new ContextThemeWrapper(context, context.getApplicationInfo().theme));
        boolean z2 = true;
        if (gDPRConsentTitle != null && gDPRConsentTitle.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            builder.setTitle(gDPRConsentTitle);
        }
        if (gDPRConsentMessage != null && gDPRConsentMessage.length() != 0) {
            z2 = false;
        }
        if (!z2) {
            builder.setMessage(gDPRConsentMessage);
        }
        builder.setPositiveButton(gDPRButtonAccept, onClickListener);
        builder.setNegativeButton(gDPRButtonDeny, onClickListener);
        builder.setCancelable(false);
        AlertDialog create = builder.create();
        create.setOnDismissListener(new cd3(this, 2));
        this.currentDialog = create;
        create.show();
    }

    /* renamed from: showGdpr$lambda-6 */
    public static final void m88showGdpr$lambda6(NativeAdPresenter nativeAdPresenter, DialogInterface dialogInterface, int i) {
        String value;
        if (i != -2) {
            if (i != -1) {
                value = "opted_out_by_timeout";
            } else {
                value = PrivacyConsent.OPT_IN.getValue();
            }
        } else {
            value = PrivacyConsent.OPT_OUT.getValue();
        }
        PrivacyManager.INSTANCE.updateGdprConsent(value, "vungle_modal", null);
        nativeAdPresenter.start();
    }

    private final void start() {
        if (needShowGdpr()) {
            showGdpr();
        }
    }

    public final void detach() {
        Dialog dialog = this.currentDialog;
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("end", null, this.delegate.getPlacementRefId());
        }
    }

    public final void prepare() {
        start();
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onNext("start", null, this.delegate.getPlacementRefId());
        }
    }

    public final void processCommand(String str, String str2) {
        boolean z;
        AdEventListener adEventListener;
        boolean z2 = true;
        switch (str.hashCode()) {
            case -511324706:
                if (str.equals("openPrivacy")) {
                    onPrivacy(str2);
                    return;
                }
                return;
            case 3566511:
                if (str.equals("tpat")) {
                    if (str2 != null && str2.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        AnalyticsClient.INSTANCE.logError$vungle_ads_release(129, "Empty tpat key", (r13 & 4) != 0 ? null : this.delegate.getPlacementRefId(), (r13 & 8) != 0 ? null : this.delegate.getCreativeId(), (r13 & 16) != 0 ? null : null);
                        return;
                    }
                    List tpatUrls$default = NativePresenterDelegate.DefaultImpls.getTpatUrls$default(this.delegate, str2, null, 2, null);
                    List list = tpatUrls$default;
                    if (list != null && !list.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        AnalyticsClient.INSTANCE.logError$vungle_ads_release(128, hx2.p("Invalid tpat key: ", str2), (r13 & 4) != 0 ? null : this.delegate.getPlacementRefId(), (r13 & 8) != 0 ? null : this.delegate.getCreativeId(), (r13 & 16) != 0 ? null : null);
                        return;
                    }
                    TpatSender tpatSender = new TpatSender(getVungleApiClient(), this.delegate.getPlacementRefId(), this.delegate.getCreativeId(), this.delegate.getEventId());
                    Iterator it = tpatUrls$default.iterator();
                    while (it.hasNext()) {
                        tpatSender.sendTpat((String) it.next(), this.executor);
                    }
                    return;
                }
                return;
            case 1118284383:
                if (str.equals("videoViewed") && (adEventListener = this.bus) != null && !this.adViewed) {
                    this.adViewed = true;
                    if (adEventListener != null) {
                        adEventListener.onNext("adViewed", null, this.delegate.getPlacementRefId());
                    }
                    TpatSender tpatSender2 = new TpatSender(getVungleApiClient(), this.delegate.getPlacementRefId(), this.delegate.getCreativeId(), this.delegate.getEventId());
                    List<String> impressionUrls = this.delegate.getImpressionUrls();
                    if (impressionUrls != null) {
                        Iterator<T> it2 = impressionUrls.iterator();
                        while (it2.hasNext()) {
                            tpatSender2.sendTpat((String) it2.next(), this.executor);
                        }
                        return;
                    }
                    return;
                }
                return;
            case 1427818632:
                if (str.equals(DOWNLOAD)) {
                    onDownload(str2);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }
}
