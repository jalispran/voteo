# Voteo User Service
## To test the application
 1. Generate an access token
 
    Use `auth-service` to generate access token

 2. Use the token from `auth-service` to access resources through your RESTful API

    * Access content available to all authenticated users

        Use the generated token  as the value of the Bearer in the Authorization header as follows:
        `curl  http://localhost:8080/standard/cities -H "Authorization: Bearer <access-token-for-non-admin-user>" `

        The response will be:
        `
        [
          {
            "id": 1,
            "name": "Bamako"
          },
          {
            "id": 2,
            "name": "Nonkon"
          },
          {
            "id": 3,
            "name": "Houston"
          },
          {
            "id": 4,
            "name": "Toronto"
          },
          {
            "id": 5,
            "name": "New York"
          },
          {
            "id": 6,
            "name": "Mopti"
          },
          {
            "id": 7,
            "name": "Koulikoro"
          },
          {
            "id": 8,
            "name": "Moscow"
          }
        ]`