package com.squareup.moshi;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A list interface that filters out all invalid list elements.
 * <p>
 * Refer to the {@link JsonReader#getDataMappingMismatchLog()} to determine whether any
 * elements have been removed as part of deserialization.
 */
public interface MoshiSafeSet<T> extends Set<T> {
    class Impl<T> extends LinkedHashSet<T> implements MoshiSafeSet<T> {
    }
}
