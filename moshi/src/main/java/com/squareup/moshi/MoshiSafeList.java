package com.squareup.moshi;

import java.util.ArrayList;
import java.util.List;

/**
 * A list interface that filters out all invalid list elements.
 * <p>
 * Refer to the {@link JsonReader#getDataMappingMismatchLog()} to determine whether any
 * elements have been removed as part of deserialization.
 */
public interface MoshiSafeList<T> extends List<T> {
    class Impl<T> extends ArrayList<T> implements MoshiSafeList<T> {
    }
}
