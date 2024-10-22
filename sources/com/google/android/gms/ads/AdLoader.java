package com.google.android.gms.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.NativeCustomTemplateAd;
import com.google.android.gms.ads.formats.OnAdManagerAdViewLoadedListener;
import com.google.android.gms.ads.formats.UnifiedNativeAd;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzbq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzeu;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeCustomFormatAd;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzbdz;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbht;
import com.google.android.gms.internal.ads.zzbhv;
import com.google.android.gms.internal.ads.zzbhw;
import com.google.android.gms.internal.ads.zzbou;
import com.google.android.gms.internal.ads.zzbsi;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzcai;
import com.google.android.gms.internal.ads.zzcat;

/* loaded from: classes.dex */
public class AdLoader {
    private final zzp zza;
    private final Context zzb;
    private final zzbn zzc;

    public AdLoader(Context context, zzbn zzbnVar, zzp zzpVar) {
        this.zzb = context;
        this.zzc = zzbnVar;
        this.zza = zzpVar;
    }

    private final void zzb(final zzdx zzdxVar) {
        zzbci.zza(this.zzb);
        if (((Boolean) zzbdz.zzc.zze()).booleanValue()) {
            if (((Boolean) zzba.zzc().zzb(zzbci.zzkm)).booleanValue()) {
                zzcai.zzb.execute(new Runnable() { // from class: com.google.android.gms.ads.zza
                    @Override // java.lang.Runnable
                    public final void run() {
                        AdLoader.this.zza(zzdxVar);
                    }
                });
                return;
            }
        }
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e) {
            zzcat.zzh("Failed to load ad.", e);
        }
    }

    public boolean isLoading() {
        try {
            return this.zzc.zzi();
        } catch (RemoteException e) {
            zzcat.zzk("Failed to check if ad is loading.", e);
            return false;
        }
    }

    public void loadAd(AdRequest adRequest) {
        zzb(adRequest.zza);
    }

    public void loadAds(AdRequest adRequest, int i) {
        try {
            this.zzc.zzh(this.zza.zza(this.zzb, adRequest.zza), i);
        } catch (RemoteException e) {
            zzcat.zzh("Failed to load ads.", e);
        }
    }

    public final /* synthetic */ void zza(zzdx zzdxVar) {
        try {
            this.zzc.zzg(this.zza.zza(this.zzb, zzdxVar));
        } catch (RemoteException e) {
            zzcat.zzh("Failed to load ad.", e);
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private final Context zza;
        private final zzbq zzb;

        public Builder(Context context, String str) {
            Context context2 = (Context) Preconditions.checkNotNull(context, "context cannot be null");
            zzbq zzc = zzay.zza().zzc(context, str, new zzbou());
            this.zza = context2;
            this.zzb = zzc;
        }

        public AdLoader build() {
            try {
                return new AdLoader(this.zza, this.zzb.zze(), zzp.zza);
            } catch (RemoteException e) {
                zzcat.zzh("Failed to build AdLoader.", e);
                return new AdLoader(this.zza, new zzeu().zzc(), zzp.zza);
            }
        }

        public Builder forAdManagerAdView(OnAdManagerAdViewLoadedListener onAdManagerAdViewLoadedListener, AdSize... adSizeArr) {
            if (adSizeArr != null && adSizeArr.length > 0) {
                try {
                    this.zzb.zzj(new zzbhv(onAdManagerAdViewLoadedListener), new zzq(this.zza, adSizeArr));
                } catch (RemoteException e) {
                    zzcat.zzk("Failed to add Google Ad Manager banner ad listener", e);
                }
                return this;
            }
            throw new IllegalArgumentException("The supported ad sizes must contain at least one valid ad size.");
        }

        public Builder forCustomFormatAd(String str, NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
            zzbsi zzbsiVar = new zzbsi(onCustomFormatAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbsiVar.zzb(), zzbsiVar.zza());
            } catch (RemoteException e) {
                zzcat.zzk("Failed to add custom format ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forCustomTemplateAd(String str, NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
            zzbht zzbhtVar = new zzbht(onCustomTemplateAdLoadedListener, onCustomClickListener);
            try {
                this.zzb.zzh(str, zzbhtVar.zze(), zzbhtVar.zzd());
            } catch (RemoteException e) {
                zzcat.zzk("Failed to add custom template ad listener", e);
            }
            return this;
        }

        public Builder forNativeAd(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbsk(onNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcat.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        @Deprecated
        public Builder forUnifiedNativeAd(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
            try {
                this.zzb.zzk(new zzbhw(onUnifiedNativeAdLoadedListener));
            } catch (RemoteException e) {
                zzcat.zzk("Failed to add google native ad listener", e);
            }
            return this;
        }

        public Builder withAdListener(AdListener adListener) {
            try {
                this.zzb.zzl(new com.google.android.gms.ads.internal.client.zzg(adListener));
            } catch (RemoteException e) {
                zzcat.zzk("Failed to set AdListener.", e);
            }
            return this;
        }

        public Builder withAdManagerAdViewOptions(AdManagerAdViewOptions adManagerAdViewOptions) {
            try {
                this.zzb.zzm(adManagerAdViewOptions);
            } catch (RemoteException e) {
                zzcat.zzk("Failed to specify Ad Manager banner ad options", e);
            }
            return this;
        }

        @Deprecated
        public Builder withNativeAdOptions(NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfc(nativeAdOptions));
            } catch (RemoteException e) {
                zzcat.zzk("Failed to specify native ad options", e);
            }
            return this;
        }

        public Builder withNativeAdOptions(com.google.android.gms.ads.nativead.NativeAdOptions nativeAdOptions) {
            try {
                this.zzb.zzo(new zzbfc(4, nativeAdOptions.shouldReturnUrlsForImageAssets(), -1, nativeAdOptions.shouldRequestMultipleImages(), nativeAdOptions.getAdChoicesPlacement(), nativeAdOptions.getVideoOptions() != null ? new zzfl(nativeAdOptions.getVideoOptions()) : null, nativeAdOptions.zzc(), nativeAdOptions.getMediaAspectRatio(), nativeAdOptions.zza(), nativeAdOptions.zzb()));
            } catch (RemoteException e) {
                zzcat.zzk("Failed to specify native ad options", e);
            }
            return this;
        }
    }

    public void loadAd(AdManagerAdRequest adManagerAdRequest) {
        zzb(adManagerAdRequest.zza);
    }
}
