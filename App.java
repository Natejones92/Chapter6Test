class Employee {
    String EmployeeName;
    int balance;

    Employee(String Fir, int i) {
        EmployeeName = Fir;
        balance = i;
    }

    public String getInitials() {
        String initials = "";
        for (int i = 0; i < EmployeeName.length(); i++) {
            char currentChar = EmployeeName.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z')
                initials = initials + currentChar + '.';
        }
        return initials;
    }

}

class EmployeeBalance {
    public static void main(String[] args) {
        Employee[] a = new Employee[16];
        a[0] = new Employee("Janelly Antonio", 278);
        a[1] = new Employee("Daniel Conroy", 329);
        a[2] = new Employee("Wenhao Jin", 445);
        a[3] = new Employee("Nathaniel Jones", 402);
        a[4] = new Employee("Sean Kirchner", 388);
        a[5] = new Employee("Sabrina Lin", 275);
        a[6] = new Employee("Eric Luna", 243);
        a[7] = new Employee("Kevin Luna", 334);
        a[8] = new Employee("Zayad Maanane", 412);
        a[9] = new Employee("Hanne Nicolaisen", 393);
        a[10] = new Employee("Jackson Nogles", 299);
        a[11] = new Employee("Emily Parvar", 343);
        a[12] = new Employee("Jaspreet Signh", 317);
        a[13] = new Employee("Athena Glorius", 265);
        a[14] = new Employee("Melanie Taylor", 354);
        a[15] = new Employee("Appolo Tankeh", 234);

        for (int i = 0; i < a.length; i++)
            System.out.println("Employee Balance: " + a[i].getInitials() + "--" + a[i].balance);
    }
}
