package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.ml1;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaxp implements BaseGmsClient.BaseConnectionCallbacks {
    public static final /* synthetic */ int zzd = 0;
    final /* synthetic */ zzaxh zza;
    final /* synthetic */ zzcbl zzb;
    final /* synthetic */ zzaxr zzc;

    public zzaxp(zzaxr zzaxrVar, zzaxh zzaxhVar, zzcbl zzcblVar) {
        this.zzc = zzaxrVar;
        this.zza = zzaxhVar;
        this.zzb = zzcblVar;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        Object obj;
        boolean z;
        final zzaxg zzaxgVar;
        obj = this.zzc.zzd;
        synchronized (obj) {
            zzaxr zzaxrVar = this.zzc;
            z = zzaxrVar.zzb;
            if (!z) {
                zzaxrVar.zzb = true;
                zzaxgVar = this.zzc.zza;
                if (zzaxgVar == null) {
                    return;
                }
                zzgad zzgadVar = zzcbg.zza;
                final zzaxh zzaxhVar = this.zza;
                final zzcbl zzcblVar = this.zzb;
                final ml1 zza = zzgadVar.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzaxe zzf;
                        zzaxp zzaxpVar = zzaxp.this;
                        zzaxg zzaxgVar2 = zzaxgVar;
                        zzcbl zzcblVar2 = zzcblVar;
                        try {
                            zzaxj zzq = zzaxgVar2.zzq();
                            boolean zzp = zzaxgVar2.zzp();
                            zzaxh zzaxhVar2 = zzaxhVar;
                            if (zzp) {
                                zzf = zzq.zzg(zzaxhVar2);
                            } else {
                                zzf = zzq.zzf(zzaxhVar2);
                            }
                            if (!zzf.zze()) {
                                zzcblVar2.zzd(new RuntimeException("No entry contents."));
                                zzaxr.zze(zzaxpVar.zzc);
                                return;
                            }
                            zzaxo zzaxoVar = new zzaxo(zzaxpVar, zzf.zzc(), 1);
                            int read = zzaxoVar.read();
                            if (read != -1) {
                                zzaxoVar.unread(read);
                                zzcblVar2.zzc(zzaxt.zzb(zzaxoVar, zzf.zzd(), zzf.zzg(), zzf.zza(), zzf.zzf()));
                                return;
                            }
                            throw new IOException("Unable to read from cache.");
                        } catch (RemoteException | IOException e) {
                            zzcat.zzh("Unable to obtain a cache service instance.", e);
                            zzcblVar2.zzd(e);
                            zzaxr.zze(zzaxpVar.zzc);
                        }
                    }
                });
                final zzcbl zzcblVar2 = this.zzb;
                zzcblVar2.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzaxn
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (zzcbl.this.isCancelled()) {
                            zza.cancel(true);
                        }
                    }
                }, zzcbg.zzf);
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnectionSuspended(int i) {
    }
}
