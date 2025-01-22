Crear una clase Persona que tenga nombre, peso (en kg con decimales), altura (en metros con decimales) y su imc.

Crear un constructor primario con todos los atributos, excepto nombre e imc. Este último atributo se calcula en función del peso y la altura. Por tanto no se debe poder modificar, pero si consultar.

Crear un constructor secundario que también incluya el nombre de la persona cómo parámetro.

Implementa el método toString, representación del objeto en forma de String: override fun toString() = "". (Pulsa Ctrl+o)

En el main(), crear 3 personas diferentes (la primera sin nombre) utilizando el constructor primario y secundario. Después mostrarlas por consola y a continuación, realizar lo siguiente:

Sobre la persona 1:
Modificar su nombre y para ello debes solicitarlo al usuario por consola. No puede ser nulo o vacio.
Mostrar por consola sólo el nombre, peso y altura.
Sobre la persona 3:
Mostrar el peso, altura y imc.
Modificar la altura, por ejemplo a 1.80
Mostrar el peso, altura y imc.
Sobre la persona 2:
Modificar la altura para que tenga el mismo valor que la persona 3.
Mostrar la persona 2 y persona 3.
Comparar si las dos personas son iguales, y mostrar el resultado.
Implementa el método equals():boolean (Pulsa Ctrl+o).
Ejecutar la comparación.
