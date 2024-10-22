package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzih;
import com.vungle.ads.internal.protos.Sdk;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzay {
    public static final zzay zza = new zzay((Boolean) null, 100);
    private final int zzb;
    private final String zzc;
    private final Boolean zzd;
    private final String zze;
    private final EnumMap<zzih.zza, Boolean> zzf;

    public zzay(Boolean bool, int i) {
        this(bool, i, (Boolean) null, (String) null);
    }

    private final String zzh() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.zzb);
        for (zzih.zza zzaVar : zzig.DMA.zza()) {
            sb.append(":");
            sb.append(zzih.zza(this.zzf.get(zzaVar)));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzay)) {
            return false;
        }
        zzay zzayVar = (zzay) obj;
        if (!this.zzc.equalsIgnoreCase(zzayVar.zzc) || !zzax.zza(this.zzd, zzayVar.zzd)) {
            return false;
        }
        return zzax.zza(this.zze, zzayVar.zze);
    }

    public final int hashCode() {
        int i;
        int hashCode;
        Boolean bool = this.zzd;
        if (bool == null) {
            i = 3;
        } else if (bool == Boolean.TRUE) {
            i = 7;
        } else {
            i = 13;
        }
        String str = this.zze;
        if (str == null) {
            hashCode = 17;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE) + (i * 29) + this.zzc.hashCode();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("source=");
        sb.append(zzih.zza(this.zzb));
        for (zzih.zza zzaVar : zzig.DMA.zza()) {
            sb.append(",");
            sb.append(zzaVar.zze);
            sb.append("=");
            Boolean bool = this.zzf.get(zzaVar);
            if (bool == null) {
                sb.append("uninitialized");
            } else {
                if (bool.booleanValue()) {
                    str = "granted";
                } else {
                    str = "denied";
                }
                sb.append(str);
            }
        }
        if (this.zzd != null) {
            sb.append(",isDmaRegion=");
            sb.append(this.zzd);
        }
        if (this.zze != null) {
            sb.append(",cpsDisplayStr=");
            sb.append(this.zze);
        }
        return sb.toString();
    }

    public final int zza() {
        return this.zzb;
    }

    public final Bundle zzb() {
        Bundle bundle = new Bundle();
        for (Map.Entry<zzih.zza, Boolean> entry : this.zzf.entrySet()) {
            Boolean value = entry.getValue();
            if (value != null) {
                bundle.putString(entry.getKey().zze, zzih.zza(value.booleanValue()));
            }
        }
        Boolean bool = this.zzd;
        if (bool != null) {
            bundle.putString("is_dma_region", bool.toString());
        }
        String str = this.zze;
        if (str != null) {
            bundle.putString("cps_display_str", str);
        }
        return bundle;
    }

    public final Boolean zzc() {
        return this.zzf.get(zzih.zza.AD_USER_DATA);
    }

    public final Boolean zzd() {
        return this.zzd;
    }

    public final String zze() {
        return this.zze;
    }

    public final String zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        Iterator<Boolean> it = this.zzf.values().iterator();
        while (it.hasNext()) {
            if (it.next() != null) {
                return true;
            }
        }
        return false;
    }

    private zzay(EnumMap<zzih.zza, Boolean> enumMap, int i) {
        this(enumMap, i, (Boolean) null, (String) null);
    }

    public static zzay zza(Bundle bundle, int i) {
        if (bundle == null) {
            return new zzay((Boolean) null, i);
        }
        EnumMap enumMap = new EnumMap(zzih.zza.class);
        for (zzih.zza zzaVar : zzig.DMA.zza()) {
            enumMap.put((EnumMap) zzaVar, (zzih.zza) zzih.zzb(bundle.getString(zzaVar.zze)));
        }
        return new zzay((EnumMap<zzih.zza, Boolean>) enumMap, i, bundle.containsKey("is_dma_region") ? Boolean.valueOf(bundle.getString("is_dma_region")) : null, bundle.getString("cps_display_str"));
    }

    public zzay(Boolean bool, int i, Boolean bool2, String str) {
        EnumMap<zzih.zza, Boolean> enumMap = new EnumMap<>((Class<zzih.zza>) zzih.zza.class);
        this.zzf = enumMap;
        enumMap.put((EnumMap<zzih.zza, Boolean>) zzih.zza.AD_USER_DATA, (zzih.zza) bool);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool2;
        this.zze = str;
    }

    private zzay(EnumMap<zzih.zza, Boolean> enumMap, int i, Boolean bool, String str) {
        EnumMap<zzih.zza, Boolean> enumMap2 = new EnumMap<>((Class<zzih.zza>) zzih.zza.class);
        this.zzf = enumMap2;
        enumMap2.putAll(enumMap);
        this.zzb = i;
        this.zzc = zzh();
        this.zzd = bool;
        this.zze = str;
    }

    public static zzay zza(String str) {
        if (str != null && str.length() > 0) {
            String[] split = str.split(":");
            int parseInt = Integer.parseInt(split[0]);
            EnumMap enumMap = new EnumMap(zzih.zza.class);
            zzih.zza[] zza2 = zzig.DMA.zza();
            int length = zza2.length;
            int i = 1;
            int i2 = 0;
            while (i2 < length) {
                enumMap.put((EnumMap) zza2[i2], (zzih.zza) zzih.zza(split[i].charAt(0)));
                i2++;
                i++;
            }
            return new zzay((EnumMap<zzih.zza, Boolean>) enumMap, parseInt);
        }
        return zza;
    }

    public static Boolean zza(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        return zzih.zzb(bundle.getString("ad_personalization"));
    }
}
