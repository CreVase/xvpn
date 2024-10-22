package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzaye implements zzgud {
    static final zzgud zza = new zzaye();

    private zzaye() {
    }

    @Override // com.google.android.gms.internal.ads.zzgud
    public final boolean zza(int i) {
        zzayf zzayfVar;
        zzayf zzayfVar2 = zzayf.AD_INITIATER_UNSPECIFIED;
        switch (i) {
            case 0:
                zzayfVar = zzayf.AD_INITIATER_UNSPECIFIED;
                break;
            case 1:
                zzayfVar = zzayf.BANNER;
                break;
            case 2:
                zzayfVar = zzayf.DFP_BANNER;
                break;
            case 3:
                zzayfVar = zzayf.INTERSTITIAL;
                break;
            case 4:
                zzayfVar = zzayf.DFP_INTERSTITIAL;
                break;
            case 5:
                zzayfVar = zzayf.NATIVE_EXPRESS;
                break;
            case 6:
                zzayfVar = zzayf.AD_LOADER;
                break;
            case 7:
                zzayfVar = zzayf.REWARD_BASED_VIDEO_AD;
                break;
            case 8:
                zzayfVar = zzayf.BANNER_SEARCH_ADS;
                break;
            case 9:
                zzayfVar = zzayf.GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                break;
            case 10:
                zzayfVar = zzayf.APP_OPEN;
                break;
            case 11:
                zzayfVar = zzayf.REWARDED_INTERSTITIAL;
                break;
            default:
                zzayfVar = null;
                break;
        }
        if (zzayfVar != null) {
            return true;
        }
        return false;
    }
}
