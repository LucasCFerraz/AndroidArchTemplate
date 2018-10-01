package net.hugonardo.archtemplate.domain.extensions.rx

import io.reactivex.schedulers.Schedulers

/**
 * A [SchedulersProvider] that provides [Schedulers.trampoline] on all its functions.
 *
 * Useful on Unit Tests where it is expected that all operations are done on the main thread.
 */
class TrampolineSchedulers : SchedulersProvider {

    override fun computation() = Schedulers.trampoline()

    override fun io() = Schedulers.trampoline()

    override fun ui() = Schedulers.trampoline()
}
