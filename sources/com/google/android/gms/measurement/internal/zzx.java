package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzfi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzx {
    private zzfi.zze zza;
    private Long zzb;
    private long zzc;
    private final /* synthetic */ zzt zzd;

    public final zzfi.zze zza(String str, zzfi.zze zzeVar) {
        boolean z;
        Object obj;
        String zzg = zzeVar.zzg();
        List<zzfi.zzg> zzh = zzeVar.zzh();
        this.zzd.g_();
        Long l = (Long) zzmz.zzb(zzeVar, "_eid");
        boolean z2 = true;
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !zzg.equals("_ep")) {
            z2 = false;
        }
        if (z2) {
            Preconditions.checkNotNull(l);
            this.zzd.g_();
            zzg = (String) zzmz.zzb(zzeVar, "_en");
            if (TextUtils.isEmpty(zzg)) {
                this.zzd.zzj().zzm().zza("Extra parameter without an event name. eventId", l);
                return null;
            }
            if (this.zza == null || this.zzb == null || l.longValue() != this.zzb.longValue()) {
                Pair<zzfi.zze, Long> zza = this.zzd.zzh().zza(str, l);
                if (zza != null && (obj = zza.first) != null) {
                    this.zza = (zzfi.zze) obj;
                    this.zzc = ((Long) zza.second).longValue();
                    this.zzd.g_();
                    this.zzb = (Long) zzmz.zzb(this.zza, "_eid");
                } else {
                    this.zzd.zzj().zzm().zza("Extra parameter without existing main event. eventName, eventId", zzg, l);
                    return null;
                }
            }
            long j = this.zzc - 1;
            this.zzc = j;
            if (j <= 0) {
                zzao zzh2 = this.zzd.zzh();
                zzh2.zzt();
                zzh2.zzj().zzp().zza("Clearing complex main event info. appId", str);
                try {
                    zzh2.e_().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    zzh2.zzj().zzg().zza("Error clearing complex main event", e);
                }
            } else {
                this.zzd.zzh().zza(str, l, this.zzc, this.zza);
            }
            ArrayList arrayList = new ArrayList();
            for (zzfi.zzg zzgVar : this.zza.zzh()) {
                this.zzd.g_();
                if (zzmz.zza(zzeVar, zzgVar.zzg()) == null) {
                    arrayList.add(zzgVar);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(zzh);
                zzh = arrayList;
            } else {
                this.zzd.zzj().zzm().zza("No unique parameters in main event. eventName", zzg);
            }
        } else if (z) {
            this.zzb = l;
            this.zza = zzeVar;
            this.zzd.g_();
            Object obj2 = 0L;
            Object zzb = zzmz.zzb(zzeVar, "_epc");
            if (zzb != null) {
                obj2 = zzb;
            }
            long longValue = ((Long) obj2).longValue();
            this.zzc = longValue;
            if (longValue <= 0) {
                this.zzd.zzj().zzm().zza("Complex event with zero extra param count. eventName", zzg);
            } else {
                this.zzd.zzh().zza(str, (Long) Preconditions.checkNotNull(l), this.zzc, zzeVar);
            }
        }
        return (zzfi.zze) ((com.google.android.gms.internal.measurement.zzix) zzeVar.zzby().zza(zzg).zzd().zza(zzh).zzab());
    }

    private zzx(zzt zztVar) {
        this.zzd = zztVar;
    }
}
