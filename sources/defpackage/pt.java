package defpackage;

/* loaded from: classes.dex */
public interface pt {
    void onCacheInitialized();

    void onSpanAdded(jt jtVar, tt ttVar);

    void onSpanRemoved(jt jtVar, tt ttVar);

    void onSpanTouched(jt jtVar, tt ttVar, tt ttVar2);

    void onStartFile(jt jtVar, String str, long j, long j2);

    boolean requiresCacheSpanTouches();
}
