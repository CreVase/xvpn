package defpackage;

import com.google.protobuf.g;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class ks implements Comparator {
    @Override // java.util.Comparator
    public int compare(g gVar, g gVar2) {
        int i;
        int i2;
        ss it = gVar.iterator();
        ss it2 = gVar2.iterator();
        while (it.hasNext() && it2.hasNext()) {
            i = g.toInt(it.nextByte());
            Integer valueOf = Integer.valueOf(i);
            i2 = g.toInt(it2.nextByte());
            int compareTo = valueOf.compareTo(Integer.valueOf(i2));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(gVar.size()).compareTo(Integer.valueOf(gVar2.size()));
    }
}
