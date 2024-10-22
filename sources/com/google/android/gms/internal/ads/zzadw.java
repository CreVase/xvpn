package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
final class zzadw extends zzady {
    private long zzb;
    private long[] zzc;
    private long[] zzd;

    public zzadw() {
        super(new zzabl());
        this.zzb = -9223372036854775807L;
        this.zzc = new long[0];
        this.zzd = new long[0];
    }

    private static Double zzg(zzfb zzfbVar) {
        return Double.valueOf(Double.longBitsToDouble(zzfbVar.zzs()));
    }

    private static Object zzh(zzfb zzfbVar, int i) {
        if (i != 0) {
            boolean z = false;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 8) {
                            if (i != 10) {
                                if (i != 11) {
                                    return null;
                                }
                                Date date = new Date((long) zzg(zzfbVar).doubleValue());
                                zzfbVar.zzH(2);
                                return date;
                            }
                            int zzo = zzfbVar.zzo();
                            ArrayList arrayList = new ArrayList(zzo);
                            for (int i2 = 0; i2 < zzo; i2++) {
                                Object zzh = zzh(zzfbVar, zzfbVar.zzl());
                                if (zzh != null) {
                                    arrayList.add(zzh);
                                }
                            }
                            return arrayList;
                        }
                        return zzj(zzfbVar);
                    }
                    HashMap hashMap = new HashMap();
                    while (true) {
                        String zzi = zzi(zzfbVar);
                        int zzl = zzfbVar.zzl();
                        if (zzl == 9) {
                            return hashMap;
                        }
                        Object zzh2 = zzh(zzfbVar, zzl);
                        if (zzh2 != null) {
                            hashMap.put(zzi, zzh2);
                        }
                    }
                } else {
                    return zzi(zzfbVar);
                }
            } else {
                if (zzfbVar.zzl() == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        } else {
            return zzg(zzfbVar);
        }
    }

    private static String zzi(zzfb zzfbVar) {
        int zzp = zzfbVar.zzp();
        int zzc = zzfbVar.zzc();
        zzfbVar.zzH(zzp);
        return new String(zzfbVar.zzI(), zzc, zzp);
    }

    private static HashMap zzj(zzfb zzfbVar) {
        int zzo = zzfbVar.zzo();
        HashMap hashMap = new HashMap(zzo);
        for (int i = 0; i < zzo; i++) {
            String zzi = zzi(zzfbVar);
            Object zzh = zzh(zzfbVar, zzfbVar.zzl());
            if (zzh != null) {
                hashMap.put(zzi, zzh);
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zza(zzfb zzfbVar) {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzady
    public final boolean zzb(zzfb zzfbVar, long j) {
        if (zzfbVar.zzl() != 2 || !"onMetaData".equals(zzi(zzfbVar)) || zzfbVar.zza() == 0 || zzfbVar.zzl() != 8) {
            return false;
        }
        HashMap zzj = zzj(zzfbVar);
        Object obj = zzj.get("duration");
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (doubleValue > 0.0d) {
                this.zzb = (long) (doubleValue * 1000000.0d);
            }
        }
        Object obj2 = zzj.get("keyframes");
        if (obj2 instanceof Map) {
            Map map = (Map) obj2;
            Object obj3 = map.get("filepositions");
            Object obj4 = map.get("times");
            if ((obj3 instanceof List) && (obj4 instanceof List)) {
                List list = (List) obj3;
                List list2 = (List) obj4;
                int size = list2.size();
                this.zzc = new long[size];
                this.zzd = new long[size];
                for (int i = 0; i < size; i++) {
                    Object obj5 = list.get(i);
                    Object obj6 = list2.get(i);
                    if ((obj6 instanceof Double) && (obj5 instanceof Double)) {
                        this.zzc[i] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                        this.zzd[i] = ((Double) obj5).longValue();
                    } else {
                        this.zzc = new long[0];
                        this.zzd = new long[0];
                        break;
                    }
                }
            }
        }
        return false;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final long[] zzd() {
        return this.zzd;
    }

    public final long[] zze() {
        return this.zzc;
    }
}
