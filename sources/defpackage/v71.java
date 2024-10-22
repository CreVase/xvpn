package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class v71 {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f4789a;

    public v71(Context context, String str) {
        this.f4789a = context.getSharedPreferences("FirebaseHeartBeat" + str, 0);
    }

    public final synchronized void a() {
        long j = this.f4789a.getLong("fire-count", 0L);
        String str = "";
        String str2 = null;
        for (Map.Entry<String, ?> entry : this.f4789a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                for (String str3 : (Set) entry.getValue()) {
                    if (str2 == null || str2.compareTo(str3) > 0) {
                        str = entry.getKey();
                        str2 = str3;
                    }
                }
            }
        }
        HashSet hashSet = new HashSet(this.f4789a.getStringSet(str, new HashSet()));
        hashSet.remove(str2);
        this.f4789a.edit().putStringSet(str, hashSet).putLong("fire-count", j - 1).commit();
    }

    public final synchronized void b() {
        SharedPreferences.Editor edit = this.f4789a.edit();
        int i = 0;
        for (Map.Entry<String, ?> entry : this.f4789a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Set set = (Set) entry.getValue();
                String d = d(System.currentTimeMillis());
                String key = entry.getKey();
                if (set.contains(d)) {
                    HashSet hashSet = new HashSet();
                    hashSet.add(d);
                    i++;
                    edit.putStringSet(key, hashSet);
                } else {
                    edit.remove(key);
                }
            }
        }
        if (i == 0) {
            edit.remove("fire-count");
        } else {
            edit.putLong("fire-count", i);
        }
        edit.commit();
    }

    public final synchronized ArrayList c() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Map.Entry<String, ?> entry : this.f4789a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                HashSet hashSet = new HashSet((Set) entry.getValue());
                hashSet.remove(d(System.currentTimeMillis()));
                if (!hashSet.isEmpty()) {
                    arrayList.add(new rl(entry.getKey(), new ArrayList(hashSet)));
                }
            }
        }
        l(System.currentTimeMillis());
        return arrayList;
    }

    public final synchronized String d(long j) {
        Instant instant;
        ZoneOffset zoneOffset;
        OffsetDateTime atOffset;
        LocalDateTime localDateTime;
        DateTimeFormatter dateTimeFormatter;
        String format;
        if (Build.VERSION.SDK_INT >= 26) {
            instant = new Date(j).toInstant();
            zoneOffset = ZoneOffset.UTC;
            atOffset = instant.atOffset(zoneOffset);
            localDateTime = atOffset.toLocalDateTime();
            dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
            format = localDateTime.format(dateTimeFormatter);
            return format;
        }
        return new SimpleDateFormat("yyyy-MM-dd", Locale.UK).format(new Date(j));
    }

    public final synchronized String e(String str) {
        for (Map.Entry<String, ?> entry : this.f4789a.getAll().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return entry.getKey();
                    }
                }
            }
        }
        return null;
    }

    public final synchronized boolean f(long j, long j2) {
        return d(j).equals(d(j2));
    }

    public final synchronized void g() {
        String d = d(System.currentTimeMillis());
        this.f4789a.edit().putString("last-used-date", d).commit();
        h(d);
    }

    public final synchronized void h(String str) {
        String e = e(str);
        if (e == null) {
            return;
        }
        HashSet hashSet = new HashSet(this.f4789a.getStringSet(e, new HashSet()));
        hashSet.remove(str);
        if (hashSet.isEmpty()) {
            this.f4789a.edit().remove(e).commit();
        } else {
            this.f4789a.edit().putStringSet(e, hashSet).commit();
        }
    }

    public final synchronized boolean i(long j) {
        return j(j);
    }

    public final synchronized boolean j(long j) {
        if (this.f4789a.contains("fire-global")) {
            if (!f(this.f4789a.getLong("fire-global", -1L), j)) {
                this.f4789a.edit().putLong("fire-global", j).commit();
                return true;
            }
            return false;
        }
        this.f4789a.edit().putLong("fire-global", j).commit();
        return true;
    }

    public final synchronized void k(String str, long j) {
        String d = d(j);
        if (this.f4789a.getString("last-used-date", "").equals(d)) {
            String e = e(d);
            if (e == null) {
                return;
            }
            if (e.equals(str)) {
                return;
            }
            m(str, d);
            return;
        }
        long j2 = this.f4789a.getLong("fire-count", 0L);
        if (j2 + 1 == 30) {
            a();
            j2 = this.f4789a.getLong("fire-count", 0L);
        }
        HashSet hashSet = new HashSet(this.f4789a.getStringSet(str, new HashSet()));
        hashSet.add(d);
        this.f4789a.edit().putStringSet(str, hashSet).putLong("fire-count", j2 + 1).putString("last-used-date", d).commit();
    }

    public final synchronized void l(long j) {
        this.f4789a.edit().putLong("fire-global", j).commit();
    }

    public final synchronized void m(String str, String str2) {
        h(str2);
        HashSet hashSet = new HashSet(this.f4789a.getStringSet(str, new HashSet()));
        hashSet.add(str2);
        this.f4789a.edit().putStringSet(str, hashSet).commit();
    }
}
