package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzfdl {
    private com.google.android.gms.ads.internal.client.zzl zza;
    private com.google.android.gms.ads.internal.client.zzq zzb;
    private String zzc;
    private com.google.android.gms.ads.internal.client.zzfl zzd;
    private boolean zze;
    private ArrayList zzf;
    private ArrayList zzg;
    private zzbfc zzh;
    private com.google.android.gms.ads.internal.client.zzw zzi;
    private AdManagerAdViewOptions zzj;
    private PublisherAdViewOptions zzk;
    private com.google.android.gms.ads.internal.client.zzcb zzl;
    private zzbls zzn;
    private zzemk zzq;
    private com.google.android.gms.ads.internal.client.zzcf zzs;
    private int zzm = 1;
    private final zzfcy zzo = new zzfcy();
    private boolean zzp = false;
    private boolean zzr = false;

    public static /* bridge */ /* synthetic */ String zzH(zzfdl zzfdlVar) {
        return zzfdlVar.zzc;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzJ(zzfdl zzfdlVar) {
        return zzfdlVar.zzf;
    }

    public static /* bridge */ /* synthetic */ ArrayList zzK(zzfdl zzfdlVar) {
        return zzfdlVar.zzg;
    }

    public static /* bridge */ /* synthetic */ boolean zzL(zzfdl zzfdlVar) {
        return zzfdlVar.zzp;
    }

    public static /* bridge */ /* synthetic */ boolean zzM(zzfdl zzfdlVar) {
        return zzfdlVar.zzr;
    }

    public static /* bridge */ /* synthetic */ boolean zzN(zzfdl zzfdlVar) {
        return zzfdlVar.zze;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcf zzP(zzfdl zzfdlVar) {
        return zzfdlVar.zzs;
    }

    public static /* bridge */ /* synthetic */ int zza(zzfdl zzfdlVar) {
        return zzfdlVar.zzm;
    }

    public static /* bridge */ /* synthetic */ AdManagerAdViewOptions zzb(zzfdl zzfdlVar) {
        return zzfdlVar.zzj;
    }

    public static /* bridge */ /* synthetic */ PublisherAdViewOptions zzc(zzfdl zzfdlVar) {
        return zzfdlVar.zzk;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzl zzd(zzfdl zzfdlVar) {
        return zzfdlVar.zza;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzq zzf(zzfdl zzfdlVar) {
        return zzfdlVar.zzb;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzw zzh(zzfdl zzfdlVar) {
        return zzfdlVar.zzi;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzcb zzi(zzfdl zzfdlVar) {
        return zzfdlVar.zzl;
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.ads.internal.client.zzfl zzj(zzfdl zzfdlVar) {
        return zzfdlVar.zzd;
    }

    public static /* bridge */ /* synthetic */ zzbfc zzk(zzfdl zzfdlVar) {
        return zzfdlVar.zzh;
    }

    public static /* bridge */ /* synthetic */ zzbls zzl(zzfdl zzfdlVar) {
        return zzfdlVar.zzn;
    }

    public static /* bridge */ /* synthetic */ zzemk zzm(zzfdl zzfdlVar) {
        return zzfdlVar.zzq;
    }

    public static /* bridge */ /* synthetic */ zzfcy zzn(zzfdl zzfdlVar) {
        return zzfdlVar.zzo;
    }

    public final zzfdl zzA(zzbfc zzbfcVar) {
        this.zzh = zzbfcVar;
        return this;
    }

    public final zzfdl zzB(ArrayList arrayList) {
        this.zzf = arrayList;
        return this;
    }

    public final zzfdl zzC(ArrayList arrayList) {
        this.zzg = arrayList;
        return this;
    }

    public final zzfdl zzD(PublisherAdViewOptions publisherAdViewOptions) {
        this.zzk = publisherAdViewOptions;
        if (publisherAdViewOptions != null) {
            this.zze = publisherAdViewOptions.zzc();
            this.zzl = publisherAdViewOptions.zza();
        }
        return this;
    }

    public final zzfdl zzE(com.google.android.gms.ads.internal.client.zzl zzlVar) {
        this.zza = zzlVar;
        return this;
    }

    public final zzfdl zzF(com.google.android.gms.ads.internal.client.zzfl zzflVar) {
        this.zzd = zzflVar;
        return this;
    }

    public final zzfdn zzG() {
        Preconditions.checkNotNull(this.zzc, "ad unit must not be null");
        Preconditions.checkNotNull(this.zzb, "ad size must not be null");
        Preconditions.checkNotNull(this.zza, "ad request must not be null");
        return new zzfdn(this, null);
    }

    public final String zzI() {
        return this.zzc;
    }

    public final boolean zzO() {
        return this.zzp;
    }

    public final zzfdl zzQ(com.google.android.gms.ads.internal.client.zzcf zzcfVar) {
        this.zzs = zzcfVar;
        return this;
    }

    public final com.google.android.gms.ads.internal.client.zzl zze() {
        return this.zza;
    }

    public final com.google.android.gms.ads.internal.client.zzq zzg() {
        return this.zzb;
    }

    public final zzfcy zzo() {
        return this.zzo;
    }

    public final zzfdl zzp(zzfdn zzfdnVar) {
        this.zzo.zza(zzfdnVar.zzo.zza);
        this.zza = zzfdnVar.zzd;
        this.zzb = zzfdnVar.zze;
        this.zzs = zzfdnVar.zzr;
        this.zzc = zzfdnVar.zzf;
        this.zzd = zzfdnVar.zza;
        this.zzf = zzfdnVar.zzg;
        this.zzg = zzfdnVar.zzh;
        this.zzh = zzfdnVar.zzi;
        this.zzi = zzfdnVar.zzj;
        zzq(zzfdnVar.zzl);
        zzD(zzfdnVar.zzm);
        this.zzp = zzfdnVar.zzp;
        this.zzq = zzfdnVar.zzc;
        this.zzr = zzfdnVar.zzq;
        return this;
    }

    public final zzfdl zzq(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zzj = adManagerAdViewOptions;
        if (adManagerAdViewOptions != null) {
            this.zze = adManagerAdViewOptions.getManualImpressionsEnabled();
        }
        return this;
    }

    public final zzfdl zzr(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        this.zzb = zzqVar;
        return this;
    }

    public final zzfdl zzs(String str) {
        this.zzc = str;
        return this;
    }

    public final zzfdl zzt(com.google.android.gms.ads.internal.client.zzw zzwVar) {
        this.zzi = zzwVar;
        return this;
    }

    public final zzfdl zzu(zzemk zzemkVar) {
        this.zzq = zzemkVar;
        return this;
    }

    public final zzfdl zzv(zzbls zzblsVar) {
        this.zzn = zzblsVar;
        this.zzd = new com.google.android.gms.ads.internal.client.zzfl(false, true, false);
        return this;
    }

    public final zzfdl zzw(boolean z) {
        this.zzp = z;
        return this;
    }

    public final zzfdl zzx(boolean z) {
        this.zzr = true;
        return this;
    }

    public final zzfdl zzy(boolean z) {
        this.zze = z;
        return this;
    }

    public final zzfdl zzz(int i) {
        this.zzm = i;
        return this;
    }
}
