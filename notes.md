# Dwa sposoby na zrobienie projektu
- zwykła web aplikacja (operuje na HTML)
- rest api (operuje na JSON)

# Składniki aplikacji Spring MVC
- kontroler

# Czasowniki HTTP
- get
- post
- put
- delete

# Składnia Thymeleaf
Pętla:
<li th:each="product: ${productList}">
    <p th:text="${product.getName()}"></p>
    <p th:text="${product.getPrice()}"></p>
</li>