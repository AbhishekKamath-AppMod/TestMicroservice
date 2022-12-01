# TestMicroservice

This project demonstrate employee database using ArrayList to Insert Data, Delete Data, Get All Record From Employee List.

Step1 : Run the application using Eclipse or STS
Step2 : Open Postman 
Step3 : Add HOST ENDPOINT: http://localhost:8080/employees REQUEST METHOD : GET (to show all records)
        Add HOST ENDPOINT: http://localhost:8080/employee METHOD: POST 
        RequestBody: 
        {
             "id": "S105",
             "name": "Norton",
             "department": "Support",
             "dateOfJoining": "15-09-2022"
        }
        
        ResponseBody: 
        
      [
       {
        "responseCode": "200",
        "responseStatus": "RECORD INSERTED"
       }
      ]
      
     ![image](https://user-images.githubusercontent.com/118809942/205017072-44b07473-c727-4e37-826a-f416c151c1d1.png)

      
      ADD HOST ENDPOINT: http://localhost:8080/employer METHOD : POST
      RequestBody: 
        {
            "id": "S105"
        }
        
      ResponseBody: 
      [
        {
           "responseCode": "200",
           "responseStatus": "RECORD NOT FOUND"
        },
       {
           "responseCode": "200",
           "responseStatus": "RECORD NOT FOUND"
        }
    ]
    
    
