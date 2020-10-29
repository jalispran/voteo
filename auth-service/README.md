# Voteo Auth Server

## To test the application
 #### Generate an access token

   Use the following generic command to generate an access token:
   `$ curl client:secret@localhost:9090/oauth/token -d grant_type=password -d username=user -d password=pwd`

   For this specific application, to generate an access token for the non-admin user john.doe, run:
   `$ curl testjwtclientid:XY7kmzoNzl100@localhost:9090/oauth/token -d grant_type=password -d username=john.doe -d password=jwtpass`
   
   To generate an access token for the admin user admin.admin, run:
   `$ curl testjwtclientid:XY7kmzoNzl100@localhost:9090/oauth/token -d grant_type=password -d username=admin.admin -d password=jwtpass`
    
You'll receive a response similar to below
    
    {
      "access_token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJhdWQiOlsidGVzdGp3dHJlc291cmNlaWQiXSwidXNlcl9uYW1lIjoiYWRtaW4uYWRtaW4iLCJzY29wZSI6WyJyZWFkIiwid3JpdGUiXSwiZXhwIjoxNDk0NDU0MjgyLCJhdXRob3JpdGllcyI6WyJTVEFOREFSRF9VU0VSIiwiQURNSU5fVVNFUiJdLCJqdGkiOiIwYmQ4ZTQ1MC03ZjVjLTQ5ZjMtOTFmMC01Nzc1YjdiY2MwMGYiLCJjbGllbnRfaWQiOiJ0ZXN0and0Y2xpZW50aWQifQ.rvEAa4dIz8hT8uxzfjkEJKG982Ree5PdUW17KtFyeec",
      "token_type": "bearer",
      "expires_in": 43199,
      "scope": "read write",
      "jti": "0bd8e450-7f5c-49f3-91f0-5775b7bcc00f"
    }
