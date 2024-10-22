package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* loaded from: classes.dex */
public final class xm1 implements ym1 {
    public static final Locale[] c = new Locale[0];

    /* renamed from: a, reason: collision with root package name */
    public final Locale[] f5181a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5182b;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else {
            if (split.length == 1) {
                new Locale(split[0]);
                return;
            }
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public xm1(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.f5181a = c;
            this.f5182b = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException(p71.k("list[", i, "] is null"));
            }
        }
        this.f5181a = (Locale[]) arrayList.toArray(new Locale[0]);
        this.f5182b = sb.toString();
    }

    @Override // defpackage.ym1
    public final String a() {
        return this.f5182b;
    }

    @Override // defpackage.ym1
    public final Object b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xm1)) {
            return false;
        }
        Locale[] localeArr = ((xm1) obj).f5181a;
        Locale[] localeArr2 = this.f5181a;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ym1
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.f5181a;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.f5181a) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // defpackage.ym1
    public final boolean isEmpty() {
        if (this.f5181a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ym1
    public final int size() {
        return this.f5181a.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.f5181a;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}
