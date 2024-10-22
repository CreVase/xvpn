package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.ml1;
import defpackage.uu2;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class zzdjj {
    private int zza;
    private com.google.android.gms.ads.internal.client.zzdq zzb;
    private zzbfg zzc;
    private View zzd;
    private List zze;
    private com.google.android.gms.ads.internal.client.zzel zzg;
    private Bundle zzh;
    private zzcgb zzi;
    private zzcgb zzj;
    private zzcgb zzk;
    private zzfkc zzl;
    private ml1 zzm;
    private zzcbl zzn;
    private View zzo;
    private View zzp;
    private IObjectWrapper zzq;
    private double zzr;
    private zzbfo zzs;
    private zzbfo zzt;
    private String zzu;
    private float zzx;
    private String zzy;
    private final uu2 zzv = new uu2();
    private final uu2 zzw = new uu2();
    private List zzf = Collections.emptyList();

    public static zzdjj zzag(zzbpi zzbpiVar) {
        try {
            zzdji zzak = zzak(zzbpiVar.zzg(), null);
            zzbfg zzh = zzbpiVar.zzh();
            View view = (View) zzam(zzbpiVar.zzj());
            String zzo = zzbpiVar.zzo();
            List zzr = zzbpiVar.zzr();
            String zzm = zzbpiVar.zzm();
            Bundle zzf = zzbpiVar.zzf();
            String zzn = zzbpiVar.zzn();
            View view2 = (View) zzam(zzbpiVar.zzk());
            IObjectWrapper zzl = zzbpiVar.zzl();
            String zzq = zzbpiVar.zzq();
            String zzp = zzbpiVar.zzp();
            double zze = zzbpiVar.zze();
            zzbfo zzi = zzbpiVar.zzi();
            zzdjj zzdjjVar = new zzdjj();
            zzdjjVar.zza = 2;
            zzdjjVar.zzb = zzak;
            zzdjjVar.zzc = zzh;
            zzdjjVar.zzd = view;
            zzdjjVar.zzZ("headline", zzo);
            zzdjjVar.zze = zzr;
            zzdjjVar.zzZ("body", zzm);
            zzdjjVar.zzh = zzf;
            zzdjjVar.zzZ("call_to_action", zzn);
            zzdjjVar.zzo = view2;
            zzdjjVar.zzq = zzl;
            zzdjjVar.zzZ("store", zzq);
            zzdjjVar.zzZ("price", zzp);
            zzdjjVar.zzr = zze;
            zzdjjVar.zzs = zzi;
            return zzdjjVar;
        } catch (RemoteException e) {
            zzcat.zzk("Failed to get native ad from app install ad mapper", e);
            return null;
        }
    }

    public static zzdjj zzah(zzbpj zzbpjVar) {
        try {
            zzdji zzak = zzak(zzbpjVar.zzf(), null);
            zzbfg zzg = zzbpjVar.zzg();
            View view = (View) zzam(zzbpjVar.zzi());
            String zzo = zzbpjVar.zzo();
            List zzp = zzbpjVar.zzp();
            String zzm = zzbpjVar.zzm();
            Bundle zze = zzbpjVar.zze();
            String zzn = zzbpjVar.zzn();
            View view2 = (View) zzam(zzbpjVar.zzj());
            IObjectWrapper zzk = zzbpjVar.zzk();
            String zzl = zzbpjVar.zzl();
            zzbfo zzh = zzbpjVar.zzh();
            zzdjj zzdjjVar = new zzdjj();
            zzdjjVar.zza = 1;
            zzdjjVar.zzb = zzak;
            zzdjjVar.zzc = zzg;
            zzdjjVar.zzd = view;
            zzdjjVar.zzZ("headline", zzo);
            zzdjjVar.zze = zzp;
            zzdjjVar.zzZ("body", zzm);
            zzdjjVar.zzh = zze;
            zzdjjVar.zzZ("call_to_action", zzn);
            zzdjjVar.zzo = view2;
            zzdjjVar.zzq = zzk;
            zzdjjVar.zzZ("advertiser", zzl);
            zzdjjVar.zzt = zzh;
            return zzdjjVar;
        } catch (RemoteException e) {
            zzcat.zzk("Failed to get native ad from content ad mapper", e);
            return null;
        }
    }

    public static zzdjj zzai(zzbpi zzbpiVar) {
        try {
            return zzal(zzak(zzbpiVar.zzg(), null), zzbpiVar.zzh(), (View) zzam(zzbpiVar.zzj()), zzbpiVar.zzo(), zzbpiVar.zzr(), zzbpiVar.zzm(), zzbpiVar.zzf(), zzbpiVar.zzn(), (View) zzam(zzbpiVar.zzk()), zzbpiVar.zzl(), zzbpiVar.zzq(), zzbpiVar.zzp(), zzbpiVar.zze(), zzbpiVar.zzi(), null, 0.0f);
        } catch (RemoteException e) {
            zzcat.zzk("Failed to get native ad assets from app install ad mapper", e);
            return null;
        }
    }

    public static zzdjj zzaj(zzbpj zzbpjVar) {
        try {
            return zzal(zzak(zzbpjVar.zzf(), null), zzbpjVar.zzg(), (View) zzam(zzbpjVar.zzi()), zzbpjVar.zzo(), zzbpjVar.zzp(), zzbpjVar.zzm(), zzbpjVar.zze(), zzbpjVar.zzn(), (View) zzam(zzbpjVar.zzj()), zzbpjVar.zzk(), null, null, -1.0d, zzbpjVar.zzh(), zzbpjVar.zzl(), 0.0f);
        } catch (RemoteException e) {
            zzcat.zzk("Failed to get native ad assets from content ad mapper", e);
            return null;
        }
    }

    private static zzdji zzak(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbpm zzbpmVar) {
        if (zzdqVar == null) {
            return null;
        }
        return new zzdji(zzdqVar, zzbpmVar);
    }

    private static zzdjj zzal(com.google.android.gms.ads.internal.client.zzdq zzdqVar, zzbfg zzbfgVar, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, IObjectWrapper iObjectWrapper, String str4, String str5, double d, zzbfo zzbfoVar, String str6, float f) {
        zzdjj zzdjjVar = new zzdjj();
        zzdjjVar.zza = 6;
        zzdjjVar.zzb = zzdqVar;
        zzdjjVar.zzc = zzbfgVar;
        zzdjjVar.zzd = view;
        zzdjjVar.zzZ("headline", str);
        zzdjjVar.zze = list;
        zzdjjVar.zzZ("body", str2);
        zzdjjVar.zzh = bundle;
        zzdjjVar.zzZ("call_to_action", str3);
        zzdjjVar.zzo = view2;
        zzdjjVar.zzq = iObjectWrapper;
        zzdjjVar.zzZ("store", str4);
        zzdjjVar.zzZ("price", str5);
        zzdjjVar.zzr = d;
        zzdjjVar.zzs = zzbfoVar;
        zzdjjVar.zzZ("advertiser", str6);
        zzdjjVar.zzR(f);
        return zzdjjVar;
    }

    private static Object zzam(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper == null) {
            return null;
        }
        return ObjectWrapper.unwrap(iObjectWrapper);
    }

    public static zzdjj zzt(zzbpm zzbpmVar) {
        try {
            return zzal(zzak(zzbpmVar.zzj(), zzbpmVar), zzbpmVar.zzk(), (View) zzam(zzbpmVar.zzm()), zzbpmVar.zzs(), zzbpmVar.zzv(), zzbpmVar.zzq(), zzbpmVar.zzi(), zzbpmVar.zzr(), (View) zzam(zzbpmVar.zzn()), zzbpmVar.zzo(), zzbpmVar.zzu(), zzbpmVar.zzt(), zzbpmVar.zze(), zzbpmVar.zzl(), zzbpmVar.zzp(), zzbpmVar.zzf());
        } catch (RemoteException e) {
            zzcat.zzk("Failed to get native ad assets from unified ad mapper", e);
            return null;
        }
    }

    public final synchronized String zzA() {
        return this.zzu;
    }

    public final synchronized String zzB() {
        return zzF("headline");
    }

    public final synchronized String zzC() {
        return this.zzy;
    }

    public final synchronized String zzD() {
        return zzF("price");
    }

    public final synchronized String zzE() {
        return zzF("store");
    }

    public final synchronized String zzF(String str) {
        return (String) this.zzw.getOrDefault(str, null);
    }

    public final synchronized List zzG() {
        return this.zze;
    }

    public final synchronized List zzH() {
        return this.zzf;
    }

    public final synchronized void zzI() {
        zzcgb zzcgbVar = this.zzi;
        if (zzcgbVar != null) {
            zzcgbVar.destroy();
            this.zzi = null;
        }
        zzcgb zzcgbVar2 = this.zzj;
        if (zzcgbVar2 != null) {
            zzcgbVar2.destroy();
            this.zzj = null;
        }
        zzcgb zzcgbVar3 = this.zzk;
        if (zzcgbVar3 != null) {
            zzcgbVar3.destroy();
            this.zzk = null;
        }
        ml1 ml1Var = this.zzm;
        if (ml1Var != null) {
            ml1Var.cancel(false);
            this.zzm = null;
        }
        zzcbl zzcblVar = this.zzn;
        if (zzcblVar != null) {
            zzcblVar.cancel(false);
            this.zzn = null;
        }
        this.zzl = null;
        this.zzv.clear();
        this.zzw.clear();
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzh = null;
        this.zzo = null;
        this.zzp = null;
        this.zzq = null;
        this.zzs = null;
        this.zzt = null;
        this.zzu = null;
    }

    public final synchronized void zzJ(zzbfg zzbfgVar) {
        this.zzc = zzbfgVar;
    }

    public final synchronized void zzK(String str) {
        this.zzu = str;
    }

    public final synchronized void zzL(com.google.android.gms.ads.internal.client.zzel zzelVar) {
        this.zzg = zzelVar;
    }

    public final synchronized void zzM(zzbfo zzbfoVar) {
        this.zzs = zzbfoVar;
    }

    public final synchronized void zzN(String str, zzbfa zzbfaVar) {
        if (zzbfaVar == null) {
            this.zzv.remove(str);
        } else {
            this.zzv.put(str, zzbfaVar);
        }
    }

    public final synchronized void zzO(zzcgb zzcgbVar) {
        this.zzj = zzcgbVar;
    }

    public final synchronized void zzP(List list) {
        this.zze = list;
    }

    public final synchronized void zzQ(zzbfo zzbfoVar) {
        this.zzt = zzbfoVar;
    }

    public final synchronized void zzR(float f) {
        this.zzx = f;
    }

    public final synchronized void zzS(List list) {
        this.zzf = list;
    }

    public final synchronized void zzT(zzcgb zzcgbVar) {
        this.zzk = zzcgbVar;
    }

    public final synchronized void zzU(ml1 ml1Var) {
        this.zzm = ml1Var;
    }

    public final synchronized void zzV(String str) {
        this.zzy = str;
    }

    public final synchronized void zzW(zzfkc zzfkcVar) {
        this.zzl = zzfkcVar;
    }

    public final synchronized void zzX(zzcbl zzcblVar) {
        this.zzn = zzcblVar;
    }

    public final synchronized void zzY(double d) {
        this.zzr = d;
    }

    public final synchronized void zzZ(String str, String str2) {
        if (str2 == null) {
            this.zzw.remove(str);
        } else {
            this.zzw.put(str, str2);
        }
    }

    public final synchronized double zza() {
        return this.zzr;
    }

    public final synchronized void zzaa(int i) {
        this.zza = i;
    }

    public final synchronized void zzab(com.google.android.gms.ads.internal.client.zzdq zzdqVar) {
        this.zzb = zzdqVar;
    }

    public final synchronized void zzac(View view) {
        this.zzo = view;
    }

    public final synchronized void zzad(zzcgb zzcgbVar) {
        this.zzi = zzcgbVar;
    }

    public final synchronized void zzae(View view) {
        this.zzp = view;
    }

    public final synchronized boolean zzaf() {
        return this.zzj != null;
    }

    public final synchronized float zzb() {
        return this.zzx;
    }

    public final synchronized int zzc() {
        return this.zza;
    }

    public final synchronized Bundle zzd() {
        if (this.zzh == null) {
            this.zzh = new Bundle();
        }
        return this.zzh;
    }

    public final synchronized View zze() {
        return this.zzd;
    }

    public final synchronized View zzf() {
        return this.zzo;
    }

    public final synchronized View zzg() {
        return this.zzp;
    }

    public final synchronized uu2 zzh() {
        return this.zzv;
    }

    public final synchronized uu2 zzi() {
        return this.zzw;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzdq zzj() {
        return this.zzb;
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzel zzk() {
        return this.zzg;
    }

    public final synchronized zzbfg zzl() {
        return this.zzc;
    }

    public final zzbfo zzm() {
        List list = this.zze;
        if (list != null && !list.isEmpty()) {
            Object obj = this.zze.get(0);
            if (obj instanceof IBinder) {
                return zzbfn.zzg((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized zzbfo zzn() {
        return this.zzs;
    }

    public final synchronized zzbfo zzo() {
        return this.zzt;
    }

    public final synchronized zzcbl zzp() {
        return this.zzn;
    }

    public final synchronized zzcgb zzq() {
        return this.zzj;
    }

    public final synchronized zzcgb zzr() {
        return this.zzk;
    }

    public final synchronized zzcgb zzs() {
        return this.zzi;
    }

    public final synchronized zzfkc zzu() {
        return this.zzl;
    }

    public final synchronized IObjectWrapper zzv() {
        return this.zzq;
    }

    public final synchronized ml1 zzw() {
        return this.zzm;
    }

    public final synchronized String zzx() {
        return zzF("advertiser");
    }

    public final synchronized String zzy() {
        return zzF("body");
    }

    public final synchronized String zzz() {
        return zzF("call_to_action");
    }
}
