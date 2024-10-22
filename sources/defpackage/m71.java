package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class m71 extends eq1 {
    public final /* synthetic */ int c;
    public final l71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m71(uh1 uh1Var, uh1 uh1Var2, int i) {
        super(uh1Var, uh1Var2);
        this.c = i;
        if (i != 1) {
            this.d = new l71(uh1Var.getDescriptor(), uh1Var2.getDescriptor(), 0);
        } else {
            super(uh1Var, uh1Var2);
            this.d = new l71(uh1Var.getDescriptor(), uh1Var2.getDescriptor(), 1);
        }
    }

    @Override // defpackage.u
    public final Object a() {
        switch (this.c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // defpackage.u
    public final int b(Object obj) {
        int size;
        switch (this.c) {
            case 0:
                size = ((HashMap) obj).size();
                break;
            default:
                size = ((LinkedHashMap) obj).size();
                break;
        }
        return size * 2;
    }

    @Override // defpackage.u
    public final /* bridge */ /* synthetic */ Iterator c(Object obj) {
        switch (this.c) {
            case 0:
                return j((Map) obj);
            default:
                return j((Map) obj);
        }
    }

    @Override // defpackage.u
    public final int d(Object obj) {
        int i = this.c;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                switch (i) {
                    case 0:
                        return map.size();
                    default:
                        return map.size();
                }
            default:
                Map map2 = (Map) obj;
                switch (i) {
                    case 0:
                        return map2.size();
                    default:
                        return map2.size();
                }
        }
    }

    @Override // defpackage.u
    public final Object g(Object obj) {
        switch (this.c) {
            case 0:
                return new HashMap((Map) null);
            default:
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.d;
    }

    @Override // defpackage.u
    public final Object h(Object obj) {
        switch (this.c) {
            case 0:
                return (HashMap) obj;
            default:
                return (LinkedHashMap) obj;
        }
    }

    public final Iterator j(Map map) {
        switch (this.c) {
            case 0:
                return map.entrySet().iterator();
            default:
                return map.entrySet().iterator();
        }
    }
}
