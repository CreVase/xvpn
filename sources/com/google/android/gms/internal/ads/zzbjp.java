package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.CollectionUtils;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjp implements zzbjj {
    static final Map zza = CollectionUtils.mapOfKeyValueArrays(new String[]{"resize", "playVideo", "storePicture", "createCalendarEvent", MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "closeResizedAd", "unload"}, new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private final com.google.android.gms.ads.internal.zzb zzb;
    private final zzbrs zzc;
    private final zzbrz zzd;

    public zzbjp(com.google.android.gms.ads.internal.zzb zzbVar, zzbrs zzbrsVar, zzbrz zzbrzVar) {
        this.zzb = zzbVar;
        this.zzc = zzbrsVar;
        this.zzd = zzbrzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzcgb zzcgbVar = (zzcgb) obj;
        int intValue = ((Integer) zza.get((String) map.get("a"))).intValue();
        int i = 6;
        boolean z = true;
        if (intValue != 5) {
            if (intValue != 7) {
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzb;
                if (zzbVar.zzc()) {
                    if (intValue != 1) {
                        if (intValue != 3) {
                            if (intValue != 4) {
                                if (intValue != 5) {
                                    if (intValue != 6) {
                                        if (intValue != 7) {
                                            zzcat.zzi("Unknown MRAID command called.");
                                            return;
                                        }
                                    } else {
                                        this.zzc.zza(true);
                                        return;
                                    }
                                }
                            } else {
                                new zzbrq(zzcgbVar, map).zzc();
                                return;
                            }
                        } else {
                            new zzbrv(zzcgbVar, map).zzb();
                            return;
                        }
                    } else {
                        this.zzc.zzb(map);
                        return;
                    }
                } else {
                    zzbVar.zzb(null);
                    return;
                }
            }
            this.zzd.zzc();
            return;
        }
        String str = (String) map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange")) {
            z = Boolean.parseBoolean((String) map.get("allowOrientationChange"));
        }
        if (zzcgbVar == null) {
            zzcat.zzj("AdWebView is null");
            return;
        }
        if ("portrait".equalsIgnoreCase(str)) {
            i = 7;
        } else if (!"landscape".equalsIgnoreCase(str)) {
            if (z) {
                i = -1;
            } else {
                i = 14;
            }
        }
        zzcgbVar.zzaq(i);
    }
}
