package com.example.disample3.service

import javax.inject.Inject

class NetworkService @Inject constructor(){

    fun fetchEmployeeFromServer(): String {
        return "Fetching... data from the server, please wait..."
    }
}