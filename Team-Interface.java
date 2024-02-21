Team-Interface.txt

Abstract class Person{
    clock_In()
    clock_Out();
    get_fired();
    get_hired();
    get_promoted();
    get_demoted();
    quit();
    pay_Day();
}

class Manager extends person implements startDay(){
    manage_evaluations();
    crud_Abilities_for_employee_data();
    hire();
    fire();
    promote();
    demote();
}

class Employee extends person implements startDay(){
    log_In();
    log_Out();
    view_Data();
    edit_Personal_Info();

}

Interface startDay{
    clock_In();
    clock_out();
    pay_day();

}