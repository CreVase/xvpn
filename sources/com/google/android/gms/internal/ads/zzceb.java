package com.google.android.gms.internal.ads;

import android.content.Context;
import defpackage.p71;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzceb implements zzbjj {
    private boolean zza;

    private static int zzb(Context context, Map map, String str, int i) {
        String str2 = (String) map.get(str);
        if (str2 != null) {
            try {
                com.google.android.gms.ads.internal.client.zzay.zzb();
                i = zzcam.zzx(context, Integer.parseInt(str2));
            } catch (NumberFormatException unused) {
                zzcat.zzj("Could not parse " + str + " in a video GMSG: " + str2);
            }
        }
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder q = p71.q("Parse pixels for ", str, ", got string ", str2, ", int ");
            q.append(i);
            q.append(".");
            com.google.android.gms.ads.internal.util.zze.zza(q.toString());
        }
        return i;
    }

    private static void zzc(zzccq zzccqVar, Map map) {
        String str = (String) map.get("minBufferMs");
        String str2 = (String) map.get("maxBufferMs");
        String str3 = (String) map.get("bufferForPlaybackMs");
        String str4 = (String) map.get("bufferForPlaybackAfterRebufferMs");
        String str5 = (String) map.get("socketReceiveBufferSize");
        if (str != null) {
            try {
                zzccqVar.zzB(Integer.parseInt(str));
            } catch (NumberFormatException unused) {
                zzcat.zzj(String.format("Could not parse buffer parameters in loadControl video GMSG: (%s, %s)", str, str2));
                return;
            }
        }
        if (str2 != null) {
            zzccqVar.zzA(Integer.parseInt(str2));
        }
        if (str3 != null) {
            zzccqVar.zzy(Integer.parseInt(str3));
        }
        if (str4 != null) {
            zzccqVar.zzz(Integer.parseInt(str4));
        }
        if (str5 != null) {
            zzccqVar.zzD(Integer.parseInt(str5));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:149:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzbjj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object r21, java.util.Map r22) {
        /*
            Method dump skipped, instructions count: 1125
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzceb.zza(java.lang.Object, java.util.Map):void");
    }
}
