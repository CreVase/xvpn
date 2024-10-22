package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

@Deprecated
/* loaded from: classes.dex */
public class zzaeo implements zzbx {
    public static final Parcelable.Creator<zzaeo> CREATOR = new zzaen();
    public final String zza;
    public final String zzb;

    public zzaeo(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaeo zzaeoVar = (zzaeo) obj;
            if (this.zza.equals(zzaeoVar.zza) && this.zzb.equals(zzaeoVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() + 527;
        return this.zzb.hashCode() + (hashCode * 31);
    }

    public final String toString() {
        return "VC: " + this.zza + "=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.ads.zzbx
    public final void zza(zzbt zzbtVar) {
        char c;
        String str = this.zza;
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c != 4) {
                            return;
                        }
                        zzbtVar.zzh(this.zzb);
                        return;
                    }
                    zzbtVar.zzc(this.zzb);
                    return;
                }
                zzbtVar.zzd(this.zzb);
                return;
            }
            zzbtVar.zze(this.zzb);
            return;
        }
        zzbtVar.zzq(this.zzb);
    }

    public zzaeo(Parcel parcel) {
        String readString = parcel.readString();
        int i = zzfk.zza;
        this.zza = readString;
        this.zzb = parcel.readString();
    }
}
