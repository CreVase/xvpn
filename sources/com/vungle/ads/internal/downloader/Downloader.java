package com.vungle.ads.internal.downloader;

import android.content.Context;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public interface Downloader {

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface NetworkType {
        public static final Companion Companion = Companion.$$INSTANCE;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            private static int CELLULAR = 1;
            private static int WIFI = 2;
            private static int ANY = 1 | 2;

            private Companion() {
            }

            public final int getANY() {
                return ANY;
            }

            public final int getCELLULAR() {
                return CELLULAR;
            }

            public final int getWIFI() {
                return WIFI;
            }

            public final void setANY(int i) {
                ANY = i;
            }

            public final void setCELLULAR(int i) {
                CELLULAR = i;
            }

            public final void setWIFI(int i) {
                WIFI = i;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class RequestException extends Exception {
        public RequestException(String str) {
            super(str);
        }
    }

    void cancel(DownloadRequest downloadRequest);

    void cancelAll();

    void download(DownloadRequest downloadRequest, AssetDownloadListener assetDownloadListener);

    File getDestinationDir(Context context);
}
