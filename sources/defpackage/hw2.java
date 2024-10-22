package defpackage;

import com.google.protobuf.m0;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hw2 extends vw2 {
    public hw2(int i) {
        super(i, null);
    }

    @Override // defpackage.vw2
    public void makeImmutable() {
        if (!isImmutable()) {
            for (int i = 0; i < getNumArrayEntries(); i++) {
                Map.Entry<Comparable<Object>, Object> arrayEntryAt = getArrayEntryAt(i);
                if (((m0) ((vw0) arrayEntryAt.getKey())).isRepeated()) {
                    arrayEntryAt.setValue(Collections.unmodifiableList((List) arrayEntryAt.getValue()));
                }
            }
            for (Map.Entry<Comparable<Object>, Object> entry : getOverflowEntries()) {
                if (((m0) ((vw0) entry.getKey())).isRepeated()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.makeImmutable();
    }

    @Override // defpackage.vw2, java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return super.put((Comparable<Object>) obj, obj2);
    }
}
