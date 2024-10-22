package defpackage;

import android.database.Cursor;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class c63 {

    /* renamed from: a, reason: collision with root package name */
    public final String f589a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f590b;
    public final Set c;
    public final Set d;

    public c63(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        Set unmodifiableSet;
        this.f589a = str;
        this.f590b = Collections.unmodifiableMap(hashMap);
        this.c = Collections.unmodifiableSet(hashSet);
        if (hashSet2 == null) {
            unmodifiableSet = null;
        } else {
            unmodifiableSet = Collections.unmodifiableSet(hashSet2);
        }
        this.d = unmodifiableSet;
    }

    public static c63 a(j31 j31Var, String str) {
        HashSet hashSet;
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        int i3;
        boolean z2;
        Cursor x = j31Var.x("PRAGMA table_info(`" + str + "`)");
        HashMap hashMap = new HashMap();
        try {
            if (x.getColumnCount() > 0) {
                int columnIndex = x.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                int columnIndex2 = x.getColumnIndex("type");
                int columnIndex3 = x.getColumnIndex("notnull");
                int columnIndex4 = x.getColumnIndex("pk");
                int columnIndex5 = x.getColumnIndex("dflt_value");
                while (x.moveToNext()) {
                    String string = x.getString(columnIndex);
                    String string2 = x.getString(columnIndex2);
                    if (x.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hashMap.put(string, new y53(x.getInt(columnIndex4), string, string2, x.getString(columnIndex5), z2, 2));
                }
            }
            x.close();
            HashSet hashSet2 = new HashSet();
            x = j31Var.x("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = x.getColumnIndex(FacebookMediationAdapter.KEY_ID);
                int columnIndex7 = x.getColumnIndex("seq");
                int columnIndex8 = x.getColumnIndex("table");
                int columnIndex9 = x.getColumnIndex("on_delete");
                int columnIndex10 = x.getColumnIndex("on_update");
                ArrayList b2 = b(x);
                int count = x.getCount();
                int i4 = 0;
                while (i4 < count) {
                    x.moveToPosition(i4);
                    if (x.getInt(columnIndex7) != 0) {
                        i = columnIndex6;
                        i2 = columnIndex7;
                        arrayList = b2;
                        i3 = count;
                    } else {
                        int i5 = x.getInt(columnIndex6);
                        i = columnIndex6;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex7;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = b2.iterator();
                        while (it.hasNext()) {
                            ArrayList arrayList4 = b2;
                            a63 a63Var = (a63) it.next();
                            int i6 = count;
                            if (a63Var.f30a == i5) {
                                arrayList2.add(a63Var.c);
                                arrayList3.add(a63Var.d);
                            }
                            b2 = arrayList4;
                            count = i6;
                        }
                        arrayList = b2;
                        i3 = count;
                        hashSet2.add(new z53(x.getString(columnIndex8), x.getString(columnIndex9), x.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4++;
                    columnIndex6 = i;
                    columnIndex7 = i2;
                    b2 = arrayList;
                    count = i3;
                }
                x.close();
                x = j31Var.x("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = x.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    int columnIndex12 = x.getColumnIndex("origin");
                    int columnIndex13 = x.getColumnIndex("unique");
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        hashSet = new HashSet();
                        while (x.moveToNext()) {
                            if ("c".equals(x.getString(columnIndex12))) {
                                String string3 = x.getString(columnIndex11);
                                if (x.getInt(columnIndex13) == 1) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                b63 c = c(j31Var, string3, z);
                                if (c != null) {
                                    hashSet.add(c);
                                }
                            }
                        }
                        return new c63(str, hashMap, hashSet2, hashSet);
                    }
                    x.close();
                    hashSet = null;
                    return new c63(str, hashMap, hashSet2, hashSet);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static ArrayList b(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(FacebookMediationAdapter.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new a63(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static b63 c(j31 j31Var, String str, boolean z) {
        Cursor x = j31Var.x("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = x.getColumnIndex("seqno");
            int columnIndex2 = x.getColumnIndex("cid");
            int columnIndex3 = x.getColumnIndex(AppMeasurementSdk.ConditionalUserProperty.NAME);
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (x.moveToNext()) {
                    if (x.getInt(columnIndex2) >= 0) {
                        treeMap.put(Integer.valueOf(x.getInt(columnIndex)), x.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                return new b63(arrayList, str, z);
            }
            x.close();
            return null;
        } finally {
            x.close();
        }
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || c63.class != obj.getClass()) {
            return false;
        }
        c63 c63Var = (c63) obj;
        String str = c63Var.f589a;
        String str2 = this.f589a;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map = c63Var.f590b;
        Map map2 = this.f590b;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set2 = c63Var.c;
        Set set3 = this.c;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.d;
        if (set4 == null || (set = c63Var.d) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        String str = this.f589a;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = i * 31;
        Map map = this.f590b;
        if (map != null) {
            i2 = map.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        Set set = this.c;
        if (set != null) {
            i3 = set.hashCode();
        }
        return i5 + i3;
    }

    public final String toString() {
        return "TableInfo{name='" + this.f589a + "', columns=" + this.f590b + ", foreignKeys=" + this.c + ", indices=" + this.d + '}';
    }
}
