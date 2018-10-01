package net.hugonardo.archtemplate.domain.extensions.rx

import io.reactivex.schedulers.TestScheduler

class TestSchedulers : SchedulersProvider {

    private val testScheduler = TestScheduler()

    override fun computation() = testScheduler

    override fun io() = testScheduler

    override fun ui() = testScheduler

    /**
     * Triggers any actions that have not yet been triggered and that are scheduled to be triggered at or
     * before this Scheduler's present time.
     *
     * @see [TestScheduler.triggerActions]
     */
    fun triggerActions() = testScheduler.triggerActions()
}
