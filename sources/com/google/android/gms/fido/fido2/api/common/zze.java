package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AuthenticationExtensionsDevicePublicKeyOutputsCreator")
/* loaded from: classes.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    @SafeParcelable.Field(getter = "getSignature", id = 1)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getAuthenticatorOutput", id = 2)
    private final byte[] zzb;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) byte[] bArr, @SafeParcelable.Param(id = 2) byte[] bArr2) {
        this.zza = bArr;
        this.zzb = bArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 1, this.zza, false);
        SafeParcelWriter.writeByteArray(parcel, 2, this.zzb, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
