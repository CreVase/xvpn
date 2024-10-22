package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public class vw2 extends AbstractMap {
    private List<qw2> entryList;
    private boolean isImmutable;
    private volatile kw2 lazyDescendingEntrySet;
    private volatile uw2 lazyEntrySet;
    private final int maxArraySize;
    private Map<Comparable<Object>, Object> overflowEntries;
    private Map<Comparable<Object>, Object> overflowEntriesDescending;

    public /* synthetic */ vw2(int i, hw2 hw2Var) {
        this(i);
    }

    private int binarySearchInArray(Comparable<Object> comparable) {
        int size = this.entryList.size() - 1;
        if (size >= 0) {
            int compareTo = comparable.compareTo(this.entryList.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(this.entryList.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 > 0) {
                i = i2 + 1;
            } else {
                return i2;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkMutable() {
        if (!this.isImmutable) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private void ensureEntryArrayMutable() {
        checkMutable();
        if (this.entryList.isEmpty() && !(this.entryList instanceof ArrayList)) {
            this.entryList = new ArrayList(this.maxArraySize);
        }
    }

    private SortedMap<Comparable<Object>, Object> getOverflowEntriesMutable() {
        checkMutable();
        if (this.overflowEntries.isEmpty() && !(this.overflowEntries instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.overflowEntries = treeMap;
            this.overflowEntriesDescending = treeMap.descendingMap();
        }
        return (SortedMap) this.overflowEntries;
    }

    public static <FieldDescriptorType extends vw0> vw2 newFieldMap(int i) {
        return new hw2(i);
    }

    public static <K extends Comparable<K>, V> vw2 newInstanceForTest(int i) {
        return new vw2(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object removeArrayEntryAt(int i) {
        checkMutable();
        Object value = this.entryList.remove(i).getValue();
        if (!this.overflowEntries.isEmpty()) {
            Iterator<Map.Entry<Comparable<Object>, Object>> it = getOverflowEntriesMutable().entrySet().iterator();
            this.entryList.add(new qw2(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        checkMutable();
        if (!this.entryList.isEmpty()) {
            this.entryList.clear();
        }
        if (!this.overflowEntries.isEmpty()) {
            this.overflowEntries.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable<Object> comparable = (Comparable) obj;
        if (binarySearchInArray(comparable) < 0 && !this.overflowEntries.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public Set<Map.Entry<Comparable<Object>, Object>> descendingEntrySet() {
        if (this.lazyDescendingEntrySet == null) {
            this.lazyDescendingEntrySet = new kw2(this, null);
        }
        return this.lazyDescendingEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<Comparable<Object>, Object>> entrySet() {
        if (this.lazyEntrySet == null) {
            this.lazyEntrySet = new uw2(this, null);
        }
        return this.lazyEntrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw2)) {
            return super.equals(obj);
        }
        vw2 vw2Var = (vw2) obj;
        int size = size();
        if (size != vw2Var.size()) {
            return false;
        }
        int numArrayEntries = getNumArrayEntries();
        if (numArrayEntries != vw2Var.getNumArrayEntries()) {
            return entrySet().equals(vw2Var.entrySet());
        }
        for (int i = 0; i < numArrayEntries; i++) {
            if (!getArrayEntryAt(i).equals(vw2Var.getArrayEntryAt(i))) {
                return false;
            }
        }
        if (numArrayEntries == size) {
            return true;
        }
        return this.overflowEntries.equals(vw2Var.overflowEntries);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable<Object> comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).getValue();
        }
        return this.overflowEntries.get(comparable);
    }

    public Map.Entry<Comparable<Object>, Object> getArrayEntryAt(int i) {
        return this.entryList.get(i);
    }

    public int getNumArrayEntries() {
        return this.entryList.size();
    }

    public int getNumOverflowEntries() {
        return this.overflowEntries.size();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntries() {
        if (this.overflowEntries.isEmpty()) {
            return pw2.iterable();
        }
        return this.overflowEntries.entrySet();
    }

    public Iterable<Map.Entry<Comparable<Object>, Object>> getOverflowEntriesDescending() {
        if (this.overflowEntriesDescending.isEmpty()) {
            return pw2.iterable();
        }
        return this.overflowEntriesDescending.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int numArrayEntries = getNumArrayEntries();
        int i = 0;
        for (int i2 = 0; i2 < numArrayEntries; i2++) {
            i += this.entryList.get(i2).hashCode();
        }
        if (getNumOverflowEntries() > 0) {
            return i + this.overflowEntries.hashCode();
        }
        return i;
    }

    public boolean isImmutable() {
        return this.isImmutable;
    }

    public void makeImmutable() {
        Map<Comparable<Object>, Object> unmodifiableMap;
        Map<Comparable<Object>, Object> unmodifiableMap2;
        if (!this.isImmutable) {
            if (this.overflowEntries.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.overflowEntries);
            }
            this.overflowEntries = unmodifiableMap;
            if (this.overflowEntriesDescending.isEmpty()) {
                unmodifiableMap2 = Collections.emptyMap();
            } else {
                unmodifiableMap2 = Collections.unmodifiableMap(this.overflowEntriesDescending);
            }
            this.overflowEntriesDescending = unmodifiableMap2;
            this.isImmutable = true;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        checkMutable();
        Comparable<Object> comparable = (Comparable) obj;
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return removeArrayEntryAt(binarySearchInArray);
        }
        if (this.overflowEntries.isEmpty()) {
            return null;
        }
        return this.overflowEntries.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.overflowEntries.size() + this.entryList.size();
    }

    private vw2(int i) {
        this.maxArraySize = i;
        this.entryList = Collections.emptyList();
        this.overflowEntries = Collections.emptyMap();
        this.overflowEntriesDescending = Collections.emptyMap();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object put(Comparable<Object> comparable, Object obj) {
        checkMutable();
        int binarySearchInArray = binarySearchInArray(comparable);
        if (binarySearchInArray >= 0) {
            return this.entryList.get(binarySearchInArray).setValue(obj);
        }
        ensureEntryArrayMutable();
        int i = -(binarySearchInArray + 1);
        if (i >= this.maxArraySize) {
            return getOverflowEntriesMutable().put(comparable, obj);
        }
        int size = this.entryList.size();
        int i2 = this.maxArraySize;
        if (size == i2) {
            qw2 remove = this.entryList.remove(i2 - 1);
            getOverflowEntriesMutable().put(remove.getKey(), remove.getValue());
        }
        this.entryList.add(i, new qw2(this, comparable, obj));
        return null;
    }
}
