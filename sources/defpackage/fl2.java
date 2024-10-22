package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class fl2 {

    /* renamed from: b, reason: collision with root package name */
    public final String f2112b;
    public final Context c;
    public ArrayList d;
    public Executor e;
    public Executor f;
    public t33 g;
    public boolean h;
    public boolean j;
    public HashSet l;

    /* renamed from: a, reason: collision with root package name */
    public final Class f2111a = WorkDatabase.class;
    public boolean i = true;
    public final ja1 k = new ja1(14);

    public fl2(Context context, String str) {
        this.c = context;
        this.f2112b = str;
    }

    public final void a(uw1... uw1VarArr) {
        if (this.l == null) {
            this.l = new HashSet();
        }
        for (uw1 uw1Var : uw1VarArr) {
            this.l.add(Integer.valueOf(uw1Var.f4746a));
            this.l.add(Integer.valueOf(uw1Var.f4747b));
        }
        ja1 ja1Var = this.k;
        ja1Var.getClass();
        for (uw1 uw1Var2 : uw1VarArr) {
            int i = uw1Var2.f4746a;
            TreeMap treeMap = (TreeMap) ((HashMap) ja1Var.f2735b).get(Integer.valueOf(i));
            if (treeMap == null) {
                treeMap = new TreeMap();
                ((HashMap) ja1Var.f2735b).put(Integer.valueOf(i), treeMap);
            }
            int i2 = uw1Var2.f4747b;
            uw1 uw1Var3 = (uw1) treeMap.get(Integer.valueOf(i2));
            if (uw1Var3 != null) {
                uw1Var3.toString();
                uw1Var2.toString();
            }
            treeMap.put(Integer.valueOf(i2), uw1Var2);
        }
    }
}
