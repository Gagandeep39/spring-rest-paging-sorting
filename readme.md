# Spring Rest Paging
- Used to send only specific amount of data
- Repository can directly return List, Slice, Page
- Slice contains whether page exists or not

### List
- Contains a list of Elements
- When returned as a REST response, it is in an array format

### Slice
- Contains a list embedded inside it
- Contains info whether next page exists
- Executes an additional query in repository to test whether additional data exist
- Contains all page related data on a rest response

### Page
- Adds additional info to Slice when accessed via Class
- REST Response is same as slice
- Executes an additional query in repository to test whether additional data exist
- Performance is inferior to Slice

### API

#### Fetch complete list
GET http://localhost:8080/employees
#### Fetch page 2
GET http://localhost:8080/employees?pageNo=2
#### Fetch page 2 with each page of size 5
GET http://localhost:8080/employees?pageNo=2&pageSize=5
#### Fetch fetch page 1, page size 5 and sort by last name
GET http://localhost:8080/employees?pageNo=1&pageSize=5&sortBy=lastName