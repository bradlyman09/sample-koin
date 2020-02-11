package org.sample.samplekoin.di.modules

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.GlobalContext.get
import org.koin.core.qualifier.named
import org.koin.dsl.module
import org.sample.samplekoin.SampleClass
import org.sample.samplekoin.SampleClass2
import org.sample.samplekoin.SampleClass3
import org.sample.samplekoin.SampleInterface
import org.sample.samplekoin.view.MainActivity
import org.sample.samplekoin.viewmodel.MainViewModel


val appModule = module {
    // Define a singleton for type  DataRepository
    single { SampleClass() }
    single { SampleClass2(get()) }


    // Define a factory (create a new instance each time) for type Presenter (infered parameter in <>)
    // Resolve constructor dependency with get()
//    factory<Presenter> { MyPresenter(get()) }

    factory<SampleInterface> { SampleClass3() }

    // declare a scope for MainActivity
    scope(named<MainActivity>()){
        scoped {MainViewModel(get(), get())}
    }


    //injecting a viewmodel
//    viewModel { MainViewModel(get()) }

}