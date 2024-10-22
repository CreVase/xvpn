package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.util.Predicate;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzbmp implements zzbmh, zzbmf {
    private final zzcgb zza;

    /* JADX WARN: Multi-variable type inference failed */
    public zzbmp(Context context, zzcaz zzcazVar, zzaro zzaroVar, com.google.android.gms.ads.internal.zza zzaVar) throws zzcgm {
        com.google.android.gms.ads.internal.zzt.zzz();
        zzcgb zza = zzcgn.zza(context, zzchq.zza(), "", false, false, null, null, zzcazVar, null, null, null, zzaxv.zza(), null, null, null);
        this.zza = zza;
        ((View) zza).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        com.google.android.gms.ads.internal.client.zzay.zzb();
        if (zzcam.zzu()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzt.zza.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final void zza(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbml
            @Override // java.lang.Runnable
            public final void run() {
                zzbmp.this.zzm(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final /* synthetic */ void zzb(String str, String str2) {
        zzbme.zzc(this, str, str2);
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzc() {
        this.zza.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final /* synthetic */ void zzd(String str, Map map) {
        zzbme.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzbmd
    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbme.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzf(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmm
            @Override // java.lang.Runnable
            public final void run() {
                zzbmp.this.zzn(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzg(final String str) {
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmj
            @Override // java.lang.Runnable
            public final void run() {
                zzbmp.this.zzo(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzh(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        zzs(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmn
            @Override // java.lang.Runnable
            public final void run() {
                zzbmp.this.zzp(format);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final boolean zzi() {
        return this.zza.zzaz();
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final zzbno zzj() {
        return new zzbno(this);
    }

    @Override // com.google.android.gms.internal.ads.zzbmh
    public final void zzk(final zzbmv zzbmvVar) {
        this.zza.zzN().zzG(new zzchn() { // from class: com.google.android.gms.internal.ads.zzbmk
            @Override // com.google.android.gms.internal.ads.zzchn
            public final void zza() {
                long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
                zzbmv zzbmvVar2 = zzbmv.this;
                final long j = zzbmvVar2.zzc;
                final ArrayList arrayList = zzbmvVar2.zzb;
                arrayList.add(Long.valueOf(currentTimeMillis - j));
                com.google.android.gms.ads.internal.util.zze.zza("LoadNewJavascriptEngine(onEngLoaded) latency is " + String.valueOf(arrayList.get(0)) + " ms.");
                zzfps zzfpsVar = com.google.android.gms.ads.internal.util.zzt.zza;
                final zzbnm zzbnmVar = zzbmvVar2.zza;
                final zzbnl zzbnlVar = zzbmvVar2.zzd;
                final zzbmh zzbmhVar = zzbmvVar2.zze;
                zzfpsVar.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbnm.this.zzi(zzbnlVar, zzbmhVar, arrayList, j);
                    }
                }, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzc)).intValue());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbmq
    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbme.zzd(this, str, jSONObject);
    }

    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zzq(String str, zzbjj zzbjjVar) {
        this.zza.zzad(str, new zzbmo(this, zzbjjVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbnn
    public final void zzr(String str, final zzbjj zzbjjVar) {
        this.zza.zzav(str, new Predicate() { // from class: com.google.android.gms.internal.ads.zzbmi
            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzbjj zzbjjVar2;
                zzbjj zzbjjVar3 = (zzbjj) obj;
                if (zzbjjVar3 instanceof zzbmo) {
                    zzbjj zzbjjVar4 = zzbjj.this;
                    zzbjjVar2 = ((zzbmo) zzbjjVar3).zzb;
                    if (zzbjjVar2.equals(zzbjjVar4)) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
        });
    }
}
