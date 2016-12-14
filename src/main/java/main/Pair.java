package main;

import lombok.Data;

/**
 * Created by wangmo on 2016/12/13.
 */
@Data
public class Pair implements Comparable {

    boolean pinned;

    boolean targetEmpty;

    int createdAt;

    public Pair() {}

    public Pair(boolean pinned, boolean targetEmpty, int createdAt) {
        this.pinned = pinned;
        this.targetEmpty = targetEmpty;
        this.createdAt = createdAt;
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return 1;
        }
        Pair p = (Pair)o;
        if (this.pinned == p.pinned) {
            if (this.targetEmpty == p.targetEmpty) {
                if (this.createdAt == p.createdAt) {
                    return 0;
                } else {
                    return this.createdAt < p.createdAt ? 1 : -1;
                }
            } else {
                return this.targetEmpty ? 1 : -1;
            }
        } else {
            return this.pinned ? -1 : 1;
        }
    }
}
