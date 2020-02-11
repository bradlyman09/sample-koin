package org.sample.samplekoin.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.koin.androidx.scope.currentScope
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.sample.samplekoin.R
import org.sample.samplekoin.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

//    private val viewmodel : MainViewModel by viewModel()
    private val viewmodel : MainViewModel by currentScope.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewmodel.printSampleClass()
    }
}
