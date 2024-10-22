package com.vungle.ads;

/* loaded from: classes2.dex */
public interface Ad {

    /* loaded from: classes2.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ void load$default(Ad ad, String str, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    str = null;
                }
                ad.load(str);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: load");
        }
    }

    Boolean canPlayAd();

    void load(String str);
}
