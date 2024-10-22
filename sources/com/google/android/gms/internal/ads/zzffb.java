package com.google.android.gms.internal.ads;

import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class zzffb implements zzffa {
    private final ConcurrentHashMap zza;
    private final zzffh zzb;
    private final zzffd zzc = new zzffd();

    public zzffb(zzffh zzffhVar) {
        this.zza = new ConcurrentHashMap(zzffhVar.zzd);
        this.zzb = zzffhVar;
    }

    private final void zzf() {
        Parcelable.Creator<zzffh> creator = zzffh.CREATOR;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgo)).booleanValue()) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.zzb.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzb());
            int i = 0;
            for (Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((zzffk) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((zzfez) entry.getValue()).zzb(); i2++) {
                    sb.append("[O]");
                }
                for (int zzb = ((zzfez) entry.getValue()).zzb(); zzb < this.zzb.zzd; zzb++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((zzfez) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < this.zzb.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            zzcat.zze(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzffa
    public final zzffh zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzffa
    public final synchronized zzffj zzb(zzffk zzffkVar) {
        zzffj zzffjVar;
        zzfez zzfezVar = (zzfez) this.zza.get(zzffkVar);
        if (zzfezVar != null) {
            zzffjVar = zzfezVar.zze();
            if (zzffjVar == null) {
                this.zzc.zze();
            }
            zzffx zzf = zzfezVar.zzf();
            if (zzffjVar != null) {
                zzayk zza = zzayq.zza();
                zzayi zza2 = zzayj.zza();
                zza2.zzd(2);
                zzaym zza3 = zzayn.zza();
                zza3.zza(zzf.zza);
                zza3.zzb(zzf.zzb);
                zza2.zza(zza3);
                zza.zza(zza2);
                zzffjVar.zza.zzb().zzc().zzi((zzayq) zza.zzal());
            }
            zzf();
        } else {
            this.zzc.zzf();
            zzf();
            zzffjVar = null;
        }
        return zzffjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzffa
    @Deprecated
    public final zzffk zzc(com.google.android.gms.ads.internal.client.zzl zzlVar, String str, com.google.android.gms.ads.internal.client.zzw zzwVar) {
        return new zzffl(zzlVar, str, new zzbvk(this.zzb.zza).zza().zzk, this.zzb.zzf, zzwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzffa
    public final synchronized boolean zzd(zzffk zzffkVar, zzffj zzffjVar) {
        boolean zzh;
        zzfez zzfezVar = (zzfez) this.zza.get(zzffkVar);
        zzffjVar.zzd = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        if (zzfezVar == null) {
            zzffh zzffhVar = this.zzb;
            zzfez zzfezVar2 = new zzfez(zzffhVar.zzd, zzffhVar.zze * 1000);
            if (this.zza.size() == this.zzb.zzc) {
                int i = this.zzb.zzg;
                int i2 = i - 1;
                zzffk zzffkVar2 = null;
                if (i != 0) {
                    long j = Long.MAX_VALUE;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 == 2) {
                                int i3 = Integer.MAX_VALUE;
                                for (Map.Entry entry : this.zza.entrySet()) {
                                    if (((zzfez) entry.getValue()).zza() < i3) {
                                        i3 = ((zzfez) entry.getValue()).zza();
                                        zzffkVar2 = (zzffk) entry.getKey();
                                    }
                                }
                                if (zzffkVar2 != null) {
                                    this.zza.remove(zzffkVar2);
                                }
                            }
                        } else {
                            for (Map.Entry entry2 : this.zza.entrySet()) {
                                if (((zzfez) entry2.getValue()).zzd() < j) {
                                    j = ((zzfez) entry2.getValue()).zzd();
                                    zzffkVar2 = (zzffk) entry2.getKey();
                                }
                            }
                            if (zzffkVar2 != null) {
                                this.zza.remove(zzffkVar2);
                            }
                        }
                    } else {
                        for (Map.Entry entry3 : this.zza.entrySet()) {
                            if (((zzfez) entry3.getValue()).zzc() < j) {
                                j = ((zzfez) entry3.getValue()).zzc();
                                zzffkVar2 = (zzffk) entry3.getKey();
                            }
                        }
                        if (zzffkVar2 != null) {
                            this.zza.remove(zzffkVar2);
                        }
                    }
                    this.zzc.zzg();
                } else {
                    throw null;
                }
            }
            this.zza.put(zzffkVar, zzfezVar2);
            this.zzc.zzd();
            zzfezVar = zzfezVar2;
        }
        zzh = zzfezVar.zzh(zzffjVar);
        this.zzc.zzc();
        zzffc zza = this.zzc.zza();
        zzffx zzf = zzfezVar.zzf();
        zzayk zza2 = zzayq.zza();
        zzayi zza3 = zzayj.zza();
        zza3.zzd(2);
        zzayo zza4 = zzayp.zza();
        zza4.zza(zza.zza);
        zza4.zzb(zza.zzb);
        zza4.zzc(zzf.zzb);
        zza3.zzc(zza4);
        zza2.zza(zza3);
        zzffjVar.zza.zzb().zzc().zzj((zzayq) zza2.zzal());
        zzf();
        return zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzffa
    public final synchronized boolean zze(zzffk zzffkVar) {
        zzfez zzfezVar = (zzfez) this.zza.get(zzffkVar);
        if (zzfezVar == null) {
            return true;
        }
        zzffh zzffhVar = this.zzb;
        if (zzfezVar.zzb() < zzffhVar.zzd) {
            return true;
        }
        return false;
    }
}
