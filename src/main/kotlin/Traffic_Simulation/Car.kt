package traffic_simulation


class Car(var name: String, var DriveOrNot: Boolean) {



    override fun toString(): String {
        return "Car(name='$name', DriveOrNot=$DriveOrNot)"
    }


}
