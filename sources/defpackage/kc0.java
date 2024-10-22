package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* loaded from: classes.dex */
public abstract class kc0 extends BaseAdapter implements Filterable, lc0 {
    public mc0 g;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2930b = true;
    public Cursor c = null;

    /* renamed from: a, reason: collision with root package name */
    public boolean f2929a = false;
    public int d = -1;
    public jc0 e = new jc0(this);
    public el1 f = new el1(this, 1);

    public kc0(Context context) {
    }

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                jc0 jc0Var = this.e;
                if (jc0Var != null) {
                    cursor2.unregisterContentObserver(jc0Var);
                }
                el1 el1Var = this.f;
                if (el1Var != null) {
                    cursor2.unregisterDataSetObserver(el1Var);
                }
            }
            this.c = cursor;
            if (cursor != null) {
                jc0 jc0Var2 = this.e;
                if (jc0Var2 != null) {
                    cursor.registerContentObserver(jc0Var2);
                }
                el1 el1Var2 = this.f;
                if (el1Var2 != null) {
                    cursor.registerDataSetObserver(el1Var2);
                }
                this.d = cursor.getColumnIndexOrThrow("_id");
                this.f2929a = true;
                notifyDataSetChanged();
            } else {
                this.d = -1;
                this.f2929a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.f2929a && (cursor = this.c) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.f2929a) {
            this.c.moveToPosition(i);
            if (view == null) {
                d33 d33Var = (d33) this;
                view = d33Var.j.inflate(d33Var.i, viewGroup, false);
            }
            a(view, this.c);
            return view;
        }
        return null;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.g == null) {
            this.g = new mc0(this);
        }
        return this.g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.f2929a && (cursor = this.c) != null) {
            cursor.moveToPosition(i);
            return this.c;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.f2929a || (cursor = this.c) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.c.getLong(this.d);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.f2929a) {
            if (this.c.moveToPosition(i)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.c);
                return view;
            }
            throw new IllegalStateException(hx2.m("couldn't move cursor to position ", i));
        }
        throw new IllegalStateException("this should only be called when the cursor is valid");
    }
}
