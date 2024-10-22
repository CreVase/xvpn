package defpackage;

import android.os.LocaleList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zm1 implements ym1 {

    /* renamed from: a, reason: collision with root package name */
    public final LocaleList f5511a;

    public zm1(Object obj) {
        this.f5511a = q2.h(obj);
    }

    @Override // defpackage.ym1
    public final String a() {
        String languageTags;
        languageTags = this.f5511a.toLanguageTags();
        return languageTags;
    }

    @Override // defpackage.ym1
    public final Object b() {
        return this.f5511a;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.f5511a.equals(((ym1) obj).b());
        return equals;
    }

    @Override // defpackage.ym1
    public final Locale get(int i) {
        Locale locale;
        locale = this.f5511a.get(i);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.f5511a.hashCode();
        return hashCode;
    }

    @Override // defpackage.ym1
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.f5511a.isEmpty();
        return isEmpty;
    }

    @Override // defpackage.ym1
    public final int size() {
        int size;
        size = this.f5511a.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.f5511a.toString();
        return localeList;
    }
}
