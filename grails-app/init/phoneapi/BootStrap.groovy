package phoneapi

import com.phoneapi.Customer
import com.phoneapi.Phone

class BootStrap {

    def init = { servletContext ->
        //first user
        def customer1 =new Customer(name:"TestUserName")
        customer1.save()
        def phone11=new Phone(phoneNumber: "987654321", active:false,customer:customer1)
        phone11.save()
        def phone12=new Phone(phoneNumber: "980000000", active:false,customer:customer1)
        phone12.save()

        //second user
        def customer2 =new Customer(name:"TestUserName2")
        customer2.save()
        def phone21=new Phone(phoneNumber: "921111111", active:false,customer:customer2)
        phone21.save()
        def phone22=new Phone(phoneNumber: "923333333", active:false,customer:customer2)
        phone22.save()
    }
    def destroy = {
    }
}
