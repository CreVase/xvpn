package defpackage;

import com.google.protobuf.g;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class zu0 {
    public abstract int extensionNumber(Map.Entry<?, ?> entry);

    public abstract Object findExtensionByNumber(xu0 xu0Var, yv1 yv1Var, int i);

    public abstract ww0 getExtensions(Object obj);

    public abstract ww0 getMutableExtensions(Object obj);

    public abstract boolean hasExtensions(yv1 yv1Var);

    public abstract void makeImmutable(Object obj);

    public abstract <UT, UB> UB parseExtension(Object obj, sg2 sg2Var, Object obj2, xu0 xu0Var, ww0 ww0Var, UB ub, fh3 fh3Var) throws IOException;

    public abstract void parseLengthPrefixedMessageSetItem(sg2 sg2Var, Object obj, xu0 xu0Var, ww0 ww0Var) throws IOException;

    public abstract void parseMessageSetItem(g gVar, Object obj, xu0 xu0Var, ww0 ww0Var) throws IOException;

    public abstract void serializeExtension(kt3 kt3Var, Map.Entry<?, ?> entry) throws IOException;

    public abstract void setExtensions(Object obj, ww0 ww0Var);
}
