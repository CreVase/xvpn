package defpackage;

import com.google.protobuf.r0;
import com.google.protobuf.v0;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes2.dex */
public final class ja2 {
    private static final ja2 INSTANCE = new ja2();
    private final ConcurrentMap<Class<?>, ln2> schemaCache = new ConcurrentHashMap();
    private final nn2 schemaFactory = new jp1();

    private ja2() {
    }

    public static ja2 getInstance() {
        return INSTANCE;
    }

    public int getTotalSchemaSize() {
        int i = 0;
        for (ln2 ln2Var : this.schemaCache.values()) {
            if (ln2Var instanceof v0) {
                i = ((v0) ln2Var).getSchemaSize() + i;
            }
        }
        return i;
    }

    public <T> boolean isInitialized(T t) {
        return schemaFor((ja2) t).isInitialized(t);
    }

    public <T> void makeImmutable(T t) {
        schemaFor((ja2) t).makeImmutable(t);
    }

    public <T> void mergeFrom(T t, sg2 sg2Var) throws IOException {
        mergeFrom(t, sg2Var, xu0.getEmptyRegistry());
    }

    public ln2 registerSchema(Class<?> cls, ln2 ln2Var) {
        r0.checkNotNull(cls, "messageType");
        r0.checkNotNull(ln2Var, "schema");
        return this.schemaCache.putIfAbsent(cls, ln2Var);
    }

    public ln2 registerSchemaOverride(Class<?> cls, ln2 ln2Var) {
        r0.checkNotNull(cls, "messageType");
        r0.checkNotNull(ln2Var, "schema");
        return this.schemaCache.put(cls, ln2Var);
    }

    public <T> ln2 schemaFor(Class<T> cls) {
        r0.checkNotNull(cls, "messageType");
        ln2 ln2Var = this.schemaCache.get(cls);
        if (ln2Var != null) {
            return ln2Var;
        }
        ln2 createSchema = ((jp1) this.schemaFactory).createSchema(cls);
        ln2 registerSchema = registerSchema(cls, createSchema);
        return registerSchema != null ? registerSchema : createSchema;
    }

    public <T> void writeTo(T t, kt3 kt3Var) throws IOException {
        schemaFor((ja2) t).writeTo(t, kt3Var);
    }

    public <T> void mergeFrom(T t, sg2 sg2Var, xu0 xu0Var) throws IOException {
        schemaFor((ja2) t).mergeFrom(t, sg2Var, xu0Var);
    }

    public <T> ln2 schemaFor(T t) {
        return schemaFor((Class) t.getClass());
    }
}
