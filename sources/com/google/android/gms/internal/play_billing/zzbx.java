package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzbx;
import com.google.android.gms.internal.play_billing.zzcb;

/* loaded from: classes2.dex */
public class zzbx<MessageType extends zzcb<MessageType, BuilderType>, BuilderType extends zzbx<MessageType, BuilderType>> extends zzaj<MessageType, BuilderType> {
    protected zzcb zza;
    private final zzcb zzb;

    public zzbx(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzt()) {
            this.zza = messagetype.zzi();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaj
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzbx clone() {
        zzbx zzbxVar = (zzbx) this.zzb.zzu(5, null, null);
        zzbxVar.zza = zze();
        return zzbxVar;
    }

    public final MessageType zzc() {
        MessageType zze = zze();
        if (zze.zzs()) {
            return zze;
        }
        throw new zzef(zze);
    }

    @Override // com.google.android.gms.internal.play_billing.zzde
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public MessageType zze() {
        if (!this.zza.zzt()) {
            return (MessageType) this.zza;
        }
        this.zza.zzn();
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdg
    public final /* bridge */ /* synthetic */ zzdf zzf() {
        throw null;
    }

    public final void zzg() {
        if (!this.zza.zzt()) {
            zzh();
        }
    }

    public void zzh() {
        zzcb zzi = this.zzb.zzi();
        zzdn.zza().zzb(zzi.getClass()).zzg(zzi, this.zza);
        this.zza = zzi;
    }
}
