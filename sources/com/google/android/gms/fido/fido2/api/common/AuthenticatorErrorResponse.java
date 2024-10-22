package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;

@SafeParcelable.Class(creator = "AuthenticatorErrorResponseCreator")
@SafeParcelable.Reserved({1})
/* loaded from: classes.dex */
public class AuthenticatorErrorResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorErrorResponse> CREATOR = new zzi();

    @SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode zza;

    @SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final String zzb;

    @SafeParcelable.Constructor
    public AuthenticatorErrorResponse(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        try {
            this.zza = ErrorCode.toErrorCode(i);
            this.zzb = str;
        } catch (ErrorCode.UnsupportedErrorCodeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static AuthenticatorErrorResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorErrorResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorErrorResponse)) {
            return false;
        }
        AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) obj;
        if (!Objects.equal(this.zza, authenticatorErrorResponse.zza) || !Objects.equal(this.zzb, authenticatorErrorResponse.zzb)) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        throw new UnsupportedOperationException();
    }

    public ErrorCode getErrorCode() {
        return this.zza;
    }

    public int getErrorCodeAsInt() {
        return this.zza.getCode();
    }

    public String getErrorMessage() {
        return this.zzb;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb);
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        com.google.android.gms.internal.fido.zzap zza = com.google.android.gms.internal.fido.zzaq.zza(this);
        zza.zza("errorCode", this.zza.getCode());
        String str = this.zzb;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 2, getErrorCodeAsInt());
        SafeParcelWriter.writeString(parcel, 3, getErrorMessage(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
