# User Service

This User Service oversees the management of user information within the chat application, offering features to create, retrieve, update, and delete user data.

## API Reference:

Using MYSQL database

## Endpoints:

### Create User:
This endpoint allows clients to create a new user in the system.

- **POST /users/createuser**
- Create a new user.
- Example Request:
  ```http
  POST http://localhost:8081/users/createuser

**Request Body:** JSON containing user details.
{
"userName": "JohnDoe"
}


### Get All Users:
This endpoint retrieves all users stored in the system.

- **GET /users/allusers**
    - Retrieve all users.
    - Example Request:
      ```http
      GET http://localhost:8081/users/allusers
      ```

### Get User by ID:
This endpoint retrieves a single user by their ID.

- **GET /users/user/{id}**
    - Retrieve a user by ID.
    - Example Request:
      ```http
      GET http://localhost:8081/users/user/123
      ```

### Delete User:
This endpoint deletes a user from the system by their ID.

- **DELETE /users/deleteuser/{id}**
    - Delete a user by ID.
    - Example Request:
      ```http
      DELETE http://localhost:8081/users/deleteuser/123
      ```

### Update User:
This endpoint updates user information by their ID.

- **PATCH /users/changeuser/{id}**
    - Update user information by ID.
    - Example Request:
      ```http
      PATCH http://localhost:8081/users/changeuser/123

**Request Body:** JSON containing user details.
{
"userName": "JaneDoe"
}
