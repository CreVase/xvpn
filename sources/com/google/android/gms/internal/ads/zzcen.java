package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.api.Releasable;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzcen implements Releasable {
    protected final Context zza;
    protected final String zzb;
    protected final WeakReference zzc;

    public zzcen(zzcdc zzcdcVar) {
        Context context = zzcdcVar.getContext();
        this.zza = context;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzp().zzc(context, zzcdcVar.zzn().zza);
        this.zzc = new WeakReference(zzcdcVar);
    }

    public static /* bridge */ /* synthetic */ void zze(zzcen zzcenVar, String str, Map map) {
        zzcdc zzcdcVar = (zzcdc) zzcenVar.zzc.get();
        if (zzcdcVar != null) {
            zzcdcVar.zzd("onPrecacheEvent", map);
        }
    }

    @Override // com.google.android.gms.common.api.Releasable
    public void release() {
    }

    public abstract void zzf();

    public final void zzg(String str, String str2, String str3, String str4) {
        zzcam.zza.post(new zzcem(this, str, str2, str3, str4));
    }

    public final void zzh(String str, String str2, int i) {
        zzcam.zza.post(new zzcek(this, str, str2, i));
    }

    public final void zzj(String str, String str2, long j) {
        zzcam.zza.post(new zzcel(this, str, str2, j));
    }

    public final void zzn(String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        zzcam.zza.post(new zzcej(this, str, str2, i, i2, j, j2, z, i3, i4));
    }

    public final void zzo(String str, String str2, long j, long j2, boolean z, long j3, long j4, long j5, int i, int i2) {
        zzcam.zza.post(new zzcei(this, str, str2, j, j2, j3, j4, j5, z, i, i2));
    }

    public void zzp(int i) {
    }

    public void zzq(int i) {
    }

    public void zzr(int i) {
    }

    public void zzs(int i) {
    }

    public abstract boolean zzt(String str);

    public boolean zzu(String str, String[] strArr) {
        return zzt(str);
    }

    public boolean zzw(String str, String[] strArr, zzcef zzcefVar) {
        return zzt(str);
    }
}
