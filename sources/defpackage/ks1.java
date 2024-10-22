package defpackage;

import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public abstract class ks1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3004a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f3005b = new HashMap();
    public static int c = -1;

    public static void a(String str, ArrayList arrayList) {
        int i = 1;
        if ("audio/raw".equals(str)) {
            if (wi3.f5017a < 26 && wi3.f5018b.equals("R9") && arrayList.size() == 1 && ((zr1) arrayList.get(0)).f5535a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                arrayList.add(zr1.h("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false));
            }
            Collections.sort(arrayList, new jw3(new ef0(i), 1));
        }
        int i2 = wi3.f5017a;
        if (i2 < 21 && arrayList.size() > 1) {
            String str2 = ((zr1) arrayList.get(0)).f5535a;
            if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                Collections.sort(arrayList, new jw3(new ef0(2), 1));
            }
        }
        if (i2 < 32 && arrayList.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zr1) arrayList.get(0)).f5535a)) {
            arrayList.add((zr1) arrayList.remove(0));
        }
    }

    public static String b(y01 y01Var) {
        Pair d;
        if ("audio/eac3-joc".equals(y01Var.l)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(y01Var.l) && (d = d(y01Var)) != null) {
            int intValue = ((Integer) d.first).intValue();
            if (intValue != 16 && intValue != 256) {
                if (intValue == 512) {
                    return "video/avc";
                }
                return null;
            }
            return "video/hevc";
        }
        return null;
    }

    public static String c(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0387 A[Catch: NumberFormatException -> 0x0397, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0397, blocks: (B:204:0x0320, B:206:0x0334, B:217:0x0351, B:220:0x0387), top: B:203:0x0320 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0600  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0604  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0209  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair d(defpackage.y01 r18) {
        /*
            Method dump skipped, instructions count: 2438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.d(y01):android.util.Pair");
    }

    public static synchronized List e(String str, boolean z, boolean z2) {
        is1 s71Var;
        synchronized (ks1.class) {
            gs1 gs1Var = new gs1(str, z, z2);
            HashMap hashMap = f3005b;
            List list = (List) hashMap.get(gs1Var);
            if (list != null) {
                return list;
            }
            int i = wi3.f5017a;
            p71 p71Var = null;
            if (i >= 21) {
                s71Var = new q9(z, z2);
            } else {
                s71Var = new s71(p71Var);
            }
            ArrayList f = f(gs1Var, s71Var);
            if (z && f.isEmpty() && 21 <= i && i <= 23) {
                f = f(gs1Var, new s71(p71Var));
                if (!f.isEmpty()) {
                    String str2 = ((zr1) f.get(0)).f5535a;
                    sn1.f();
                }
            }
            a(str, f);
            hb1 l = hb1.l(f);
            hashMap.put(gs1Var, l);
            return l;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032 A[Catch: Exception -> 0x0167, TryCatch #3 {Exception -> 0x0167, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:14:0x0138, B:15:0x0032, B:18:0x003d, B:48:0x0111, B:51:0x0119, B:53:0x011f, B:56:0x0142, B:57:0x0165), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.ArrayList f(defpackage.gs1 r21, defpackage.is1 r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ks1.f(gs1, is1):java.util.ArrayList");
    }

    public static boolean g(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        int i = wi3.f5017a;
        if (i < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (i < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str)) {
            String str3 = wi3.f5018b;
            if ("a70".equals(str3) || ("Xiaomi".equals(wi3.c) && str3.startsWith("HM"))) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.mp3".equals(str)) {
            String str4 = wi3.f5018b;
            if ("dlxu".equals(str4) || "protou".equals(str4) || "ville".equals(str4) || "villeplus".equals(str4) || "villec2".equals(str4) || str4.startsWith("gee") || "C6602".equals(str4) || "C6603".equals(str4) || "C6606".equals(str4) || "C6616".equals(str4) || "L36h".equals(str4) || "SO-02E".equals(str4)) {
                return false;
            }
        }
        if (i == 16 && "OMX.qcom.audio.decoder.aac".equals(str)) {
            String str5 = wi3.f5018b;
            if ("C1504".equals(str5) || "C1505".equals(str5) || "C1604".equals(str5) || "C1605".equals(str5)) {
                return false;
            }
        }
        if (i < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(wi3.c))) {
            String str6 = wi3.f5018b;
            if (str6.startsWith("zeroflte") || str6.startsWith("zerolte") || str6.startsWith("zenlte") || "SC-05G".equals(str6) || "marinelteatt".equals(str6) || "404SC".equals(str6) || "SC-04G".equals(str6) || "SCV31".equals(str6)) {
                return false;
            }
        }
        if (i <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(wi3.c)) {
            String str7 = wi3.f5018b;
            if (str7.startsWith("d2") || str7.startsWith("serrano") || str7.startsWith("jflte") || str7.startsWith("santos") || str7.startsWith("t0")) {
                return false;
            }
        }
        if (i <= 19 && wi3.f5018b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        if (i <= 23 && "audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) {
            return false;
        }
        return true;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (wi3.f5017a >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (vw1.g(str)) {
            return true;
        }
        String m0 = zf3.m0(mediaCodecInfo.getName());
        if (m0.startsWith("arc.")) {
            return false;
        }
        if (m0.startsWith("omx.google.") || m0.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((m0.startsWith("omx.sec.") && m0.contains(".sw.")) || m0.equals("omx.qcom.video.decoder.hevcswvdec") || m0.startsWith("c2.android.") || m0.startsWith("c2.google.")) {
            return true;
        }
        if (!m0.startsWith("omx.") && !m0.startsWith("c2.")) {
            return true;
        }
        return false;
    }

    public static int i() {
        zr1 zr1Var;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i;
        int i2;
        if (c == -1) {
            int i3 = 0;
            List e = e("video/avc", false, false);
            if (e.isEmpty()) {
                zr1Var = null;
            } else {
                zr1Var = (zr1) e.get(0);
            }
            if (zr1Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = zr1Var.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case UserVerificationMethods.USER_VERIFY_HANDPRINT /* 256 */:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case UserVerificationMethods.USER_VERIFY_ALL /* 1024 */:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case v.DEFAULT_BUFFER_SIZE /* 4096 */:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case Http2.INITIAL_MAX_FRAME_SIZE /* 16384 */:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            case 131072:
                            case 262144:
                            case 524288:
                                i2 = 35651584;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                if (wi3.f5017a >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            }
            c = i3;
        }
        return c;
    }
}
