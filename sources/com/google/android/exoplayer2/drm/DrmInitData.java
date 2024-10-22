package com.google.android.exoplayer2.drm;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.et;
import defpackage.p71;
import defpackage.v6;
import defpackage.wi3;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new v6(5);

    /* renamed from: a, reason: collision with root package name */
    public final SchemeData[] f1457a;

    /* renamed from: b, reason: collision with root package name */
    public int f1458b;
    public final String c;
    public final int d;

    public DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.c = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.f1457a = schemeDataArr;
        this.d = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    public final DrmInitData a(String str) {
        if (wi3.a(this.c, str)) {
            return this;
        }
        return new DrmInitData(str, false, this.f1457a);
    }

    @Override // java.util.Comparator
    public final int compare(SchemeData schemeData, SchemeData schemeData2) {
        SchemeData schemeData3 = schemeData;
        SchemeData schemeData4 = schemeData2;
        UUID uuid = et.f1988a;
        if (uuid.equals(schemeData3.f1460b)) {
            if (uuid.equals(schemeData4.f1460b)) {
                return 0;
            }
            return 1;
        }
        return schemeData3.f1460b.compareTo(schemeData4.f1460b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DrmInitData.class != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        if (wi3.a(this.c, drmInitData.c) && Arrays.equals(this.f1457a, drmInitData.f1457a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        if (this.f1458b == 0) {
            String str = this.c;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            this.f1458b = (hashCode * 31) + Arrays.hashCode(this.f1457a);
        }
        return this.f1458b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeTypedArray(this.f1457a, 0);
    }

    /* loaded from: classes.dex */
    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new c();

        /* renamed from: a, reason: collision with root package name */
        public int f1459a;

        /* renamed from: b, reason: collision with root package name */
        public final UUID f1460b;
        public final String c;
        public final String d;
        public final byte[] e;

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            uuid.getClass();
            this.f1460b = uuid;
            this.c = str;
            str2.getClass();
            this.d = str2;
            this.e = bArr;
        }

        public final boolean a(UUID uuid) {
            UUID uuid2 = et.f1988a;
            UUID uuid3 = this.f1460b;
            if (!uuid2.equals(uuid3) && !uuid.equals(uuid3)) {
                return false;
            }
            return true;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            if (!wi3.a(this.c, schemeData.c) || !wi3.a(this.d, schemeData.d) || !wi3.a(this.f1460b, schemeData.f1460b) || !Arrays.equals(this.e, schemeData.e)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int hashCode;
            if (this.f1459a == 0) {
                int hashCode2 = this.f1460b.hashCode() * 31;
                String str = this.c;
                if (str == null) {
                    hashCode = 0;
                } else {
                    hashCode = str.hashCode();
                }
                this.f1459a = Arrays.hashCode(this.e) + p71.h(this.d, (hashCode2 + hashCode) * 31, 31);
            }
            return this.f1459a;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            UUID uuid = this.f1460b;
            parcel.writeLong(uuid.getMostSignificantBits());
            parcel.writeLong(uuid.getLeastSignificantBits());
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeByteArray(this.e);
        }

        public SchemeData(Parcel parcel) {
            this.f1460b = new UUID(parcel.readLong(), parcel.readLong());
            this.c = parcel.readString();
            String readString = parcel.readString();
            int i = wi3.f5017a;
            this.d = readString;
            this.e = parcel.createByteArray();
        }
    }

    public DrmInitData(Parcel parcel) {
        this.c = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR);
        int i = wi3.f5017a;
        this.f1457a = schemeDataArr;
        this.d = schemeDataArr.length;
    }
}
