package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.zzfc;
import com.google.android.gms.internal.measurement.zzfp;
import com.google.android.gms.measurement.internal.zzih;
import defpackage.kg;
import defpackage.mo1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzgp extends zzmo implements zzah {
    final mo1 zza;
    final com.google.android.gms.internal.measurement.zzv zzb;
    private final Map<String, Map<String, String>> zzc;
    private final Map<String, Set<String>> zzd;
    private final Map<String, Map<String, Boolean>> zze;
    private final Map<String, Map<String, Boolean>> zzg;
    private final Map<String, zzfc.zzd> zzh;
    private final Map<String, Map<String, Integer>> zzi;
    private final Map<String, String> zzj;
    private final Map<String, String> zzk;
    private final Map<String, String> zzl;

    public zzgp(zzmp zzmpVar) {
        super(zzmpVar);
        this.zzc = new kg();
        this.zzd = new kg();
        this.zze = new kg();
        this.zzg = new kg();
        this.zzh = new kg();
        this.zzj = new kg();
        this.zzk = new kg();
        this.zzl = new kg();
        this.zzi = new kg();
        this.zza = new zzgv(this, 20);
        this.zzb = new zzgu(this);
    }

    private final void zzv(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        if (this.zzh.get(str) == null) {
            zzaq zze = zzh().zze(str);
            if (zze == null) {
                this.zzc.put(str, null);
                this.zze.put(str, null);
                this.zzd.put(str, null);
                this.zzg.put(str, null);
                this.zzh.put(str, null);
                this.zzj.put(str, null);
                this.zzk.put(str, null);
                this.zzl.put(str, null);
                this.zzi.put(str, null);
                return;
            }
            zzfc.zzd.zza zzby = zza(str, zze.zza).zzby();
            zza(str, zzby);
            this.zzc.put(str, zza((zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab())));
            this.zzh.put(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
            zza(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
            this.zzj.put(str, zzby.zzc());
            this.zzk.put(str, zze.zzb);
            this.zzl.put(str, zze.zzc);
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmz g_() {
        return super.g_();
    }

    public final int zzb(String str, String str2) {
        Integer num;
        zzt();
        zzv(str);
        Map<String, Integer> map = this.zzi.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzmo
    public final boolean zzc() {
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ zzae zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzaf zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzba zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzt zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzao zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzfq zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ zzfr zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zzgd zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ zzgy zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzgp zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzls zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzml
    public final /* bridge */ /* synthetic */ zzmn zzo() {
        return super.zzo();
    }

    public final boolean zzp(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null && this.zzd.get(str).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ zznd zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void zzr() {
        super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void zzs() {
        super.zzs();
    }

    @Override // com.google.android.gms.measurement.internal.zzid
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    public final boolean zzu(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null && this.zzd.get(str).contains("user_id")) {
            return true;
        }
        return false;
    }

    public final long zza(String str) {
        String zza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(zza)) {
            return 0L;
        }
        try {
            return Long.parseLong(zza);
        } catch (NumberFormatException e) {
            zzj().zzu().zza("Unable to parse timezone offset. appId", zzfr.zza(str), e);
            return 0L;
        }
    }

    public final zzfc.zzd zzc(String str) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzv(str);
        return this.zzh.get(str);
    }

    public final String zzd(String str) {
        zzt();
        return this.zzl.get(str);
    }

    public final String zze(String str) {
        zzt();
        return this.zzk.get(str);
    }

    public final String zzf(String str) {
        zzt();
        zzv(str);
        return this.zzj.get(str);
    }

    public final Set<String> zzg(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str);
    }

    public final SortedSet<String> zzh(String str) {
        zzt();
        zzv(str);
        TreeSet treeSet = new TreeSet();
        zzfc.zza zzb = zzb(str);
        if (zzb == null) {
            return treeSet;
        }
        Iterator<zzfc.zza.zzf> it = zzb.zzc().iterator();
        while (it.hasNext()) {
            treeSet.add(it.next().zzb());
        }
        return treeSet;
    }

    public final void zzi(String str) {
        zzt();
        this.zzk.put(str, null);
    }

    public final void zzj(String str) {
        zzt();
        this.zzh.remove(str);
    }

    public final boolean zzk(String str) {
        zzt();
        zzfc.zzd zzc = zzc(str);
        if (zzc == null) {
            return false;
        }
        return zzc.zzp();
    }

    public final boolean zzl(String str) {
        zzfc.zzd zzdVar;
        return (TextUtils.isEmpty(str) || (zzdVar = this.zzh.get(str)) == null || zzdVar.zza() == 0) ? false : true;
    }

    public final boolean zzm(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    public final boolean zzn(String str) {
        zzt();
        zzv(str);
        zzfc.zza zzb = zzb(str);
        return zzb == null || !zzb.zzg() || zzb.zzf();
    }

    public final boolean zzo(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    public final boolean zzq(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("device_model") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    public final boolean zzr(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("enhanced_user_id");
    }

    public final boolean zzs(String str) {
        zzt();
        zzv(str);
        return this.zzd.get(str) != null && this.zzd.get(str).contains("google_signals");
    }

    public final boolean zzt(String str) {
        zzt();
        zzv(str);
        if (this.zzd.get(str) != null) {
            return this.zzd.get(str).contains("os_version") || this.zzd.get(str).contains("device_info");
        }
        return false;
    }

    public final boolean zzd(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if (zzm(str) && zznd.zzg(str2)) {
            return true;
        }
        if (zzo(str) && zznd.zzh(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zze.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    public final zzfc.zza zzb(String str) {
        zzt();
        zzv(str);
        zzfc.zzd zzc = zzc(str);
        if (zzc == null || !zzc.zzq()) {
            return null;
        }
        return zzc.zzd();
    }

    public final boolean zzc(String str, String str2) {
        Boolean bool;
        zzt();
        zzv(str);
        if ("ecommerce_purchase".equals(str2) || "purchase".equals(str2) || "refund".equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.zzg.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.measurement.internal.zzid, com.google.android.gms.measurement.internal.zzif
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    public static /* synthetic */ com.google.android.gms.internal.measurement.zzb zza(zzgp zzgpVar, String str) {
        zzgpVar.zzak();
        Preconditions.checkNotEmpty(str);
        if (!zzgpVar.zzl(str)) {
            return null;
        }
        if (zzgpVar.zzh.containsKey(str) && zzgpVar.zzh.get(str) != null) {
            zzgpVar.zza(str, zzgpVar.zzh.get(str));
        } else {
            zzgpVar.zzv(str);
        }
        return (com.google.android.gms.internal.measurement.zzb) zzgpVar.zza.snapshot().get(str);
    }

    public final boolean zzb(String str, zzih.zza zzaVar) {
        zzt();
        zzv(str);
        zzfc.zza zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        Iterator<zzfc.zza.zzb> it = zzb.zzd().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            zzfc.zza.zzb next = it.next();
            if (zzaVar == zza(next.zzc())) {
                if (next.zzb() == zzfc.zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final zzih.zza zza(String str, zzih.zza zzaVar) {
        zzt();
        zzv(str);
        zzfc.zza zzb = zzb(str);
        if (zzb == null) {
            return null;
        }
        for (zzfc.zza.zzc zzcVar : zzb.zze()) {
            if (zzaVar == zza(zzcVar.zzc())) {
                return zza(zzcVar.zzb());
            }
        }
        return null;
    }

    private static zzih.zza zza(zzfc.zza.zze zzeVar) {
        int i = zzgw.zzb[zzeVar.ordinal()];
        if (i == 1) {
            return zzih.zza.AD_STORAGE;
        }
        if (i == 2) {
            return zzih.zza.ANALYTICS_STORAGE;
        }
        if (i == 3) {
            return zzih.zza.AD_USER_DATA;
        }
        if (i != 4) {
            return null;
        }
        return zzih.zza.AD_PERSONALIZATION;
    }

    private final zzfc.zzd zza(String str, byte[] bArr) {
        if (bArr == null) {
            return zzfc.zzd.zzg();
        }
        try {
            zzfc.zzd zzdVar = (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) ((zzfc.zzd.zza) zzmz.zza(zzfc.zzd.zze(), bArr)).zzab());
            zzj().zzp().zza("Parsed config. version, gmp_app_id", zzdVar.zzs() ? Long.valueOf(zzdVar.zzc()) : null, zzdVar.zzr() ? zzdVar.zzh() : null);
            return zzdVar;
        } catch (com.google.android.gms.internal.measurement.zzji e) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfr.zza(str), e);
            return zzfc.zzd.zzg();
        } catch (RuntimeException e2) {
            zzj().zzu().zza("Unable to merge remote config. appId", zzfr.zza(str), e2);
            return zzfc.zzd.zzg();
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzah
    public final String zza(String str, String str2) {
        zzt();
        zzv(str);
        Map<String, String> map = this.zzc.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    private static Map<String, String> zza(zzfc.zzd zzdVar) {
        kg kgVar = new kg();
        if (zzdVar != null) {
            for (zzfc.zzg zzgVar : zzdVar.zzo()) {
                kgVar.put(zzgVar.zzb(), zzgVar.zzc());
            }
        }
        return kgVar;
    }

    private final void zza(String str, zzfc.zzd.zza zzaVar) {
        HashSet hashSet = new HashSet();
        kg kgVar = new kg();
        kg kgVar2 = new kg();
        kg kgVar3 = new kg();
        if (zzaVar != null) {
            Iterator<zzfc.zzb> it = zzaVar.zze().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().zzb());
            }
            for (int i = 0; i < zzaVar.zza(); i++) {
                zzfc.zzc.zza zzby = zzaVar.zza(i).zzby();
                if (zzby.zzb().isEmpty()) {
                    zzj().zzu().zza("EventConfig contained null event name");
                } else {
                    String zzb = zzby.zzb();
                    String zzb2 = zzii.zzb(zzby.zzb());
                    if (!TextUtils.isEmpty(zzb2)) {
                        zzby = zzby.zza(zzb2);
                        zzaVar.zza(i, zzby);
                    }
                    if (zzby.zze() && zzby.zzc()) {
                        kgVar.put(zzb, Boolean.TRUE);
                    }
                    if (zzby.zzf() && zzby.zzd()) {
                        kgVar2.put(zzby.zzb(), Boolean.TRUE);
                    }
                    if (zzby.zzg()) {
                        if (zzby.zza() >= 2 && zzby.zza() <= 65535) {
                            kgVar3.put(zzby.zzb(), Integer.valueOf(zzby.zza()));
                        } else {
                            zzj().zzu().zza("Invalid sampling rate. Event name, sample rate", zzby.zzb(), Integer.valueOf(zzby.zza()));
                        }
                    }
                }
            }
        }
        this.zzd.put(str, hashSet);
        this.zze.put(str, kgVar);
        this.zzg.put(str, kgVar2);
        this.zzi.put(str, kgVar3);
    }

    private final void zza(final String str, zzfc.zzd zzdVar) {
        if (zzdVar.zza() == 0) {
            this.zza.remove(str);
            return;
        }
        zzj().zzp().zza("EES programs found", Integer.valueOf(zzdVar.zza()));
        zzfp.zzc zzcVar = zzdVar.zzn().get(0);
        try {
            com.google.android.gms.internal.measurement.zzb zzbVar = new com.google.android.gms.internal.measurement.zzb();
            zzbVar.zza("internal.remoteConfig", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgq
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzm("internal.remoteConfig", new zzgx(zzgp.this, str));
                }
            });
            zzbVar.zza("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgt
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final zzgp zzgpVar = zzgp.this;
                    final String str2 = str;
                    return new com.google.android.gms.internal.measurement.zzx("internal.appMetadata", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgr
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            zzgp zzgpVar2 = zzgp.this;
                            String str3 = str2;
                            zzh zzd = zzgpVar2.zzh().zzd(str3);
                            HashMap hashMap = new HashMap();
                            hashMap.put("platform", "android");
                            hashMap.put("package_name", str3);
                            hashMap.put("gmp_version", 82001L);
                            if (zzd != null) {
                                String zzaa = zzd.zzaa();
                                if (zzaa != null) {
                                    hashMap.put("app_version", zzaa);
                                }
                                hashMap.put("app_version_int", Long.valueOf(zzd.zzc()));
                                hashMap.put("dynamite_version", Long.valueOf(zzd.zzm()));
                            }
                            return hashMap;
                        }
                    });
                }
            });
            zzbVar.zza("internal.logger", new Callable() { // from class: com.google.android.gms.measurement.internal.zzgs
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new com.google.android.gms.internal.measurement.zzr(zzgp.this.zzb);
                }
            });
            zzbVar.zza(zzcVar);
            this.zza.put(str, zzbVar);
            zzj().zzp().zza("EES program loaded for appId, activities", str, Integer.valueOf(zzcVar.zza().zza()));
            Iterator<zzfp.zzb> it = zzcVar.zza().zzd().iterator();
            while (it.hasNext()) {
                zzj().zzp().zza("EES program activity", it.next().zzb());
            }
        } catch (com.google.android.gms.internal.measurement.zzc unused) {
            zzj().zzg().zza("Failed to load EES program. appId", str);
        }
    }

    public final boolean zza(String str, byte[] bArr, String str2, String str3) {
        zzak();
        zzt();
        Preconditions.checkNotEmpty(str);
        zzfc.zzd.zza zzby = zza(str, bArr).zzby();
        if (zzby == null) {
            return false;
        }
        zza(str, zzby);
        zza(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
        this.zzh.put(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
        this.zzj.put(str, zzby.zzc());
        this.zzk.put(str, str2);
        this.zzl.put(str, str3);
        this.zzc.put(str, zza((zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab())));
        zzh().zza(str, new ArrayList(zzby.zzd()));
        try {
            zzby.zzb();
            bArr = ((zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab())).zzbv();
        } catch (RuntimeException e) {
            zzj().zzu().zza("Unable to serialize reduced-size config. Storing full config instead. appId", zzfr.zza(str), e);
        }
        zzao zzh = zzh();
        Preconditions.checkNotEmpty(str);
        zzh.zzt();
        zzh.zzak();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (zzh.e_().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                zzh.zzj().zzg().zza("Failed to update remote config (got 0). appId", zzfr.zza(str));
            }
        } catch (SQLiteException e2) {
            zzh.zzj().zzg().zza("Error storing remote config. appId", zzfr.zza(str), e2);
        }
        this.zzh.put(str, (zzfc.zzd) ((com.google.android.gms.internal.measurement.zzix) zzby.zzab()));
        return true;
    }
}
