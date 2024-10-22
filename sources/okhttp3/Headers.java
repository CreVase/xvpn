package okhttp3;

import defpackage.am3;
import defpackage.c20;
import defpackage.cr0;
import defpackage.i23;
import defpackage.m20;
import defpackage.n42;
import defpackage.ng0;
import defpackage.qh1;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes2.dex */
public final class Headers implements Iterable<n42>, qh1 {
    public static final Companion Companion = new Companion(null);
    private final String[] namesAndValues;

    /* loaded from: classes2.dex */
    public static final class Builder {
        private final List<String> namesAndValues = new ArrayList(20);

        public final Builder add(String str) {
            int Y0 = i23.Y0(str, ':', 0, false, 6);
            if (Y0 != -1) {
                add(i23.u1(str.substring(0, Y0)).toString(), str.substring(Y0 + 1));
                return this;
            }
            throw new IllegalArgumentException(m20.d1(str, "Unexpected header: ").toString());
        }

        public final Builder addAll(Headers headers) {
            int size = headers.size();
            for (int i = 0; i < size; i++) {
                addLenient$okhttp(headers.name(i), headers.value(i));
            }
            return this;
        }

        public final Builder addLenient$okhttp(String str) {
            int Y0 = i23.Y0(str, ':', 1, false, 4);
            if (Y0 != -1) {
                addLenient$okhttp(str.substring(0, Y0), str.substring(Y0 + 1));
            } else if (str.charAt(0) == ':') {
                addLenient$okhttp("", str.substring(1));
            } else {
                addLenient$okhttp("", str);
            }
            return this;
        }

