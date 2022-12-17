package com.example.disample3.repository

import com.example.disample3.service.NetworkService
import javax.inject.Inject

class EmployeeRepository @Inject constructor(val networkService: NetworkService) {

    fun fetchEmployee() = networkService.fetchEmployeeFromServer()
}