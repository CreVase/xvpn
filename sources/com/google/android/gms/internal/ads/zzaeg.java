package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
final class zzaeg {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0088, code lost:            r7 = -9223372036854775807L;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzaec zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaeg.zza(java.lang.String):com.google.android.gms.internal.ads.zzaec");
    }

    private static zzfvs zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        long j;
        long j2;
        zzfvp zzfvpVar = new zzfvp();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzfl.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzfl.zza(xmlPullParser, concat2);
                String zza3 = zzfl.zza(xmlPullParser, concat3);
                String zza4 = zzfl.zza(xmlPullParser, concat4);
                String zza5 = zzfl.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    if (zza4 != null) {
                        j = Long.parseLong(zza4);
                    } else {
                        j = 0;
                    }
                    if (zza5 != null) {
                        j2 = Long.parseLong(zza5);
                    } else {
                        j2 = 0;
                    }
                    zzfvpVar.zzf(new zzaeb(zza2, zza3, j, j2));
                } else {
                    return zzfvs.zzl();
                }
            }
        } while (!zzfl.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfvpVar.zzi();
    }
}
