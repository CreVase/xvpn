package com.google.android.exoplayer2.offline;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cp3;
import defpackage.dz2;
import defpackage.wi3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class DownloadRequest implements Parcelable {
    public static final Parcelable.Creator<DownloadRequest> CREATOR = new dz2(3);

    /* renamed from: a, reason: collision with root package name */
    public final String f1509a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f1510b;
    public final String c;
    public final List d;
    public final byte[] e;
    public final String f;
    public final byte[] g;

    public DownloadRequest(String str, Uri uri, String str2, List list, byte[] bArr, String str3, byte[] bArr2) {
        int y = wi3.y(uri, str2);
        if (y == 0 || y == 2 || y == 1) {
            cp3.f(str3 == null, "customCacheKey must be null for type: " + y);
        }
        this.f1509a = str;
        this.f1510b = uri;
        this.c = str2;
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList);
        this.d = Collections.unmodifiableList(arrayList);
        this.e = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
        this.f = str3;
        this.g = bArr2 != null ? Arrays.copyOf(bArr2, bArr2.length) : wi3.f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof DownloadRequest)) {
            return false;
        }
        DownloadRequest downloadRequest = (DownloadRequest) obj;
        if (!this.f1509a.equals(downloadRequest.f1509a) || !this.f1510b.equals(downloadRequest.f1510b) || !wi3.a(this.c, downloadRequest.c) || !this.d.equals(downloadRequest.d) || !Arrays.equals(this.e, downloadRequest.e) || !wi3.a(this.f, downloadRequest.f) || !Arrays.equals(this.g, downloadRequest.g)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f1510b.hashCode() + (this.f1509a.hashCode() * 31 * 31)) * 31;
        int i2 = 0;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode2 = (Arrays.hashCode(this.e) + ((this.d.hashCode() + ((hashCode + i) * 31)) * 31)) * 31;
        String str2 = this.f;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Arrays.hashCode(this.g) + ((hashCode2 + i2) * 31);
    }

    public final String toString() {
        return this.c + ":" + this.f1509a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1509a);
        parcel.writeString(this.f1510b.toString());
        parcel.writeString(this.c);
        List list = this.d;
        parcel.writeInt(list.size());
        for (int i2 = 0; i2 < list.size(); i2++) {
            parcel.writeParcelable((Parcelable) list.get(i2), 0);
        }
        parcel.writeByteArray(this.e);
        parcel.writeString(this.f);
        parcel.writeByteArray(this.g);
    }

    public DownloadRequest(Parcel parcel) {
        String readString = parcel.readString();
        int i = wi3.f5017a;
        this.f1509a = readString;
        this.f1510b = Uri.parse(parcel.readString());
        this.c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add((StreamKey) parcel.readParcelable(StreamKey.class.getClassLoader()));
        }
        this.d = Collections.unmodifiableList(arrayList);
        this.e = parcel.createByteArray();
        this.f = parcel.readString();
        this.g = parcel.createByteArray();
    }
}
