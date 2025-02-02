class coche(color: String, modelo: String, marca: String, numCaballos: Int, numPuertas: Int, matricula: Int) {

    var marca: String = marca
        private set(value) {
            field = value.uppercase()
        }

    var modelo: String = modelo
        private set(value) {
            field = value.uppercase()
        }

    var numCaballos: Int = numCaballos
        private set(value) {
            field = value
            require(numCaballos != null) {"La matricula no puede ser nula."}
        }

    var color: String = color
        set(value) {
            field = value
            require(matricula != null) {"La matricula no puede ser nula."}
        }

    var numPuertas: Int = numPuertas
        private set(value) {
            field = value
            require(numPuertas != null) {"La matricula no puede ser nula."}
        }

    var matricula: Int = matricula
        private set(value) {
            field = value
            require(matricula != null) {"La matricula no puede ser nula."}
        }

    init {
        require(modelo.isNotBlank()) { "El modelo no puede ser nulo o vacío." }
        require(marca.isNotBlank()) { "La marca no puede ser nula o vacía." }
        require(numCaballos in 70..700) { "El número de caballos debe estar entre 70 y 700." }
        require(numPuertas in 3..5) { "El número de puertas debe estar entre 3 y 5." }
        require(matricula.toString().length == 7) { "La matrícula debe tener exactamente 7 caracteres." }
        require(color.isNotBlank()) { "El color no puede ser nulo o vacío." }
    }

    override fun toString(): String {
        return "Coche(color='$color', marca='$marca', numCaballos=$numCaballos, numPuertas=$numPuertas, matricula='$matricula')"
    }

}

fun main() {

    val coche1 = coche(color = "rojo", modelo = " ", marca = " ", numCaballos = 100, numPuertas = 4, matricula = 1234567)
    val coche2 = coche(color = "amarillo", modelo = "R3", marca = "Ferrari", numCaballos = 5, numPuertas = 4, matricula = 1234567)
    val coche3 = coche(color = "negro", modelo = "Fiesta", marca = "Ford", numCaballos = 200, numPuertas = 1, matricula = 1234567)
    val coche4 = coche(color = "azul", modelo = "Conan", marca = "Toyota", numCaballos = 180, numPuertas = 4, matricula = 1234)
    val coche5 = coche(color = "verde", modelo = "A6", marca = "Volkswagen", numCaballos = 600, numPuertas = 4, matricula = 1234567)

    println(coche1)
    println(coche2)
    println(coche3)
    println(coche4)
    println(coche5)
}