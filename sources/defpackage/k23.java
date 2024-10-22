package defpackage;

import com.google.protobuf.Struct;
import com.google.protobuf.Value;
import com.google.protobuf.c1;
import com.google.protobuf.k0;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes2.dex */
public final class k23 extends k0 implements l23 {
    public /* synthetic */ k23(c1 c1Var) {
        this();
    }

    public k23 clearFields() {
        Map mutableFieldsMap;
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.clear();
        return this;
    }

    @Override // defpackage.l23
    public boolean containsFields(String str) {
        str.getClass();
        return ((Struct) this.instance).getFieldsMap().containsKey(str);
    }

    @Override // defpackage.l23
    @Deprecated
    public Map<String, Value> getFields() {
        return getFieldsMap();
    }

    @Override // defpackage.l23
    public int getFieldsCount() {
        return ((Struct) this.instance).getFieldsMap().size();
    }

    @Override // defpackage.l23
    public Map<String, Value> getFieldsMap() {
        return Collections.unmodifiableMap(((Struct) this.instance).getFieldsMap());
    }

    @Override // defpackage.l23
    public Value getFieldsOrDefault(String str, Value value) {
        str.getClass();
        Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return fieldsMap.get(str);
        }
        return value;
    }

    @Override // defpackage.l23
    public Value getFieldsOrThrow(String str) {
        str.getClass();
        Map<String, Value> fieldsMap = ((Struct) this.instance).getFieldsMap();
        if (fieldsMap.containsKey(str)) {
            return fieldsMap.get(str);
        }
        throw new IllegalArgumentException();
    }

    public k23 putAllFields(Map<String, Value> map) {
        Map mutableFieldsMap;
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.putAll(map);
        return this;
    }

    public k23 putFields(String str, Value value) {
        Map mutableFieldsMap;
        str.getClass();
        value.getClass();
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.put(str, value);
        return this;
    }

    public k23 removeFields(String str) {
        Map mutableFieldsMap;
        str.getClass();
        copyOnWrite();
        mutableFieldsMap = ((Struct) this.instance).getMutableFieldsMap();
        mutableFieldsMap.remove(str);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private k23() {
        /*
            r1 = this;
            com.google.protobuf.Struct r0 = com.google.protobuf.Struct.access$000()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k23.<init>():void");
    }
}
