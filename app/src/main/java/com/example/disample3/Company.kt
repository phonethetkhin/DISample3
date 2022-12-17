package com.example.disample3

class Company constructor(val companName: String, val employee: Employee) {
    fun showEmployeeName(): String {
        return "Employee ${employee.name} is from the ${companName} Company"
    }
}