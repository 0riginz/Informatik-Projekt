package traffic_simulation

import traffic_simulation.Car

fun main(args: Array<String>) {

    val Car1 = Car("Car1", true)
    val Car2 = Car("Car2", true)
    val Car3 = Car("Car3", false)

    val CarList = mutableListOf<Car>(Car1, Car2, Car3)

    println(CarList)


}