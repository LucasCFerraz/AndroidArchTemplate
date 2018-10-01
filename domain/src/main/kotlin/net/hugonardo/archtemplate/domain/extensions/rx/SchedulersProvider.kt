package net.hugonardo.archtemplate.domain.extensions.rx

import io.reactivex.Scheduler

/**
 * Provides various threading schedulers. Useful to switch Executors on Unit Tests,
 * where you can use only one scope, like MainThread.
 */
interface SchedulersProvider {

    /**
     * Computation thread pool scheduler
     */
    fun computation(): Scheduler

    /**
     * IO thread pool scheduler
     */
    fun io(): Scheduler

    /**
     * Main Thread scheduler
     */
    fun ui(): Scheduler
}
