package com.procore.hackathon.labourlink.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NotificationsViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is notifications Fragment"
    }
    val text: LiveData<String> = _text

    private val _name = MutableLiveData<String>().apply {
        value = "James Mathew"
    }
    val name: LiveData<String> = _name

    private val _rate = MutableLiveData<String>().apply {
        value = "$10"
    }
    val rate: LiveData<String> = _rate

    private val _email = MutableLiveData<String>().apply {
        value = "james0607@gmail.com"
    }
    val email: LiveData<String> = _email

    private val _phone = MutableLiveData<String>().apply {
        value = "+1-245-678-9780"
    }
    val phone: LiveData<String> = _phone

    fun updateValues(name: String, email: String, phone: String, rate: String) {
        _name.value = name
        _email.value = email
        _phone.value = phone
        _rate.value = rate
    }
}