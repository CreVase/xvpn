package com.vungle.ads.internal.util;

import android.os.Build;
import android.util.Log;
import android.webkit.URLUtil;
import defpackage.qb0;
import defpackage.tf3;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class FileUtility {
    public static final FileUtility INSTANCE = new FileUtility();
    private static ObjectInputStreamProvider objectInputStreamProvider = new qb0(16);
    private static final String TAG = "FileUtility";
    private static final List<Class<?>> allowedClasses = tf3.b0(LinkedHashSet.class, HashSet.class, HashMap.class, ArrayList.class, File.class);

    /* loaded from: classes2.dex */
    public interface ObjectInputStreamProvider {
        ObjectInputStream provideObjectInputStream(InputStream inputStream) throws IOException, ClassNotFoundException;
    }

    private FileUtility() {
    }

    public static /* synthetic */ ObjectInputStream a(InputStream inputStream) {
        return m94objectInputStreamProvider$lambda0(inputStream);
    }

    public static final void delete(File file) {
        if (file != null && file.exists()) {
            if (file.isDirectory()) {
                deleteContents(file);
            }
            if (!file.delete()) {
                file.toString();
            }
        }
    }

    public static final void deleteAndLogIfFailed(File file) {
        Path path;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                path = file.toPath();
                Files.delete(path);
            } else if (!file.delete()) {
                Log.e(TAG, "Cannot delete " + file.getName());
            }
        } catch (IOException e) {
            Log.e(TAG, "Cannot delete " + file.getName(), e);
        }
    }

    public static final void deleteContents(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            delete(file2);
        }
    }

    public static /* synthetic */ void getAllowedClasses$vungle_ads_release$annotations() {
    }

    private final String getIndentString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("|  ");
        }
        return sb.toString();
    }

    /* renamed from: objectInputStreamProvider$lambda-0 */
    public static final ObjectInputStream m94objectInputStreamProvider$lambda0(InputStream inputStream) {
        return new SafeObjectInputStream(inputStream, allowedClasses);
    }

    public static final void printDirectoryTree(File file) {
    }

    private final void printFile(File file, int i, StringBuilder sb) {
        sb.append(getIndentString(i));
        sb.append("+--");
        sb.append(file.getName());
        sb.append('\n');
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0061: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:98), block:B:47:0x0061 */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.io.Closeable, java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.vungle.ads.internal.util.FileUtility] */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.vungle.ads.internal.util.FileUtility$ObjectInputStreamProvider] */
    public static final <T> T readSerializable(File file) {
        Closeable closeable;
        ObjectInputStream objectInputStream;
        Closeable closeable2;
        ?? exists = file.exists();
        Closeable closeable3 = null;
        try {
            if (exists == 0) {
                return null;
            }
            try {
                exists = new FileInputStream(file);
            } catch (IOException e) {
                e = e;
                exists = 0;
                objectInputStream = null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                exists = 0;
                objectInputStream = null;
            } catch (Exception e3) {
                e = e3;
                exists = 0;
                objectInputStream = null;
            } catch (Throwable th) {
                th = th;
                exists = 0;
            }
            try {
                objectInputStream = objectInputStreamProvider.provideObjectInputStream(exists);
            } catch (IOException e4) {
                e = e4;
                objectInputStream = null;
            } catch (ClassNotFoundException e5) {
                e = e5;
                objectInputStream = null;
            } catch (Exception e6) {
                e = e6;
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                ?? r2 = INSTANCE;
                r2.closeQuietly(closeable3);
                r2.closeQuietly(exists);
                throw th;
            }
            try {
                T t = (T) objectInputStream.readObject();
                ?? r1 = INSTANCE;
                r1.closeQuietly(objectInputStream);
                r1.closeQuietly(exists);
                return t;
            } catch (IOException e7) {
                e = e7;
                Log.e(TAG, "IOIOException", e);
                closeable2 = exists;
                FileUtility fileUtility = INSTANCE;
                fileUtility.closeQuietly(objectInputStream);
                fileUtility.closeQuietly(closeable2);
                try {
                    delete(file);
                } catch (IOException unused) {
                }
                return null;
            } catch (ClassNotFoundException e8) {
                e = e8;
                Log.e(TAG, "ClassNotFoundException", e);
                closeable2 = exists;
                FileUtility fileUtility2 = INSTANCE;
                fileUtility2.closeQuietly(objectInputStream);
                fileUtility2.closeQuietly(closeable2);
                delete(file);
                return null;
            } catch (Exception e9) {
                e = e9;
                Log.e(TAG, "cannot read serializable", e);
                closeable2 = exists;
                FileUtility fileUtility22 = INSTANCE;
                fileUtility22.closeQuietly(objectInputStream);
                fileUtility22.closeQuietly(closeable2);
                delete(file);
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            closeable3 = closeable;
        }
    }

    public static final void writeSerializable(File file, Serializable serializable) {
        FileOutputStream fileOutputStream;
        if (file.exists()) {
            deleteAndLogIfFailed(file);
        }
        if (serializable == null) {
            return;
        }
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(fileOutputStream);
                    try {
                        objectOutputStream2.writeObject(serializable);
                        objectOutputStream2.reset();
                        FileUtility fileUtility = INSTANCE;
                        fileUtility.closeQuietly(objectOutputStream2);
                        fileUtility.closeQuietly(fileOutputStream);
                    } catch (IOException e) {
                        e = e;
                        objectOutputStream = objectOutputStream2;
                        Log.e(TAG, "IOIOException", e);
                        FileUtility fileUtility2 = INSTANCE;
                        fileUtility2.closeQuietly(objectOutputStream);
                        fileUtility2.closeQuietly(fileOutputStream);
                    } catch (Throwable th) {
                        th = th;
                        objectOutputStream = objectOutputStream2;
                        FileUtility fileUtility3 = INSTANCE;
                        fileUtility3.closeQuietly(objectOutputStream);
                        fileUtility3.closeQuietly(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (IOException e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final void closeQuietly(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public final List<Class<?>> getAllowedClasses$vungle_ads_release() {
        return allowedClasses;
    }

    public final ObjectInputStreamProvider getObjectInputStreamProvider() {
        return objectInputStreamProvider;
    }

    public final String guessFileName(String str, String str2) {
        return URLUtil.guessFileName(str, null, str2);
    }

    public final boolean isValidUrl(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || HttpUrl.Companion.parse(str) == null) {
            return false;
        }
        return true;
    }

    public final void setObjectInputStreamProvider(ObjectInputStreamProvider objectInputStreamProvider2) {
        objectInputStreamProvider = objectInputStreamProvider2;
    }

    public final long size(File file) {
        boolean z;
        long j = 0;
        if (file == null || !file.exists()) {
            return 0L;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    for (File file2 : listFiles) {
                        j += size(file2);
                    }
                }
            }
            return j;
        }
        return file.length();
    }

    private final void printDirectoryTree(File file, int i, StringBuilder sb) {
        if (file == null) {
            return;
        }
        if (file.isDirectory()) {
            sb.append(getIndentString(i));
            sb.append("+--");
            sb.append(file.getName());
            sb.append("/\n");
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    printDirectoryTree(file2, i + 1, sb);
                } else {
                    printFile(file2, i + 1, sb);
                }
            }
            return;
        }
        throw new IllegalArgumentException("folder is not a Directory".toString());
    }
}
