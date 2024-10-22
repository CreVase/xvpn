package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class og0 {
    public static final og0 c = new og0(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public int f3655a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f3656b;

    public og0(Map map) {
        this.f3656b = Collections.unmodifiableMap(map);
    }

    public static boolean b(Map map, Map map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!Arrays.equals((byte[]) entry.getValue(), (byte[]) map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public final og0 a(uy0 uy0Var) {
        byte[] bArr;
        Map map = this.f3656b;
        HashMap hashMap = new HashMap(map);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList((List) uy0Var.c));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap((Map) uy0Var.f4757b);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        for (Map.Entry entry2 : Collections.unmodifiableMap(hashMap2).entrySet()) {
            String str = (String) entry2.getKey();
            Object value2 = entry2.getValue();
            if (value2 instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) value2).longValue()).array();
            } else if (value2 instanceof String) {
                bArr = ((String) value2).getBytes(ex.c);
            } else if (value2 instanceof byte[]) {
                bArr = (byte[]) value2;
            } else {
                throw new IllegalArgumentException();
            }
            hashMap.put(str, bArr);
        }
        if (b(map, hashMap)) {
            return this;
        }
        return new og0(hashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && og0.class == obj.getClass()) {
            return b(this.f3656b, ((og0) obj).f3656b);
        }
        return false;
    }

    public final int hashCode() {
        if (this.f3655a == 0) {
            int i = 0;
            for (Map.Entry entry : this.f3656b.entrySet()) {
                i += Arrays.hashCode((byte[]) entry.getValue()) ^ ((String) entry.getKey()).hashCode();
            }
            this.f3655a = i;
        }
        return this.f3655a;
    }
}
