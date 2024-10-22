package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.v;
import defpackage.hx2;
import defpackage.p71;
import okhttp3.internal.http2.Http2;

/* loaded from: classes.dex */
public final class zzrz {
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final MediaCodecInfo.CodecCapabilities zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    private final boolean zzh;

    public zzrz(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = codecCapabilities;
        this.zzg = z;
        this.zze = z4;
        this.zzf = z6;
        this.zzh = zzcb.zzg(str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:            if ("Nexus 10".equals(r3) == false) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:            if ("OMX.Exynos.AVC.Decoder.secure".equals(r12) == false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.internal.ads.zzrz zzc(java.lang.String r12, java.lang.String r13, java.lang.String r14, android.media.MediaCodecInfo.CodecCapabilities r15, boolean r16, boolean r17, boolean r18, boolean r19, boolean r20) {
        /*
            r1 = r12
            r4 = r15
            com.google.android.gms.internal.ads.zzrz r11 = new com.google.android.gms.internal.ads.zzrz
            r0 = 1
            r2 = 0
            if (r4 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            java.lang.String r3 = "adaptive-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L3d
            int r3 = com.google.android.gms.internal.ads.zzfk.zza
            r5 = 22
            if (r3 > r5) goto L3b
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfk.zzd
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r5.equals(r3)
            if (r5 != 0) goto L2a
            java.lang.String r5 = "Nexus 10"
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L3b
        L2a:
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L3d
            java.lang.String r3 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L3b
            goto L3d
        L3b:
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            r3 = 21
            if (r4 == 0) goto L50
            int r5 = com.google.android.gms.internal.ads.zzfk.zza
            if (r5 < r3) goto L50
            java.lang.String r5 = "tunneled-playback"
            boolean r5 = r15.isFeatureSupported(r5)
            if (r5 == 0) goto L50
            r9 = 1
            goto L51
        L50:
            r9 = 0
        L51:
            if (r20 != 0) goto L64
            if (r4 == 0) goto L62
            int r5 = com.google.android.gms.internal.ads.zzfk.zza
            if (r5 < r3) goto L62
            java.lang.String r3 = "secure-playback"
            boolean r3 = r15.isFeatureSupported(r3)
            if (r3 == 0) goto L62
            goto L64
        L62:
            r10 = 0
            goto L65
        L64:
            r10 = 1
        L65:
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrz.zzc(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean, boolean):com.google.android.gms.internal.ads.zzrz");
    }

    private static Point zzi(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = zzfk.zza;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    private final void zzj(String str) {
        String str2 = zzfk.zze;
        StringBuilder u = hx2.u("NoSupport [", str, "] [");
        u.append(this.zza);
        u.append(", ");
        u.append(this.zzb);
        u.append("] [");
        u.append(str2);
        u.append("]");
        zzer.zzb("MediaCodecInfo", u.toString());
    }

    private static boolean zzk(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point zzi = zzi(videoCapabilities, i, i2);
        int i3 = zzi.x;
        int i4 = zzi.y;
        if (d != -1.0d && d >= 1.0d) {
            return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
        }
        return videoCapabilities.isSizeSupported(i3, i4);
    }

    private final boolean zzl(zzam zzamVar, boolean z) {
        int i;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Pair zzb = zzst.zzb(zzamVar);
        if (zzb == null) {
            return true;
        }
        int intValue = ((Integer) zzb.first).intValue();
        int intValue2 = ((Integer) zzb.second).intValue();
        int i2 = 8;
        if ("video/dolby-vision".equals(zzamVar.zzm)) {
            if ("video/avc".equals(this.zzb)) {
                intValue2 = 0;
                intValue = 8;
            } else if ("video/hevc".equals(this.zzb)) {
                intValue2 = 0;
                intValue = 2;
            }
        }
        if (!this.zzh && intValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] zzh = zzh();
        if (zzfk.zza <= 23 && "video/x-vnd.on2.vp9".equals(this.zzb) && zzh.length == 0) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
            if (codecCapabilities != null && (videoCapabilities = codecCapabilities.getVideoCapabilities()) != null) {
                i = videoCapabilities.getBitrateRange().getUpper().intValue();
            } else {
                i = 0;
            }
            if (i >= 180000000) {
                i2 = UserVerificationMethods.USER_VERIFY_ALL;
            } else if (i >= 120000000) {
                i2 = 512;
            } else if (i >= 60000000) {
                i2 = UserVerificationMethods.USER_VERIFY_HANDPRINT;
            } else if (i >= 30000000) {
                i2 = 128;
            } else if (i >= 18000000) {
                i2 = 64;
            } else if (i >= 12000000) {
                i2 = 32;
            } else if (i >= 7200000) {
                i2 = 16;
            } else if (i < 3600000) {
                if (i >= 1800000) {
                    i2 = 4;
                } else if (i >= 800000) {
                    i2 = 2;
                } else {
                    i2 = 1;
                }
            }
            MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
            codecProfileLevel.profile = 1;
            codecProfileLevel.level = i2;
            zzh = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : zzh) {
            if (codecProfileLevel2.profile == intValue && (codecProfileLevel2.level >= intValue2 || !z)) {
                if ("video/hevc".equals(this.zzb) && intValue == 2) {
                    String str = zzfk.zzb;
                    if (!"sailfish".equals(str) && !"marlin".equals(str)) {
                    }
                }
                return true;
            }
        }
        zzj("codec.profileLevel, " + zzamVar.zzj + ", " + this.zzc);
        return false;
    }

    private final boolean zzm(zzam zzamVar) {
        if (!this.zzb.equals(zzamVar.zzm) && !this.zzb.equals(zzst.zze(zzamVar))) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return this.zza;
    }

    public final Point zza(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return zzi(videoCapabilities, i, i2);
    }

    public final zzie zzb(zzam zzamVar, zzam zzamVar2) {
        int i;
        int i2;
        if (true != zzfk.zzE(zzamVar.zzm, zzamVar2.zzm)) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.zzh) {
            if (zzamVar.zzu != zzamVar2.zzu) {
                i |= UserVerificationMethods.USER_VERIFY_ALL;
            }
            if (!this.zze && (zzamVar.zzr != zzamVar2.zzr || zzamVar.zzs != zzamVar2.zzs)) {
                i |= 512;
            }
            if (!zzfk.zzE(zzamVar.zzy, zzamVar2.zzy)) {
                i |= 2048;
            }
            String str = this.zza;
            if (zzfk.zzd.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str) && !zzamVar.zzd(zzamVar2)) {
                i |= 2;
            }
            if (i == 0) {
                String str2 = this.zza;
                if (true != zzamVar.zzd(zzamVar2)) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                return new zzie(str2, zzamVar, zzamVar2, i2, 0);
            }
        } else {
            if (zzamVar.zzz != zzamVar2.zzz) {
                i |= v.DEFAULT_BUFFER_SIZE;
            }
            if (zzamVar.zzA != zzamVar2.zzA) {
                i |= 8192;
            }
            if (zzamVar.zzB != zzamVar2.zzB) {
                i |= Http2.INITIAL_MAX_FRAME_SIZE;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.zzb)) {
                Pair zzb = zzst.zzb(zzamVar);
                Pair zzb2 = zzst.zzb(zzamVar2);
                if (zzb != null && zzb2 != null) {
                    int intValue = ((Integer) zzb.first).intValue();
                    int intValue2 = ((Integer) zzb2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new zzie(this.zza, zzamVar, zzamVar2, 3, 0);
                    }
                }
            }
            if (!zzamVar.zzd(zzamVar2)) {
                i |= 32;
            }
            if ("audio/opus".equals(this.zzb)) {
                i |= 2;
            }
            if (i == 0) {
                return new zzie(this.zza, zzamVar, zzamVar2, 1, 0);
            }
        }
        return new zzie(this.zza, zzamVar, zzamVar2, 0, i);
    }

    public final boolean zzd(zzam zzamVar) {
        if (!zzm(zzamVar) || !zzl(zzamVar, false)) {
            return false;
        }
        return true;
    }

    public final boolean zze(zzam zzamVar) throws zzsn {
        int i;
        int i2;
        boolean z = false;
        if (!zzm(zzamVar) || !zzl(zzamVar, true)) {
            return false;
        }
        if (this.zzh) {
            int i3 = zzamVar.zzr;
            if (i3 <= 0 || (i2 = zzamVar.zzs) <= 0) {
                return true;
            }
            if (zzfk.zza >= 21) {
                return zzg(i3, i2, zzamVar.zzt);
            }
            if (i3 * i2 <= zzst.zza()) {
                z = true;
            }
            if (!z) {
                zzj(hx2.n("legacyFrameSize, ", zzamVar.zzr, "x", zzamVar.zzs));
            }
            return z;
        }
        int i4 = zzfk.zza;
        if (i4 >= 21) {
            int i5 = zzamVar.zzA;
            if (i5 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
                if (codecCapabilities == null) {
                    zzj("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    zzj("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i5)) {
                    zzj(hx2.m("sampleRate.support, ", i5));
                    return false;
                }
            }
            int i6 = zzamVar.zzz;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.zzd;
                if (codecCapabilities2 == null) {
                    zzj("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        zzj("channelCount.aCaps");
                    } else {
                        String str = this.zza;
                        String str2 = this.zzb;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i4 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str2) && !"audio/3gpp".equals(str2) && !"audio/amr-wb".equals(str2) && !"audio/mp4a-latm".equals(str2) && !"audio/vorbis".equals(str2) && !"audio/opus".equals(str2) && !"audio/raw".equals(str2) && !"audio/flac".equals(str2) && !"audio/g711-alaw".equals(str2) && !"audio/g711-mlaw".equals(str2) && !"audio/gsm".equals(str2))) {
                            if ("audio/ac3".equals(str2)) {
                                i = 6;
                            } else if ("audio/eac3".equals(str2)) {
                                i = 16;
                            } else {
                                i = 30;
                            }
                            zzer.zzf("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + maxInputChannelCount + " to " + i + "]");
                            maxInputChannelCount = i;
                        }
                        if (maxInputChannelCount < i6) {
                            zzj(hx2.m("channelCount.support, ", i6));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean zzf(zzam zzamVar) {
        if (this.zzh) {
            return this.zze;
        }
        Pair zzb = zzst.zzb(zzamVar);
        if (zzb != null && ((Integer) zzb.first).intValue() == 42) {
            return true;
        }
        return false;
    }

    public final boolean zzg(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null) {
            zzj("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            zzj("sizeAndRate.vCaps");
            return false;
        }
        if (zzfk.zza >= 29) {
            int zza = zzry.zza(videoCapabilities, i, i2, d);
            if (zza == 2) {
                return true;
            }
            if (zza == 1) {
                StringBuilder t = hx2.t("sizeAndRate.cover, ", i, "x", i2, "@");
                t.append(d);
                zzj(t.toString());
                return false;
            }
        }
        if (!zzk(videoCapabilities, i, i2, d)) {
            if (i < i2 && ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(this.zza) || !"mcv5a".equals(zzfk.zzb)) && zzk(videoCapabilities, i2, i, d))) {
                StringBuilder t2 = hx2.t("sizeAndRate.rotated, ", i, "x", i2, "@");
                t2.append(d);
                String sb = t2.toString();
                String str = this.zza;
                String str2 = this.zzb;
                String str3 = zzfk.zze;
                StringBuilder q = p71.q("AssumedSupport [", sb, "] [", str, ", ");
                q.append(str2);
                q.append("] [");
                q.append(str3);
                q.append("]");
                zzer.zzb("MediaCodecInfo", q.toString());
            } else {
                StringBuilder t3 = hx2.t("sizeAndRate.support, ", i, "x", i2, "@");
                t3.append(d);
                zzj(t3.toString());
                return false;
            }
        }
        return true;
    }

    public final MediaCodecInfo.CodecProfileLevel[] zzh() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.zzd;
        if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
            return new MediaCodecInfo.CodecProfileLevel[0];
        }
        return codecProfileLevelArr;
    }
}
