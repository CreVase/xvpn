package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzbl;
import java.util.Arrays;

@SafeParcelable.Class(creator = "AuthenticatorAttestationResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzh();

    @SafeParcelable.Field(getter = "getKeyHandle", id = 2)
    private final byte[] zza;

    @SafeParcelable.Field(getter = "getClientDataJSON", id = 3)
    private final byte[] zzb;

    @SafeParcelable.Field(getter = "getAttestationObject", id = 4)
    private final byte[] zzc;

    @SafeParcelable.Field(getter = "getTransports", id = 5)
    private final String[] zzd;

    @SafeParcelable.Constructor
    public AuthenticatorAttestationResponse(@SafeParcelable.Param(id = 2) byte[] bArr, @SafeParcelable.Param(id = 3) byte[] bArr2, @SafeParcelable.Param(id = 4) byte[] bArr3, @SafeParcelable.Param(id = 5) String[] strArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    public static AuthenticatorAttestationResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        if (!Arrays.equals(this.zza, authenticatorAttestationResponse.zza) || !Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) || !Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc)) {
            return false;
        }
        return true;
    }

    public byte[] getAttestationObject() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        com.google.android.gms.internal.fido.zzap zza = com.google.android.gms.internal.fido.zzaq.zza(this);
        zzbl zzd = zzbl.zzd();
        byte[] bArr = this.zza;
        zza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzd.zze(bArr, 0, bArr.length));
        zzbl zzd2 = zzbl.zzd();
        byte[] bArr2 = this.zzb;
        zza.zzb("clientDataJSON", zzd2.zze(bArr2, 0, bArr2.length));
        zzbl zzd3 = zzbl.zzd();
        byte[] bArr3 = this.zzc;
        zza.zzb("attestationObject", zzd3.zze(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
