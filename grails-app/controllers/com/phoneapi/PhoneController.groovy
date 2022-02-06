package com.phoneapi

import grails.converters.JSON
import grails.gorm.transactions.Transactional
import grails.rest.RestfulController

@Transactional
class PhoneController extends RestfulController<Phone> {
    static responseFormats = ['json', 'xml']

    PhoneController() {
        super(Phone)
    }

    @Override
    def index() {
        respond Phone.list()
    }

    @Override
    def show() {
        def csId = params.customerId
        respond Phone.where { customer.id == csId }.list()
    }

    @Override
    def update() {
        def phoneInRequest = params?.phoneNumber
        def phone = Phone.where { phoneNumber == phoneInRequest }.find()
        phone.active=true
        phone = phone.merge()
        respond phone
    }

}
