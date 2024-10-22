package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.util.CollectionsConcurrencyUtil;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.ng0;
import defpackage.to1;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class FilePreferences {
    public static final Companion Companion = new Companion(null);
    private static final String FILENAME = "settings_vungle";
    private final File file;
    private final Executor ioExecutor;
    private final PathProvider pathProvider;
    private final ConcurrentHashMap<String, Object> values;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ void getFILENAME$annotations() {
        }

        public final String getFILENAME() {
            return FilePreferences.FILENAME;
        }
    }

    public FilePreferences(Executor executor, PathProvider pathProvider) {
        this.ioExecutor = executor;
        this.pathProvider = pathProvider;
        File file = new File(pathProvider.getSharedPrefsDir(), FILENAME);
        this.file = file;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        this.values = concurrentHashMap;
        Object readSerializable = FileUtility.readSerializable(file);
        if (readSerializable instanceof HashMap) {
            concurrentHashMap.putAll((HashMap) readSerializable);
        }
    }

    public static /* synthetic */ void a(FilePreferences filePreferences, Serializable serializable) {
        m78apply$lambda0(filePreferences, serializable);
    }

    /* renamed from: apply$lambda-0 */
    public static final void m78apply$lambda0(FilePreferences filePreferences, Serializable serializable) {
        FileUtility.writeSerializable(filePreferences.file, serializable);
    }

    public final void apply() {
        this.ioExecutor.execute(new to1(18, this, new HashMap(this.values)));
    }

    public final boolean getBoolean(String str, boolean z) {
        Object obj = this.values.get(str);
        return obj instanceof Boolean ? ((Boolean) obj).booleanValue() : z;
    }

    public final int getInt(String str, int i) {
        Object obj = this.values.get(str);
        if (obj instanceof Integer) {
            return ((Number) obj).intValue();
        }
        return i;
    }

    public final long getLong(String str, long j) {
        Object obj = this.values.get(str);
        if (obj instanceof Long) {
            return ((Number) obj).longValue();
        }
        return j;
    }

    public final String getString(String str, String str2) {
        Object obj = this.values.get(str);
        return obj instanceof String ? (String) obj : str2;
    }

    public final HashSet<String> getStringSet(String str, HashSet<String> hashSet) {
        Object obj = this.values.get(str);
        if (obj instanceof HashSet) {
            return CollectionsConcurrencyUtil.getNewHashSet((HashSet) obj);
        }
        return hashSet;
    }

    public final FilePreferences put(String str, boolean z) {
        this.values.put(str, Boolean.valueOf(z));
        return this;
    }

    public final FilePreferences remove(String str) {
        if (this.values.containsKey(str)) {
            this.values.remove(str);
        }
        return this;
    }

    public final FilePreferences put(String str, String str2) {
        this.values.put(str, str2);
        return this;
    }

    public final Boolean getBoolean(String str) {
        Object obj = this.values.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    public final String getString(String str) {
        Object obj = this.values.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final FilePreferences put(String str, int i) {
        this.values.put(str, Integer.valueOf(i));
        return this;
    }

    public final FilePreferences put(String str, HashSet<String> hashSet) {
        this.values.put(str, CollectionsConcurrencyUtil.getNewHashSet(hashSet));
        return this;
    }

    public final FilePreferences put(String str, long j) {
        this.values.put(str, Long.valueOf(j));
        return this;
    }
}
