package com.example.softpaypractice.login

import android.app.FragmentTransaction
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.softpaypractice.R
import com.example.softpaypractice.databinding.FragmentLoginBinding
import com.example.softpaypractice.main.MainFragment
import com.example.softpaypractice.root.MainActivity

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding  = DataBindingUtil.inflate(inflater, R.layout.fragment_login, container, false)
        binding.myViewModel = loginViewModel
        val mainActivity = activity as MainActivity // MainActivity에 있는 함수를 사용하기 위해

        binding.btnLogin.setOnClickListener {
            mainActivity.changeFragment(MainFragment())
        }

        return binding.root
    }
}

