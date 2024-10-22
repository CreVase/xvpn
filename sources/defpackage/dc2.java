package defpackage;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dc2 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1756a;

    /* renamed from: b, reason: collision with root package name */
    public Serializable f1757b;
    public Serializable c;
    public Serializable d;
    public Serializable e;
    public Serializable f;
    public Serializable g;
    public Serializable h;
    public Object i;

    public dc2(int i) {
        if (i != 1) {
            return;
        }
        this.f1757b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.f = new HashSet();
        this.g = new HashSet();
        this.h = new HashMap();
        this.i = new WeakHashMap();
    }
}
