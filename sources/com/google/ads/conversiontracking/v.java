package com.google.ads.conversiontracking;

import android.content.SharedPreferences;
import com.google.ads.conversiontracking.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class v implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences f1414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f1415b;
    public final /* synthetic */ g.b c;
    public final /* synthetic */ String d;

    public v(SharedPreferences sharedPreferences, ArrayList arrayList, g.b bVar, String str) {
        this.f1414a = sharedPreferences;
        this.f1415b = arrayList;
        this.c = bVar;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SharedPreferences.Editor edit = this.f1414a.edit();
        Iterator it = this.f1415b.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.putString(this.c.f1395a, this.d);
        edit.commit();
    }
}
