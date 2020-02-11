package org.sample.samplekoin.viewmodel

import androidx.lifecycle.ViewModel
import org.sample.samplekoin.SampleClass
import org.sample.samplekoin.SampleClass2

class MainViewModel(private val sampleClass: SampleClass,
                    private val sampleClass2: SampleClass2) : ViewModel(){


    fun printSampleClass(){
        sampleClass.print()
    }

    fun printSampleClass(from : String){
        sampleClass2.print2(from)
    }
}