package defpackage;

/* loaded from: classes.dex */
public final class ii extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f2598a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2599b;
    public final y01 c;

    public ii(int i, y01 y01Var, boolean z) {
        super(hx2.m("AudioTrack write failed: ", i));
        this.f2599b = z;
        this.f2598a = i;
        this.c = y01Var;
    }
}
