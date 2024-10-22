package defpackage;

import com.google.protobuf.g;
import com.google.protobuf.m;
import com.google.protobuf.x;
import java.io.IOException;

/* loaded from: classes2.dex */
public class bj1 {
    private static final xu0 EMPTY_REGISTRY = xu0.getEmptyRegistry();
    private g delayedBytes;
    private xu0 extensionRegistry;
    private volatile g memoizedBytes;
    protected volatile yv1 value;

    public bj1() {
    }

    public bj1(xu0 xu0Var, g gVar) {
        checkArguments(xu0Var, gVar);
        this.extensionRegistry = xu0Var;
        this.delayedBytes = gVar;
    }

    private static void checkArguments(xu0 xu0Var, g gVar) {
        if (xu0Var != null) {
            if (gVar != null) {
                return;
            } else {
                throw new NullPointerException("found null ByteString");
            }
        }
        throw new NullPointerException("found null ExtensionRegistry");
    }

    public static bj1 fromValue(yv1 yv1Var) {
        bj1 bj1Var = new bj1();
        bj1Var.setValue(yv1Var);
        return bj1Var;
    }

    private static yv1 mergeValueAndBytes(yv1 yv1Var, g gVar, xu0 xu0Var) {
        try {
            return yv1Var.toBuilder().mergeFrom(gVar, xu0Var).build();
        } catch (he1 unused) {
            return yv1Var;
        }
    }

    public void clear() {
        this.delayedBytes = null;
        this.value = null;
        this.memoizedBytes = null;
    }

    public boolean containsDefaultInstance() {
        g gVar;
        g gVar2 = this.memoizedBytes;
        g gVar3 = g.EMPTY;
        if (gVar2 != gVar3 && (this.value != null || ((gVar = this.delayedBytes) != null && gVar != gVar3))) {
            return false;
        }
        return true;
    }

    public void ensureInitialized(yv1 yv1Var) {
        if (this.value != null) {
            return;
        }
        synchronized (this) {
            if (this.value != null) {
                return;
            }
            try {
                if (this.delayedBytes != null) {
                    this.value = (yv1) ((m1) yv1Var.getParserForType()).parseFrom(this.delayedBytes, this.extensionRegistry);
                    this.memoizedBytes = this.delayedBytes;
                } else {
                    this.value = yv1Var;
                    this.memoizedBytes = g.EMPTY;
                }
            } catch (he1 unused) {
                this.value = yv1Var;
                this.memoizedBytes = g.EMPTY;
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj1)) {
            return false;
        }
        bj1 bj1Var = (bj1) obj;
        yv1 yv1Var = this.value;
        yv1 yv1Var2 = bj1Var.value;
        if (yv1Var == null && yv1Var2 == null) {
            return toByteString().equals(bj1Var.toByteString());
        }
        if (yv1Var != null && yv1Var2 != null) {
            return yv1Var.equals(yv1Var2);
        }
        if (yv1Var != null) {
            return yv1Var.equals(bj1Var.getValue(yv1Var.getDefaultInstanceForType()));
        }
        return getValue(yv1Var2.getDefaultInstanceForType()).equals(yv1Var2);
    }

    public int getSerializedSize() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes.size();
        }
        g gVar = this.delayedBytes;
        if (gVar != null) {
            return gVar.size();
        }
        if (this.value != null) {
            return this.value.getSerializedSize();
        }
        return 0;
    }

    public yv1 getValue(yv1 yv1Var) {
        ensureInitialized(yv1Var);
        return this.value;
    }

    public int hashCode() {
        return 1;
    }

    public void merge(bj1 bj1Var) {
        g gVar;
        if (bj1Var.containsDefaultInstance()) {
            return;
        }
        if (containsDefaultInstance()) {
            set(bj1Var);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = bj1Var.extensionRegistry;
        }
        g gVar2 = this.delayedBytes;
        if (gVar2 != null && (gVar = bj1Var.delayedBytes) != null) {
            this.delayedBytes = gVar2.concat(gVar);
            return;
        }
        if (this.value == null && bj1Var.value != null) {
            setValue(mergeValueAndBytes(bj1Var.value, this.delayedBytes, this.extensionRegistry));
        } else if (this.value != null && bj1Var.value == null) {
            setValue(mergeValueAndBytes(this.value, bj1Var.delayedBytes, bj1Var.extensionRegistry));
        } else {
            setValue(this.value.toBuilder().mergeFrom(bj1Var.value).build());
        }
    }

    public void mergeFrom(m mVar, xu0 xu0Var) throws IOException {
        if (containsDefaultInstance()) {
            setByteString(mVar.readBytes(), xu0Var);
            return;
        }
        if (this.extensionRegistry == null) {
            this.extensionRegistry = xu0Var;
        }
        g gVar = this.delayedBytes;
        if (gVar != null) {
            setByteString(gVar.concat(mVar.readBytes()), this.extensionRegistry);
        } else {
            try {
                setValue(this.value.toBuilder().mergeFrom(mVar, xu0Var).build());
            } catch (he1 unused) {
            }
        }
    }

    public void set(bj1 bj1Var) {
        this.delayedBytes = bj1Var.delayedBytes;
        this.value = bj1Var.value;
        this.memoizedBytes = bj1Var.memoizedBytes;
        xu0 xu0Var = bj1Var.extensionRegistry;
        if (xu0Var != null) {
            this.extensionRegistry = xu0Var;
        }
    }

    public void setByteString(g gVar, xu0 xu0Var) {
        checkArguments(xu0Var, gVar);
        this.delayedBytes = gVar;
        this.extensionRegistry = xu0Var;
        this.value = null;
        this.memoizedBytes = null;
    }

    public yv1 setValue(yv1 yv1Var) {
        yv1 yv1Var2 = this.value;
        this.delayedBytes = null;
        this.memoizedBytes = null;
        this.value = yv1Var;
        return yv1Var2;
    }

    public g toByteString() {
        if (this.memoizedBytes != null) {
            return this.memoizedBytes;
        }
        g gVar = this.delayedBytes;
        if (gVar != null) {
            return gVar;
        }
        synchronized (this) {
            if (this.memoizedBytes != null) {
                return this.memoizedBytes;
            }
            if (this.value == null) {
                this.memoizedBytes = g.EMPTY;
            } else {
                this.memoizedBytes = this.value.toByteString();
            }
            return this.memoizedBytes;
        }
    }

    public void writeTo(kt3 kt3Var, int i) throws IOException {
        if (this.memoizedBytes != null) {
            ((x) kt3Var).writeBytes(i, this.memoizedBytes);
            return;
        }
        g gVar = this.delayedBytes;
        if (gVar != null) {
            ((x) kt3Var).writeBytes(i, gVar);
        } else if (this.value != null) {
            ((x) kt3Var).writeMessage(i, this.value);
        } else {
            ((x) kt3Var).writeBytes(i, g.EMPTY);
        }
    }
}
