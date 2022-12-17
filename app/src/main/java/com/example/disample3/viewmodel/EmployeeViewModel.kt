package com.example.disample3.viewmodel

import androidx.lifecycle.ViewModel
import com.example.disample3.repository.EmployeeRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EmployeeViewModel @Inject constructor(val repository: EmployeeRepository) : ViewModel() {
    fun fetchEmployee() = repository.fetchEmployee()
}