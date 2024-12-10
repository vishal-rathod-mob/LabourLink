package com.procore.hackathon.labourlink.ui.profile

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfileViewModel : ViewModel() {

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

    private val _address = MutableLiveData<String>().apply {
        value = "Colorado ,USA"
    }
    val address: LiveData<String> = _address

    private val _experience = MutableLiveData<String>().apply {
        value = "6,3"
    }

    private val _specialization = MutableLiveData<Map<String, Int>>().apply {
        value = mutableMapOf(Pair("Plumbing", 0), Pair("Electricals", 0))
    }
    val specialization: LiveData<Map<String, Int>> = _specialization

    fun updateRate(rate: String) {
        _rate.value = rate
    }

    fun updateExperience(experience: String) {
        _experience.value = experience
    }

    fun updateBasicInfo(name: String, email: String, phone: String, address: String) {
        _name.value = name
        _email.value = email
        _phone.value = phone
        _address.value = address
    }

    fun updateTrades(trades: List<String>) {
        val a = _specialization.value?.toMutableMap()
        trades.forEach { trade ->
            if (trade !in a?.keys!!) {
                a[trade] = 0
            }
        }
        val l = mutableListOf<String>()
        a?.keys?.forEach { it ->
            if (!trades.contains(it)) {
                l.add(it)
            }
        }
        l.forEach {
            a?.remove(it)
        }
        _specialization.value = a
    }

    fun updateTradeExperiences(list: List<Int>) {
        val a = _specialization.value?.toMutableMap()
        a?.keys?.forEachIndexed { index, i ->
            a[i] = list[index]
        }
        _specialization.value = a
    }
}