package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "GassResponseParcelCreator")
/* loaded from: classes.dex */
public final class zzfoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoa> CREATOR = new zzfob();

    @SafeParcelable.VersionField(id = 1)
    public final int zza;

    @SafeParcelable.Field(getter = "getAfmaSignalsAsBytes", id = 2, type = "byte[]")
    private zzapj zzb = null;
    private byte[] zzc;

    @SafeParcelable.Constructor
    public zzfoa(@SafeParcelable.Param(id = 1) int i, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.zza = i;
        this.zzc = bArr;
        zzb();
    }

    private final void zzb() {
        zzapj zzapjVar = this.zzb;
        if (zzapjVar == null && this.zzc != null) {
            return;
        }
        if (zzapjVar != null && this.zzc == null) {
            return;
        }
        if (zzapjVar != null && this.zzc != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        }
        if (zzapjVar == null && this.zzc == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        }
        throw new IllegalStateException("Impossible");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i2);
        byte[] bArr = this.zzc;
        if (bArr == null) {
            bArr = this.zzb.zzax();
        }
        SafeParcelWriter.writeByteArray(parcel, 2, bArr, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzapj zza() {
        if (this.zzb == null) {
            try {
                this.zzb = zzapj.zze(this.zzc, zzgtl.zza());
                this.zzc = null;
            } catch (zzgul | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        zzb();
        return this.zzb;
    }
}
