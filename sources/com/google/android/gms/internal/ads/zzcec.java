package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzcec implements zzbjj {
    @Override // com.google.android.gms.internal.ads.zzbjj
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        float parseFloat;
        zzcdc zzcdcVar = (zzcdc) obj;
        zzcgx zzq = zzcdcVar.zzq();
        if (zzq == null) {
            try {
                zzcgx zzcgxVar = new zzcgx(zzcdcVar, Float.parseFloat((String) map.get("duration")), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzcdcVar.zzC(zzcgxVar);
                zzq = zzcgxVar;
            } catch (NullPointerException e) {
                e = e;
                zzcat.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e2) {
                e = e2;
                zzcat.zzh("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat2 = Float.parseFloat((String) map.get("duration"));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat3 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        if (TextUtils.isEmpty(str)) {
            parseFloat = 0.0f;
        } else {
            parseFloat = Float.parseFloat(str);
        }
        if (zzcat.zzm(3)) {
            zzcat.zze("Video Meta GMSG: currentTime : " + parseFloat3 + " , duration : " + parseFloat2 + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzc(parseFloat3, parseFloat2, parseInt, equals, parseFloat);
    }
}
