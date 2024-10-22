package com.vungle.ads.internal.util;

import android.util.Log;
import defpackage.i23;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* loaded from: classes2.dex */
public final class UnzipUtility {
    private static final int BUFFER_SIZE = 4096;
    public static final UnzipUtility INSTANCE = new UnzipUtility();
    private static final String TAG = UnzipUtility.class.getCanonicalName();

    /* loaded from: classes2.dex */
    public interface Filter {
        boolean matches(String str);
    }

    /* loaded from: classes2.dex */
    public static final class ZipSecurityException extends IOException {
        public ZipSecurityException(String str) {
            super(str);
        }
    }

    private UnzipUtility() {
    }

    public static /* synthetic */ List unzip$default(UnzipUtility unzipUtility, String str, String str2, Filter filter, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            filter = null;
        }
        return unzipUtility.unzip(str, str2, filter);
    }

    private final String validateFilename(String str, String str2) throws IOException {
        String canonicalPath = new File(str).getCanonicalPath();
        if (i23.q1(canonicalPath, new File(str2).getCanonicalPath(), false)) {
            return canonicalPath;
        }
        Log.e(TAG, "File is outside extraction target directory.");
        throw new ZipSecurityException("File is outside extraction target directory.");
    }

    public final void extractFile(InputStream inputStream, String str) throws IOException {
        FileOutputStream fileOutputStream;
        Throwable th;
        BufferedOutputStream bufferedOutputStream;
        File file = new File(str);
        FileUtility.delete(file);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            fileOutputStream = new FileOutputStream(str);
            try {
                bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = inputStream.read(bArr);
                        if (read != -1) {
                            bufferedOutputStream.write(bArr, 0, read);
                        } else {
                            FileUtility fileUtility = FileUtility.INSTANCE;
                            fileUtility.closeQuietly(inputStream);
                            fileUtility.closeQuietly(bufferedOutputStream);
                            fileUtility.closeQuietly(fileOutputStream);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    FileUtility fileUtility2 = FileUtility.INSTANCE;
                    fileUtility2.closeQuietly(inputStream);
                    fileUtility2.closeQuietly(bufferedOutputStream);
                    fileUtility2.closeQuietly(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                bufferedOutputStream = null;
            }
        } catch (Throwable th4) {
            fileOutputStream = null;
            th = th4;
            bufferedOutputStream = null;
        }
    }

    public final List<File> unzip(String str, String str2) throws IOException {
        return unzip$default(this, str, str2, null, 4, null);
    }

    public final List<File> unzip(String str, String str2, Filter filter) throws IOException {
        if (!(str == null || str.length() == 0)) {
            File file = new File(str);
            if (file.exists()) {
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                ArrayList arrayList = new ArrayList();
                ZipFile zipFile = null;
                try {
                    ZipFile zipFile2 = new ZipFile(file);
                    try {
                        Enumeration<? extends ZipEntry> entries = zipFile2.entries();
                        while (entries.hasMoreElements()) {
                            ZipEntry nextElement = entries.nextElement();
                            String str3 = str2 + File.separator + nextElement.getName();
                            if (filter == null || filter.matches(str3)) {
                                validateFilename(str3, str2);
                                if (nextElement.isDirectory()) {
                                    File file3 = new File(str3);
                                    if (!file3.exists()) {
                                        file3.mkdirs();
                                    }
                                } else {
                                    extractFile(zipFile2.getInputStream(nextElement), str3);
                                    arrayList.add(new File(str3));
                                }
                            }
                        }
                        try {
                            zipFile2.close();
                        } catch (IOException unused) {
                        }
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        zipFile = zipFile2;
                        if (zipFile != null) {
                            try {
                                zipFile.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } else {
                throw new IOException("File does not exist");
            }
        } else {
            throw new IOException("Path is empty");
        }
    }
}
