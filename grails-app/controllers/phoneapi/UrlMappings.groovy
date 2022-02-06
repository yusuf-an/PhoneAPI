package phoneapi

class UrlMappings {

    static mappings = {

        //Get all phone numbers
        "/phone"(controller: "phone", action: "index", method:"GET")

        //Get all phone numbers of a single customer
        "/customer/$customerId/phone"(controller: "phone", action: "show", method:"GET")

        //Activate a phone number
        "/phone/activate/$phoneNumber"(controller: "phone", action: "update", method:"PUT")


        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
