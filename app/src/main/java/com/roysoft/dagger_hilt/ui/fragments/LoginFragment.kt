package com.roysoft.dagger_hilt.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.roysoft.dagger_hilt.R
import com.roysoft.dagger_hilt.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : Fragment(R.layout.fragment_login){

    private val mainViewModel : MainViewModel by viewModels()

}