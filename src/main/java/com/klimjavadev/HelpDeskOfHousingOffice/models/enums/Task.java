package com.klimjavadev.HelpDeskOfHousingOffice.models.enums;

public enum Task {
    CLEANING_TERRITORY("Прибирання прибудинкової території"),
    CLEANING_AND_SNOW_REMOVAL("Прибирання і вивезення снігу"),
    SPREADING_ANTI_ICING_MIX_ON_PASSAGE_AREA("Посипання частини прибудинкової території, призначеної для проходу та проїзду, протиожеледними сумішами"),
    CLEANING_STAIRWELL("Прибирання сходових кліток"),
    CLEANING_BASEMENT("Прибирання підвалу"),
    CLEANING_TECHNICAL_FLOORS("Прибирання технічних поверхів"),
    CLEANING_ROOF("Прибирання покрівлі"),
    DISPOSAL_OF_HOUSEHOLD_WASTE("Вивезення побутових відходів"),
    ELEVATOR_MAINTENANCE("Технічне обслуговування ліфту"),
    INDOOR_HEATING_SYSTEM_MAINTENANCE("Технічне обслуговування внутрішньобудинкової системи теплопостачання"),
    INDOOR_WATER_SUPPLY_SYSTEM_MAINTENANCE("Технічне обслуговування внутрішньобудинкової системи водопостачання"),
    INDOOR_DRAINAGE_SYSTEM_MAINTENANCE("Технічне обслуговування внутрішньобудинкової системи водовідведення"),
    RODENT_ERADICATION("Дератизація (знищення гризунів)"),
    INSECT_DISINFECTION("Дезінсекція (знищення всіх видів комах, боротьба з тарганами, клопами, блохами…)"),
    SMOKE_VENTILATION_CHANNEL_SERVICING("Обслуговування димовентиляційного каналу"),
    FIRE_ALARM_SYSTEM_MAINTENANCE_AND_REPAIR("Технічне обслуговування та поточний ремонт системи протипожежної автоматики"),
    SMOKE_EXHAUST_SYSTEM_MAINTENANCE_AND_REPAIR("Технічне обслуговування та поточний ремонт системи димовидалення"),
    MAINTENANCE_AND_INTERNAL_ENGINEERING_SYSTEM_REPAIR("Технічне обслуговування та поточний ремонт внутрішньобудинкової інженерної системи"),
    MAINTENANCE_AND_INTERNAL_HOT_WATER_SUPPLY_SYSTEM_CONSTRUCTION_ELEMENTS_REPAIR("Поточний ремонт конструктивних елементів внутрішньобудинкової системи гарячого водопостачання"),
    MAINTENANCE_AND_INTERNAL_COLD_WATER_SUPPLY_SYSTEM_CONSTRUCTION_ELEMENTS_REPAIR("Поточний ремонт конструктивних елементів внутрішньобудинкової системи холодного водопостачання"),
    MAINTENANCE_AND_INTERNAL_HEATING_SYSTEM_CONSTRUCTION_ELEMENTS_REPAIR("Поточний ремонт конструктивних елементів внутрішньобудинкової системи теплопостачання"),
    MAINTENANCE_AND_INTERNAL_DRAINAGE_SYSTEM_CONSTRUCTION_ELEMENTS_REPAIR("Поточний ремонт конструктивних елементів внутрішньобудинкової системи зливової каналізації"),
    MAINTENANCE_AND_INTERNAL_BUILDING_TECHNICAL_DEVICE_CONSTRUCTION_ELEMENTS_REPAIR("Поточний ремонт конструктивних елементів технічних пристроїв будинку"),
    MAINTENANCE_AND_EXTERNAL_SITE_FURNISHINGS_CONSTRUCTION_ELEMENTS_REPAIR("Поточний ремонт конструктивних елементів зовнішнього упорядження"),
    PUBLIC_AREA_LIGHTING("Освітлення місць загального користування"),
    COMMON_BASEMENT_AREA_LIGHTING("Освітлення підвалу загального користування"),
    WATER_PUMPING("Підкачування води"),
    ELEVATOR_POWER_SUPPLY("Енергопостачання ліфту"),
    COURTYARD_AND_GARDEN_WATERING("Поливання двору, клумб і газонів"),
    BUILDING_UNIT_NUMBER_PLATE_MAINTENANCE("Експлуатація номерних знаків на будинку"),
    WATER_METER_VERIFICATION_AND_MAINTENANCE("Повірка та обслуговування квартирних засобів обліку води, у тому числі, їх демонтаж, транспортування та монтаж після повірки"),
    HEAT_ENERGY_METER_VERIFICATION_AND_MAINTENANCE("Повірка та обслуговування квартирних засобів обліку теплової енергії, у тому числі, їх демонтаж, транспортування та монтаж після повірки"),
    WATER_METER_REPAIR("Ремонт квартирних засобів обліку води"),
    HEAT_ENERGY_METER_REPAIR("Ремонт квартирних засобів обліку теплової енергії"),
    WET_SWEEPING("Вологе підмітання"),
    STAIRCASE_LANDING_WINDOW_CLEANING("Промивання вікон на сходовому майданчику"),
    DUST_AND_COBWEB_CLEANING_FROM_COMMON_AREAS_WALLS_AND_CEILINGS("Обмітання пилу та павутини зі стін і стель місць загального користування"),
    SILL_WIPING_IN_ENTRANCE_HALL_WINDOW_GRILLS_HANDRAILS_AND_MAILBOXES("Протирання підвіконня в під'їзду, віконні грати, поручні та поштові скриньки"),
    ENTRANCE_HALL_WINDOW_GRILL_CLEANING("Протирання віконних грат в під'їзду"),
    ENTRANCE_HALL_HANDRAIL_CLEANING("Протирання поручнів під'їзду"),
    MAILBOX_CLEANING("Протирання поштових скриньок"),
    PLACEMENT_OF_ADDRESS_AND_PHONE_NUMBER_LIST("Розміщення на видному та прохідному місці у дворі будинку списку адрес і телефонних номерів диспетчерської служби ЖЕКу, райадміністрації, організацій по наданню послуг тепло-, газо-, електро-, водопостачання і водовідведення, пожежної охорони, відділення міліції, швидкої допомоги, санепідемстанції, аварійних служб житлового господарства"),
    REPLACEMENT_OF_RESIDENTIAL_BUILDING_TECHNICAL_EQUIPMENT("Заміна технічних засобів житлового будинку (у неприватизованих квартирах)"),
    REPLACEMENT_OF_COMMON_STAIRCASE_LANDING_PIPE("Заміна труб загального стояка на сходовому майданчику"),
    REPLACEMENT_OF_ELECTRICAL_PANEL_ON_STAIRCASE_LANDING("Заміна електрощитка на сходовому майданчику"),
    REPLACEMENT_OF_BULBS_IN_ENTRANCE_HALL("Заміна лампочок в під'їзді"),
    ENTRANCE_HALL_BULB_REPLACEMENT("Заміна лампочок в під'їзді");

    private final String value;

    Task(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}