package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.ft1;
import defpackage.p71;
import defpackage.v6;
import defpackage.wi3;
import defpackage.y01;

@Deprecated
/* loaded from: classes.dex */
public class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator<VorbisComment> CREATOR = new v6(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f1475a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1476b;

    public VorbisComment(String str, String str2) {
        this.f1475a = str;
        this.f1476b = str2;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ y01 c() {
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VorbisComment vorbisComment = (VorbisComment) obj;
        if (this.f1475a.equals(vorbisComment.f1475a) && this.f1476b.equals(vorbisComment.f1476b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f1476b.hashCode() + p71.h(this.f1475a, 527, 31);
    }

    public final String toString() {
        return "VC: " + this.f1475a + "=" + this.f1476b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void w(ft1 ft1Var) {
        char c;
        String str = this.f1475a;
        str.getClass();
        switch (str.hashCode()) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 79833656:
                if (str.equals("TITLE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c = 2;
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
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str2 = this.f1476b;
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    if (c != 3) {
                        if (c == 4) {
                            ft1Var.f2150b = str2;
                            return;
                        }
                        return;
                    }
                    ft1Var.d = str2;
                    return;
                }
                ft1Var.g = str2;
                return;
            }
            ft1Var.f2149a = str2;
            return;
        }
        ft1Var.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1475a);
        parcel.writeString(this.f1476b);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public VorbisComment(Parcel parcel) {
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1475a = readString;
        this.f1476b = parcel.readString();
    }
}
