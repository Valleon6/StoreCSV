package Models;

public abstract class Staff {
    private String Name;
    private String StaffId;
    private String Role;
//    private static int idCount = 0;

//    public Staff() {
//    }

//    public Staff(String name, String role) {
//        Name = name;
//        Role = role;
//        StaffId = "" + idCount;
//        idCount++;
//    }

    public Staff(String name, String staffId, String role) {
        Name = name;
        StaffId = staffId;
        Role = role;
    }

    public String getName() {
        return Name;
    }

    public String getStaffId() {
        return StaffId;
    }

    public String getRole() {
        return Role;
    }
}