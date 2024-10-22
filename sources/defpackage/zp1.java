package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zp1 implements yp1 {
    private static <K, V> int getSerializedSizeLite(int i, Object obj, Object obj2) {
        wp1 wp1Var = (wp1) obj;
        rp1 rp1Var = (rp1) obj2;
        int i2 = 0;
        if (wp1Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry<Object, Object> entry : wp1Var.entrySet()) {
            i2 += rp1Var.computeMessageSize(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    private static <K, V> wp1 mergeFromLite(Object obj, Object obj2) {
        wp1 wp1Var = (wp1) obj;
        wp1 wp1Var2 = (wp1) obj2;
        if (!wp1Var2.isEmpty()) {
            if (!wp1Var.isMutable()) {
                wp1Var = wp1Var.mutableCopy();
            }
            wp1Var.mergeFrom(wp1Var2);
        }
        return wp1Var;
    }

    @Override // defpackage.yp1
    public Map<?, ?> forMapData(Object obj) {
        return (wp1) obj;
    }

    @Override // defpackage.yp1
    public qp1 forMapMetadata(Object obj) {
        return ((rp1) obj).getMetadata();
    }

    @Override // defpackage.yp1
    public Map<?, ?> forMutableMapData(Object obj) {
        return (wp1) obj;
    }

    @Override // defpackage.yp1
    public int getSerializedSize(int i, Object obj, Object obj2) {
        return getSerializedSizeLite(i, obj, obj2);
    }

    @Override // defpackage.yp1
    public boolean isImmutable(Object obj) {
        return !((wp1) obj).isMutable();
    }

    @Override // defpackage.yp1
    public Object mergeFrom(Object obj, Object obj2) {
        return mergeFromLite(obj, obj2);
    }

    @Override // defpackage.yp1
    public Object newMapField(Object obj) {
        return wp1.emptyMapField().mutableCopy();
    }

    @Override // defpackage.yp1
    public Object toImmutable(Object obj) {
        ((wp1) obj).makeImmutable();
        return obj;
    }
}
