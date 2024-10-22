package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class xc3 implements v23 {

    /* renamed from: a, reason: collision with root package name */
    public final uc3 f5146a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f5147b;
    public final Map c;
    public final Map d;
    public final Map e;

    public xc3(uc3 uc3Var, HashMap hashMap, HashMap hashMap2, HashMap hashMap3) {
        this.f5146a = uc3Var;
        this.d = hashMap2;
        this.e = hashMap3;
        this.c = Collections.unmodifiableMap(hashMap);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        uc3Var.d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f5147b = jArr;
    }

    @Override // defpackage.v23
    public final int a(long j) {
        long[] jArr = this.f5147b;
        int b2 = wi3.b(jArr, j, false);
        if (b2 >= jArr.length) {
            return -1;
        }
        return b2;
    }

    @Override // defpackage.v23
    public final long b(int i) {
        return this.f5147b[i];
    }

    @Override // defpackage.v23
    public final List c(long j) {
        Map map = this.c;
        Map map2 = this.d;
        uc3 uc3Var = this.f5146a;
        uc3Var.getClass();
        ArrayList arrayList = new ArrayList();
        uc3Var.g(j, uc3Var.h, arrayList);
        TreeMap treeMap = new TreeMap();
        uc3Var.i(j, false, uc3Var.h, treeMap);
        uc3Var.h(j, map, map2, uc3Var.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) this.e.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                vc3 vc3Var = (vc3) map2.get(pair.first);
                vc3Var.getClass();
                arrayList2.add(new hc0(null, null, null, decodeByteArray, vc3Var.c, 0, vc3Var.e, vc3Var.f4817b, 0, Integer.MIN_VALUE, -3.4028235E38f, vc3Var.f, vc3Var.g, false, -16777216, vc3Var.j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            vc3 vc3Var2 = (vc3) map2.get(entry.getKey());
            vc3Var2.getClass();
            gc0 gc0Var = (gc0) entry.getValue();
            CharSequence charSequence = gc0Var.f2230a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (fk0 fk0Var : (fk0[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), fk0.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(fk0Var), spannableStringBuilder.getSpanEnd(fk0Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            gc0Var.e = vc3Var2.c;
            gc0Var.f = vc3Var2.d;
            gc0Var.g = vc3Var2.e;
            gc0Var.h = vc3Var2.f4817b;
            gc0Var.l = vc3Var2.f;
            gc0Var.k = vc3Var2.i;
            gc0Var.j = vc3Var2.h;
            gc0Var.p = vc3Var2.j;
            arrayList2.add(gc0Var.a());
        }
        return arrayList2;
    }

    @Override // defpackage.v23
    public final int d() {
        return this.f5147b.length;
    }
}
