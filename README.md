# PruebaA
 Prueba técnica para  el proceso de internship con Akurey
Mi acercamiento al problema plantea que lenguaje debe ser una clase ´padre´ para que las subclases hereden y, utilicen y/o modifiquen por medio de polimorfismo los métodos que se puedan realizar además da mayor facilidad para la creación de nuevos lenguajes.
Considero que CodeGenerator debe tener como atributo lenguaje para así cuando el usuario elija una un lenguaje lo que se obtiene de esa elección es un string para así buscar por nombre de lenguaje el generador de código y como el generador de código tiene al lenguaje específico ya el resto se encargan los métodos internos, al igual con el UI generator debido a que se tiene una lista de las librerias  y de ahi para elegir el UI generator que se debe inyectar al generador de código por medio del nombre del lenguaje por ejemplo.
Considero que el UI generator podría ser una interfaz debido a que ningún método es propio si no, que depende del lenguaje y la UI se pueden desarrollar dichos métodos específicos.
También podría pensar en realizar un modelo mvc tomando en cuenta las UI generator extentidas como pantallas una para cada lenguage.
También se usa la idea de que las listas planteadas en el main pueden venir de un base de datos por ejemplo. 
Intenté apegarme al tiempo que recomendaron para realizar la prueba por lo que pocas cosas se desarrollan e intento que por medio del nombre de métodos, clases, atributos, etc se entienda y además de este readme que intento explicar mi pensamiento.
