# MeLi project
This is a test for MercadoLibre, it consumes a fix endpoint, 
it shows a list of results inside a RecyclerView for a fixed search criteria.

For its architecture was chosen MVVM Clean with some Jetpack Components:
LiveData and Coroutines.

In order to consume endpoint was chosen Retrofit and Gson.

For dependency Injection was selected Dagger-Hilt

For Unit Testing: JUnit and Mockito

Inside each item of the RecyclerView is shown the title,
condition and price for each product.