package com.vungle.ads;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.util.ViewUtility;
import defpackage.kj1;
import defpackage.m20;
import defpackage.ui1;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class BannerView extends RelativeLayout {
    private final MRAIDAdWidget adWidget;
    private int calculatedPixelHeight;
    private int calculatedPixelWidth;
    private AtomicBoolean destroyed;
    private WatermarkView imageView;
    private boolean isOnImpressionCalled;
    private final MRAIDPresenter presenter;

    public BannerView(Context context, Placement placement, AdPayload adPayload, BannerAdSize bannerAdSize, AdConfig adConfig, AdPlayCallback adPlayCallback, BidPayload bidPayload) {
        super(context);
        boolean z = false;
        this.destroyed = new AtomicBoolean(false);
        ViewUtility viewUtility = ViewUtility.INSTANCE;
        this.calculatedPixelHeight = viewUtility.dpToPixels(context, bannerAdSize.getHeight());
        this.calculatedPixelWidth = viewUtility.dpToPixels(context, bannerAdSize.getWidth());
        MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(context);
        this.adWidget = mRAIDAdWidget;
        mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.BannerView.1
            @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
            public void close() {
                BannerView.this.finishAdInternal(false);
            }
        });
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        kj1 kj1Var = kj1.f2953a;
        ui1 D0 = m20.D0(kj1Var, new BannerView$special$$inlined$inject$1(context));
        OMTracker.Factory m21_init_$lambda1 = m21_init_$lambda1(m20.D0(kj1Var, new BannerView$special$$inlined$inject$2(context)));
        if (ConfigManager.INSTANCE.omEnabled() && adPayload.omEnabled()) {
            z = true;
        }
        OMTracker make = m21_init_$lambda1.make(z);
        VungleWebClient vungleWebClient = new VungleWebClient(adPayload, placement, m20_init_$lambda0(D0).getOffloadExecutor());
        vungleWebClient.setWebViewObserver(make);
        MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, adPayload, placement, vungleWebClient, m20_init_$lambda0(D0).getJobExecutor(), make, bidPayload);
        this.presenter = mRAIDPresenter;
        mRAIDPresenter.setEventListener(new AdEventListener(adPlayCallback, placement) { // from class: com.vungle.ads.BannerView.2
        });
        mRAIDPresenter.prepare();
        String watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            this.imageView = new WatermarkView(context, watermark$vungle_ads_release);
        }
    }

    /* renamed from: _init_$lambda-0, reason: not valid java name */
    private static final Executors m20_init_$lambda0(ui1 ui1Var) {
        return (Executors) ui1Var.getValue();
    }

    /* renamed from: _init_$lambda-1, reason: not valid java name */
    private static final OMTracker.Factory m21_init_$lambda1(ui1 ui1Var) {
        return (OMTracker.Factory) ui1Var.getValue();
    }

    private final void renderAd() {
        if (getVisibility() != 0) {
            return;
        }
        if (!m20.L(this.adWidget.getParent(), this)) {
            addView(this.adWidget, this.calculatedPixelWidth, this.calculatedPixelHeight);
            WatermarkView watermarkView = this.imageView;
            if (watermarkView != null) {
                addView(watermarkView, this.calculatedPixelWidth, this.calculatedPixelHeight);
                WatermarkView watermarkView2 = this.imageView;
                if (watermarkView2 != null) {
                    watermarkView2.bringToFront();
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.calculatedPixelHeight;
            layoutParams.width = this.calculatedPixelWidth;
            requestLayout();
        }
    }

    public final void finishAdInternal(boolean z) {
        int i;
        if (this.destroyed.get()) {
            return;
        }
        this.destroyed.set(true);
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        this.presenter.stop();
        this.presenter.detach(i | 2);
        try {
            removeAllViews();
        } catch (Exception e) {
            e.toString();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        renderAd();
    }

    public final void onImpression() {
        this.isOnImpressionCalled = true;
        this.presenter.start();
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        boolean z;
        super.onWindowVisibilityChanged(i);
        if (this.isOnImpressionCalled && !this.destroyed.get()) {
            MRAIDPresenter mRAIDPresenter = this.presenter;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            mRAIDPresenter.setAdVisibility(z);
        }
    }
}
