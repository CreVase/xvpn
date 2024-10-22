package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import android.view.SurfaceHolder;
import android.view.TextureView;

/* loaded from: classes.dex */
final class zzjx implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, zzaad, zzpc, zzwa, zzsw, zzia, zzhw, zzim {
    public static final /* synthetic */ int zzb = 0;
    final /* synthetic */ zzkb zza;

    public /* synthetic */ zzjx(zzkb zzkbVar, zzjw zzjwVar) {
        this.zza = zzkbVar;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkb.zzP(this.zza, surfaceTexture);
        zzkb.zzN(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzkb.zzQ(this.zza, null);
        zzkb.zzN(this.zza, 0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        zzkb.zzN(this.zza, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        zzkb.zzN(this.zza, i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        zzkb.zzN(this.zza, 0, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzim
    public final void zza(boolean z) {
        zzkb.zzS(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzb(Exception exc) {
        zzkb.zzF(this.zza).zzv(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzc(String str, long j, long j2) {
        zzkb.zzF(this.zza).zzw(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzd(String str) {
        zzkb.zzF(this.zza).zzx(str);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zze(zzid zzidVar) {
        zzkb.zzF(this.zza).zzy(zzidVar);
        zzkb.zzI(this.zza, null);
        zzkb.zzH(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzf(zzid zzidVar) {
        zzkb.zzH(this.zza, zzidVar);
        zzkb.zzF(this.zza).zzz(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzg(zzam zzamVar, zzie zzieVar) {
        zzkb.zzI(this.zza, zzamVar);
        zzkb.zzF(this.zza).zzA(zzamVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzh(long j) {
        zzkb.zzF(this.zza).zzB(j);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzi(Exception exc) {
        zzkb.zzF(this.zza).zzC(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzj(int i, long j, long j2) {
        zzkb.zzF(this.zza).zzD(i, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzk(int i, long j) {
        zzkb.zzF(this.zza).zzE(i, j);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzl(Object obj, long j) {
        zzkb.zzF(this.zza).zzF(obj, j);
        zzkb zzkbVar = this.zza;
        if (zzkb.zzG(zzkbVar) == obj) {
            zzeo zzD = zzkb.zzD(zzkbVar);
            zzD.zzd(26, new zzel() { // from class: com.google.android.gms.internal.ads.zzjv
                @Override // com.google.android.gms.internal.ads.zzel
                public final void zza(Object obj2) {
                }
            });
            zzD.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpc
    public final void zzm(final boolean z) {
        zzkb zzkbVar = this.zza;
        if (zzkb.zzW(zzkbVar) == z) {
            return;
        }
        zzkb.zzJ(zzkbVar, z);
        zzeo zzD = zzkb.zzD(this.zza);
        zzD.zzd(23, new zzel() { // from class: com.google.android.gms.internal.ads.zzjt
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcl) obj).zzn(z);
            }
        });
        zzD.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzn(Exception exc) {
        zzkb.zzF(this.zza).zzG(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzo(String str, long j, long j2) {
        zzkb.zzF(this.zza).zzH(str, j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzp(String str) {
        zzkb.zzF(this.zza).zzI(str);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzq(zzid zzidVar) {
        zzkb.zzF(this.zza).zzJ(zzidVar);
        zzkb.zzL(this.zza, null);
        zzkb.zzK(this.zza, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzr(zzid zzidVar) {
        zzkb.zzK(this.zza, zzidVar);
        zzkb.zzF(this.zza).zzK(zzidVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzs(long j, int i) {
        zzkb.zzF(this.zza).zzL(j, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzt(zzam zzamVar, zzie zzieVar) {
        zzkb.zzL(this.zza, zzamVar);
        zzkb.zzF(this.zza).zzM(zzamVar, zzieVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaad
    public final void zzu(final zzdm zzdmVar) {
        zzkb.zzM(this.zza, zzdmVar);
        zzeo zzD = zzkb.zzD(this.zza);
        zzD.zzd(25, new zzel() { // from class: com.google.android.gms.internal.ads.zzju
            @Override // com.google.android.gms.internal.ads.zzel
            public final void zza(Object obj) {
                ((zzcl) obj).zzr(zzdm.this);
            }
        });
        zzD.zzc();
    }
}
