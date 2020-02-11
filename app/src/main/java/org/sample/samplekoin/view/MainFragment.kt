package org.sample.samplekoin.view


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.scope.currentScope
import org.koin.androidx.viewmodel.ext.android.sharedViewModel

import org.sample.samplekoin.R
import org.sample.samplekoin.viewmodel.MainViewModel

class MainFragment : Fragment() {

    val viewmodel : MainViewModel by lazy {
        requireActivity().currentScope.get<MainViewModel>()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewmodel.printSampleClass("MainFragment")
    }

}
