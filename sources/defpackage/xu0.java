package defpackage;

import com.google.protobuf.n0;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class xu0 {
    static final xu0 EMPTY_REGISTRY_LITE = new xu0(true);
    static final String EXTENSION_CLASS_NAME = "com.google.protobuf.Extension";
    private static boolean doFullRuntimeInheritanceCheck = true;
    private static volatile boolean eagerlyParseMessageSets = false;
    private static volatile xu0 emptyRegistry;
    private final Map<wu0, n0> extensionsByNumber;

    public xu0() {
        this.extensionsByNumber = new HashMap();
    }

    public static xu0 getEmptyRegistry() {
        xu0 xu0Var = emptyRegistry;
        if (xu0Var == null) {
            synchronized (xu0.class) {
                xu0Var = emptyRegistry;
                if (xu0Var == null) {
                    if (doFullRuntimeInheritanceCheck) {
                        xu0Var = tu0.createEmpty();
                    } else {
                        xu0Var = EMPTY_REGISTRY_LITE;
                    }
                    emptyRegistry = xu0Var;
                }
            }
        }
        return xu0Var;
    }

    public static boolean isEagerlyParseMessageSets() {
        return eagerlyParseMessageSets;
    }

    public static xu0 newInstance() {
        if (doFullRuntimeInheritanceCheck) {
            return tu0.create();
        }
        return new xu0();
    }

    public static void setEagerlyParseMessageSets(boolean z) {
        eagerlyParseMessageSets = z;
    }

    public final void add(n0 n0Var) {
        this.extensionsByNumber.put(new wu0(n0Var.getContainingTypeDefaultInstance(), n0Var.getNumber()), n0Var);
    }

    public <ContainingType extends yv1> n0 findLiteExtensionByNumber(ContainingType containingtype, int i) {
        return this.extensionsByNumber.get(new wu0(containingtype, i));
    }

    public xu0 getUnmodifiable() {
        return new xu0(this);
    }

    public xu0(xu0 xu0Var) {
        if (xu0Var == EMPTY_REGISTRY_LITE) {
            this.extensionsByNumber = Collections.emptyMap();
        } else {
            this.extensionsByNumber = Collections.unmodifiableMap(xu0Var.extensionsByNumber);
        }
    }

    public final void add(su0 su0Var) {
        if (n0.class.isAssignableFrom(su0Var.getClass())) {
            add((n0) su0Var);
        }
        if (doFullRuntimeInheritanceCheck && tu0.isFullRegistry(this)) {
            try {
                xu0.class.getMethod("add", vu0.INSTANCE).invoke(this, su0Var);
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Could not invoke ExtensionRegistry#add for %s", su0Var), e);
            }
        }
    }

    public xu0(boolean z) {
        this.extensionsByNumber = Collections.emptyMap();
    }
}
