package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.it1;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class zzatd extends zzaud {
    private static final zzaue zzi = new zzaue();
    private final Context zzj;

    public zzatd(zzasp zzaspVar, String str, String str2, zzaom zzaomVar, int i, int i2, Context context, zzaof zzaofVar) {
        super(zzaspVar, "p0JEft1H0Ux+/zQoofBGK8/hHhAdN3veKIjNmetX6I2+7J67s0tf2NBKaWy11XvI", "yaxGJhC1WxugM+8EfEc/xAIuDWtPkz77G//hU7f/vWw=", zzaomVar, i, 27);
        this.zzj = context;
    }

    private final String zzc() {
        try {
            if (this.zzb.zzl() != null) {
                this.zzb.zzl().get();
            }
            zzapj zzc = this.zzb.zzc();
            if (zzc != null && zzc.zzaj()) {
                return zzc.zzh();
            }
            return null;
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaud
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        Boolean bool;
        int i;
        boolean z;
        String str;
        zzaqa zzaqaVar;
        AtomicReference zza = zzi.zza(this.zzj.getPackageName());
        synchronized (zza) {
            zzaqa zzaqaVar2 = (zzaqa) zza.get();
            if (zzaqaVar2 == null || zzass.zzd(zzaqaVar2.zza) || zzaqaVar2.zza.equals("E") || zzaqaVar2.zza.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                if (!zzass.zzd(null)) {
                    i = 5;
                } else {
                    if (!zzass.zzd(null)) {
                        bool = Boolean.FALSE;
                    } else {
                        bool = Boolean.FALSE;
                    }
                    bool.booleanValue();
                    i = 3;
                }
                if (i == 3) {
                    z = true;
                } else {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                Boolean bool2 = (Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcj);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzci)).booleanValue()) {
                    str = zzb();
                } else {
                    str = null;
                }
                if (bool2.booleanValue() && this.zzb.zzp() && zzass.zzd(str)) {
                    str = zzc();
                }
                zzaqa zzaqaVar3 = new zzaqa((String) this.zzf.invoke(null, this.zzj, valueOf, str));
                if (zzass.zzd(zzaqaVar3.zza) || zzaqaVar3.zza.equals("E")) {
                    int i2 = i - 1;
                    if (i2 != 3) {
                        if (i2 == 4) {
                            throw null;
                        }
                    } else {
                        String zzc = zzc();
                        if (!zzass.zzd(zzc)) {
                            zzaqaVar3.zza = zzc;
                        }
                    }
                }
                zza.set(zzaqaVar3);
            }
            zzaqaVar = (zzaqa) zza.get();
        }
        synchronized (this.zze) {
            if (zzaqaVar != null) {
                this.zze.zzx(zzaqaVar.zza);
                this.zze.zzX(zzaqaVar.zzb);
                this.zze.zzZ(zzaqaVar.zzc);
                this.zze.zzi(zzaqaVar.zzd);
                this.zze.zzw(zzaqaVar.zze);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [com.google.android.gms.internal.ads.zzauf] */
    public final String zzb() {
        ArrayList arrayList;
        Context context;
        String packageName;
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] zzf = zzass.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzck));
            arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzf)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(zzass.zzf((String) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzcl)))));
            }
            context = this.zzj;
            packageName = context.getPackageName();
            this.zzb.zzk();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
        }
        if (Build.VERSION.SDK_INT > 30 || Build.VERSION.CODENAME.equals("S")) {
            final zzgal zze = zzgal.zze();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager.OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzauf
                @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
                public final void onChecksumsReady(List list) {
                    int type;
                    byte[] value;
                    zzgal zzgalVar = zzgal.this;
                    if (list == null) {
                        zzgalVar.zzc(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum c = it1.c(list.get(i));
                            type = c.getType();
                            if (type == 8) {
                                value = c.getValue();
                                zzgalVar.zzc(zzass.zzb(value));
                                return;
                            }
                        }
                        zzgalVar.zzc(null);
                    } catch (Throwable unused2) {
                        zzgalVar.zzc(null);
                    }
                }
            });
            return (String) zze.get();
        }
        return null;
    }
}
