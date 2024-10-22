package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cp3;
import defpackage.ft1;
import defpackage.hb1;
import defpackage.ji2;
import defpackage.p71;
import defpackage.v6;
import defpackage.wi3;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new v6(22);

    /* renamed from: b, reason: collision with root package name */
    public final String f1491b;
    public final hb1 c;

    public TextInformationFrame(String str, String str2, ji2 ji2Var) {
        super(str);
        cp3.e(!ji2Var.isEmpty());
        this.f1491b = str2;
        hb1 l = hb1.l(ji2Var);
        this.c = l;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
            } else if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
            } else if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (wi3.a(this.f1487a, textInformationFrame.f1487a) && wi3.a(this.f1491b, textInformationFrame.f1491b) && this.c.equals(textInformationFrame.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int h = p71.h(this.f1487a, 527, 31);
        String str = this.f1491b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((h + i) * 31);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f1487a + ": description=" + this.f1491b + ": values=" + this.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame, com.google.android.exoplayer2.metadata.Metadata.Entry
    public final void w(ft1 ft1Var) {
        char c;
        Integer num;
        String str = this.f1487a;
        str.getClass();
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 82878:
                if (str.equals("TCM")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 82897:
                if (str.equals("TDA")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 83253:
                if (str.equals("TP1")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 83254:
                if (str.equals("TP2")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 83255:
                if (str.equals("TP3")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 83341:
                if (str.equals("TRK")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 83378:
                if (str.equals("TT2")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 83536:
                if (str.equals("TXT")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 83552:
                if (str.equals("TYE")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    c = '\f';
                    break;
                }
                c = 65535;
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    c = '\r';
                    break;
                }
                c = 65535;
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    c = 14;
                    break;
                }
                c = 65535;
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    c = 15;
                    break;
                }
                c = 65535;
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    c = 16;
                    break;
                }
                c = 65535;
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    c = 17;
                    break;
                }
                c = 65535;
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    c = 18;
                    break;
                }
                c = 65535;
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    c = 19;
                    break;
                }
                c = 65535;
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    c = 20;
                    break;
                }
                c = 65535;
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    c = 21;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        hb1 hb1Var = this.c;
        try {
            switch (c) {
                case 0:
                case '\n':
                    ft1Var.c((CharSequence) hb1Var.get(0));
                    return;
                case 1:
                case 11:
                    ft1Var.e((CharSequence) hb1Var.get(0));
                    return;
                case 2:
                case '\f':
                    String str2 = (String) hb1Var.get(0);
                    int parseInt = Integer.parseInt(str2.substring(2, 4));
                    int parseInt2 = Integer.parseInt(str2.substring(0, 2));
                    ft1Var.h(Integer.valueOf(parseInt));
                    ft1Var.g(Integer.valueOf(parseInt2));
                    return;
                case 3:
                case 17:
                    ft1Var.d((CharSequence) hb1Var.get(0));
                    return;
                case 4:
                case 18:
                    ft1Var.b((CharSequence) hb1Var.get(0));
                    return;
                case 5:
                case 19:
                    ft1Var.f((CharSequence) hb1Var.get(0));
                    return;
                case 6:
                case 20:
                    String[] I = wi3.I((String) hb1Var.get(0));
                    int parseInt3 = Integer.parseInt(I[0]);
                    if (I.length > 1) {
                        num = Integer.valueOf(Integer.parseInt(I[1]));
                    } else {
                        num = null;
                    }
                    ft1Var.o(Integer.valueOf(parseInt3));
                    ft1Var.n(num);
                    return;
                case 7:
                case 16:
                    ft1Var.m((CharSequence) hb1Var.get(0));
                    return;
                case '\b':
                case 15:
                    ft1Var.p((CharSequence) hb1Var.get(0));
                    return;
                case '\t':
                case 21:
                    ft1Var.i(Integer.valueOf(Integer.parseInt((String) hb1Var.get(0))));
                    return;
                case '\r':
                    ArrayList a2 = a((String) hb1Var.get(0));
                    int size = a2.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                ft1Var.g((Integer) a2.get(2));
                            } else {
                                return;
                            }
                        }
                        ft1Var.h((Integer) a2.get(1));
                    }
                    ft1Var.i((Integer) a2.get(0));
                    return;
                case 14:
                    ArrayList a3 = a((String) hb1Var.get(0));
                    int size2 = a3.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                ft1Var.j((Integer) a3.get(2));
                            } else {
                                return;
                            }
                        }
                        ft1Var.k((Integer) a3.get(1));
                    }
                    ft1Var.l((Integer) a3.get(0));
                    return;
                default:
                    return;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1487a);
        parcel.writeString(this.f1491b);
        parcel.writeStringArray((String[]) this.c.toArray(new String[0]));
    }
}
