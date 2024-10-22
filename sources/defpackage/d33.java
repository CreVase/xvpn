package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d33 extends kc0 implements View.OnClickListener {
    public static final /* synthetic */ int x = 0;
    public final int h;
    public final int i;
    public final LayoutInflater j;
    public final SearchView k;
    public final SearchableInfo l;
    public final Context m;
    public final WeakHashMap n;
    public final int o;
    public int p;
    public ColorStateList q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d33(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context);
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.i = suggestionRowLayout;
        this.h = suggestionRowLayout;
        this.j = (LayoutInflater) context.getSystemService("layout_inflater");
        this.p = 1;
        this.r = -1;
        this.s = -1;
        this.t = -1;
        this.u = -1;
        this.v = -1;
        this.w = -1;
        this.k = searchView;
        this.l = searchableInfo;
        this.o = searchView.getSuggestionCommitIconResId();
        this.m = context;
        this.n = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0120  */
    @Override // defpackage.kc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r22, android.database.Cursor r23) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d33.a(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.kc0
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.r = cursor.getColumnIndex("suggest_text_1");
                this.s = cursor.getColumnIndex("suggest_text_2");
                this.t = cursor.getColumnIndex("suggest_text_2_url");
                this.u = cursor.getColumnIndex("suggest_icon_1");
                this.v = cursor.getColumnIndex("suggest_icon_2");
                this.w = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.kc0
    public final String c(Cursor cursor) {
        String h;
        String h2;
        if (cursor == null) {
            return null;
        }
        String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (h3 != null) {
            return h3;
        }
        SearchableInfo searchableInfo = this.l;
        if (searchableInfo.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return h2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return h;
    }

    @Override // defpackage.kc0
    public final View d(ViewGroup viewGroup) {
        View inflate = this.j.inflate(this.h, viewGroup, false);
        inflate.setTag(new c33(inflate));
        ((ImageView) inflate.findViewById(ye2.edit_query)).setImageResource(this.o);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.m.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        }
        throw new FileNotFoundException("No authority: " + uri);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            r10 = this;
            java.util.WeakHashMap r0 = r10.n
            android.content.Context r1 = r10.m
            java.lang.String r2 = "android.resource://"
            r3 = 0
            if (r11 == 0) goto Lf2
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto Lf2
            java.lang.String r4 = "0"
            boolean r4 = r4.equals(r11)
            if (r4 == 0) goto L19
            goto Lf2
        L19:
            int r4 = java.lang.Integer.parseInt(r11)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.<init>(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r1.getPackageName()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = "/"
            r5.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r5.append(r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.String r2 = r5.toString()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            java.lang.Object r5 = r0.get(r2)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r5 != 0) goto L3f
            r5 = r3
            goto L43
        L3f:
            android.graphics.drawable.Drawable r5 = r5.newDrawable()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L43:
            if (r5 == 0) goto L46
            return r5
        L46:
            android.graphics.drawable.Drawable r4 = defpackage.x80.getDrawable(r1, r4)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            if (r4 == 0) goto L53
            android.graphics.drawable.Drawable$ConstantState r5 = r4.getConstantState()     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
            r0.put(r2, r5)     // Catch: android.content.res.Resources.NotFoundException -> L54 java.lang.NumberFormatException -> L55
        L53:
            return r4
        L54:
            return r3
        L55:
            java.lang.Object r2 = r0.get(r11)
            android.graphics.drawable.Drawable$ConstantState r2 = (android.graphics.drawable.Drawable.ConstantState) r2
            if (r2 != 0) goto L5f
            r2 = r3
            goto L63
        L5f:
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
        L63:
            if (r2 == 0) goto L66
            return r2
        L66:
            android.net.Uri r2 = android.net.Uri.parse(r11)
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r5 = "Error closing icon stream for "
            java.lang.String r6 = "Failed to open "
            java.lang.String r7 = "Resource does not exist: "
            java.lang.String r8 = r2.getScheme()     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.String r9 = "android.resource"
            boolean r8 = r9.equals(r8)     // Catch: java.io.FileNotFoundException -> Le2
            if (r8 == 0) goto L96
            android.graphics.drawable.Drawable r1 = r10.e(r2)     // Catch: android.content.res.Resources.NotFoundException -> L84 java.io.FileNotFoundException -> Le2
            r3 = r1
            goto Le9
        L84:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Le2
            r4.<init>(r7)     // Catch: java.io.FileNotFoundException -> Le2
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> Le2
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Le2
            throw r1     // Catch: java.io.FileNotFoundException -> Le2
        L96:
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.FileNotFoundException -> Le2
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch: java.io.FileNotFoundException -> Le2
            if (r1 == 0) goto Ld0
            android.graphics.drawable.Drawable r6 = android.graphics.drawable.Drawable.createFromStream(r1, r3)     // Catch: java.lang.Throwable -> Lba
            r1.close()     // Catch: java.io.IOException -> La8
            goto Lb8
        La8:
            r1 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Le2
            r7.<init>(r5)     // Catch: java.io.FileNotFoundException -> Le2
            r7.append(r2)     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.String r5 = r7.toString()     // Catch: java.io.FileNotFoundException -> Le2
            android.util.Log.e(r4, r5, r1)     // Catch: java.io.FileNotFoundException -> Le2
        Lb8:
            r3 = r6
            goto Le9
        Lba:
            r6 = move-exception
            r1.close()     // Catch: java.io.IOException -> Lbf
            goto Lcf
        Lbf:
            r1 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Le2
            r7.<init>(r5)     // Catch: java.io.FileNotFoundException -> Le2
            r7.append(r2)     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.String r5 = r7.toString()     // Catch: java.io.FileNotFoundException -> Le2
            android.util.Log.e(r4, r5, r1)     // Catch: java.io.FileNotFoundException -> Le2
        Lcf:
            throw r6     // Catch: java.io.FileNotFoundException -> Le2
        Ld0:
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> Le2
            r4.<init>(r6)     // Catch: java.io.FileNotFoundException -> Le2
            r4.append(r2)     // Catch: java.io.FileNotFoundException -> Le2
            java.lang.String r4 = r4.toString()     // Catch: java.io.FileNotFoundException -> Le2
            r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> Le2
            throw r1     // Catch: java.io.FileNotFoundException -> Le2
        Le2:
            r1 = move-exception
            java.util.Objects.toString(r2)
            r1.getMessage()
        Le9:
            if (r3 == 0) goto Lf2
            android.graphics.drawable.Drawable$ConstantState r1 = r3.getConstantState()
            r0.put(r11, r1)
        Lf2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d33.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.m.getContentResolver().query(fragment.build(), null, suggestSelection, strArr, null);
    }

    @Override // defpackage.kc0, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View inflate = this.j.inflate(this.i, viewGroup, false);
            if (inflate != null) {
                ((c33) inflate.getTag()).f576a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.kc0, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            View d = d(viewGroup);
            ((c33) d.getTag()).f576a.setText(e.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.c;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.k.r((CharSequence) tag);
        }
    }
}
