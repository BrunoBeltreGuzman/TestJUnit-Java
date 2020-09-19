# TestJUnit-Java
Test o pruebas unitarias Junit en Java su implementación y como funciona 

Las pruebas unitarias o en este caso test Junit son un conjunto de técnicas para comprobar que un fragmento de código funciona correctamente. Es un procedimiento más de los que se llevan a cabo dentro de una metodología ágil del desarrollo de software.

# Para implementar test JUnit en Java se basa en las siguientes anotaciones:
Test: 
indica que el método que la contiene es un test: expected y timeout.

Before(): 
ejecuta el método que la contiene justo antes de cada test.

After(): 
ejecuta el método que la contiene justo después de cada test.

BeforeClass(): 
ejecuta el método (estático) que la contiene justo antes del primer test.

AfterClass(): 
ejecuta el método (estático) que la contiene justo después del último test.

Ignore(): 
evita la ejecución del tests. No es muy recomendable su uso porque puede ocultar test fallidos. Si dudamos si el test debe estar o no, quizás borrarlo es la mejor de las decisiones.

# Las condiciones para realizar los test Junit de aceptación se implementan con los asserts. Los más comunes son los siguientes:
assertTrue/assertFalse (condición a testear): Comprueba que la condición es cierta o falsa.

assertEquals/assertNotEquals (valor esperado, valor obtenido). Es importante el orden de los valores esperado y obtenido.

assertNull/assertNotNull (object): Comprueba que el objeto obtenido es nulo o no.

assertSame/assertNotSame(object1, object2): Comprueba si dos objetos son iguales o no.

fail(): Fuerza que el test termine con fallo. Se puede indicar un mensaje.

# Ejemplo:


En ejemplo basa en a las operaciones básicas de una calculadora, la cual cada operación está definida en una función o método, al los cuales se les aplica los test Junit. 
![Image](https://github.com/BrunoBeltreGuzman/TestJUnit-Java/blob/master/Screenshots.png)
