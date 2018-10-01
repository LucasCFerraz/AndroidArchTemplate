package net.hugonardo.archtemplate.presentation.extensions.rx

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import net.hugonardo.archtemplate.domain.extensions.rx.SchedulersProvider
import javax.inject.Inject

class ProductionSchedulers
@Inject constructor() : SchedulersProvider {

    override fun computation() = Schedulers.computation()

    override fun io() = Schedulers.io()

    override fun ui() = AndroidSchedulers.mainThread()!!
}

