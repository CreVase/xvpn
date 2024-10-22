package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.ao2;
import defpackage.bl1;
import defpackage.bo2;
import defpackage.cg2;
import defpackage.co2;
import defpackage.d33;
import defpackage.do2;
import defpackage.eo2;
import defpackage.ew3;
import defpackage.fo2;
import defpackage.go2;
import defpackage.ho2;
import defpackage.ie2;
import defpackage.ik1;
import defpackage.jc;
import defpackage.kc0;
import defpackage.kf2;
import defpackage.ll3;
import defpackage.nf2;
import defpackage.se2;
import defpackage.uk3;
import defpackage.w10;
import defpackage.xn2;
import defpackage.ye2;
import defpackage.yn2;
import defpackage.zn2;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class SearchView extends ik1 implements w10 {
    public static final go2 s0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public kc0 O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean h0;
    public int i0;
    public boolean j0;
    public CharSequence k0;
    public boolean l0;
    public int m0;
    public SearchableInfo n0;
    public Bundle o0;
    public final SearchAutoComplete p;
    public final yn2 p0;
    public final View q;
    public final yn2 q0;
    public final View r;
    public final WeakHashMap r0;
    public final View s;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public ho2 y;
    public final Rect z;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new f();
        public boolean c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeValue(Boolean.valueOf(this.c));
        }
    }

    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends jc {
        public int e;
        public SearchView f;
        public boolean g;
        public final g h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet, ie2.autoCompleteTextViewStyle);
            this.h = new g(this);
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return UserVerificationMethods.USER_VERIFY_HANDPRINT;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                e.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            go2 go2Var = SearchView.s0;
            go2Var.getClass();
            go2.n();
            Object obj = go2Var.c;
            if (((Method) obj) != null) {
                try {
                    ((Method) obj).invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.jc, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                g gVar = this.h;
                removeCallbacks(gVar);
                post(gVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.y(searchView.N);
            searchView.post(searchView.p0);
            if (searchView.p.hasFocus()) {
                searchView.n();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                boolean z2 = true;
                this.g = true;
                Context context = getContext();
                go2 go2Var = SearchView.s0;
                if (context.getResources().getConfiguration().orientation != 2) {
                    z2 = false;
                }
                if (z2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            g gVar = this.h;
            if (!z) {
                this.g = false;
                removeCallbacks(gVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.g = false;
                    removeCallbacks(gVar);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }
    }

    static {
        go2 go2Var;
        if (Build.VERSION.SDK_INT < 29) {
            go2Var = new go2();
        } else {
            go2Var = null;
        }
        s0 = go2Var;
    }

    public SearchView(Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(se2.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(se2.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.h0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.h0 = false;
    }

    @Override // defpackage.w10
    public final void d() {
        if (this.l0) {
            return;
        }
        this.l0 = true;
        SearchAutoComplete searchAutoComplete = this.p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.m0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // defpackage.w10
    public final void e() {
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.k0 = "";
        clearFocus();
        y(true);
        searchAutoComplete.setImeOptions(this.m0);
        this.l0 = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.i0;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence == null) {
            SearchableInfo searchableInfo = this.n0;
            if (searchableInfo != null && searchableInfo.getHintId() != 0) {
                return getContext().getText(this.n0.getHintId());
            }
            return this.J;
        }
        return charSequence;
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public kc0 getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent l(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.k0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.o0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.n0.getSearchActivity());
        return intent;
    }

    public final Intent m(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.o0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void n() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.p;
        if (i >= 29) {
            e.a(searchAutoComplete);
            return;
        }
        go2 go2Var = s0;
        go2Var.getClass();
        go2.n();
        Object obj = go2Var.f2293a;
        if (((Method) obj) != null) {
            try {
                ((Method) obj).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused) {
            }
        }
        go2Var.getClass();
        go2.n();
        Object obj2 = go2Var.f2294b;
        if (((Method) obj2) != null) {
            try {
                ((Method) obj2).invoke(searchAutoComplete, new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public final void o() {
        SearchAutoComplete searchAutoComplete = this.p;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.M) {
                clearFocus();
                y(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.p0);
        post(this.q0);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.ik1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.A;
            rect2.set(i7, 0, i8, i9);
            ho2 ho2Var = this.y;
            if (ho2Var == null) {
                ho2 ho2Var2 = new ho2(rect2, rect, searchAutoComplete);
                this.y = ho2Var2;
                setTouchDelegate(ho2Var2);
            } else {
                ho2Var.f2461b.set(rect2);
                Rect rect3 = ho2Var.d;
                rect3.set(rect2);
                int i10 = -ho2Var.e;
                rect3.inset(i10, i10);
                ho2Var.c.set(rect);
            }
        }
    }

    @Override // defpackage.ik1, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.N) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.i0) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.i0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.i0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f200a);
        y(savedState.c);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.c = this.N;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.p0);
    }

    public final void p(int i) {
        Uri parse;
        String h;
        Cursor cursor = this.O.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                try {
                    int i2 = d33.x;
                    String h2 = d33.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                    if (h2 == null) {
                        h2 = this.n0.getSuggestIntentAction();
                    }
                    if (h2 == null) {
                        h2 = "android.intent.action.SEARCH";
                    }
                    String h3 = d33.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                    if (h3 == null) {
                        h3 = this.n0.getSuggestIntentData();
                    }
                    if (h3 != null && (h = d33.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                        h3 = h3 + "/" + Uri.encode(h);
                    }
                    if (h3 == null) {
                        parse = null;
                    } else {
                        parse = Uri.parse(h3);
                    }
                    intent = l(h2, parse, d33.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), d33.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
                } catch (RuntimeException unused) {
                    cursor.getPosition();
                }
            } catch (RuntimeException unused2) {
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void q(int i) {
        Editable text = this.p.getText();
        Cursor cursor = this.O.c;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                String c = this.O.c(cursor);
                if (c != null) {
                    setQuery(c);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void r(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.h0 || !isFocusable()) {
            return false;
        }
        if (!this.N) {
            boolean requestFocus = this.p.requestFocus(i, rect);
            if (requestFocus) {
                y(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public final void s() {
        SearchAutoComplete searchAutoComplete = this.p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.n0 != null) {
                getContext().startActivity(l("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public void setAppSearchData(Bundle bundle) {
        this.o0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            o();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        y(z);
        v();
    }

    public void setImeOptions(int i) {
        this.p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.i0 = i;
        requestLayout();
    }

    public void setOnCloseListener(do2 do2Var) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnQueryTextListener(eo2 eo2Var) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setOnSuggestionListener(fo2 fo2Var) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.R = z;
        kc0 kc0Var = this.O;
        if (kc0Var instanceof d33) {
            d33 d33Var = (d33) kc0Var;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            d33Var.p = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:            if (getContext().getPackageManager().resolveActivity(r3, 65536) != null) goto L35;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r8) {
        /*
            r7 = this;
            r7.n0 = r8
            androidx.appcompat.widget.SearchView$SearchAutoComplete r0 = r7.p
            r1 = 1
            r2 = 65536(0x10000, float:9.1835E-41)
            r3 = 0
            if (r8 == 0) goto L68
            int r8 = r8.getSuggestThreshold()
            r0.setThreshold(r8)
            android.app.SearchableInfo r8 = r7.n0
            int r8 = r8.getImeOptions()
            r0.setImeOptions(r8)
            android.app.SearchableInfo r8 = r7.n0
            int r8 = r8.getInputType()
            r4 = r8 & 15
            if (r4 != r1) goto L34
            r4 = -65537(0xfffffffffffeffff, float:NaN)
            r8 = r8 & r4
            android.app.SearchableInfo r4 = r7.n0
            java.lang.String r4 = r4.getSuggestAuthority()
            if (r4 == 0) goto L34
            r8 = r8 | r2
            r4 = 524288(0x80000, float:7.34684E-40)
            r8 = r8 | r4
        L34:
            r0.setInputType(r8)
            kc0 r8 = r7.O
            if (r8 == 0) goto L3e
            r8.b(r3)
        L3e:
            android.app.SearchableInfo r8 = r7.n0
            java.lang.String r8 = r8.getSuggestAuthority()
            if (r8 == 0) goto L65
            d33 r8 = new d33
            android.content.Context r4 = r7.getContext()
            android.app.SearchableInfo r5 = r7.n0
            java.util.WeakHashMap r6 = r7.r0
            r8.<init>(r4, r7, r5, r6)
            r7.O = r8
            r0.setAdapter(r8)
            kc0 r8 = r7.O
            d33 r8 = (defpackage.d33) r8
            boolean r4 = r7.R
            if (r4 == 0) goto L62
            r4 = 2
            goto L63
        L62:
            r4 = 1
        L63:
            r8.p = r4
        L65:
            r7.v()
        L68:
            android.app.SearchableInfo r8 = r7.n0
            if (r8 == 0) goto L98
            boolean r8 = r8.getVoiceSearchEnabled()
            if (r8 == 0) goto L98
            android.app.SearchableInfo r8 = r7.n0
            boolean r8 = r8.getVoiceSearchLaunchWebSearch()
            if (r8 == 0) goto L7d
            android.content.Intent r3 = r7.H
            goto L87
        L7d:
            android.app.SearchableInfo r8 = r7.n0
            boolean r8 = r8.getVoiceSearchLaunchRecognizer()
            if (r8 == 0) goto L87
            android.content.Intent r3 = r7.I
        L87:
            if (r3 == 0) goto L98
            android.content.Context r8 = r7.getContext()
            android.content.pm.PackageManager r8 = r8.getPackageManager()
            android.content.pm.ResolveInfo r8 = r8.resolveActivity(r3, r2)
            if (r8 == 0) goto L98
            goto L99
        L98:
            r1 = 0
        L99:
            r7.j0 = r1
            if (r1 == 0) goto La2
            java.lang.String r8 = "nm"
            r0.setPrivateImeOptions(r8)
        La2:
            boolean r8 = r7.N
            r7.y(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.P = z;
        y(this.N);
    }

    public void setSuggestionsAdapter(kc0 kc0Var) {
        this.O = kc0Var;
        this.p.setAdapter(kc0Var);
    }

    public final void t() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        int i = 0;
        if (!z2 && (!this.M || this.l0)) {
            z = false;
        }
        if (!z) {
            i = 8;
        }
        ImageView imageView = this.v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void u() {
        int[] iArr;
        if (this.p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.M;
        SearchAutoComplete searchAutoComplete = this.p;
        if (z && (drawable = this.E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        boolean z;
        int i = 0;
        if ((this.P || this.j0) && !this.N) {
            z = true;
        } else {
            z = false;
        }
        if (!z || (this.u.getVisibility() != 0 && this.w.getVisibility() != 0)) {
            i = 8;
        }
        this.s.setVisibility(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001e, code lost:            if (r2.j0 == false) goto L20;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.P
            if (r0 == 0) goto L21
            r1 = 0
            if (r0 != 0) goto Lb
            boolean r0 = r2.j0
            if (r0 == 0) goto L11
        Lb:
            boolean r0 = r2.N
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L21
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L21
            if (r3 != 0) goto L23
            boolean r3 = r2.j0
            if (r3 != 0) goto L21
            goto L23
        L21:
            r1 = 8
        L23:
            android.widget.ImageView r3 = r2.u
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.x(boolean):void");
    }

    public final void y(boolean z) {
        int i;
        int i2;
        int i3;
        this.N = z;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i);
        x(z2);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.q.setVisibility(i2);
        ImageView imageView = this.D;
        if (imageView.getDrawable() != null && !this.M) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        t();
        boolean z3 = !z2;
        if (this.j0 && !this.N && z3) {
            this.u.setVisibility(8);
            i4 = 0;
        }
        this.w.setVisibility(i4);
        w();
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ie2.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        int i2 = 0;
        this.p0 = new yn2(this, i2);
        this.q0 = new yn2(this, 1);
        this.r0 = new WeakHashMap();
        c cVar = new c(this);
        d dVar = new d(this);
        bo2 bo2Var = new bo2(this);
        co2 co2Var = new co2(this, i2);
        bl1 bl1Var = new bl1(this, 1);
        xn2 xn2Var = new xn2(this, i2);
        int[] iArr = cg2.SearchView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        go2 go2Var = new go2(context, obtainStyledAttributes);
        ll3.o(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        LayoutInflater.from(context).inflate(go2Var.i(cg2.SearchView_layout, kf2.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(ye2.search_src_text);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(ye2.search_edit_frame);
        View findViewById = findViewById(ye2.search_plate);
        this.r = findViewById;
        View findViewById2 = findViewById(ye2.submit_area);
        this.s = findViewById2;
        ImageView imageView = (ImageView) findViewById(ye2.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(ye2.search_go_btn);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(ye2.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(ye2.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(ye2.search_mag_icon);
        this.D = imageView5;
        uk3.q(findViewById, go2Var.e(cg2.SearchView_queryBackground));
        uk3.q(findViewById2, go2Var.e(cg2.SearchView_submitBackground));
        int i3 = cg2.SearchView_searchIcon;
        imageView.setImageDrawable(go2Var.e(i3));
        imageView2.setImageDrawable(go2Var.e(cg2.SearchView_goIcon));
        imageView3.setImageDrawable(go2Var.e(cg2.SearchView_closeIcon));
        imageView4.setImageDrawable(go2Var.e(cg2.SearchView_voiceIcon));
        imageView5.setImageDrawable(go2Var.e(i3));
        this.E = go2Var.e(cg2.SearchView_searchHintIcon);
        ew3.c1(imageView, getResources().getString(nf2.abc_searchview_description_search));
        this.F = go2Var.i(cg2.SearchView_suggestionRowLayout, kf2.abc_search_dropdown_item_icons_2line);
        this.G = go2Var.i(cg2.SearchView_commitIcon, 0);
        imageView.setOnClickListener(cVar);
        imageView3.setOnClickListener(cVar);
        imageView2.setOnClickListener(cVar);
        imageView4.setOnClickListener(cVar);
        searchAutoComplete.setOnClickListener(cVar);
        searchAutoComplete.addTextChangedListener(xn2Var);
        searchAutoComplete.setOnEditorActionListener(bo2Var);
        searchAutoComplete.setOnItemClickListener(co2Var);
        searchAutoComplete.setOnItemSelectedListener(bl1Var);
        searchAutoComplete.setOnKeyListener(dVar);
        searchAutoComplete.setOnFocusChangeListener(new zn2(this));
        setIconifiedByDefault(go2Var.a(cg2.SearchView_iconifiedByDefault, true));
        int d = go2Var.d(cg2.SearchView_android_maxWidth, -1);
        if (d != -1) {
            setMaxWidth(d);
        }
        this.J = go2Var.k(cg2.SearchView_defaultQueryHint);
        this.Q = go2Var.k(cg2.SearchView_queryHint);
        int h = go2Var.h(cg2.SearchView_android_imeOptions, -1);
        if (h != -1) {
            setImeOptions(h);
        }
        int h2 = go2Var.h(cg2.SearchView_android_inputType, -1);
        if (h2 != -1) {
            setInputType(h2);
        }
        setFocusable(go2Var.a(cg2.SearchView_android_focusable, true));
        go2Var.o();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new ao2(this, 0));
        }
        y(this.M);
        v();
    }
}
