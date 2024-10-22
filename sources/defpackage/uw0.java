package defpackage;

import com.google.protobuf.m0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class uw0 {
    private vw2 fields;
    private boolean hasLazyField;
    private boolean hasNestedBuilders;
    private boolean isMutable;

    public /* synthetic */ uw0(tw0 tw0Var) {
        this();
    }

    private ww0 buildImpl(boolean z) {
        if (this.fields.isEmpty()) {
            return ww0.emptySet();
        }
        this.isMutable = false;
        vw2 vw2Var = this.fields;
        if (this.hasNestedBuilders) {
            vw2Var = ww0.cloneAllFieldsMap(vw2Var, false);
            replaceBuilders(vw2Var, z);
        }
        ww0 ww0Var = new ww0(vw2Var, null);
        ww0Var.hasLazyField = this.hasLazyField;
        return ww0Var;
    }

    private void ensureIsMutable() {
        vw2 cloneAllFieldsMap;
        if (!this.isMutable) {
            cloneAllFieldsMap = ww0.cloneAllFieldsMap(this.fields, true);
            this.fields = cloneAllFieldsMap;
            this.isMutable = true;
        }
    }

    public static <T extends vw0> uw0 fromFieldSet(ww0 ww0Var) {
        vw2 vw2Var;
        vw2 cloneAllFieldsMap;
        boolean z;
        vw2Var = ww0Var.fields;
        cloneAllFieldsMap = ww0.cloneAllFieldsMap(vw2Var, true);
        uw0 uw0Var = new uw0(cloneAllFieldsMap);
        z = ww0Var.hasLazyField;
        uw0Var.hasLazyField = z;
        return uw0Var;
    }

    private void mergeFromField(Map.Entry<vw0, Object> entry) {
        Object cloneIfMutable;
        Object cloneIfMutable2;
        Object cloneIfMutable3;
        vw0 key = entry.getKey();
        Object value = entry.getValue();
        if (value instanceof aj1) {
            value = ((aj1) value).getValue();
        }
        m0 m0Var = (m0) key;
        if (m0Var.isRepeated()) {
            List list = (List) getFieldAllowBuilders(m0Var);
            if (list == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) m0Var, (Object) list);
            }
            Iterator it = ((List) value).iterator();
            while (it.hasNext()) {
                cloneIfMutable3 = ww0.cloneIfMutable(it.next());
                list.add(cloneIfMutable3);
            }
            return;
        }
        if (m0Var.getLiteJavaType() == mr3.MESSAGE) {
            Object fieldAllowBuilders = getFieldAllowBuilders(m0Var);
            if (fieldAllowBuilders == null) {
                vw2 vw2Var = this.fields;
                cloneIfMutable2 = ww0.cloneIfMutable(value);
                vw2Var.put((Comparable<Object>) m0Var, cloneIfMutable2);
                return;
            } else if (fieldAllowBuilders instanceof xv1) {
                m0Var.internalMergeFrom((xv1) fieldAllowBuilders, (yv1) value);
                return;
            } else {
                this.fields.put((Comparable<Object>) m0Var, (Object) m0Var.internalMergeFrom(((yv1) fieldAllowBuilders).toBuilder(), (yv1) value).build());
                return;
            }
        }
        vw2 vw2Var2 = this.fields;
        cloneIfMutable = ww0.cloneIfMutable(value);
        vw2Var2.put((Comparable<Object>) m0Var, cloneIfMutable);
    }

    private static Object replaceBuilder(Object obj, boolean z) {
        if (!(obj instanceof xv1)) {
            return obj;
        }
        xv1 xv1Var = (xv1) obj;
        if (z) {
            return xv1Var.buildPartial();
        }
        return xv1Var.build();
    }

    private static <T extends vw0> void replaceBuilders(vw2 vw2Var, boolean z) {
        for (int i = 0; i < vw2Var.getNumArrayEntries(); i++) {
            replaceBuilders(vw2Var.getArrayEntryAt(i), z);
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = vw2Var.getOverflowEntries().iterator();
        while (it.hasNext()) {
            replaceBuilders(it.next(), z);
        }
    }

    private void verifyType(vw0 vw0Var, Object obj) {
        boolean isValidType;
        m0 m0Var = (m0) vw0Var;
        isValidType = ww0.isValidType(m0Var.getLiteType(), obj);
        if (!isValidType) {
            if (m0Var.getLiteType().getJavaType() == mr3.MESSAGE && (obj instanceof xv1)) {
            } else {
                throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(m0Var.getNumber()), m0Var.getLiteType().getJavaType(), obj.getClass().getName()));
            }
        }
    }

    public void addRepeatedField(vw0 vw0Var, Object obj) {
        boolean z;
        List list;
        ensureIsMutable();
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            if (!this.hasNestedBuilders && !(obj instanceof xv1)) {
                z = false;
            } else {
                z = true;
            }
            this.hasNestedBuilders = z;
            verifyType(m0Var, obj);
            Object fieldAllowBuilders = getFieldAllowBuilders(m0Var);
            if (fieldAllowBuilders == null) {
                list = new ArrayList();
                this.fields.put((Comparable<Object>) m0Var, (Object) list);
            } else {
                list = (List) fieldAllowBuilders;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    public ww0 build() {
        return buildImpl(false);
    }

    public ww0 buildPartial() {
        return buildImpl(true);
    }

    public void clearField(vw0 vw0Var) {
        ensureIsMutable();
        this.fields.remove(vw0Var);
        if (this.fields.isEmpty()) {
            this.hasLazyField = false;
        }
    }

    public Map<vw0, Object> getAllFields() {
        vw2 cloneAllFieldsMap;
        if (this.hasLazyField) {
            cloneAllFieldsMap = ww0.cloneAllFieldsMap(this.fields, false);
            if (this.fields.isImmutable()) {
                cloneAllFieldsMap.makeImmutable();
            } else {
                replaceBuilders(cloneAllFieldsMap, true);
            }
            return cloneAllFieldsMap;
        }
        if (this.fields.isImmutable()) {
            return this.fields;
        }
        return Collections.unmodifiableMap(this.fields);
    }

    public Object getField(vw0 vw0Var) {
        return replaceBuilders(vw0Var, getFieldAllowBuilders(vw0Var), true);
    }

    public Object getFieldAllowBuilders(vw0 vw0Var) {
        Object obj = this.fields.get(vw0Var);
        if (obj instanceof aj1) {
            return ((aj1) obj).getValue();
        }
        return obj;
    }

    public Object getRepeatedField(vw0 vw0Var, int i) {
        if (this.hasNestedBuilders) {
            ensureIsMutable();
        }
        return replaceBuilder(getRepeatedFieldAllowBuilders(vw0Var, i), true);
    }

    public Object getRepeatedFieldAllowBuilders(vw0 vw0Var, int i) {
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            Object fieldAllowBuilders = getFieldAllowBuilders(m0Var);
            if (fieldAllowBuilders != null) {
                return ((List) fieldAllowBuilders).get(i);
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    public int getRepeatedFieldCount(vw0 vw0Var) {
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            Object fieldAllowBuilders = getFieldAllowBuilders(m0Var);
            if (fieldAllowBuilders == null) {
                return 0;
            }
            return ((List) fieldAllowBuilders).size();
        }
        throw new IllegalArgumentException("getRepeatedFieldCount() can only be called on repeated fields.");
    }

    public boolean hasField(vw0 vw0Var) {
        m0 m0Var = (m0) vw0Var;
        if (!m0Var.isRepeated()) {
            if (this.fields.get(m0Var) != null) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    public boolean isInitialized() {
        boolean isInitialized;
        boolean isInitialized2;
        for (int i = 0; i < this.fields.getNumArrayEntries(); i++) {
            isInitialized2 = ww0.isInitialized(this.fields.getArrayEntryAt(i));
            if (!isInitialized2) {
                return false;
            }
        }
        Iterator<Map.Entry<Comparable<Object>, Object>> it = this.fields.getOverflowEntries().iterator();
        while (it.hasNext()) {
            isInitialized = ww0.isInitialized(it.next());
            if (!isInitialized) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000c */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mergeFrom(defpackage.ww0 r3) {
        /*
            r2 = this;
            r2.ensureIsMutable()
            r0 = 0
        L4:
            vw2 r1 = defpackage.ww0.access$400(r3)
            int r1 = r1.getNumArrayEntries()
            if (r0 >= r1) goto L1c
            vw2 r1 = defpackage.ww0.access$400(r3)
            java.util.Map$Entry r1 = r1.getArrayEntryAt(r0)
            r2.mergeFromField(r1)
            int r0 = r0 + 1
            goto L4
        L1c:
            vw2 r3 = defpackage.ww0.access$400(r3)
            java.lang.Iterable r3 = r3.getOverflowEntries()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r2.mergeFromField(r0)
            goto L28
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uw0.mergeFrom(ww0):void");
    }

    public void setField(vw0 vw0Var, Object obj) {
        boolean z;
        ensureIsMutable();
        m0 m0Var = (m0) vw0Var;
        boolean z2 = false;
        if (m0Var.isRepeated()) {
            if (obj instanceof List) {
                ArrayList arrayList = new ArrayList((List) obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    verifyType(m0Var, next);
                    if (!this.hasNestedBuilders && !(next instanceof xv1)) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.hasNestedBuilders = z;
                }
                obj = arrayList;
            } else {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        } else {
            verifyType(m0Var, obj);
        }
        if (obj instanceof aj1) {
            this.hasLazyField = true;
        }
        if (this.hasNestedBuilders || (obj instanceof xv1)) {
            z2 = true;
        }
        this.hasNestedBuilders = z2;
        this.fields.put((Comparable<Object>) m0Var, obj);
    }

    public void setRepeatedField(vw0 vw0Var, int i, Object obj) {
        boolean z;
        ensureIsMutable();
        m0 m0Var = (m0) vw0Var;
        if (m0Var.isRepeated()) {
            if (!this.hasNestedBuilders && !(obj instanceof xv1)) {
                z = false;
            } else {
                z = true;
            }
            this.hasNestedBuilders = z;
            Object fieldAllowBuilders = getFieldAllowBuilders(m0Var);
            if (fieldAllowBuilders != null) {
                verifyType(m0Var, obj);
                ((List) fieldAllowBuilders).set(i, obj);
                return;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    private uw0() {
        this(vw2.newFieldMap(16));
    }

    private uw0(vw2 vw2Var) {
        this.fields = vw2Var;
        this.isMutable = true;
    }

    private static <T extends vw0> void replaceBuilders(Map.Entry<T, Object> entry, boolean z) {
        entry.setValue(replaceBuilders(entry.getKey(), entry.getValue(), z));
    }

    private static <T extends vw0> Object replaceBuilders(T t, Object obj, boolean z) {
        if (obj == null) {
            return obj;
        }
        m0 m0Var = (m0) t;
        if (m0Var.getLiteJavaType() != mr3.MESSAGE) {
            return obj;
        }
        if (m0Var.isRepeated()) {
            if (obj instanceof List) {
                List list = (List) obj;
                for (int i = 0; i < list.size(); i++) {
                    Object obj2 = list.get(i);
                    Object replaceBuilder = replaceBuilder(obj2, z);
                    if (replaceBuilder != obj2) {
                        if (list == obj) {
                            list = new ArrayList(list);
                        }
                        list.set(i, replaceBuilder);
                    }
                }
                return list;
            }
            throw new IllegalStateException("Repeated field should contains a List but actually contains type: " + obj.getClass());
        }
        return replaceBuilder(obj, z);
    }
}
