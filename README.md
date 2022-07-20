# User-Management-Microservice


###  URLs


### Create User  (Post Request)
- http://localhost:8100/api/v1/users
```
{
    "firstName":"Gaurav",
    "lastName":"Kumrawat",
    "email":"gaurav@kumrawat.com"
}
```
### Get list of all users  (Get Request)
- http://localhost:8100/api/v1/users

### Delete a user using using userId  (Delete Request)
- http://localhost:8100/api/v1/users/{userId}

### Update a user using using userId  (Update Request)
- http://localhost:8100/api/v1/users/{userId}
```
{
    "lastName":"Kumrawat",
    "email":"g@k.com"
}

//pass only those attributes that need to be changed 
```
