package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.fido.zzap;
import com.google.android.gms.internal.fido.zzaq;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "ErrorResponseDataCreator")
@SafeParcelable.Reserved({1})
@Deprecated
/* loaded from: classes.dex */
public class ErrorResponseData extends ResponseData {
    public static final Parcelable.Creator<ErrorResponseData> CREATOR = new zzd();

    @VisibleForTesting
    public static final String JSON_ERROR_CODE = "errorCode";

    @VisibleForTesting
    public static final String JSON_ERROR_MESSAGE = "errorMessage";

    @SafeParcelable.Field(getter = "getErrorCodeAsInt", id = 2, type = "int")
    private final ErrorCode zza;

    @SafeParcelable.Field(getter = "getErrorMessage", id = 3)
    private final String zzb;

    @SafeParcelable.Constructor
    public ErrorResponseData(@SafeParcelable.Param(id = 2) int i, @SafeParcelable.Param(id = 3) String str) {
        this.zza = ErrorCode.toErrorCode(i);
        this.zzb = str;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ErrorResponseData)) {
            return false;
        }
        ErrorResponseData errorResponseData = (ErrorResponseData) obj;
        if (!Objects.equal(this.zza, errorResponseData.zza) || !Objects.equal(this.zzb, errorResponseData.zzb)) {
            return false;
        }
        return true;
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

    @Override // com.google.android.gms.fido.u2f.api.common.ResponseData
    public final JSONObject toJsonObject() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", this.zza.getCode());
            String str = this.zzb;
            if (str != null) {
                jSONObject.put("errorMessage", str);
            }
            return jSONObject;
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public String toString() {
        zzap zza = zzaq.zza(this);
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

    public ErrorResponseData(ErrorCode errorCode) {
        this.zza = (ErrorCode) Preconditions.checkNotNull(errorCode);
        this.zzb = null;
    }

    public ErrorResponseData(ErrorCode errorCode, String str) {
        this.zza = (ErrorCode) Preconditions.checkNotNull(errorCode);
        this.zzb = str;
    }
}
