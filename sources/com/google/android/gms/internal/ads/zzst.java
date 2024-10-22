package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;
import okhttp3.internal.http2.Http2;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public final class zzst {
    public static final /* synthetic */ int zza = 0;
    private static final Pattern zzb = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap zzc = new HashMap();
    private static int zzd = -1;

    public static int zza() throws zzsn {
        int i;
        int i2;
        int i3 = zzd;
        if (i3 == -1) {
            zzrz zzc2 = zzc("video/avc", false, false);
            if (zzc2 != null) {
                int i4 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : zzc2.zzh()) {
                    int i5 = codecProfileLevel.level;
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
                }
                if (zzfk.zza >= 21) {
                    i = 345600;
                } else {
                    i = 172800;
                }
                i3 = Math.max(i4, i);
            } else {
                i3 = 0;
            }
            zzd = i3;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cf A[Catch: NumberFormatException -> 0x02de, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x02de, blocks: (B:125:0x026a, B:127:0x027c, B:138:0x0298, B:141:0x02cf), top: B:124:0x026a }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.util.Pair zzb(com.google.android.gms.internal.ads.zzam r15) {
        /*
            Method dump skipped, instructions count: 2462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzb(com.google.android.gms.internal.ads.zzam):android.util.Pair");
    }

    public static zzrz zzc(String str, boolean z, boolean z2) throws zzsn {
        List zzg = zzg(str, false, false);
        if (zzg.isEmpty()) {
            return null;
        }
        return (zzrz) zzg.get(0);
    }

    public static zzrz zzd() throws zzsn {
        return zzc("audio/raw", false, false);
    }

    public static String zze(zzam zzamVar) {
        Pair zzb2;
        if ("audio/eac3-joc".equals(zzamVar.zzm)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(zzamVar.zzm) && (zzb2 = zzb(zzamVar)) != null) {
            int intValue = ((Integer) zzb2.first).intValue();
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

    public static List zzf(zzsg zzsgVar, zzam zzamVar, boolean z, boolean z2) throws zzsn {
        String zze = zze(zzamVar);
        if (zze == null) {
            return zzfvs.zzl();
        }
        return zzg(zze, z, z2);
    }

    public static synchronized List zzg(String str, boolean z, boolean z2) throws zzsn {
        zzso zzsqVar;
        synchronized (zzst.class) {
            zzsl zzslVar = new zzsl(str, z, z2);
            HashMap hashMap = zzc;
            List list = (List) hashMap.get(zzslVar);
            if (list != null) {
                return list;
            }
            int i = zzfk.zza;
            if (i >= 21) {
                zzsqVar = new zzsr(z, z2);
            } else {
                zzsqVar = new zzsq(null);
            }
            ArrayList zzj = zzj(zzslVar, zzsqVar);
            if (z && zzj.isEmpty() && i >= 21 && i <= 23) {
                zzj = zzj(zzslVar, new zzsq(null));
                if (!zzj.isEmpty()) {
                    zzer.zzf("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + ((zzrz) zzj.get(0)).zza);
                }
            }
            if ("audio/raw".equals(str)) {
                if (i < 26 && zzfk.zzb.equals("R9") && zzj.size() == 1 && ((zzrz) zzj.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzj.add(zzrz.zzc("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzk(zzj, new zzss() { // from class: com.google.android.gms.internal.ads.zzsi
                    @Override // com.google.android.gms.internal.ads.zzss
                    public final int zza(Object obj) {
                        int i2 = zzst.zza;
                        String str2 = ((zzrz) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        if (zzfk.zza >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                            return 0;
                        }
                        return -1;
                    }
                });
            }
            if (i < 21 && zzj.size() > 1) {
                String str2 = ((zzrz) zzj.get(0)).zza;
                if ("OMX.SEC.mp3.dec".equals(str2) || "OMX.SEC.MP3.Decoder".equals(str2) || "OMX.brcm.audio.mp3.decoder".equals(str2)) {
                    zzk(zzj, new zzss() { // from class: com.google.android.gms.internal.ads.zzsj
                        @Override // com.google.android.gms.internal.ads.zzss
                        public final int zza(Object obj) {
                            int i2 = zzst.zza;
                            if (((zzrz) obj).zza.startsWith("OMX.google")) {
                                return 1;
                            }
                            return 0;
                        }
                    });
                }
            }
            if (i < 32 && zzj.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzrz) zzj.get(0)).zza)) {
                zzj.add((zzrz) zzj.remove(0));
            }
            zzfvs zzj2 = zzfvs.zzj(zzj);
            hashMap.put(zzslVar, zzj2);
            return zzj2;
        }
    }

    public static List zzh(zzsg zzsgVar, zzam zzamVar, boolean z, boolean z2) throws zzsn {
        List zzg = zzg(zzamVar.zzm, z, z2);
        List zzf = zzf(zzsgVar, zzamVar, z, z2);
        zzfvp zzfvpVar = new zzfvp();
        zzfvpVar.zzh(zzg);
        zzfvpVar.zzh(zzf);
        return zzfvpVar.zzi();
    }

    public static List zzi(List list, final zzam zzamVar) {
        ArrayList arrayList = new ArrayList(list);
        zzk(arrayList, new zzss() { // from class: com.google.android.gms.internal.ads.zzsk
            @Override // com.google.android.gms.internal.ads.zzss
            public final int zza(Object obj) {
                int i = zzst.zza;
                if (((zzrz) obj).zzd(zzam.this)) {
                    return 1;
                }
                return 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x0233, code lost:            if (r1.zzb == false) goto L151;     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00da, code lost:            if ("SCV31".equals(r10) == false) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0118, code lost:            if (r8.startsWith("t0") == false) goto L70;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002a, code lost:            if (r9 != false) goto L9;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e7 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:92:0x01b6, B:96:0x01cd, B:100:0x01e1, B:102:0x01e7, B:103:0x01f9, B:105:0x0201, B:107:0x022b, B:156:0x0206, B:158:0x0216, B:160:0x021e, B:164:0x01ee), top: B:91:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0201 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:92:0x01b6, B:96:0x01cd, B:100:0x01e1, B:102:0x01e7, B:103:0x01f9, B:105:0x0201, B:107:0x022b, B:156:0x0206, B:158:0x0216, B:160:0x021e, B:164:0x01ee), top: B:91:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02b1 A[Catch: Exception -> 0x0300, TRY_ENTER, TryCatch #0 {Exception -> 0x0300, blocks: (B:3:0x0008, B:5:0x001c, B:7:0x0026, B:12:0x0034, B:16:0x0042, B:20:0x004c, B:22:0x0054, B:24:0x005c, B:26:0x0064, B:28:0x006c, B:30:0x0074, B:34:0x0082, B:36:0x008a, B:38:0x0092, B:40:0x009a, B:42:0x00a4, B:44:0x00ac, B:46:0x00b4, B:48:0x00bc, B:50:0x00c4, B:52:0x00cc, B:54:0x00d4, B:58:0x00e2, B:60:0x00ea, B:62:0x00f2, B:64:0x00fc, B:66:0x0104, B:68:0x010a, B:70:0x0112, B:73:0x011c, B:75:0x0124, B:79:0x0130, B:81:0x0138, B:83:0x0140, B:85:0x0148, B:117:0x02a9, B:120:0x02b1, B:122:0x02b7, B:125:0x02d1, B:126:0x02f4, B:87:0x0151, B:176:0x0154, B:178:0x015c, B:181:0x0167, B:183:0x016f, B:187:0x017a, B:189:0x0182, B:192:0x018d, B:194:0x0195, B:197:0x01a0, B:199:0x01a8), top: B:2:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d1 A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0206 A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:92:0x01b6, B:96:0x01cd, B:100:0x01e1, B:102:0x01e7, B:103:0x01f9, B:105:0x0201, B:107:0x022b, B:156:0x0206, B:158:0x0216, B:160:0x021e, B:164:0x01ee), top: B:91:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01ee A[Catch: Exception -> 0x029f, TryCatch #1 {Exception -> 0x029f, blocks: (B:92:0x01b6, B:96:0x01cd, B:100:0x01e1, B:102:0x01e7, B:103:0x01f9, B:105:0x0201, B:107:0x022b, B:156:0x0206, B:158:0x0216, B:160:0x021e, B:164:0x01ee), top: B:91:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.ArrayList zzj(com.google.android.gms.internal.ads.zzsl r27, com.google.android.gms.internal.ads.zzso r28) throws com.google.android.gms.internal.ads.zzsn {
        /*
            Method dump skipped, instructions count: 776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzst.zzj(com.google.android.gms.internal.ads.zzsl, com.google.android.gms.internal.ads.zzso):java.util.ArrayList");
    }

    private static void zzk(List list, final zzss zzssVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzsh
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzst.zza;
                zzss zzssVar2 = zzss.this;
                return zzssVar2.zza(obj2) - zzssVar2.zza(obj);
            }
        });
    }

    private static boolean zzl(MediaCodecInfo mediaCodecInfo, String str) {
        boolean isSoftwareOnly;
        if (zzfk.zza >= 29) {
            isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
            return isSoftwareOnly;
        }
        if (zzcb.zzf(str)) {
            return true;
        }
        String zza2 = zzfsc.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.")) {
            return true;
        }
        if ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google.")) {
            return true;
        }
        if (!zza2.startsWith("omx.") && !zza2.startsWith("c2.")) {
            return true;
        }
        return false;
    }
}
