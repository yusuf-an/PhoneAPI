package com.phoneapi

import grails.rest.Resource

class Customer {
    List<Phone> phones = []
    static hasMany = [phones:Phone]
    String name
    static mapping = {
        phones lazy: false
    }
    static constraints = {
    name blank :false
    }
}
