/*
 * Copyright (C) 2010-2012 Klaus Reimer <k@ailis.de>
 * See LICENSE.TXT for licensing information.
 */

package de.ailis.xadrian.support;

import java.io.Serializable;
import java.util.Comparator;

/**
 * Reverse integer comparator
 * 
 * @author Klaus Reimer (k@ailis.de)
 */
public class ReverseIntegerComparator implements Serializable,
    Comparator<Integer>
{
    /** Serial version UID. */
    private static final long serialVersionUID = 1L;

    /**
     * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
     */

    @Override
    public int compare(final Integer o1, final Integer o2)
    {
        return o2.compareTo(o1);
    }
}
