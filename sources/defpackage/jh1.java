package defpackage;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class jh1 implements v12, gj3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2764a = true;

    /* renamed from: b, reason: collision with root package name */
    public final JsonWriter f2765b;
    public final Map c;
    public final Map d;
    public final u12 e;
    public final boolean f;

    public jh1(Writer writer, HashMap hashMap, HashMap hashMap2, xf1 xf1Var, boolean z) {
        this.f2765b = new JsonWriter(writer);
        this.c = hashMap;
        this.d = hashMap2;
        this.e = xf1Var;
        this.f = z;
    }

    @Override // defpackage.v12
    public final v12 a(mw0 mw0Var, Object obj) {
        return i(obj, mw0Var.f3364a);
    }

    @Override // defpackage.gj3
    public final gj3 b(String str) {
        j();
        this.f2765b.value(str);
        return this;
    }

    @Override // defpackage.gj3
    public final gj3 c(boolean z) {
        j();
        this.f2765b.value(z);
        return this;
    }

    @Override // defpackage.v12
    public final v12 d(mw0 mw0Var, boolean z) {
        String str = mw0Var.f3364a;
        j();
        JsonWriter jsonWriter = this.f2765b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(z);
        return this;
    }

    @Override // defpackage.v12
    public final v12 e(mw0 mw0Var, int i) {
        String str = mw0Var.f3364a;
        j();
        JsonWriter jsonWriter = this.f2765b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(i);
        return this;
    }

    @Override // defpackage.v12
    public final v12 f(mw0 mw0Var, double d) {
        String str = mw0Var.f3364a;
        j();
        JsonWriter jsonWriter = this.f2765b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(d);
        return this;
    }

    @Override // defpackage.v12
    public final v12 g(mw0 mw0Var, long j) {
        String str = mw0Var.f3364a;
        j();
        JsonWriter jsonWriter = this.f2765b;
        jsonWriter.name(str);
        j();
        jsonWriter.value(j);
        return this;
    }

    public final jh1 h(Object obj) {
        JsonWriter jsonWriter = this.f2765b;
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            jsonWriter.value((Number) obj);
            return this;
        }
        int i = 0;
        if (obj.getClass().isArray()) {
            if (obj instanceof byte[]) {
                j();
                jsonWriter.value(Base64.encodeToString((byte[]) obj, 2));
                return this;
            }
            jsonWriter.beginArray();
            if (obj instanceof int[]) {
                int length = ((int[]) obj).length;
                while (i < length) {
                    jsonWriter.value(r7[i]);
                    i++;
                }
            } else if (obj instanceof long[]) {
                long[] jArr = (long[]) obj;
                int length2 = jArr.length;
                while (i < length2) {
                    long j = jArr[i];
                    j();
                    jsonWriter.value(j);
                    i++;
                }
            } else if (obj instanceof double[]) {
                double[] dArr = (double[]) obj;
                int length3 = dArr.length;
                while (i < length3) {
                    jsonWriter.value(dArr[i]);
                    i++;
                }
            } else if (obj instanceof boolean[]) {
                boolean[] zArr = (boolean[]) obj;
                int length4 = zArr.length;
                while (i < length4) {
                    jsonWriter.value(zArr[i]);
                    i++;
                }
            } else if (obj instanceof Number[]) {
                Number[] numberArr = (Number[]) obj;
                int length5 = numberArr.length;
                while (i < length5) {
                    h(numberArr[i]);
                    i++;
                }
            } else {
                Object[] objArr = (Object[]) obj;
                int length6 = objArr.length;
                while (i < length6) {
                    h(objArr[i]);
                    i++;
                }
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Collection) {
            jsonWriter.beginArray();
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(it.next());
            }
            jsonWriter.endArray();
            return this;
        }
        if (obj instanceof Map) {
            jsonWriter.beginObject();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                try {
                    i(entry.getValue(), (String) key);
                } catch (ClassCastException e) {
                    throw new mr0(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e);
                }
            }
            jsonWriter.endObject();
            return this;
        }
        u12 u12Var = (u12) this.c.get(obj.getClass());
        if (u12Var != null) {
            jsonWriter.beginObject();
            u12Var.a(obj, this);
            jsonWriter.endObject();
            return this;
        }
        fj3 fj3Var = (fj3) this.d.get(obj.getClass());
        if (fj3Var != null) {
            fj3Var.a(obj, this);
            return this;
        }
        if (obj instanceof Enum) {
            if (obj instanceof t12) {
                int number = ((t12) obj).getNumber();
                j();
                jsonWriter.value(number);
            } else {
                String name = ((Enum) obj).name();
                j();
                jsonWriter.value(name);
            }
            return this;
        }
        jsonWriter.beginObject();
        this.e.a(obj, this);
        jsonWriter.endObject();
        return this;
    }

    public final jh1 i(Object obj, String str) {
        boolean z = this.f;
        JsonWriter jsonWriter = this.f2765b;
        if (z) {
            if (obj == null) {
                return this;
            }
            j();
            jsonWriter.name(str);
            return h(obj);
        }
        j();
        jsonWriter.name(str);
        if (obj == null) {
            jsonWriter.nullValue();
            return this;
        }
        return h(obj);
    }

    public final void j() {
        if (this.f2764a) {
        } else {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
    }
}
