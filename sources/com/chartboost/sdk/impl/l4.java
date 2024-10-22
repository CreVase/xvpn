package com.chartboost.sdk.impl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.ng0;

/* loaded from: classes.dex */
public final class l4 extends SQLiteOpenHelper {
    public /* synthetic */ l4(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, ng0 ng0Var) {
        this(context, (i2 & 2) != 0 ? "chartboost_exoplayer.db" : str, (i2 & 4) != 0 ? null : cursorFactory, (i2 & 8) != 0 ? 1 : i);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public l4(Context context, String str, SQLiteDatabase.CursorFactory cursorFactory, int i) {
        super(context, str, cursorFactory, i);
    }
}
