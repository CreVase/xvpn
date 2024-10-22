package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import defpackage.cp3;
import defpackage.ft1;
import defpackage.v6;
import defpackage.wi3;
import defpackage.y01;

/* loaded from: classes.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new v6(11);

    /* renamed from: a, reason: collision with root package name */
    public final int f1477a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1478b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;

    public IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        cp3.e(i2 == -1 || i2 > 0);
        this.f1477a = i;
        this.f1478b = str;
        this.c = str2;
        this.d = str3;
        this.e = z;
        this.f = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.exoplayer2.metadata.icy.IcyHeaders a(java.util.Map r11) {
        /*
            java.lang.String r0 = "icy-br"
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 == 0) goto L2b
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L24
            int r0 = r0 * 1000
            if (r0 <= 0) goto L1d
            r4 = 1
            goto L22
        L1d:
            defpackage.sn1.f()     // Catch: java.lang.NumberFormatException -> L25
            r0 = -1
            r4 = 0
        L22:
            r5 = r0
            goto L2d
        L24:
            r0 = -1
        L25:
            defpackage.sn1.f()
            r5 = r0
            r4 = 0
            goto L2d
        L2b:
            r4 = 0
            r5 = -1
        L2d:
            java.lang.String r0 = "icy-genre"
            java.lang.Object r0 = r11.get(r0)
            java.util.List r0 = (java.util.List) r0
            r6 = 0
            if (r0 == 0) goto L40
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            r4 = 1
            goto L41
        L40:
            r0 = r6
        L41:
            java.lang.String r7 = "icy-name"
            java.lang.Object r7 = r11.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L54
            java.lang.Object r4 = r7.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r7 = r4
            r4 = 1
            goto L55
        L54:
            r7 = r6
        L55:
            java.lang.String r8 = "icy-url"
            java.lang.Object r8 = r11.get(r8)
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L68
            java.lang.Object r4 = r8.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            r8 = r4
            r4 = 1
            goto L69
        L68:
            r8 = r6
        L69:
            java.lang.String r9 = "icy-pub"
            java.lang.Object r9 = r11.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L82
            java.lang.Object r4 = r9.get(r2)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r9 = "1"
            boolean r4 = r4.equals(r9)
            r9 = r4
            r4 = 1
            goto L83
        L82:
            r9 = 0
        L83:
            java.lang.String r10 = "icy-metaint"
            java.lang.Object r11 = r11.get(r10)
            java.util.List r11 = (java.util.List) r11
            if (r11 == 0) goto La7
            java.lang.Object r11 = r11.get(r2)
            java.lang.String r11 = (java.lang.String) r11
            int r11 = java.lang.Integer.parseInt(r11)     // Catch: java.lang.NumberFormatException -> La2
            if (r11 <= 0) goto L9b
            r3 = r11
            goto L9f
        L9b:
            defpackage.sn1.f()     // Catch: java.lang.NumberFormatException -> La1
            r1 = r4
        L9f:
            r4 = r1
            goto La5
        La1:
            r3 = r11
        La2:
            defpackage.sn1.f()
        La5:
            r10 = r3
            goto La8
        La7:
            r10 = -1
        La8:
            if (r4 == 0) goto Lb2
            com.google.android.exoplayer2.metadata.icy.IcyHeaders r11 = new com.google.android.exoplayer2.metadata.icy.IcyHeaders
            r4 = r11
            r6 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r6 = r11
        Lb2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.metadata.icy.IcyHeaders.a(java.util.Map):com.google.android.exoplayer2.metadata.icy.IcyHeaders");
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
        if (obj == null || IcyHeaders.class != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        if (this.f1477a == icyHeaders.f1477a && wi3.a(this.f1478b, icyHeaders.f1478b) && wi3.a(this.c, icyHeaders.c) && wi3.a(this.d, icyHeaders.d) && this.e == icyHeaders.e && this.f == icyHeaders.f) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.f1477a) * 31;
        int i4 = 0;
        String str = this.f1478b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.e ? 1 : 0)) * 31) + this.f;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.c + "\", genre=\"" + this.f1478b + "\", bitrate=" + this.f1477a + ", metadataInterval=" + this.f;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void w(ft1 ft1Var) {
        String str = this.c;
        if (str != null) {
            ft1Var.E = str;
        }
        String str2 = this.f1478b;
        if (str2 != null) {
            ft1Var.C = str2;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1477a);
        parcel.writeString(this.f1478b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        int i2 = wi3.f5017a;
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public final /* synthetic */ byte[] x() {
        return null;
    }

    public IcyHeaders(Parcel parcel) {
        this.f1477a = parcel.readInt();
        this.f1478b = parcel.readString();
        this.c = parcel.readString();
        this.d = parcel.readString();
        int i = wi3.f5017a;
        this.e = parcel.readInt() != 0;
        this.f = parcel.readInt();
    }
}
