package org.sample.samplekoin

import android.util.Log

class SampleClass2(val sampleClass: SampleClass){

    fun print2(TAG : String){
        Log.d(TAG, "printed from sampleclass2")
    }
}