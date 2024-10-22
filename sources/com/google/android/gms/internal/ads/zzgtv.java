package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgtv;
import com.google.android.gms.internal.ads.zzgtz;
import java.io.IOException;

/* loaded from: classes.dex */
public class zzgtv<MessageType extends zzgtz<MessageType, BuilderType>, BuilderType extends zzgtv<MessageType, BuilderType>> extends zzgrz<MessageType, BuilderType> {
    protected zzgtz zza;
    private final zzgtz zzb;

    public zzgtv(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzaY()) {
            this.zza = messagetype.zzaD();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    private static void zza(Object obj, Object obj2) {
        zzgvr.zza().zzb(obj.getClass()).zzg(obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.zzgrz
    /* renamed from: zzai, reason: merged with bridge method [inline-methods] */
    public final zzgtv clone() {
        zzgtv zzgtvVar = (zzgtv) this.zzb.zzb(5, null, null);
        zzgtvVar.zza = zzan();
        return zzgtvVar;
    }

    public final zzgtv zzaj(zzgtz zzgtzVar) {
        if (!this.zzb.equals(zzgtzVar)) {
            if (!this.zza.zzaY()) {
                zzaq();
            }
            zza(this.zza, zzgtzVar);
        }
        return this;
    }

    public final zzgtv zzak(byte[] bArr, int i, int i2, zzgtl zzgtlVar) throws zzgul {
        if (!this.zza.zzaY()) {
            zzaq();
        }
        try {
            zzgvr.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, 0, i2, new zzgsd(zzgtlVar));
            return this;
        } catch (zzgul e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzgul.zzj();
        }
    }

    public final MessageType zzal() {
        MessageType zzan = zzan();
        if (zzan.zzaX()) {
            return zzan;
        }
        throw new zzgws(zzan);
    }

    @Override // com.google.android.gms.internal.ads.zzgvi
    /* renamed from: zzam, reason: merged with bridge method [inline-methods] */
    public MessageType zzan() {
        if (!this.zza.zzaY()) {
            return (MessageType) this.zza;
        }
        this.zza.zzaS();
        return (MessageType) this.zza;
    }

    public final void zzap() {
        if (!this.zza.zzaY()) {
            zzaq();
        }
    }

    public void zzaq() {
        zzgtz zzaD = this.zzb.zzaD();
        zza(zzaD, this.zza);
        this.zza = zzaD;
    }

    @Override // com.google.android.gms.internal.ads.zzgvk
    public final /* synthetic */ zzgvj zzbf() {
        throw null;
    }
}
