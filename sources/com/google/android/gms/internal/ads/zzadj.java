package com.google.android.gms.internal.ads;

import defpackage.p71;

/* loaded from: classes.dex */
final class zzadj implements zzadb {
    public final zzfvs zza;
    private final int zzb;

    private zzadj(int i, zzfvs zzfvsVar) {
        this.zzb = i;
        this.zza = zzfvsVar;
    }

    public static zzadj zzc(int i, zzfb zzfbVar) {
        zzadb zzadbVar;
        String str;
        String str2;
        zzfvp zzfvpVar = new zzfvp();
        int zzd = zzfbVar.zzd();
        int i2 = -2;
        while (zzfbVar.zza() > 8) {
            int zzh = zzfbVar.zzh();
            int zzc = zzfbVar.zzc() + zzfbVar.zzh();
            zzfbVar.zzF(zzc);
            if (zzh == 1414744396) {
                zzadbVar = zzc(zzfbVar.zzh(), zzfbVar);
            } else {
                zzadk zzadkVar = null;
                switch (zzh) {
                    case 1718776947:
                        if (i2 == 2) {
                            zzfbVar.zzH(4);
                            int zzh2 = zzfbVar.zzh();
                            int zzh3 = zzfbVar.zzh();
                            zzfbVar.zzH(4);
                            int zzh4 = zzfbVar.zzh();
                            switch (zzh4) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 == null) {
                                p71.y("Ignoring track with unsupported compression ", zzh4, "StreamFormatChunk");
                                break;
                            } else {
                                zzak zzakVar = new zzak();
                                zzakVar.zzab(zzh2);
                                zzakVar.zzH(zzh3);
                                zzakVar.zzU(str2);
                                zzadkVar = new zzadk(zzakVar.zzac());
                                break;
                            }
                        } else if (i2 == 1) {
                            int zzj = zzfbVar.zzj();
                            if (zzj == 1) {
                                str = "audio/raw";
                            } else if (zzj != 85) {
                                if (zzj == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (zzj != 8192) {
                                    if (zzj != 8193) {
                                        str = null;
                                    } else {
                                        str = "audio/vnd.dts";
                                    }
                                } else {
                                    str = "audio/ac3";
                                }
                            } else {
                                str = "audio/mpeg";
                            }
                            if (str == null) {
                                p71.y("Ignoring track with unsupported format tag ", zzj, "StreamFormatChunk");
                                break;
                            } else {
                                int zzj2 = zzfbVar.zzj();
                                int zzh5 = zzfbVar.zzh();
                                zzfbVar.zzH(6);
                                int zzk = zzfk.zzk(zzfbVar.zzp());
                                int zzj3 = zzfbVar.zzj();
                                byte[] bArr = new byte[zzj3];
                                zzfbVar.zzC(bArr, 0, zzj3);
                                zzak zzakVar2 = new zzak();
                                zzakVar2.zzU(str);
                                zzakVar2.zzy(zzj2);
                                zzakVar2.zzV(zzh5);
                                if ("audio/raw".equals(str) && zzk != 0) {
                                    zzakVar2.zzP(zzk);
                                }
                                if ("audio/mp4a-latm".equals(str) && zzj3 > 0) {
                                    zzakVar2.zzK(zzfvs.zzm(bArr));
                                }
                                zzadbVar = new zzadk(zzakVar2.zzac());
                                break;
                            }
                        } else {
                            zzer.zzf("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzfk.zzA(i2)));
                            break;
                        }
                    case 1751742049:
                        zzadbVar = zzadg.zzb(zzfbVar);
                        break;
                    case 1752331379:
                        zzadbVar = zzadh.zzb(zzfbVar);
                        break;
                    case 1852994675:
                        zzadbVar = zzadl.zzb(zzfbVar);
                        break;
                }
                zzadbVar = zzadkVar;
            }
            if (zzadbVar != null) {
                if (zzadbVar.zza() == 1752331379) {
                    int i3 = ((zzadh) zzadbVar).zza;
                    if (i3 != 1935960438) {
                        if (i3 != 1935963489) {
                            if (i3 != 1937012852) {
                                zzer.zzf("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                                i2 = -1;
                            } else {
                                i2 = 3;
                            }
                        } else {
                            i2 = 1;
                        }
                    } else {
                        i2 = 2;
                    }
                }
                zzfvpVar.zzf(zzadbVar);
            }
            zzfbVar.zzG(zzc);
            zzfbVar.zzF(zzd);
        }
        return new zzadj(i, zzfvpVar.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzadb
    public final int zza() {
        return this.zzb;
    }

    public final zzadb zzb(Class cls) {
        zzfvs zzfvsVar = this.zza;
        int size = zzfvsVar.size();
        int i = 0;
        while (i < size) {
            zzadb zzadbVar = (zzadb) zzfvsVar.get(i);
            i++;
            if (zzadbVar.getClass() == cls) {
                return zzadbVar;
            }
        }
        return null;
    }
}
