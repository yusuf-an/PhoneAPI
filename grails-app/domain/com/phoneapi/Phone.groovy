package com.phoneapi

import grails.rest.Resource

class Phone {
    String phoneNumber
    Boolean active
    static belongsTo =[customer:Customer]
    static constraints = {
    phoneNumber blank :false
    }
}
