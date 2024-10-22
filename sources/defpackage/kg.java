package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class kg extends uu2 implements Map {
    public jg h;

    public kg(kg kgVar) {
        super(kgVar);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        int i = 0;
        if (this.h == null) {
            this.h = new jg(this, i);
        }
        jg jgVar = this.h;
        if (((mp1) jgVar.f2287a) == null) {
            jgVar.f2287a = new mp1(jgVar, i);
        }
        return (mp1) jgVar.f2287a;
    }

    @Override // java.util.Map
    public final Set keySet() {
        if (this.h == null) {
            this.h = new jg(this, 0);
        }
        jg jgVar = this.h;
        if (((mp1) jgVar.f2288b) == null) {
            jgVar.f2288b = new mp1(jgVar, 1);
        }
        return (mp1) jgVar.f2288b;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        c(map.size() + this.c);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        if (this.h == null) {
            this.h = new jg(this, 0);
        }
        jg jgVar = this.h;
        if (jgVar.c == null) {
            jgVar.c = new op1(jgVar);
        }
        return jgVar.c;
    }
}
