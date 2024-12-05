# emarket api service





## hmac api example


### client => api-service 

- issue
```bash
# issue
curl -X GET "http://127.0.0.1:3001/auth/hmac/issue/customer/info/all" \
-H "Access-Key: 8c2ea66e-abfc-4394-8adb-fa52890bdce3"
```

- request to /customer/info/all
```bash
curl -X GET "http://127.0.0.1:3001/customer/info/all" \
-H "Access-Key: 8c2ea66e-abfc-4394-8adb-fa52890bdce3" \
-H "Authorization: HmacSHA256:jjm80JQn/fkDajL9wI8mWlbArqpXLXzBFcTo+uGNh7s=" \
-H "Nonce: 1733375075185"
```


### client => api-gateway => api-service

- issue
```bash
curl -X GET "http://127.0.0.1:9990/api/vasco/auth/hmac/issue/customer/info/all" \
-H "Access-Key: 8c2ea66e-abfc-4394-8adb-fa52890bdce3"
```

- request to /customer/info/all 
```bash
curl -X GET "http://127.0.0.1:9990/api/vasco/customer/info/all" \
-H "Access-Key: 8c2ea66e-abfc-4394-8adb-fa52890bdce3" \
-H "Authorization: HmacSHA256:jjm80JQn/fkDajL9wI8mWlbArqpXLXzBFcTo+uGNh7s=" \
-H "Nonce: 1733375075185"
```

- request to /data/pv/{customerNo}
```bash
curl -X GET "http://127.0.0.1:9990/api/vasco/data/pv/0530176076" \
-H "Access-Key: 8c2ea66e-abfc-4394-8adb-fa52890bdce3" \
-H "Authorization: HmacSHA256:jjm80JQn/fkDajL9wI8mWlbArqpXLXzBFcTo+uGNh7s=" \
-H "Nonce: 1733375075185"
```