        public final Builder addUnsafeNonAscii(String str, String str2) {
            Headers.Companion.checkName(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Headers build() {
            Object[] array = this.namesAndValues.toArray(new String[0]);
            if (array != null) {
                return new Headers((String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }

        public final String get(String str) {
            int size = this.namesAndValues.size() - 2;
            int q0 = m20.q0(size, 0, -2);
            if (q0 > size) {
                return null;
            }
            while (true) {
                int i = size - 2;
                if (i23.U0(str, this.namesAndValues.get(size))) {
                    return this.namesAndValues.get(size + 1);
                }
                if (size != q0) {
                    size = i;
                } else {
                    return null;
                }
            }
        }

        public final List<String> getNamesAndValues$okhttp() {
            return this.namesAndValues;
        }

        public final Builder removeAll(String str) {
            int i = 0;
            while (i < getNamesAndValues$okhttp().size()) {
                if (i23.U0(str, getNamesAndValues$okhttp().get(i))) {
                    getNamesAndValues$okhttp().remove(i);
                    getNamesAndValues$okhttp().remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public final Builder set(String str, Date date) {
            set(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder set(String str, Instant instant) {
            long epochMilli;
            epochMilli = instant.toEpochMilli();
            return set(str, new Date(epochMilli));
        }

        public final Builder set(String str, String str2) {
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            removeAll(str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder add(String str, String str2) {
            Companion companion = Headers.Companion;
            companion.checkName(str);
            companion.checkValue(str2, str);
            addLenient$okhttp(str, str2);
            return this;
        }

        public final Builder addLenient$okhttp(String str, String str2) {
            getNamesAndValues$okhttp().add(str);
            getNamesAndValues$okhttp().add(i23.u1(str2).toString());
            return this;
        }

        public final Builder add(String str, Date date) {
            add(str, DatesKt.toHttpDateString(date));
            return this;
        }

        @IgnoreJRERequirement
        public final Builder add(String str, Instant instant) {
            long epochMilli;
            epochMilli = instant.toEpochMilli();
            add(str, new Date(epochMilli));
            return this;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkName(String str) {
            boolean z;
            boolean z2;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int length = str.length();
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    char charAt = str.charAt(i);
                    if ('!' <= charAt && charAt < 127) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        i = i2;
                    } else {
                        throw new IllegalArgumentException(Util.format("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str).toString());
                    }
                }
                return;
            }
            throw new IllegalArgumentException("name is empty".toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x005b A[LOOP:0: B:2:0x0006->B:13:0x005b, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0026 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void checkValue(java.lang.String r8, java.lang.String r9) {
            /*
                r7 = this;
                int r0 = r8.length()
                r1 = 0
                r2 = 0
            L6:
                if (r2 >= r0) goto L5d
                int r3 = r2 + 1
                char r4 = r8.charAt(r2)
                r5 = 9
                r6 = 1
                if (r4 == r5) goto L23
                r5 = 32
                if (r5 > r4) goto L1d
                r5 = 127(0x7f, float:1.78E-43)
                if (r4 >= r5) goto L1d
                r5 = 1
                goto L1e
            L1d:
                r5 = 0
            L1e:
                if (r5 == 0) goto L21
                goto L23
            L21:
                r5 = 0
                goto L24
            L23:
                r5 = 1
            L24:
                if (r5 != 0) goto L5b
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
                r0[r1] = r3
                java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                r0[r6] = r1
                r1 = 2
                r0[r1] = r9
                java.lang.String r1 = "Unexpected char %#04x at %d in %s value"
                java.lang.String r0 = okhttp3.internal.Util.format(r1, r0)
                boolean r9 = okhttp3.internal.Util.isSensitiveHeader(r9)
                if (r9 == 0) goto L47
                java.lang.String r8 = ""
                goto L4d
            L47:
                java.lang.String r9 = ": "
                java.lang.String r8 = defpackage.m20.d1(r8, r9)
            L4d:
                java.lang.String r8 = defpackage.m20.d1(r8, r0)
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.String r8 = r8.toString()
                r9.<init>(r8)
                throw r9
            L5b:
                r2 = r3
                goto L6
            L5d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.Headers.Companion.checkValue(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String get(String[] strArr, String str) {
            int length = strArr.length - 2;
            int q0 = m20.q0(length, 0, -2);
            if (q0 > length) {
                return null;
            }
            while (true) {
                int i = length - 2;
                if (i23.U0(str, strArr[length])) {
                    return strArr[length + 1];
                }
                if (length != q0) {
                    length = i;
                } else {
                    return null;
                }
            }
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m162deprecated_of(String... strArr) {
            return of((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final Headers of(String... strArr) {
            int i = 0;
            if (strArr.length % 2 == 0) {
                String[] strArr2 = (String[]) strArr.clone();
                int length = strArr2.length;
                int i2 = 0;
                while (i2 < length) {
                    int i3 = i2 + 1;
                    String str = strArr2[i2];
                    if (str != null) {
                        strArr2[i2] = i23.u1(str).toString();
                        i2 = i3;
                    } else {
                        throw new IllegalArgumentException("Headers cannot be null".toString());
                    }
                }
                int q0 = m20.q0(0, strArr2.length - 1, 2);
                if (q0 >= 0) {
                    while (true) {
                        int i4 = i + 2;
                        String str2 = strArr2[i];
                        String str3 = strArr2[i + 1];
                        checkName(str2);
                        checkValue(str3, str2);
                        if (i == q0) {
                            break;
                        }
                        i = i4;
                    }
                }
                return new Headers(strArr2, null);
            }
            throw new IllegalArgumentException("Expected alternating header names and values".toString());
        }

        /* renamed from: -deprecated_of, reason: not valid java name */
        public final Headers m161deprecated_of(Map<String, String> map) {
            return of(map);
        }

        public final Headers of(Map<String, String> map) {
            String[] strArr = new String[map.size() * 2];
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                String obj = i23.u1(key).toString();
                String obj2 = i23.u1(value).toString();
                checkName(obj);
                checkValue(obj2, obj);
                strArr[i] = obj;
                strArr[i + 1] = obj2;
                i += 2;
            }
            return new Headers(strArr, null);
        }
    }

    public /* synthetic */ Headers(String[] strArr, ng0 ng0Var) {
        this(strArr);
    }

    public static final Headers of(Map<String, String> map) {
        return Companion.of(map);
    }

    /* renamed from: -deprecated_size, reason: not valid java name */
    public final int m160deprecated_size() {
        return size();
    }

    public final long byteCount() {
        String[] strArr = this.namesAndValues;
        long length = strArr.length * 2;
        for (int i = 0; i < strArr.length; i++) {
            length += this.namesAndValues[i].length();
        }
        return length;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Headers) && Arrays.equals(this.namesAndValues, ((Headers) obj).namesAndValues)) {
            return true;
        }
        return false;
    }

    public final String get(String str) {
        return Companion.get(this.namesAndValues, str);
    }

    public final Date getDate(String str) {
        String str2 = get(str);
        if (str2 == null) {
            return null;
        }
        return DatesKt.toHttpDateOrNull(str2);
    }

    @IgnoreJRERequirement
    public final Instant getInstant(String str) {
        Instant instant;
        Date date = getDate(str);
        if (date != null) {
            instant = date.toInstant();
            return instant;
        }
        return null;
    }

    public int hashCode() {
        return Arrays.hashCode(this.namesAndValues);
    }

    @Override // java.lang.Iterable
    public Iterator<n42> iterator() {
        int size = size();
        n42[] n42VarArr = new n42[size];
        for (int i = 0; i < size; i++) {
            n42VarArr[i] = new n42(name(i), value(i));
        }
        return new am3(n42VarArr);
    }

    public final String name(int i) {
        return this.namesAndValues[i * 2];
    }

    public final Set<String> names() {
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        for (int i = 0; i < size; i++) {
            treeSet.add(name(i));
        }
        return Collections.unmodifiableSet(treeSet);
    }

    public final Builder newBuilder() {
        Builder builder = new Builder();
        c20.E0(builder.getNamesAndValues$okhttp(), this.namesAndValues);
        return builder;
    }

    public final int size() {
        return this.namesAndValues.length / 2;
    }

    public final Map<String, List<String>> toMultimap() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String lowerCase = name(i).toLowerCase(Locale.US);
            List list = (List) treeMap.get(lowerCase);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put(lowerCase, list);
            }
            list.add(value(i));
            i = i2;
        }
        return treeMap;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            String name = name(i);
            String value = value(i);
            sb.append(name);
            sb.append(": ");
            if (Util.isSensitiveHeader(name)) {
                value = "██";
            }
            sb.append(value);
            sb.append("\n");
            i = i2;
        }
        return sb.toString();
    }

    public final String value(int i) {
        return this.namesAndValues[(i * 2) + 1];
    }

    public final List<String> values(String str) {
        int size = size();
        ArrayList arrayList = null;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i23.U0(str, name(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(value(i));
            }
            i = i2;
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return cr0.f1659a;
    }

    private Headers(String[] strArr) {
        this.namesAndValues = strArr;
    }

    public static final Headers of(String... strArr) {
        return Companion.of(strArr);
    }
}
