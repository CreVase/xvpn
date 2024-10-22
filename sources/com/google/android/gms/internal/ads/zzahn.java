package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzahn {
    static final String[] zza = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};
    public static final /* synthetic */ int zzb = 0;

    public static zzbx zza(zzfb zzfbVar) {
        String str;
        String str2;
        int zzf = zzfbVar.zzf() + zzfbVar.zzc();
        int zzf2 = zzfbVar.zzf();
        int i = (zzf2 >> 24) & 255;
        zzbx zzbxVar = null;
        try {
            if (i != 169 && i != 253) {
                if (zzf2 == 1735291493) {
                    int zzb2 = zzb(zzfbVar);
                    if (zzb2 > 0 && zzb2 <= 192) {
                        str2 = zza[zzb2 - 1];
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        zzbxVar = new zzafp("TCON", null, zzfvs.zzm(str2));
                    } else {
                        zzer.zzf("MetadataUtil", "Failed to parse standard genre code");
                    }
                    return zzbxVar;
                }
                if (zzf2 == 1684632427) {
                    return zzd(1684632427, "TPOS", zzfbVar);
                }
                if (zzf2 == 1953655662) {
                    return zzd(1953655662, "TRCK", zzfbVar);
                }
                if (zzf2 == 1953329263) {
                    return zzc(1953329263, "TBPM", zzfbVar, true, false);
                }
                if (zzf2 == 1668311404) {
                    return zzc(1668311404, "TCMP", zzfbVar, true, true);
                }
                if (zzf2 == 1668249202) {
                    int zzf3 = zzfbVar.zzf();
                    if (zzfbVar.zzf() == 1684108385) {
                        int zzf4 = zzfbVar.zzf() & 16777215;
                        if (zzf4 == 13) {
                            str = "image/jpeg";
                        } else if (zzf4 == 14) {
                            str = "image/png";
                            zzf4 = 14;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            zzer.zzf("MetadataUtil", "Unrecognized cover art flags: " + zzf4);
                        } else {
                            zzfbVar.zzH(4);
                            int i2 = zzf3 - 16;
                            byte[] bArr = new byte[i2];
                            zzfbVar.zzC(bArr, 0, i2);
                            zzbxVar = new zzaes(str, null, 3, bArr);
                        }
                    } else {
                        zzer.zzf("MetadataUtil", "Failed to parse cover art attribute");
                    }
                    return zzbxVar;
                }
                if (zzf2 == 1631670868) {
                    return zze(1631670868, "TPE2", zzfbVar);
                }
                if (zzf2 == 1936682605) {
                    return zze(1936682605, "TSOT", zzfbVar);
                }
                if (zzf2 == 1936679276) {
                    return zze(1936679276, "TSO2", zzfbVar);
                }
                if (zzf2 == 1936679282) {
                    return zze(1936679282, "TSOA", zzfbVar);
                }
                if (zzf2 == 1936679265) {
                    return zze(1936679265, "TSOP", zzfbVar);
                }
                if (zzf2 == 1936679791) {
                    return zze(1936679791, "TSOC", zzfbVar);
                }
                if (zzf2 == 1920233063) {
                    return zzc(1920233063, "ITUNESADVISORY", zzfbVar, false, false);
                }
                if (zzf2 == 1885823344) {
                    return zzc(1885823344, "ITUNESGAPLESS", zzfbVar, false, true);
                }
                if (zzf2 == 1936683886) {
                    return zze(1936683886, "TVSHOWSORT", zzfbVar);
                }
                if (zzf2 == 1953919848) {
                    return zze(1953919848, "TVSHOW", zzfbVar);
                }
                if (zzf2 == 757935405) {
                    String str3 = null;
                    String str4 = null;
                    int i3 = -1;
                    int i4 = -1;
                    while (zzfbVar.zzc() < zzf) {
                        int zzc = zzfbVar.zzc();
                        int zzf5 = zzfbVar.zzf();
                        int zzf6 = zzfbVar.zzf();
                        zzfbVar.zzH(4);
                        if (zzf6 == 1835360622) {
                            str3 = zzfbVar.zzx(zzf5 - 12);
                        } else {
                            int i5 = zzf5 - 12;
                            if (zzf6 == 1851878757) {
                                str4 = zzfbVar.zzx(i5);
                            } else {
                                if (zzf6 == 1684108385) {
                                    i4 = zzf5;
                                }
                                if (zzf6 == 1684108385) {
                                    i3 = zzc;
                                }
                                zzfbVar.zzH(i5);
                            }
                        }
                    }
                    if (str3 != null && str4 != null && i3 != -1) {
                        zzfbVar.zzG(i3);
                        zzfbVar.zzH(16);
                        zzbxVar = new zzafj(str3, str4, zzfbVar.zzx(i4 - 16));
                    }
                    return zzbxVar;
                }
            } else {
                int i6 = zzf2 & 16777215;
                if (i6 == 6516084) {
                    int zzf7 = zzfbVar.zzf();
                    if (zzfbVar.zzf() == 1684108385) {
                        zzfbVar.zzH(8);
                        String zzx = zzfbVar.zzx(zzf7 - 16);
                        zzbxVar = new zzafa("und", zzx, zzx);
                    } else {
                        zzer.zzf("MetadataUtil", "Failed to parse comment attribute: ".concat(zzagy.zzf(zzf2)));
                    }
                    return zzbxVar;
                }
                if (i6 != 7233901 && i6 != 7631467) {
                    if (i6 != 6516589 && i6 != 7828084) {
                        if (i6 == 6578553) {
                            return zze(zzf2, "TDRC", zzfbVar);
                        }
                        if (i6 == 4280916) {
                            return zze(zzf2, "TPE1", zzfbVar);
                        }
                        if (i6 == 7630703) {
                            return zze(zzf2, "TSSE", zzfbVar);
                        }
                        if (i6 == 6384738) {
                            return zze(zzf2, "TALB", zzfbVar);
                        }
                        if (i6 == 7108978) {
                            return zze(zzf2, "USLT", zzfbVar);
                        }
                        if (i6 == 6776174) {
                            return zze(zzf2, "TCON", zzfbVar);
                        }
                        if (i6 == 6779504) {
                            return zze(zzf2, "TIT1", zzfbVar);
                        }
                    } else {
                        return zze(zzf2, "TCOM", zzfbVar);
                    }
                } else {
                    return zze(zzf2, "TIT2", zzfbVar);
                }
            }
            zzer.zzb("MetadataUtil", "Skipped unknown metadata entry: " + zzagy.zzf(zzf2));
            return null;
        } finally {
            zzfbVar.zzG(zzf);
        }
    }

    private static int zzb(zzfb zzfbVar) {
        zzfbVar.zzH(4);
        if (zzfbVar.zzf() == 1684108385) {
            zzfbVar.zzH(8);
            return zzfbVar.zzl();
        }
        zzer.zzf("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    private static zzafh zzc(int i, String str, zzfb zzfbVar, boolean z, boolean z2) {
        int zzb2 = zzb(zzfbVar);
        if (z2) {
            zzb2 = Math.min(1, zzb2);
        }
        if (zzb2 >= 0) {
            if (z) {
                return new zzafp(str, null, zzfvs.zzm(Integer.toString(zzb2)));
            }
            return new zzafa("und", str, Integer.toString(zzb2));
        }
        zzer.zzf("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzagy.zzf(i)));
        return null;
    }

    private static zzafp zzd(int i, String str, zzfb zzfbVar) {
        int zzf = zzfbVar.zzf();
        if (zzfbVar.zzf() == 1684108385 && zzf >= 22) {
            zzfbVar.zzH(10);
            int zzp = zzfbVar.zzp();
            if (zzp > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(zzp);
                String sb2 = sb.toString();
                int zzp2 = zzfbVar.zzp();
                if (zzp2 > 0) {
                    sb2 = sb2 + "/" + zzp2;
                }
                return new zzafp(str, null, zzfvs.zzm(sb2));
            }
        }
        zzer.zzf("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzagy.zzf(i)));
        return null;
    }

    private static zzafp zze(int i, String str, zzfb zzfbVar) {
        int zzf = zzfbVar.zzf();
        if (zzfbVar.zzf() == 1684108385) {
            zzfbVar.zzH(8);
            return new zzafp(str, null, zzfvs.zzm(zzfbVar.zzx(zzf - 16)));
        }
        zzer.zzf("MetadataUtil", "Failed to parse text attribute: ".concat(zzagy.zzf(i)));
        return null;
    }
}
