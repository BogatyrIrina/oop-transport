import transport.Car;

public class Main {

    public static void main(String[] args) {

        Car granta = new Car("Lada",
                "Granta",
                1.7,
                "желтый",
                2015,
                "Росиия",
                "Седан",
                5,
                "Механическая",
                "B123HB57",
                false
                );
        System.out.println("Марка автомобиля " + granta.getBrand() +
                ", модель " + granta.getModel() +
                ", год выпуска " + granta.getProductionYear() +
                ", страна производства " + granta.getOrigin() +
                ", цвет " + granta.getColor() +
                ", объем двигателя " + granta.getEngineVolume() + ", количество мест " + granta.getNumberOfSeats() +
                ", коробка передач " + granta.getTransmission() + ", тип кузова " + granta.getBodyType() +
                ", регистрационный номер " + granta.getRegistrationNumber() +
                        ", " + (granta.isSummerTyres() ? "летняя резина" : "зимняя резина"));


        Car audi = new Car("Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия",
                "Седан",
                5,
                "Автоматическая",
                "А147ВН32",
                true
                );
        System.out.println("Марка автомобиля " + audi.getBrand() +
                ", модель " + audi.getModel() +
                ", год выпуска " + audi.getProductionYear() +
                ", страна производства " + audi.getOrigin() +
                ", цвет " + audi.getColor() +
                ", объем двигателя " + audi.getEngineVolume() + ", количество мест " + audi.getNumberOfSeats() +
                ", коробка передач " + audi.getTransmission() + ", тип кузова " + audi.getBodyType() +
                ", регистрационный номер " + audi.getRegistrationNumber() +
                ", " + (audi.isSummerTyres() ? "летняя резина" : "зимняя резина"));

        Car bmw = new Car("BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия",
                "Седан",
                5,
                "Автоматическая",
                "В156АС46",
                false
                );
        System.out.println("Марка автомобиля " + bmw.getBrand() +
                ", модель " + bmw.getModel() +
                ", год выпуска " + bmw.getProductionYear() +
                ", страна производства " + bmw.getOrigin() +
                ", цвет " + bmw.getColor() +
                ", объем двигателя " + bmw.getEngineVolume() + ", количество мест " + bmw.getNumberOfSeats() +
                ", коробка передач " + bmw.getTransmission() + ", тип кузова " + bmw.getBodyType() +
                ", регистрационный номер " + bmw.getRegistrationNumber() +
                ", " + (bmw.isSummerTyres() ? "летняя резина" : "зимняя резина"));

        Car kia = new Car("Kia",
                "Sportage 4 поколение",
                2.4,
                "красный",
                2018,
                "Южная Корея",
                "Внедорожник",
                5,
                "Автоматическая",
                "С136ОР199",
                true
                );
        System.out.println("Марка автомобиля " + kia.getBrand() +
                ", модель " + kia.getModel() +
                ", год выпуска " + kia.getProductionYear() +
                ", страна производства " + kia.getOrigin() +
                ", цвет " + kia.getColor() +
                ", объем двигателя " + kia.getEngineVolume() + ", количество мест " + kia.getNumberOfSeats() +
                ", коробка передач " + kia.getTransmission() + ", тип кузова " + kia.getBodyType() +
                ", регистрационный номер " + kia.getRegistrationNumber() +
                ", " + (kia.isSummerTyres() ? "летняя резина" : "зимняя резина"));

        Car hyundai = new Car("Hyundai",
                "Avante",
                1.6,
                "оранжевый",
                2016,
                "Южная Корея",
                "Седан",
                5,
                "Автоматическая",
                "A123OP177",
                true
                );
        System.out.println("Марка автомобиля " + hyundai.getBrand() +
                ", модель " + hyundai.getModel() +
                ", год выпуска " + hyundai.getProductionYear() +
                ", страна производства " + hyundai.getOrigin() +
                ", цвет " + hyundai.getColor() +
                ", объем двигателя " + hyundai.getEngineVolume() + ", количество мест " + hyundai.getNumberOfSeats() +
                ", коробка передач " + hyundai.getTransmission() + ", тип кузова " + hyundai.getBodyType() +
                ", регистрационный номер " + hyundai.getRegistrationNumber() +
                ", " + (hyundai.isSummerTyres() ? "летняя резина" : "зимняя резина"));
    }
}