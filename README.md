# poc-sql-and-nosql
Poc de um sistema de catálogo de produtos utilizando Spring JPA com Mysql para persistir os dados do produto e o MongoDb para os dados não estruturados como as avaliações dos produtos


### Acessar a aplicação
A aplicação estará disponível na seguinte URL:

    http://localhost:8080/

## Endpoint

### Criar item (endpoint utilizando o mysql como banco de dados)

#### Request
```curl
curl --location 'http://localhost:8080/product' \
--header 'Content-Type: application/json' \
--data '{
    "name": "Cadeira Eames Wood",
    "description": "Cadeira de qualidade garantida",
    "price": 60.55,
    "categories": ["MOVEIS","CADEIRAS"]
}'
```
### Fazer review (endpoint utilizando o mongoDb como banco de dados)

#### Request
```curl
curl --location 'http://localhost:8080/review' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Fifiuza da galera",
    "email": "fifiuza@gmail.com",
    "productId": "85f1cdcc-c457-4cd7-a58c-89ca440eabf1",
    "rating": 5
}'
```


