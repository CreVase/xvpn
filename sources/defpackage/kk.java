package defpackage;

/* loaded from: classes.dex */
public final class kk extends bb {

    /* renamed from: a, reason: collision with root package name */
    public final Integer f2958a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2959b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public kk(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f2958a = num;
        this.f2959b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bb)) {
            return false;
        }
        bb bbVar = (bb) obj;
        Integer num = this.f2958a;
        if (num != null ? num.equals(((kk) bbVar).f2958a) : ((kk) bbVar).f2958a == null) {
            String str = this.f2959b;
            if (str != null ? str.equals(((kk) bbVar).f2959b) : ((kk) bbVar).f2959b == null) {
                String str2 = this.c;
                if (str2 != null ? str2.equals(((kk) bbVar).c) : ((kk) bbVar).c == null) {
                    String str3 = this.d;
                    if (str3 != null ? str3.equals(((kk) bbVar).d) : ((kk) bbVar).d == null) {
                        String str4 = this.e;
                        if (str4 != null ? str4.equals(((kk) bbVar).e) : ((kk) bbVar).e == null) {
                            String str5 = this.f;
                            if (str5 != null ? str5.equals(((kk) bbVar).f) : ((kk) bbVar).f == null) {
                                String str6 = this.g;
                                if (str6 != null ? str6.equals(((kk) bbVar).g) : ((kk) bbVar).g == null) {
                                    String str7 = this.h;
                                    if (str7 != null ? str7.equals(((kk) bbVar).h) : ((kk) bbVar).h == null) {
                                        String str8 = this.i;
                                        if (str8 != null ? str8.equals(((kk) bbVar).i) : ((kk) bbVar).i == null) {
                                            String str9 = this.j;
                                            if (str9 != null ? str9.equals(((kk) bbVar).j) : ((kk) bbVar).j == null) {
                                                String str10 = this.k;
                                                if (str10 != null ? str10.equals(((kk) bbVar).k) : ((kk) bbVar).k == null) {
                                                    String str11 = this.l;
                                                    if (str11 == null) {
                                                        if (((kk) bbVar).l == null) {
                                                            return true;
                                                        }
                                                    } else if (str11.equals(((kk) bbVar).l)) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i = 0;
        Integer num = this.f2958a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str = this.f2959b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str5 = this.f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        String str6 = this.g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode7) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 ^ hashCode8) * 1000003;
        String str8 = this.i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 ^ hashCode9) * 1000003;
        String str9 = this.j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 ^ hashCode10) * 1000003;
        String str10 = this.k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 ^ hashCode11) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i ^ i12;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb.append(this.f2958a);
        sb.append(", model=");
        sb.append(this.f2959b);
        sb.append(", hardware=");
        sb.append(this.c);
        sb.append(", device=");
        sb.append(this.d);
        sb.append(", product=");
        sb.append(this.e);
        sb.append(", osBuild=");
        sb.append(this.f);
        sb.append(", manufacturer=");
        sb.append(this.g);
        sb.append(", fingerprint=");
        sb.append(this.h);
        sb.append(", locale=");
        sb.append(this.i);
        sb.append(", country=");
        sb.append(this.j);
        sb.append(", mccMnc=");
        sb.append(this.k);
        sb.append(", applicationBuild=");
        return hx2.s(sb, this.l, "}");
    }
}
