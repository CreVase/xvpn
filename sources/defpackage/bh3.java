package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class bh3 extends RuntimeException {
    private static final long serialVersionUID = -7466929953374883507L;
    private final List<String> missingFields;

    public bh3(yv1 yv1Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.missingFields = null;
    }

    private static String buildDescription(List<String> list) {
        StringBuilder sb = new StringBuilder("Message missing required fields: ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        return sb.toString();
    }

    public he1 asInvalidProtocolBufferException() {
        return new he1(getMessage());
    }

    public List<String> getMissingFields() {
        return Collections.unmodifiableList(this.missingFields);
    }

    public bh3(List<String> list) {
        super(buildDescription(list));
        this.missingFields = list;
    }
}
