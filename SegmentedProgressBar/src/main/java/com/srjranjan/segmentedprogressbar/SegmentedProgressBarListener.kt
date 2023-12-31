package com.srjranjan.segmentedprogressbar

/**
 * Interface to communicate progress events
 */
interface SegmentedProgressBarListener {
    /**
     * Notifies when selected segment changed
     */
    fun onPage(oldPageIndex: Int, newPageIndex: Int)

    /**
     * Notifies when last segment finished animating
     */
    fun onFinished()
}