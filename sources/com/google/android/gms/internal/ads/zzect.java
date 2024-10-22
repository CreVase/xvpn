package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzect extends zzecu {
    private static final SparseArray zzb;
    private final Context zzc;
    private final zzcwp zzd;
    private final TelephonyManager zze;
    private final zzecl zzf;
    private int zzg;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        sparseArray.put(NetworkInfo.DetailedState.CONNECTED.ordinal(), zzbai.CONNECTED);
        int ordinal = NetworkInfo.DetailedState.AUTHENTICATING.ordinal();
        zzbai zzbaiVar = zzbai.CONNECTING;
        sparseArray.put(ordinal, zzbaiVar);
        sparseArray.put(NetworkInfo.DetailedState.CONNECTING.ordinal(), zzbaiVar);
        sparseArray.put(NetworkInfo.DetailedState.OBTAINING_IPADDR.ordinal(), zzbaiVar);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTING.ordinal(), zzbai.DISCONNECTING);
        int ordinal2 = NetworkInfo.DetailedState.BLOCKED.ordinal();
        zzbai zzbaiVar2 = zzbai.DISCONNECTED;
        sparseArray.put(ordinal2, zzbaiVar2);
        sparseArray.put(NetworkInfo.DetailedState.DISCONNECTED.ordinal(), zzbaiVar2);
        sparseArray.put(NetworkInfo.DetailedState.FAILED.ordinal(), zzbaiVar2);
        sparseArray.put(NetworkInfo.DetailedState.IDLE.ordinal(), zzbaiVar2);
        sparseArray.put(NetworkInfo.DetailedState.SCANNING.ordinal(), zzbaiVar2);
        sparseArray.put(NetworkInfo.DetailedState.SUSPENDED.ordinal(), zzbai.SUSPENDED);
        sparseArray.put(NetworkInfo.DetailedState.CAPTIVE_PORTAL_CHECK.ordinal(), zzbaiVar);
        sparseArray.put(NetworkInfo.DetailedState.VERIFYING_POOR_LINK.ordinal(), zzbaiVar);
    }

    public zzect(Context context, zzcwp zzcwpVar, zzecl zzeclVar, zzech zzechVar, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        super(zzechVar, zzgVar);
        this.zzc = context;
        this.zzd = zzcwpVar;
        this.zzf = zzeclVar;
        this.zze = (TelephonyManager) context.getSystemService("phone");
    }

    public static /* bridge */ /* synthetic */ zzazz zza(zzect zzectVar, Bundle bundle) {
        zzazs zza = zzazz.zza();
        int i = bundle.getInt("cnt", -2);
        int i2 = bundle.getInt("gnt", 0);
        int i3 = 2;
        if (i == -1) {
            zzectVar.zzg = 2;
        } else {
            zzectVar.zzg = 1;
            if (i != 0) {
                if (i != 1) {
                    zza.zzb(1);
                } else {
                    zza.zzb(3);
                }
            } else {
                zza.zzb(2);
            }
            switch (i2) {
                case 1:
                case 2:
                case 4:
                case 7:
                case 11:
                case 16:
                    break;
                case 3:
                case 5:
                case 6:
                case 8:
                case 9:
                case 10:
                case 12:
                case 14:
                case 15:
                case 17:
                    i3 = 3;
                    break;
                case 13:
                    i3 = 5;
                    break;
                default:
                    i3 = 1;
                    break;
            }
            zza.zza(i3);
        }
        return (zzazz) zza.zzal();
    }

    public static /* bridge */ /* synthetic */ zzbai zzb(zzect zzectVar, Bundle bundle) {
        return (zzbai) zzb.get(zzfdz.zza(zzfdz.zza(bundle, "device"), "network").getInt("active_network_state", -1), zzbai.UNSPECIFIED);
    }

    public static /* bridge */ /* synthetic */ byte[] zze(zzect zzectVar, boolean z, ArrayList arrayList, zzazz zzazzVar, zzbai zzbaiVar) {
        boolean z2;
        zzbad zzg = zzbae.zzg();
        zzg.zza(arrayList);
        boolean z3 = false;
        if (Settings.Global.getInt(zzectVar.zzc.getContentResolver(), "airplane_mode_on", 0) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzg.zzi(zzg(z2));
        zzg.zzj(com.google.android.gms.ads.internal.zzt.zzq().zzj(zzectVar.zzc, zzectVar.zze));
        zzg.zzf(zzectVar.zzf.zze());
        zzg.zze(zzectVar.zzf.zzb());
        zzg.zzb(zzectVar.zzf.zza());
        zzg.zzc(zzbaiVar);
        zzg.zzd(zzazzVar);
        zzg.zzk(zzectVar.zzg);
        zzg.zzl(zzg(z));
        zzg.zzh(zzectVar.zzf.zzd());
        zzg.zzg(com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis());
        if (Settings.Global.getInt(zzectVar.zzc.getContentResolver(), "wifi_on", 0) != 0) {
            z3 = true;
        }
        zzg.zzm(zzg(z3));
        return ((zzbae) zzg.zzal()).zzax();
    }

    private static final int zzg(boolean z) {
        return z ? 2 : 1;
    }

    public final void zzd(boolean z) {
        zzfzt.zzr(this.zzd.zzb(), new zzecs(this, z), zzcbg.zzf);
    }
}
